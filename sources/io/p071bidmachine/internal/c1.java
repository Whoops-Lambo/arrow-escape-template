package io.p071bidmachine.internal;

import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Runnable j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Runnable runnable, int i) {
        super(0);
        this.i = i;
        this.j = runnable;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        az2 az2Var = az2.a;
        Runnable runnable = this.j;
        switch (i) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
        return az2Var;
    }
}
