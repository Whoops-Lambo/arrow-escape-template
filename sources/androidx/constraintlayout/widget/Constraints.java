package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float r0;
        public boolean s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.r0 = 1.0f;
        layoutParams.s0 = false;
        layoutParams.t0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.u0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.v0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.w0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.x0 = 1.0f;
        layoutParams.y0 = 1.0f;
        layoutParams.z0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.A0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.B0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.C0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.D0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.r0 = 1.0f;
        layoutParams.s0 = false;
        layoutParams.t0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.u0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.v0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.w0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.x0 = 1.0f;
        layoutParams.y0 = 1.0f;
        layoutParams.z0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.A0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.B0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.C0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.D0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 15) {
                layoutParams.r0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.r0);
            } else if (index == 28) {
                layoutParams.t0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.t0);
                layoutParams.s0 = true;
            } else if (index == 23) {
                layoutParams.v0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.v0);
            } else if (index == 24) {
                layoutParams.w0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.w0);
            } else if (index == 22) {
                layoutParams.u0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.u0);
            } else if (index == 20) {
                layoutParams.x0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.x0);
            } else if (index == 21) {
                layoutParams.y0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.y0);
            } else if (index == 16) {
                layoutParams.z0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.z0);
            } else if (index == 17) {
                layoutParams.A0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.A0);
            } else if (index == 18) {
                layoutParams.B0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.B0);
            } else if (index == 19) {
                layoutParams.C0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.C0);
            } else if (index == 27) {
                layoutParams.D0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.D0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    public ConstraintSet getConstraintSet() {
        getChildCount();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }
}
