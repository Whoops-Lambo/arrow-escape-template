package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.GlProgram;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i53 implements GLSurfaceView.Renderer {
    public static final float[] k = {1.164f, 1.164f, 1.164f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.392f, 2.017f, 1.596f, -0.813f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    public static final float[] l = {1.164f, 1.164f, 1.164f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.213f, 2.112f, 1.793f, -0.533f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    public static final float[] m = {1.168f, 1.168f, 1.168f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.188f, 2.148f, 1.683f, -0.652f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    public static final String[] n = {"y_tex", "u_tex", "v_tex"};
    public static final FloatBuffer o = GlUtil.createBuffer(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    public final VideoDecoderGLSurfaceView a;
    public final int[] b = new int[3];
    public final int[] c = new int[3];
    public final int[] d = new int[3];
    public final int[] e = new int[3];
    public final AtomicReference f = new AtomicReference();
    public final FloatBuffer[] g = new FloatBuffer[3];
    public GlProgram h;
    public int i;
    public VideoDecoderOutputBuffer j;

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) this.f.getAndSet(null);
        if (videoDecoderOutputBuffer == null && this.j == null) {
            return;
        }
        if (videoDecoderOutputBuffer != null) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.j;
            if (videoDecoderOutputBuffer2 != null) {
                videoDecoderOutputBuffer2.release();
            }
            this.j = videoDecoderOutputBuffer;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer3 = (VideoDecoderOutputBuffer) Assertions.checkNotNull(this.j);
        int i = videoDecoderOutputBuffer3.colorspace;
        GLES20.glUniformMatrix3fv(this.i, 1, false, i != 1 ? i != 3 ? l : m : k, 0);
        int[] iArr = (int[]) Assertions.checkNotNull(videoDecoderOutputBuffer3.yuvStrides);
        ByteBuffer[] byteBufferArr = (ByteBuffer[]) Assertions.checkNotNull(videoDecoderOutputBuffer3.yuvPlanes);
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = videoDecoderOutputBuffer3.height;
            if (i2 != 0) {
                i3 = (i3 + 1) / 2;
            }
            int i4 = i3;
            GLES20.glActiveTexture(33984 + i2);
            GLES20.glBindTexture(3553, this.b[i2]);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i4, 0, 6409, 5121, byteBufferArr[i2]);
        }
        int i5 = videoDecoderOutputBuffer3.width;
        int i6 = (i5 + 1) / 2;
        int[] iArr2 = {i5, i6, i6};
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr3 = this.d;
            int i8 = iArr3[i7];
            int i9 = iArr2[i7];
            int[] iArr4 = this.e;
            if (i8 != i9 || iArr4[i7] != iArr[i7]) {
                Assertions.checkState(iArr[i7] != 0);
                float f = iArr2[i7] / iArr[i7];
                FloatBuffer floatBufferCreateBuffer = GlUtil.createBuffer(new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1.0f});
                this.g[i7] = floatBufferCreateBuffer;
                GLES20.glVertexAttribPointer(this.c[i7], 2, 5126, false, 0, (Buffer) floatBufferCreateBuffer);
                iArr3[i7] = iArr2[i7];
                iArr4[i7] = iArr[i7];
            }
        }
        GLES20.glClear(16384);
        GLES20.glDrawArrays(5, 0, 4);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e) {
            Log.e("VideoDecoderGLSV", "Failed to draw a frame", e);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.c;
        try {
            GlProgram glProgram = new GlProgram("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.h = glProgram;
            GLES20.glVertexAttribPointer(glProgram.getAttributeArrayLocationAndEnable("in_pos"), 2, 5126, false, 0, (Buffer) o);
            iArr[0] = this.h.getAttributeArrayLocationAndEnable("in_tc_y");
            iArr[1] = this.h.getAttributeArrayLocationAndEnable("in_tc_u");
            iArr[2] = this.h.getAttributeArrayLocationAndEnable("in_tc_v");
            this.i = this.h.getUniformLocation("mColorConversion");
            GlUtil.checkGlError();
            int[] iArr2 = this.b;
            try {
                GLES20.glGenTextures(3, iArr2, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.h.getUniformLocation(n[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    GlUtil.bindTexture(3553, iArr2[i]);
                }
                GlUtil.checkGlError();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
            }
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e2) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e2);
        }
    }

    public i53(VideoDecoderGLSurfaceView videoDecoderGLSurfaceView) {
        this.a = videoDecoderGLSurfaceView;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.d;
            this.e[i] = -1;
            iArr[i] = -1;
        }
    }
}
