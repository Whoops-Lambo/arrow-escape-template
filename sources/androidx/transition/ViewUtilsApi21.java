package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RequiresApi
class ViewUtilsApi21 extends ViewUtilsApi19 {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        public static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        @DoNotInline
        public static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        @DoNotInline
        public static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    public void d(View view, Matrix matrix) {
        if (d) {
            try {
                Api29Impl.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void e(View view, Matrix matrix) {
        if (e) {
            try {
                Api29Impl.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }

    public void f(View view, Matrix matrix) {
        if (f) {
            try {
                Api29Impl.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
