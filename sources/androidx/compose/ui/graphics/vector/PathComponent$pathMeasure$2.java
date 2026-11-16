package androidx.compose.ui.graphics.vector;

import android.graphics.PathMeasure;
import androidx.compose.ui.graphics.AndroidPathMeasure;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/PathMeasure;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class PathComponent$pathMeasure$2 extends rc1 implements sr0 {
    public static final PathComponent$pathMeasure$2 i = new PathComponent$pathMeasure$2(0);

    @Override // defpackage.sr0
    public final Object invoke() {
        return new AndroidPathMeasure(new PathMeasure());
    }
}
