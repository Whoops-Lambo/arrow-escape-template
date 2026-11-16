package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnLayoutChangeListenerC4620h0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C4632n0 f327;

    public ViewOnLayoutChangeListenerC4620h0(C4632n0 c4632n0) {
        this.f327 = c4632n0;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            this.f327.m408(view);
        } catch (Throwable th) {
            AbstractC1290.m905(StringFog.decrypt("wZuJk3rRNMj2nIiIXsc=\n", "l/Ls5Du1R4A=\n"), StringFog.decrypt("lJfiRuBZMVTxiv5l8wA3T6Wm+Ej8Hj0=\n", "0eWQKZJ5WDo=\n"), th, false);
        }
    }
}
