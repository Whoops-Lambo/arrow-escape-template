package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.GLES20;
import defpackage.e32;
import defpackage.pv1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class GlProgram {
    private static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 35815;
    private final Map<String, a> attributeByName;
    private final a[] attributes;
    private final int programId;
    private final Map<String, b> uniformByName;
    private final b[] uniforms;

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCStringLength(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    public static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return Util.fromUtf8Bytes(Util.toByteArray(inputStreamOpen));
        } finally {
            Util.closeQuietly(inputStreamOpen);
        }
    }

    private int getAttributeLocation(String str) {
        return getAttributeLocation(this.programId, str);
    }

    public void bindAttributesAndUniforms() throws GlUtil.GlException {
        for (a aVar : this.attributes) {
            Buffer buffer = (Buffer) Assertions.checkNotNull(aVar.c, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(aVar.b, aVar.d, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(aVar.a);
            GlUtil.checkGlError();
        }
        for (b bVar : this.uniforms) {
            float[] fArr = bVar.c;
            int i = bVar.a;
            int i2 = bVar.b;
            switch (i2) {
                case 5124:
                    GLES20.glUniform1i(i, bVar.d);
                    break;
                case 5126:
                    GLES20.glUniform1fv(i, 1, fArr, 0);
                    GlUtil.checkGlError();
                    break;
                case 35664:
                    GLES20.glUniform2fv(i, 1, fArr, 0);
                    GlUtil.checkGlError();
                    break;
                case 35665:
                    GLES20.glUniform3fv(i, 1, fArr, 0);
                    GlUtil.checkGlError();
                    break;
                case 35675:
                    GLES20.glUniformMatrix3fv(i, 1, false, fArr, 0);
                    GlUtil.checkGlError();
                    break;
                case 35676:
                    GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
                    GlUtil.checkGlError();
                    break;
                case 35678:
                case GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT /* 35815 */:
                case 36198:
                    if (bVar.e == 0) {
                        e32.i("No call to setSamplerTexId() before bind.");
                        return;
                    }
                    GLES20.glActiveTexture(bVar.f + 33984);
                    GlUtil.checkGlError();
                    GlUtil.bindTexture(i2 == 35678 ? 3553 : 36197, bVar.e);
                    GLES20.glUniform1i(i, bVar.f);
                    GlUtil.checkGlError();
                    break;
                    break;
                default:
                    e32.i(pv1.k(i2, "Unexpected uniform type: "));
                    return;
            }
        }
    }

    public void delete() throws GlUtil.GlException {
        GLES20.glDeleteProgram(this.programId);
        GlUtil.checkGlError();
    }

    public int getUniformLocation(String str) {
        return getUniformLocation(this.programId, str);
    }

    public void setBufferAttribute(String str, float[] fArr, int i) {
        a aVar = (a) Assertions.checkNotNull(this.attributeByName.get(str));
        aVar.getClass();
        aVar.c = GlUtil.createBuffer(fArr);
        aVar.d = i;
    }

    public void setFloatUniform(String str, float f) {
        ((b) Assertions.checkNotNull(this.uniformByName.get(str))).c[0] = f;
    }

    public void setFloatsUniform(String str, float[] fArr) {
        System.arraycopy(fArr, 0, ((b) Assertions.checkNotNull(this.uniformByName.get(str))).c, 0, fArr.length);
    }

    public void setIntUniform(String str, int i) {
        ((b) Assertions.checkNotNull(this.uniformByName.get(str))).d = i;
    }

    public void setSamplerTexIdUniform(String str, int i, int i2) {
        b bVar = (b) Assertions.checkNotNull(this.uniformByName.get(str));
        bVar.e = i;
        bVar.f = i2;
    }

    public void use() throws GlUtil.GlException {
        GLES20.glUseProgram(this.programId);
        GlUtil.checkGlError();
    }

    public GlProgram(String str, String str2) throws GlUtil.GlException {
        boolean z;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.programId = iGlCreateProgram;
        GlUtil.checkGlError();
        addShader(iGlCreateProgram, 35633, str);
        addShader(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        } else {
            z = false;
        }
        GlUtil.checkGlException(z, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.attributeByName = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.attributes = new a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.programId;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str3 = new String(bArr, 0, getCStringLength(bArr));
            a aVar = new a(str3, i, getAttributeLocation(i2, str3));
            this.attributes[i] = aVar;
            this.attributeByName.put(str3, aVar);
        }
        this.uniformByName = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.programId, 35718, iArr4, 0);
        this.uniforms = new b[iArr4[0]];
        for (int i4 = 0; i4 < iArr4[0]; i4++) {
            int i5 = this.programId;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i5, 35719, iArr5, 0);
            int[] iArr6 = new int[1];
            int i6 = iArr5[0];
            byte[] bArr2 = new byte[i6];
            GLES20.glGetActiveUniform(i5, i4, i6, new int[1], 0, new int[1], 0, iArr6, 0, bArr2, 0);
            String str4 = new String(bArr2, 0, getCStringLength(bArr2));
            b bVar = new b(str4, getUniformLocation(i5, str4), iArr6[0]);
            this.uniforms[i4] = bVar;
            this.uniformByName.put(str4, bVar);
        }
        GlUtil.checkGlError();
    }

    private static void addShader(int i, int i2, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        boolean z = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        }
        GlUtil.checkGlException(z, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(String str) throws GlUtil.GlException {
        int attributeLocation = getAttributeLocation(str);
        GLES20.glEnableVertexAttribArray(attributeLocation);
        GlUtil.checkGlError();
        return attributeLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getAttributeLocation(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUniformLocation(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    public GlProgram(Context context, String str, String str2) throws GlUtil.GlException, IOException {
        this(loadAsset(context, str), loadAsset(context, str2));
    }
}
