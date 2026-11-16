package com.ironsource;

import defpackage.e80;
import defpackage.pv1;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.m3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4860m3 implements InterfaceC4918p7 {

    /* JADX INFO: renamed from: com.ironsource.m3$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a extends AbstractC4860m3 {

        @NotNull
        private final b a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s71.b(this.a, ((a) obj).a);
        }

        public static /* synthetic */ a a(a aVar, b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar = aVar.a;
            }
            return aVar.a(bVar);
        }

        @NotNull
        public final b d() {
            return this.a;
        }

        @NotNull
        public final b e() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "First(firstReason=" + this.a + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull b bVar) {
            super(null);
            bVar.getClass();
            this.a = bVar;
        }

        @NotNull
        public final a a(@NotNull b bVar) {
            bVar.getClass();
            return new a(bVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class b implements InterfaceC4918p7 {

        /* JADX INFO: renamed from: com.ironsource.m3$b$a */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class a extends b {

            @NotNull
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.m3$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class C1372b extends b {

            @NotNull
            public static final C1372b a = new C1372b();

            private C1372b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.m3$b$c */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class c extends b {

            @NotNull
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        @Override // com.ironsource.InterfaceC4918p7
        @NotNull
        public String a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C1372b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            io.p071bidmachine.ads.networks.adaptiverendering.e.b();
            return null;
        }

        public /* synthetic */ b(e80 e80Var) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c extends AbstractC4860m3 {
        private final long a;

        @NotNull
        private final d b;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && s71.b(this.b, cVar.b);
        }

        public static /* synthetic */ c a(c cVar, long j, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                j = cVar.a;
            }
            if ((i & 2) != 0) {
                dVar = cVar.b;
            }
            return cVar.a(j, dVar);
        }

        public final long d() {
            return this.a;
        }

        @NotNull
        public final d e() {
            return this.b;
        }

        @NotNull
        public final d f() {
            return this.b;
        }

        public final long g() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        @NotNull
        public String toString() {
            return "Recurring(reloadDuration=" + this.a + ", recurringReason=" + this.b + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, @NotNull d dVar) {
            super(null);
            dVar.getClass();
            this.a = j;
            this.b = dVar;
        }

        @NotNull
        public final c a(long j, @NotNull d dVar) {
            dVar.getClass();
            return new c(j, dVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class d implements InterfaceC4918p7 {

        /* JADX INFO: renamed from: com.ironsource.m3$d$a */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class a extends d {

            @NotNull
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.m3$d$b */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class b extends d {

            @NotNull
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.m3$d$c */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class c extends d {

            @NotNull
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.m3$d$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class C1373d extends d {

            @NotNull
            public static final C1373d a = new C1373d();

            private C1373d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.m3$d$e */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class e extends d {

            @NotNull
            public static final e a = new e();

            private e() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.m3$d$f */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class f extends d {
            private final long a;

            public f(long j) {
                super(null);
                this.a = j;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a == ((f) obj).a;
            }

            public static /* synthetic */ f a(f fVar, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = fVar.a;
                }
                return fVar.a(j);
            }

            public final long c() {
                return this.a;
            }

            public final long d() {
                return this.a;
            }

            public int hashCode() {
                return Long.hashCode(this.a);
            }

            @NotNull
            public String toString() {
                return pv1.m(this.a, "ResumeVisibility(notVisibleDuration=", ")");
            }

            @NotNull
            public final f a(long j) {
                return new f(j);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.m3$d$g */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class g extends d {

            @NotNull
            public static final g a = new g();

            private g() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.m3$d$h */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class h extends d {

            @NotNull
            public static final h a = new h();

            private h() {
                super(null);
            }
        }

        @Override // com.ironsource.InterfaceC4918p7
        @NotNull
        public String a() {
            if (this instanceof f) {
                return "ResumeVisibility";
            }
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof C1373d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            io.p071bidmachine.ads.networks.adaptiverendering.e.b();
            return null;
        }

        public final long b() {
            if (this instanceof f) {
                return ((f) this).d();
            }
            return 0L;
        }

        public /* synthetic */ d(e80 e80Var) {
            this();
        }

        private d() {
        }
    }

    @Override // com.ironsource.InterfaceC4918p7
    @NotNull
    public String a() {
        if (this instanceof a) {
            return ((a) this).e().a();
        }
        if (this instanceof c) {
            return ((c) this).f().a();
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.b();
        return null;
    }

    public final long b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).f().b();
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.b();
        return 0L;
    }

    public final long c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).g();
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.b();
        return 0L;
    }

    public /* synthetic */ AbstractC4860m3(e80 e80Var) {
        this();
    }

    private AbstractC4860m3() {
    }
}
