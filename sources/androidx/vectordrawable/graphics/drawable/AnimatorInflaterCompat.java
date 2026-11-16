package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PathParser;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RestrictTo
public class AnimatorInflaterCompat {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {
        public PathParser.PathDataNode[] a;

        @Override // android.animation.TypeEvaluator
        public final PathParser.PathDataNode[] evaluate(float f, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            PathParser.PathDataNode[] pathDataNodeArr3 = pathDataNodeArr;
            PathParser.PathDataNode[] pathDataNodeArr4 = pathDataNodeArr2;
            if (!PathParser.a(pathDataNodeArr3, pathDataNodeArr4)) {
                d.r("Can't interpolate between two incompatible pathData");
                return null;
            }
            if (!PathParser.a(this.a, pathDataNodeArr3)) {
                this.a = PathParser.d(pathDataNodeArr3);
            }
            int i = 0;
            while (true) {
                int length = pathDataNodeArr3.length;
                PathParser.PathDataNode[] pathDataNodeArr5 = this.a;
                if (i >= length) {
                    return pathDataNodeArr5;
                }
                PathParser.PathDataNode pathDataNode = pathDataNodeArr5[i];
                PathParser.PathDataNode pathDataNode2 = pathDataNodeArr3[i];
                PathParser.PathDataNode pathDataNode3 = pathDataNodeArr4[i];
                pathDataNode.getClass();
                pathDataNode.a = pathDataNode2.a;
                int i2 = 0;
                while (true) {
                    float[] fArr = pathDataNode2.b;
                    if (i2 < fArr.length) {
                        pathDataNode.b[i2] = (pathDataNode3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
                i++;
            }
        }
    }
}
