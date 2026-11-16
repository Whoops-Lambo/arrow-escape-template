package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void c(CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.h == 0) {
            layoutParams.h = 80;
        }
    }

    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean b(View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        e32.i("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
