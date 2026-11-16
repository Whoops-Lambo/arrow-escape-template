package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jo2 extends LinearLayout {
    public static final /* synthetic */ int l = 0;
    public go2 a;
    public TextView b;
    public ImageView c;
    public View d;
    public xg e;
    public View f;
    public TextView g;
    public ImageView h;
    public Drawable i;
    public int j;
    public final /* synthetic */ TabLayout k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo2(TabLayout tabLayout, Context context) {
        super(context);
        this.k = tabLayout;
        this.j = 2;
        e(context);
        int i = tabLayout.e;
        int i2 = tabLayout.f;
        int i3 = tabLayout.g;
        int i4 = tabLayout.h;
        WeakHashMap weakHashMap = ViewCompat.a;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!tabLayout.C ? 1 : 0);
        setClickable(true);
        ViewCompat.H(this, new PointerIconCompat(PointerIcon.getSystemIcon(getContext(), 1002)));
    }

    @Nullable
    private xg getBadge() {
        return this.e;
    }

    @NonNull
    private xg getOrCreateBadge() {
        if (this.e == null) {
            this.e = new xg(getContext());
        }
        b();
        xg xgVar = this.e;
        if (xgVar != null) {
            return xgVar;
        }
        e32.i("Unable to create badge");
        return null;
    }

    public final void a() {
        if (this.e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.d;
            if (view != null) {
                xg xgVar = this.e;
                if (xgVar != null) {
                    if (xgVar.c() != null) {
                        xgVar.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(xgVar);
                    }
                }
                this.d = null;
            }
        }
    }

    public final void b() {
        if (this.e != null) {
            if (this.f != null) {
                a();
                return;
            }
            TextView textView = this.b;
            if (textView == null || this.a == null) {
                a();
                return;
            }
            if (this.d == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.b;
            if (this.e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            xg xgVar = this.e;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            xgVar.setBounds(rect);
            xgVar.h(textView2, null);
            if (xgVar.c() != null) {
                xgVar.c().setForeground(xgVar);
            } else {
                textView2.getOverlay().add(xgVar);
            }
            this.d = textView2;
        }
    }

    public final void c(View view) {
        xg xgVar = this.e;
        if (xgVar == null || view != this.d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        xgVar.setBounds(rect);
        xgVar.h(view, null);
    }

    public final void e(Context context) {
        GradientDrawable gradientDrawable;
        TabLayout tabLayout = this.k;
        int i = tabLayout.s;
        if (i != 0) {
            Drawable drawableA = AppCompatResources.a(context, i);
            this.i = drawableA;
            if (drawableA != null && drawableA.isStateful()) {
                this.i.setState(getDrawableState());
            }
        } else {
            this.i = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (tabLayout.n != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateList = tabLayout.n;
            int[] iArr = u52.d;
            int iA = u52.a(colorStateList, u52.c);
            int[] iArr2 = u52.b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iA, u52.a(colorStateList, iArr2), u52.a(colorStateList, u52.a)});
            boolean z = tabLayout.G;
            if (z) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z ? null : gradientDrawable3);
        }
        WeakHashMap weakHashMap = ViewCompat.a;
        setBackground(rippleDrawable);
        tabLayout.invalidate();
    }

    public final void f() {
        int i;
        ViewParent parent;
        go2 go2Var = this.a;
        View view = go2Var != null ? go2Var.c : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f);
                }
                addView(view);
            }
            this.f = view;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.g = textView2;
            if (textView2 != null) {
                this.j = textView2.getMaxLines();
            }
            this.h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f;
            if (view3 != null) {
                removeView(view3);
                this.f = null;
            }
            this.g = null;
            this.h = null;
        }
        if (this.f == null) {
            if (this.c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.ecffri.arrows.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.c = imageView2;
                addView(imageView2, 0);
            }
            if (this.b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.ecffri.arrows.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.b = textView3;
                addView(textView3);
                this.j = this.b.getMaxLines();
            }
            TextView textView4 = this.b;
            TabLayout tabLayout = this.k;
            textView4.setTextAppearance(tabLayout.i);
            if (!isSelected() || (i = tabLayout.k) == -1) {
                this.b.setTextAppearance(tabLayout.j);
            } else {
                this.b.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.l;
            if (colorStateList != null) {
                this.b.setTextColor(colorStateList);
            }
            g(this.b, this.c, true);
            b();
            ImageView imageView3 = this.c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new io2(this, imageView3));
            }
            TextView textView5 = this.b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new io2(this, textView5));
            }
        } else {
            TextView textView6 = this.g;
            if (textView6 != null || this.h != null) {
                g(textView6, this.h, false);
            }
        }
        if (go2Var == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void g(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        go2 go2Var = this.a;
        CharSequence charSequence = go2Var != null ? go2Var.a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                z2 = false;
            } else {
                this.a.getClass();
                z2 = true;
            }
            textView.setText(!zIsEmpty ? charSequence : null);
            textView.setVisibility(z2 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iA = (z2 && imageView.getVisibility() == 0) ? (int) m63.a(getContext(), 8) : 0;
            if (this.k.C) {
                if (iA != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iA);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iA != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iA;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        TooltipCompat.a(this, zIsEmpty ? null : charSequence);
    }

    public int getContentHeight() {
        View[] viewArr = {this.b, this.c, this.f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.b, this.c, this.f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    @Nullable
    public go2 getTab() {
        return this.a;
    }

    public void setTab(@Nullable go2 go2Var) {
        if (go2Var != this.a) {
            this.a = go2Var;
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    public final void d() {
        boolean z;
        f();
        go2 go2Var = this.a;
        if (go2Var != null) {
            TabLayout tabLayout = go2Var.d;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == go2Var.b) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                d.r("Tab not attached to a TabLayout");
                return;
            }
        } else {
            z = false;
        }
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean state;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if (drawable != null && drawable.isStateful()) {
            state = this.i.setState(drawableState);
        } else {
            state = false;
        }
        if (state) {
            invalidate();
            this.k.invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        xg xgVar = this.e;
        if (xgVar != null && xgVar.isVisible()) {
            xg xgVar2 = this.e;
            yg ygVar = xgVar2.e;
            CharSequence quantityString = null;
            if (xgVar2.isVisible()) {
                BadgeState$State badgeState$State = ygVar.b;
                if (badgeState$State.j != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    quantityString = badgeState$State.o;
                    if (quantityString == null) {
                        quantityString = xgVar2.e.b.j;
                    }
                } else if (xgVar2.f()) {
                    if (badgeState$State.q != 0 && (context = (Context) xgVar2.a.get()) != null) {
                        if (xgVar2.h != -2) {
                            int iD = xgVar2.d();
                            int i = xgVar2.h;
                            if (iD > i) {
                                quantityString = context.getString(badgeState$State.r, Integer.valueOf(i));
                            } else {
                                quantityString = context.getResources().getQuantityString(badgeState$State.q, xgVar2.d(), Integer.valueOf(xgVar2.d()));
                            }
                        } else {
                            quantityString = context.getResources().getQuantityString(badgeState$State.q, xgVar2.d(), Integer.valueOf(xgVar2.d()));
                        }
                    }
                } else {
                    quantityString = badgeState$State.p;
                }
            }
            accessibilityNodeInfoCompat.n(quantityString);
        }
        accessibilityNodeInfoCompat.m(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(0, 1, this.a.b, 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompat.k(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) AccessibilityNodeInfoCompat.AccessibilityActionCompat.g.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.ecffri.arrows.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.k;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.t, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            float f = tabLayout.q;
            int i3 = this.j;
            ImageView imageView = this.c;
            if (imageView != null && imageView.getVisibility() == 0) {
                i3 = 1;
            } else {
                TextView textView = this.b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.r;
                }
            }
            float textSize = this.b.getTextSize();
            int lineCount = this.b.getLineCount();
            int maxLines = this.b.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.B == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.b.getLayout();
                    if (layout != null) {
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.b.setTextSize(0, f);
                this.b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.a != null) {
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            go2 go2Var = this.a;
            TabLayout tabLayout = go2Var.d;
            if (tabLayout != null) {
                tabLayout.g(go2Var, true);
                return true;
            }
            d.r("Tab not attached to a TabLayout");
            return false;
        }
        return zPerformClick;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.b;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f;
        if (view != null) {
            view.setSelected(z);
        }
    }
}
