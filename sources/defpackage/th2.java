package defpackage;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.MotionEvent;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.video.spherical.OrientationListener$Listener;
import com.google.android.exoplayer2.video.spherical.Projection$SubMesh;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.android.exoplayer2.video.spherical.TouchTracker$Listener;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.h;
import io.p071bidmachine.media3.exoplayer.video.spherical.c;
import io.p071bidmachine.media3.exoplayer.video.spherical.f;
import io.p071bidmachine.media3.exoplayer.video.spherical.g;
import io.p071bidmachine.media3.exoplayer.video.spherical.i;
import io.p071bidmachine.media3.exoplayer.video.spherical.j;
import io.p071bidmachine.media3.exoplayer.video.x;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class th2 implements GLSurfaceView.Renderer, TouchTracker$Listener, OrientationListener$Listener, c {
    public final /* synthetic */ int a;
    public final float[] b;
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public float g;
    public float h;
    public final float[] i;
    public final float[] j;
    public final Object k;
    public final /* synthetic */ GLSurfaceView l;

    public th2(j jVar, i iVar) {
        this.a = 1;
        this.l = jVar;
        this.b = new float[16];
        this.c = new float[16];
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.i = new float[16];
        this.j = new float[16];
        this.k = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }

    @Override // com.google.android.exoplayer2.video.spherical.TouchTracker$Listener
    public synchronized void onScrollChange(PointF pointF) {
        float f = pointF.y;
        this.g = f;
        Matrix.setRotateM(this.e, 0, -f, (float) Math.cos(this.h), (float) Math.sin(this.h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Matrix.setRotateM(this.f, 0, -pointF.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        int i;
        Object objE;
        switch (this.a) {
            case 0:
                synchronized (this) {
                    Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
                    Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
                    break;
                }
                Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
                o72 o72Var = (o72) this.k;
                float[] fArr = this.c;
                b02 b02Var = o72Var.c;
                GLES20.glClear(16384);
                try {
                    GlUtil.checkGlError();
                } catch (GlUtil.GlException e) {
                    Log.e("SceneRenderer", "Failed to draw a frame", e);
                }
                if (o72Var.a.compareAndSet(true, false)) {
                    ((SurfaceTexture) Assertions.checkNotNull(o72Var.j)).updateTexImage();
                    try {
                        GlUtil.checkGlError();
                    } catch (GlUtil.GlException e2) {
                        Log.e("SceneRenderer", "Failed to draw a frame", e2);
                    }
                    if (o72Var.b.compareAndSet(true, false)) {
                        GlUtil.setToIdentity(o72Var.g);
                    }
                    long timestamp = o72Var.j.getTimestamp();
                    Long l = (Long) o72Var.e.poll(timestamp);
                    if (l != null) {
                        ic0 ic0Var = o72Var.d;
                        float[] fArr2 = o72Var.g;
                        float[] fArr3 = (float[]) ((TimedValueQueue) ic0Var.d).pollFloor(l.longValue());
                        if (fArr3 == null) {
                            timestamp = timestamp;
                        } else {
                            float[] fArr4 = (float[]) ic0Var.c;
                            float f = fArr3[0];
                            float f2 = -fArr3[1];
                            float f3 = -fArr3[2];
                            float length = Matrix.length(f, f2, f3);
                            if (length != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                            } else {
                                GlUtil.setToIdentity(fArr4);
                            }
                            if (!ic0Var.a) {
                                ic0.c((float[]) ic0Var.b, (float[]) ic0Var.c);
                                ic0Var.a = true;
                            }
                            Matrix.multiplyMM(fArr2, 0, (float[]) ic0Var.b, 0, (float[]) ic0Var.c, 0);
                        }
                    } else {
                        timestamp = timestamp;
                    }
                    zz1 zz1Var = (zz1) o72Var.f.pollFloor(timestamp);
                    if (zz1Var != null) {
                        b02Var.getClass();
                        if (b02.b(zz1Var)) {
                            b02Var.a = zz1Var.c;
                            b02Var.b = new a02(zz1Var.a.getSubMesh(0));
                            if (!zz1Var.d) {
                                Projection$SubMesh subMesh = zz1Var.b.getSubMesh(0);
                                subMesh.getVertexCount();
                                GlUtil.createBuffer(subMesh.vertices);
                                GlUtil.createBuffer(subMesh.textureCoords);
                            }
                        }
                    }
                }
                Matrix.multiplyMM(o72Var.h, 0, fArr, 0, o72Var.g, 0);
                int i2 = o72Var.i;
                float[] fArr5 = o72Var.h;
                a02 a02Var = b02Var.b;
                if (a02Var == null) {
                    return;
                }
                int i3 = b02Var.a;
                GLES20.glUniformMatrix3fv(b02Var.e, 1, false, i3 == 1 ? b02.j : i3 == 2 ? b02.k : b02.i, 0);
                GLES20.glUniformMatrix4fv(b02Var.d, 1, false, fArr5, 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, i2);
                GLES20.glUniform1i(b02Var.h, 0);
                try {
                    GlUtil.checkGlError();
                } catch (GlUtil.GlException e3) {
                    android.util.Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
                }
                GLES20.glVertexAttribPointer(b02Var.f, 3, 5126, false, 12, (Buffer) a02Var.b);
                try {
                    GlUtil.checkGlError();
                } catch (GlUtil.GlException e4) {
                    android.util.Log.e("ProjectionRenderer", "Failed to load position data", e4);
                }
                GLES20.glVertexAttribPointer(b02Var.g, 2, 5126, false, 8, (Buffer) a02Var.c);
                try {
                    GlUtil.checkGlError();
                } catch (GlUtil.GlException e5) {
                    android.util.Log.e("ProjectionRenderer", "Failed to load texture data", e5);
                }
                GLES20.glDrawArrays(a02Var.d, 0, a02Var.a);
                try {
                    GlUtil.checkGlError();
                    return;
                } catch (GlUtil.GlException e6) {
                    android.util.Log.e("ProjectionRenderer", "Failed to render", e6);
                    return;
                }
                break;
            default:
                synchronized (this) {
                    Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
                    Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
                    break;
                }
                Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
                i iVar = (i) this.k;
                float[] fArr6 = this.c;
                GLES20.glClear(16384);
                try {
                    a.d();
                } catch (h e7) {
                    a.o("SceneRenderer", "Failed to draw a frame", e7);
                }
                if (iVar.a.compareAndSet(true, false)) {
                    SurfaceTexture surfaceTexture = iVar.j;
                    surfaceTexture.getClass();
                    surfaceTexture.updateTexImage();
                    try {
                        a.d();
                    } catch (h e8) {
                        a.o("SceneRenderer", "Failed to draw a frame", e8);
                    }
                    if (iVar.b.compareAndSet(true, false)) {
                        Matrix.setIdentityM(iVar.g, 0);
                    }
                    long timestamp2 = iVar.j.getTimestamp();
                    k90 k90Var = iVar.e;
                    synchronized (k90Var) {
                        objE = k90Var.e(timestamp2, false);
                    }
                    Long l2 = (Long) objE;
                    if (l2 != null) {
                        ic0 ic0Var2 = iVar.d;
                        float[] fArr7 = iVar.g;
                        float[] fArr8 = (float[]) ((k90) ic0Var2.d).g(l2.longValue());
                        if (fArr8 == null) {
                            i = 33984;
                        } else {
                            float[] fArr9 = (float[]) ic0Var2.c;
                            float f4 = fArr8[0];
                            float f5 = -fArr8[1];
                            float f6 = -fArr8[2];
                            i = 33984;
                            float length2 = Matrix.length(f4, f5, f6);
                            if (length2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                Matrix.setRotateM(fArr9, 0, (float) Math.toDegrees(length2), f4 / length2, f5 / length2, f6 / length2);
                            } else {
                                Matrix.setIdentityM(fArr9, 0);
                            }
                            if (!ic0Var2.a) {
                                ic0.d((float[]) ic0Var2.b, (float[]) ic0Var2.c);
                                ic0Var2.a = true;
                            }
                            Matrix.multiplyMM(fArr7, 0, (float[]) ic0Var2.b, 0, (float[]) ic0Var2.c, 0);
                        }
                    } else {
                        i = 33984;
                    }
                    f fVar = (f) iVar.f.g(timestamp2);
                    if (fVar != null) {
                        g gVar = iVar.c;
                        gVar.getClass();
                        if (g.b(fVar)) {
                            gVar.a = fVar.c;
                            gVar.b = new a02(fVar.a.a[0]);
                            if (!fVar.d) {
                                k90 k90Var2 = fVar.b.a[0];
                                float[] fArr10 = (float[]) k90Var2.c;
                                int length3 = fArr10.length;
                                a.l(fArr10);
                                a.l((float[]) k90Var2.d);
                            }
                        }
                    }
                } else {
                    i = 33984;
                }
                Matrix.multiplyMM(iVar.h, 0, fArr6, 0, iVar.g, 0);
                g gVar2 = iVar.c;
                int i4 = iVar.i;
                float[] fArr11 = iVar.h;
                a02 a02Var2 = gVar2.b;
                if (a02Var2 == null) {
                    return;
                }
                int i5 = gVar2.a;
                GLES20.glUniformMatrix3fv(gVar2.e, 1, false, i5 == 1 ? g.j : i5 == 2 ? g.k : g.i, 0);
                GLES20.glUniformMatrix4fv(gVar2.d, 1, false, fArr11, 0);
                GLES20.glActiveTexture(i);
                GLES20.glBindTexture(36197, i4);
                GLES20.glUniform1i(gVar2.h, 0);
                try {
                    a.d();
                } catch (h e9) {
                    android.util.Log.e("ProjectionRenderer", "Failed to bind uniforms", e9);
                }
                GLES20.glVertexAttribPointer(gVar2.f, 3, 5126, false, 12, (Buffer) a02Var2.b);
                try {
                    a.d();
                } catch (h e10) {
                    android.util.Log.e("ProjectionRenderer", "Failed to load position data", e10);
                }
                GLES20.glVertexAttribPointer(gVar2.g, 2, 5126, false, 8, (Buffer) a02Var2.c);
                try {
                    a.d();
                } catch (h e11) {
                    android.util.Log.e("ProjectionRenderer", "Failed to load texture data", e11);
                }
                GLES20.glDrawArrays(a02Var2.d, 0, a02Var2.a);
                try {
                    a.d();
                    return;
                } catch (h e12) {
                    android.util.Log.e("ProjectionRenderer", "Failed to render", e12);
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.exoplayer2.video.spherical.OrientationListener$Listener
    public final synchronized void onOrientationChange(float[] fArr, float f) {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    float[] fArr2 = this.d;
                    System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                    float f2 = -f;
                    this.h = f2;
                    Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f2), (float) Math.sin(this.h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return;
                default:
                    float[] fArr3 = this.d;
                    System.arraycopy(fArr, 0, fArr3, 0, fArr3.length);
                    float f3 = -f;
                    this.h = f3;
                    Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f3), (float) Math.sin(this.h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.video.spherical.TouchTracker$Listener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((SphericalGLSurfaceView) this.l).performClick();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        switch (this.a) {
            case 0:
                GLES20.glViewport(0, 0, i, i2);
                float f = i / i2;
                Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
                break;
            default:
                GLES20.glViewport(0, 0, i, i2);
                float f2 = i / i2;
                Matrix.perspectiveM(this.b, 0, f2 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f2))) * 2.0d) : 90.0f, f2, 0.1f, 100.0f);
                break;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    ((SphericalGLSurfaceView) this.l).onSurfaceTextureAvailable(((o72) this.k).a());
                    return;
                default:
                    j jVar = (j) this.l;
                    jVar.e.post(new x(1, jVar, ((i) this.k).b()));
                    return;
            }
        }
    }

    public th2(SphericalGLSurfaceView sphericalGLSurfaceView, o72 o72Var) {
        this.a = 0;
        this.l = sphericalGLSurfaceView;
        this.b = new float[16];
        this.c = new float[16];
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.i = new float[16];
        this.j = new float[16];
        this.k = o72Var;
        GlUtil.setToIdentity(fArr);
        GlUtil.setToIdentity(fArr2);
        GlUtil.setToIdentity(fArr3);
        this.h = 3.1415927f;
    }
}
