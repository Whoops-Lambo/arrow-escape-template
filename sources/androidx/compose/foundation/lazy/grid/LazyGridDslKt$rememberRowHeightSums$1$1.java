package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class LazyGridDslKt$rememberRowHeightSums$1$1 extends rc1 implements zr0 {
    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        long j = ((Constraints) obj2).a;
        ((Density) obj).getClass();
        if (Constraints.g(j) != Integer.MAX_VALUE) {
            throw null;
        }
        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.");
    }
}
