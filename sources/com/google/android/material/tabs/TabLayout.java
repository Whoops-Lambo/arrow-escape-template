package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ecffri.arrows.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.bo2;
import defpackage.c71;
import defpackage.co2;
import defpackage.d;
import defpackage.do2;
import defpackage.fo2;
import defpackage.go2;
import defpackage.ho2;
import defpackage.ip2;
import defpackage.jo2;
import defpackage.ke0;
import defpackage.ko2;
import defpackage.m63;
import defpackage.ni1;
import defpackage.nj;
import defpackage.nq2;
import defpackage.os2;
import defpackage.pi1;
import defpackage.r12;
import defpackage.uj;
import defpackage.wh1;
import defpackage.xf0;
import defpackage.xw0;
import defpackage.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {
    public static final Pools.SynchronizedPool V = new Pools.SynchronizedPool(16);
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public xw0 H;
    public final TimeInterpolator I;
    public bo2 J;
    public final ArrayList K;
    public ko2 L;
    public ValueAnimator M;
    public ViewPager N;
    public PagerAdapter O;
    public do2 P;
    public ho2 Q;
    public ao2 R;
    public boolean S;
    public int T;
    public final Pools.SimplePool U;
    public int a;
    public final ArrayList b;
    public go2 c;
    public final fo2 d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable o;
    public int p;
    public final float q;
    public final float r;
    public final int s;
    public int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public int y;
    public final int z;

    private int getTabMinWidth() {
        int i = this.u;
        if (i != -1) {
            return i;
        }
        int i2 = this.B;
        if (i2 == 0 || i2 == 2) {
            return this.w;
        }
        return 0;
    }

    public final void a(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = ViewCompat.a;
            if (isLaidOut()) {
                fo2 fo2Var = this.d;
                int childCount = fo2Var.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (fo2Var.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iC = c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i);
                if (scrollX != iC) {
                    d();
                    this.M.setIntValues(scrollX, iC);
                    this.M.start();
                }
                ValueAnimator valueAnimator = fo2Var.a;
                if (valueAnimator != null && valueAnimator.isRunning() && fo2Var.b.a != i) {
                    fo2Var.a.cancel();
                }
                fo2Var.d(i, this.z, true);
                return;
            }
        }
        i(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true, true);
    }

    public final void i(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            fo2 fo2Var = this.d;
            if (iRound >= fo2Var.getChildCount()) {
                return;
            }
            if (z2) {
                fo2Var.b.a = Math.round(f2);
                ValueAnimator valueAnimator = fo2Var.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fo2Var.a.cancel();
                }
                fo2Var.c(fo2Var.getChildAt(i), fo2Var.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.M;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.M.cancel();
            }
            int iC = c(f, i);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && iC >= scrollX) || (i > getSelectedTabPosition() && iC <= scrollX) || i == getSelectedTabPosition();
            WeakHashMap weakHashMap = ViewCompat.a;
            if (getLayoutDirection() == 1) {
                z4 = (i < getSelectedTabPosition() && iC <= scrollX) || (i > getSelectedTabPosition() && iC >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.T == 1 || z3) {
                if (i < 0) {
                    iC = 0;
                }
                scrollTo(iC, 0);
            }
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void k(boolean z) {
        int i = 0;
        while (true) {
            fo2 fo2Var = this.d;
            if (i >= fo2Var.getChildCount()) {
                return;
            }
            View childAt = fo2Var.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.B == 1 && this.y == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        jo2 jo2Var;
        Drawable drawable;
        int i = 0;
        while (true) {
            fo2 fo2Var = this.d;
            if (i >= fo2Var.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = fo2Var.getChildAt(i);
            if ((childAt instanceof jo2) && (drawable = (jo2Var = (jo2) childAt).i) != null) {
                drawable.setBounds(jo2Var.getLeft(), jo2Var.getTop(), jo2Var.getRight(), jo2Var.getBottom());
                jo2Var.i.draw(canvas);
            }
            i++;
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        h(pagerAdapter, false);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        j(viewPager, false);
    }

    @Dimension
    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        fo2 fo2Var = this.d;
        int childCount = fo2Var.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = fo2Var.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof jo2) {
                        ((jo2) childAt).f();
                    }
                }
                i2++;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b() {
        int i = this.B;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.x - this.e) : 0;
        WeakHashMap weakHashMap = ViewCompat.a;
        fo2 fo2Var = this.d;
        fo2Var.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.B;
        if (i2 == 0) {
            int i3 = this.y;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                fo2Var.setGravity(1);
            } else if (i3 == 2) {
            }
            fo2Var.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.y == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            fo2Var.setGravity(1);
        }
        k(true);
    }

    public final int c(float f, int i) {
        fo2 fo2Var;
        View childAt;
        int i2 = this.B;
        if ((i2 != 0 && i2 != 2) || (childAt = (fo2Var = this.d).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < fo2Var.getChildCount() ? fo2Var.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap weakHashMap = ViewCompat.a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void d() {
        if (this.M == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.M = valueAnimator;
            valueAnimator.setInterpolator(this.I);
            this.M.setDuration(this.z);
            this.M.addUpdateListener(new uj(this, 2));
        }
    }

    public final go2 e(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (go2) this.b.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11, types: [jo2] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.view.View, jo2] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f() {
        Pools.SimplePool simplePool;
        CharSequence charSequence;
        Pools.SynchronizedPool synchronizedPool;
        int currentItem;
        ?? jo2Var;
        jo2 jo2Var2;
        fo2 fo2Var = this.d;
        int childCount = fo2Var.getChildCount() - 1;
        while (true) {
            simplePool = this.U;
            charSequence = null;
            if (childCount < 0) {
                break;
            }
            jo2 jo2Var3 = (jo2) fo2Var.getChildAt(childCount);
            fo2Var.removeViewAt(childCount);
            if (jo2Var3 != null) {
                jo2Var3.setTab(null);
                jo2Var3.setSelected(false);
                simplePool.b(jo2Var3);
            }
            requestLayout();
            childCount--;
        }
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            synchronizedPool = V;
            if (!zHasNext) {
                break;
            }
            go2 go2Var = (go2) it.next();
            it.remove();
            go2Var.d = null;
            go2Var.e = null;
            go2Var.a = null;
            go2Var.b = -1;
            go2Var.c = null;
            synchronizedPool.b(go2Var);
        }
        this.c = null;
        PagerAdapter pagerAdapter = this.O;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            int i = 0;
            while (i < count) {
                go2 go2Var2 = (go2) synchronizedPool.a();
                if (go2Var2 == null) {
                    go2Var2 = new go2();
                    go2Var2.b = -1;
                }
                go2Var2.d = this;
                if (simplePool != null) {
                    jo2Var2 = (jo2) simplePool.a();
                } else {
                    jo2Var = charSequence;
                }
                if (jo2Var == 0) {
                    jo2Var = jo2Var2;
                    jo2Var = new jo2(this, getContext());
                }
                jo2Var = jo2Var2;
                jo2Var.setTab(go2Var2);
                jo2Var.setFocusable(true);
                jo2Var.setMinimumWidth(getTabMinWidth());
                if (TextUtils.isEmpty(charSequence)) {
                    jo2Var.setContentDescription(go2Var2.a);
                } else {
                    jo2Var.setContentDescription(charSequence);
                }
                go2Var2.e = jo2Var;
                CharSequence pageTitle = this.O.getPageTitle(i);
                if (TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(pageTitle)) {
                    go2Var2.e.setContentDescription(pageTitle);
                }
                go2Var2.a = pageTitle;
                jo2 jo2Var4 = go2Var2.e;
                if (jo2Var4 != null) {
                    jo2Var4.d();
                }
                int size = arrayList.size();
                if (go2Var2.d != this) {
                    d.r("Tab belongs to a different TabLayout.");
                    return;
                }
                go2Var2.b = size;
                arrayList.add(size, go2Var2);
                int size2 = arrayList.size();
                int i2 = -1;
                for (int i3 = size + 1; i3 < size2; i3++) {
                    if (((go2) arrayList.get(i3)).b == this.a) {
                        i2 = i3;
                    }
                    ((go2) arrayList.get(i3)).b = i3;
                }
                this.a = i2;
                jo2 jo2Var5 = go2Var2.e;
                jo2Var5.setSelected(false);
                jo2Var5.setActivated(false);
                int i4 = go2Var2.b;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (this.B == 1 && this.y == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                fo2Var.addView(jo2Var5, i4, layoutParams);
                i++;
                charSequence = null;
            }
            ViewPager viewPager = this.N;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            g(e(currentItem), true);
        }
    }

    public final void g(go2 go2Var, boolean z) {
        TabLayout tabLayout;
        go2 go2Var2 = this.c;
        ArrayList arrayList = this.K;
        if (go2Var2 == go2Var) {
            if (go2Var2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((bo2) arrayList.get(size)).getClass();
                }
                a(go2Var.b);
                return;
            }
            return;
        }
        int i = go2Var != null ? go2Var.b : -1;
        if (z) {
            if ((go2Var2 == null || go2Var2.b == -1) && i != -1) {
                tabLayout = this;
                tabLayout.i(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true, true);
            } else {
                tabLayout = this;
                tabLayout.a(i);
            }
            if (i != -1) {
                tabLayout.setSelectedTabView(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.c = go2Var;
        if (go2Var2 != null && go2Var2.d != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((bo2) arrayList.get(size2)).b(go2Var2);
            }
        }
        if (go2Var != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((bo2) arrayList.get(size3)).a(go2Var);
            }
        }
    }

    public int getSelectedTabPosition() {
        go2 go2Var = this.c;
        if (go2Var != null) {
            return go2Var.b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.y;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.F;
    }

    public int getTabIndicatorGravity() {
        return this.A;
    }

    public int getTabMaxWidth() {
        return this.t;
    }

    public int getTabMode() {
        return this.B;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.n;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.o;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public final void h(PagerAdapter pagerAdapter, boolean z) {
        do2 do2Var;
        PagerAdapter pagerAdapter2 = this.O;
        if (pagerAdapter2 != null && (do2Var = this.P) != null) {
            pagerAdapter2.unregisterDataSetObserver(do2Var);
        }
        this.O = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.P == null) {
                this.P = new do2(this);
            }
            pagerAdapter.registerDataSetObserver(this.P);
        }
        f();
    }

    public final void j(ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.N;
        if (viewPager2 != null) {
            ho2 ho2Var = this.Q;
            if (ho2Var != null) {
                viewPager2.removeOnPageChangeListener(ho2Var);
            }
            ao2 ao2Var = this.R;
            if (ao2Var != null) {
                this.N.removeOnAdapterChangeListener(ao2Var);
            }
        }
        ko2 ko2Var = this.L;
        ArrayList arrayList = this.K;
        if (ko2Var != null) {
            arrayList.remove(ko2Var);
            this.L = null;
        }
        if (viewPager != null) {
            this.N = viewPager;
            if (this.Q == null) {
                this.Q = new ho2(this);
            }
            ho2 ho2Var2 = this.Q;
            ho2Var2.c = 0;
            ho2Var2.b = 0;
            viewPager.addOnPageChangeListener(ho2Var2);
            ko2 ko2Var2 = new ko2(viewPager);
            this.L = ko2Var2;
            if (!arrayList.contains(ko2Var2)) {
                arrayList.add(ko2Var2);
            }
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                h(adapter, true);
            }
            if (this.R == null) {
                this.R = new ao2(this);
            }
            ao2 ao2Var2 = this.R;
            ao2Var2.a = true;
            viewPager.addOnAdapterChangeListener(ao2Var2);
            i(viewPager.getCurrentItem(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true, true);
        } else {
            this.N = null;
            h(null, false);
        }
        this.S = z;
    }

    public void setInlineLabel(boolean z) {
        if (this.C == z) {
            return;
        }
        this.C = z;
        int i = 0;
        while (true) {
            fo2 fo2Var = this.d;
            if (i >= fo2Var.getChildCount()) {
                b();
                return;
            }
            View childAt = fo2Var.getChildAt(i);
            if (childAt instanceof jo2) {
                jo2 jo2Var = (jo2) childAt;
                jo2Var.setOrientation(!jo2Var.k.C ? 1 : 0);
                TextView textView = jo2Var.g;
                if (textView == null && jo2Var.h == null) {
                    jo2Var.g(jo2Var.b, jo2Var.c, true);
                } else {
                    jo2Var.g(textView, jo2Var.h, false);
                }
            }
            i++;
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable bo2 bo2Var) {
        bo2 bo2Var2 = this.J;
        ArrayList arrayList = this.K;
        if (bo2Var2 != null) {
            arrayList.remove(bo2Var2);
        }
        this.J = bo2Var;
        if (bo2Var == null || arrayList.contains(bo2Var)) {
            return;
        }
        arrayList.add(bo2Var);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.o = drawableMutate;
        int i = this.p;
        if (i != 0) {
            drawableMutate.setTint(i);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.E;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.o.getIntrinsicHeight();
        }
        this.d.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.p = i;
        Drawable drawable = this.o;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        k(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.A != i) {
            this.A = i;
            WeakHashMap weakHashMap = ViewCompat.a;
            this.d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.E = i;
        this.d.b(i);
    }

    public void setTabGravity(int i) {
        if (this.y != i) {
            this.y = i;
            b();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                jo2 jo2Var = ((go2) arrayList.get(i)).e;
                if (jo2Var != null) {
                    jo2Var.d();
                }
            }
        }
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.F = i;
        if (i == 0) {
            this.H = new xw0(15);
            return;
        }
        if (i == 1) {
            this.H = new xf0(0);
        } else if (i == 2) {
            this.H = new xf0(1);
        } else {
            d.r(nj.j(i, " is not a valid TabIndicatorAnimationMode"));
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.D = z;
        int i = fo2.c;
        fo2 fo2Var = this.d;
        fo2Var.a(fo2Var.b.getSelectedTabPosition());
        WeakHashMap weakHashMap = ViewCompat.a;
        fo2Var.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.B) {
            this.B = i;
            b();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.n == colorStateList) {
            return;
        }
        this.n = colorStateList;
        int i = 0;
        while (true) {
            fo2 fo2Var = this.d;
            if (i >= fo2Var.getChildCount()) {
                return;
            }
            View childAt = fo2Var.getChildAt(i);
            if (childAt instanceof jo2) {
                Context context = getContext();
                int i2 = jo2.l;
                ((jo2) childAt).e(context);
            }
            i++;
        }
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                jo2 jo2Var = ((go2) arrayList.get(i)).e;
                if (jo2Var != null) {
                    jo2Var.d();
                }
            }
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        int i = 0;
        while (true) {
            fo2 fo2Var = this.d;
            if (i >= fo2Var.getChildCount()) {
                return;
            }
            View childAt = fo2Var.getChildAt(i);
            if (childAt instanceof jo2) {
                Context context = getContext();
                int i2 = jo2.l;
                ((jo2) childAt).e(context);
            }
            i++;
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(os2.G(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.a = -1;
        this.b = new ArrayList();
        this.k = -1;
        this.p = 0;
        this.t = Integer.MAX_VALUE;
        this.E = -1;
        this.K = new ArrayList();
        this.U = new Pools.SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        fo2 fo2Var = new fo2(this, context2);
        this.d = fo2Var;
        super.addView(fo2Var, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = ip2.d(context2, attributeSet, r12.D, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListA = ke0.a(getBackground());
        if (colorStateListA != null) {
            pi1 pi1Var = new pi1();
            pi1Var.k(colorStateListA);
            pi1Var.i(context2);
            pi1Var.j(ViewCompat.k(this));
            setBackground(pi1Var);
        }
        setSelectedTabIndicator(ni1.c(context2, typedArrayD, 5));
        setSelectedTabIndicatorColor(typedArrayD.getColor(8, 0));
        fo2Var.b(typedArrayD.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(9, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(16, 0);
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.e = typedArrayD.getDimensionPixelSize(19, dimensionPixelSize);
        this.f = typedArrayD.getDimensionPixelSize(20, dimensionPixelSize);
        this.g = typedArrayD.getDimensionPixelSize(18, dimensionPixelSize);
        this.h = typedArrayD.getDimensionPixelSize(17, dimensionPixelSize);
        if (wh1.b(context2, false, R.attr.isMaterial3Theme)) {
            this.i = R.attr.textAppearanceTitleSmall;
        } else {
            this.i = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayD.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.j = resourceId;
        int[] iArr = androidx.appcompat.R.styleable.w;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.q = dimensionPixelSize2;
            this.l = ni1.a(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(22)) {
                this.k = typedArrayD.getResourceId(22, resourceId);
            }
            int i = this.k;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListA2 = ni1.a(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListA2 != null) {
                        this.l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{colorStateListA2.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA2.getDefaultColor()), this.l.getDefaultColor()});
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayD.hasValue(25)) {
                this.l = ni1.a(context2, typedArrayD, 25);
            }
            if (typedArrayD.hasValue(23)) {
                this.l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{typedArrayD.getColor(23, 0), this.l.getDefaultColor()});
            }
            this.m = ni1.a(context2, typedArrayD, 3);
            m63.c(typedArrayD.getInt(4, -1), null);
            this.n = ni1.a(context2, typedArrayD, 21);
            this.z = typedArrayD.getInt(6, 300);
            this.I = nq2.l(context2, R.attr.motionEasingEmphasizedInterpolator, y6.b);
            this.u = typedArrayD.getDimensionPixelSize(14, -1);
            this.v = typedArrayD.getDimensionPixelSize(13, -1);
            this.s = typedArrayD.getResourceId(0, 0);
            this.x = typedArrayD.getDimensionPixelSize(1, 0);
            this.B = typedArrayD.getInt(15, 1);
            this.y = typedArrayD.getInt(2, 0);
            this.C = typedArrayD.getBoolean(12, false);
            this.G = typedArrayD.getBoolean(26, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.r = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.w = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            b();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof pi1) {
            c71.t(this, (pi1) background);
        }
        if (this.N == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                j((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.S) {
            setupWithViewPager(null);
            this.S = false;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).l(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(1, getTabCount(), 1, false));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(m63.a(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iA = this.v;
            if (iA <= 0) {
                iA = (int) (size - m63.a(getContext(), 56));
            }
            this.t = iA;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.B;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        return;
                    }
                    if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                        return;
                    }
                } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof pi1) {
            ((pi1) background).j(f);
        }
    }

    public void setInlineLabelResource(@BoolRes int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        d();
        this.M.addListener(animatorListener);
    }

    public void setTabIconTintResource(@ColorRes int i) {
        setTabIconTint(ContextCompat.c(getContext(), i));
    }

    public void setTabRippleColorResource(@ColorRes int i) {
        setTabRippleColor(ContextCompat.c(getContext(), i));
    }

    public void setUnboundedRippleResource(@BoolRes int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable co2 co2Var) {
        setOnTabSelectedListener((bo2) co2Var);
    }

    public void setSelectedTabIndicator(@DrawableRes int i) {
        if (i != 0) {
            setSelectedTabIndicator(AppCompatResources.a(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
