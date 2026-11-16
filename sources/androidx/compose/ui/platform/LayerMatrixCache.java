package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LayerMatrixCache<T> {
    public final zr0 a;
    public Matrix b;
    public Matrix c;
    public float[] d;
    public float[] e;
    public boolean f = true;
    public boolean g = true;
    public boolean h = true;

    public final void c() {
        this.f = true;
        this.g = true;
    }

    public final float[] a(Object obj) {
        float[] fArrA = this.e;
        if (fArrA == null) {
            fArrA = androidx.compose.ui.graphics.Matrix.a();
            this.e = fArrA;
        }
        if (this.g) {
            this.h = InvertMatrixKt.a(b(obj), fArrA);
            this.g = false;
        }
        if (this.h) {
            return fArrA;
        }
        return null;
    }

    public final float[] b(Object obj) {
        float[] fArrA = this.d;
        if (fArrA == null) {
            fArrA = androidx.compose.ui.graphics.Matrix.a();
            this.d = fArrA;
        }
        if (!this.f) {
            return fArrA;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.a.invoke(obj, matrix);
        Matrix matrix2 = this.c;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            AndroidMatrixConversions_androidKt.a(fArrA, matrix);
            this.b = matrix2;
            this.c = matrix;
        }
        this.f = false;
        return fArrA;
    }

    public LayerMatrixCache(zr0 zr0Var) {
        this.a = zr0Var;
    }
}
