package com.google.android.exoplayer2.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    @DoNotInline
    public static EGLDisplay b() throws GlUtil.GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        GlUtil.checkGlException(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        GlUtil.checkGlException(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        GlUtil.checkGlError();
        return eGLDisplayEglGetDisplay;
    }

    @DoNotInline
    private static EGLConfig g(EGLDisplay eGLDisplay, int[] iArr) throws GlUtil.GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new GlUtil.GlException("eglChooseConfig failed.");
    }

    @DoNotInline
    public static EGLContext a(EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil.GlException {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, g(eGLDisplay, iArr), EGL14.EGL_NO_CONTEXT, new int[]{12440, i, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            GlUtil.checkGlError();
            return eGLContextEglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new GlUtil.GlException(pv1.k(i, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
    }

    @DoNotInline
    public static void d(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) throws GlUtil.GlException {
        if (eGLDisplay == null) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        GlUtil.checkEglException("Error releasing context");
        if (eGLContext != null) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            GlUtil.checkEglException("Error destroying context");
        }
        EGL14.eglReleaseThread();
        GlUtil.checkEglException("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        GlUtil.checkEglException("Error terminating display");
    }

    @DoNotInline
    public static EGLSurface c(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws GlUtil.GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, g(eGLDisplay, iArr), iArr2, 0);
        GlUtil.checkEglException("Error creating surface");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    @DoNotInline
    public static void e(int i, int i2, int i3) throws GlUtil.GlException {
        GlUtil.checkGlException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            GLES20.glBindFramebuffer(36160, i);
        }
        GlUtil.checkGlError();
        GLES20.glViewport(0, 0, i2, i3);
        GlUtil.checkGlError();
    }

    @DoNotInline
    public static void f(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws GlUtil.GlException {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        GlUtil.checkEglException("Error making context current");
        e(i, i2, i3);
    }

    @DoNotInline
    public static EGLSurface h(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws GlUtil.GlException {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, g(eGLDisplay, iArr), obj, iArr2, 0);
        GlUtil.checkEglException("Error creating surface");
        return eGLSurfaceEglCreateWindowSurface;
    }
}
