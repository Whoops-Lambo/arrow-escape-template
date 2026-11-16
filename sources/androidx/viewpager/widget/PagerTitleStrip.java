package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {
    public ViewPager a;
    public int b;
    public WeakReference c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {
        public int a;

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public final void a(ViewPager viewPager, PagerAdapter pagerAdapter) {
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i, float f, int i2) {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i) {
            this.a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i) {
            if (this.a == 0) {
                throw null;
            }
        }
    }

    public final void a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(null);
            this.c = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(null);
            this.c = new WeakReference(pagerAdapter2);
        }
        ViewPager viewPager = this.a;
        if (viewPager == null) {
            return;
        }
        int currentItem = viewPager.getCurrentItem();
        if (pagerAdapter2 != null) {
            pagerAdapter2.getCount();
        }
        if (currentItem < 1 || pagerAdapter2 == null) {
            throw null;
        }
        pagerAdapter2.getPageTitle(currentItem - 1);
        throw null;
    }

    public void b(float f) {
        throw null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    public void setGravity(int i) {
    }

    public void setNonPrimaryAlpha(@FloatRange float f) {
        throw null;
    }

    public void setTextColor(@ColorInt int i) {
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {
        public Locale a;

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.a);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        Context context = textView.getContext();
        SingleLineAllCapsTransform singleLineAllCapsTransform = new SingleLineAllCapsTransform();
        singleLineAllCapsTransform.a = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(singleLineAllCapsTransform);
    }

    public int getTextSpacing() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a != null) {
            b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public void setTextSpacing(int i) {
        this.b = i;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            PagerAdapter adapter = viewPager.getAdapter();
            PagerAdapter pagerAdapter = null;
            viewPager.setInternalPageChangeListener(null);
            viewPager.addOnAdapterChangeListener(null);
            this.a = viewPager;
            WeakReference weakReference = this.c;
            if (weakReference != null) {
                pagerAdapter = (PagerAdapter) weakReference.get();
            }
            a(pagerAdapter, adapter);
            return;
        }
        e32.i("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.a;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            this.a.setInternalPageChangeListener(null);
            this.a.removeOnAdapterChangeListener(null);
            this.a = null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), -2);
        ViewGroup.getChildMeasureSpec(i, (int) (View.MeasureSpec.getSize(i) * 0.2f), -2);
        throw null;
    }
}
