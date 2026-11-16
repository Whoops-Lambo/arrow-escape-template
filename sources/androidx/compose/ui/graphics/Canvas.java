package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Canvas {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    void a(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint);

    void b(float f, float f2, float f3, float f4, float f5, float f6, Paint paint);

    void c(float f, float f2);

    void d(Rect rect, Paint paint);

    void e();

    void f(Path path);

    void g(int i, float f, float f2, float f3, float f4);

    void j(float f, long j, Paint paint);

    void k(float f, float f2);

    void l(float f, float f2, float f3, float f4, Paint paint);

    void m(ImageBitmap imageBitmap, long j, Paint paint);

    void n();

    void o();

    void p(ArrayList arrayList, Paint paint);

    void q(long j, long j2, Paint paint);

    void r();

    void s(float[] fArr);

    void t(Path path, Paint paint);

    void u();

    void v(float f, float f2, float f3, float f4, float f5, float f6, Paint paint);

    default void i(Rect rect) {
        g(1, rect.a, rect.b, rect.c, rect.d);
    }

    default void h(Rect rect, Paint paint) {
        paint.getClass();
        l(rect.a, rect.b, rect.c, rect.d, paint);
    }
}
