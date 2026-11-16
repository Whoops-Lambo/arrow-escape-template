package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4622i0 implements k1 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C4632n0 f362;

    public C4622i0(C4632n0 c4632n0) {
        this.f362 = c4632n0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.k1
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void mo381(View view) {
        view.removeOnLayoutChangeListener(this.f362.f418);
        this.f362.f415.remove(view);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.k1
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void mo382(View view) {
        view.addOnLayoutChangeListener(this.f362.f418);
        C4632n0 c4632n0 = this.f362;
        c4632n0.f415.put(view, c4632n0.f418);
    }
}
