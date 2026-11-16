package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﯦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1230 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f3734;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f3735;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3736;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0696 f3737;

    public C1230(InterfaceC0696 interfaceC0696, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f3737 = interfaceC0696;
        this.f3736 = jSONObject;
        this.f3735 = view;
        this.f3734 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        this.f3737.mo380(this.f3736, this.f3735, this.f3734);
    }
}
