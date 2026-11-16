package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;

    @Nullable
    private AspectRatioListener aspectRatioListener;
    private final a aspectRatioUpdateDispatcher;
    private int resizeMode;
    private float videoAspectRatio;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface AspectRatioListener {
        void onAspectRatioUpdated(float f, float f2, boolean z);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me);
        return super.dispatchTouchEvent(me);
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    public void setAspectRatio(float f) {
        if (this.videoAspectRatio != f) {
            this.videoAspectRatio = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioListener aspectRatioListener) {
        this.aspectRatioListener = aspectRatioListener;
    }

    public void setResizeMode(int i) {
        if (this.resizeMode != i) {
            this.resizeMode = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.resizeMode = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.resizeMode = typedArrayObtainStyledAttributes.getInt(R.styleable.AspectRatioFrameLayout_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.aspectRatioUpdateDispatcher = new a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r4 > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r2 = r2 * r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        r1 = r1 / r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r4 > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L23;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.videoAspectRatio
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            goto L3f
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.videoAspectRatio
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            r6 = 1
            if (r5 > 0) goto L40
            com.google.android.exoplayer2.ui.a r9 = r8.aspectRatioUpdateDispatcher
            float r8 = r8.videoAspectRatio
            r9.a = r8
            r9.b = r3
            r8 = 0
            r9.c = r8
            boolean r8 = r9.d
            if (r8 != 0) goto L3f
            r9.d = r6
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r8 = r9.e
            r8.post(r9)
        L3f:
            return
        L40:
            int r5 = r8.resizeMode
            if (r5 == 0) goto L61
            if (r5 == r6) goto L5d
            r7 = 2
            if (r5 == r7) goto L59
            r7 = 4
            if (r5 == r7) goto L4d
            goto L68
        L4d:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            float r4 = r8.videoAspectRatio
            if (r10 <= 0) goto L56
        L53:
            float r2 = r2 * r4
        L54:
            int r9 = (int) r2
            goto L68
        L56:
            float r1 = r1 / r4
        L57:
            int r0 = (int) r1
            goto L68
        L59:
            float r9 = r8.videoAspectRatio
            float r2 = r2 * r9
            goto L54
        L5d:
            float r10 = r8.videoAspectRatio
            float r1 = r1 / r10
            goto L57
        L61:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            float r4 = r8.videoAspectRatio
            if (r10 <= 0) goto L53
            goto L56
        L68:
            com.google.android.exoplayer2.ui.a r10 = r8.aspectRatioUpdateDispatcher
            float r1 = r8.videoAspectRatio
            r10.a = r1
            r10.b = r3
            r10.c = r6
            boolean r1 = r10.d
            if (r1 != 0) goto L7d
            r10.d = r6
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r1 = r10.e
            r1.post(r10)
        L7d:
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }
}
