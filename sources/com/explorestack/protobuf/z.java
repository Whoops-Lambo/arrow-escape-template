package com.explorestack.protobuf;

import com.unity3d.ads.BuildConfig;
import defpackage.h50;
import defpackage.m93;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ int b(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 5) {
                            return 5;
                        }
                        throw null;
                    }
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "loading";
        }
        if (i == 2) {
            return BuildConfig.FLAVOR;
        }
        if (i == 3) {
            return "resized";
        }
        if (i == 4) {
            return "expanded";
        }
        if (i == 5) {
            return "hidden";
        }
        throw null;
    }

    public static /* synthetic */ boolean d(int i) {
        switch (i) {
            case 1:
                return true;
            case 2:
            case 3:
                return false;
            case 4:
            case 5:
                return true;
            case 6:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ boolean e(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "cancel";
        }
        if (i == 3) {
            return "error";
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return "only_me";
        }
        if (i == 3) {
            return "friends";
        }
        if (i == 4) {
            return "everyone";
        }
        throw null;
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "facebook";
        }
        if (i == 2) {
            return "instagram";
        }
        throw null;
    }

    public static int i(int i, int i2, int i3, int i4, int i5) {
        return (((i + i2) * i3) + i4) * i5;
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "S256";
        }
        if (i == 2) {
            return "PLAIN";
        }
        throw null;
    }

    public static /* synthetic */ String t(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "ONLY_ME";
        }
        if (i == 3) {
            return "FRIENDS";
        }
        if (i == 4) {
            return "EVERYONE";
        }
        throw null;
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return "TIMER";
        }
        if (i == 2) {
            return "COUNT";
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "LEVELPLAY";
        }
        return "MAX";
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "debug";
        }
        if (i == 2) {
            return "info";
        }
        if (i == 3) {
            return "warning";
        }
        if (i != 4) {
            return i != 5 ? "null" : "none";
        }
        return "error";
    }

    public static final int a(int i) {
        com.facebook.a0 a0Var = com.facebook.a0.a;
        com.facebook.internal.v0.U();
        return h50.C(i) + com.facebook.a0.l;
    }

    public static com.moloco.sdk.acm.e n(String str, String str2, String str3) {
        com.moloco.sdk.acm.e eVar = new com.moloco.sdk.acm.e(str);
        eVar.a(str2, str3);
        return eVar;
    }

    public static com.moloco.sdk.acm.e o(String str, String str2, String str3, String str4, String str5) {
        com.moloco.sdk.acm.e eVar = new com.moloco.sdk.acm.e(str);
        eVar.a(str2, str3);
        eVar.a(str4, str5);
        return eVar;
    }

    public static /* synthetic */ void q(Object obj) {
        if (obj == null) {
            return;
        }
        m93.b();
    }

    public static int j(int i, Integer num) {
        return w.m(num.intValue()) + i;
    }

    public static int k(s5 s5Var, int i, int i2) {
        return y4.computeStringSizeNoTag(s5Var.getRaw(i)) + i2;
    }

    public static int l(s5 s5Var, int i, w wVar, int i2, int i3, int i4) throws IOException {
        y4.writeString(wVar, i2, s5Var.getRaw(i));
        return i3 + i4;
    }

    public static Struct m(Struct struct, Struct struct2) {
        return Struct.newBuilder(struct).mergeFrom(struct2).buildPartial();
    }

    public static void p(int i, int i2, int i3, int i4, int i5) {
        io.p071bidmachine.media3.common.util.x.G(i);
        io.p071bidmachine.media3.common.util.x.G(i2);
        io.p071bidmachine.media3.common.util.x.G(i3);
        io.p071bidmachine.media3.common.util.x.G(i4);
        io.p071bidmachine.media3.common.util.x.G(i5);
    }

    public static void r(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static /* synthetic */ String u(int i) {
        switch (i) {
            case 1:
                return "NATIVE_WITH_FALLBACK";
            case 2:
                return "NATIVE_ONLY";
            case 3:
                return "KATANA_ONLY";
            case 4:
                return "WEB_ONLY";
            case 5:
                return "DIALOG_ONLY";
            case 6:
                return "DEVICE_AUTH";
            default:
                throw null;
        }
    }
}
