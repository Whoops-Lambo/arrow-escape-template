package com.inmobi.media;

import android.content.ContentValues;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.fy;
import defpackage.pv1;
import defpackage.wz2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.inmobi.media.xc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4517xc {
    public final S9 a;
    public WeakReference b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, int i, fy fyVar) {
        C4352rc c4352rc;
        if (fyVar instanceof C4352rc) {
            c4352rc = (C4352rc) fyVar;
            int i2 = c4352rc.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4352rc.c = i2 - Integer.MIN_VALUE;
            } else {
                c4352rc = new C4352rc(this, fyVar);
            }
        } else {
            c4352rc = new C4352rc(this, fyVar);
        }
        Object objA = c4352rc.a;
        int i3 = c4352rc.c;
        if (i3 == 0) {
            wz2.a0(objA);
            StringBuilder sb = new StringBuilder("SELECT * FROM logs_v2 WHERE id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > ");
            sb.append(j);
            sb.append(" ORDER BY saveTimestamp DESC LIMIT ");
            String strL = defpackage.nj.l(i, ") AS recent_logs);", sb);
            S9 s9 = this.a;
            c4352rc.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, strL, null), c4352rc);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i3 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(eu.f(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC4571zc.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fy fyVar) {
        C4408tc c4408tc;
        if (fyVar instanceof C4408tc) {
            c4408tc = (C4408tc) fyVar;
            int i = c4408tc.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4408tc.c = i - Integer.MIN_VALUE;
            } else {
                c4408tc = new C4408tc(this, fyVar);
            }
        } else {
            c4408tc = new C4408tc(this, fyVar);
        }
        Object objA = c4408tc.a;
        int i2 = c4408tc.c;
        if (i2 == 0) {
            wz2.a0(objA);
            S9 s9 = this.a;
            c4408tc.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=0", null), c4408tc);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(eu.f(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC4571zc.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    public C4517xc(S9 s9) {
        s9.getClass();
        this.a = s9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, fy fyVar) {
        C4436uc c4436uc;
        if (fyVar instanceof C4436uc) {
            c4436uc = (C4436uc) fyVar;
            int i = c4436uc.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4436uc.c = i - Integer.MIN_VALUE;
            } else {
                c4436uc = new C4436uc(this, fyVar);
            }
        } else {
            c4436uc = new C4436uc(this, fyVar);
        }
        Object objA = c4436uc.a;
        int i2 = c4436uc.c;
        if (i2 == 0) {
            wz2.a0(objA);
            S9 s9 = this.a;
            c4436uc.c = 1;
            s9.getClass();
            objA = s9.a(new J9(s9, "SELECT COUNT(*) FROM logs_v2 WHERE filename='" + str + "'", null), c4436uc);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        return Boolean.valueOf(((Number) objA).intValue() != 0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(C4325qc c4325qc, fy fyVar) {
        C4490wc c4490wc;
        if (fyVar instanceof C4490wc) {
            c4490wc = (C4490wc) fyVar;
            int i = c4490wc.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4490wc.c = i - Integer.MIN_VALUE;
            } else {
                c4490wc = new C4490wc(this, fyVar);
            }
        } else {
            c4490wc = new C4490wc(this, fyVar);
        }
        C4490wc c4490wc2 = c4490wc;
        Object obj = c4490wc2.a;
        int i2 = c4490wc2.c;
        if (i2 == 0) {
            wz2.a0(obj);
            S9 s9 = this.a;
            ContentValues contentValuesA = AbstractC4571zc.a(c4325qc);
            String[] strArr = {c4325qc.a};
            c4490wc2.c = 1;
            Object objA = S9.a(s9, "logs_v2", contentValuesA, "filename=?", strArr, c4490wc2, 16);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
        }
        WeakReference weakReference = this.b;
        if (weakReference != null && ((C3877aa) weakReference.get()) != null) {
            C3877aa.a();
        }
        return az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) {
        C4380sc c4380sc;
        if (fyVar instanceof C4380sc) {
            c4380sc = (C4380sc) fyVar;
            int i = c4380sc.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4380sc.c = i - Integer.MIN_VALUE;
            } else {
                c4380sc = new C4380sc(this, fyVar);
            }
        } else {
            c4380sc = new C4380sc(this, fyVar);
        }
        Object objA = c4380sc.a;
        int i2 = c4380sc.c;
        if (i2 == 0) {
            wz2.a0(objA);
            S9 s9 = this.a;
            c4380sc.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=1", null), c4380sc);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(eu.f(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC4571zc.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C4325qc c4325qc, fy fyVar) {
        C4463vc c4463vc;
        if (fyVar instanceof C4463vc) {
            c4463vc = (C4463vc) fyVar;
            int i = c4463vc.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4463vc.c = i - Integer.MIN_VALUE;
            } else {
                c4463vc = new C4463vc(this, fyVar);
            }
        } else {
            c4463vc = new C4463vc(this, fyVar);
        }
        Object obj = c4463vc.a;
        int i2 = c4463vc.c;
        if (i2 == 0) {
            wz2.a0(obj);
            S9 s9 = this.a;
            ContentValues contentValuesA = AbstractC4571zc.a(c4325qc);
            c4463vc.c = 1;
            Object objA = s9.a("logs_v2", contentValuesA, 4, c4463vc);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
        }
        WeakReference weakReference = this.b;
        if (weakReference != null && ((C3877aa) weakReference.get()) != null) {
            C3877aa.a();
        }
        return az2.a;
    }

    public final Object a(String str, fy fyVar) {
        Object objA = S9.a(this.a, "logs_v2", pv1.n("filename='", str, "'"), fyVar, 4);
        return objA == dz.a ? objA : az2.a;
    }
}
