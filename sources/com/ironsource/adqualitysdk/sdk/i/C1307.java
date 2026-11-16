package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ｋ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1307 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1192 f3913;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3914;

    public C1307(C1192 c1192, Activity activity) {
        this.f3913 = c1192;
        this.f3914 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        if (C1192.m872(this.f3913, this.f3914)) {
            AbstractC4631n.m405(new C1343(this));
            C1192 c1192 = this.f3913;
            if (c1192.f3592 && c1192.f3593 && this.f3914.isFinishing()) {
                C1192 c1193 = this.f3913;
                c1193.m501(this.f3914);
                c1193.f3593 = false;
            }
        }
    }
}
