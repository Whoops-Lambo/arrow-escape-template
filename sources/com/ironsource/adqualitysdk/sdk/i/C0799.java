package com.ironsource.adqualitysdk.sdk.i;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᐴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0799 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC1096 f2098;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ AtomicBoolean f2099;

    public C0799(AtomicBoolean atomicBoolean, AbstractRunnableC1096 abstractRunnableC1096) {
        this.f2099 = atomicBoolean;
        this.f2098 = abstractRunnableC1096;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        if (this.f2099.compareAndSet(false, true)) {
            this.f2098.run();
        }
    }
}
