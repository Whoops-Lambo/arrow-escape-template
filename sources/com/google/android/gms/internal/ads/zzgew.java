package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import defpackage.aj0;
import defpackage.az2;
import defpackage.bp0;
import defpackage.cz;
import defpackage.du;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.ep0;
import defpackage.fy;
import defpackage.kc2;
import defpackage.nk4;
import defpackage.ok4;
import defpackage.pk4;
import defpackage.pp1;
import defpackage.rk4;
import defpackage.s71;
import defpackage.sk4;
import defpackage.tc4;
import defpackage.tk4;
import defpackage.uk4;
import defpackage.vk4;
import defpackage.wk4;
import defpackage.wz2;
import defpackage.xk4;
import defpackage.yk4;
import io.p071bidmachine.internal.n0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgew implements zzgdn {
    public final cz a;
    public final zzgvb b;
    public final pp1 c;
    public final pp1 d;
    public final pp1 e;
    public boolean f;
    public zzgdl g;
    public boolean h;
    public final DataStore i;
    public final zzdyh j;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.google.android.gms.internal.ads.zzgew] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static final Object d(zzgew zzgewVar, fy fyVar) throws Throwable {
        wk4 wk4Var;
        Mutex mutex;
        zzgdp zzgdpVar;
        if (fyVar instanceof wk4) {
            wk4Var = (wk4) fyVar;
            int i = wk4Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                wk4Var.u = i - Integer.MIN_VALUE;
            } else {
                wk4Var = new wk4(zzgewVar, fyVar);
            }
        } else {
            wk4Var = new wk4(zzgewVar, fyVar);
        }
        Object objN = wk4Var.s;
        ?? r3 = wk4Var.u;
        dz dzVar = dz.a;
        try {
            if (r3 == 0) {
                wz2.a0(objN);
                pp1 pp1Var = zzgewVar.e;
                wk4Var.r = pp1Var;
                wk4Var.u = 1;
                if (pp1Var.e(wk4Var) != dzVar) {
                    mutex = pp1Var;
                }
            }
            if (r3 == 1) {
                Mutex mutex2 = wk4Var.r;
                wz2.a0(objN);
                mutex = mutex2;
            } else {
                if (r3 != 2) {
                    if (r3 == 3) {
                        wz2.a0(objN);
                        return objN;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Mutex mutex3 = wk4Var.r;
                wz2.a0(objN);
                r3 = mutex3;
            }
            zzgdpVar = (zzgdp) objN;
            ((pp1) r3).g(null);
            if (zzgdpVar != null || zzgdpVar.E() == 0) {
                return az2.a;
            }
            for (Map.Entry entry : zzgdpVar.F().entrySet()) {
                zzgdl zzgdlVar = (zzgdl) ((zzgdm) entry.getValue()).w();
                Object value = entry.getValue();
                value.getClass();
                zzgdm zzgdmVar = (zzgdm) value;
                zzihn zzihnVarQ = zzgdmVar.Q();
                Long l = zzihnVarQ != null ? (Long) du.i0(zzihnVarQ) : null;
                boolean z = false;
                boolean z2 = zzgdmVar.R() > zzgdmVar.S() && !zzgdmVar.K();
                if (l != null) {
                    if (zzgdmVar.O() - l.longValue() > 5000) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    zzgdlVar.l();
                    ((zzgdm) zzgdlVar.b).a0(true);
                }
                zzgewVar.j.a((zzgdm) zzgdlVar.m());
            }
            wk4Var.r = null;
            wk4Var.u = 3;
            Object objA = zzgewVar.a(wk4Var);
            return objA == dzVar ? dzVar : objA;
            bp0 data = zzgewVar.i.getData();
            wk4Var.r = mutex;
            wk4Var.u = 2;
            objN = ep0.n(data, wk4Var);
            r3 = mutex;
            if (objN != dzVar) {
                zzgdpVar = (zzgdp) objN;
                ((pp1) r3).g(null);
                if (zzgdpVar != null) {
                }
                return az2.a;
            }
        } catch (Throwable th) {
            ((pp1) r3).g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(zzgew zzgewVar, String str, fy fyVar) {
        tk4 tk4Var;
        long jCurrentTimeMillis;
        String str2;
        pp1 pp1Var;
        if (fyVar instanceof tk4) {
            tk4Var = (tk4) fyVar;
            int i = tk4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                tk4Var.v = i - Integer.MIN_VALUE;
            } else {
                tk4Var = new tk4(zzgewVar, fyVar);
            }
        } else {
            tk4Var = new tk4(zzgewVar, fyVar);
        }
        Object obj = tk4Var.t;
        int i2 = tk4Var.v;
        if (i2 == 0) {
            wz2.a0(obj);
            pp1 pp1Var2 = zzgewVar.c;
            jCurrentTimeMillis = System.currentTimeMillis();
            tk4Var.w = str;
            tk4Var.r = pp1Var2;
            tk4Var.s = jCurrentTimeMillis;
            tk4Var.v = 1;
            Object objE = pp1Var2.e(tk4Var);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
            str2 = str;
            pp1Var = pp1Var2;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jCurrentTimeMillis = tk4Var.s;
            pp1Var = tk4Var.r;
            str2 = tk4Var.w;
            wz2.a0(obj);
        }
        try {
            boolean z = zzgewVar.f;
            az2 az2Var = az2.a;
            if (z) {
                return az2Var;
            }
            zzgewVar.f = true;
            zzgdl zzgdlVar = (zzgdl) zzgdm.V().w();
            zzgewVar.g = zzgdlVar;
            zzgdlVar.l();
            ((zzgdm) zzgdlVar.b).W(str2);
            zzgdlVar.l();
            ((zzgdm) zzgdlVar.b).c0(jCurrentTimeMillis);
            return az2Var;
        } finally {
            pp1Var.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0080 A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #1 {all -> 0x00a8, blocks: (B:34:0x007c, B:36:0x0080, B:44:0x00a2, B:45:0x00a7), top: B:53:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[Catch: all -> 0x00a8, TRY_ENTER, TryCatch #1 {all -> 0x00a8, blocks: (B:34:0x007c, B:36:0x0080, B:44:0x00a2, B:45:0x00a7), top: B:53:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(zzgew zzgewVar, fy fyVar) throws Throwable {
        rk4 rk4Var;
        pp1 pp1Var;
        pp1 pp1Var2;
        long j;
        zzgdl zzgdlVar;
        Object objC;
        if (fyVar instanceof rk4) {
            rk4Var = (rk4) fyVar;
            int i = rk4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                rk4Var.v = i - Integer.MIN_VALUE;
            } else {
                rk4Var = new rk4(zzgewVar, fyVar);
            }
        } else {
            rk4Var = new rk4(zzgewVar, fyVar);
        }
        Object obj = rk4Var.t;
        int i2 = rk4Var.v;
        Object obj2 = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                pp1Var = zzgewVar.d;
                rk4Var.r = pp1Var;
                rk4Var.v = 1;
                if (pp1Var.e(rk4Var) != obj2) {
                }
                return obj2;
            }
            if (i2 == 1) {
                pp1Var = rk4Var.r;
                wz2.a0(obj);
            } else {
                if (i2 == 2) {
                    j = rk4Var.s;
                    pp1Var2 = rk4Var.r;
                    wz2.a0(obj);
                    try {
                        zzgdlVar = zzgewVar.g;
                        if (zzgdlVar != null) {
                            s71.D("adQualityDataBuilder");
                            throw null;
                        }
                        zzgdlVar.l();
                        ((zzgdm) zzgdlVar.b).f0(j);
                        pp1Var2.g(null);
                        rk4Var.r = null;
                        rk4Var.v = 3;
                        if (zzgewVar.b(j, rk4Var) != obj2) {
                        }
                        return obj2;
                    } catch (Throwable th) {
                        pp1Var2.g(null);
                        throw th;
                    }
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        wz2.a0(obj);
                        return obj;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
            rk4Var.v = 4;
            objC = zzgewVar.c(rk4Var);
            if (objC != obj2) {
                return obj2;
            }
            return objC;
            if (zzgewVar.h) {
                az2 az2Var = az2.a;
                pp1Var.g(null);
                return az2Var;
            }
            zzgewVar.h = true;
            pp1Var.g(null);
            pp1Var2 = zzgewVar.c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            rk4Var.r = pp1Var2;
            rk4Var.s = jCurrentTimeMillis;
            rk4Var.v = 2;
            if (pp1Var2.e(rk4Var) != obj2) {
                j = jCurrentTimeMillis;
                zzgdlVar = zzgewVar.g;
                if (zzgdlVar != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                zzgdlVar.l();
                ((zzgdm) zzgdlVar.b).f0(j);
                pp1Var2.g(null);
                rk4Var.r = null;
                rk4Var.v = 3;
                if (zzgewVar.b(j, rk4Var) != obj2) {
                    rk4Var.v = 4;
                    objC = zzgewVar.c(rk4Var);
                    if (objC != obj2) {
                        return objC;
                    }
                }
            }
            return obj2;
        } catch (Throwable th2) {
            pp1Var.g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00df A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x010f A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0123 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0127 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:64:0x012f A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x013d A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0141 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0145 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x006e, B:30:0x0074, B:32:0x007e, B:34:0x0082, B:36:0x00a4, B:38:0x00b4, B:40:0x00b8, B:41:0x00cc, B:42:0x00cf, B:45:0x00d3, B:46:0x00d6, B:47:0x00d7, B:48:0x00da, B:49:0x00db, B:51:0x00df, B:53:0x00e9, B:55:0x00ed, B:57:0x010f, B:58:0x0123, B:59:0x0126, B:60:0x0127, B:61:0x012a, B:62:0x012b, B:64:0x012f, B:67:0x013d, B:68:0x0140, B:69:0x0141, B:70:0x0144, B:71:0x0145, B:72:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(zzgew zzgewVar, fy fyVar) {
        yk4 yk4Var;
        pp1 pp1Var;
        pp1 pp1Var2;
        long j;
        zzgdl zzgdlVar;
        zzgdl zzgdlVar2;
        zzgdl zzgdlVar3;
        zzgdl zzgdlVar4;
        long jLongValue;
        zzgdl zzgdlVar5;
        zzgdl zzgdlVar6;
        long jLongValue2;
        zzgdl zzgdlVar7;
        zzgdl zzgdlVar8;
        if (fyVar instanceof yk4) {
            yk4Var = (yk4) fyVar;
            int i = yk4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                yk4Var.v = i - Integer.MIN_VALUE;
            } else {
                yk4Var = new yk4(zzgewVar, fyVar);
            }
        } else {
            yk4Var = new yk4(zzgewVar, fyVar);
        }
        Object obj = yk4Var.t;
        int i2 = yk4Var.v;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                pp1Var = zzgewVar.d;
                yk4Var.r = pp1Var;
                yk4Var.v = 1;
                if (pp1Var.e(yk4Var) != dzVar) {
                }
                return dzVar;
            }
            if (i2 == 1) {
                pp1Var = yk4Var.r;
                wz2.a0(obj);
            } else {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = yk4Var.s;
                pp1Var2 = yk4Var.r;
                wz2.a0(obj);
            }
            try {
                zzgdlVar = zzgewVar.g;
                if (zzgdlVar != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                if (((zzgdm) zzgdlVar.b).U() > 0) {
                    zzgdlVar6 = zzgewVar.g;
                    if (zzgdlVar6 != null) {
                        s71.D("adQualityDataBuilder");
                        throw null;
                    }
                    List listUnmodifiableList = Collections.unmodifiableList(((zzgdm) zzgdlVar6.b).T());
                    listUnmodifiableList.getClass();
                    Object objH0 = du.h0(listUnmodifiableList);
                    objH0.getClass();
                    jLongValue2 = j - ((Number) objH0).longValue();
                    zzgdlVar7 = zzgewVar.g;
                    if (zzgdlVar7 != null) {
                        s71.D("adQualityDataBuilder");
                        throw null;
                    }
                    zzgdlVar7.l();
                    ((zzgdm) zzgdlVar7.b).G();
                    if (jLongValue2 < 5000) {
                        zzgdlVar8 = zzgewVar.g;
                        if (zzgdlVar8 != null) {
                            s71.D("adQualityDataBuilder");
                            throw null;
                        }
                        int iJ = ((zzgdm) zzgdlVar8.b).J() + 1;
                        zzgdlVar8.l();
                        ((zzgdm) zzgdlVar8.b).Y(iJ);
                    }
                }
                zzgdlVar2 = zzgewVar.g;
                if (zzgdlVar2 != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                if (((zzgdm) zzgdlVar2.b).R() > 0) {
                    zzgdlVar4 = zzgewVar.g;
                    if (zzgdlVar4 != null) {
                        s71.D("adQualityDataBuilder");
                        throw null;
                    }
                    List listUnmodifiableList2 = Collections.unmodifiableList(((zzgdm) zzgdlVar4.b).Q());
                    listUnmodifiableList2.getClass();
                    Object objH1 = du.h0(listUnmodifiableList2);
                    objH1.getClass();
                    jLongValue = j - ((Number) objH1).longValue();
                    zzgdlVar5 = zzgewVar.g;
                    if (zzgdlVar5 != null) {
                        s71.D("adQualityDataBuilder");
                        throw null;
                    }
                    long jM = ((zzgdm) zzgdlVar5.b).M() + jLongValue;
                    zzgdlVar5.l();
                    ((zzgdm) zzgdlVar5.b).b0(jM);
                }
                zzgdlVar3 = zzgewVar.g;
                if (zzgdlVar3 != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                zzgdlVar3.l();
                ((zzgdm) zzgdlVar3.b).E(j);
                pp1Var2.g(null);
                return az2Var;
            } catch (Throwable th) {
                pp1Var2.g(null);
                throw th;
            }
            if (!zzgewVar.h) {
                pp1Var.g(null);
                return az2Var;
            }
            zzgewVar.h = false;
            pp1Var.g(null);
            pp1 pp1Var3 = zzgewVar.c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            yk4Var.r = pp1Var3;
            yk4Var.s = jCurrentTimeMillis;
            yk4Var.v = 2;
            if (pp1Var3.e(yk4Var) != dzVar) {
                pp1Var2 = pp1Var3;
                j = jCurrentTimeMillis;
                zzgdlVar = zzgewVar.g;
                if (zzgdlVar != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                if (((zzgdm) zzgdlVar.b).U() > 0) {
                    zzgdlVar6 = zzgewVar.g;
                    if (zzgdlVar6 != null) {
                        s71.D("adQualityDataBuilder");
                        throw null;
                    }
                    List listUnmodifiableList3 = Collections.unmodifiableList(((zzgdm) zzgdlVar6.b).T());
                    listUnmodifiableList3.getClass();
                    Object objH2 = du.h0(listUnmodifiableList3);
                    objH2.getClass();
                    jLongValue2 = j - ((Number) objH2).longValue();
                    zzgdlVar7 = zzgewVar.g;
                    if (zzgdlVar7 != null) {
                        s71.D("adQualityDataBuilder");
                        throw null;
                    }
                    zzgdlVar7.l();
                    ((zzgdm) zzgdlVar7.b).G();
                    if (jLongValue2 < 5000) {
                        zzgdlVar8 = zzgewVar.g;
                        if (zzgdlVar8 != null) {
                            s71.D("adQualityDataBuilder");
                            throw null;
                        }
                        int iJ2 = ((zzgdm) zzgdlVar8.b).J() + 1;
                        zzgdlVar8.l();
                        ((zzgdm) zzgdlVar8.b).Y(iJ2);
                    }
                }
                zzgdlVar2 = zzgewVar.g;
                if (zzgdlVar2 != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                if (((zzgdm) zzgdlVar2.b).R() > 0) {
                    zzgdlVar4 = zzgewVar.g;
                    if (zzgdlVar4 != null) {
                        s71.D("adQualityDataBuilder");
                        throw null;
                    }
                    List listUnmodifiableList4 = Collections.unmodifiableList(((zzgdm) zzgdlVar4.b).Q());
                    listUnmodifiableList4.getClass();
                    Object objH3 = du.h0(listUnmodifiableList4);
                    objH3.getClass();
                    jLongValue = j - ((Number) objH3).longValue();
                    zzgdlVar5 = zzgewVar.g;
                    if (zzgdlVar5 != null) {
                        s71.D("adQualityDataBuilder");
                        throw null;
                    }
                    long jM2 = ((zzgdm) zzgdlVar5.b).M() + jLongValue;
                    zzgdlVar5.l();
                    ((zzgdm) zzgdlVar5.b).b0(jM2);
                }
                zzgdlVar3 = zzgewVar.g;
                if (zzgdlVar3 != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                zzgdlVar3.l();
                ((zzgdm) zzgdlVar3.b).E(j);
                pp1Var2.g(null);
                return az2Var;
            }
            return dzVar;
        } catch (Throwable th2) {
            pp1Var.g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: all -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:55:0x00f4, B:56:0x00f7, B:57:0x00f8, B:58:0x00fb, B:59:0x00fc, B:60:0x00ff, B:61:0x0100, B:62:0x0103), top: B:69:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009b A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:55:0x00f4, B:56:0x00f7, B:57:0x00f8, B:58:0x00fb, B:59:0x00fc, B:60:0x00ff, B:61:0x0100, B:62:0x0103), top: B:69:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:55:0x00f4, B:56:0x00f7, B:57:0x00f8, B:58:0x00fb, B:59:0x00fc, B:60:0x00ff, B:61:0x0100, B:62:0x0103), top: B:69:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:55:0x00f4, B:56:0x00f7, B:57:0x00f8, B:58:0x00fb, B:59:0x00fc, B:60:0x00ff, B:61:0x0100, B:62:0x0103), top: B:69:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4 A[Catch: all -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:55:0x00f4, B:56:0x00f7, B:57:0x00f8, B:58:0x00fb, B:59:0x00fc, B:60:0x00ff, B:61:0x0100, B:62:0x0103), top: B:69:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:55:0x00f4, B:56:0x00f7, B:57:0x00f8, B:58:0x00fb, B:59:0x00fc, B:60:0x00ff, B:61:0x0100, B:62:0x0103), top: B:69:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fc A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:55:0x00f4, B:56:0x00f7, B:57:0x00f8, B:58:0x00fb, B:59:0x00fc, B:60:0x00ff, B:61:0x0100, B:62:0x0103), top: B:69:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0100 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:55:0x00f4, B:56:0x00f7, B:57:0x00f8, B:58:0x00fb, B:59:0x00fc, B:60:0x00ff, B:61:0x0100, B:62:0x0103), top: B:69:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object h(zzgew zzgewVar, fy fyVar) throws Throwable {
        vk4 vk4Var;
        Object obj;
        long j;
        Object obj2;
        zzgdl zzgdlVar;
        long jN;
        zzgdl zzgdlVar2;
        zzgdl zzgdlVar3;
        zzgdl zzgdlVar4;
        zzgdm zzgdmVar;
        zzgdm zzgdmVar2;
        Object objK;
        pp1 pp1Var = zzgewVar.c;
        if (fyVar instanceof vk4) {
            vk4Var = (vk4) fyVar;
            int i = vk4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                vk4Var.v = i - Integer.MIN_VALUE;
            } else {
                vk4Var = new vk4(zzgewVar, fyVar);
            }
        } else {
            vk4Var = new vk4(zzgewVar, fyVar);
        }
        Object obj3 = vk4Var.t;
        int i2 = vk4Var.v;
        az2 az2Var = az2.a;
        Object obj4 = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj3);
                vk4Var.r = pp1Var;
                vk4Var.v = 1;
                if (pp1Var.e(vk4Var) != obj4) {
                    obj = pp1Var;
                }
                return obj4;
            }
            if (i2 == 1) {
                Mutex mutex = (Mutex) vk4Var.r;
                wz2.a0(obj3);
                obj = mutex;
            } else {
                if (i2 == 2) {
                    j = vk4Var.s;
                    Mutex mutex2 = (Mutex) vk4Var.r;
                    wz2.a0(obj3);
                    obj2 = mutex2;
                    try {
                        zzgdlVar = zzgewVar.g;
                        if (zzgdlVar != null) {
                            s71.D("adQualityDataBuilder");
                            throw null;
                        }
                        jN = j - ((zzgdm) zzgdlVar.b).N();
                        zzgdlVar2 = zzgewVar.g;
                        if (zzgdlVar2 != null) {
                            s71.D("adQualityDataBuilder");
                            throw null;
                        }
                        long jM = jN - ((zzgdm) zzgdlVar2.b).M();
                        zzgdlVar.l();
                        ((zzgdm) zzgdlVar.b).X(jM);
                        zzgdlVar3 = zzgewVar.g;
                        if (zzgdlVar3 != null) {
                            s71.D("adQualityDataBuilder");
                            throw null;
                        }
                        zzgdlVar3.l();
                        ((zzgdm) zzgdlVar3.b).e0(j);
                        zzgdlVar4 = zzgewVar.g;
                        if (zzgdlVar4 != null) {
                            s71.D("adQualityDataBuilder");
                            throw null;
                        }
                        zzgdmVar = (zzgdm) zzgdlVar4.m();
                        ((pp1) obj2).g(null);
                        vk4Var.r = zzgdmVar;
                        vk4Var.v = 3;
                        if (zzgewVar.c(vk4Var) != obj4) {
                            zzgdmVar2 = zzgdmVar;
                        }
                        return obj4;
                    } catch (Throwable th) {
                        ((pp1) obj2).g(null);
                        throw th;
                    }
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        wz2.a0(obj3);
                        return obj3;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zzgdmVar2 = (zzgdm) vk4Var.r;
                wz2.a0(obj3);
            }
            if (zzgewVar.j.a(zzgdmVar2)) {
                return az2Var;
            }
            String strH = zzgdmVar2.H();
            strH.getClass();
            vk4Var.r = null;
            vk4Var.v = 4;
            objK = zzgewVar.k(strH, vk4Var);
            if (objK != obj4) {
                return obj4;
            }
            return objK;
            if (!zzgewVar.f) {
                ((pp1) obj).g(null);
                return az2Var;
            }
            zzgewVar.f = false;
            ((pp1) obj).g(null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            vk4Var.r = pp1Var;
            vk4Var.s = jCurrentTimeMillis;
            vk4Var.v = 2;
            if (pp1Var.e(vk4Var) != obj4) {
                j = jCurrentTimeMillis;
                obj2 = pp1Var;
                zzgdlVar = zzgewVar.g;
                if (zzgdlVar != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                jN = j - ((zzgdm) zzgdlVar.b).N();
                zzgdlVar2 = zzgewVar.g;
                if (zzgdlVar2 != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                long jM2 = jN - ((zzgdm) zzgdlVar2.b).M();
                zzgdlVar.l();
                ((zzgdm) zzgdlVar.b).X(jM2);
                zzgdlVar3 = zzgewVar.g;
                if (zzgdlVar3 != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                zzgdlVar3.l();
                ((zzgdm) zzgdlVar3.b).e0(j);
                zzgdlVar4 = zzgewVar.g;
                if (zzgdlVar4 != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                zzgdmVar = (zzgdm) zzgdlVar4.m();
                ((pp1) obj2).g(null);
                vk4Var.r = zzgdmVar;
                vk4Var.v = 3;
                if (zzgewVar.c(vk4Var) != obj4) {
                    zzgdmVar2 = zzgdmVar;
                    if (zzgewVar.j.a(zzgdmVar2)) {
                        return az2Var;
                    }
                    String strH2 = zzgdmVar2.H();
                    strH2.getClass();
                    vk4Var.r = null;
                    vk4Var.v = 4;
                    objK = zzgewVar.k(strH2, vk4Var);
                    if (objK != obj4) {
                        return objK;
                    }
                }
            }
            return obj4;
        } catch (Throwable th2) {
            ((pp1) obj).g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: all -> 0x0100, TRY_ENTER, TryCatch #0 {all -> 0x0100, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:44:0x00ce, B:57:0x0102, B:58:0x0105, B:59:0x0106, B:60:0x0109, B:61:0x010a, B:62:0x010d, B:63:0x010e, B:64:0x0111, B:65:0x0112, B:66:0x0115), top: B:73:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009b A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:44:0x00ce, B:57:0x0102, B:58:0x0105, B:59:0x0106, B:60:0x0109, B:61:0x010a, B:62:0x010d, B:63:0x010e, B:64:0x0111, B:65:0x0112, B:66:0x0115), top: B:73:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:44:0x00ce, B:57:0x0102, B:58:0x0105, B:59:0x0106, B:60:0x0109, B:61:0x010a, B:62:0x010d, B:63:0x010e, B:64:0x0111, B:65:0x0112, B:66:0x0115), top: B:73:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:44:0x00ce, B:57:0x0102, B:58:0x0105, B:59:0x0106, B:60:0x0109, B:61:0x010a, B:62:0x010d, B:63:0x010e, B:64:0x0111, B:65:0x0112, B:66:0x0115), top: B:73:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce A[Catch: all -> 0x0100, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:44:0x00ce, B:57:0x0102, B:58:0x0105, B:59:0x0106, B:60:0x0109, B:61:0x010a, B:62:0x010d, B:63:0x010e, B:64:0x0111, B:65:0x0112, B:66:0x0115), top: B:73:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0102 A[Catch: all -> 0x0100, TRY_ENTER, TryCatch #0 {all -> 0x0100, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:44:0x00ce, B:57:0x0102, B:58:0x0105, B:59:0x0106, B:60:0x0109, B:61:0x010a, B:62:0x010d, B:63:0x010e, B:64:0x0111, B:65:0x0112, B:66:0x0115), top: B:73:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:44:0x00ce, B:57:0x0102, B:58:0x0105, B:59:0x0106, B:60:0x0109, B:61:0x010a, B:62:0x010d, B:63:0x010e, B:64:0x0111, B:65:0x0112, B:66:0x0115), top: B:73:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010a A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:44:0x00ce, B:57:0x0102, B:58:0x0105, B:59:0x0106, B:60:0x0109, B:61:0x010a, B:62:0x010d, B:63:0x010e, B:64:0x0111, B:65:0x0112, B:66:0x0115), top: B:73:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x010e A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:44:0x00ce, B:57:0x0102, B:58:0x0105, B:59:0x0106, B:60:0x0109, B:61:0x010a, B:62:0x010d, B:63:0x010e, B:64:0x0111, B:65:0x0112, B:66:0x0115), top: B:73:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0112 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:33:0x0087, B:36:0x008d, B:38:0x009b, B:40:0x00b2, B:42:0x00c0, B:44:0x00ce, B:57:0x0102, B:58:0x0105, B:59:0x0106, B:60:0x0109, B:61:0x010a, B:62:0x010d, B:63:0x010e, B:64:0x0111, B:65:0x0112, B:66:0x0115), top: B:73:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object i(zzgew zzgewVar, fy fyVar) throws Throwable {
        xk4 xk4Var;
        Object obj;
        long j;
        Object obj2;
        zzgdl zzgdlVar;
        long jN;
        zzgdl zzgdlVar2;
        zzgdl zzgdlVar3;
        zzgdl zzgdlVar4;
        zzgdl zzgdlVar5;
        zzgdm zzgdmVar;
        zzgdm zzgdmVar2;
        Object objK;
        pp1 pp1Var = zzgewVar.c;
        if (fyVar instanceof xk4) {
            xk4Var = (xk4) fyVar;
            int i = xk4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                xk4Var.v = i - Integer.MIN_VALUE;
            } else {
                xk4Var = new xk4(zzgewVar, fyVar);
            }
        } else {
            xk4Var = new xk4(zzgewVar, fyVar);
        }
        Object obj3 = xk4Var.t;
        int i2 = xk4Var.v;
        az2 az2Var = az2.a;
        Object obj4 = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj3);
                xk4Var.r = pp1Var;
                xk4Var.v = 1;
                if (pp1Var.e(xk4Var) != obj4) {
                    obj = pp1Var;
                }
                return obj4;
            }
            if (i2 == 1) {
                Mutex mutex = (Mutex) xk4Var.r;
                wz2.a0(obj3);
                obj = mutex;
            } else {
                if (i2 == 2) {
                    j = xk4Var.s;
                    Mutex mutex2 = (Mutex) xk4Var.r;
                    wz2.a0(obj3);
                    obj2 = mutex2;
                    try {
                        zzgdlVar = zzgewVar.g;
                        if (zzgdlVar != null) {
                            s71.D("adQualityDataBuilder");
                            throw null;
                        }
                        jN = j - ((zzgdm) zzgdlVar.b).N();
                        zzgdlVar2 = zzgewVar.g;
                        if (zzgdlVar2 != null) {
                            s71.D("adQualityDataBuilder");
                            throw null;
                        }
                        long jM = jN - ((zzgdm) zzgdlVar2.b).M();
                        zzgdlVar.l();
                        ((zzgdm) zzgdlVar.b).X(jM);
                        zzgdlVar3 = zzgewVar.g;
                        if (zzgdlVar3 != null) {
                            s71.D("adQualityDataBuilder");
                            throw null;
                        }
                        zzgdlVar3.l();
                        ((zzgdm) zzgdlVar3.b).d0(j);
                        zzgdlVar4 = zzgewVar.g;
                        if (zzgdlVar4 != null) {
                            s71.D("adQualityDataBuilder");
                            throw null;
                        }
                        zzgdlVar4.l();
                        ((zzgdm) zzgdlVar4.b).Z();
                        zzgdlVar5 = zzgewVar.g;
                        if (zzgdlVar5 != null) {
                            s71.D("adQualityDataBuilder");
                            throw null;
                        }
                        zzgdmVar = (zzgdm) zzgdlVar5.m();
                        ((pp1) obj2).g(null);
                        xk4Var.r = zzgdmVar;
                        xk4Var.v = 3;
                        if (zzgewVar.c(xk4Var) != obj4) {
                            zzgdmVar2 = zzgdmVar;
                        }
                        return obj4;
                    } catch (Throwable th) {
                        ((pp1) obj2).g(null);
                        throw th;
                    }
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        wz2.a0(obj3);
                        return obj3;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zzgdmVar2 = (zzgdm) xk4Var.r;
                wz2.a0(obj3);
            }
            if (zzgewVar.j.a(zzgdmVar2)) {
                return az2Var;
            }
            String strH = zzgdmVar2.H();
            strH.getClass();
            xk4Var.r = null;
            xk4Var.v = 4;
            objK = zzgewVar.k(strH, xk4Var);
            if (objK != obj4) {
                return obj4;
            }
            return objK;
            if (!zzgewVar.f) {
                ((pp1) obj).g(null);
                return az2Var;
            }
            zzgewVar.f = false;
            ((pp1) obj).g(null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            xk4Var.r = pp1Var;
            xk4Var.s = jCurrentTimeMillis;
            xk4Var.v = 2;
            if (pp1Var.e(xk4Var) != obj4) {
                j = jCurrentTimeMillis;
                obj2 = pp1Var;
                zzgdlVar = zzgewVar.g;
                if (zzgdlVar != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                jN = j - ((zzgdm) zzgdlVar.b).N();
                zzgdlVar2 = zzgewVar.g;
                if (zzgdlVar2 != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                long jM2 = jN - ((zzgdm) zzgdlVar2.b).M();
                zzgdlVar.l();
                ((zzgdm) zzgdlVar.b).X(jM2);
                zzgdlVar3 = zzgewVar.g;
                if (zzgdlVar3 != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                zzgdlVar3.l();
                ((zzgdm) zzgdlVar3.b).d0(j);
                zzgdlVar4 = zzgewVar.g;
                if (zzgdlVar4 != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                zzgdlVar4.l();
                ((zzgdm) zzgdlVar4.b).Z();
                zzgdlVar5 = zzgewVar.g;
                if (zzgdlVar5 != null) {
                    s71.D("adQualityDataBuilder");
                    throw null;
                }
                zzgdmVar = (zzgdm) zzgdlVar5.m();
                ((pp1) obj2).g(null);
                xk4Var.r = zzgdmVar;
                xk4Var.v = 3;
                if (zzgewVar.c(xk4Var) != obj4) {
                    zzgdmVar2 = zzgdmVar;
                    if (zzgewVar.j.a(zzgdmVar2)) {
                        return az2Var;
                    }
                    String strH2 = zzgdmVar2.H();
                    strH2.getClass();
                    xk4Var.r = null;
                    xk4Var.v = 4;
                    objK = zzgewVar.k(strH2, xk4Var);
                    if (objK != obj4) {
                        return objK;
                    }
                }
            }
            return obj4;
        } catch (Throwable th2) {
            ((pp1) obj).g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(zzgew zzgewVar, fy fyVar) {
        uk4 uk4Var;
        pp1 pp1Var;
        long j;
        if (fyVar instanceof uk4) {
            uk4Var = (uk4) fyVar;
            int i = uk4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                uk4Var.v = i - Integer.MIN_VALUE;
            } else {
                uk4Var = new uk4(zzgewVar, fyVar);
            }
        } else {
            uk4Var = new uk4(zzgewVar, fyVar);
        }
        Object obj = uk4Var.t;
        int i2 = uk4Var.v;
        if (i2 == 0) {
            wz2.a0(obj);
            pp1 pp1Var2 = zzgewVar.c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            uk4Var.s = pp1Var2;
            uk4Var.r = jCurrentTimeMillis;
            uk4Var.v = 1;
            Object objE = pp1Var2.e(uk4Var);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
            pp1Var = pp1Var2;
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = uk4Var.r;
            pp1Var = uk4Var.s;
            wz2.a0(obj);
        }
        try {
            zzgdl zzgdlVar = zzgewVar.g;
            if (zzgdlVar == null) {
                s71.D("adQualityDataBuilder");
                throw null;
            }
            zzgdlVar.l();
            ((zzgdm) zzgdlVar.b).F(j);
            pp1Var.g(null);
            return az2.a;
        } catch (Throwable th) {
            pp1Var.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) throws Throwable {
        pk4 pk4Var;
        pp1 pp1Var;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        if (fyVar instanceof pk4) {
            pk4Var = (pk4) fyVar;
            int i = pk4Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                pk4Var.u = i - Integer.MIN_VALUE;
            } else {
                pk4Var = new pk4(this, fyVar);
            }
        } else {
            pk4Var = new pk4(this, fyVar);
        }
        Object obj = pk4Var.s;
        int i2 = pk4Var.u;
        int i3 = 1;
        int i4 = 2;
        dy dyVar = null;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                pp1Var = this.e;
                pk4Var.r = pp1Var;
                pk4Var.u = 1;
                if (pp1Var.e(pk4Var) != dzVar) {
                }
                mutex = pp1Var;
                return dzVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex2 = pk4Var.r;
                try {
                    wz2.a0(obj);
                    mutex2 = mutex2;
                    ((pp1) mutex2).g(null);
                    return az2.a;
                } catch (Throwable th2) {
                    th = th2;
                    ((pp1) mutex2).g(null);
                    throw th;
                }
            }
            Mutex mutex3 = pk4Var.r;
            wz2.a0(obj);
            mutex = mutex3;
            mutex = pp1Var;
            DataStore dataStore = this.i;
            n0 n0Var = new n0(i4, dyVar, i3);
            pk4Var.r = mutex;
            pk4Var.u = 2;
            Object objA = dataStore.a(n0Var, pk4Var);
            if (objA != dzVar) {
                Mutex mutex4 = mutex;
                obj = objA;
                mutex2 = mutex4;
                ((pp1) mutex2).g(null);
                return az2.a;
            }
            mutex = pp1Var;
            return dzVar;
        } catch (Throwable th3) {
            Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            ((pp1) mutex2).g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, fy fyVar) {
        ok4 ok4Var;
        pp1 pp1Var;
        if (fyVar instanceof ok4) {
            ok4Var = (ok4) fyVar;
            int i = ok4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ok4Var.v = i - Integer.MIN_VALUE;
            } else {
                ok4Var = new ok4(this, fyVar);
            }
        } else {
            ok4Var = new ok4(this, fyVar);
        }
        Object obj = ok4Var.t;
        int i2 = ok4Var.v;
        if (i2 == 0) {
            wz2.a0(obj);
            pp1 pp1Var2 = this.c;
            ok4Var.s = pp1Var2;
            ok4Var.r = j;
            ok4Var.v = 1;
            Object objE = pp1Var2.e(ok4Var);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
            pp1Var = pp1Var2;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = ok4Var.r;
            pp1Var = ok4Var.s;
            wz2.a0(obj);
        }
        try {
            zzgdl zzgdlVar = this.g;
            if (zzgdlVar == null) {
                s71.D("adQualityDataBuilder");
                throw null;
            }
            long jN = j - ((zzgdm) zzgdlVar.b).N();
            zzgdl zzgdlVar2 = this.g;
            if (zzgdlVar2 == null) {
                s71.D("adQualityDataBuilder");
                throw null;
            }
            long jM = jN - ((zzgdm) zzgdlVar2.b).M();
            zzgdlVar.l();
            ((zzgdm) zzgdlVar.b).X(jM);
            pp1Var.g(null);
            return az2.a;
        } catch (Throwable th) {
            pp1Var.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(fy fyVar) throws Throwable {
        sk4 sk4Var;
        pp1 pp1Var;
        Mutex mutex;
        pp1 pp1Var2;
        zzgdm zzgdmVar;
        Throwable th;
        Mutex mutex2;
        if (fyVar instanceof sk4) {
            sk4Var = (sk4) fyVar;
            int i = sk4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                sk4Var.v = i - Integer.MIN_VALUE;
            } else {
                sk4Var = new sk4(this, fyVar);
            }
        } else {
            sk4Var = new sk4(this, fyVar);
        }
        Object objA = sk4Var.t;
        int i2 = sk4Var.v;
        dy dyVar = null;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(objA);
                pp1Var = this.c;
                sk4Var.r = pp1Var;
                sk4Var.v = 1;
                if (pp1Var.e(sk4Var) != dzVar) {
                }
                mutex = pp1Var;
                return dzVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutex2 = (Mutex) sk4Var.r;
                    try {
                        wz2.a0(objA);
                        ((pp1) mutex2).g(null);
                        return az2.a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((pp1) mutex2).g(null);
                        throw th;
                    }
                }
                pp1Var2 = sk4Var.s;
                zzgdmVar = (zzgdm) sk4Var.r;
                wz2.a0(objA);
                try {
                    DataStore dataStore = this.i;
                    io.p071bidmachine.rendering.internal.repository.a aVar = new io.p071bidmachine.rendering.internal.repository.a(zzgdmVar, dyVar, 7);
                    sk4Var.r = pp1Var2;
                    sk4Var.s = null;
                    sk4Var.v = 3;
                    objA = dataStore.a(aVar, sk4Var);
                    if (objA != dzVar) {
                        mutex2 = pp1Var2;
                        ((pp1) mutex2).g(null);
                        return az2.a;
                    }
                    mutex = pp1Var;
                    return dzVar;
                } catch (Throwable th3) {
                    th = th3;
                    mutex2 = pp1Var2;
                    ((pp1) mutex2).g(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) sk4Var.r;
            wz2.a0(objA);
            mutex = mutex3;
            mutex = pp1Var;
            zzgdl zzgdlVar = this.g;
            if (zzgdlVar == null) {
                s71.D("adQualityDataBuilder");
                throw null;
            }
            zzgdm zzgdmVar2 = (zzgdm) zzgdlVar.m();
            ((pp1) mutex).g(null);
            sk4Var.r = zzgdmVar2;
            pp1Var2 = this.e;
            sk4Var.s = pp1Var2;
            sk4Var.v = 2;
            if (pp1Var2.e(sk4Var) != dzVar) {
                zzgdmVar = zzgdmVar2;
                DataStore dataStore2 = this.i;
                io.p071bidmachine.rendering.internal.repository.a aVar2 = new io.p071bidmachine.rendering.internal.repository.a(zzgdmVar, dyVar, 7);
                sk4Var.r = pp1Var2;
                sk4Var.s = null;
                sk4Var.v = 3;
                objA = dataStore2.a(aVar2, sk4Var);
                if (objA != dzVar) {
                    mutex2 = pp1Var2;
                    ((pp1) mutex2).g(null);
                    return az2.a;
                }
            }
            mutex = pp1Var;
            return dzVar;
        } catch (Throwable th4) {
            ((pp1) mutex).g(null);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, fy fyVar) throws Throwable {
        nk4 nk4Var;
        String str2;
        pp1 pp1Var;
        Throwable th;
        Mutex mutex;
        if (fyVar instanceof nk4) {
            nk4Var = (nk4) fyVar;
            int i = nk4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                nk4Var.v = i - Integer.MIN_VALUE;
            } else {
                nk4Var = new nk4(this, fyVar);
            }
        } else {
            nk4Var = new nk4(this, fyVar);
        }
        Object objA = nk4Var.t;
        int i2 = nk4Var.v;
        dy dyVar = null;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(objA);
                nk4Var.r = str;
                pp1 pp1Var2 = this.e;
                nk4Var.s = pp1Var2;
                nk4Var.v = 1;
                if (pp1Var2.e(nk4Var) != dzVar) {
                    str2 = str;
                    pp1Var = pp1Var2;
                }
                return dzVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex = (Mutex) nk4Var.r;
                try {
                    wz2.a0(objA);
                    ((pp1) mutex).g(null);
                    return az2.a;
                } catch (Throwable th2) {
                    th = th2;
                    ((pp1) mutex).g(null);
                    throw th;
                }
            }
            pp1Var = nk4Var.s;
            str2 = (String) nk4Var.r;
            wz2.a0(objA);
            DataStore dataStore = this.i;
            io.p071bidmachine.rendering.internal.repository.a aVar = new io.p071bidmachine.rendering.internal.repository.a(str2, dyVar, 6);
            nk4Var.r = pp1Var;
            nk4Var.s = null;
            nk4Var.v = 2;
            objA = dataStore.a(aVar, nk4Var);
            if (objA != dzVar) {
                mutex = pp1Var;
                ((pp1) mutex).g(null);
                return az2.a;
            }
            return dzVar;
        } catch (Throwable th3) {
            pp1 pp1Var3 = pp1Var;
            th = th3;
            mutex = pp1Var3;
            ((pp1) mutex).g(null);
            throw th;
        }
    }

    public zzgew(DataStore dataStore, tc4 tc4Var, zzdyh zzdyhVar, zzgdv zzgdvVar) {
        dataStore.getClass();
        zzdyhVar.getClass();
        this.j = zzdyhVar;
        this.a = kc2.a(new aj0((ExecutorService) tc4Var.b));
        this.b = new zzgvb();
        this.c = new pp1();
        this.d = new pp1();
        this.e = new pp1();
        this.i = dataStore;
    }
}
