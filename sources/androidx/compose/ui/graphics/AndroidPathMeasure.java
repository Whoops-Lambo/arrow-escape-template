package androidx.compose.ui.graphics;

import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathMeasure;", "Landroidx/compose/ui/graphics/PathMeasure;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidPathMeasure implements PathMeasure {
    public final android.graphics.PathMeasure a;

    @Override // androidx.compose.ui.graphics.PathMeasure
    public final void b(Path path) {
        android.graphics.Path path2;
        if (path == null) {
            path2 = null;
        } else {
            if (!(path instanceof AndroidPath)) {
                d.u("Unable to obtain android.graphics.Path");
                return;
            }
            path2 = ((AndroidPath) path).a;
        }
        this.a.setPath(path2, false);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public final float getLength() {
        return this.a.getLength();
    }

    public AndroidPathMeasure(android.graphics.PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public final boolean a(float f, float f2, Path path) {
        path.getClass();
        if (path instanceof AndroidPath) {
            return this.a.getSegment(f, f2, ((AndroidPath) path).a, true);
        }
        d.u("Unable to obtain android.graphics.Path");
        return false;
    }
}
