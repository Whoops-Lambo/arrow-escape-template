package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import defpackage.zr0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TabRowKt$TabRow$2$1$1 extends rc1 implements zr0 {

    /* JADX INFO: renamed from: androidx.compose.material.TabRowKt$TabRow$2$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {

        /* JADX INFO: renamed from: androidx.compose.material.TabRowKt$TabRow$2$1$1$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes8.dex */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        final class AnonymousClass3 extends rc1 implements zr0 {
            public final /* synthetic */ as0 i;
            public final /* synthetic */ ArrayList j;
            public final /* synthetic */ int k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(as0 as0Var, ArrayList arrayList, int i) {
                super(2);
                this.i = as0Var;
                this.j = arrayList;
                this.k = i;
            }

            @Override // defpackage.zr0
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && composer.b()) {
                    composer.h();
                } else {
                    this.i.invoke(this.j, composer, Integer.valueOf(((this.k >> 9) & 112) | 8));
                }
                return az2.a;
            }
        }

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
        throw null;
    }
}
