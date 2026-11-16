package com.inmobi.media;

import defpackage.az2;
import defpackage.cp0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.wz2;

/* JADX INFO: renamed from: com.inmobi.media.ip, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4114ip implements cp0 {
    public final /* synthetic */ cp0 a;

    public C4114ip(cp0 cp0Var) {
        this.a = cp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        C4087hp c4087hp;
        if (dyVar instanceof C4087hp) {
            c4087hp = (C4087hp) dyVar;
            int i = c4087hp.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4087hp.b = i - Integer.MIN_VALUE;
            } else {
                c4087hp = new C4087hp(this, dyVar);
            }
        } else {
            c4087hp = new C4087hp(this, dyVar);
        }
        Object obj2 = c4087hp.a;
        int i2 = c4087hp.b;
        if (i2 == 0) {
            wz2.a0(obj2);
            cp0 cp0Var = this.a;
            Boolean boolValueOf = Boolean.valueOf(((EnumC3893aq) obj) == EnumC3893aq.VISIBLE);
            c4087hp.b = 1;
            Object objEmit = cp0Var.emit(boolValueOf, c4087hp);
            dz dzVar = dz.a;
            if (objEmit == dzVar) {
                return dzVar;
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
