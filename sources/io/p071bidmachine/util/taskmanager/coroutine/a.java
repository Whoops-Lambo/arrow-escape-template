package io.p071bidmachine.util.taskmanager.coroutine;

import defpackage.c91;
import defpackage.dn;
import defpackage.fz;
import defpackage.kc2;
import defpackage.li2;
import defpackage.sc0;
import defpackage.sy;
import defpackage.tb5;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class a extends io.p071bidmachine.util.taskmanager.a {
    public final dn a;
    public final ConcurrentHashMap b;

    public a(dn dnVar) {
        this.a = dnVar;
        this.b = new ConcurrentHashMap();
    }

    @Override // io.p071bidmachine.util.taskmanager.a
    public final void d(Runnable runnable) {
        runnable.getClass();
        c91 c91Var = (c91) this.b.remove(runnable);
        if (c91Var != null) {
            c91Var.cancel(null);
        }
    }

    @Override // io.p071bidmachine.util.taskmanager.a
    public final void e(long j, Runnable runnable) {
        runnable.getClass();
        li2 li2VarT = tb5.t(this.a, null, fz.b, new sc0(j, runnable, this, null), 1);
        this.b.put(runnable, li2VarT);
        li2VarT.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(sy syVar) {
        this(kc2.a(syVar));
        syVar.getClass();
    }
}
