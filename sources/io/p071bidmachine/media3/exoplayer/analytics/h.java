package io.p071bidmachine.media3.exoplayer.analytics;

import defpackage.ck1;
import defpackage.i50;
import io.p071bidmachine.media3.common.p0;
import io.p071bidmachine.media3.common.q0;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.source.d0;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {
    public static final i50 h = new i50(7);
    public static final Random i = new Random();
    public i d;
    public String f;
    public final q0 a = new q0();
    public final p0 b = new p0();
    public final HashMap c = new HashMap();
    public r0 e = r0.a;
    public long g = -1;

    public final synchronized String c(r0 r0Var, d0 d0Var) {
        return b(r0Var.g(d0Var.a, this.b).c, d0Var).a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    public final synchronized void e(a aVar) {
        long j;
        this.d.getClass();
        if (aVar.b.p()) {
            return;
        }
        d0 d0Var = aVar.d;
        if (d0Var != null) {
            long j2 = d0Var.d;
            g gVar = (g) this.c.get(this.f);
            if (gVar != null) {
                j = gVar.c;
                if (j == -1) {
                    j = this.g + 1;
                }
            } else {
                j = this.g + 1;
            }
            if (j2 < j) {
                return;
            }
            g gVar2 = (g) this.c.get(this.f);
            if (gVar2 != null && gVar2.c == -1 && gVar2.b != aVar.c) {
                return;
            }
        }
        g gVarB = b(aVar.c, aVar.d);
        if (this.f == null) {
            this.f = gVarB.a;
        }
        d0 d0Var2 = aVar.d;
        if (d0Var2 != null && d0Var2.b()) {
            d0 d0Var3 = aVar.d;
            g gVarB2 = b(aVar.c, new d0(d0Var3.a, d0Var3.d, d0Var3.b));
            if (!gVarB2.e) {
                gVarB2.e = true;
                aVar.b.g(aVar.d.a, this.b);
                this.b.d(aVar.d.b);
                Math.max(0L, x.X(0L) + x.X(this.b.e));
                this.d.getClass();
            }
        }
        if (!gVarB.e) {
            gVarB.e = true;
            this.d.getClass();
        }
        if (gVarB.a.equals(this.f) && !gVarB.f) {
            gVarB.f = true;
            i iVar = this.d;
            String str = gVarB.a;
            iVar.getClass();
            d0 d0Var4 = aVar.d;
            if (d0Var4 == null || !d0Var4.b()) {
                iVar.b();
                iVar.j = str;
                iVar.k = ck1.i().setPlayerName("AndroidXMedia3").setPlayerVersion("1.7.1");
                iVar.c(aVar.b, aVar.d);
            }
        }
    }

    public final void a(g gVar) {
        long j = gVar.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final g b(int i2, d0 d0Var) {
        long j;
        long j2;
        long j3;
        HashMap map = this.c;
        g gVar = null;
        long j4 = Long.MAX_VALUE;
        for (g gVar2 : map.values()) {
            long j5 = gVar2.c;
            d0 d0Var2 = gVar2.d;
            if (j5 == -1 && i2 == gVar2.b && d0Var != null) {
                long j6 = d0Var.d;
                h hVar = gVar2.g;
                j = -1;
                g gVar3 = (g) hVar.c.get(hVar.f);
                if (gVar3 != null) {
                    j3 = gVar3.c;
                    if (j3 == -1) {
                        j3 = hVar.g + 1;
                    }
                } else {
                    j3 = hVar.g + 1;
                }
                if (j6 >= j3) {
                    gVar2.c = j6;
                }
            } else {
                j = -1;
            }
            if (d0Var != null) {
                long j7 = d0Var.d;
                if (d0Var2 == null) {
                    if (!d0Var.b() && j7 == gVar2.c) {
                        j2 = gVar2.c;
                        if (j2 != j) {
                        }
                        gVar = gVar2;
                        j4 = j2;
                    }
                } else if (j7 == d0Var2.d && d0Var.b == d0Var2.b && d0Var.c == d0Var2.c) {
                    j2 = gVar2.c;
                    if (j2 != j) {
                    }
                    gVar = gVar2;
                    j4 = j2;
                }
            } else if (i2 == gVar2.b) {
                j2 = gVar2.c;
                if (j2 != j || j2 < j4) {
                    gVar = gVar2;
                    j4 = j2;
                } else if (j2 == j4) {
                    int i3 = x.a;
                    if (gVar.d != null && d0Var2 != null) {
                        gVar = gVar2;
                    }
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String str = (String) h.get();
        g gVar4 = new g(this, str, i2, d0Var);
        map.put(str, gVar4);
        return gVar4;
    }

    public final void d(a aVar) {
        d0 d0Var;
        r0 r0Var = aVar.b;
        int i2 = aVar.c;
        d0 d0Var2 = aVar.d;
        boolean zP = r0Var.p();
        String str = this.f;
        HashMap map = this.c;
        if (zP) {
            if (str != null) {
                g gVar = (g) map.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) map.get(str);
        this.f = b(i2, d0Var2).a;
        e(aVar);
        if (d0Var2 != null) {
            long j = d0Var2.d;
            if (d0Var2.b()) {
                if (gVar2 != null && gVar2.c == j && (d0Var = gVar2.d) != null && d0Var.b == d0Var2.b && d0Var.c == d0Var2.c) {
                    return;
                }
                b(i2, new d0(d0Var2.a, j));
                this.d.getClass();
            }
        }
    }
}
