package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import defpackage.n8;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureModifier;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ExcludeFromSystemGestureModifier implements OnGloballyPositionedModifier {
    public final View a;
    public Rect b;

    public final void b(Rect rect) {
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new Rect[16];
        mutableVector.c = 0;
        View view = this.a;
        List systemGestureExclusionRects = view.getSystemGestureExclusionRects();
        systemGestureExclusionRects.getClass();
        int i = mutableVector.c;
        if (!systemGestureExclusionRects.isEmpty()) {
            mutableVector.k(systemGestureExclusionRects.size() + mutableVector.c);
            Object[] objArr = mutableVector.a;
            if (i != mutableVector.c) {
                n8.P(systemGestureExclusionRects.size() + i, i, mutableVector.c, objArr, objArr);
            }
            int size = systemGestureExclusionRects.size();
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i + i2] = systemGestureExclusionRects.get(i2);
            }
            mutableVector.c = systemGestureExclusionRects.size() + mutableVector.c;
        }
        Rect rect2 = this.b;
        if (rect2 != null) {
            mutableVector.o(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            mutableVector.b(rect);
        }
        view.setSystemGestureExclusionRects(mutableVector.e());
        this.b = rect;
    }

    public ExcludeFromSystemGestureModifier(View view) {
        view.getClass();
        this.a = view;
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public final void x0(LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        b(RectHelper_androidKt.a(LayoutCoordinatesKt.b(layoutCoordinates)));
    }
}
