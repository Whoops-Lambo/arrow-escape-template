package io.p071bidmachine.rendering.internal.meanbackground;

import defpackage.cm2;
import defpackage.j71;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.sx1;
import defpackage.sy;
import io.p071bidmachine.rendering.internal.y;
import io.p071bidmachine.util.log.b;
import io.p071bidmachine.util.taskmanager.coroutine.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ sx1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(sx1 sx1Var, int i) {
        super(0);
        this.i = i;
        this.j = sx1Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        sx1 sx1Var = this.j;
        switch (i) {
            case 0:
                return new y((b) ((cm2) sx1Var.e).getValue());
            case 1:
                j71 j71Var = ((j) sx1Var.b).a;
                return new c0(new a0(j71Var.a, j71Var.b, p.d), y.e, ((io.p071bidmachine.util.taskmanager.handler.b) ((cm2) sx1Var.d).getValue()).a);
            default:
                return new a((sy) sx1Var.a);
        }
    }
}
