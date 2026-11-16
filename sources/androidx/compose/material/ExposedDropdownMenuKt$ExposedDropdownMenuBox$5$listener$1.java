package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.Ref;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1 extends rc1 implements sr0 {
    public final /* synthetic */ View i;
    public final /* synthetic */ Ref j;
    public final /* synthetic */ int k;
    public final /* synthetic */ MutableState l;

    /* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1(View view, Ref ref, int i, MutableState mutableState) {
        super(0);
        this.i = view;
        this.j = ref;
        this.k = i;
        this.l = mutableState;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        View rootView = this.i.getRootView();
        rootView.getClass();
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.j.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.l);
        if (layoutCoordinates != null) {
            Rect rect = new Rect();
            rootView.getWindowVisibleDisplayFrame(rect);
            float f = LayoutCoordinatesKt.c(layoutCoordinates).b;
            int i = rect.top;
            anonymousClass1.invoke(Integer.valueOf(((int) Math.max(f - i, (rect.bottom - i) - LayoutCoordinatesKt.c(layoutCoordinates).d)) - this.k));
        }
        return az2.a;
    }
}
