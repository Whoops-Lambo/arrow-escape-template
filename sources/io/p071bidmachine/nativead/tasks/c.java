package io.p071bidmachine.nativead.tasks;

import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends rc1 implements wr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ CountDownLatch j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CountDownLatch countDownLatch, int i) {
        super(1);
        this.i = i;
        this.j = countDownLatch;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.i;
        az2 az2Var = az2.a;
        CountDownLatch countDownLatch = this.j;
        switch (i) {
            case 0:
                countDownLatch.countDown();
                break;
            case 1:
                countDownLatch.countDown();
                break;
            default:
                countDownLatch.countDown();
                break;
        }
        return az2Var;
    }
}
