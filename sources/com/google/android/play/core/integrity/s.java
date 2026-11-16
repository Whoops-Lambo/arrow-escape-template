package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.gb3;
import defpackage.ib3;
import defpackage.u61;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class s {
    private final s a = this;
    private final ib3 b;
    private final ib3 c;
    private final ib3 d;
    private final ib3 e;
    private final ib3 f;

    public final IntegrityManager a() {
        return (IntegrityManager) this.f.a();
    }

    public s(Context context, r rVar) {
        if (context != null) {
            u61 u61Var = new u61(context, 3);
            this.b = u61Var;
            gb3 gb3VarB = gb3.b(ac.a);
            this.c = gb3VarB;
            au auVar = new au(u61Var, l.a);
            this.d = auVar;
            gb3 gb3VarB2 = gb3.b(new al(u61Var, gb3VarB, auVar, l.a));
            this.e = gb3VarB2;
            this.f = gb3.b(new ab(gb3VarB2));
            return;
        }
        defpackage.d.w("instance cannot be null");
        throw null;
    }
}
