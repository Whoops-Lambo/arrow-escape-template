package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$1 extends rc1 implements wr0 {

    /* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        public final /* synthetic */ MutableState i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState mutableState) {
            super(1);
            this.i = mutableState;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            this.i.setValue(Integer.valueOf(((Number) obj).intValue()));
            return az2.a;
        }
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        layoutCoordinates.getClass();
        layoutCoordinates.d();
        throw null;
    }
}
