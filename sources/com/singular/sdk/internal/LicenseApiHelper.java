package com.singular.sdk.internal;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class LicenseApiHelper {
    public static final String LICENSING_EVENT_NAME = "__LicensingStatus";
    private static final SingularLog logger = SingularLog.getLogger("LicenseApiHelper");

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class LicenseResultHandler {
        public abstract void handle(int i, String str, String str2);
    }

    public static void checkLicense(Context context, LicenseResultHandler licenseResultHandler) {
        try {
            new LicenseChecker(context, licenseResultHandler).checkAccess();
        } catch (Throwable th) {
            logger.error("Error occurred while trying to run license check", th);
        }
    }
}
