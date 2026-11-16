package com.ironsource.adqualitysdk.sdk.i;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ܐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC0687 implements Runnable {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ CountDownLatch f1751;

    public RunnableC0687(CountDownLatch countDownLatch) {
        this.f1751 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1751.countDown();
    }
}
