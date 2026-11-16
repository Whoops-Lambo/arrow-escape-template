package com.unity3d.player;

import android.hardware.camera2.CameraDevice;
import defpackage.uj2;

/* JADX INFO: renamed from: com.unity3d.player.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C5262l extends CameraDevice.StateCallback {
    public final /* synthetic */ C5270p a;

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        uj2.a(5, "Camera2: CameraDevice disconnected.");
        this.a.a(cameraDevice);
    }

    public C5262l(C5270p c5270p) {
        this.a = c5270p;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        uj2.a(6, "Camera2: Error opening CameraDevice " + i);
        this.a.a(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.a.b = cameraDevice;
        C5270p.d();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        C5270p.d();
    }
}
