package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import com.unity3d.services.UnityAdsConstants;
import defpackage.pv1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class GlUtil {
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final String EXTENSION_YUV_TARGET = "GL_EXT_YUV_target";
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};

    private static void assertValidTextureSize(int i, int i2) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        Assertions.checkState(i3 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i < 0 || i2 < 0) {
            throw new GlException("width or height is less than 0");
        }
        if (i > i3 || i2 > i3) {
            throw new GlException(pv1.k(i3, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static void clearOutputFrame() throws GlException {
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        GLES20.glClear(16384);
        checkGlError();
    }

    @RequiresApi
    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2) throws GlException {
        c.f(eGLDisplay, eGLContext, eGLSurface, 0, i, i2);
    }

    public static void setToIdentity(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    public static void checkGlError() throws GlException {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(iGlGetError));
            z = true;
        }
        if (z) {
            throw new GlException(sb.toString());
        }
    }

    public static void checkGlException(boolean z, String str) throws GlException {
        if (!z) {
            throw new GlException(str);
        }
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        setToIdentity(fArr);
        return fArr;
    }

    private static FloatBuffer createBuffer(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    @RequiresApi
    public static EGLContext createEglContext(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
        Assertions.checkArgument(Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_8888) || Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102));
        return c.a(eGLDisplay, Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102) ? 3 : 2, iArr);
    }

    @RequiresApi
    private static EGLSurface createPbufferSurface(EGLDisplay eGLDisplay, int i, int i2, int[] iArr) throws GlException {
        return c.c(eGLDisplay, iArr, new int[]{12375, i, 12374, i2, 12344});
    }

    @RequiresApi
    public static EGLSurface focusPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlException {
        return createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    @RequiresApi
    public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj) throws GlException {
        return c.h(eGLDisplay, obj, EGL_CONFIG_ATTRIBUTES_RGBA_8888, EGL_WINDOW_SURFACE_ATTRIBUTES_NONE);
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, -1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        String strEglQueryString;
        int i = Util.SDK_INT;
        if (i < 24) {
            return false;
        }
        if (i >= 26 || !("samsung".equals(Util.MANUFACTURER) || "XT1650".equals(Util.MODEL))) {
            return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(EXTENSION_PROTECTED_CONTENT);
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        String strEglQueryString;
        return Util.SDK_INT >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(EXTENSION_SURFACELESS_CONTEXT);
    }

    public static boolean isYuvTargetExtensionSupported() {
        String strGlGetString;
        if (Util.SDK_INT < 17) {
            return false;
        }
        if (Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay eGLDisplayCreateEglDisplay = createEglDisplay();
                EGLContext eGLContextCreateEglContext = createEglContext(eGLDisplayCreateEglDisplay);
                focusPlaceholderEglSurface(eGLContextCreateEglContext, eGLDisplayCreateEglDisplay);
                strGlGetString = GLES20.glGetString(7939);
                destroyEglContext(eGLDisplayCreateEglDisplay, eGLContextCreateEglContext);
            } catch (GlException unused) {
                return false;
            }
        } else {
            strGlGetString = GLES20.glGetString(7939);
        }
        return strGlGetString != null && strGlGetString.contains(EXTENSION_YUV_TARGET);
    }

    private GlUtil() {
    }

    public static void bindTexture(int i, int i2) throws GlException {
        GLES20.glBindTexture(i, i2);
        checkGlError();
        GLES20.glTexParameteri(i, 10240, C.TEXTURE_MIN_FILTER_LINEAR);
        checkGlError();
        GLES20.glTexParameteri(i, 10241, C.TEXTURE_MIN_FILTER_LINEAR);
        checkGlError();
        GLES20.glTexParameteri(i, 10242, 33071);
        checkGlError();
        GLES20.glTexParameteri(i, 10243, 33071);
        checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkEglException(String str) throws GlException {
        boolean z;
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            z = true;
        } else {
            z = false;
        }
        checkGlException(z, str + ", error code: " + iEglGetError);
    }

    @RequiresApi
    public static EGLDisplay createEglDisplay() throws GlException {
        return c.b();
    }

    public static int createExternalTexture() throws GlException {
        int iGenerateTexture = generateTexture();
        bindTexture(36197, iGenerateTexture);
        return iGenerateTexture;
    }

    public static int createFboForTexture(int i) throws GlException {
        checkGlException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        checkGlError();
        return iArr[0];
    }

    @RequiresApi
    public static EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws GlException {
        EGLSurface eGLSurfaceCreatePbufferSurface;
        if (isSurfacelessContextExtensionSupported()) {
            eGLSurfaceCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceCreatePbufferSurface = createPbufferSurface(eGLDisplay, 1, 1, iArr);
        }
        focusEglSurface(eGLDisplay, eGLContext, eGLSurfaceCreatePbufferSurface, 1, 1);
        return eGLSurfaceCreatePbufferSurface;
    }

    private static int createTexture(int i, int i2, int i3, int i4) throws GlException {
        assertValidTextureSize(i, i2);
        int iGenerateTexture = generateTexture();
        bindTexture(3553, iGenerateTexture);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, 6408, i4, ByteBuffer.allocateDirect(i * i2 * 4));
        checkGlError();
        return iGenerateTexture;
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i = 0; i < list.size(); i++) {
            System.arraycopy(list.get(i), 0, fArr, i * 4, 4);
        }
        return fArr;
    }

    public static void deleteTexture(int i) throws GlException {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        checkGlError();
    }

    @RequiresApi
    public static void destroyEglContext(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) throws GlException {
        c.d(eGLDisplay, eGLContext);
    }

    @RequiresApi
    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws GlException {
        c.f(eGLDisplay, eGLContext, eGLSurface, i, i2, i3);
    }

    @RequiresApi
    public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws GlException {
        c.e(i, i2, i3);
    }

    private static int generateTexture() throws GlException {
        checkGlException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    @RequiresApi
    public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj, int[] iArr) throws GlException {
        return c.h(eGLDisplay, obj, iArr, EGL_WINDOW_SURFACE_ATTRIBUTES_NONE);
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    public static int createTexture(int i, int i2, boolean z) throws GlException {
        if (z) {
            Assertions.checkState(Util.SDK_INT >= 18, "GLES30 extensions are not supported below API 18.");
            return createTexture(i, i2, 34842, 5131);
        }
        return createTexture(i, i2, 6408, 5121);
    }

    @RequiresApi
    public static EGLContext createEglContext(EGLDisplay eGLDisplay) throws GlException {
        return createEglContext(eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }
}
