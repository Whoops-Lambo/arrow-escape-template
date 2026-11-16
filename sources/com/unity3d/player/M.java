package com.unity3d.player;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class M extends UnityPlayer.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ P d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p, UnityPlayer unityPlayer, int i, int i2) {
        super();
        this.d = p;
        this.b = i;
        this.c = i2;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        int i = this.b;
        int i2 = this.c;
        if (i == 4096) {
            UnityAccessibilityDelegate.onNodeIncremented(i2);
        } else {
            UnityAccessibilityDelegate.onNodeDecremented(i2);
        }
        this.d.a.sendEventForVirtualViewId(this.c, 4);
    }
}
