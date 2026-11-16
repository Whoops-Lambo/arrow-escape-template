package com.singular.sdk.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.singular.sdk.internal.utils.UriUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class SLPushNotificationsManager {
    private static SLPushNotificationsManager instance;
    private static final SingularLog logger = SingularLog.getLogger("SLPushNotificationsManager");
    private Boolean didAppOpenFromPushNotification = Boolean.FALSE;
    private Intent previousIntent;
    private Uri pushLink;

    public String getValueFromPayloadAtPaths(Intent intent, String[]... strArr) {
        try {
            if (intent.getExtras() != null && !intent.getExtras().isEmpty()) {
                if (strArr != null && strArr.length != 0) {
                    HashMap<String, Object> mapConvertBundleToHashMap = convertBundleToHashMap(intent.getExtras());
                    for (String[] strArr2 : strArr) {
                        for (String str : strArr2) {
                            Object obj = mapConvertBundleToHashMap.get(str);
                            if (!(obj instanceof HashMap)) {
                                if (!(obj instanceof Bundle)) {
                                    if (!(obj instanceof String)) {
                                        break;
                                    }
                                    logger.debug("a value was found in push payload, returning it.");
                                    return String.valueOf(obj);
                                }
                                mapConvertBundleToHashMap = convertBundleToHashMap((Bundle) obj);
                            } else {
                                mapConvertBundleToHashMap = (HashMap) obj;
                            }
                        }
                    }
                    logger.debug("no value was found in push payload, returning nil");
                    return null;
                }
                logger.debug("path selectors not provided or empty");
                return null;
            }
            logger.debug("push payload extras is null or empty");
            return null;
        } catch (Throwable th) {
            logger.debug(Utils.formatException(th));
        }
    }

    public static HashMap<String, Object> convertBundleToHashMap(Bundle bundle) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            for (String str : bundle.keySet()) {
                map.put(str, bundle.get(str));
            }
            return map;
        } catch (Throwable th) {
            logger.debug(Utils.formatException(th));
            return map;
        }
    }

    public static SLPushNotificationsManager getInstance() {
        if (instance == null) {
            instance = new SLPushNotificationsManager();
        }
        return instance;
    }

    public void appMovedToBackground() {
        logger.debug("app moved to background");
        this.didAppOpenFromPushNotification = Boolean.FALSE;
        this.pushLink = null;
    }

    public void appOpenedWithPushNotification() {
        this.didAppOpenFromPushNotification = Boolean.TRUE;
    }

    public Boolean didAppOpenWithPushNotification() {
        return this.didAppOpenFromPushNotification;
    }

    public Uri getPushLink() {
        return this.pushLink;
    }

    public Boolean tryHandlePushNotificationAtPaths(Intent intent, String[]... strArr) {
        if (intent == null) {
            logger.debug("push payload intent is null");
            return Boolean.FALSE;
        }
        Intent intent2 = this.previousIntent;
        if (intent2 != null && intent2.hashCode() == intent.hashCode()) {
            logger.debug("push is processed already. so ignoring");
            return Boolean.FALSE;
        }
        this.previousIntent = intent;
        String valueFromPayloadAtPaths = getValueFromPayloadAtPaths(intent, strArr);
        if (Utils.isEmptyOrNull(valueFromPayloadAtPaths)) {
            logger.debug("extracted value in push payload is null or empty.");
            return Boolean.FALSE;
        }
        try {
            Uri uri = Uri.parse(valueFromPayloadAtPaths);
            if (!UriUtils.isValid(uri)) {
                logger.debug("push payload value is an invalid URL.");
                return Boolean.FALSE;
            }
            if (!Utils.isESPLink(uri) && !Utils.isBrandedLink(uri) && !Utils.isSingularLinkDomain(uri)) {
                logger.debug("push link is neither esp link nor branded link nor sng link");
                return Boolean.FALSE;
            }
            logger.debug("payload value is a valid url. the SDK can enqeue a new /start with this value: " + uri);
            this.pushLink = uri;
            return Boolean.TRUE;
        } catch (Throwable th) {
            logger.debug(Utils.formatException(th));
            return Boolean.FALSE;
        }
    }

    private SLPushNotificationsManager() {
    }
}
