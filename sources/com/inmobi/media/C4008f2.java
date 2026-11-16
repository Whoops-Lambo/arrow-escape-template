package com.inmobi.media;

import android.view.ViewGroup;
import defpackage.az2;
import defpackage.c91;
import defpackage.cp0;
import defpackage.cz;
import defpackage.dy;
import defpackage.h50;
import defpackage.np1;
import defpackage.tb5;
import defpackage.xi2;

/* JADX INFO: renamed from: com.inmobi.media.f2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4008f2 implements cp0 {
    public final cz a;
    public final ViewGroup b;
    public final np1 c;
    public final long d;
    public final Y9 e;
    public c91 f;

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r1.a.collect(r2, r7) == r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d0, code lost:
    
        if (r9.a.collect(r1, r7) == r11) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C4008f2 r12, android.view.ViewGroup r13, defpackage.cz r14, defpackage.fy r15) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4008f2.a(com.inmobi.media.f2, android.view.ViewGroup, cz, fy):java.lang.Object");
    }

    @Override // defpackage.cp0
    public final /* bridge */ /* synthetic */ Object emit(Object obj, dy dyVar) {
        return a(((Boolean) obj).booleanValue());
    }

    public C4008f2(long j, ViewGroup viewGroup, Y9 y9, cz czVar, np1 np1Var) {
        czVar.getClass();
        viewGroup.getClass();
        np1Var.getClass();
        this.a = czVar;
        this.b = viewGroup;
        this.c = np1Var;
        this.d = j;
        this.e = y9;
    }

    public final az2 a(boolean z) {
        Y9 y9 = this.e;
        if (y9 != null) {
            ((Z9) y9).a("WindowLifecycleHandler", h50.j("AttachedStateCollector - view attachment state changed: ", z));
        }
        Y9 y10 = this.e;
        if (z) {
            if (y10 != null) {
                ((Z9) y10).a("WindowLifecycleHandler", "AttachedStateCollector - starting visibility observation");
            }
            this.f = tb5.t(this.a, null, null, new C3925c2(this, null), 3);
        } else {
            if (y10 != null) {
                ((Z9) y10).a("WindowLifecycleHandler", "AttachedStateCollector - view detached, stopping observation");
            }
            np1 np1Var = this.c;
            Boolean bool = Boolean.FALSE;
            xi2 xi2Var = (xi2) np1Var;
            xi2Var.getClass();
            xi2Var.k(null, bool);
            AbstractC4097i7.a(this.f);
            this.f = null;
        }
        return az2.a;
    }
}
