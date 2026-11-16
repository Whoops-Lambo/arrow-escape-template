package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.WrappedDrawable;
import androidx.core.text.BidiFormatter;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.ViewCompat;
import com.moloco.sdk.internal.l0;
import com.safedk.android.analytics.reporters.b;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bp2;
import defpackage.c71;
import defpackage.ce2;
import defpackage.d;
import defpackage.ip2;
import defpackage.ji1;
import defpackage.m63;
import defpackage.ni1;
import defpackage.oo1;
import defpackage.or;
import defpackage.os2;
import defpackage.pr;
import defpackage.qr;
import defpackage.r12;
import defpackage.rd2;
import defpackage.rr;
import defpackage.u52;
import defpackage.xo2;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class Chip extends AppCompatCheckBox implements qr, ce2, Checkable {
    public static final Rect w = new Rect();
    public static final int[] x = {R.attr.state_selected};
    public static final int[] y = {R.attr.state_checkable};
    public rr e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public CharSequence q;
    public final pr r;
    public boolean s;
    public final Rect t;
    public final RectF u;
    public final or v;

    @RestrictTo
    public void setInternalOnCheckedChangeListener(@Nullable ji1 ji1Var) {
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            d.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            d.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            d.u("Chip does not support multi-line text");
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(os2.G(context, attributeSet, com.ecffri.arrows.R.attr.chipStyle, com.ecffri.arrows.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.ecffri.arrows.R.attr.chipStyle);
        this.t = new Rect();
        this.u = new RectF();
        this.v = new or(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                d.u("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                d.u("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                d.u("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                d.u("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", b.d, 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                d.u("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        rr rrVar = new rr(context2, attributeSet);
        Context context3 = rrVar.f0;
        int[] iArr = r12.f;
        TypedArray typedArrayD = ip2.d(context3, attributeSet, iArr, com.ecffri.arrows.R.attr.chipStyle, com.ecffri.arrows.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        rrVar.F0 = typedArrayD.hasValue(37);
        Context context4 = rrVar.f0;
        ColorStateList colorStateListA = ni1.a(context4, typedArrayD, 24);
        if (rrVar.y != colorStateListA) {
            rrVar.y = colorStateListA;
            rrVar.onStateChange(rrVar.getState());
        }
        ColorStateList colorStateListA2 = ni1.a(context4, typedArrayD, 11);
        if (rrVar.z != colorStateListA2) {
            rrVar.z = colorStateListA2;
            rrVar.onStateChange(rrVar.getState());
        }
        float dimension = typedArrayD.getDimension(19, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (rrVar.A != dimension) {
            rrVar.A = dimension;
            rrVar.invalidateSelf();
            rrVar.v();
        }
        if (typedArrayD.hasValue(12)) {
            rrVar.B(typedArrayD.getDimension(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        rrVar.G(ni1.a(context4, typedArrayD, 22));
        rrVar.H(typedArrayD.getDimension(23, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        rrVar.Q(ni1.a(context4, typedArrayD, 36));
        String text = typedArrayD.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(rrVar.F, text);
        bp2 bp2Var = rrVar.l0;
        if (!zEquals) {
            rrVar.F = text;
            bp2Var.e = true;
            rrVar.invalidateSelf();
            rrVar.v();
        }
        xo2 xo2Var = (!typedArrayD.hasValue(0) || (resourceId3 = typedArrayD.getResourceId(0, 0)) == 0) ? null : new xo2(context4, resourceId3);
        xo2Var.k = typedArrayD.getDimension(1, xo2Var.k);
        bp2Var.b(xo2Var, context4);
        int i = typedArrayD.getInt(3, 0);
        int i2 = 2;
        if (i == 1) {
            rrVar.C0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            rrVar.C0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            rrVar.C0 = TextUtils.TruncateAt.END;
        }
        rrVar.F(typedArrayD.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            rrVar.F(typedArrayD.getBoolean(15, false));
        }
        rrVar.C(ni1.c(context4, typedArrayD, 14));
        if (typedArrayD.hasValue(17)) {
            rrVar.E(ni1.a(context4, typedArrayD, 17));
        }
        rrVar.D(typedArrayD.getDimension(16, -1.0f));
        rrVar.N(typedArrayD.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            rrVar.N(typedArrayD.getBoolean(26, false));
        }
        rrVar.I(ni1.c(context4, typedArrayD, 25));
        rrVar.M(ni1.a(context4, typedArrayD, 30));
        rrVar.K(typedArrayD.getDimension(28, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        rrVar.x(typedArrayD.getBoolean(6, false));
        rrVar.A(typedArrayD.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            rrVar.A(typedArrayD.getBoolean(8, false));
        }
        rrVar.y(ni1.c(context4, typedArrayD, 7));
        if (typedArrayD.hasValue(9)) {
            rrVar.z(ni1.a(context4, typedArrayD, 9));
        }
        rrVar.V = (!typedArrayD.hasValue(39) || (resourceId2 = typedArrayD.getResourceId(39, 0)) == 0) ? null : oo1.a(context4, resourceId2);
        rrVar.W = (!typedArrayD.hasValue(33) || (resourceId = typedArrayD.getResourceId(33, 0)) == 0) ? null : oo1.a(context4, resourceId);
        float dimension2 = typedArrayD.getDimension(21, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (rrVar.X != dimension2) {
            rrVar.X = dimension2;
            rrVar.invalidateSelf();
            rrVar.v();
        }
        rrVar.P(typedArrayD.getDimension(35, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        rrVar.O(typedArrayD.getDimension(34, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float dimension3 = typedArrayD.getDimension(41, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (rrVar.a0 != dimension3) {
            rrVar.a0 = dimension3;
            rrVar.invalidateSelf();
            rrVar.v();
        }
        float dimension4 = typedArrayD.getDimension(40, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (rrVar.b0 != dimension4) {
            rrVar.b0 = dimension4;
            rrVar.invalidateSelf();
            rrVar.v();
        }
        rrVar.L(typedArrayD.getDimension(29, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        rrVar.J(typedArrayD.getDimension(27, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float dimension5 = typedArrayD.getDimension(13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (rrVar.e0 != dimension5) {
            rrVar.e0 = dimension5;
            rrVar.invalidateSelf();
            rrVar.v();
        }
        rrVar.E0 = typedArrayD.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayD.recycle();
        ip2.a(context2, attributeSet, com.ecffri.arrows.R.attr.chipStyle, com.ecffri.arrows.R.style.Widget_MaterialComponents_Chip_Action);
        ip2.b(context2, attributeSet, iArr, com.ecffri.arrows.R.attr.chipStyle, com.ecffri.arrows.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.ecffri.arrows.R.attr.chipStyle, com.ecffri.arrows.R.style.Widget_MaterialComponents_Chip_Action);
        this.n = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.p = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(m63.a(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(rrVar);
        rrVar.j(ViewCompat.k(this));
        ip2.a(context2, attributeSet, com.ecffri.arrows.R.attr.chipStyle, com.ecffri.arrows.R.style.Widget_MaterialComponents_Chip_Action);
        ip2.b(context2, attributeSet, iArr, com.ecffri.arrows.R.attr.chipStyle, com.ecffri.arrows.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.ecffri.arrows.R.attr.chipStyle, com.ecffri.arrows.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.r = new pr(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new l0(this, i2));
        }
        setChecked(this.j);
        setText(rrVar.F);
        setEllipsize(rrVar.C0);
        g();
        if (!this.e.D0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.n) {
            setMinHeight(this.p);
        }
        this.o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: nr
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.a.i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    @NonNull
    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.u;
        rectF.setEmpty();
        if (c() && this.h != null) {
            rr rrVar = this.e;
            Rect bounds = rrVar.getBounds();
            rectF.setEmpty();
            if (rrVar.T()) {
                float f = rrVar.e0 + rrVar.d0 + rrVar.P + rrVar.c0 + rrVar.b0;
                if (rrVar.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    @Nullable
    private xo2 getTextAppearance() {
        rr rrVar = this.e;
        if (rrVar != null) {
            return rrVar.l0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.p = i;
        if (!this.n) {
            InsetDrawable insetDrawable = this.f;
            if (insetDrawable == null) {
                int[] iArr = u52.a;
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = u52.a;
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.e.A));
        int iMax2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f;
            if (insetDrawable2 == null) {
                int[] iArr3 = u52.a;
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = u52.a;
                    e();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = u52.a;
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        int[] iArr6 = u52.a;
        e();
    }

    public final boolean c() {
        rr rrVar = this.e;
        if (rrVar == null) {
            return false;
        }
        Object objB = rrVar.M;
        if (objB == null) {
            objB = null;
        } else if (objB instanceof WrappedDrawable) {
            objB = ((WrappedDrawable) objB).b();
        }
        return objB != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        pr prVar = this.r;
        AccessibilityManager accessibilityManager = prVar.h;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = prVar.q;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y2)) {
                    i2 = 1;
                }
                int i3 = prVar.m;
                if (i3 != i2) {
                    prVar.m = i2;
                    prVar.t(i2, 128);
                    prVar.t(i3, 256);
                }
            } else if (action == 10 && (i = prVar.m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    prVar.m = Integer.MIN_VALUE;
                    prVar.t(Integer.MIN_VALUE, 128);
                    prVar.t(i, 256);
                }
            } else if (super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        if (!this.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        pr prVar = this.r;
        prVar.getClass();
        boolean zM = false;
        int i2 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && prVar.m(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = prVar.l;
                                if (i != Integer.MIN_VALUE) {
                                    prVar.o(i, 16);
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = prVar.l;
                    if (i != Integer.MIN_VALUE) {
                        prVar.o(i, 16);
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = prVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = prVar.m(1, null);
            }
        }
        if (!zM || prVar.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void e() {
        this.g = new RippleDrawable(u52.b(this.e.E), getBackgroundDrawable(), null);
        this.e.getClass();
        RippleDrawable rippleDrawable = this.g;
        WeakHashMap weakHashMap = ViewCompat.a;
        setBackground(rippleDrawable);
        f();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        rr rrVar = this.e;
        if (rrVar == null || !rrVar.R) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        rr rrVar = this.e;
        if (rrVar != null) {
            return rrVar.T;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        rr rrVar = this.e;
        if (rrVar != null) {
            return rrVar.U;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        rr rrVar = this.e;
        if (rrVar != null) {
            return rrVar.z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        rr rrVar = this.e;
        return rrVar != null ? Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rrVar.s()) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        rr rrVar = this.e;
        return rrVar != null ? rrVar.e0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        rr rrVar = this.e;
        if (rrVar == null || (drawable = rrVar.H) == 0) {
            return null;
        }
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).b() : drawable;
    }

    public float getChipIconSize() {
        rr rrVar = this.e;
        return rrVar != null ? rrVar.J : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        rr rrVar = this.e;
        if (rrVar != null) {
            return rrVar.I;
        }
        return null;
    }

    public float getChipMinHeight() {
        rr rrVar = this.e;
        return rrVar != null ? rrVar.A : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getChipStartPadding() {
        rr rrVar = this.e;
        return rrVar != null ? rrVar.X : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        rr rrVar = this.e;
        if (rrVar != null) {
            return rrVar.C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        rr rrVar = this.e;
        return rrVar != null ? rrVar.D : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable;
        rr rrVar = this.e;
        if (rrVar == null || (drawable = rrVar.M) == 0) {
            return null;
        }
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).b() : drawable;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        rr rrVar = this.e;
        if (rrVar != null) {
            return rrVar.Q;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        rr rrVar = this.e;
        return rrVar != null ? rrVar.d0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getCloseIconSize() {
        rr rrVar = this.e;
        return rrVar != null ? rrVar.P : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getCloseIconStartPadding() {
        rr rrVar = this.e;
        return rrVar != null ? rrVar.c0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        rr rrVar = this.e;
        if (rrVar != null) {
            return rrVar.O;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        rr rrVar = this.e;
        if (rrVar != null) {
            return rrVar.C0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.s) {
            pr prVar = this.r;
            if (prVar.l == 1 || prVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Nullable
    public oo1 getHideMotionSpec() {
        rr rrVar = this.e;
        if (rrVar != null) {
            return rrVar.W;
        }
        return null;
    }

    public float getIconEndPadding() {
        rr rrVar = this.e;
        return rrVar != null ? rrVar.Z : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getIconStartPadding() {
        rr rrVar = this.e;
        return rrVar != null ? rrVar.Y : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        rr rrVar = this.e;
        if (rrVar != null) {
            return rrVar.E;
        }
        return null;
    }

    @NonNull
    public rd2 getShapeAppearanceModel() {
        return this.e.a.a;
    }

    @Nullable
    public oo1 getShowMotionSpec() {
        rr rrVar = this.e;
        if (rrVar != null) {
            return rrVar.V;
        }
        return null;
    }

    public float getTextEndPadding() {
        rr rrVar = this.e;
        return rrVar != null ? rrVar.b0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getTextStartPadding() {
        rr rrVar = this.e;
        return rrVar != null ? rrVar.a0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, x);
        }
        rr rrVar = this.e;
        if (rrVar != null && rrVar.R) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, y);
        }
        return iArrOnCreateDrawableState;
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.q = charSequence;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.x(z);
        }
    }

    public void setCheckableResource(@BoolRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.x(rrVar.f0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        rr rrVar = this.e;
        if (rrVar == null) {
            this.j = z;
        } else if (rrVar.R) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.y(drawable);
        }
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.y(AppCompatResources.a(rrVar.f0, i));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.z(ContextCompat.c(rrVar.f0, i));
        }
    }

    public void setCheckedIconVisible(@BoolRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.A(rrVar.f0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        rr rrVar = this.e;
        if (rrVar == null || rrVar.z == colorStateList) {
            return;
        }
        rrVar.z = colorStateList;
        rrVar.onStateChange(rrVar.getState());
    }

    public void setChipBackgroundColorResource(@ColorRes int i) {
        ColorStateList colorStateListC;
        rr rrVar = this.e;
        if (rrVar == null || rrVar.z == (colorStateListC = ContextCompat.c(rrVar.f0, i))) {
            return;
        }
        rrVar.z = colorStateListC;
        rrVar.onStateChange(rrVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.B(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.B(rrVar.f0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(@NonNull rr rrVar) {
        rr rrVar2 = this.e;
        if (rrVar2 != rrVar) {
            if (rrVar2 != null) {
                rrVar2.B0 = new WeakReference(null);
            }
            this.e = rrVar;
            rrVar.D0 = false;
            rrVar.B0 = new WeakReference(this);
            b(this.p);
        }
    }

    public void setChipEndPadding(float f) {
        rr rrVar = this.e;
        if (rrVar == null || rrVar.e0 == f) {
            return;
        }
        rrVar.e0 = f;
        rrVar.invalidateSelf();
        rrVar.v();
    }

    public void setChipEndPaddingResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            float dimension = rrVar.f0.getResources().getDimension(i);
            if (rrVar.e0 != dimension) {
                rrVar.e0 = dimension;
                rrVar.invalidateSelf();
                rrVar.v();
            }
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.C(drawable);
        }
    }

    public void setChipIconResource(@DrawableRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.C(AppCompatResources.a(rrVar.f0, i));
        }
    }

    public void setChipIconSize(float f) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.D(f);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.D(rrVar.f0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.E(ContextCompat.c(rrVar.f0, i));
        }
    }

    public void setChipIconVisible(@BoolRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.F(rrVar.f0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        rr rrVar = this.e;
        if (rrVar == null || rrVar.A == f) {
            return;
        }
        rrVar.A = f;
        rrVar.invalidateSelf();
        rrVar.v();
    }

    public void setChipMinHeightResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            float dimension = rrVar.f0.getResources().getDimension(i);
            if (rrVar.A != dimension) {
                rrVar.A = dimension;
                rrVar.invalidateSelf();
                rrVar.v();
            }
        }
    }

    public void setChipStartPadding(float f) {
        rr rrVar = this.e;
        if (rrVar == null || rrVar.X == f) {
            return;
        }
        rrVar.X = f;
        rrVar.invalidateSelf();
        rrVar.v();
    }

    public void setChipStartPaddingResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            float dimension = rrVar.f0.getResources().getDimension(i);
            if (rrVar.X != dimension) {
                rrVar.X = dimension;
                rrVar.invalidateSelf();
                rrVar.v();
            }
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.G(ContextCompat.c(rrVar.f0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.H(f);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.H(rrVar.f0.getResources().getDimension(i));
        }
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.I(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        rr rrVar = this.e;
        if (rrVar == null || rrVar.Q == charSequence) {
            return;
        }
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = BidiFormatter.c;
        BidiFormatter bidiFormatter = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? BidiFormatter.g : BidiFormatter.f;
        bidiFormatter.getClass();
        TextDirectionHeuristicCompat textDirectionHeuristicCompat2 = TextDirectionHeuristicsCompat.a;
        rrVar.Q = bidiFormatter.c(charSequence);
        rrVar.invalidateSelf();
    }

    public void setCloseIconEndPadding(float f) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.J(f);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.J(rrVar.f0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(@DrawableRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.I(AppCompatResources.a(rrVar.f0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.K(f);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.K(rrVar.f0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.L(f);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.L(rrVar.f0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.M(ContextCompat.c(rrVar.f0, i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            d.u("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            d.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            d.u("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            d.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            d.u("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            d.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            d.u("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            d.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            d.u("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.C0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.n = z;
        b(this.p);
    }

    public void setHideMotionSpec(@Nullable oo1 oo1Var) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.W = oo1Var;
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.W = oo1.a(rrVar.f0, i);
        }
    }

    public void setIconEndPadding(float f) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.O(f);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.O(rrVar.f0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.P(f);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.P(rrVar.f0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        d();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.Q(colorStateList);
        }
        this.e.getClass();
        e();
    }

    public void setRippleColorResource(@ColorRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.Q(ContextCompat.c(rrVar.f0, i));
            this.e.getClass();
            e();
        }
    }

    @Override // defpackage.ce2
    public void setShapeAppearanceModel(@NonNull rd2 rd2Var) {
        this.e.setShapeAppearanceModel(rd2Var);
    }

    public void setShowMotionSpec(@Nullable oo1 oo1Var) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.V = oo1Var;
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.V = oo1.a(rrVar.f0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            d.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        rr rrVar = this.e;
        if (rrVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(rrVar.D0 ? null : charSequence, bufferType);
        rr rrVar2 = this.e;
        if (rrVar2 == null || TextUtils.equals(rrVar2.F, charSequence)) {
            return;
        }
        rrVar2.F = charSequence;
        rrVar2.l0.e = true;
        rrVar2.invalidateSelf();
        rrVar2.v();
    }

    public void setTextEndPadding(float f) {
        rr rrVar = this.e;
        if (rrVar == null || rrVar.b0 == f) {
            return;
        }
        rrVar.b0 = f;
        rrVar.invalidateSelf();
        rrVar.v();
    }

    public void setTextEndPaddingResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            float dimension = rrVar.f0.getResources().getDimension(i);
            if (rrVar.b0 != dimension) {
                rrVar.b0 = dimension;
                rrVar.invalidateSelf();
                rrVar.v();
            }
        }
    }

    public void setTextStartPadding(float f) {
        rr rrVar = this.e;
        if (rrVar == null || rrVar.a0 == f) {
            return;
        }
        rrVar.a0 = f;
        rrVar.invalidateSelf();
        rrVar.v();
    }

    public void setTextStartPaddingResource(@DimenRes int i) {
        rr rrVar = this.e;
        if (rrVar != null) {
            float dimension = rrVar.f0.getResources().getDimension(i);
            if (rrVar.a0 != dimension) {
                rrVar.a0 = dimension;
                rrVar.invalidateSelf();
                rrVar.v();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    public final void d() {
        rr rrVar;
        if (c() && (rrVar = this.e) != null && rrVar.L && this.h != null) {
            ViewCompat.z(this, this.r);
            this.s = true;
        } else {
            ViewCompat.z(this, null);
            this.s = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        rr rrVar = this.e;
        boolean zW = false;
        if (rrVar != null && rr.u(rrVar.M)) {
            rr rrVar2 = this.e;
            ?? IsEnabled = isEnabled();
            if (this.m) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.l) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.m) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.l) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.k) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(rrVar2.z0, iArr)) {
                rrVar2.z0 = iArr;
                if (rrVar2.T()) {
                    zW = rrVar2.w(rrVar2.getState(), iArr);
                }
            }
        }
        if (zW) {
            invalidate();
        }
    }

    public final void f() {
        rr rrVar;
        if (!TextUtils.isEmpty(getText()) && (rrVar = this.e) != null) {
            int iR = (int) (rrVar.r() + rrVar.e0 + rrVar.b0);
            rr rrVar2 = this.e;
            int iQ = (int) (rrVar2.q() + rrVar2.X + rrVar2.a0);
            if (this.f != null) {
                Rect rect = new Rect();
                this.f.getPadding(rect);
                iQ += rect.left;
                iR += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = ViewCompat.a;
            setPaddingRelative(iQ, paddingTop, iR, paddingBottom);
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        rr rrVar = this.e;
        if (rrVar != null) {
            paint.drawableState = rrVar.getState();
        }
        xo2 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.v);
        }
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c71.t(this, this.e);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.s) {
            pr prVar = this.r;
            int i2 = prVar.l;
            if (i2 != Integer.MIN_VALUE) {
                prVar.j(i2);
            }
            if (z) {
                prVar.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        rr rrVar = this.e;
        if (rrVar != null && rrVar.R) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.o != i) {
            this.o = i;
            f();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.k) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.k) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.h;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.s) {
                        this.r.t(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        if (z || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.g) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.g) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i) {
        setText(getResources().getString(i));
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconVisible(@BoolRes int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f) {
        super.setElevation(f);
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.j(f);
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i) {
        super.setMaxWidth(i);
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.E0 = i;
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        rr rrVar = this.e;
        if (rrVar != null) {
            Context context2 = rrVar.f0;
            rrVar.l0.b(new xo2(context2, i), context2);
        }
        g();
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        setTextAppearance(getContext(), i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        rr rrVar = this.e;
        if (rrVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            bp2 bp2Var = rrVar.l0;
            xo2 xo2Var = bp2Var.g;
            if (xo2Var != null) {
                xo2Var.k = fApplyDimension;
                bp2Var.a.setTextSize(fApplyDimension);
                rrVar.a();
            }
        }
        g();
    }

    public void setCloseIconVisible(boolean z) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.N(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.A(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.F(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            d.u("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            d.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            d.u("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            d.u("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(@Nullable xo2 xo2Var) {
        rr rrVar = this.e;
        if (rrVar != null) {
            rrVar.l0.b(xo2Var, rrVar.f0);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        rr rrVar = this.e;
        if (rrVar != null) {
            Context context = rrVar.f0;
            rrVar.l0.b(new xo2(context, i), context);
        }
        g();
    }
}
