package com.google.android.gms.internal.ads;

import android.util.Base64;
import defpackage.ck1;
import defpackage.l65;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzqc implements zzql {
    public static final Random h = new Random();
    public final zzbe a;
    public final zzbd b;
    public final HashMap c;
    public zzqj d;
    public zzbf e;
    public String f;
    public long g;

    public final synchronized String a(zzbf zzbfVar, zzxt zzxtVar) {
        return e(zzbfVar.o(zzxtVar.a, this.b).c, zzxtVar).a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0063 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006a A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0083 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009b A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    public final synchronized void b(zznv zznvVar) {
        int i;
        l65 l65VarE;
        zzqj zzqjVar;
        String str;
        zzxt zzxtVar;
        Object obj;
        int i2;
        l65 l65VarE2;
        l65 l65Var;
        long j;
        long jT = zzfq.t(0L);
        synchronized (this) {
            try {
                if (this.d == null) {
                    throw null;
                }
                zzbf zzbfVar = zznvVar.b;
                if (!zzbfVar.g()) {
                    zzxt zzxtVar2 = zznvVar.d;
                    if (zzxtVar2 != null) {
                        long j2 = zzxtVar2.d;
                        if (j2 == -1) {
                            l65Var = (l65) this.c.get(this.f);
                            if (l65Var != null || l65Var.c != -1 || l65Var.b == zznvVar.c) {
                                i = zznvVar.c;
                                l65VarE = e(i, zzxtVar2);
                                if (this.f == null) {
                                    this.f = l65VarE.a;
                                }
                                if (zzxtVar2 != null && zzxtVar2.b()) {
                                    obj = zzxtVar2.a;
                                    long j3 = zzxtVar2.d;
                                    i2 = zzxtVar2.b;
                                    l65VarE2 = e(i, new zzxt(obj, j3, i2));
                                    if (!l65VarE2.e) {
                                        l65VarE2.e = true;
                                        zzbd zzbdVar = this.b;
                                        zzbfVar.o(obj, zzbdVar);
                                        zzbdVar.f.a(i2).getClass();
                                        Math.max(0L, jT + jT);
                                    }
                                }
                                if (!l65VarE.e) {
                                    l65VarE.e = true;
                                }
                                if (l65VarE.a.equals(this.f) && !l65VarE.f) {
                                    l65VarE.f = true;
                                    zzqjVar = this.d;
                                    str = l65VarE.a;
                                    zzqjVar.getClass();
                                    zzxtVar = zznvVar.d;
                                    if (zzxtVar != null || !zzxtVar.b()) {
                                        zzqjVar.l();
                                        zzqjVar.j = str;
                                        zzqjVar.k = ck1.i().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.0");
                                        zzqjVar.i(zznvVar.b, zzxtVar);
                                    }
                                }
                            }
                        } else {
                            l65 l65Var2 = (l65) this.c.get(this.f);
                            if (l65Var2 != null) {
                                j = l65Var2.c;
                                if (j == -1) {
                                    j = this.g + 1;
                                }
                            } else {
                                j = this.g + 1;
                            }
                            if (j2 >= j) {
                                l65Var = (l65) this.c.get(this.f);
                                if (l65Var != null) {
                                    i = zznvVar.c;
                                    l65VarE = e(i, zzxtVar2);
                                    if (this.f == null) {
                                        this.f = l65VarE.a;
                                    }
                                    if (zzxtVar2 != null) {
                                        obj = zzxtVar2.a;
                                        long j4 = zzxtVar2.d;
                                        i2 = zzxtVar2.b;
                                        l65VarE2 = e(i, new zzxt(obj, j4, i2));
                                        if (!l65VarE2.e) {
                                            l65VarE2.e = true;
                                            zzbd zzbdVar2 = this.b;
                                            zzbfVar.o(obj, zzbdVar2);
                                            zzbdVar2.f.a(i2).getClass();
                                            Math.max(0L, jT + jT);
                                        }
                                    }
                                    if (!l65VarE.e) {
                                        l65VarE.e = true;
                                    }
                                    if (l65VarE.a.equals(this.f)) {
                                        l65VarE.f = true;
                                        zzqjVar = this.d;
                                        str = l65VarE.a;
                                        zzqjVar.getClass();
                                        zzxtVar = zznvVar.d;
                                        if (zzxtVar != null) {
                                            zzqjVar.l();
                                            zzqjVar.j = str;
                                            zzqjVar.k = ck1.i().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.0");
                                            zzqjVar.i(zznvVar.b, zzxtVar);
                                        } else {
                                            zzqjVar.l();
                                            zzqjVar.j = str;
                                            zzqjVar.k = ck1.i().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.0");
                                            zzqjVar.i(zznvVar.b, zzxtVar);
                                        }
                                    }
                                } else {
                                    i = zznvVar.c;
                                    l65VarE = e(i, zzxtVar2);
                                    if (this.f == null) {
                                        this.f = l65VarE.a;
                                    }
                                    if (zzxtVar2 != null) {
                                        obj = zzxtVar2.a;
                                        long j5 = zzxtVar2.d;
                                        i2 = zzxtVar2.b;
                                        l65VarE2 = e(i, new zzxt(obj, j5, i2));
                                        if (!l65VarE2.e) {
                                            l65VarE2.e = true;
                                            zzbd zzbdVar3 = this.b;
                                            zzbfVar.o(obj, zzbdVar3);
                                            zzbdVar3.f.a(i2).getClass();
                                            Math.max(0L, jT + jT);
                                        }
                                    }
                                    if (!l65VarE.e) {
                                        l65VarE.e = true;
                                    }
                                    if (l65VarE.a.equals(this.f)) {
                                        l65VarE.f = true;
                                        zzqjVar = this.d;
                                        str = l65VarE.a;
                                        zzqjVar.getClass();
                                        zzxtVar = zznvVar.d;
                                        if (zzxtVar != null) {
                                            zzqjVar.l();
                                            zzqjVar.j = str;
                                            zzqjVar.k = ck1.i().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.0");
                                            zzqjVar.i(zznvVar.b, zzxtVar);
                                        } else {
                                            zzqjVar.l();
                                            zzqjVar.j = str;
                                            zzqjVar.k = ck1.i().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.0");
                                            zzqjVar.i(zznvVar.b, zzxtVar);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i = zznvVar.c;
                        l65VarE = e(i, zzxtVar2);
                        if (this.f == null) {
                            this.f = l65VarE.a;
                        }
                        if (zzxtVar2 != null) {
                            obj = zzxtVar2.a;
                            long j6 = zzxtVar2.d;
                            i2 = zzxtVar2.b;
                            l65VarE2 = e(i, new zzxt(obj, j6, i2));
                            if (!l65VarE2.e) {
                                l65VarE2.e = true;
                                zzbd zzbdVar4 = this.b;
                                zzbfVar.o(obj, zzbdVar4);
                                zzbdVar4.f.a(i2).getClass();
                                Math.max(0L, jT + jT);
                            }
                        }
                        if (!l65VarE.e) {
                            l65VarE.e = true;
                        }
                        if (l65VarE.a.equals(this.f)) {
                            l65VarE.f = true;
                            zzqjVar = this.d;
                            str = l65VarE.a;
                            zzqjVar.getClass();
                            zzxtVar = zznvVar.d;
                            if (zzxtVar != null) {
                                zzqjVar.l();
                                zzqjVar.j = str;
                                zzqjVar.k = ck1.i().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.0");
                                zzqjVar.i(zznvVar.b, zzxtVar);
                            } else {
                                zzqjVar.l();
                                zzqjVar.j = str;
                                zzqjVar.k = ck1.i().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.0");
                                zzqjVar.i(zznvVar.b, zzxtVar);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(zznv zznvVar) {
        zzxt zzxtVar;
        boolean zG = zznvVar.b.g();
        String str = this.f;
        HashMap map = this.c;
        if (zG) {
            if (str != null) {
                l65 l65Var = (l65) map.get(str);
                l65Var.getClass();
                d(l65Var);
                return;
            }
            return;
        }
        l65 l65Var2 = (l65) map.get(str);
        int i = zznvVar.c;
        zzxt zzxtVar2 = zznvVar.d;
        this.f = e(i, zzxtVar2).a;
        b(zznvVar);
        if (zzxtVar2 != null) {
            long j = zzxtVar2.d;
            if (zzxtVar2.b()) {
                if (l65Var2 != null && l65Var2.c == j && (zzxtVar = l65Var2.d) != null) {
                    if (zzxtVar.b == zzxtVar2.b) {
                        if (zzxtVar.c == zzxtVar2.c) {
                            return;
                        }
                    }
                }
                e(i, new zzxt(zzxtVar2.a, j));
            }
        }
    }

    public final void d(l65 l65Var) {
        long j = l65Var.c;
        if (j != -1 && l65Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final l65 e(int i, zzxt zzxtVar) {
        long j;
        long j2;
        long j3;
        HashMap map = this.c;
        long j4 = Long.MAX_VALUE;
        l65 l65Var = null;
        for (l65 l65Var2 : map.values()) {
            long j5 = l65Var2.c;
            zzxt zzxtVar2 = l65Var2.d;
            if (j5 == -1 && i == l65Var2.b && zzxtVar != null) {
                zzqc zzqcVar = l65Var2.g;
                long j6 = zzxtVar.d;
                j = -1;
                l65 l65Var3 = (l65) zzqcVar.c.get(zzqcVar.f);
                if (l65Var3 != null) {
                    j3 = l65Var3.c;
                    if (j3 == -1) {
                        j3 = 1 + zzqcVar.g;
                    }
                } else {
                    j3 = 1 + zzqcVar.g;
                }
                if (j6 >= j3) {
                    l65Var2.c = j6;
                }
            } else {
                j = -1;
            }
            if (zzxtVar != null) {
                long j7 = zzxtVar.d;
                if (j7 != j) {
                    if (zzxtVar2 == null) {
                        if (!zzxtVar.b() && j7 == l65Var2.c) {
                            j2 = l65Var2.c;
                            if (j2 != j || j2 < j4) {
                                l65Var = l65Var2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = zzfq.a;
                                if (l65Var.d != null && zzxtVar2 != null) {
                                    l65Var = l65Var2;
                                }
                            }
                        }
                    } else if (j7 == zzxtVar2.d && zzxtVar.b == zzxtVar2.b && zzxtVar.c == zzxtVar2.c) {
                        j2 = l65Var2.c;
                        if (j2 != j) {
                        }
                        l65Var = l65Var2;
                        j4 = j2;
                    }
                }
            }
            if (i == l65Var2.b) {
                j2 = l65Var2.c;
                if (j2 != j) {
                }
                l65Var = l65Var2;
                j4 = j2;
            }
        }
        if (l65Var != null) {
            return l65Var;
        }
        byte[] bArr = new byte[12];
        h.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 10);
        l65 l65Var4 = new l65(this, strEncodeToString, i, zzxtVar);
        map.put(strEncodeToString, l65Var4);
        return l65Var4;
    }

    public zzqc(int i) {
        this.a = new zzbe();
        this.b = new zzbd();
        this.c = new HashMap();
        this.e = zzbf.a;
        this.g = -1L;
    }

    public zzqc() {
        throw null;
    }
}
