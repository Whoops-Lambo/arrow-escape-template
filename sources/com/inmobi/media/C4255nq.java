package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.er;
import defpackage.fy;
import defpackage.j71;
import defpackage.wr0;
import defpackage.wz2;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.nq, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4255nq extends T0 {
    public final Mf b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.T0
    public final Object a(dy dyVar) {
        C4227mq c4227mq;
        if (dyVar instanceof C4227mq) {
            c4227mq = (C4227mq) dyVar;
            int i = c4227mq.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4227mq.c = i - Integer.MIN_VALUE;
            } else {
                c4227mq = new C4227mq(this, (fy) dyVar);
            }
        } else {
            c4227mq = new C4227mq(this, (fy) dyVar);
        }
        Object objA = c4227mq.a;
        int i2 = c4227mq.c;
        if (i2 == 0) {
            wz2.a0(objA);
            C4396t0 c4396t0 = C4396t0.a;
            Mf mf = this.b;
            c4227mq.c = 1;
            objA = c4396t0.a(mf, c4227mq);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        Of of = (Of) objA;
        j71 j71Var = Tf.a;
        of.getClass();
        return of.d().string(er.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4255nq(Mf mf, Z9 z9) {
        super(z9);
        mf.getClass();
        this.b = mf;
    }

    @Override // com.inmobi.media.T0
    public final az2 a(AdResponse adResponse, wr0 wr0Var) {
        Objects.toString(adResponse);
        X0.a(adResponse, this.a, wr0Var);
        return az2.a;
    }
}
