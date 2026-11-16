package com.singular.sdk.internal.InstallReferrer;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.singular.sdk.internal.SingularLog;
import com.singular.sdk.internal.Utils;
import defpackage.h50;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class SLGoogleReferrer implements SLInstallReferrerService {
    private static Map<String, Object> installReferrer;
    private static final SingularLog logger = SingularLog.getLogger("SLGoogleReferrer");

    /* JADX INFO: Access modifiers changed from: private */
    public static void makeInstallReferrerObject(String str, String str2, long j, long j2, String str3, long j3, long j4) {
        HashMap map = new HashMap();
        installReferrer = map;
        map.put("referrer", str);
        installReferrer.put("referrer_source", str2);
        installReferrer.put("clickTimestampSeconds", Long.valueOf(j));
        installReferrer.put("installBeginTimestampSeconds", Long.valueOf(j2));
        installReferrer.put("current_device_time", Long.valueOf(Utils.getCurrentTimeMillis()));
        installReferrer.put("installVersion", str3);
        installReferrer.put("clickTimestampServerSeconds", Long.valueOf(j3));
        installReferrer.put("installBeginTimestampServerSeconds", Long.valueOf(j4));
    }

    @Override // com.singular.sdk.internal.InstallReferrer.SLInstallReferrerService
    public void fetchReferrer(final Context context, final SLInstallReferrerCompletionHandler sLInstallReferrerCompletionHandler) {
        try {
            final InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
            installReferrerClientBuild.startConnection(new InstallReferrerStateListener() { // from class: com.singular.sdk.internal.InstallReferrer.SLGoogleReferrer.1
                private boolean isV2Supported(ReferrerDetails referrerDetails) {
                    try {
                        return referrerDetails.getClass().getMethod("getInstallVersion", null) != null;
                    } catch (Throwable th) {
                        SLGoogleReferrer.logger.debug("Google Play Install Referrer V2 not supported: " + Utils.formatException(th));
                        return false;
                    }
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                    installReferrerClientBuild.endConnection();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void handleNotSupported(Context context2) {
                    String cSIReferrer = Utils.getCSIReferrer(context2);
                    if (cSIReferrer != null) {
                        SLGoogleReferrer.makeInstallReferrerObject(cSIReferrer, "intent", -1L, -1L, null, -1L, -1L);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void handleReferrerResponse(InstallReferrerClient installReferrerClient) throws Exception {
                    String installVersion;
                    long referrerClickTimestampServerSeconds;
                    long installBeginTimestampServerSeconds;
                    ReferrerDetails installReferrer2 = installReferrerClient.getInstallReferrer();
                    if (isV2Supported(installReferrer2)) {
                        installVersion = installReferrer2.getInstallVersion();
                        referrerClickTimestampServerSeconds = installReferrer2.getReferrerClickTimestampServerSeconds();
                        installBeginTimestampServerSeconds = installReferrer2.getInstallBeginTimestampServerSeconds();
                    } else {
                        installVersion = null;
                        referrerClickTimestampServerSeconds = -1;
                        installBeginTimestampServerSeconds = -1;
                    }
                    SLGoogleReferrer.makeInstallReferrerObject(installReferrer2.getInstallReferrer(), NotificationCompat.CATEGORY_SERVICE, installReferrer2.getReferrerClickTimestampSeconds(), installReferrer2.getInstallBeginTimestampSeconds(), installVersion, referrerClickTimestampServerSeconds, installBeginTimestampServerSeconds);
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(final int i) {
                    SLGoogleReferrer.logger.debug("google onInstallReferrerSetupFinished: responseCode=" + i);
                    Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.singular.sdk.internal.InstallReferrer.SLGoogleReferrer.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            int i2 = i;
                            if (i2 == 0) {
                                try {
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    anonymousClass1.handleReferrerResponse(installReferrerClientBuild);
                                } catch (Throwable th) {
                                    h50.A(th, new StringBuilder("google onInstallReferrerSetupFinished: failed to get referrer value - "), SLGoogleReferrer.logger);
                                }
                                sLInstallReferrerCompletionHandler.onInstallReferrerReceived(SLGoogleReferrer.installReferrer);
                            } else if (i2 == 1) {
                                SLGoogleReferrer.logger.debug("google onInstallReferrerSetupFinished: SERVICE_UNAVAILABLE");
                                AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                                anonymousClass2.handleNotSupported(context);
                                sLInstallReferrerCompletionHandler.onInstallReferrerReceived(SLGoogleReferrer.installReferrer);
                            } else if (i2 == 2) {
                                SLGoogleReferrer.logger.debug("google onInstallReferrerSetupFinished: FEATURE_NOT_SUPPORTED");
                                AnonymousClass1 anonymousClass3 = AnonymousClass1.this;
                                anonymousClass3.handleNotSupported(context);
                                sLInstallReferrerCompletionHandler.onInstallReferrerReceived(SLGoogleReferrer.installReferrer);
                            } else if (i2 != 3) {
                                SLGoogleReferrer.logger.debug("Unexpected response code of install referrer response %d", Integer.valueOf(i));
                                AnonymousClass1 anonymousClass4 = AnonymousClass1.this;
                                anonymousClass4.handleNotSupported(context);
                                sLInstallReferrerCompletionHandler.onInstallReferrerReceived(SLGoogleReferrer.installReferrer);
                            } else {
                                SLGoogleReferrer.logger.error("google onInstallReferrerSetupFinished: DEVELOPER_ERROR");
                                AnonymousClass1 anonymousClass5 = AnonymousClass1.this;
                                anonymousClass5.handleNotSupported(context);
                                sLInstallReferrerCompletionHandler.onInstallReferrerReceived(SLGoogleReferrer.installReferrer);
                            }
                            if (installReferrerClientBuild.isReady()) {
                                installReferrerClientBuild.endConnection();
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("google: failed to get referrer value - "), logger);
        }
    }
}
