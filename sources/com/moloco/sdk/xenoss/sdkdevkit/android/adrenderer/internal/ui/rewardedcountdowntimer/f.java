package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LifecycleOwner b;
    public final /* synthetic */ Animatable c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ f(LifecycleOwner lifecycleOwner, Animatable animatable, MutableState mutableState, int i) {
        this.a = i;
        this.b = lifecycleOwner;
        this.c = animatable;
        this.d = mutableState;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return b.a(this.b, this.c, this.d, (DisposableEffectScope) obj);
            default:
                return c.a(this.b, this.c, this.d, (DisposableEffectScope) obj);
        }
    }
}
