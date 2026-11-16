package com.fyber.inneractive.sdk.util;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum a1 {
    UNKNOWN(""),
    ETHERNET(X3.a),
    WIFI("wifi"),
    MOBILE_3G(X3.a),
    MOBILE_4G("4g"),
    MOBILE_5G("5g"),
    CELLULAR("Cellular");

    final String key;

    /* JADX WARN: Code duplicated, block: B:46:0x006e  */
    public static a1 a() {
        int type;
        a1 a1Var;
        NetworkInfo activeNetworkInfo;
        try {
            type = (!o.a("android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = ((ConnectivityManager) o.a.getSystemService("connectivity")).getActiveNetworkInfo()) == null) ? 8 : activeNetworkInfo.getType();
        } catch (Exception unused) {
        }
        if (type == 9) {
            return ETHERNET;
        }
        if (type != 0) {
            if (type == 1) {
                return WIFI;
            }
            if (type != 2 && type != 3 && type != 4 && type != 5) {
                return UNKNOWN;
            }
        }
        com.fyber.inneractive.sdk.config.cellular.a aVar = IAConfigManager.Q.O;
        if (aVar == null || aVar.a == null) {
            int iH = k.h();
            if (iH == 0) {
                a1Var = UNKNOWN;
            } else if (iH == 3) {
                a1Var = MOBILE_3G;
            } else if (iH == 18) {
                a1Var = WIFI;
            } else if (iH == 20) {
                a1Var = MOBILE_5G;
            } else if (iH != 5 && iH != 6) {
                switch (iH) {
                    default:
                        switch (iH) {
                            case 12:
                            case 14:
                            case 15:
                                break;
                            case 13:
                                a1Var = MOBILE_4G;
                                break;
                            default:
                                a1Var = CELLULAR;
                                break;
                        }
                    case 8:
                    case 9:
                    case 10:
                        a1Var = MOBILE_3G;
                        break;
                }
            } else {
                a1Var = MOBILE_3G;
            }
        } else {
            a1Var = aVar.b;
        }
        if (a1Var == UNKNOWN) {
            return k.h() == 13 ? MOBILE_4G : MOBILE_3G;
        }
        return a1Var;
    }

    public final String b() {
        return this.key;
    }

    a1(String str) {
        this.key = str;
    }
}
