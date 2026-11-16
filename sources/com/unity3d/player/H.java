package com.unity3d.player;

import android.content.res.Configuration;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class H extends UnityPlayer.b {
    public final /* synthetic */ Configuration b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(UnityPlayer unityPlayer, Configuration configuration) {
        super();
        this.b = configuration;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        UnityAccessibilityDelegate.onFontScaleChanged(this.b.fontScale);
    }
}
