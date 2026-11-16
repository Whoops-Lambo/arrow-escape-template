package com.singular.sdk.internal;

import android.content.Context;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ApiManager {
    private static final SingularLog logger = SingularLog.getLogger("ApiManager");
    final Context context;
    private Queue queue;
    private SingularWorkerThread worker;
    private int apiRetryInterval = 15;
    private final Runnable runnable = new Runnable() { // from class: com.singular.sdk.internal.ApiManager.2
        @Override // java.lang.Runnable
        public void run() {
            if (!SingularInstance.getInstance().isInitialized()) {
                ApiManager.logger.debug("Singular is not initialized!");
                SingularInstance.collectError("ie10");
                return;
            }
            if (!NetworkMonitor.isConnected(ApiManager.this.context)) {
                ApiManager.logger.debug("Oops, not connected to internet!");
                SingularInstance.collectError("ne10");
                return;
            }
            try {
                String strPeek = ApiManager.this.queue.peek();
                if (strPeek == null) {
                    ApiManager.logger.info("Queue currently empty, nothing to send. pending next wakeup.");
                    return;
                }
                BaseApi baseApiFrom = BaseApi.from(strPeek);
                ApiManager.logger.info("api = %s", baseApiFrom.getClass().getName());
                ApiManager.attachHashedUserDetailsForSend(baseApiFrom);
                if (baseApiFrom.makeRequest(SingularInstance.getInstance())) {
                    Utils.resetRetryCountForKey(ApiManager.this.context, Long.toString(baseApiFrom.getTimestamp()));
                    ApiManager.this.queue.remove();
                    ApiManager.this.worker.getHandler().removeCallbacksAndMessages(this);
                    ApiManager.this.apiRetryInterval = 15;
                    ApiManager.this.wakeUp();
                    return;
                }
                ApiManager.logger.debug("BAD event send, SLEEPING FOR apiRetryInterval=" + ApiManager.this.apiRetryInterval);
                SingularInstance.collectError("e12");
                ApiManager.this.worker.getHandler().removeCallbacksAndMessages(this);
                ApiManager.this.worker.postDelayed(this, ApiManager.this.apiRetryInterval * 1000);
                ApiManager.access$328(ApiManager.this, 2);
                if (ApiManager.this.apiRetryInterval > 300) {
                    ApiManager.this.apiRetryInterval = 300;
                }
            } catch (Throwable th) {
                ApiManager.logger.error("caught general throwable while processing an event: %s", Utils.formatException(th));
                SingularInstance.collectError("e11");
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface RetryConstants {
        public static final int RETRY_EXPONENTIAL_MULTIPLIER = 2;
        public static final int RETRY_INTERVAL_DEFAULT = 15;
        public static final int RETRY_INTERVAL_MAX = 300;
    }

    public static /* synthetic */ int access$328(ApiManager apiManager, int i) {
        int i2 = apiManager.apiRetryInterval * i;
        apiManager.apiRetryInterval = i2;
        return i2;
    }

    public static void attachHashedUserDetailsForSend(Api api) {
        try {
            if (!(api instanceof ApiStartSession) && !(api instanceof ApiSubmitEvent)) {
                logger.debug("attachHashedUserDetailsForSend: skipping user details for non session/event request ".concat(api.getClass().getSimpleName()));
                return;
            }
            JSONObject userDetailsPayloadForRequest = UserDetailsManager.getInstance().getUserDetailsPayloadForRequest();
            if (userDetailsPayloadForRequest != null) {
                ((BaseApi) api).put(Constants.UserDetails.REQUEST_KEY, userDetailsPayloadForRequest.toString());
            }
        } catch (Throwable th) {
            logger.error("caught exception attaching user details at send time " + Utils.formatException(th));
            SingularInstance.collectError("e7");
        }
    }

    public static void enrichRequestFromSingularInstance(BaseApi baseApi) {
        Boolean limitDataSharing;
        try {
            SingularInstance singularInstance = SingularInstance.getInstance();
            JSONObject globalPropertiesJSON = singularInstance.getGlobalPropertiesJSON();
            if (globalPropertiesJSON.length() != 0) {
                baseApi.put(Constants.GLOBAL_PROPERTIES_KEY, globalPropertiesJSON.toString());
            }
            if (baseApi.containsKey(Constants.DATA_SHARING_OPTIONS) || (limitDataSharing = singularInstance.getLimitDataSharing()) == null) {
                return;
            }
            baseApi.put(Constants.DATA_SHARING_OPTIONS, new JSONObject(new HashMap(limitDataSharing) { // from class: com.singular.sdk.internal.ApiManager.1
                final /* synthetic */ Boolean val$limitDataSharing;

                {
                    this.val$limitDataSharing = limitDataSharing;
                    limitDataSharing.booleanValue();
                    put("limit_data_sharing", limitDataSharing);
                }
            }).toString());
        } catch (Throwable th) {
            logger.error("caught exception during enriching request with SingularInstance " + Utils.formatException(th));
            SingularInstance.collectError("e7");
        }
    }

    public void enqueue(BaseApi baseApi) {
        if (baseApi != null) {
            try {
                if (this.queue != null) {
                    if (!(baseApi instanceof ApiGDPRConsent) && !(baseApi instanceof ApiGDPRUnder13)) {
                        baseApi.put(Constants.EVENT_INDEX, String.valueOf(Utils.getEventIndex(this.context)));
                    }
                    baseApi.put(Constants.SINGULAR_INSTALL_ID, Utils.getSingularId(this.context).toString());
                    enrichRequestFromSingularInstance(baseApi);
                    this.queue.add(baseApi.toJsonAsString());
                    wakeUp();
                    return;
                }
            } catch (IOException unused) {
                SingularInstance.collectError("fe18");
                return;
            } catch (IndexOutOfBoundsException unused2) {
                SingularInstance.collectError("fe19");
                return;
            } catch (Throwable unused3) {
                SingularInstance.collectError("fe20");
                return;
            }
        }
        SingularLog singularLog = logger;
        StringBuilder sb = new StringBuilder("Cannot enqueue API: ");
        sb.append(baseApi == null ? "api == null " : "");
        sb.append(this.queue == null ? "queue == null" : "");
        singularLog.debug(sb.toString());
    }

    public void wakeUp() {
        SingularWorkerThread singularWorkerThread = this.worker;
        if (singularWorkerThread == null) {
            logger.error("Cannot wake up ApiManager: worker is null");
            SingularInstance.collectError("ie18");
        } else {
            singularWorkerThread.getHandler().removeCallbacksAndMessages(null);
            this.apiRetryInterval = 15;
            this.worker.post(this.runnable);
        }
    }

    public ApiManager(SingularWorkerThread singularWorkerThread, Context context, Queue queue) {
        this.context = context;
        this.queue = queue;
        if (queue == null) {
            logger.error("ApiManager initialization failed - queue == null.");
            SingularInstance.collectError("ie20");
            return;
        }
        SingularLog singularLog = logger;
        singularLog.info("Queue: %s", queue.getClass().getSimpleName());
        if (singularWorkerThread == null) {
            singularLog.error("CRITICAL: ApiManager initialization failed - workerThread is null. ApiManager cannot function.");
            SingularInstance.collectError("ie21");
        } else {
            this.worker = singularWorkerThread;
            singularWorkerThread.start();
        }
    }
}
