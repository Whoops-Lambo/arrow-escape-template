package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRect;
import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Path {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    void a(float f, float f2);

    void b(float f, float f2, float f3, float f4, float f5, float f6);

    void c(float f, float f2, float f3, float f4);

    void close();

    void d(float f, float f2);

    void e(RoundRect roundRect);

    void f(float f, float f2);

    boolean g();

    void h(float f, float f2, float f3, float f4);

    void i(float f, float f2, float f3, float f4, float f5, float f6);

    void k(float f, float f2);

    void reset();

    static void j(AndroidPath androidPath, Path path) {
        long j = Offset.b;
        androidPath.getClass();
        path.getClass();
        android.graphics.Path path2 = androidPath.a;
        if (path instanceof AndroidPath) {
            path2.addPath(((AndroidPath) path).a, Offset.c(j), Offset.d(j));
        } else {
            d.u("Unable to obtain android.graphics.Path");
        }
    }
}
