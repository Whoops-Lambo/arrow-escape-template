package io.p071bidmachine.analytics.internal.H;

import android.database.sqlite.SQLiteDatabase;
import defpackage.az2;
import defpackage.cm2;
import defpackage.eu;
import defpackage.gd1;
import defpackage.j52;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wz2;
import io.p071bidmachine.analytics.internal.F.c;
import io.p071bidmachine.analytics.internal.p078g.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements e {
    private final SQLiteDatabase a;
    private final gd1 b = new cm2(new a());

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a extends rc1 implements sr0 {
        public a() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return new c(f.this.a);
        }
    }

    public f(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // io.p071bidmachine.analytics.internal.H.e
    public Object a(List list, List list2) {
        a().b(list);
        c cVarA = a();
        ArrayList arrayList = new ArrayList(eu.f(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(io.p071bidmachine.analytics.internal.G.f.a((e.a) it.next()).toString());
        }
        cVarA.c(arrayList);
        return az2.a;
    }

    @Override // io.p071bidmachine.analytics.internal.H.e
    public Object b(List list) {
        c cVarA = a();
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.p071bidmachine.analytics.internal.G.f.a((e) it.next()));
        }
        return cVarA.a(arrayList);
    }

    @Override // io.p071bidmachine.analytics.internal.H.e
    public Object c(List list) {
        c cVarA = a();
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.p071bidmachine.analytics.internal.G.f.a((e) it.next()));
        }
        return cVarA.d(arrayList);
    }

    @Override // io.p071bidmachine.analytics.internal.H.e
    public Object b(e eVar) {
        return a().c(io.p071bidmachine.analytics.internal.G.f.a(eVar));
    }

    public final Object b() {
        return a().b();
    }

    private final c a() {
        return (c) this.b.getValue();
    }

    @Override // io.p071bidmachine.analytics.internal.H.e
    public Object a(e eVar) {
        return a().a(io.p071bidmachine.analytics.internal.G.f.a(eVar));
    }

    @Override // io.p071bidmachine.analytics.internal.H.e
    public Object a(String str, e.a aVar) {
        Object objA = a().a(str, io.p071bidmachine.analytics.internal.G.f.a(aVar).toString());
        try {
            wz2.a0(objA);
            io.p071bidmachine.analytics.internal.G.e eVar = (io.p071bidmachine.analytics.internal.G.e) objA;
            if (eVar != null) {
                return io.p071bidmachine.analytics.internal.G.f.a(eVar);
            }
            return null;
        } catch (Throwable th) {
            return new j52(th);
        }
    }

    @Override // io.p071bidmachine.analytics.internal.H.e
    public Object a(String str) {
        return a(a().a(str));
    }

    @Override // io.p071bidmachine.analytics.internal.H.e
    public Object a(List list) {
        c cVarA = a();
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.p071bidmachine.analytics.internal.G.f.a((e) it.next()));
        }
        return cVarA.e(arrayList);
    }

    @Override // io.p071bidmachine.analytics.internal.H.e
    public Object a(String str, List list) {
        c cVarA = a();
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.p071bidmachine.analytics.internal.G.f.a((e.a) it.next()).toString());
        }
        return cVarA.a(str, arrayList);
    }

    private final Object a(Object obj) {
        try {
            wz2.a0(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(eu.f(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(io.p071bidmachine.analytics.internal.G.f.a((io.p071bidmachine.analytics.internal.G.e) it.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            return new j52(th);
        }
    }
}
