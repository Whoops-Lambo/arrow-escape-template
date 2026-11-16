package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8 extends FrameLayout {
    public int a;
    public int b;
    public int c;
    public int d;
    public Cg e;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setOnPositionChangeListener(@Nullable Cg cg) {
        this.e = cg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(Context context) {
        super(context, null);
        context.getClass();
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i != this.a || i2 != this.b || i5 != this.c || i6 != this.d) {
            this.a = i;
            this.b = i2;
            this.c = i5;
            this.d = i6;
            Cg cg = this.e;
            if (cg != null) {
                cg.a(i, i2, i5, i6);
            }
        }
    }
}
