package com.inmobi.media;

import defpackage.az2;
import defpackage.cp0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.wz2;

/* JADX INFO: renamed from: com.inmobi.media.we, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4492we implements cp0 {
    public final /* synthetic */ cp0 a;

    public C4492we(cp0 cp0Var) {
        this.a = cp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        C4465ve c4465ve;
        if (dyVar instanceof C4465ve) {
            c4465ve = (C4465ve) dyVar;
            int i = c4465ve.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4465ve.b = i - Integer.MIN_VALUE;
            } else {
                c4465ve = new C4465ve(this, dyVar);
            }
        } else {
            c4465ve = new C4465ve(this, dyVar);
        }
        Object obj2 = c4465ve.a;
        int i2 = c4465ve.b;
        if (i2 == 0) {
            wz2.a0(obj2);
            cp0 cp0Var = this.a;
            if (((AbstractC3908bd) obj) instanceof AbstractC4002eo) {
                c4465ve.b = 1;
                Object objEmit = cp0Var.emit(obj, c4465ve);
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
