package com.inmobi.media;

import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.ul2;
import defpackage.wr0;
import defpackage.wz2;

/* JADX INFO: renamed from: com.inmobi.media.f4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4010f4 extends ul2 implements wr0 {
    public int a;
    public final /* synthetic */ ul2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4010f4(wr0 wr0Var, dy dyVar) {
        super(1, dyVar);
        this.b = (ul2) wr0Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ul2, wr0] */
    @Override // defpackage.ph
    public final dy create(dy dyVar) {
        return new C4010f4(this.b, dyVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ul2, wr0] */
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        return new C4010f4(this.b, (dy) obj).invokeSuspend(az2.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ul2, wr0] */
    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i == 0) {
            wz2.a0(obj);
            ?? r3 = this.b;
            this.a = 1;
            Object objInvoke = r3.invoke(this);
            dz dzVar = dz.a;
            if (objInvoke == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
        }
        return az2.a;
    }
}
