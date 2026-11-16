package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;
import defpackage.ju4;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo
public final class zzhg {
    public final zzhf a;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final PriorityQueue d = new PriorityQueue();
    public int e = -1;
    public ju4 f;

    public final void a(int i) {
        zzgvz.f(i >= 0);
        this.e = i;
        c(i);
    }

    public final void c(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.d;
            if (priorityQueue.size() <= i) {
                return;
            }
            ju4 ju4Var = (ju4) priorityQueue.poll();
            String str = zzfq.a;
            int i2 = 0;
            while (true) {
                arrayList = ju4Var.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                this.a.h(ju4Var.b, (zzey) arrayList.get(i2));
                this.b.push((zzey) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            ju4 ju4Var2 = this.f;
            if (ju4Var2 != null && ju4Var2.b == ju4Var.b) {
                this.f = null;
            }
            this.c.push(ju4Var);
        }
    }

    public zzhg(zzhf zzhfVar) {
        this.a = zzhfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r8 < r0.b) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r8, com.google.android.gms.internal.ads.zzey r10) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L92
            int r0 = r7.e
            if (r0 == 0) goto L93
            java.util.PriorityQueue r1 = r7.d
            r2 = -1
            if (r0 == r2) goto L29
            int r0 = r1.size()
            int r3 = r7.e
            if (r0 < r3) goto L29
            java.lang.Object r0 = r1.peek()
            ju4 r0 = (defpackage.ju4) r0
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfq.a
            long r3 = r0.b
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L29
            goto L93
        L29:
            java.util.ArrayDeque r0 = r7.b
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L37
            com.google.android.gms.internal.ads.zzey r0 = new com.google.android.gms.internal.ads.zzey
            r0.<init>()
            goto L3d
        L37:
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.zzey r0 = (com.google.android.gms.internal.ads.zzey) r0
        L3d:
            int r3 = r10.B()
            r0.y(r3)
            byte[] r3 = r10.a
            int r10 = r10.b
            byte[] r4 = r0.a
            r5 = 0
            int r6 = r0.B()
            java.lang.System.arraycopy(r3, r10, r4, r5, r6)
            ju4 r10 = r7.f
            if (r10 == 0) goto L63
            long r3 = r10.b
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L5d
            goto L63
        L5d:
            java.util.ArrayList r7 = r10.a
            r7.add(r0)
            return
        L63:
            java.util.ArrayDeque r10 = r7.c
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L71
            ju4 r10 = new ju4
            r10.<init>()
            goto L77
        L71:
            java.lang.Object r10 = r10.pop()
            ju4 r10 = (defpackage.ju4) r10
        L77:
            java.util.ArrayList r3 = r10.a
            boolean r4 = r3.isEmpty()
            com.google.android.gms.internal.ads.zzgvz.f(r4)
            r10.b = r8
            r3.add(r0)
            r1.add(r10)
            r7.f = r10
            int r8 = r7.e
            if (r8 == r2) goto L91
            r7.c(r8)
        L91:
            return
        L92:
            r8 = r0
        L93:
            com.google.android.gms.internal.ads.zzhf r7 = r7.a
            r7.h(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhg.b(long, com.google.android.gms.internal.ads.zzey):void");
    }
}
