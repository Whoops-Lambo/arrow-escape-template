package io.p071bidmachine.analytics.internal.p072a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import defpackage.cm2;
import defpackage.gd1;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private final Context a;
    private final gd1 b = new cm2(new b());
    private final gd1 c = new cm2(new a());
    private final gd1 d = new cm2(new d());
    private final gd1 e = new cm2(new f());
    private final gd1 f = new cm2(new C1579c());
    private final gd1 g = new cm2(new e());

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a extends rc1 implements sr0 {
        public a() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteDatabase invoke() {
            return c.this.c().getWritableDatabase();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b extends rc1 implements sr0 {
        public b() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.p071bidmachine.analytics.internal.E.a invoke() {
            return new io.p071bidmachine.analytics.internal.E.a(c.this.a());
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.a.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C1579c extends rc1 implements sr0 {
        public C1579c() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.p071bidmachine.analytics.internal.H.b invoke() {
            return new io.p071bidmachine.analytics.internal.H.b(c.this.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class d extends rc1 implements sr0 {
        public d() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.p071bidmachine.analytics.internal.H.d invoke() {
            io.p071bidmachine.analytics.internal.H.d dVar = new io.p071bidmachine.analytics.internal.H.d(c.this.b());
            dVar.b();
            return dVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class e extends rc1 implements sr0 {
        public e() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.p071bidmachine.analytics.internal.J.a invoke() {
            return new io.p071bidmachine.analytics.internal.J.a(c.this.a(), null, 0, 6, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class f extends rc1 implements sr0 {
        public f() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.p071bidmachine.analytics.internal.H.f invoke() {
            io.p071bidmachine.analytics.internal.H.f fVar = new io.p071bidmachine.analytics.internal.H.f(c.this.b());
            fVar.b();
            return fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SQLiteDatabase b() {
        return (SQLiteDatabase) this.c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.p071bidmachine.analytics.internal.E.a c() {
        return (io.p071bidmachine.analytics.internal.E.a) this.b.getValue();
    }

    public final io.p071bidmachine.analytics.internal.H.a d() {
        return (io.p071bidmachine.analytics.internal.H.a) this.f.getValue();
    }

    public final io.p071bidmachine.analytics.internal.H.c e() {
        return (io.p071bidmachine.analytics.internal.H.c) this.d.getValue();
    }

    public final io.p071bidmachine.analytics.internal.J.b f() {
        return (io.p071bidmachine.analytics.internal.J.b) this.g.getValue();
    }

    public final io.p071bidmachine.analytics.internal.H.e g() {
        return (io.p071bidmachine.analytics.internal.H.e) this.e.getValue();
    }

    public c(Context context) {
        this.a = context.getApplicationContext();
    }

    public final Context a() {
        return this.a;
    }
}
