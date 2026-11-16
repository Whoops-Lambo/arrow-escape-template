package com.unity3d.player;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class F0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ UnityPlayerForActivityOrService a;

    public F0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.invokeOnMainThread((Runnable) new C5277s0(this, windowInsets));
        return windowInsets;
    }
}
