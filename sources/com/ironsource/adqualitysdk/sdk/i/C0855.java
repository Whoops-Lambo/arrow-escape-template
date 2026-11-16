package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᓙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0855 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0841 f2265;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f2266;

    public C0855(C0841 c0841, Activity activity) {
        this.f2265 = c0841;
        this.f2266 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C0841 c0841 = this.f2265;
        c0841.f2229 = true;
        InterfaceC0675 interfaceC0675 = c0841.f2228;
        if (interfaceC0675 != null) {
            interfaceC0675.mo567(this.f2266);
        }
    }
}
