package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﭴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1213 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1192 f3649;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3650;

    public C1213(C1192 c1192, Activity activity) {
        this.f3649 = c1192;
        this.f3650 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        if (C1192.m872(this.f3649, this.f3650)) {
            AbstractC4631n.m405(new C1214(this));
            C1192 c1192 = this.f3649;
            if (c1192.f3592 && !c1192.f3591 && this.f3650.isFinishing()) {
                C1192 c1193 = this.f3649;
                c1193.m501(this.f3650);
                c1193.f3593 = false;
            }
        }
    }
}
