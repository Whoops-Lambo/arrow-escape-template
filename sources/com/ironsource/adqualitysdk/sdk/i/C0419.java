package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ȉ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0419 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0391 f868;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ MotionEvent f869;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ View f870;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC1231 f871;

    public C0419(C0391 c0391, ViewOnTouchListenerC1231 viewOnTouchListenerC1231, View view, MotionEvent motionEvent) {
        this.f868 = c0391;
        this.f871 = viewOnTouchListenerC1231;
        this.f870 = view;
        this.f869 = motionEvent;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        this.f868.f815.mo458(this.f871, this.f870, this.f869);
    }
}
