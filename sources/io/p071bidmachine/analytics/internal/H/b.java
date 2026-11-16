package io.p071bidmachine.analytics.internal.H;

import android.database.sqlite.SQLiteDatabase;
import defpackage.cm2;
import defpackage.gd1;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.xe0;
import io.p071bidmachine.analytics.internal.I.g;
import io.p071bidmachine.analytics.internal.p078g.c;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements io.p071bidmachine.analytics.internal.H.a {
    private final SQLiteDatabase a;
    private final gd1 b = new cm2(new a());

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a extends rc1 implements sr0 {
        public a() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.p071bidmachine.analytics.internal.F.a invoke() {
            return new io.p071bidmachine.analytics.internal.F.a(b.this.a);
        }
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // io.p071bidmachine.analytics.internal.H.a
    public Object a(long j) {
        return a().a(g.a(new Date(System.currentTimeMillis() - xe0.e(j))));
    }

    private final io.p071bidmachine.analytics.internal.F.a a() {
        return (io.p071bidmachine.analytics.internal.F.a) this.b.getValue();
    }

    @Override // io.p071bidmachine.analytics.internal.H.a
    public Object a(c cVar) {
        return a().a(io.p071bidmachine.analytics.internal.G.b.b(cVar));
    }

    @Override // io.p071bidmachine.analytics.internal.H.a
    public Object a(String str) {
        return a().b(str);
    }
}
