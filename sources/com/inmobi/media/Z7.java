package com.inmobi.media;

import defpackage.az2;
import defpackage.cp0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.wz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Z7 implements cp0 {
    public final /* synthetic */ cp0 a;

    public Z7(cp0 cp0Var) {
        this.a = cp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        Y7 y7;
        if (dyVar instanceof Y7) {
            y7 = (Y7) dyVar;
            int i = y7.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                y7.b = i - Integer.MIN_VALUE;
            } else {
                y7 = new Y7(this, dyVar);
            }
        } else {
            y7 = new Y7(this, dyVar);
        }
        Object obj2 = y7.a;
        int i2 = y7.b;
        if (i2 == 0) {
            wz2.a0(obj2);
            cp0 cp0Var = this.a;
            if (((AbstractC4002eo) obj) instanceof C3919bo) {
                y7.b = 1;
                Object objEmit = cp0Var.emit(obj, y7);
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
