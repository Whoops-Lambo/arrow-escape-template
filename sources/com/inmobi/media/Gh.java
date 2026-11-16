package com.inmobi.media;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.fy;
import defpackage.h32;
import defpackage.h50;
import defpackage.jc1;
import defpackage.m32;
import defpackage.pv1;
import defpackage.wz2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Gh {
    public final S9 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Integer num, fy fyVar) {
        C4522xh c4522xh;
        if (fyVar instanceof C4522xh) {
            c4522xh = (C4522xh) fyVar;
            int i = c4522xh.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4522xh.c = i - Integer.MIN_VALUE;
            } else {
                c4522xh = new C4522xh(this, fyVar);
            }
        } else {
            c4522xh = new C4522xh(this, fyVar);
        }
        Object objA = c4522xh.a;
        int i2 = c4522xh.c;
        if (i2 == 0) {
            wz2.a0(objA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strK = num != null ? pv1.k(num.intValue(), " LIMIT ") : "";
            StringBuilder sb = new StringBuilder("SELECT * FROM pings WHERE priority='");
            sb.append(str);
            sb.append("' AND (retryAfter IS NULL OR retryAfter<=");
            sb.append(jCurrentTimeMillis);
            String strQ = defpackage.nj.q(sb, ")  AND status!=\"in_progress\" ORDER BY time_created ASC", strK);
            S9 s9 = this.a;
            c4522xh.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, strQ, null), c4522xh);
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
            arrayList.add(Hh.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, Integer num, fy fyVar) {
        C4576zh c4576zh;
        if (fyVar instanceof C4576zh) {
            c4576zh = (C4576zh) fyVar;
            int i = c4576zh.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4576zh.c = i - Integer.MIN_VALUE;
            } else {
                c4576zh = new C4576zh(this, fyVar);
            }
        } else {
            c4576zh = new C4576zh(this, fyVar);
        }
        Object objA = c4576zh.a;
        int i2 = c4576zh.c;
        if (i2 == 0) {
            wz2.a0(objA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strK = num != null ? pv1.k(num.intValue(), " LIMIT ") : "";
            StringBuilder sb = new StringBuilder("SELECT * FROM pings WHERE priority='");
            sb.append(str);
            sb.append("' AND retry_count>=1 AND retryAfter<=");
            sb.append(jCurrentTimeMillis);
            String strQ = defpackage.nj.q(sb, " AND status=\"failed\" ORDER BY time_created ASC", strK);
            S9 s9 = this.a;
            c4576zh.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, strQ, null), c4576zh);
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
            arrayList.add(Hh.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    public Gh(S9 s9) {
        s9.getClass();
        this.a = s9;
    }

    public final Object a(String str, fy fyVar) {
        String strN = pv1.n("SELECT COUNT(*) FROM pings WHERE priority='", str, "'");
        S9 s9 = this.a;
        s9.getClass();
        return s9.a(new J9(s9, strN, null), fyVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, fy fyVar) {
        Bh bh;
        if (fyVar instanceof Bh) {
            bh = (Bh) fyVar;
            int i = bh.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bh.c = i - Integer.MIN_VALUE;
            } else {
                bh = new Bh(this, fyVar);
            }
        } else {
            bh = new Bh(this, fyVar);
        }
        Object objA = bh.a;
        int i2 = bh.c;
        if (i2 == 0) {
            wz2.a0(objA);
            String strN = pv1.n("SELECT id FROM pings WHERE id=", DatabaseUtils.sqlEscapeString(str), " LIMIT 1");
            S9 s9 = this.a;
            bh.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, strN, null), bh);
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
        return Boolean.valueOf(!((Collection) objA).isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Integer num, String str, long j, fy fyVar) {
        Ah ah;
        String strK;
        if (fyVar instanceof Ah) {
            ah = (Ah) fyVar;
            int i = ah.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ah.c = i - Integer.MIN_VALUE;
            } else {
                ah = new Ah(this, fyVar);
            }
        } else {
            ah = new Ah(this, fyVar);
        }
        Object objA = ah.a;
        int i2 = ah.c;
        if (i2 == 0) {
            wz2.a0(objA);
            if (num != null) {
                strK = pv1.k(num.intValue(), " LIMIT ");
            } else {
                strK = "";
            }
            StringBuilder sb = new StringBuilder("SELECT * FROM pings WHERE priority='");
            sb.append(str);
            sb.append("' AND retry_count=0 AND time_created<");
            sb.append(j);
            String strQ = defpackage.nj.q(sb, " AND status=\"idle\" ORDER BY time_created ASC", strK);
            S9 s9 = this.a;
            ah.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, strQ, null), ah);
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
            arrayList.add(Hh.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Vg vg, int i, fy fyVar) {
        Eh eh;
        m32 m32Var;
        if (fyVar instanceof Eh) {
            eh = (Eh) fyVar;
            int i2 = eh.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eh.d = i2 - Integer.MIN_VALUE;
            } else {
                eh = new Eh(this, fyVar);
            }
        } else {
            eh = new Eh(this, fyVar);
        }
        Object objA = eh.b;
        int i3 = eh.d;
        Object obj = dz.a;
        if (i3 == 0) {
            wz2.a0(objA);
            eh.a = vg;
            eh.d = 1;
            objA = a(vg, i, eh);
            if (objA != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            vg = (Vg) eh.a;
            wz2.a0(objA);
        } else {
            if (i3 != 2) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m32Var = (m32) eh.a;
            wz2.a0(objA);
        }
        return m32Var.a;
        if (((Boolean) objA).booleanValue()) {
            return new Xa(vg);
        }
        m32 m32Var2 = new m32();
        m32Var2.a = new Za(vg);
        S9 s9 = this.a;
        Fh fh = new Fh(this, vg, m32Var2, null);
        eh.a = m32Var2;
        eh.d = 2;
        s9.getClass();
        if (s9.a(new R9(s9, fh, null), eh) != obj) {
            m32Var = m32Var2;
            return m32Var.a;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, Integer num, fy fyVar) {
        C4549yh c4549yh;
        String strK;
        if (fyVar instanceof C4549yh) {
            c4549yh = (C4549yh) fyVar;
            int i = c4549yh.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4549yh.c = i - Integer.MIN_VALUE;
            } else {
                c4549yh = new C4549yh(this, fyVar);
            }
        } else {
            c4549yh = new C4549yh(this, fyVar);
        }
        Object objA = c4549yh.a;
        int i2 = c4549yh.c;
        if (i2 == 0) {
            wz2.a0(objA);
            if (num != null) {
                strK = pv1.k(num.intValue(), " LIMIT ");
            } else {
                strK = "";
            }
            StringBuilder sbR = pv1.r("SELECT * FROM pings WHERE priority='", str, "' AND status=\"", str2, "\" ORDER BY time_created ASC");
            sbR.append(strK);
            String string = sbR.toString();
            S9 s9 = this.a;
            c4549yh.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, string, null), c4549yh);
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
            arrayList.add(Hh.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Vg vg, int i, fy fyVar) {
        Ch ch;
        h32 h32Var;
        if (fyVar instanceof Ch) {
            ch = (Ch) fyVar;
            int i2 = ch.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ch.d = i2 - Integer.MIN_VALUE;
            } else {
                ch = new Ch(this, fyVar);
            }
        } else {
            ch = new Ch(this, fyVar);
        }
        Object obj = ch.b;
        int i3 = ch.d;
        if (i3 == 0) {
            wz2.a0(obj);
            h32 h32Var2 = new h32();
            S9 s9 = this.a;
            Dh dh = new Dh(vg, i, h32Var2, null);
            ch.a = h32Var2;
            ch.d = 1;
            s9.getClass();
            Object objA = s9.a(new R9(s9, dh, null), ch);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
            h32Var = h32Var2;
        } else {
            if (i3 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h32Var = ch.a;
            wz2.a0(obj);
        }
        return Boolean.valueOf(h32Var.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, long j2, fy fyVar) {
        C4468vh c4468vh;
        if (fyVar instanceof C4468vh) {
            c4468vh = (C4468vh) fyVar;
            int i = c4468vh.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4468vh.d = i - Integer.MIN_VALUE;
            } else {
                c4468vh = new C4468vh(this, fyVar);
            }
        } else {
            c4468vh = new C4468vh(this, fyVar);
        }
        Object obj = c4468vh.b;
        int i2 = c4468vh.d;
        if (i2 != 0) {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList = c4468vh.a;
            wz2.a0(obj);
            return arrayList;
        }
        wz2.a0(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM = jc1.m(jCurrentTimeMillis - j2, "))", h50.o(jCurrentTimeMillis - j, "((priority='normal' AND time_created<", ") OR (priority='high' AND time_created<"));
        ArrayList arrayList2 = new ArrayList();
        S9 s9 = this.a;
        C4495wh c4495wh = new C4495wh(strM, arrayList2, null);
        c4468vh.a = arrayList2;
        c4468vh.d = 1;
        s9.getClass();
        Object objA = s9.a(new R9(s9, c4495wh, null), c4468vh);
        dz dzVar = dz.a;
        return objA == dzVar ? dzVar : arrayList2;
    }
}
