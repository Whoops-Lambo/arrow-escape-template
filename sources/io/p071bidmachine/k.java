package io.p071bidmachine;

import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import io.p071bidmachine.utils.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class k extends rc1 implements wr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(a aVar, int i) {
        super(1);
        this.i = i;
        this.j = aVar;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.i;
        az2 az2Var = az2.a;
        a aVar = this.j;
        switch (i) {
            case 0:
                AdProcessCallback adProcessCallback = (AdProcessCallback) obj;
                adProcessCallback.getClass();
                adProcessCallback.processLoadFail(aVar);
                break;
            default:
                AdProcessCallback adProcessCallback2 = (AdProcessCallback) obj;
                adProcessCallback2.getClass();
                adProcessCallback2.processShowFail(aVar);
                break;
        }
        return az2Var;
    }
}
