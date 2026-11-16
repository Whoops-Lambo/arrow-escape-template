package com.inmobi.media;

import android.content.Context;
import defpackage.az2;
import defpackage.c91;
import defpackage.cz;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.gd1;
import defpackage.n30;
import defpackage.wz2;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class M6 {
    public final String a;
    public final E6 b;
    public final Ng c;
    public final C4111im d;
    public final String e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final cz h;
    public D6 i;
    public c91 j;

    /* JADX WARN: Code duplicated, block: B:38:0x0107  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:45:0x0117  */
    /* JADX WARN: Code duplicated, block: B:46:0x011d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public static final Object a(M6 m6, boolean z, fy fyVar) {
        G6 g6;
        D6 d6;
        boolean z2;
        boolean z3;
        Mm mm;
        D6 d7;
        int iIntValue;
        int iN;
        D6 d8;
        int i;
        long j;
        Object objA;
        int i2;
        long j2;
        boolean zBooleanValue;
        int i3;
        long j3;
        boolean z4;
        D6 d9;
        long j4;
        int i4;
        long j5;
        D6 d10;
        boolean z5;
        Mm mm2;
        F6 f6;
        m6.getClass();
        if (fyVar instanceof G6) {
            g6 = (G6) fyVar;
            int i5 = g6.j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                g6.j = i5 - Integer.MIN_VALUE;
            } else {
                g6 = new G6(m6, fyVar);
            }
        } else {
            g6 = new G6(m6, fyVar);
        }
        G6 g7 = g6;
        Object objA2 = g7.h;
        int i6 = g7.j;
        az2 az2Var = az2.a;
        Mm mm3 = null;
        Object obj = dz.a;
        if (i6 == 0) {
            wz2.a0(objA2);
            d6 = m6.i;
            if (m6.g.get() || m6.f.get() || d6 == null) {
                return az2Var;
            }
            m6.e.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - (d6.b * 1000);
            E6 e6 = m6.b;
            g7.a = null;
            g7.b = d6;
            z2 = z;
            g7.c = z2;
            g7.j = 1;
            if (e6.a(jCurrentTimeMillis, g7) != obj) {
            }
            return obj;
        }
        if (i6 == 1) {
            boolean z6 = g7.c;
            D6 d11 = g7.b;
            Mm mm4 = g7.a;
            wz2.a0(objA2);
            z2 = z6;
            d6 = d11;
            mm3 = mm4;
        } else {
            if (i6 == 2) {
                boolean z7 = g7.c;
                D6 d12 = g7.b;
                Mm mm5 = g7.a;
                wz2.a0(objA2);
                mm = mm5;
                d7 = d12;
                z3 = z7;
                iIntValue = ((Number) objA2).intValue();
                Y5.a.getClass();
                iN = Y5.n();
                d8 = m6.i;
                if (d8 == null) {
                    i = 0;
                } else {
                    i = (iN == 0 || iN != 1) ? d8.g : d8.e;
                }
                if (d8 == null) {
                    j = 0;
                } else {
                    j = (iN == 0 || iN != 1) ? d8.j : d8.i;
                }
                long j6 = d7.d;
                g7.a = mm;
                g7.b = d7;
                g7.c = z3;
                g7.e = iIntValue;
                g7.f = i;
                g7.g = j;
                g7.j = 3;
                objA = m6.a(j6, g7);
                if (objA != obj) {
                    long j7 = j;
                    i2 = iIntValue;
                    objA2 = objA;
                    j2 = j7;
                    zBooleanValue = ((Boolean) objA2).booleanValue();
                    long j8 = d7.c;
                    long j9 = d7.d;
                    g7.a = mm;
                    g7.b = d7;
                    g7.c = z3;
                    g7.e = i2;
                    i3 = i;
                    g7.f = i3;
                    g7.g = j2;
                    g7.d = zBooleanValue;
                    g7.j = 4;
                    j3 = j2;
                    objA2 = m6.a(j8, j9, g7);
                    if (objA2 != obj) {
                        z4 = zBooleanValue;
                        d9 = d7;
                        j4 = j3;
                        i4 = i2;
                        boolean zBooleanValue2 = ((Boolean) objA2).booleanValue();
                        if (i3 <= i4) {
                        }
                        Ng ng = m6.c;
                        g7.a = mm;
                        g7.b = d9;
                        g7.c = z3;
                        g7.g = j4;
                        g7.j = 5;
                        objA2 = ng.a(g7);
                        if (objA2 != obj) {
                            j5 = j4;
                            d10 = d9;
                            z5 = z3;
                            mm2 = mm;
                        }
                    }
                }
                return obj;
            }
            if (i6 == 3) {
                long j10 = g7.g;
                int i7 = g7.f;
                int i8 = g7.e;
                z3 = g7.c;
                d7 = g7.b;
                mm = g7.a;
                wz2.a0(objA2);
                i2 = i8;
                az2Var = az2Var;
                j2 = j10;
                i = i7;
                zBooleanValue = ((Boolean) objA2).booleanValue();
                long j11 = d7.c;
                long j12 = d7.d;
                g7.a = mm;
                g7.b = d7;
                g7.c = z3;
                g7.e = i2;
                i3 = i;
                g7.f = i3;
                g7.g = j2;
                g7.d = zBooleanValue;
                g7.j = 4;
                j3 = j2;
                objA2 = m6.a(j11, j12, g7);
                if (objA2 != obj) {
                    z4 = zBooleanValue;
                    d9 = d7;
                    j4 = j3;
                    i4 = i2;
                    boolean zBooleanValue3 = ((Boolean) objA2).booleanValue();
                    if (i3 <= i4) {
                    }
                    Ng ng2 = m6.c;
                    g7.a = mm;
                    g7.b = d9;
                    g7.c = z3;
                    g7.g = j4;
                    g7.j = 5;
                    objA2 = ng2.a(g7);
                    if (objA2 != obj) {
                        j5 = j4;
                        d10 = d9;
                        z5 = z3;
                        mm2 = mm;
                    }
                }
                return obj;
            }
            if (i6 == 4) {
                z4 = g7.d;
                j4 = g7.g;
                int i9 = g7.f;
                i4 = g7.e;
                boolean z8 = g7.c;
                D6 d13 = g7.b;
                mm = g7.a;
                wz2.a0(objA2);
                i3 = i9;
                az2Var = az2Var;
                z3 = z8;
                d9 = d13;
                boolean zBooleanValue4 = ((Boolean) objA2).booleanValue();
                if (i3 <= i4 && !z4 && !zBooleanValue4) {
                    return az2Var;
                }
                Ng ng3 = m6.c;
                g7.a = mm;
                g7.b = d9;
                g7.c = z3;
                g7.g = j4;
                g7.j = 5;
                objA2 = ng3.a(g7);
                if (objA2 != obj) {
                    j5 = j4;
                    d10 = d9;
                    z5 = z3;
                    mm2 = mm;
                }
                return obj;
            }
            if (i6 != 5) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j13 = g7.g;
            boolean z9 = g7.c;
            D6 d14 = g7.b;
            Mm mm6 = g7.a;
            wz2.a0(objA2);
            z5 = z9;
            az2Var = az2Var;
            mm2 = mm6;
            j5 = j13;
            d10 = d14;
        }
        f6 = (F6) objA2;
        if (f6 != null) {
            return az2Var;
        }
        m6.f.set(true);
        gd1 gd1Var = O6.a;
        String str = d10.k;
        int i10 = d10.a + 1;
        O6.a(f6, str, i10, i10, j5, mm2, m6, z5);
        return az2Var;
        E6 e7 = m6.b;
        g7.a = mm3;
        g7.b = d6;
        g7.c = z2;
        g7.j = 2;
        Object objA3 = e7.a(g7);
        if (objA3 != obj) {
            z3 = z2;
            mm = mm3;
            d7 = d6;
            objA2 = objA3;
            iIntValue = ((Number) objA2).intValue();
            Y5.a.getClass();
            iN = Y5.n();
            d8 = m6.i;
            if (d8 == null) {
                i = 0;
            } else if (iN == 0) {
                i = d8.g;
            }
            if (d8 == null) {
                j = 0;
            } else if (iN == 0) {
                j = d8.j;
            }
            long j14 = d7.d;
            g7.a = mm;
            g7.b = d7;
            g7.c = z3;
            g7.e = iIntValue;
            g7.f = i;
            g7.g = j;
            g7.j = 3;
            objA = m6.a(j14, g7);
            if (objA != obj) {
                long j15 = j;
                i2 = iIntValue;
                objA2 = objA;
                j2 = j15;
                zBooleanValue = ((Boolean) objA2).booleanValue();
                long j16 = d7.c;
                long j17 = d7.d;
                g7.a = mm;
                g7.b = d7;
                g7.c = z3;
                g7.e = i2;
                i3 = i;
                g7.f = i3;
                g7.g = j2;
                g7.d = zBooleanValue;
                g7.j = 4;
                j3 = j2;
                objA2 = m6.a(j16, j17, g7);
                if (objA2 != obj) {
                    z4 = zBooleanValue;
                    d9 = d7;
                    j4 = j3;
                    i4 = i2;
                    boolean zBooleanValue5 = ((Boolean) objA2).booleanValue();
                    if (i3 <= i4) {
                    }
                    Ng ng4 = m6.c;
                    g7.a = mm;
                    g7.b = d9;
                    g7.c = z3;
                    g7.g = j4;
                    g7.j = 5;
                    objA2 = ng4.a(g7);
                    if (objA2 != obj) {
                        j5 = j4;
                        d10 = d9;
                        z5 = z3;
                        mm2 = mm;
                        f6 = (F6) objA2;
                        if (f6 != null) {
                            return az2Var;
                        }
                        m6.f.set(true);
                        gd1 gd1Var2 = O6.a;
                        String str2 = d10.k;
                        int i11 = d10.a + 1;
                        O6.a(f6, str2, i11, i11, j5, mm2, m6, z5);
                        return az2Var;
                    }
                }
            }
        }
        return obj;
    }

    public M6(String str, E6 e6, Ng ng, D6 d6, C4111im c4111im) {
        str.getClass();
        e6.getClass();
        ng.getClass();
        d6.getClass();
        this.a = str;
        this.b = e6;
        this.c = ng;
        this.d = c4111im;
        this.e = "M6";
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = AbstractC4211ma.d;
        this.i = d6;
    }

    public final long a() {
        Context context = AbstractC4221mk.a;
        if (context == null) {
            return -1L;
        }
        ConcurrentHashMap concurrentHashMap = Db.b;
        Db dbA = Cb.a(context, "batch_processing_info");
        return dbA.a.getLong(n30.m(this.a, "_last_batch_process"), -1L);
    }

    public final void a(long j) {
        Context context = AbstractC4221mk.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            Cb.a(context, "batch_processing_info").a(n30.m(this.a, "_last_batch_process"), j, false);
        }
    }

    public final void a(boolean z) {
        D6 d6 = this.i;
        if (this.g.get() || d6 == null) {
            return;
        }
        long j = d6.c;
        c91 c91Var = this.j;
        if (c91Var == null || !c91Var.isActive()) {
            this.e.getClass();
            cz czVar = this.h;
            D6 d7 = this.i;
            long jA = a();
            if (jA == -1) {
                a(System.currentTimeMillis());
            }
            this.j = AbstractC4038g4.a(czVar, Math.max(0L, ((jA / 1000) + (d7 != null ? d7.c : 0L)) - (System.currentTimeMillis() / 1000)) * 1000, 1000 * j, new K6(this, z, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, fy fyVar) {
        H6 h6;
        if (fyVar instanceof H6) {
            h6 = (H6) fyVar;
            int i = h6.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h6.d = i - Integer.MIN_VALUE;
            } else {
                h6 = new H6(this, fyVar);
            }
        } else {
            h6 = new H6(this, fyVar);
        }
        Object objB = h6.b;
        int i2 = h6.d;
        if (i2 == 0) {
            wz2.a0(objB);
            E6 e6 = this.b;
            h6.a = j;
            h6.d = 1;
            objB = e6.b(1, h6);
            dz dzVar = dz.a;
            if (objB == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = h6.a;
            wz2.a0(objB);
        }
        List list = (List) objB;
        return Boolean.valueOf(!list.isEmpty() && (System.currentTimeMillis() - ((F2) list.get(0)).c) / 1000 > j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, long j2, fy fyVar) {
        L6 l6;
        long j3;
        if (fyVar instanceof L6) {
            l6 = (L6) fyVar;
            int i = l6.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6.e = i - Integer.MIN_VALUE;
            } else {
                l6 = new L6(this, fyVar);
            }
        } else {
            l6 = new L6(this, fyVar);
        }
        Object objB = l6.c;
        int i2 = l6.e;
        if (i2 == 0) {
            wz2.a0(objB);
            long jCurrentTimeMillis = j + (System.currentTimeMillis() / 1000);
            E6 e6 = this.b;
            l6.a = j2;
            l6.b = jCurrentTimeMillis;
            l6.e = 1;
            objB = e6.b(1, l6);
            dz dzVar = dz.a;
            if (objB == dzVar) {
                return dzVar;
            }
            j3 = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = l6.b;
            j2 = l6.a;
            wz2.a0(objB);
        }
        List list = (List) objB;
        return Boolean.valueOf(!list.isEmpty() && j3 - (((F2) list.get(0)).c / 1000) >= j2);
    }
}
