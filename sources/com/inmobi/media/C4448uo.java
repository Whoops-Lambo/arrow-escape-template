package com.inmobi.media;

import defpackage.az2;
import defpackage.cp0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.s71;
import defpackage.wz2;

/* JADX INFO: renamed from: com.inmobi.media.uo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4448uo implements cp0 {
    public final /* synthetic */ cp0 a;

    public C4448uo(cp0 cp0Var) {
        this.a = cp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        C4420to c4420to;
        if (dyVar instanceof C4420to) {
            c4420to = (C4420to) dyVar;
            int i = c4420to.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4420to.b = i - Integer.MIN_VALUE;
            } else {
                c4420to = new C4420to(this, dyVar);
            }
        } else {
            c4420to = new C4420to(this, dyVar);
        }
        Object obj2 = c4420to.a;
        int i2 = c4420to.b;
        if (i2 == 0) {
            wz2.a0(obj2);
            cp0 cp0Var = this.a;
            AbstractC4002eo abstractC4002eo = (AbstractC4002eo) obj;
            if (s71.b(abstractC4002eo, C4503wp.a) || (abstractC4002eo instanceof C3919bo)) {
                c4420to.b = 1;
                Object objEmit = cp0Var.emit(obj, c4420to);
                dz dzVar = dz.a;
                if (objEmit == dzVar) {
                    return dzVar;
                }
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj2);
        }
        return az2.a;
    }
}
