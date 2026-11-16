package com.facebook.internal;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {
    public static final b0 a = new b0();
    public static final HashMap b = new HashMap();

    public static final void a(x xVar, z zVar) {
        zVar.getClass();
        d0.d(new a0(xVar, zVar));
    }

    public static final boolean b(z zVar) {
        z zVarM;
        boolean z;
        zVar.getClass();
        boolean z2 = false;
        if (z.Unknown != zVar) {
            if (z.Core != zVar) {
                String string = com.facebook.a0.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString("FBSDKFeature" + zVar, null);
                if (string == null || !string.equals("18.3.0")) {
                    int i = zVar.a;
                    if ((i & 255) > 0) {
                        zVarM = v0.m(i & (-256));
                    } else if ((65280 & i) > 0) {
                        zVarM = v0.m(i & (-65536));
                    } else if ((16711680 & i) > 0) {
                        zVarM = v0.m(i & (-16777216));
                    } else {
                        zVarM = v0.m(0);
                    }
                    if (zVarM == zVar) {
                        switch (zVar.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 43:
                            case 44:
                            case 45:
                                break;
                            case 35:
                            case 36:
                            case 37:
                            case 42:
                            default:
                                z2 = true;
                                break;
                        }
                        return d0.b("FBSDKFeature" + zVar, com.facebook.a0.b(), z2);
                    }
                    if (b(zVarM)) {
                        switch (zVar.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 43:
                            case 44:
                            case 45:
                                z = false;
                                break;
                            case 35:
                            case 36:
                            case 37:
                            case 42:
                            default:
                                z = true;
                                break;
                        }
                        if (d0.b("FBSDKFeature" + zVar, com.facebook.a0.b(), z)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
