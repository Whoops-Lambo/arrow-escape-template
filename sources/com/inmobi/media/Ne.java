package com.inmobi.media;

import defpackage.az2;
import defpackage.cp0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.wz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Ne implements cp0 {
    public final /* synthetic */ cp0 a;

    public Ne(cp0 cp0Var) {
        this.a = cp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        Me me;
        if (dyVar instanceof Me) {
            me = (Me) dyVar;
            int i = me.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                me.b = i - Integer.MIN_VALUE;
            } else {
                me = new Me(this, dyVar);
            }
        } else {
            me = new Me(this, dyVar);
        }
        Object obj2 = me.a;
        int i2 = me.b;
        if (i2 == 0) {
            wz2.a0(obj2);
            cp0 cp0Var = this.a;
            if (((AbstractC4002eo) obj) instanceof C3919bo) {
                me.b = 1;
                Object objEmit = cp0Var.emit(obj, me);
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
