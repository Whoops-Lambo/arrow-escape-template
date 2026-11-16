package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ShapeContainingUtilKt {
    public static final boolean b(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fB = CornerRadius.b(j);
        float fC = CornerRadius.c(j);
        return ((f6 * f6) / (fC * fC)) + ((f5 * f5) / (fB * fB)) <= 1.0f;
    }

    public static final boolean a(float f, float f2, Path path) {
        Rect rect = new Rect(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        AndroidPath androidPathA = AndroidPath_androidKt.a();
        androidPathA.l(rect);
        AndroidPath androidPathA2 = AndroidPath_androidKt.a();
        androidPathA2.m(path, androidPathA, 1);
        boolean zIsEmpty = androidPathA2.a.isEmpty();
        androidPathA2.reset();
        androidPathA.reset();
        return !zIsEmpty;
    }
}
