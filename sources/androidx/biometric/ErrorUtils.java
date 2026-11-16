package androidx.biometric;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
class ErrorUtils {
    public static String a(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(com.ecffri.arrows.R.string.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(com.ecffri.arrows.R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(com.ecffri.arrows.R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(com.ecffri.arrows.R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i);
                    return context.getString(com.ecffri.arrows.R.string.default_error_msg);
            }
        }
        return context.getString(com.ecffri.arrows.R.string.fingerprint_error_lockout);
    }
}
