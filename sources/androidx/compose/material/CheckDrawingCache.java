package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathMeasure;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/CheckDrawingCache;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class CheckDrawingCache {
    public final Path a;
    public final PathMeasure b;
    public final Path c;

    public CheckDrawingCache() {
        AndroidPath androidPathA = AndroidPath_androidKt.a();
        AndroidPathMeasure androidPathMeasure = new AndroidPathMeasure(new android.graphics.PathMeasure());
        AndroidPath androidPathA2 = AndroidPath_androidKt.a();
        this.a = androidPathA;
        this.b = androidPathMeasure;
        this.c = androidPathA2;
    }
}
