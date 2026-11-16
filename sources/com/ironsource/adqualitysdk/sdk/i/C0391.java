package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ŕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0391 implements InterfaceC1235 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1235 f815;

    public C0391(InterfaceC1235 interfaceC1235) {
        this.f815 = interfaceC1235;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1235
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean mo458(ViewOnTouchListenerC1231 viewOnTouchListenerC1231, View view, MotionEvent motionEvent) {
        AbstractC4631n.m402(new C0419(this, viewOnTouchListenerC1231, view, motionEvent));
        return false;
    }
}
