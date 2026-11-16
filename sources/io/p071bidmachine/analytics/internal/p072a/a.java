package io.p071bidmachine.analytics.internal.p072a;

import android.content.Context;
import defpackage.cm2;
import defpackage.eu;
import defpackage.gd1;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private final Context a;
    private final gd1 b = new cm2(new b());
    private final gd1 c = new cm2(new c());
    private final gd1 d = new cm2(new C1577a());
    private final gd1 e = eu.w(d.a);

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.a.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C1577a extends rc1 implements sr0 {
        public C1577a() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.p071bidmachine.analytics.internal.p072a.b invoke() {
            return new io.p071bidmachine.analytics.internal.p072a.b(a.this.c().f());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b extends rc1 implements sr0 {
        public b() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.p071bidmachine.analytics.internal.p072a.c invoke() {
            return new io.p071bidmachine.analytics.internal.p072a.c(a.this.a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c extends rc1 implements sr0 {
        public c() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.p071bidmachine.analytics.internal.p072a.d invoke() {
            return new io.p071bidmachine.analytics.internal.p072a.d(a.this.a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class d extends rc1 implements sr0 {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.p071bidmachine.util.time.a invoke() {
            return new io.p071bidmachine.util.time.a();
        }
    }

    public final Context a() {
        return this.a;
    }

    public final io.p071bidmachine.analytics.internal.p072a.b b() {
        return (io.p071bidmachine.analytics.internal.p072a.b) this.d.getValue();
    }

    public final io.p071bidmachine.analytics.internal.p072a.c c() {
        return (io.p071bidmachine.analytics.internal.p072a.c) this.b.getValue();
    }

    public final io.p071bidmachine.analytics.internal.p072a.d d() {
        return (io.p071bidmachine.analytics.internal.p072a.d) this.c.getValue();
    }

    public final io.p071bidmachine.util.time.b e() {
        return (io.p071bidmachine.util.time.b) this.e.getValue();
    }

    public a(Context context) {
        this.a = context.getApplicationContext();
    }
}
