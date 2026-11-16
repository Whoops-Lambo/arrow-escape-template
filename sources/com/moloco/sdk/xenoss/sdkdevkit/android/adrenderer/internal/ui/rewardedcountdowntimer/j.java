package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements LifecycleEventObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Animatable b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ j(Animatable animatable, MutableState mutableState, int i) {
        this.a = i;
        this.b = animatable;
        this.c = mutableState;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.a;
        MutableState mutableState = this.c;
        Animatable animatable = this.b;
        switch (i) {
            case 0:
                b.a(animatable, mutableState, lifecycleOwner, event);
                break;
            default:
                c.a(animatable, mutableState, lifecycleOwner, event);
                break;
        }
    }
}
