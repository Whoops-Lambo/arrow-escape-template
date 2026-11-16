package com.unity3d.player;

import android.hardware.camera2.CameraManager;

/* JADX INFO: renamed from: com.unity3d.player.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C5272q extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ Camera2Wrapper a;

    public C5272q(Camera2Wrapper camera2Wrapper) {
        this.a = camera2Wrapper;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        this.a.nativeCameraAvailable();
    }
}
