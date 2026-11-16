package io.p071bidmachine.media3.exoplayer.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzadw;
import com.google.android.gms.internal.ads.zzdw;
import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzeh;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.f;
import io.p071bidmachine.media3.common.util.h;
import io.p071bidmachine.media3.common.util.x;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends HandlerThread implements Handler.Callback {
    public final /* synthetic */ int a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public Object e;
    public Surface f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, int i) {
        super(str);
        this.a = i;
    }

    public void a(int i) throws h {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        ((f) this.e).getClass();
        f fVar = (f) this.e;
        int[] iArr = fVar.b;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        a.e(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr2 = new int[2];
        a.e(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1), "eglInitialize failed");
        fVar.c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f.g, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        int i2 = x.a;
        a.e(z, String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(fVar.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        a.e(eGLContextEglCreateContext != null, "eglCreateContext failed");
        fVar.d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = fVar.c;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            a.e(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        a.e(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
        fVar.e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        a.d();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        fVar.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(fVar);
        SurfaceTexture surfaceTexture2 = ((f) this.e).f;
        surfaceTexture2.getClass();
        this.f = new PlaceholderSurface(this, surfaceTexture2, i != 0);
    }

    public void c() {
        ((f) this.e).getClass();
        f fVar = (f) this.e;
        fVar.a.removeCallbacks(fVar);
        try {
            SurfaceTexture surfaceTexture = fVar.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, fVar.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = fVar.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = fVar.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = fVar.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(fVar.c, fVar.e);
            }
            EGLContext eGLContext = fVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(fVar.c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = fVar.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(fVar.c);
            }
            fVar.c = null;
            fVar.d = null;
            fVar.e = null;
            fVar.f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                try {
                    if (i != 1) {
                        if (i == 2) {
                            try {
                                c();
                            } catch (Throwable th) {
                                try {
                                    a.o("PlaceholderSurface", "Failed to release placeholder surface", th);
                                } finally {
                                    quit();
                                }
                            }
                        }
                        break;
                    } else {
                        try {
                            try {
                                a(message.arg1);
                                synchronized (this) {
                                    notify();
                                }
                            } catch (Error e) {
                                a.o("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                                this.c = e;
                                synchronized (this) {
                                    notify();
                                }
                            } catch (RuntimeException e2) {
                                a.o("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                                this.d = e2;
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (h e3) {
                            a.o("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                            this.d = new IllegalStateException(e3);
                            synchronized (this) {
                                notify();
                            }
                        }
                        break;
                    }
                    return true;
                } catch (Throwable th2) {
                    synchronized (this) {
                        notify();
                        throw th2;
                    }
                }
            default:
                int i2 = message.what;
                try {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            try {
                                zzdw zzdwVar = (zzdw) this.e;
                                if (zzdwVar == null) {
                                    throw null;
                                }
                                zzdwVar.c();
                            } catch (Throwable th3) {
                                try {
                                    zzeh.f("PlaceholderSurface", "Failed to release placeholder surface", th3);
                                } finally {
                                    quit();
                                }
                            }
                        }
                        break;
                    } else {
                        try {
                            try {
                                try {
                                    int i3 = message.arg1;
                                    zzdw zzdwVar2 = (zzdw) this.e;
                                    if (zzdwVar2 == null) {
                                        throw null;
                                    }
                                    zzdwVar2.a(i3);
                                    SurfaceTexture surfaceTexture = ((zzdw) this.e).f;
                                    surfaceTexture.getClass();
                                    this.f = new zzadw(this, surfaceTexture, i3 != 0);
                                    synchronized (this) {
                                        notify();
                                    }
                                } catch (Error e4) {
                                    zzeh.f("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                                    this.c = e4;
                                    synchronized (this) {
                                        notify();
                                    }
                                }
                            } catch (zzdx e5) {
                                zzeh.f("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                                this.d = new IllegalStateException(e5);
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (RuntimeException e6) {
                            zzeh.f("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                            this.d = e6;
                            synchronized (this) {
                                notify();
                            }
                        }
                        break;
                    }
                    return true;
                } catch (Throwable th4) {
                    synchronized (this) {
                        notify();
                        throw th4;
                    }
                }
        }
    }
}
