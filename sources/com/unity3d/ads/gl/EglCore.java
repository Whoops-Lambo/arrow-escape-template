package com.unity3d.ads.gl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.core.app.NotificationCompat;
import defpackage.e80;
import defpackage.h50;
import defpackage.nj;
import io.p071bidmachine.media3.extractor.ts.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 -2\u00020\u0001:\u0001-B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001e\u0010!\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010#\u001a\n  *\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/unity3d/ads/gl/EglCore;", "", "Landroid/opengl/EGLContext;", "sharedContext", "", "flags", "<init>", "(Landroid/opengl/EGLContext;I)V", "version", "Landroid/opengl/EGLConfig;", "getConfig", "(II)Landroid/opengl/EGLConfig;", "", NotificationCompat.CATEGORY_MESSAGE, "Laz2;", "checkEglError", "(Ljava/lang/String;)V", "release", "()V", "finalize", "Landroid/opengl/EGLSurface;", "eglSurface", "", "releaseSurface", "(Landroid/opengl/EGLSurface;)Z", "width", "height", "createOffscreenSurface", "(II)Landroid/opengl/EGLSurface;", "makeCurrent", "(Landroid/opengl/EGLSurface;)V", "Landroid/opengl/EGLDisplay;", "kotlin.jvm.PlatformType", "mEGLDisplay", "Landroid/opengl/EGLDisplay;", "mEGLContext", "Landroid/opengl/EGLContext;", "mEGLConfig", "Landroid/opengl/EGLConfig;", "glVersion", "I", "getGlVersion", "()I", "setGlVersion", "(I)V", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EglCore {
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int FLAG_RECORDABLE = 1;
    public static final int FLAG_TRY_GLES3 = 2;
    private int glVersion;

    @Nullable
    private EGLConfig mEGLConfig;
    private EGLContext mEGLContext;
    private EGLDisplay mEGLDisplay;

    private final EGLConfig getConfig(int flags, int version) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, version >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((flags & 1) != 0) {
            iArr[10] = EGL_RECORDABLE_ANDROID;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.mEGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    @NotNull
    public final EGLSurface createOffscreenSurface(int width, int height) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{12375, width, 12374, height, 12344}, 0);
        checkEglError("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        y.j("surface was null");
        return null;
    }

    public final void finalize() {
        if (this.mEGLDisplay != EGL14.EGL_NO_DISPLAY) {
            release();
        }
    }

    public final int getGlVersion() {
        return this.glVersion;
    }

    public final void makeCurrent(@Nullable EGLSurface eglSurface) {
        if (EGL14.eglMakeCurrent(this.mEGLDisplay, eglSurface, eglSurface, this.mEGLContext)) {
            return;
        }
        y.j("eglMakeCurrent failed");
    }

    public final void release() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
    }

    public final boolean releaseSurface(@Nullable EGLSurface eglSurface) {
        return EGL14.eglDestroySurface(this.mEGLDisplay, eglSurface);
    }

    public final void setGlVersion(int i) {
        this.glVersion = i;
    }

    public EglCore(@Nullable EGLContext eGLContext, int i) {
        EGLConfig config;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLDisplay = eGLDisplay;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.glVersion = -1;
        if (eGLDisplay == EGL14.EGL_NO_DISPLAY) {
            eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            this.mEGLDisplay = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                    if ((i & 2) != 0 && (config = getConfig(i, 3)) != null) {
                        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.mEGLDisplay, config, eGLContext, new int[]{12440, 3, 12344}, 0);
                        if (EGL14.eglGetError() == 12288) {
                            this.mEGLConfig = config;
                            this.mEGLContext = eGLContextEglCreateContext;
                            this.glVersion = 3;
                        }
                    }
                    if (this.mEGLContext == EGL14.EGL_NO_CONTEXT) {
                        EGLConfig config2 = getConfig(i, 2);
                        if (config2 != null) {
                            EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(this.mEGLDisplay, config2, eGLContext, new int[]{12440, 2, 12344}, 0);
                            checkEglError("eglCreateContext");
                            this.mEGLConfig = config2;
                            this.mEGLContext = eGLContextEglCreateContext2;
                            this.glVersion = 2;
                        } else {
                            y.j("Unable to find a suitable EGLConfig");
                            throw null;
                        }
                    }
                    EGL14.eglQueryContext(this.mEGLDisplay, this.mEGLContext, 12440, new int[1], 0);
                    return;
                }
                this.mEGLDisplay = null;
                y.j("unable to initialize EGL14");
                throw null;
            }
            y.j("unable to get EGL14 display");
            throw null;
        }
        y.j("EGL already set up");
        throw null;
    }

    private final void checkEglError(String msg) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        y.j(nj.m(iEglGetError, h50.q(msg, ": EGL error: 0x")));
    }

    public EglCore() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ EglCore(EGLContext eGLContext, int i, int i2, e80 e80Var) {
        this((i2 & 1) != 0 ? null : eGLContext, (i2 & 2) != 0 ? 0 : i);
    }
}
