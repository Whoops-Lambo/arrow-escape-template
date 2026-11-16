package defpackage;

import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.video.spherical.Projection$SubMesh;
import io.p071bidmachine.media3.common.util.a;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a02 {
    public final int a;
    public final FloatBuffer b;
    public final FloatBuffer c;
    public final int d;

    public a02(k90 k90Var) {
        float[] fArr = (float[]) k90Var.c;
        this.a = fArr.length / 3;
        this.b = a.l(fArr);
        this.c = a.l((float[]) k90Var.d);
        int i = k90Var.b;
        if (i != 1) {
            if (i != 2) {
                this.d = 4;
                return;
            } else {
                this.d = 6;
                return;
            }
        }
        this.d = 5;
    }

    public a02(Projection$SubMesh projection$SubMesh) {
        this.a = projection$SubMesh.getVertexCount();
        this.b = GlUtil.createBuffer(projection$SubMesh.vertices);
        this.c = GlUtil.createBuffer(projection$SubMesh.textureCoords);
        int i = projection$SubMesh.mode;
        if (i == 1) {
            this.d = 5;
        } else if (i != 2) {
            this.d = 4;
        } else {
            this.d = 6;
        }
    }
}
