package com.ironsource;

import defpackage.e80;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class S3 {

    @Nullable
    private final C4800ie a;

    @Nullable
    private final L9 b;

    @Nullable
    private final C4663b3 c;

    @Nullable
    private final Wb d;

    @Nullable
    private final K1 e;

    @Nullable
    private final C4658ag f;

    @Nullable
    private final com.ironsource.mediationsdk.adquality.a g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @Nullable
        private C4800ie a;

        @Nullable
        private L9 b;

        @Nullable
        private C4663b3 c;

        @Nullable
        private Wb d;

        @Nullable
        private K1 e;

        @Nullable
        private C4658ag f;

        @Nullable
        private com.ironsource.mediationsdk.adquality.a g;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s71.b(this.a, aVar.a) && s71.b(this.b, aVar.b) && s71.b(this.c, aVar.c) && s71.b(this.d, aVar.d) && s71.b(this.e, aVar.e) && s71.b(this.f, aVar.f) && s71.b(this.g, aVar.g);
        }

        public /* synthetic */ a(C4800ie c4800ie, L9 l9, C4663b3 c4663b3, Wb wb, K1 k1, C4658ag c4658ag, com.ironsource.mediationsdk.adquality.a aVar, int i, e80 e80Var) {
            this((i & 1) != 0 ? null : c4800ie, (i & 2) != 0 ? null : l9, (i & 4) != 0 ? null : c4663b3, (i & 8) != 0 ? null : wb, (i & 16) != 0 ? null : k1, (i & 32) != 0 ? null : c4658ag, (i & 64) != 0 ? null : aVar);
        }

        public static /* synthetic */ a a(a aVar, C4800ie c4800ie, L9 l9, C4663b3 c4663b3, Wb wb, K1 k1, C4658ag c4658ag, com.ironsource.mediationsdk.adquality.a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                c4800ie = aVar.a;
            }
            if ((i & 2) != 0) {
                l9 = aVar.b;
            }
            if ((i & 4) != 0) {
                c4663b3 = aVar.c;
            }
            if ((i & 8) != 0) {
                wb = aVar.d;
            }
            if ((i & 16) != 0) {
                k1 = aVar.e;
            }
            if ((i & 32) != 0) {
                c4658ag = aVar.f;
            }
            if ((i & 64) != 0) {
                aVar2 = aVar.g;
            }
            C4658ag c4658ag2 = c4658ag;
            com.ironsource.mediationsdk.adquality.a aVar3 = aVar2;
            K1 k2 = k1;
            C4663b3 c4663b4 = c4663b3;
            return aVar.a(c4800ie, l9, c4663b4, wb, k2, c4658ag2, aVar3);
        }

        @Nullable
        public final C4800ie b() {
            return this.a;
        }

        @Nullable
        public final L9 c() {
            return this.b;
        }

        @Nullable
        public final C4663b3 d() {
            return this.c;
        }

        @Nullable
        public final Wb e() {
            return this.d;
        }

        @Nullable
        public final K1 f() {
            return this.e;
        }

        @Nullable
        public final C4658ag g() {
            return this.f;
        }

        @Nullable
        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.g;
        }

        public int hashCode() {
            C4800ie c4800ie = this.a;
            int iHashCode = (c4800ie == null ? 0 : c4800ie.hashCode()) * 31;
            L9 l9 = this.b;
            int iHashCode2 = (iHashCode + (l9 == null ? 0 : l9.hashCode())) * 31;
            C4663b3 c4663b3 = this.c;
            int iHashCode3 = (iHashCode2 + (c4663b3 == null ? 0 : c4663b3.hashCode())) * 31;
            Wb wb = this.d;
            int iHashCode4 = (iHashCode3 + (wb == null ? 0 : wb.hashCode())) * 31;
            K1 k1 = this.e;
            int iHashCode5 = (iHashCode4 + (k1 == null ? 0 : k1.hashCode())) * 31;
            C4658ag c4658ag = this.f;
            int iHashCode6 = (iHashCode5 + (c4658ag == null ? 0 : c4658ag.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.g;
            return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Nullable
        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.g;
        }

        @Nullable
        public final K1 j() {
            return this.e;
        }

        @Nullable
        public final C4663b3 k() {
            return this.c;
        }

        @Nullable
        public final L9 l() {
            return this.b;
        }

        @Nullable
        public final Wb m() {
            return this.d;
        }

        @Nullable
        public final C4800ie n() {
            return this.a;
        }

        @Nullable
        public final C4658ag o() {
            return this.f;
        }

        @NotNull
        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.a + ", interstitialConfigurations=" + this.b + ", bannerConfigurations=" + this.c + ", nativeAdConfigurations=" + this.d + ", applicationConfigurations=" + this.e + ", testSuiteSettings=" + this.f + ", adQualityConfigurations=" + this.g + ")";
        }

        public final void b(@Nullable C4800ie c4800ie) {
            this.a = c4800ie;
        }

        public final void b(@Nullable L9 l9) {
            this.b = l9;
        }

        public final void b(@Nullable C4663b3 c4663b3) {
            this.c = c4663b3;
        }

        public final void b(@Nullable Wb wb) {
            this.d = wb;
        }

        public final void b(@Nullable K1 k1) {
            this.e = k1;
        }

        public final void b(@Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
        }

        @NotNull
        public final a b(@Nullable C4658ag c4658ag) {
            this.f = c4658ag;
            return this;
        }

        public a(@Nullable C4800ie c4800ie, @Nullable L9 l9, @Nullable C4663b3 c4663b3, @Nullable Wb wb, @Nullable K1 k1, @Nullable C4658ag c4658ag, @Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.a = c4800ie;
            this.b = l9;
            this.c = c4663b3;
            this.d = wb;
            this.e = k1;
            this.f = c4658ag;
            this.g = aVar;
        }

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        @NotNull
        public final a a(@Nullable C4800ie c4800ie, @Nullable L9 l9, @Nullable C4663b3 c4663b3, @Nullable Wb wb, @Nullable K1 k1, @Nullable C4658ag c4658ag, @Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(c4800ie, l9, c4663b3, wb, k1, c4658ag, aVar);
        }

        public final void a(@Nullable C4658ag c4658ag) {
            this.f = c4658ag;
        }

        @NotNull
        public final a a(@Nullable C4800ie c4800ie) {
            this.a = c4800ie;
            return this;
        }

        @NotNull
        public final a a(@Nullable L9 l9) {
            this.b = l9;
            return this;
        }

        @NotNull
        public final a a(@Nullable C4663b3 c4663b3) {
            this.c = c4663b3;
            return this;
        }

        @NotNull
        public final a a(@Nullable Wb wb) {
            this.d = wb;
            return this;
        }

        @NotNull
        public final a a(@Nullable K1 k1) {
            this.e = k1;
            return this;
        }

        @NotNull
        public final a a(@Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
            return this;
        }

        @NotNull
        public final S3 a() {
            return new S3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }
    }

    @Nullable
    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.g;
    }

    @Nullable
    public final K1 b() {
        return this.e;
    }

    @Nullable
    public final C4663b3 c() {
        return this.c;
    }

    @Nullable
    public final L9 d() {
        return this.b;
    }

    @Nullable
    public final Wb e() {
        return this.d;
    }

    @Nullable
    public final C4800ie f() {
        return this.a;
    }

    @Nullable
    public final C4658ag g() {
        return this.f;
    }

    @NotNull
    public String toString() {
        return "configurations(\n" + this.a + "\n" + this.b + "\n" + this.c + "\n" + this.d + ")";
    }

    private S3(C4800ie c4800ie, L9 l9, C4663b3 c4663b3, Wb wb, K1 k1, C4658ag c4658ag, com.ironsource.mediationsdk.adquality.a aVar) {
        this.a = c4800ie;
        this.b = l9;
        this.c = c4663b3;
        this.d = wb;
        this.e = k1;
        this.f = c4658ag;
        this.g = aVar;
    }

    public /* synthetic */ S3(C4800ie c4800ie, L9 l9, C4663b3 c4663b3, Wb wb, K1 k1, C4658ag c4658ag, com.ironsource.mediationsdk.adquality.a aVar, e80 e80Var) {
        this(c4800ie, l9, c4663b3, wb, k1, c4658ag, aVar);
    }
}
