package com.adsurge.adn.p058t0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.adsurge.adn.p032j0.g;
import com.adsurge.adn.p038l0.f;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p041m0.d;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class b extends LinearLayout implements f {
    public i a;
    public boolean b;
    public final float c;
    public int d;
    public int e;
    public ValueAnimator f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            b bVar = b.this;
            if (bVar.d >= bVar.e) {
                bVar.d = 0;
            }
            bVar.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.t0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0139b implements Runnable {
        public final /* synthetic */ boolean a;

        public RunnableC0139b(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a && b.this.isAttachedToWindow()) {
                b.this.e();
            } else {
                b.this.b();
            }
        }
    }

    public final int a() {
        int i;
        int i2;
        int iD = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            int measuredWidth = childAt.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                i2 = marginLayoutParams.leftMargin;
                i = marginLayoutParams.rightMargin;
            } else {
                i = 0;
                i2 = 0;
            }
            iD = h50.d(measuredWidth, i2, i, iD);
        }
        return iD;
    }

    @Override // com.adsurge.adn.p038l0.f
    public void setPerfCollector(com.adsurge.adn.p050p0.b bVar) {
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f.pause();
    }

    public void d() {
        if (this.f != null) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.e);
        this.f = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration((int) ((((double) this.e) * 1.0d) / ((double) this.c)));
        this.f.setInterpolator(new LinearInterpolator());
        this.f.setRepeatCount(-1);
        this.f.addUpdateListener(new a());
        this.f.start();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int width;
        int height;
        i iVar = this.a;
        d dVarU = iVar == null ? null : iVar.u();
        if (dVarU != null) {
            width = getWidth();
            height = getHeight();
            dVarU.a(canvas, width, height);
        } else {
            width = 0;
            height = 0;
        }
        super.draw(canvas);
        if (dVarU != null) {
            dVarU.b(canvas, width, height);
        }
    }

    public final void e() {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator == null) {
            if (c()) {
                d();
            }
        } else if (valueAnimator.isPaused()) {
            this.f.resume();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        com.adsurge.adn.p050p0.d dVarX;
        i iVar = this.a;
        if (iVar == null || (dVarX = iVar.x()) == null) {
            super.onMeasure(i, i2);
            return;
        }
        Pair pairB = dVarX.b(i, i2);
        super.onMeasure(((Integer) pairB.first).intValue(), ((Integer) pairB.second).intValue());
        Pair pairA = dVarX.a(i, i2);
        if (pairA != null) {
            super.onMeasure(((Integer) pairA.first).intValue(), ((Integer) pairA.second).intValue());
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        i iVar = this.a;
        if (iVar != null) {
            iVar.a(view, i);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.a.f(i);
    }

    @Override // com.adsurge.adn.p038l0.e
    public void setViewNode(i iVar) {
        this.a = iVar;
    }

    public b(Context context) {
        super(context);
        this.b = true;
        this.d = 0;
        this.e = 0;
        this.c = (g.a() * 30.0f) / 1000.0f;
    }

    public final boolean c() {
        int i;
        if ((getChildCount() > 0 && (i = this.e) > 0 && i <= getWidth() && this.b) || this.e > getWidth()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int height;
        int i4;
        if (!c()) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        int width = -this.d;
        while (width < getWidth()) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i2 = marginLayoutParams.leftMargin;
                    i3 = marginLayoutParams.rightMargin;
                    height = marginLayoutParams.topMargin;
                    i = marginLayoutParams.bottomMargin;
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    height = 0;
                }
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    i4 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                } else {
                    i4 = -1;
                }
                int i6 = i4 & 112;
                if (i6 != 16) {
                    if (i6 == 80) {
                        height = (getHeight() - childAt.getMeasuredHeight()) - i;
                    }
                } else {
                    height += (((getHeight() - childAt.getMeasuredHeight()) - height) - i) / 2;
                }
                if (childAt.getWidth() + width + i2 + i3 > 0 && width < getWidth()) {
                    canvas.save();
                    canvas.translate(width + i2, height);
                    childAt.draw(canvas);
                    canvas.restore();
                }
                width += childAt.getWidth() + i2 + i3;
                if (width >= getWidth() + this.e) {
                    break;
                }
            }
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e = a();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a(z);
    }

    public void b(boolean z) {
        this.b = z;
    }

    public final void a(boolean z) {
        post(new RunnableC0139b(z));
    }
}
