package com.inmobi.media;

import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.tb5;
import defpackage.ul2;
import defpackage.wr0;
import defpackage.wz2;
import defpackage.ya0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class vq extends ul2 implements wr0 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Y9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(String str, Y9 y9, dy dyVar) {
        super(1, dyVar);
        this.b = str;
        this.c = y9;
    }

    @Override // defpackage.ph
    public final dy create(dy dyVar) {
        return new vq(this.b, this.c, dyVar);
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        return new vq(this.b, this.c, (dy) obj).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                wz2.a0(obj);
                return obj;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(obj);
        xq xqVar = xq.a;
        String str = this.b;
        Y9 y9 = this.c;
        this.a = 1;
        ya0 ya0VarC = tb5.c(AbstractC4211ma.e, null, new C4422tq(str, y9, null), 1);
        dz dzVar = dz.a;
        return ya0VarC == dzVar ? dzVar : ya0VarC;
    }
}
