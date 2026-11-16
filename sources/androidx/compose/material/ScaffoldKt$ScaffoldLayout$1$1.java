package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import defpackage.rc1;
import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ScaffoldKt$ScaffoldLayout$1$1 extends rc1 implements zr0 {

    /* JADX INFO: renamed from: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            ((Placeable.PlacementScope) obj).getClass();
            throw null;
        }
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        long j = ((Constraints) obj2).a;
        ((SubcomposeMeasureScope) obj).getClass();
        Constraints.h(j);
        Constraints.g(j);
        Constraints.a(0, j, 0, 0, 0, 10);
        throw null;
    }
}
