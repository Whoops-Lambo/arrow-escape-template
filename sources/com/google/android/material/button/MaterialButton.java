package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ai1;
import defpackage.bi1;
import defpackage.c71;
import defpackage.ce2;
import defpackage.d;
import defpackage.d0;
import defpackage.e32;
import defpackage.ip2;
import defpackage.m63;
import defpackage.m93;
import defpackage.ni1;
import defpackage.os2;
import defpackage.qd2;
import defpackage.r12;
import defpackage.rd2;
import defpackage.u52;
import defpackage.x41;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class MaterialButton extends AppCompatButton implements Checkable, ce2 {
    public static final int[] r = {R.attr.state_checkable};
    public static final int[] s = {R.attr.state_checked};
    public final bi1 d;
    public final LinkedHashSet e;
    public ai1 f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public final boolean a() {
        bi1 bi1Var = this.d;
        return (bi1Var == null || bi1Var.o) ? false : true;
    }

    public final void b() {
        int i = this.q;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    public final void c(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.i = drawableMutate;
            drawableMutate.setTintList(this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int intrinsicWidth = this.k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i = this.l;
            int i2 = this.m;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.i.setVisible(true, z);
        }
        if (z) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.q;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.i) || (((i3 == 3 || i3 == 4) && drawable5 != this.i) || ((i3 == 16 || i3 == 32) && drawable4 != this.i))) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.q;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.l = 0;
                if (i3 == 16) {
                    this.m = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.n) - getPaddingBottom()) / 2);
                if (this.m != iMax) {
                    this.m = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.q;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.l = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = ViewCompat.a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.l != paddingEnd) {
            this.l = paddingEnd;
            c(false);
        }
    }

    @NonNull
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        bi1 bi1Var = this.d;
        return ((bi1Var == null || !bi1Var.q) ? Button.class : CompoundButton.class).getName();
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    @Px
    public int getIconPadding() {
        return this.n;
    }

    @Px
    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    @Dimension
    public int getInsetBottom() {
        return this.d.f;
    }

    @Dimension
    public int getInsetTop() {
        return this.d.e;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.o;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        bi1 bi1Var = this.d;
        if (bi1Var != null && bi1Var.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r);
        }
        if (this.o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setChecked(savedState.c);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.r) {
            toggle();
        }
        return super.performClick();
    }

    public void setA11yClassName(@Nullable String str) {
        this.j = str;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        setBackgroundDrawable(i != 0 ? AppCompatResources.a(getContext(), i) : null);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        bi1 bi1Var = this.d;
        if (bi1Var == null || !bi1Var.q || !isEnabled() || this.o == z) {
            return;
        }
        this.o = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.o;
            if (!materialButtonToggleGroup.f) {
                materialButtonToggleGroup.b(getId(), z2);
            }
        }
        if (this.p) {
            return;
        }
        this.p = true;
        Iterator it = this.e.iterator();
        if (!it.hasNext()) {
            this.p = false;
        } else {
            it.next().getClass();
            m93.b();
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.q != i) {
            this.q = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i) {
        if (this.n != i) {
            this.n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@DrawableRes int i) {
        setIcon(i != 0 ? AppCompatResources.a(getContext(), i) : null);
    }

    public void setIconSize(@Px int i) {
        if (i < 0) {
            d.r("iconSize cannot be less than 0");
        } else if (this.k != i) {
            this.k = i;
            c(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            c(false);
        }
    }

    public void setInsetBottom(@Dimension int i) {
        bi1 bi1Var = this.d;
        bi1Var.d(bi1Var.e, i);
    }

    public void setInsetTop(@Dimension int i) {
        bi1 bi1Var = this.d;
        bi1Var.d(i, bi1Var.f);
    }

    public void setOnPressedChangeListenerInternal(@Nullable ai1 ai1Var) {
        this.f = ai1Var;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        ai1 ai1Var = this.f;
        if (ai1Var != null) {
            ((MaterialButtonToggleGroup) ((x41) ai1Var).b).invalidate();
        }
        super.setPressed(z);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.o);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(os2.G(context, attributeSet, com.ecffri.arrows.R.attr.materialButtonStyle, com.ecffri.arrows.R.style.Widget_MaterialComponents_Button), attributeSet, com.ecffri.arrows.R.attr.materialButtonStyle);
        this.e = new LinkedHashSet();
        this.o = false;
        this.p = false;
        Context context2 = getContext();
        TypedArray typedArrayD = ip2.d(context2, attributeSet, r12.o, com.ecffri.arrows.R.attr.materialButtonStyle, com.ecffri.arrows.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.n = typedArrayD.getDimensionPixelSize(12, 0);
        int i = typedArrayD.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.g = m63.c(i, mode);
        this.h = ni1.a(getContext(), typedArrayD, 14);
        this.i = ni1.c(getContext(), typedArrayD, 10);
        this.q = typedArrayD.getInteger(11, 1);
        this.k = typedArrayD.getDimensionPixelSize(13, 0);
        bi1 bi1Var = new bi1(this, rd2.b(context2, attributeSet, com.ecffri.arrows.R.attr.materialButtonStyle, com.ecffri.arrows.R.style.Widget_MaterialComponents_Button).a());
        this.d = bi1Var;
        bi1Var.c = typedArrayD.getDimensionPixelOffset(1, 0);
        bi1Var.d = typedArrayD.getDimensionPixelOffset(2, 0);
        bi1Var.e = typedArrayD.getDimensionPixelOffset(3, 0);
        bi1Var.f = typedArrayD.getDimensionPixelOffset(4, 0);
        if (typedArrayD.hasValue(8)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(8, -1);
            bi1Var.g = dimensionPixelSize;
            float f = dimensionPixelSize;
            qd2 qd2VarE = bi1Var.b.e();
            qd2VarE.e = new d0(f);
            qd2VarE.f = new d0(f);
            qd2VarE.g = new d0(f);
            qd2VarE.h = new d0(f);
            bi1Var.c(qd2VarE.a());
            bi1Var.p = true;
        }
        bi1Var.h = typedArrayD.getDimensionPixelSize(20, 0);
        bi1Var.i = m63.c(typedArrayD.getInt(7, -1), mode);
        bi1Var.j = ni1.a(getContext(), typedArrayD, 6);
        bi1Var.k = ni1.a(getContext(), typedArrayD, 19);
        bi1Var.l = ni1.a(getContext(), typedArrayD, 16);
        bi1Var.q = typedArrayD.getBoolean(5, false);
        bi1Var.t = typedArrayD.getDimensionPixelSize(9, 0);
        bi1Var.r = typedArrayD.getBoolean(21, true);
        WeakHashMap weakHashMap = ViewCompat.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(0)) {
            bi1Var.o = true;
            setSupportBackgroundTintList(bi1Var.j);
            setSupportBackgroundTintMode(bi1Var.i);
        } else {
            bi1Var.e();
        }
        setPaddingRelative(paddingStart + bi1Var.c, paddingTop + bi1Var.e, paddingEnd + bi1Var.d, paddingBottom + bi1Var.f);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.n);
        c(this.i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (a()) {
            return this.d.g;
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (a()) {
            return this.d.l;
        }
        return null;
    }

    @NonNull
    public rd2 getShapeAppearanceModel() {
        if (a()) {
            return this.d.b;
        }
        e32.i("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.d.k;
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (a()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.d.j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.d.i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            c71.t(this, this.d.b(false));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.o);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        bi1 bi1Var = this.d;
        if (bi1Var != null && bi1Var.q) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(this.o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.o;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        if (a()) {
            bi1 bi1Var = this.d;
            if (bi1Var.b(false) != null) {
                bi1Var.b(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                bi1 bi1Var = this.d;
                bi1Var.o = true;
                MaterialButton materialButton = bi1Var.a;
                materialButton.setSupportBackgroundTintList(bi1Var.j);
                materialButton.setSupportBackgroundTintMode(bi1Var.i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (a()) {
            this.d.q = z;
        }
    }

    public void setCornerRadius(@Px int i) {
        if (a()) {
            bi1 bi1Var = this.d;
            if (!bi1Var.p || bi1Var.g != i) {
                bi1Var.g = i;
                bi1Var.p = true;
                float f = i;
                qd2 qd2VarE = bi1Var.b.e();
                qd2VarE.e = new d0(f);
                qd2VarE.f = new d0(f);
                qd2VarE.g = new d0(f);
                qd2VarE.h = new d0(f);
                bi1Var.c(qd2VarE.a());
            }
        }
    }

    public void setCornerRadiusResource(@DimenRes int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.d.b(false).j(f);
        }
    }

    public void setIconTintResource(@ColorRes int i) {
        setIconTint(ContextCompat.c(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (a()) {
            bi1 bi1Var = this.d;
            MaterialButton materialButton = bi1Var.a;
            if (bi1Var.l != colorStateList) {
                bi1Var.l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(u52.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        if (a()) {
            setRippleColor(ContextCompat.c(getContext(), i));
        }
    }

    @Override // defpackage.ce2
    public void setShapeAppearanceModel(@NonNull rd2 rd2Var) {
        if (a()) {
            this.d.c(rd2Var);
        } else {
            e32.i("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (a()) {
            bi1 bi1Var = this.d;
            bi1Var.n = z;
            bi1Var.f();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (a()) {
            bi1 bi1Var = this.d;
            if (bi1Var.k != colorStateList) {
                bi1Var.k = colorStateList;
                bi1Var.f();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int i) {
        if (a()) {
            setStrokeColor(ContextCompat.c(getContext(), i));
        }
    }

    public void setStrokeWidth(@Px int i) {
        if (a()) {
            bi1 bi1Var = this.d;
            if (bi1Var.h != i) {
                bi1Var.h = i;
                bi1Var.f();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (a()) {
            bi1 bi1Var = this.d;
            if (bi1Var.j != colorStateList) {
                bi1Var.j = colorStateList;
                if (bi1Var.b(false) != null) {
                    bi1Var.b(false).setTintList(bi1Var.j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (a()) {
            bi1 bi1Var = this.d;
            if (bi1Var.i != mode) {
                bi1Var.i = mode;
                if (bi1Var.b(false) != null && bi1Var.i != null) {
                    bi1Var.b(false).setTintMode(bi1Var.i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    @RequiresApi
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }
}
