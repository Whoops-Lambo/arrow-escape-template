package com.ironsource;

import android.app.Activity;
import defpackage.ek2;
import defpackage.jh0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC5065xb
public interface InterfaceC5096z6 {

    /* JADX INFO: renamed from: com.ironsource.z6$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        private final c a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.a;
            }
            return aVar.a(cVar);
        }

        @NotNull
        public final c b() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Config(strategyType=" + this.a + ")";
        }

        public a(@NotNull c cVar) {
            cVar.getClass();
            this.a = cVar;
        }

        @NotNull
        public final a a(@NotNull c cVar) {
            cVar.getClass();
            return new a(cVar);
        }

        @NotNull
        public final c a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.z6$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {

        /* JADX INFO: renamed from: com.ironsource.z6$b$a */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        @NotNull
        public final InterfaceC5096z6 a(@NotNull C4911p0 c4911p0, @NotNull a aVar, @NotNull InterfaceC5024v6 interfaceC5024v6, @NotNull InterfaceC5060x6 interfaceC5060x6, @NotNull InterfaceC5078y6 interfaceC5078y6) {
            c4911p0.getClass();
            aVar.getClass();
            interfaceC5024v6.getClass();
            interfaceC5060x6.getClass();
            interfaceC5078y6.getClass();
            int i = a.a[aVar.b().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new A6(c4911p0, interfaceC5024v6, interfaceC5060x6, interfaceC5078y6);
                    }
                    io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                    return null;
                }
                return new G6(c4911p0, interfaceC5024v6, interfaceC5060x6, interfaceC5078y6);
            }
            return new N6(c4911p0, aVar, interfaceC5024v6, interfaceC5060x6, interfaceC5078y6);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.z6$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");

        private static final /* synthetic */ jh0 f = ek2.m(a());

        @NotNull
        private final String a;

        @NotNull
        public static jh0 c() {
            return f;
        }

        @NotNull
        public final String b() {
            return this.a;
        }

        c(String str) {
            this.a = str;
        }
    }

    void a(@NotNull Activity activity);

    void loadAd();
}
