package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.ecffri.arrows.R;
import defpackage.au;
import defpackage.f63;
import defpackage.ip2;
import defpackage.ki1;
import defpackage.ni1;
import defpackage.nq2;
import defpackage.os2;
import defpackage.r12;
import defpackage.sb0;
import defpackage.uj;
import defpackage.v7;
import defpackage.xt;
import defpackage.y6;
import defpackage.yt;
import defpackage.zf0;
import defpackage.zt;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public WindowInsetsCompat A;
    public int B;
    public boolean C;
    public int D;
    public boolean E;
    public boolean a;
    public final int b;
    public ViewGroup c;
    public View d;
    public View e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final Rect j;
    public final xt k;
    public final zf0 l;
    public boolean m;
    public boolean n;
    public Drawable o;
    public Drawable p;
    public int q;
    public boolean r;
    public ValueAnimator s;
    public long t;
    public final TimeInterpolator u;
    public final TimeInterpolator v;
    public int w;
    public zt x;
    public int y;
    public int z;

    public final void a() {
        View view;
        if (this.a) {
            ViewGroup viewGroup = null;
            this.c = null;
            this.d = null;
            int i = this.b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                            view = view;
                        }
                    }
                    this.d = view;
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.c = viewGroup;
            }
            c();
            this.a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.m && (view = this.e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e);
            }
        }
        if (!this.m || this.c == null) {
            return;
        }
        if (this.e == null) {
            this.e = new View(getContext());
        }
        if (this.e.getParent() == null) {
            this.c.addView(this.e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof yt;
    }

    public final void d() {
        if (this.o == null && this.p == null) {
            return;
        }
        setScrimsShown(getHeight() + this.y < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.o;
        if (drawable == null || this.q <= 0 || ((view2 = this.d) == null || view2 == this ? view != this.c : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.z == 1 && view != null && this.m) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.o.mutate().setAlpha(this.q);
            this.o.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    public final void e(int i, int i2, int i3, int i4, boolean z) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.m || (view = this.e) == null) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.a;
        int titleMarginStart = 0;
        boolean z2 = view.isAttachedToWindow() && this.e.getVisibility() == 0;
        this.n = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.d;
            if (view2 == null) {
                view2 = this.c;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((yt) view2.getLayoutParams())).bottomMargin;
            View view3 = this.e;
            Rect rect = this.j;
            sb0.a(this, view3, rect);
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.top + height + titleMarginTop;
            int i7 = rect.right;
            if (!z3) {
                titleMarginStart = titleMarginEnd;
            }
            int i8 = i7 - titleMarginStart;
            int i9 = (rect.bottom + height) - titleMarginBottom;
            xt xtVar = this.k;
            Rect rect2 = xtVar.h;
            if (rect2.left != i5 || rect2.top != i6 || rect2.right != i8 || rect2.bottom != i9) {
                rect2.set(i5, i6, i8, i9);
                xtVar.S = true;
            }
            int i10 = z3 ? this.h : this.f;
            int i11 = rect.top + this.g;
            int i12 = (i3 - i) - (z3 ? this.f : this.h);
            int i13 = (i4 - i2) - this.i;
            Rect rect3 = xtVar.g;
            if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                rect3.set(i10, i11, i12, i13);
                xtVar.S = true;
            }
            xtVar.i(z);
        }
    }

    public final void f() {
        CharSequence title;
        if (this.c != null && this.m && TextUtils.isEmpty(this.k.G)) {
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                title = ((Toolbar) viewGroup).getTitle();
            } else {
                title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            setTitle(title);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        yt ytVar = new yt(-1, -1);
        ytVar.a = 0;
        ytVar.b = 0.5f;
        return ytVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        yt ytVar = new yt(context, attributeSet);
        ytVar.a = 0;
        ytVar.b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r12.j);
        ytVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        ytVar.b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return ytVar;
    }

    public int getCollapsedTitleGravity() {
        return this.k.k;
    }

    public float getCollapsedTitleTextSize() {
        return this.k.m;
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.k.w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.o;
    }

    public int getExpandedTitleGravity() {
        return this.k.j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    public float getExpandedTitleTextSize() {
        return this.k.l;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.k.z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @RequiresApi
    @RestrictTo
    public int getHyphenationFrequency() {
        return this.k.q0;
    }

    @RestrictTo
    public int getLineCount() {
        StaticLayout staticLayout = this.k.i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @RequiresApi
    @RestrictTo
    public float getLineSpacingAdd() {
        return this.k.i0.getSpacingAdd();
    }

    @RequiresApi
    @RestrictTo
    public float getLineSpacingMultiplier() {
        return this.k.i0.getSpacingMultiplier();
    }

    @RestrictTo
    public int getMaxLines() {
        return this.k.n0;
    }

    public int getScrimAlpha() {
        return this.q;
    }

    public long getScrimAnimationDuration() {
        return this.t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.w;
        if (i >= 0) {
            return i + this.B + this.D;
        }
        WindowInsetsCompat windowInsetsCompat = this.A;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        WeakHashMap weakHashMap = ViewCompat.a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + systemWindowInsetTop, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.p;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.m) {
            return this.k.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.z;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.k.V;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.k.F;
    }

    public void setCollapsedTitleGravity(int i) {
        this.k.l(i);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i) {
        this.k.k(i);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        xt xtVar = this.k;
        if (xtVar.o != colorStateList) {
            xtVar.o = colorStateList;
            xtVar.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        xt xtVar = this.k;
        if (xtVar.m != f) {
            xtVar.m = f;
            xtVar.i(false);
        }
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        xt xtVar = this.k;
        if (xtVar.m(typeface)) {
            xtVar.i(false);
        }
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.o = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                if (this.z == 1 && viewGroup != null && this.m) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.o.setCallback(this);
                this.o.setAlpha(this.q);
            }
            WeakHashMap weakHashMap = ViewCompat.a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(@ColorInt int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setExpandedTitleGravity(int i) {
        xt xtVar = this.k;
        if (xtVar.j != i) {
            xtVar.j = i;
            xtVar.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.g = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i) {
        this.k.n(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        xt xtVar = this.k;
        if (xtVar.n != colorStateList) {
            xtVar.n = colorStateList;
            xtVar.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        xt xtVar = this.k;
        if (xtVar.l != f) {
            xtVar.l = f;
            xtVar.i(false);
        }
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        xt xtVar = this.k;
        if (xtVar.o(typeface)) {
            xtVar.i(false);
        }
    }

    @RestrictTo
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.E = z;
    }

    @RestrictTo
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.C = z;
    }

    @RequiresApi
    @RestrictTo
    public void setHyphenationFrequency(int i) {
        this.k.q0 = i;
    }

    @RequiresApi
    @RestrictTo
    public void setLineSpacingAdd(float f) {
        this.k.o0 = f;
    }

    @RequiresApi
    @RestrictTo
    public void setLineSpacingMultiplier(@FloatRange float f) {
        this.k.p0 = f;
    }

    @RestrictTo
    public void setMaxLines(int i) {
        xt xtVar = this.k;
        if (i != xtVar.n0) {
            xtVar.n0 = i;
            Bitmap bitmap = xtVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                xtVar.K = null;
            }
            xtVar.i(false);
        }
    }

    @RestrictTo
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.k.J = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.q) {
            if (this.o != null && (viewGroup = this.c) != null) {
                WeakHashMap weakHashMap = ViewCompat.a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.q = i;
            WeakHashMap weakHashMap2 = ViewCompat.a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(@IntRange long j) {
        this.t = j;
    }

    public void setScrimVisibleHeightTrigger(@IntRange int i) {
        if (this.w != i) {
            this.w = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap weakHashMap = ViewCompat.a;
        int i = 1;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.r != z) {
            if (z2) {
                int i2 = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.s;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.s = valueAnimator2;
                    valueAnimator2.setInterpolator(i2 > this.q ? this.u : this.v);
                    this.s.addUpdateListener(new uj(this, i));
                } else if (valueAnimator.isRunning()) {
                    this.s.cancel();
                }
                this.s.setDuration(this.t);
                this.s.setIntValues(this.q, i2);
                this.s.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.r = z;
        }
    }

    @RequiresApi
    @RestrictTo
    public void setStaticLayoutBuilderConfigurer(@Nullable au auVar) {
        xt xtVar = this.k;
        if (auVar != null) {
            xtVar.i(true);
        } else {
            xtVar.getClass();
        }
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                Drawable drawable3 = this.p;
                WeakHashMap weakHashMap = ViewCompat.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.p.setVisible(getVisibility() == 0, false);
                this.p.setCallback(this);
                this.p.setAlpha(this.q);
            }
            WeakHashMap weakHashMap2 = ViewCompat.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        xt xtVar = this.k;
        if (charSequence == null || !TextUtils.equals(xtVar.G, charSequence)) {
            xtVar.G = charSequence;
            xtVar.H = null;
            Bitmap bitmap = xtVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                xtVar.K = null;
            }
            xtVar.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.z = i;
        boolean z = i == 1;
        this.k.c = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.z == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.o == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        xt xtVar = this.k;
        xtVar.F = truncateAt;
        xtVar.i(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.m) {
            this.m = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        xt xtVar = this.k;
        xtVar.V = timeInterpolator;
        xtVar.i(false);
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i;
        ColorStateList colorStateListA;
        ColorStateList colorStateListA2;
        TextUtils.TruncateAt truncateAt;
        super(os2.G(context, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar), attributeSet, R.attr.collapsingToolbarLayoutStyle);
        this.a = true;
        this.j = new Rect();
        this.w = -1;
        this.B = 0;
        this.D = 0;
        Context context2 = getContext();
        xt xtVar = new xt(this);
        this.k = xtVar;
        xtVar.W = y6.e;
        xtVar.i(false);
        xtVar.J = false;
        this.l = new zf0(context2);
        ip2.a(context2, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int[] iArr = r12.i;
        ip2.b(context2, attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int i2 = typedArrayObtainStyledAttributes.getInt(4, 8388691);
        if (xtVar.j != i2) {
            xtVar.j = i2;
            xtVar.i(false);
        }
        xtVar.l(typedArrayObtainStyledAttributes.getInt(0, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        this.m = typedArrayObtainStyledAttributes.getBoolean(20, true);
        setTitle(typedArrayObtainStyledAttributes.getText(18));
        xtVar.n(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        xtVar.k(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            xtVar.n(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            xtVar.k(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(22, -1);
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 3) {
                        truncateAt = TextUtils.TruncateAt.END;
                    } else {
                        truncateAt = TextUtils.TruncateAt.MARQUEE;
                    }
                } else {
                    truncateAt = TextUtils.TruncateAt.MIDDLE;
                }
            } else {
                truncateAt = TextUtils.TruncateAt.START;
            }
            setTitleEllipsize(truncateAt);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11) && xtVar.n != (colorStateListA2 = ni1.a(context2, typedArrayObtainStyledAttributes, 11))) {
            xtVar.n = colorStateListA2;
            xtVar.i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2) && xtVar.o != (colorStateListA = ni1.a(context2, typedArrayObtainStyledAttributes, 2))) {
            xtVar.o = colorStateListA;
            xtVar.i(false);
        }
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, -1);
        if (typedArrayObtainStyledAttributes.hasValue(14) && (i = typedArrayObtainStyledAttributes.getInt(14, 1)) != xtVar.n0) {
            xtVar.n0 = i;
            Bitmap bitmap = xtVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                xtVar.K = null;
            }
            xtVar.i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            xtVar.V = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(21, 0));
            xtVar.i(false);
        }
        this.t = typedArrayObtainStyledAttributes.getInt(15, 600);
        this.u = nq2.l(context2, R.attr.motionEasingStandardInterpolator, y6.c);
        this.v = nq2.l(context2, R.attr.motionEasingStandardInterpolator, y6.d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(3));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(17));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(19, 0));
        this.b = typedArrayObtainStyledAttributes.getResourceId(23, -1);
        this.C = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.E = typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        ViewCompat.G(this, new v7(this, 12));
    }

    public static f63 b(View view) {
        f63 f63Var = (f63) view.getTag(R.id.view_offset_helper);
        if (f63Var == null) {
            f63 f63Var2 = new f63(view);
            view.setTag(R.id.view_offset_helper, f63Var2);
            return f63Var2;
        }
        return f63Var;
    }

    @ColorInt
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListC = ki1.c(getContext(), R.attr.colorSurfaceContainer);
        if (colorStateListC != null) {
            return colorStateListC.getDefaultColor();
        }
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        zf0 zf0Var = this.l;
        return zf0Var.a(dimension, zf0Var.d);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int systemWindowInsetTop;
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.o) != null && this.q > 0) {
            drawable.mutate().setAlpha(this.q);
            this.o.draw(canvas);
        }
        if (this.m && this.n) {
            ViewGroup viewGroup = this.c;
            xt xtVar = this.k;
            if (viewGroup != null && this.o != null && this.q > 0 && this.z == 1 && xtVar.b < xtVar.e) {
                int iSave = canvas.save();
                canvas.clipRect(this.o.getBounds(), Region.Op.DIFFERENCE);
                xtVar.d(canvas);
                canvas.restoreToCount(iSave);
            } else {
                xtVar.d(canvas);
            }
        }
        if (this.p != null && this.q > 0) {
            WindowInsetsCompat windowInsetsCompat = this.A;
            if (windowInsetsCompat != null) {
                systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            } else {
                systemWindowInsetTop = 0;
            }
            if (systemWindowInsetTop > 0) {
                this.p.setBounds(0, -this.y, getWidth(), systemWindowInsetTop - this.y);
                this.p.mutate().setAlpha(this.q);
                this.p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean state;
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        } else {
            state = false;
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        xt xtVar = this.k;
        if (xtVar != null) {
            xtVar.R = drawableState;
            ColorStateList colorStateList2 = xtVar.o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = xtVar.n) != null && colorStateList.isStateful())) {
                xtVar.i(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.z == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = ViewCompat.a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.x == null) {
                this.x = new zt(this);
            }
            zt ztVar = this.x;
            if (appBarLayout.h == null) {
                appBarLayout.h = new ArrayList();
            }
            if (ztVar != null && !appBarLayout.h.contains(ztVar)) {
                appBarLayout.h.add(ztVar);
            }
            ViewCompat.x(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        zt ztVar = this.x;
        if (ztVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).h) != null) {
            arrayList.remove(ztVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.A;
        if (windowInsetsCompat != null) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap weakHashMap = ViewCompat.a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < systemWindowInsetTop) {
                    childAt.offsetTopAndBottom(systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            f63 f63VarB = b(getChildAt(i6));
            View view = f63VarB.a;
            f63VarB.b = view.getTop();
            f63VarB.c = view.getLeft();
        }
        e(i, i2, i3, i4, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int systemWindowInsetTop;
        CollapsingToolbarLayout collapsingToolbarLayout;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        WindowInsetsCompat windowInsetsCompat = this.A;
        if (windowInsetsCompat != null) {
            systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        } else {
            systemWindowInsetTop = 0;
        }
        if ((mode == 0 || this.C) && systemWindowInsetTop > 0) {
            this.B = systemWindowInsetTop;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + systemWindowInsetTop, 1073741824));
        }
        if (this.E) {
            xt xtVar = this.k;
            if (xtVar.n0 > 1) {
                f();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.e(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i3 = xtVar.p;
                if (i3 > 1) {
                    TextPaint textPaint = xtVar.U;
                    textPaint.setTextSize(xtVar.l);
                    textPaint.setTypeface(xtVar.z);
                    textPaint.setLetterSpacing(xtVar.g0);
                    int i4 = i3 - 1;
                    collapsingToolbarLayout.D = i4 * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(collapsingToolbarLayout.getMeasuredHeight() + collapsingToolbarLayout.D, 1073741824));
                }
            } else {
                collapsingToolbarLayout = this;
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.c;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.d;
            if (view != null && view != collapsingToolbarLayout) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight2 = view.getMeasuredHeight();
                }
                collapsingToolbarLayout.setMinimumHeight(measuredHeight2);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight = viewGroup.getMeasuredHeight();
            }
            collapsingToolbarLayout.setMinimumHeight(measuredHeight);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.o;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            if (this.z == 1 && viewGroup != null && this.m) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setContentScrimResource(@DrawableRes int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedTitleColor(@ColorInt int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setStatusBarScrimResource(@DrawableRes int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.p;
        if (drawable != null && drawable.isVisible() != z) {
            this.p.setVisible(z, false);
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.o.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.o && drawable != this.p) {
            return false;
        }
        return true;
    }

    public void setCollapsedTitleTextColor(@ColorInt int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        yt ytVar = new yt(-1, -1);
        ytVar.a = 0;
        ytVar.b = 0.5f;
        return ytVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        yt ytVar = new yt(layoutParams);
        ytVar.a = 0;
        ytVar.b = 0.5f;
        return ytVar;
    }
}
