package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import defpackage.az2;
import defpackage.fy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/relocation/AndroidBringIntoViewParent;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class AndroidBringIntoViewParent implements BringIntoViewParent {
    public final View a;

    public AndroidBringIntoViewParent(View view) {
        view.getClass();
        this.a = view;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    public final Object b(Rect rect, LayoutCoordinates layoutCoordinates, fy fyVar) {
        Rect rectG = rect.g(LayoutCoordinatesKt.e(layoutCoordinates));
        this.a.requestRectangleOnScreen(new android.graphics.Rect((int) rectG.a, (int) rectG.b, (int) rectG.c, (int) rectG.d), false);
        return az2.a;
    }
}
