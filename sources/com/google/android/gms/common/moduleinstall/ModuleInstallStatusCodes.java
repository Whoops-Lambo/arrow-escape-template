package com.google.android.gms.common.moduleinstall;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.CommonStatusCodes;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ModuleInstallStatusCodes extends CommonStatusCodes {
    public static final int INSUFFICIENT_STORAGE = 46003;
    public static final int METERED_NETWORK_NOT_ALLOWED = 46004;
    public static final int MODULE_NOT_FOUND = 46002;
    public static final int NOT_ALLOWED_MODULE = 46001;
    public static final int SUCCESS = 0;
    public static final int UNKNOWN_MODULE = 46000;

    private ModuleInstallStatusCodes() {
    }

    @NonNull
    public static String getStatusCodeString(int i) {
        switch (i) {
            case UNKNOWN_MODULE /* 46000 */:
                return "UNKNOWN_MODULE";
            case NOT_ALLOWED_MODULE /* 46001 */:
                return "NOT_ALLOWED_MODULE";
            case MODULE_NOT_FOUND /* 46002 */:
                return "MODULE_NOT_FOUND";
            case INSUFFICIENT_STORAGE /* 46003 */:
                return "INSUFFICIENT_STORAGE";
            case METERED_NETWORK_NOT_ALLOWED /* 46004 */:
                return "METERED_NETWORK_NOT_ALLOWED";
            default:
                return CommonStatusCodes.getStatusCodeString(i);
        }
    }
}
