package com.mbridge.msdk.config.component.common.express.operator;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class q {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public q(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd A[Catch: Exception -> 0x016b, TRY_LEAVE, TryCatch #0 {Exception -> 0x016b, blocks: (B:36:0x0085, B:37:0x0095, B:52:0x00dd, B:39:0x0099, B:41:0x009f, B:42:0x00a9, B:44:0x00af, B:45:0x00b9, B:47:0x00bf, B:48:0x00c9, B:50:0x00cf, B:51:0x00d9), top: B:79:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x015b  */
    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        String string;
        String strValueOf;
        int iIntValue;
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("879"))) {
                Object objValueOf = "";
                if (list.get(0) == null) {
                    string = "";
                } else {
                    string = list.get(0).toString();
                }
                if (list.size() < 2) {
                    strValueOf = "STRING";
                    iIntValue = 1;
                } else {
                    Object obj2 = list.get(1);
                    if (obj2 instanceof Integer) {
                        iIntValue = ((Integer) obj2).intValue();
                    } else if (obj2 != null) {
                        try {
                            iIntValue = Integer.parseInt(obj2.toString());
                        } catch (NumberFormatException unused) {
                            iIntValue = 1;
                        }
                    } else {
                        iIntValue = 1;
                    }
                    if (list.size() != 3) {
                        strValueOf = "STRING";
                    } else {
                        Object obj3 = list.get(2);
                        if (!(obj3 instanceof String)) {
                            strValueOf = "STRING";
                        } else {
                            strValueOf = String.valueOf(obj3);
                        }
                    }
                }
                if (TextUtils.isEmpty(string)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
                if (iIntValue == 1) {
                    try {
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.mbridge.msdk.foundation.controller.c.n().d());
                        switch (strValueOf.hashCode()) {
                            case -1838656495:
                                strValueOf.equals("STRING");
                                objValueOf = defaultSharedPreferences.getString(string, "");
                                break;
                            case 72655:
                                if (strValueOf.equals("INT")) {
                                    objValueOf = Integer.valueOf(defaultSharedPreferences.getInt(string, 0));
                                } else {
                                    objValueOf = defaultSharedPreferences.getString(string, "");
                                }
                                break;
                            case 2342524:
                                if (strValueOf.equals("LONG")) {
                                    objValueOf = Long.valueOf(defaultSharedPreferences.getLong(string, 0L));
                                } else {
                                    objValueOf = defaultSharedPreferences.getString(string, "");
                                }
                                break;
                            case 66988604:
                                if (strValueOf.equals("FLOAT")) {
                                    objValueOf = Float.valueOf(defaultSharedPreferences.getFloat(string, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                                } else {
                                    objValueOf = defaultSharedPreferences.getString(string, "");
                                }
                                break;
                            case 782694408:
                                if (strValueOf.equals("BOOLEAN")) {
                                    objValueOf = Boolean.valueOf(defaultSharedPreferences.getBoolean(string, false));
                                } else {
                                    objValueOf = defaultSharedPreferences.getString(string, "");
                                }
                                break;
                            default:
                                objValueOf = defaultSharedPreferences.getString(string, "");
                                break;
                        }
                    } catch (Exception unused2) {
                    }
                } else {
                    switch (strValueOf.hashCode()) {
                        case -1838656495:
                            strValueOf.equals("STRING");
                            objValueOf = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "");
                            break;
                        case 72655:
                            if (strValueOf.equals("INT")) {
                                objValueOf = Integer.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, 0));
                            } else {
                                objValueOf = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "");
                            }
                            break;
                        case 2342524:
                            if (strValueOf.equals("LONG")) {
                                objValueOf = Long.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, 0L));
                            } else {
                                objValueOf = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "");
                            }
                            break;
                        case 66988604:
                            if (strValueOf.equals("FLOAT")) {
                                objValueOf = Float.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                            } else {
                                objValueOf = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "");
                            }
                            break;
                        case 782694408:
                            if (strValueOf.equals("BOOLEAN")) {
                                objValueOf = Boolean.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, false));
                            } else {
                                objValueOf = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "");
                            }
                            break;
                        default:
                            objValueOf = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "");
                            break;
                    }
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }
}
