package io.p071bidmachine.analytics.internal.H;

import android.database.sqlite.SQLiteDatabase;
import defpackage.cm2;
import defpackage.eu;
import defpackage.gd1;
import defpackage.j52;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wz2;
import io.p071bidmachine.analytics.internal.F.b;
import io.p071bidmachine.analytics.internal.G.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements c {
    private final SQLiteDatabase a;
    private final gd1 b = new cm2(new a());

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a extends rc1 implements sr0 {
        public a() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(d.this.a);
        }
    }

    public d(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    private final Object a(Object obj) {
        try {
            wz2.a0(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(eu.f(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(io.p071bidmachine.analytics.internal.G.d.a((c) it.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            return new j52(th);
        }
    }

    @Override // io.p071bidmachine.analytics.internal.H.c
    public Object b(List list) {
        b bVarA = a();
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.p071bidmachine.analytics.internal.G.d.a((io.p071bidmachine.analytics.internal.p078g.d) it.next()));
        }
        return bVarA.a(arrayList);
    }

    @Override // io.p071bidmachine.analytics.internal.H.c
    public Object c(List list) {
        b bVarA = a();
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.p071bidmachine.analytics.internal.G.d.a((io.p071bidmachine.analytics.internal.p078g.d) it.next()));
        }
        return bVarA.b(arrayList);
    }

    public final Object b() {
        return a().a();
    }

    private final b a() {
        return (b) this.b.getValue();
    }

    @Override // io.p071bidmachine.analytics.internal.H.c
    public Object a(io.p071bidmachine.analytics.internal.p078g.d dVar) {
        return a().a(io.p071bidmachine.analytics.internal.G.d.a(dVar));
    }

    @Override // io.p071bidmachine.analytics.internal.H.c
    public Object a(String str, String str2) {
        return a(a().a(str, str2));
    }

    @Override // io.p071bidmachine.analytics.internal.H.c
    public Object a(String str, String str2, int i) {
        return a(a().a(str, str2, Integer.valueOf(i)));
    }

    @Override // io.p071bidmachine.analytics.internal.H.c
    public Object a(List list) {
        b bVarA = a();
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.p071bidmachine.analytics.internal.G.d.a((io.p071bidmachine.analytics.internal.p078g.d) it.next()));
        }
        return bVarA.c(arrayList);
    }

    @Override // io.p071bidmachine.analytics.internal.H.c
    public Object a(String str, List list) {
        return a().a(str, list);
    }
}
