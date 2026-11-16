package com.unity3d.player;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C0 extends UnityPlayer.b {
    public final /* synthetic */ Rect b;
    public final /* synthetic */ UnityPlayerForActivityOrService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Rect rect) {
        super();
        this.c = unityPlayerForActivityOrService;
        this.b = rect;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.c;
        Rect rect = this.b;
        unityPlayerForActivityOrService.nativeSetInputArea(rect.left, rect.top, rect.right, rect.bottom);
    }
}
