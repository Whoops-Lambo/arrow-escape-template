package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import defpackage.bg3;
import defpackage.mf3;
import defpackage.uj2;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class Camera2Wrapper implements bg3 {
    public final Context a;
    public C5270p b = null;
    public CameraManager c = null;
    public C5272q d = null;

    private final native void initCamera2Jni();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeCameraAvailable();

    private final native void nativeCameraDisconnected();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    public final void b() {
        C5272q c5272q;
        CameraManager cameraManager = this.c;
        if (cameraManager != null && (c5272q = this.d) != null) {
            cameraManager.unregisterAvailabilityCallback(c5272q);
        }
        this.d = null;
        this.c = null;
        closeCamera2();
    }

    public void closeCamera2() {
        C5270p c5270p = this.b;
        if (c5270p != null) {
            c5270p.a();
        }
        this.b = null;
    }

    public int getCamera2Count() {
        return C5270p.getCameraIds(this.a).length;
    }

    public int getCamera2FocalLengthEquivalent(int i) {
        return C5270p.a(this.a, i);
    }

    public int[] getCamera2Resolutions(int i) {
        return C5270p.b(this.a, i);
    }

    public int getCamera2SensorOrientation(int i) {
        return C5270p.c(this.a, i);
    }

    public Rect getFrameSizeCamera2() {
        C5270p c5270p = this.b;
        return c5270p != null ? c5270p.e : new Rect();
    }

    public boolean initializeCamera2(int i, int i2, int i3, int i4, int i5, Surface surface) {
        C5270p c5270p;
        if (this.b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        Context context = this.a;
        if (context != null && this.d == null) {
            CameraManager cameraManager = C5270p.getCameraManager(context);
            this.c = cameraManager;
            if (cameraManager != null) {
                C5272q c5272q = new C5272q(this);
                this.d = c5272q;
                this.c.registerAvailabilityCallback(c5272q, new Handler(Looper.getMainLooper()));
            }
        }
        CameraManager cameraManager2 = C5270p.B;
        if (PlatformSupport.QUINCE_TART_SUPPORT) {
            mf3 mf3Var = new mf3(this);
            mf3Var.E = null;
            c5270p = mf3Var;
        } else {
            c5270p = new C5270p(this);
        }
        C5270p c5270p2 = c5270p;
        this.b = c5270p2;
        return c5270p2.a(this.a, i, i2, i3, i4, i5, surface);
    }

    public boolean isCamera2AutoFocusPointSupported(int i) {
        return C5270p.d(this.a, i);
    }

    public boolean isCamera2FrontFacing(int i) {
        return C5270p.e(this.a, i);
    }

    public void pauseCamera2() {
        C5270p c5270p = this.b;
        if (c5270p != null) {
            c5270p.c();
        }
    }

    public boolean setAutoFocusPoint(float f, float f2) {
        C5270p c5270p = this.b;
        if (c5270p != null && c5270p.h > 0) {
            if (!c5270p.m) {
                c5270p.i = f;
                c5270p.j = f2;
                synchronized (c5270p.t) {
                    try {
                        if (c5270p.r != null && c5270p.A != 2) {
                            c5270p.e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            uj2.a(5, "Camera2: Setting manual focus point already started.");
        }
        return false;
    }

    public void startCamera2() {
        C5270p c5270p = this.b;
        if (c5270p != null) {
            c5270p.g();
        }
    }

    public void stopCamera2() {
        C5270p c5270p = this.b;
        if (c5270p != null) {
            c5270p.h();
        }
    }

    public Camera2Wrapper(Context context) {
        this.a = context;
        initCamera2Jni();
    }

    public final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3) {
        nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3);
    }

    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    public final void a() {
        nativeCameraDisconnected();
    }
}
