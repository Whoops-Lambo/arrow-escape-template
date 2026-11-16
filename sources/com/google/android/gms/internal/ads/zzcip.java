package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import androidx.media3.common.C;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.services.UnityAdsConstants;
import defpackage.jc1;
import defpackage.uy3;
import defpackage.z24;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcip extends Thread implements SurfaceTexture.OnFrameAvailableListener {
    public static final float[] B = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public volatile boolean A;
    public final z24 a;
    public final float[] b;
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public final float[] g;
    public final float[] h;
    public float i;
    public float j;
    public float k;
    public int l;
    public int m;
    public SurfaceTexture n;
    public SurfaceTexture o;
    public int p;
    public int q;
    public int r;
    public final FloatBuffer s;
    public final CountDownLatch t;
    public final Object u;
    public EGL10 v;
    public EGLDisplay w;
    public EGLContext x;
    public EGLSurface y;
    public volatile boolean z;

    public static final void g(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr3[3];
        float f4 = fArr2[2];
        float f5 = fArr3[6];
        fArr[0] = f + (f2 * f3) + (f4 * f5);
        float f6 = fArr2[0];
        float f7 = fArr3[1] * f6;
        float f8 = fArr3[4];
        float f9 = fArr3[7];
        fArr[1] = f7 + (f2 * f8) + (f4 * f9);
        float f10 = f6 * fArr3[2];
        float f11 = fArr2[1];
        float f12 = fArr3[5];
        float f13 = fArr3[8];
        fArr[2] = f10 + (f11 * f12) + (f4 * f13);
        float f14 = fArr2[3];
        float f15 = fArr3[0];
        float f16 = fArr2[4];
        float f17 = fArr2[5];
        fArr[3] = (f14 * f15) + (f3 * f16) + (f17 * f5);
        float f18 = fArr2[3];
        float f19 = fArr3[1];
        fArr[4] = (f18 * f19) + (f16 * f8) + (f17 * f9);
        float f20 = fArr3[2];
        fArr[5] = (f18 * f20) + (fArr2[4] * f12) + (f17 * f13);
        float f21 = fArr2[6] * f15;
        float f22 = fArr2[7];
        float f23 = fArr3[3] * f22;
        float f24 = fArr2[8];
        fArr[6] = f21 + f23 + (f5 * f24);
        float f25 = fArr2[6];
        float f26 = f9 * f24;
        fArr[7] = f26 + (f22 * fArr3[4]) + (f19 * f25);
        fArr[8] = (f25 * f20) + (fArr2[7] * fArr3[5]) + (f24 * f13);
    }

    public static final void h(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    public static final void i(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public zzcip(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.s = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(B).position(0);
        this.b = new float[9];
        this.c = new float[9];
        this.d = new float[9];
        this.e = new float[9];
        this.f = new float[9];
        this.g = new float[9];
        this.h = new float[9];
        this.i = Float.NaN;
        z24 z24Var = new z24(context);
        this.a = z24Var;
        z24Var.h = this;
        this.t = new CountDownLatch(1);
        this.u = new Object();
    }

    public final void a(int i, int i2) {
        Object obj = this.u;
        synchronized (obj) {
            this.m = i;
            this.l = i2;
            this.z = true;
            obj.notifyAll();
        }
    }

    public final void c() {
        Object obj = this.u;
        synchronized (obj) {
            this.A = true;
            this.o = null;
            obj.notifyAll();
        }
    }

    public final void d(float f, float f2) {
        int i = this.m;
        int i2 = this.l;
        if (i <= i2) {
            i = i2;
        }
        float f3 = i;
        this.j -= (f * 1.7453293f) / f3;
        float f4 = this.k - ((f2 * 1.7453293f) / f3);
        this.k = f4;
        if (f4 < -1.5707964f) {
            this.k = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.k = 1.5707964f;
        }
    }

    public final void e() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.y;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.v.eglMakeCurrent(this.w, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.v.eglDestroySurface(this.w, this.y);
            this.y = null;
        }
        EGLContext eGLContext = this.x;
        if (eGLContext != null) {
            this.v.eglDestroyContext(this.w, eGLContext);
            this.x = null;
        }
        EGLDisplay eGLDisplay = this.w;
        if (eGLDisplay != null) {
            this.v.eglTerminate(eGLDisplay);
            this.w = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.r++;
        Object obj = this.u;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:6:0x0020  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        int iGlCreateProgram;
        if (this.o == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("SphericalVideoProcessor started with no output texture.");
            this.t.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.v = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.w = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay != EGL10.EGL_NO_DISPLAY && this.v.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (this.v.eglChooseConfig(this.w, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig == null) {
                z = false;
            } else {
                EGL10 egl11 = this.v;
                EGLDisplay eGLDisplay = this.w;
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eGLContextEglCreateContext = egl11.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                this.x = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == eGLContext) {
                    z = false;
                } else {
                    EGLSurface eGLSurfaceEglCreateWindowSurface = this.v.eglCreateWindowSurface(this.w, eGLConfig, this.o, null);
                    this.y = eGLSurfaceEglCreateWindowSurface;
                    if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE || !this.v.eglMakeCurrent(this.w, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.x)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
        } else {
            z = false;
        }
        uy3 uy3Var = zzbjr.d2;
        int iJ = j(35633, !((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).equals(uy3Var.e()) ? (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (iJ == 0) {
            iGlCreateProgram = 0;
        } else {
            uy3 uy3Var2 = zzbjr.e2;
            int iJ2 = j(35632, !((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var2)).equals(uy3Var2.e()) ? (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (iJ2 == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = GLES20.glCreateProgram();
                f("createProgram");
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, iJ);
                    f("attachShader");
                    GLES20.glAttachShader(iGlCreateProgram, iJ2);
                    f("attachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    f("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    f("getProgramiv");
                    if (iArr2[0] != 1) {
                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        f("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        GLES20.glValidateProgram(iGlCreateProgram);
                        f("validateProgram");
                    }
                }
            }
        }
        this.p = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        f("useProgram");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.p, "aPosition");
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 12, (Buffer) this.s);
        f("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        f("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        f("genTextures");
        int i2 = iArr3[0];
        GLES20.glBindTexture(36197, i2);
        f("bindTextures");
        GLES20.glTexParameteri(36197, 10240, C.TEXTURE_MIN_FILTER_LINEAR);
        f("texParameteri");
        GLES20.glTexParameteri(36197, 10241, C.TEXTURE_MIN_FILTER_LINEAR);
        f("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        f("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        f("texParameteri");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.p, "uVMat");
        this.q = iGlGetUniformLocation;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation, 1, false, new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, 0);
        int i3 = this.p;
        if (!z || i3 == 0) {
            String strValueOf = String.valueOf(GLUtils.getEGLErrorString(this.v.eglGetError()));
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            String strConcat = "EGL initialization failed: ".concat(strValueOf);
            zzo.zzf(strConcat);
            com.google.android.gms.ads.internal.zzt.zzh().d("SphericalVideoProcessor.run.1", new Throwable(strConcat));
            e();
            this.t.countDown();
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(i2);
        this.n = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.t.countDown();
        z24 z24Var = this.a;
        if (z24Var.g == null) {
            SensorManager sensorManager = z24Var.a;
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            if (defaultSensor == null) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzf("No Sensor of TYPE_ROTATION_VECTOR");
            } else {
                zzgdf zzgdfVar = new zzgdf(jc1.h("OrientationMonitor").getLooper());
                z24Var.g = zzgdfVar;
                if (!sensorManager.registerListener(z24Var, defaultSensor, 0, zzgdfVar)) {
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzf("SensorManager.registerListener failed.");
                    z24Var.b();
                }
            }
        }
        try {
            try {
                this.z = true;
                while (!this.A) {
                    while (this.r > 0) {
                        this.n.updateTexImage();
                        this.r--;
                    }
                    float[] fArr = this.b;
                    if (z24Var.c(fArr)) {
                        if (Float.isNaN(this.i)) {
                            float[] fArr2 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                            float f = fArr[0];
                            float f2 = fArr2[0];
                            float f3 = fArr[1];
                            float f4 = fArr2[1];
                            float[] fArr3 = {(fArr[2] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (f3 * f4) + (f * f2), (fArr[5] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (fArr[4] * f4) + (fArr[3] * f2), (fArr[8] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (fArr[7] * f4) + (fArr[6] * f2)};
                            this.i = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                        }
                        i(this.g, this.i + this.j);
                    } else {
                        h(fArr, -1.5707964f);
                        i(this.g, this.j);
                    }
                    float[] fArr4 = this.c;
                    h(fArr4, 1.5707964f);
                    float[] fArr5 = this.d;
                    g(fArr5, this.g, fArr4);
                    float[] fArr6 = this.e;
                    g(fArr6, fArr, fArr5);
                    float[] fArr7 = this.f;
                    h(fArr7, this.k);
                    float[] fArr8 = this.h;
                    g(fArr8, fArr7, fArr6);
                    GLES20.glUniformMatrix3fv(this.q, 1, false, fArr8, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    f("drawArrays");
                    GLES20.glFinish();
                    this.v.eglSwapBuffers(this.w, this.y);
                    if (this.z) {
                        GLES20.glViewport(0, 0, this.m, this.l);
                        f("viewport");
                        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.p, "uFOVx");
                        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.p, "uFOVy");
                        int i7 = this.m;
                        int i8 = this.l;
                        if (i7 > i8) {
                            GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                            GLES20.glUniform1f(iGlGetUniformLocation3, (this.l * 0.87266463f) / this.m);
                        } else {
                            GLES20.glUniform1f(iGlGetUniformLocation2, (i7 * 0.87266463f) / i8);
                            GLES20.glUniform1f(iGlGetUniformLocation3, 0.87266463f);
                        }
                        this.z = false;
                    }
                    try {
                        Object obj = this.u;
                        synchronized (obj) {
                            try {
                                if (!this.A && !this.z && this.r == 0) {
                                    obj.wait();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            } catch (IllegalStateException unused2) {
                int i9 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("SphericalVideoProcessor halted unexpectedly.");
            } catch (Throwable th2) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("SphericalVideoProcessor died.", th2);
                com.google.android.gms.ads.internal.zzt.zzh().d("SphericalVideoProcessor.run.2", th2);
            }
            this.a.b();
            this.n.setOnFrameAvailableListener(null);
            this.n = null;
            e();
        } catch (Throwable th3) {
            this.a.b();
            this.n.setOnFrameAvailableListener(null);
            this.n = null;
            e();
            throw th3;
        }
    }

    public static final void f(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 10 + String.valueOf(iGlGetError).length());
            sb.append(str);
            sb.append(": glError ");
            sb.append(iGlGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    public static final int j(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        f("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            f("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            f("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            f("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                f("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }
}
