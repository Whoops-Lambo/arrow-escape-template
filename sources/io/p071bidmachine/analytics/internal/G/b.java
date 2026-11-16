package io.p071bidmachine.analytics.internal.G;

import defpackage.rd1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.analytics.internal.p078g.c;
import io.p071bidmachine.analytics.internal.p078g.g;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[io.p071bidmachine.analytics.internal.p078g.a.values().length];
            try {
                iArr[io.p071bidmachine.analytics.internal.p078g.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[io.p071bidmachine.analytics.internal.p078g.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[io.p071bidmachine.analytics.internal.p078g.a.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[io.p071bidmachine.analytics.internal.p078g.a.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[g.values().length];
            try {
                iArr2[g.PRECISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[g.ESTIMATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final io.p071bidmachine.analytics.internal.G.a b(c cVar) {
        return new io.p071bidmachine.analytics.internal.G.a(cVar.b(), cVar.f(), io.p071bidmachine.analytics.internal.I.g.a(new Date(cVar.c())), a(cVar.a()), a(cVar), a(cVar.e()));
    }

    private static final long a(c cVar) {
        return (cVar.c() - (cVar.c() % 1000)) - rd1.q(cVar.d() * 1.0E12f);
    }

    private static final int a(io.p071bidmachine.analytics.internal.p078g.a aVar) {
        int i = a.$EnumSwitchMapping$0[aVar.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    e.b();
                    return 0;
                }
            }
        }
        return i2;
    }

    private static final int a(g gVar) {
        int i = a.$EnumSwitchMapping$1[gVar.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        e.b();
        return 0;
    }
}
