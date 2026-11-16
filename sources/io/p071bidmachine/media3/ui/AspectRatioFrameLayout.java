package io.p071bidmachine.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final /* synthetic */ int d = 0;
    public final b a;
    public float b;
    public int c;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    public void setAspectRatioListener(@Nullable a aVar) {
    }

    public int getResizeMode() {
        return this.c;
    }

    public void setAspectRatio(float f) {
        if (this.b != f) {
            this.b = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e0.a, 0, 0);
            try {
                this.c = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.a = new b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r4 > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        r2 = r2 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r1 = r1 / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r4 > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L23;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.b
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            goto L38
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.b
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 1
            io.bidmachine.media3.ui.b r6 = r8.a
            if (r3 > 0) goto L39
            boolean r8 = r6.b
            if (r8 != 0) goto L38
            r6.b = r5
            java.lang.Object r8 = r6.c
            io.bidmachine.media3.ui.AspectRatioFrameLayout r8 = (io.p071bidmachine.media3.ui.AspectRatioFrameLayout) r8
            r8.post(r6)
        L38:
            return
        L39:
            int r3 = r8.c
            if (r3 == 0) goto L5a
            if (r3 == r5) goto L56
            r7 = 2
            if (r3 == r7) goto L52
            r7 = 4
            if (r3 == r7) goto L46
            goto L61
        L46:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            float r3 = r8.b
            if (r10 <= 0) goto L4f
        L4c:
            float r2 = r2 * r3
        L4d:
            int r9 = (int) r2
            goto L61
        L4f:
            float r1 = r1 / r3
        L50:
            int r0 = (int) r1
            goto L61
        L52:
            float r9 = r8.b
            float r2 = r2 * r9
            goto L4d
        L56:
            float r10 = r8.b
            float r1 = r1 / r10
            goto L50
        L5a:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            float r3 = r8.b
            if (r10 <= 0) goto L4c
            goto L4f
        L61:
            boolean r10 = r6.b
            if (r10 != 0) goto L6e
            r6.b = r5
            java.lang.Object r10 = r6.c
            io.bidmachine.media3.ui.AspectRatioFrameLayout r10 = (io.p071bidmachine.media3.ui.AspectRatioFrameLayout) r10
            r10.post(r6)
        L6e:
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.p071bidmachine.media3.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }
}
