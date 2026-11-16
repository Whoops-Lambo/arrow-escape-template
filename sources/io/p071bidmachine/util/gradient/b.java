package io.p071bidmachine.util.gradient;

import android.graphics.RectF;
import android.graphics.RuntimeShader;
import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends RuntimeShader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RectF rectF, int[] iArr) {
        super("\n            layout(color) uniform vec4 c00; // top-left\n            layout(color) uniform vec4 c10; // top-right\n            layout(color) uniform vec4 c01; // bottom-left\n            layout(color) uniform vec4 c11; // bottom-right\n            uniform float w;\n            uniform float h;\n            \n            half4 main(float2 p) {\n                float u = clamp(p.x / max(w, 1.0), 0.0, 1.0);\n                float v = clamp(p.y / max(h, 1.0), 0.0, 1.0);\n                vec4 col = (1.0 - u) * (1.0 - v) * c00\n                         + u * (1.0 - v) * c10\n                         + (1.0 - u) * v * c01\n                         + u * v * c11;\n                return half4(col);\n            }\n            ");
        rectF.getClass();
        setFloatUniform("w", rectF.width());
        setFloatUniform(CmcdData.STREAMING_FORMAT_HLS, rectF.height());
        setColorUniform("c00", iArr[0]);
        setColorUniform("c10", iArr[1]);
        setColorUniform("c01", iArr[2]);
        setColorUniform("c11", iArr[3]);
    }
}
