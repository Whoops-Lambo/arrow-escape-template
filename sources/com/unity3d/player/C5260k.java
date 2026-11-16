package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import defpackage.uj2;

/* JADX INFO: renamed from: com.unity3d.player.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C5260k extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ C5270p a;

    public C5260k(C5270p c5270p) {
        this.a = c5270p;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.a.A = 3;
        uj2.a(6, "Camera2: CaptureSession configuration failed.");
        ((Camera2Wrapper) this.a.a).a();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C5270p c5270p = this.a;
        if (c5270p.b == null) {
            return;
        }
        synchronized (c5270p.t) {
            C5270p c5270p2 = this.a;
            c5270p2.r = cameraCaptureSession;
            try {
                c5270p2.q = c5270p2.b.createCaptureRequest(1);
                C5270p c5270p3 = this.a;
                c5270p3.q.addTarget(c5270p3.w);
                C5270p c5270p4 = this.a;
                c5270p4.q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c5270p4.n);
                this.a.f();
            } catch (CameraAccessException | IllegalStateException e) {
                uj2.a(6, "Camera2: " + e);
            }
        }
    }
}
