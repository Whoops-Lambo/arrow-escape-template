package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi21;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    public final int[] a = new int[2];
    public final float[] b = Matrix.a();

    public final void b(float[] fArr, float f, float f2) {
        float[] fArr2 = this.b;
        Matrix.d(fArr2);
        Matrix.e(fArr2, f, f2);
        AndroidComposeView_androidKt.a(fArr, fArr2);
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    public final void a(View view, float[] fArr) {
        fArr.getClass();
        Matrix.d(fArr);
        c(view, fArr);
    }

    public final void c(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            c((View) parent, fArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, iArr[0], iArr[1]);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr2 = this.b;
            AndroidMatrixConversions_androidKt.a(fArr2, matrix);
            AndroidComposeView_androidKt.a(fArr, fArr2);
        }
    }
}
