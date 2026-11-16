package androidx.compose.foundation;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import defpackage.hg0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ImageKt$Image$2 implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult a(MeasureScope measureScope, List list, long j) {
        measureScope.getClass();
        list.getClass();
        return measureScope.C(Constraints.j(j), Constraints.i(j), hg0.a, ImageKt$Image$2$measure$1.i);
    }
}
