package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class um {
    public static boolean fi(Context context) {
        if (context == null) {
            return false;
        }
        int iRz = rz(context);
        return iRz == 2 || iRz == 3 || iRz == 4 || iRz == 5 || iRz == 6;
    }

    public static int ahm(Context context) {
        int iRz = rz(context);
        if (iRz != 1) {
            if (iRz == 4) {
                return 1;
            }
            if (iRz == 5) {
                return 4;
            }
            if (iRz == 6) {
                return 6;
            }
            return iRz;
        }
        return 0;
    }

    public static boolean ct(Context context) {
        if (rz(context) == 5) {
            return true;
        }
        return false;
    }

    public static boolean kgy(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(d.v) || str.startsWith("https://")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean noq(Context context) {
        if (rz(context) == 6) {
            return true;
        }
        return false;
    }

    public static int rz(Context context) {
        return jpc.kgy(context, 60000L);
    }

    public static boolean uq(Context context) {
        if (rz(context) == 4) {
            return true;
        }
        return false;
    }

    public static String yo(Context context) {
        int iRz = rz(context);
        if (iRz != 2) {
            if (iRz != 3) {
                if (iRz != 4) {
                    if (iRz != 5) {
                        if (iRz != 6) {
                            return "mobile";
                        }
                        return "5g";
                    }
                    return "4g";
                }
                return "wifi";
            }
            return X3.a;
        }
        return "2g";
    }

    public static boolean kgy(Context context) {
        return rz(context) != 0;
    }
}
