package io.p071bidmachine.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.facebook.internal.v;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.p071bidmachine.media3.common.n0;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.w;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e extends View {
    public int A;
    public long B;
    public int C;
    public Rect D;
    public final ValueAnimator E;
    public float F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long[] N;
    public boolean[] O;
    public final Rect a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Drawable k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final StringBuilder u;
    public final Formatter v;
    public final v w;
    public final CopyOnWriteArraySet x;
    public final Point y;
    public final float z;

    public static int a(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.G ? 0 : this.s;
        int i8 = this.n;
        int i9 = this.l;
        int i10 = this.m;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.b.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (x.a >= 29 && ((rect = this.D) == null || rect.width() != i5 || this.D.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    public e(Context context) {
        super(context, null, 0);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.g = paint3;
        Paint paint4 = new Paint();
        this.h = paint4;
        Paint paint5 = new Paint();
        this.i = paint5;
        Paint paint6 = new Paint();
        this.j = paint6;
        paint6.setAntiAlias(true);
        this.x = new CopyOnWriteArraySet();
        this.y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.z = f;
        this.t = a(f, -50);
        int iA = a(f, 4);
        int iA2 = a(f, 26);
        int iA3 = a(f, 4);
        int iA4 = a(f, 12);
        int iA5 = a(f, 0);
        int iA6 = a(f, 16);
        this.l = iA;
        this.m = iA2;
        this.n = 0;
        this.o = iA3;
        this.p = iA4;
        this.q = iA5;
        this.r = iA6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
        paint3.setColor(DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
        paint4.setColor(DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
        paint5.setColor(DefaultTimeBar.DEFAULT_PLAYED_AD_MARKER_COLOR);
        this.k = null;
        StringBuilder sb = new StringBuilder();
        this.u = sb;
        this.v = new Formatter(sb, Locale.getDefault());
        this.w = new v(this, 27);
        this.s = (Math.max(iA5, Math.max(iA4, iA6)) + 1) / 2;
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new o0(this, 1));
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private long getPositionIncrement() {
        long j = this.B;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.J;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.A);
    }

    private String getProgressText() {
        return x.A(this.u, this.v, this.K);
    }

    private long getScrubberPosition() {
        Rect rect = this.b;
        if (rect.width() <= 0 || this.J == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.d.width()) * this.J) / ((long) rect.width());
    }

    public final boolean b(long j) {
        long j2 = this.J;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.H ? this.I : this.K;
        long jI = x.i(j3 + j, 0L, j2);
        if (jI == j3) {
            return false;
        }
        if (this.H) {
            f(jI);
        } else {
            c(jI);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.I = j;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            r rVar = ((g) ((k0) it.next())).a;
            rVar.p0 = true;
            TextView textView = rVar.D;
            if (textView != null) {
                textView.setText(x.A(rVar.F, rVar.G, j));
            }
            rVar.a.f();
        }
    }

    public final void d(boolean z) {
        n0 n0Var;
        removeCallbacks(this.w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        for (k0 k0Var : this.x) {
            long j = this.I;
            r rVar = ((g) k0Var).a;
            rVar.p0 = false;
            if (!z && (n0Var = rVar.j0) != null) {
                if (rVar.o0) {
                    w wVar = (w) n0Var;
                    if (wVar.r(17) && wVar.r(10)) {
                        r0 r0VarJ = wVar.j();
                        int iO = r0VarJ.o();
                        int i = 0;
                        while (true) {
                            long jX = x.X(r0VarJ.m(i, rVar.I, 0L).l);
                            if (j < jX) {
                                break;
                            }
                            if (i == iO - 1) {
                                j = jX;
                                break;
                            } else {
                                j -= jX;
                                i++;
                            }
                        }
                        wVar.B(j, i, false);
                    }
                } else {
                    w wVar2 = (w) n0Var;
                    if (wVar2.r(5)) {
                        wVar2.B(j, wVar2.g(), false);
                    }
                }
                rVar.o();
            }
            rVar.a.g();
        }
    }

    public final void e() {
        Rect rect = this.c;
        Rect rect2 = this.b;
        rect.set(rect2);
        Rect rect3 = this.d;
        rect3.set(rect2);
        long j = this.H ? this.I : this.K;
        if (this.J > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.L) / this.J)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.J)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.a);
    }

    public final void f(long j) {
        if (this.I == j) {
            return;
        }
        this.I = j;
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            r rVar = ((g) ((k0) it.next())).a;
            TextView textView = rVar.D;
            if (textView != null) {
                textView.setText(x.A(rVar.F, rVar.G, j));
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.b.width() / this.z);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.J;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iWidth);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        canvas.save();
        Rect rect = this.b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.J;
        Paint paint = this.g;
        Rect rect2 = this.d;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.c;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.e);
            }
            if (this.M != 0) {
                long[] jArr = this.N;
                jArr.getClass();
                boolean[] zArr = this.O;
                zArr.getClass();
                int i6 = this.o;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.M) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * x.i(jArr[i9], 0L, this.J)) / this.J)) - i7)) + rect.left;
                    int i10 = i9;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.i : this.h);
                    i9 = i10 + 1;
                    i8 = i8;
                }
            }
            canvas2 = canvas;
        }
        if (this.J > 0) {
            int iH = x.h(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.k;
            if (drawable == null) {
                if (this.H || isFocused()) {
                    i = this.r;
                } else {
                    i = isEnabled() ? this.p : this.q;
                }
                canvas2.drawCircle(iH, iCenterY2, (int) ((i * this.F) / 2.0f), this.j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.F)) / 2;
                drawable.setBounds(iH - intrinsicWidth, iCenterY2 - intrinsicHeight, iH + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.k;
        if (drawable == null || x.a < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.h.setColor(i);
        invalidate(this.a);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.f.setColor(i);
        invalidate(this.a);
    }

    public void setBufferedPosition(long j) {
        if (this.L == j) {
            return;
        }
        this.L = j;
        e();
    }

    public void setDuration(long j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        if (this.H && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    public void setKeyCountIncrement(int i) {
        a.c(i > 0);
        this.A = i;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        a.c(j > 0);
        this.A = -1;
        this.B = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.i.setColor(i);
        invalidate(this.a);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.e.setColor(i);
        invalidate(this.a);
    }

    public void setPosition(long j) {
        if (this.K == j) {
            return;
        }
        this.K = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.j.setColor(i);
        invalidate(this.a);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.g.setColor(i);
        invalidate(this.a);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.H && !z) {
            d(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (b(positionIncrement)) {
                            v vVar = this.w;
                            removeCallbacks(vVar);
                            postDelayed(vVar, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (b(positionIncrement)) {
                            v vVar2 = this.w;
                            removeCallbacks(vVar2);
                            postDelayed(vVar2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.H) {
                            d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.H) {
                d(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.m;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (isEnabled() && this.J > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.y;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.b;
            Rect rect2 = this.d;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            if (this.H) {
                                if (motionEvent.getAction() == 3) {
                                    z = true;
                                }
                                d(z);
                                return true;
                            }
                        }
                    } else if (this.H) {
                        if (i2 < this.t) {
                            int i3 = this.C;
                            rect2.right = x.h(((i - i3) / 3) + i3, rect.left, rect.right);
                        } else {
                            this.C = i;
                            rect2.right = x.h(i, rect.left, rect.right);
                        }
                        f(getScrubberPosition());
                        e();
                        invalidate();
                        return true;
                    }
                } else if (this.H) {
                    if (motionEvent.getAction() == 3) {
                        z = true;
                    }
                    d(z);
                    return true;
                }
            } else {
                int i4 = i;
                if (this.a.contains(i4, i2)) {
                    rect2.right = x.h(i4, rect.left, rect.right);
                    c(getScrubberPosition());
                    e();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.H && !z) {
            d(true);
        }
    }
}
