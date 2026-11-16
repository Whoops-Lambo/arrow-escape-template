package com.unity3d.player;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ld3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class O0 implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public O0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, float f) {
        this.b = unityPlayerForActivityOrService;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W view = this.b.getView();
        if (view != null) {
            float f = this.a;
            ld3 ld3Var = view.a;
            ld3Var.a = f;
            ViewGroup.LayoutParams layoutParams = ld3Var.getLayoutParams();
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                layoutParams.width = -1;
                layoutParams.height = -1;
            } else {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            ld3Var.setLayoutParams(layoutParams);
        }
    }
}
