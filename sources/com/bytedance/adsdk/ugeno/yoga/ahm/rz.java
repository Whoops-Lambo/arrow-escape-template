package com.bytedance.adsdk.ugeno.yoga.ahm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.ct;
import com.bytedance.adsdk.ugeno.kgy.fi;
import com.bytedance.adsdk.ugeno.kgy.yo;
import com.bytedance.adsdk.ugeno.yoga.gf;
import com.bytedance.adsdk.ugeno.yoga.kus;
import com.bytedance.adsdk.ugeno.yoga.noq;
import com.bytedance.adsdk.ugeno.yoga.nu;
import com.bytedance.adsdk.ugeno.yoga.ra;
import com.bytedance.adsdk.ugeno.yoga.twf;
import com.bytedance.adsdk.ugeno.yoga.uq;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class rz extends ViewGroup implements com.bytedance.adsdk.ugeno.ahm.ahm, yo {
    private final ra ahm;
    private final Map<View, ra> kgy;
    private ct rz;
    private fi uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy extends ViewGroup.LayoutParams {
        SparseArray<String> ahm;
        private float at;
        private float ct;
        private float dg;
        private float fi;
        private float fpp;
        private float gf;
        SparseArray<Float> kgy;
        private float kus;
        private float noq;
        private float nu;
        private float ra;
        private float rz;
        private float twf;
        private float um;
        private float uq;
        private float vs;
        private float xh;
        private float yo;

        public void ahm(float f) {
            this.fi = f;
            this.kgy.put(6, Float.valueOf(f));
        }

        public void at(float f) {
            this.uq = f;
            this.kgy.put(18, Float.valueOf(f));
        }

        public void ct(float f) {
            this.nu = f;
            this.kgy.put(9, Float.valueOf(f));
        }

        public void dg(float f) {
            this.um = f;
            this.kgy.put(27, Float.valueOf(f));
        }

        public void fi(float f) {
            this.kus = f;
            this.kgy.put(11, Float.valueOf(f));
        }

        public void gf(float f) {
            this.vs = f;
            this.kgy.put(12, Float.valueOf(f));
        }

        public void kgy(float f) {
            this.yo = f;
            this.kgy.put(5, Float.valueOf(f));
        }

        public void kus(float f) {
            this.noq = f;
            this.kgy.put(20, Float.valueOf(f));
        }

        public void noq(float f) {
            this.at = f;
            this.kgy.put(14, Float.valueOf(f));
        }

        public void nu(float f) {
            this.rz = f;
            this.kgy.put(17, Float.valueOf(f));
        }

        public void ra(float f) {
            this.dg = f;
            this.kgy.put(13, Float.valueOf(f));
        }

        public void rz(float f) {
            this.gf = f;
            this.kgy.put(7, Float.valueOf(f));
        }

        public void twf(float f) {
            this.ct = f;
            this.kgy.put(19, Float.valueOf(f));
        }

        public void uq(float f) {
            this.ra = f;
            this.kgy.put(8, Float.valueOf(f));
        }

        public void vs(float f) {
            this.xh = f;
            this.kgy.put(25, Float.valueOf(f));
        }

        public void xh(float f) {
            this.fpp = f;
            this.kgy.put(28, Float.valueOf(f));
        }

        public void yo(float f) {
            this.twf = f;
            this.kgy.put(10, Float.valueOf(f));
        }

        public kgy(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof kgy) {
                kgy kgyVar = (kgy) layoutParams;
                this.kgy = kgyVar.kgy.clone();
                this.ahm = kgyVar.ahm.clone();
                return;
            }
            this.kgy = new SparseArray<>();
            this.ahm = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.kgy.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.kgy.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public kgy(int i, int i2) {
            super(i, i2);
            this.kgy = new SparseArray<>();
            this.ahm = new SparseArray<>();
            if (i == -2 || i == -1 || i >= 0) {
                this.kgy.put(15, Float.valueOf(i));
            }
            if (i2 == -2 || i2 == -1 || i2 >= 0) {
                this.kgy.put(16, Float.valueOf(i2));
            }
        }
    }

    private void ahm(ra raVar, int i) {
        if (i == -1) {
            raVar.yo(100.0f);
        } else if (i == -2) {
            raVar.ct();
        } else {
            raVar.noq(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        kgy(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        kgy(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            kgy(getChildAt(i3), false);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            kgy(getChildAt(i3), true);
        }
        super.removeViewsInLayout(i, i2);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm implements com.bytedance.adsdk.ugeno.yoga.yo {
        @Override // com.bytedance.adsdk.ugeno.yoga.yo
        public long kgy(ra raVar, float f, com.bytedance.adsdk.ugeno.yoga.fi fiVar, float f2, com.bytedance.adsdk.ugeno.yoga.fi fiVar2) {
            View view = (View) raVar.ra();
            if (view != null && !(view instanceof rz)) {
                view.measure(View.MeasureSpec.makeMeasureSpec((int) f, kgy(fiVar)), View.MeasureSpec.makeMeasureSpec((int) f2, kgy(fiVar2)));
                return gf.kgy(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            return gf.kgy(0, 0);
        }

        private int kgy(com.bytedance.adsdk.ugeno.yoga.fi fiVar) {
            if (fiVar == com.bytedance.adsdk.ugeno.yoga.fi.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return fiVar == com.bytedance.adsdk.ugeno.yoga.fi.EXACTLY ? 1073741824 : 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ra raVarKgy;
        this.ahm.kgy((com.bytedance.adsdk.ugeno.yoga.yo) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.ahm.ahm) {
            throw null;
        }
        super.addView(view, i, layoutParams);
        if (this.kgy.containsKey(view)) {
            return;
        }
        if (view instanceof rz) {
            raVarKgy = ((rz) view).getYogaNode();
        } else {
            raVarKgy = this.kgy.containsKey(view) ? this.kgy.get(view) : nu.kgy();
            raVarKgy.kgy(view);
            raVarKgy.kgy((com.bytedance.adsdk.ugeno.yoga.yo) new ahm());
        }
        kgy((kgy) view.getLayoutParams(), raVarKgy, view);
        this.kgy.put(view, raVarKgy);
        int visibility = view.getVisibility();
        ra raVar = this.ahm;
        if (visibility == 8) {
            view.setTag(151060224, Integer.valueOf(raVar.kgy()));
        } else {
            raVar.kgy(raVarKgy, raVar.kgy());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kgy;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new kgy(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new kgy(layoutParams);
    }

    public float getBorderRadius() {
        return this.uq.kgy();
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getRipple() {
        return this.uq.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getRubIn() {
        return this.uq.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getShine() {
        return this.uq.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getStretch() {
        return this.uq.getStretch();
    }

    public ra getYogaNode() {
        return this.ahm;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ct ctVar = this.rz;
        if (ctVar != null) {
            ctVar.noq();
        }
        if (!(getParent() instanceof rz)) {
            kgy(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        }
        kgy(this.ahm, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ct ctVar2 = this.rz;
        if (ctVar2 != null) {
            ctVar2.kgy(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.uq.kgy(i);
    }

    public void setBorderRadius(float f) {
        this.uq.kgy(f);
    }

    public void setRipple(float f) {
        fi fiVar = this.uq;
        if (fiVar != null) {
            fiVar.ahm(f);
        }
    }

    public void setRubIn(float f) {
        fi fiVar = this.uq;
        if (fiVar != null) {
            fiVar.ct(f);
        }
    }

    public void setShine(float f) {
        fi fiVar = this.uq;
        if (fiVar != null) {
            fiVar.rz(f);
        }
    }

    public void setStretch(float f) {
        fi fiVar = this.uq;
        if (fiVar != null) {
            fiVar.uq(f);
        }
    }

    public rz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.uq = new fi(this);
        ra raVarKgy = nu.kgy();
        this.ahm = raVarKgy;
        this.kgy = new HashMap();
        raVarKgy.kgy(this);
        raVarKgy.kgy((com.bytedance.adsdk.ugeno.yoga.yo) new ahm());
        kgy((kgy) generateDefaultLayoutParams(), raVarKgy, this);
    }

    public static void kgy(kgy kgyVar, ra raVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            raVar.kgy(com.bytedance.adsdk.ugeno.yoga.rz.LTR);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                raVar.ahm(uq.LEFT, rect.left);
                raVar.ahm(uq.TOP, rect.top);
                raVar.ahm(uq.RIGHT, rect.right);
                raVar.ahm(uq.BOTTOM, rect.bottom);
            }
        }
        for (int i = 0; i < kgyVar.kgy.size(); i++) {
            int iKeyAt = kgyVar.kgy.keyAt(i);
            float fFloatValue = kgyVar.kgy.valueAt(i).floatValue();
            if (iKeyAt == 4) {
                raVar.rz(com.bytedance.adsdk.ugeno.yoga.kgy.kgy(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                raVar.kgy(com.bytedance.adsdk.ugeno.yoga.kgy.kgy(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                raVar.ahm(com.bytedance.adsdk.ugeno.yoga.kgy.kgy(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                raVar.at(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    raVar.rz();
                } else {
                    raVar.rz(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                raVar.kgy(com.bytedance.adsdk.ugeno.yoga.ct.kgy(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                raVar.kgy(fFloatValue);
            } else if (iKeyAt == 7) {
                raVar.ahm(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    raVar.yo(100.0f);
                } else if (fFloatValue == -2.0f) {
                    raVar.ct();
                } else {
                    raVar.noq(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                raVar.kgy(uq.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                raVar.kgy(noq.kgy(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                raVar.kgy(uq.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                raVar.kgy(uq.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                raVar.kgy(uq.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                raVar.gf(fFloatValue);
            } else if (iKeyAt == 27) {
                raVar.fi(fFloatValue);
            } else if (iKeyAt == 22) {
                raVar.ahm(uq.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                raVar.ahm(uq.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                raVar.ahm(uq.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                raVar.ahm(uq.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                raVar.rz(uq.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                raVar.rz(uq.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                raVar.rz(uq.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                raVar.rz(uq.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                raVar.kgy(twf.kgy(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    raVar.ct(100.0f);
                } else if (fFloatValue == -2.0f) {
                    raVar.uq();
                } else {
                    raVar.uq(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                raVar.kgy(kus.kgy(Math.round(fFloatValue)));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ct ctVar = this.rz;
        if (ctVar != null) {
            ctVar.ahm(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ct ctVar = this.rz;
        if (ctVar != null) {
            ctVar.yo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ct ctVar = this.rz;
        if (ctVar != null) {
            ctVar.fi();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ct ctVar = this.rz;
        if (ctVar != null) {
            ctVar.kgy(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!(getParent() instanceof rz)) {
            kgy(i, i2);
        }
        ct ctVar = this.rz;
        if (ctVar != null) {
            int[] iArrKgy = ctVar.kgy(i, i2);
            setMeasuredDimension(iArrKgy[0], iArrKgy[1]);
        } else {
            setMeasuredDimension(Math.round(this.ahm.fi()), Math.round(this.ahm.gf()));
        }
        ct ctVar2 = this.rz;
        if (ctVar2 != null) {
            ctVar2.ct();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ct ctVar = this.rz;
        if (ctVar != null) {
            ctVar.ahm(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ct ctVar = this.rz;
        if (ctVar != null) {
            ctVar.kgy(z);
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            kgy(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            kgy(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        kgy(getChildAt(i), false);
        super.removeViewAt(i);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.ahm
    public void rz(View view, int i) {
        uq(view, i);
    }

    public void uq(View view, int i) {
        int iKgy;
        view.setVisibility(i);
        try {
            ra raVar = this.kgy.get(view);
            Object tag = view.getTag(151060224);
            if (i == 0) {
                if (tag != null && this.ahm.kgy(raVar) == -1) {
                    int iIntValue = ((Integer) tag).intValue();
                    int iKgy2 = this.ahm.kgy();
                    ra raVar2 = this.ahm;
                    if (iIntValue < iKgy2) {
                        raVar2.kgy(this.kgy.get(view), iIntValue);
                    } else {
                        raVar2.kgy(this.kgy.get(view), this.ahm.kgy());
                    }
                    kgy(this.ahm);
                    return;
                }
                return;
            }
            if (i == 8 && (iKgy = this.ahm.kgy(raVar)) != -1) {
                this.ahm.ahm(iKgy);
                view.setTag(151060224, Integer.valueOf(iKgy));
                kgy(this.ahm);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.ahm
    public void ahm(View view, int i) {
        ra raVarKgy;
        if (view == null || (raVarKgy = kgy(view)) == null) {
            return;
        }
        ahm(raVarKgy, i);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.ahm
    public void ahm(int i) {
        ra raVar = this.ahm;
        if (raVar != null) {
            ahm(raVar, i);
            requestLayout();
        }
    }

    public rz(Context context) {
        this(context, null, 0);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.ahm
    public void kgy(int i) {
        ra raVar = this.ahm;
        if (raVar != null) {
            kgy(raVar, i);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.ahm
    public void kgy(View view, int i) {
        ra raVarKgy;
        if (view == null || (raVarKgy = kgy(view)) == null) {
            return;
        }
        kgy(raVarKgy, i);
        view.requestLayout();
    }

    private void kgy(ra raVar, int i) {
        if (i == -1) {
            raVar.ct(100.0f);
        } else if (i == -2) {
            raVar.uq();
        } else {
            raVar.uq(i);
        }
    }

    private void kgy(ra raVar) {
        if (raVar.ahm() != null) {
            kgy(raVar.ahm());
        } else {
            raVar.kgy(Float.NaN, Float.NaN);
        }
    }

    private void kgy(View view, boolean z) {
        try {
            ra raVar = this.kgy.get(view);
            if (raVar == null) {
                return;
            }
            ra raVarAhm = raVar.ahm();
            for (int i = 0; i < raVarAhm.kgy(); i++) {
                if (raVarAhm.kgy(i).equals(raVar)) {
                    raVarAhm.ahm(i);
                    break;
                }
            }
            raVar.kgy((Object) null);
            this.kgy.remove(view);
            if (z) {
                this.ahm.kgy(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    private void kgy(ra raVar, float f, float f2) {
        View view = (View) raVar.ra();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(raVar.noq() + f);
            int iRound2 = Math.round(raVar.yo() + f2);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(raVar.fi()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(raVar.gf()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iKgy = raVar.kgy();
        for (int i = 0; i < iKgy; i++) {
            if (equals(view)) {
                kgy(raVar.kgy(i), f, f2);
            } else if (!(view instanceof rz)) {
                kgy(raVar.kgy(i), raVar.noq() + f, raVar.yo() + f2);
            }
        }
    }

    private void kgy(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            this.ahm.noq(size2);
        }
        if (mode == 1073741824) {
            this.ahm.uq(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.ahm.nu(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.ahm.ra(size);
        }
        this.ahm.kgy(Float.NaN, Float.NaN);
    }

    public ra kgy(View view) {
        return this.kgy.get(view);
    }

    public void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        this.rz = rzVar;
    }
}
