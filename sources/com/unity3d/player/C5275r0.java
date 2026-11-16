package com.unity3d.player;

import defpackage.uj2;

/* JADX INFO: renamed from: com.unity3d.player.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5275r0 implements IPermissionRequestCallbacks {
    public final long a;
    public final /* synthetic */ UnityPlayer b;

    @Override // com.unity3d.player.IPermissionRequestCallbacks
    public final void onPermissionResult(String[] strArr, int[] iArr) {
        int length = iArr.length;
        boolean z = false;
        if (length != 0) {
            if (length != 1) {
                uj2.a(6, "Only a single permission request is supported");
                return;
            } else if (iArr[0] == 1) {
                z = true;
            }
        }
        if (this.a == 0) {
            return;
        }
        this.b.invokeOnMainThread((UnityPlayer.b) new C5273q0(this, z));
    }

    public C5275r0(long j, UnityPlayer unityPlayer) {
        this.b = unityPlayer;
        this.a = j;
    }
}
