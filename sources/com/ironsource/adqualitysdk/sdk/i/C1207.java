package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﭠ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1207 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f3639;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ L0 f3640;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f3641;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3642;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0696 f3643;

    public C1207(InterfaceC0696 interfaceC0696, JSONObject jSONObject, View view, L0 l0, KeyEvent.Callback callback) {
        this.f3643 = interfaceC0696;
        this.f3642 = jSONObject;
        this.f3641 = view;
        this.f3640 = l0;
        this.f3639 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        this.f3643.mo377(this.f3642, this.f3641, this.f3640, this.f3639);
    }
}
