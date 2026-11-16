package com.bytedance.adsdk.ugeno.gf;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import defpackage.h50;
import defpackage.nj;
import io.p071bidmachine.media3.extractor.ts.y;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class rz extends ViewGroup {
    static final int[] ahm = {R.attr.layout_gravity};
    private static final Comparator<ahm> ct = new Comparator<ahm>() { // from class: com.bytedance.adsdk.ugeno.gf.rz.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public int compare(ahm ahmVar, ahm ahmVar2) {
            return ahmVar.ahm - ahmVar2.ahm;
        }
    };
    private static final Interpolator noq = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.gf.rz.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final fi xts = new fi();
    private ClassLoader at;
    private int ay;
    private int bmz;
    private boolean cc;
    private int dg;
    private int dpp;
    private int dta;
    private final ahm fi;
    private int fpp;
    private boolean fpz;
    private int ft;
    private VelocityTracker ftg;
    private int gbb;
    private int gc;
    private final Rect gf;
    private EdgeEffect gg;
    private float gm;
    private int ikw;
    private int ioy;
    private EdgeEffect jc;
    private boolean jpc;
    private int kgy;
    private boolean kus;
    private boolean lb;
    private boolean lqi;
    private int mca;
    private float muf;
    private float mw;
    private ct naw;
    private Parcelable nu;
    private List<uq> pft;
    private boolean pxt;
    private uq qdr;
    private int ra;
    com.bytedance.adsdk.ugeno.gf.ahm rz;
    private boolean sm;
    private float sx;
    private int tp;
    private Scroller twf;
    private boolean uf;
    private ArrayList<View> uh;
    private int um;
    int uq;
    private float uxe;
    private int vg;
    private float vrj;
    private noq vs;
    private int wl;
    private boolean wy;
    private Drawable xh;
    private int xkh;
    private uq xrn;
    private final ArrayList<ahm> yo;
    private final Runnable yx;
    private List<Object> zjw;
    private int znm;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm {
        int ahm;
        float ct;
        Object kgy;
        boolean rz;
        float uq;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ct {
        void kgy(View view, float f);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface kgy {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class noq extends DataSetObserver {
        public noq() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            rz.this.ahm();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            rz.this.ahm();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface uq {
        void at(int i);

        void kgy(int i, float f, int i2);

        void twf(int i);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class yo extends com.bytedance.adsdk.ugeno.gf.kgy {
        public static final Parcelable.Creator<yo> CREATOR = new Parcelable.ClassLoaderCreator<yo>() { // from class: com.bytedance.adsdk.ugeno.gf.rz.yo.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public yo createFromParcel(Parcel parcel) {
                return new yo(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public yo createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new yo(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public yo[] newArray(int i) {
                return new yo[i];
            }
        };
        int ahm;
        Parcelable rz;
        ClassLoader uq;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return nj.l(this.ahm, "}", sb);
        }

        public yo(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.ahm = parcel.readInt();
            this.rz = parcel.readParcelable(classLoader);
            this.uq = classLoader;
        }

        @Override // com.bytedance.adsdk.ugeno.gf.kgy, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.ahm);
            parcel.writeParcelable(this.rz, i);
        }

        public yo(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private boolean fi() {
        this.mca = -1;
        ra();
        this.jc.onRelease();
        this.gg.onRelease();
        return this.jc.isFinished() || this.gg.isFinished();
    }

    private void ra() {
        this.wy = false;
        this.uf = false;
        VelocityTracker velocityTracker = this.ftg;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ftg = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ahm ahmVarKgy;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (ahmVarKgy = kgy(childAt)) != null && ahmVarKgy.ahm == this.uq) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.kus = true;
        if (this.twf.isFinished() || !this.twf.computeScrollOffset()) {
            kgy(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.twf.getCurrX();
        int currY = this.twf.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!uq(currX)) {
                this.twf.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C0193rz c0193rz;
        C0193rz c0193rz2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.bmz = Math.min(measuredWidth / 10, this.vg);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c0193rz2 = (C0193rz) childAt.getLayoutParams()) != null && c0193rz2.kgy) {
                int i6 = c0193rz2.ahm;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c0193rz2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c0193rz2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.ay = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.ioy = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.lqi = true;
        rz();
        this.lqi = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c0193rz = (C0193rz) childAt2.getLayoutParams()) == null || !c0193rz.kgy)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0193rz.rz), 1073741824), this.ioy);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.jpc = false;
        kgy(i, !this.sm, false);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class fi implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0193rz c0193rz = (C0193rz) view.getLayoutParams();
            C0193rz c0193rz2 = (C0193rz) view2.getLayoutParams();
            boolean z = c0193rz.kgy;
            if (z != c0193rz2.kgy) {
                if (z) {
                    return 1;
                }
                return -1;
            }
            return c0193rz.ct - c0193rz2.ct;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.gf.rz$rz, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0193rz extends ViewGroup.LayoutParams {
        public int ahm;
        int ct;
        public boolean kgy;
        int noq;
        float rz;
        boolean uq;

        public C0193rz(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.rz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rz.ahm);
            this.ahm = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0193rz() {
            super(-1, -1);
            this.rz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    private void ct(int i) {
        uq uqVar = this.xrn;
        if (uqVar != null) {
            uqVar.at(i);
        }
        List<uq> list = this.pft;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                uq uqVar2 = this.pft.get(i2);
                if (uqVar2 != null) {
                    uqVar2.at(i);
                }
            }
        }
        uq uqVar3 = this.qdr;
        if (uqVar3 != null) {
            uqVar3.at(i);
        }
    }

    private void noq(int i) {
        uq uqVar = this.xrn;
        if (uqVar != null) {
            uqVar.twf(i);
        }
        List<uq> list = this.pft;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                uq uqVar2 = this.pft.get(i2);
                if (uqVar2 != null) {
                    uqVar2.twf(i);
                }
            }
        }
        uq uqVar3 = this.qdr;
        if (uqVar3 != null) {
            uqVar3.twf(i);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.fpz != z) {
            this.fpz = z;
        }
    }

    private boolean uq(int i) {
        if (this.yo.size() == 0) {
            if (this.sm) {
                return false;
            }
            this.pxt = false;
            kgy(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            if (this.pxt) {
                return false;
            }
            e32.i("onPageScrolled did not call superclass implementation");
            return false;
        }
        ahm ahmVarGf = gf();
        int clientWidth = getClientWidth();
        int i2 = this.dg;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = ahmVarGf.ahm;
        float f2 = ((i / f) - ahmVarGf.ct) / (ahmVarGf.uq + (i2 / f));
        this.pxt = false;
        kgy(i4, f2, (int) (i3 * f2));
        if (this.pxt) {
            return true;
        }
        e32.i("onPageScrolled did not call superclass implementation");
        return false;
    }

    private void yo() {
        if (this.xkh != 0) {
            ArrayList<View> arrayList = this.uh;
            if (arrayList == null) {
                this.uh = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.uh.add(getChildAt(i));
            }
            Collections.sort(this.uh, xts);
        }
    }

    public void ahm() {
        ArrayList<ahm> arrayList;
        int iKgy = this.rz.kgy();
        this.kgy = iKgy;
        boolean z = this.yo.size() < (this.ft * 2) + 1 && this.yo.size() < iKgy;
        int iMax = this.uq;
        int i = 0;
        while (true) {
            int size = this.yo.size();
            arrayList = this.yo;
            if (i >= size) {
                break;
            }
            ahm ahmVar = arrayList.get(i);
            int iKgy2 = this.rz.kgy(ahmVar.kgy);
            if (iKgy2 != -1) {
                if (iKgy2 == -2) {
                    this.yo.remove(i);
                    i--;
                    this.rz.kgy((ViewGroup) this, ahmVar.ahm, ahmVar.kgy);
                    int i2 = this.uq;
                    if (i2 == ahmVar.ahm) {
                        iMax = Math.max(0, Math.min(i2, iKgy - 1));
                    }
                } else {
                    int i3 = ahmVar.ahm;
                    if (i3 != iKgy2) {
                        if (i3 == this.uq) {
                            iMax = iKgy2;
                        }
                        ahmVar.ahm = iKgy2;
                    }
                }
                z = true;
            }
            i++;
        }
        Collections.sort(arrayList, ct);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C0193rz c0193rz = (C0193rz) getChildAt(i4).getLayoutParams();
                if (!c0193rz.kgy) {
                    c0193rz.rz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            kgy(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.rz == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.sx));
        }
        return i > 0 && scrollX < ((int) (((float) clientWidth) * this.gm));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0193rz) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0193rz();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0193rz(getContext(), attributeSet);
    }

    public com.bytedance.adsdk.ugeno.gf.ahm getAdapter() {
        return this.rz;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.xkh == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0193rz) this.uh.get(i2).getLayoutParams()).noq;
    }

    public int getCurrentItem() {
        return this.uq;
    }

    public int getOffscreenPageLimit() {
        return this.ft;
    }

    public int getPageMargin() {
        return this.dg;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c6 A[PHI: r7 r10 r14
  0x00c6: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    public void kgy(int i) {
        ahm ahmVarAhm;
        String hexString;
        ahm ahmVarKgy;
        ahm ahmVarKgy2;
        ahm ahmVar;
        int i2 = this.uq;
        if (i2 != i) {
            ahmVarAhm = ahm(i2);
            this.uq = i;
        } else {
            ahmVarAhm = null;
        }
        if (this.rz == null) {
            yo();
            return;
        }
        if (this.jpc) {
            yo();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i3 = this.ft;
        int iMax = Math.max(0, this.uq - i3);
        int iKgy = this.rz.kgy();
        int iMin = Math.min(iKgy - 1, this.uq + i3);
        if (iKgy != this.kgy) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            h50.s(this.kgy, iKgy, ", found: ", " Pager id: ", sb);
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            y.n(sb, this.rz.getClass());
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 < this.yo.size()) {
                ahmVarKgy = this.yo.get(i4);
                int i5 = ahmVarKgy.ahm;
                int i6 = this.uq;
                if (i5 >= i6) {
                    if (i5 != i6) {
                        break;
                    } else {
                        break;
                    }
                }
                i4++;
            }
            ahmVarKgy = null;
            break;
        }
        if (ahmVarKgy == null && iKgy > 0) {
            ahmVarKgy = kgy(this.uq, i4);
        }
        if (ahmVarKgy != null) {
            int i7 = i4 - 1;
            ahm ahmVar2 = i7 >= 0 ? this.yo.get(i7) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - ahmVarKgy.uq);
            float f = 0.0f;
            for (int i8 = this.uq - 1; i8 >= 0; i8--) {
                if (f >= paddingLeft && i8 < iMax) {
                    if (ahmVar2 == null) {
                        break;
                    }
                    if (i8 == ahmVar2.ahm && !ahmVar2.rz) {
                        this.yo.remove(i7);
                        this.rz.kgy((ViewGroup) this, i8, ahmVar2.kgy);
                        i7--;
                        i4--;
                        if (i7 >= 0) {
                            ahmVar = this.yo.get(i7);
                        } else {
                            ahmVar = null;
                        }
                        ahmVar2 = ahmVar;
                    }
                } else {
                    if (ahmVar2 == null || i8 != ahmVar2.ahm) {
                        f += kgy(i8, i7 + 1).uq;
                        i4++;
                        if (i7 >= 0) {
                            ahmVar = this.yo.get(i7);
                        } else {
                            ahmVar = null;
                        }
                    } else {
                        f += ahmVar2.uq;
                        i7--;
                        if (i7 >= 0) {
                            ahmVar = this.yo.get(i7);
                        } else {
                            ahmVar = null;
                        }
                    }
                    ahmVar2 = ahmVar;
                }
            }
            float f2 = ahmVarKgy.uq;
            int i9 = i4 + 1;
            if (f2 < 2.0f) {
                ahm ahmVar3 = i9 < this.yo.size() ? this.yo.get(i9) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i10 = this.uq;
                while (true) {
                    i10++;
                    if (i10 >= iKgy) {
                        break;
                    }
                    if (f2 >= paddingRight && i10 > iMin) {
                        if (ahmVar3 == null) {
                            break;
                        }
                        if (i10 == ahmVar3.ahm && !ahmVar3.rz) {
                            this.yo.remove(i9);
                            this.rz.kgy((ViewGroup) this, i10, ahmVar3.kgy);
                            if (i9 < this.yo.size()) {
                                ahmVar3 = this.yo.get(i9);
                            }
                        }
                    } else if (ahmVar3 == null || i10 != ahmVar3.ahm) {
                        ahm ahmVarKgy3 = kgy(i10, i9);
                        i9++;
                        f2 += ahmVarKgy3.uq;
                        ahmVar3 = i9 < this.yo.size() ? this.yo.get(i9) : null;
                    } else {
                        f2 += ahmVar3.uq;
                        i9++;
                        if (i9 < this.yo.size()) {
                            ahmVar3 = this.yo.get(i9);
                        }
                    }
                }
            }
            kgy(ahmVarKgy, i4, ahmVarAhm);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C0193rz c0193rz = (C0193rz) childAt.getLayoutParams();
            c0193rz.noq = i11;
            if (!c0193rz.kgy && c0193rz.rz == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (ahmVarKgy2 = kgy(childAt)) != null) {
                c0193rz.rz = ahmVarKgy2.uq;
                c0193rz.ct = ahmVarKgy2.ahm;
            }
        }
        yo();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            ahm ahmVarAhm2 = viewFindFocus != null ? ahm(viewFindFocus) : null;
            if (ahmVarAhm2 == null || ahmVarAhm2.ahm != this.uq) {
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    ahm ahmVarKgy4 = kgy(childAt2);
                    if (ahmVarKgy4 != null && ahmVarKgy4.ahm == this.uq && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.yx);
        Scroller scroller = this.twf;
        if (scroller != null && !scroller.isFinished()) {
            this.twf.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.dg <= 0 || this.xh == null || this.yo.size() <= 0 || this.rz == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = width;
        float f3 = this.dg / f2;
        int i2 = 0;
        ahm ahmVar = this.yo.get(0);
        float f4 = ahmVar.ct;
        int size = this.yo.size();
        int i3 = ahmVar.ahm;
        int i4 = this.yo.get(size - 1).ahm;
        while (i3 < i4) {
            while (true) {
                i = ahmVar.ahm;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                ahmVar = this.yo.get(i2);
            }
            if (i3 == i) {
                float f5 = ahmVar.ct;
                float f6 = ahmVar.uq;
                f = (f5 + f6) * f2;
                f4 = f5 + f6 + f3;
            } else {
                float fKgy = this.rz.kgy(i3);
                f = (f4 + fKgy) * f2;
                f4 = fKgy + f3 + f4;
            }
            if (this.dg + f > scrollX) {
                this.xh.setBounds(Math.round(f), this.um, Math.round(this.dg + f), this.fpp);
                this.xh.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            scrollX = scrollX;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        ahm ahmVarKgy;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0193rz c0193rz = (C0193rz) childAt.getLayoutParams();
                if (c0193rz.kgy) {
                    int i9 = c0193rz.ahm;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 != 16) {
                            if (i11 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i14 = paddingLeft + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i11 != 16) {
                        if (i11 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i16 = paddingLeft + scrollX;
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i17 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i17;
                    int i18 = paddingLeft + scrollX;
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i19 = (i5 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                C0193rz c0193rz2 = (C0193rz) childAt2.getLayoutParams();
                if (!c0193rz2.kgy && (ahmVarKgy = kgy(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (ahmVarKgy.ct * f)) + paddingLeft;
                    if (c0193rz2.uq) {
                        c0193rz2.uq = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0193rz2.rz), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.um = paddingTop;
        this.fpp = i6 - paddingBottom;
        this.dpp = i7;
        if (this.sm) {
            z2 = false;
            kgy(this.uq, false, 0, false);
        } else {
            z2 = false;
        }
        this.sm = z2;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof yo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        yo yoVar = (yo) parcelable;
        super.onRestoreInstanceState(yoVar.kgy());
        com.bytedance.adsdk.ugeno.gf.ahm ahmVar = this.rz;
        int i = yoVar.ahm;
        if (ahmVar != null) {
            kgy(i, false, true);
            return;
        }
        this.ra = i;
        this.nu = yoVar.rz;
        this.at = yoVar.uq;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.gf.ahm ahmVar;
        int iFindPointerIndex;
        if (this.lb) {
            return true;
        }
        boolean zFi = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (ahmVar = this.rz) == null || ahmVar.kgy() == 0) {
            return false;
        }
        if (this.ftg == null) {
            this.ftg = VelocityTracker.obtain();
        }
        this.ftg.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.twf.abortAnimation();
            this.jpc = false;
            rz();
            float x = motionEvent.getX();
            this.vrj = x;
            this.uxe = x;
            float y = motionEvent.getY();
            this.mw = y;
            this.muf = y;
            this.mca = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.uxe = motionEvent.getX(actionIndex);
                            this.mca = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        kgy(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.mca);
                        if (iFindPointerIndex2 != -1) {
                            this.uxe = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.wy) {
                    kgy(this.uq, true, 0, false);
                    zFi = fi();
                }
            } else if (!this.wy) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.mca);
                if (iFindPointerIndex3 == -1) {
                    zFi = fi();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x2 - this.uxe);
                    float y2 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y2 - this.muf);
                    if (fAbs > this.ikw && fAbs > fAbs2) {
                        this.wy = true;
                        rz(true);
                        float f = this.vrj;
                        float f2 = x2 - f;
                        int i = this.ikw;
                        this.uxe = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f + i : f - i;
                        this.muf = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.wy) {
                        zFi = ahm(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.wy && (iFindPointerIndex = motionEvent.findPointerIndex(this.mca)) != -1) {
                zFi = ahm(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.wy) {
            VelocityTracker velocityTracker = this.ftg;
            velocityTracker.computeCurrentVelocity(1000, this.gbb);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mca);
            this.jpc = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ahm ahmVarGf = gf();
            float f3 = clientWidth;
            float f4 = this.dg / f3;
            int i2 = ahmVarGf.ahm;
            float f5 = ((scrollX / f3) - ahmVarGf.ct) / (ahmVarGf.uq + f4);
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.mca);
            if (iFindPointerIndex4 != -1) {
                kgy(kgy(i2, f5, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.vrj)), true, true, xVelocity);
                zFi = fi();
            }
        }
        if (zFi) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.lqi) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.gf.ahm ahmVar) {
        ArrayList<ahm> arrayList;
        com.bytedance.adsdk.ugeno.gf.ahm ahmVar2 = this.rz;
        if (ahmVar2 != null) {
            ahmVar2.kgy((DataSetObserver) null);
            int i = 0;
            while (true) {
                int size = this.yo.size();
                arrayList = this.yo;
                if (i >= size) {
                    break;
                }
                ahm ahmVar3 = arrayList.get(i);
                this.rz.kgy((ViewGroup) this, ahmVar3.ahm, ahmVar3.kgy);
                i++;
            }
            arrayList.clear();
            noq();
            this.uq = 0;
            scrollTo(0, 0);
        }
        this.rz = ahmVar;
        this.kgy = 0;
        if (ahmVar != null) {
            if (this.vs == null) {
                this.vs = new noq();
            }
            this.rz.kgy((DataSetObserver) this.vs);
            this.jpc = false;
            boolean z = this.sm;
            this.sm = true;
            this.kgy = this.rz.kgy();
            int i2 = this.ra;
            if (i2 >= 0) {
                kgy(i2, false, true);
                this.ra = -1;
                this.nu = null;
                this.at = null;
            } else if (z) {
                requestLayout();
            } else {
                rz();
            }
        }
        List<Object> list = this.zjw;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size2 = this.zjw.size();
        for (int i3 = 0; i3 < size2; i3++) {
            this.zjw.get(i3);
        }
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.ft) {
            this.ft = i;
            rz();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(uq uqVar) {
        this.xrn = uqVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.dg;
        this.dg = i;
        int width = getWidth();
        kgy(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.xh = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.gc == i) {
            return;
        }
        this.gc = i;
        if (this.naw != null) {
            ahm(i != 0);
        }
        noq(i);
    }

    public void setScroller(Scroller scroller) {
        this.twf = scroller;
    }

    public rz(Context context) {
        super(context);
        this.yo = new ArrayList<>();
        this.fi = new ahm();
        this.gf = new Rect();
        this.ra = -1;
        this.nu = null;
        this.at = null;
        this.sx = -3.4028235E38f;
        this.gm = Float.MAX_VALUE;
        this.ft = 1;
        this.mca = -1;
        this.sm = true;
        this.cc = false;
        this.yx = new Runnable() { // from class: com.bytedance.adsdk.ugeno.gf.rz.3
            @Override // java.lang.Runnable
            public void run() {
                rz.this.setScrollState(0);
                rz.this.rz();
            }
        };
        this.gc = 0;
        kgy();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private ahm gf() {
        float scrollX;
        float f;
        int i;
        int clientWidth = getClientWidth();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (clientWidth > 0) {
            scrollX = getScrollX() / clientWidth;
        } else {
            scrollX = 0.0f;
        }
        if (clientWidth > 0) {
            f = this.dg / clientWidth;
        } else {
            f = 0.0f;
        }
        int i2 = 0;
        boolean z = true;
        ahm ahmVar = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.yo.size()) {
            ahm ahmVar2 = this.yo.get(i2);
            if (!z && ahmVar2.ahm != (i = i3 + 1)) {
                ahmVar2 = this.fi;
                ahmVar2.ct = f2 + f3 + f;
                ahmVar2.ahm = i;
                ahmVar2.uq = this.rz.kgy(i);
                i2--;
            }
            ahm ahmVar3 = ahmVar2;
            f2 = ahmVar3.ct;
            float f4 = ahmVar3.uq + f2 + f;
            if (!z && scrollX < f2) {
                break;
            }
            if (scrollX >= f4 && i2 != this.yo.size() - 1) {
                int i4 = ahmVar3.ahm;
                float f5 = ahmVar3.uq;
                i2++;
                i3 = i4;
                f3 = f5;
                ahmVar = ahmVar3;
                z = false;
            } else {
                return ahmVar3;
            }
        }
        return ahmVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ahm ahmVarKgy;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (ahmVarKgy = kgy(childAt)) != null && ahmVarKgy.ahm == this.uq) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0193rz c0193rz = (C0193rz) layoutParams;
        boolean zRz = c0193rz.kgy | rz(view);
        c0193rz.kgy = zRz;
        if (this.lqi) {
            if (!zRz) {
                c0193rz.uq = true;
                addViewInLayout(view, i, layoutParams);
                return;
            } else {
                e32.i("Cannot add pager decor view during layout");
                return;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !kgy(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ahm ahmVarKgy;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (ahmVarKgy = kgy(childAt)) != null && ahmVarKgy.ahm == this.uq && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.gf.ahm ahmVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (ahmVar = this.rz) == null || ahmVar.kgy() <= 1)) {
            this.jc.finish();
            this.gg.finish();
        } else {
            if (!this.jc.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.sx * width);
                this.jc.setSize(height, width);
                zDraw = this.jc.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.gg.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.gm + 1.0f)) * width2);
                this.gg.setSize(height2, width2);
                zDraw |= this.gg.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.xh;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.sm = true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        float f;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.wy) {
                    return true;
                }
                if (this.uf) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        kgy(motionEvent);
                    }
                } else {
                    int i = this.mca;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float f2 = x - this.uxe;
                        float fAbs = Math.abs(f2);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y - this.mw);
                        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !kgy(this.uxe, f2) && kgy(this, false, (int) f2, (int) x, (int) y)) {
                            this.uxe = x;
                            this.muf = y;
                            this.uf = true;
                            return false;
                        }
                        int i2 = this.ikw;
                        if (fAbs > i2 && fAbs * 0.5f > fAbs2) {
                            this.wy = true;
                            rz(true);
                            setScrollState(1);
                            float f3 = this.vrj;
                            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f = f3 + this.ikw;
                            } else {
                                f = f3 - this.ikw;
                            }
                            this.uxe = f;
                            this.muf = y;
                            setScrollingCacheEnabled(true);
                        } else if (fAbs2 > i2) {
                            this.uf = true;
                        }
                        if (this.wy && ahm(x)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.vrj = x2;
                this.uxe = x2;
                float y2 = motionEvent.getY();
                this.mw = y2;
                this.muf = y2;
                this.mca = motionEvent.getPointerId(0);
                this.uf = false;
                this.kus = true;
                this.twf.computeScrollOffset();
                if (this.gc == 2 && Math.abs(this.twf.getFinalX() - this.twf.getCurrX()) > this.tp) {
                    this.twf.abortAnimation();
                    this.jpc = false;
                    rz();
                    this.wy = true;
                    rz(true);
                    setScrollState(1);
                } else {
                    kgy(false);
                    this.wy = false;
                }
            }
            if (this.ftg == null) {
                this.ftg = VelocityTracker.obtain();
            }
            this.ftg.addMovement(motionEvent);
            return this.wy;
        }
        fi();
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        ahm ahmVarKgy;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (ahmVarKgy = kgy(childAt)) != null && ahmVarKgy.ahm == this.uq && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        yo yoVar = new yo(super.onSaveInstanceState());
        yoVar.ahm = this.uq;
        com.bytedance.adsdk.ugeno.gf.ahm ahmVar = this.rz;
        if (ahmVar != null) {
            yoVar.rz = ahmVar.ahm();
        }
        return yoVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.dg;
            kgy(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    public boolean rz(int i) {
        boolean zUq;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (parent instanceof ViewGroup) {
                    if (parent == this) {
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
                    viewFindFocus = null;
                    break;
                }
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i == 17) {
                int i2 = kgy(this.gf, viewFindNextFocus).left;
                int i3 = kgy(this.gf, viewFindFocus).left;
                if (viewFindFocus != null && i2 >= i3) {
                    zUq = uq();
                } else {
                    zUq = viewFindNextFocus.requestFocus();
                }
            } else if (i == 66) {
                int i4 = kgy(this.gf, viewFindNextFocus).left;
                int i5 = kgy(this.gf, viewFindFocus).left;
                if (viewFindFocus == null || i4 > i5) {
                    zUq = viewFindNextFocus.requestFocus();
                } else {
                    zUq = ct();
                }
            } else {
                zUq = false;
            }
        } else if (i != 17 && i != 1) {
            if (i != 66 && i != 2) {
                zUq = false;
            } else {
                zUq = ct();
            }
        } else {
            zUq = uq();
        }
        if (zUq) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zUq;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.xh) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    private void noq() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0193rz) getChildAt(i).getLayoutParams()).kgy) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public boolean ct() {
        com.bytedance.adsdk.ugeno.gf.ahm ahmVar = this.rz;
        if (ahmVar == null || this.uq >= ahmVar.kgy() - 1) {
            return false;
        }
        kgy(this.uq + 1, true);
        return true;
    }

    public boolean uq() {
        int i = this.uq;
        if (i <= 0) {
            return false;
        }
        kgy(i - 1, true);
        return true;
    }

    public void ahm(uq uqVar) {
        List<uq> list = this.pft;
        if (list != null) {
            list.remove(uqVar);
        }
    }

    public ahm ahm(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return kgy(view);
            }
        }
    }

    public ahm ahm(int i) {
        for (int i2 = 0; i2 < this.yo.size(); i2++) {
            ahm ahmVar = this.yo.get(i2);
            if (ahmVar.ahm == i) {
                return ahmVar;
            }
        }
        return null;
    }

    private void ahm(int i, float f, int i2) {
        uq uqVar = this.xrn;
        if (uqVar != null) {
            uqVar.kgy(i, f, i2);
        }
        List<uq> list = this.pft;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                uq uqVar2 = this.pft.get(i3);
                if (uqVar2 != null) {
                    uqVar2.kgy(i, f, i2);
                }
            }
        }
        uq uqVar3 = this.qdr;
        if (uqVar3 != null) {
            uqVar3.kgy(i, f, i2);
        }
    }

    private void ahm(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.znm : 0, null);
        }
    }

    private boolean ahm(float f) {
        boolean z;
        boolean z2;
        float f2 = this.uxe - f;
        this.uxe = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.sx * clientWidth;
        float f4 = this.gm * clientWidth;
        boolean z3 = false;
        ahm ahmVar = this.yo.get(0);
        ahm ahmVar2 = (ahm) nj.h(1, this.yo);
        if (ahmVar.ahm != 0) {
            f3 = ahmVar.ct * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (ahmVar2.ahm != this.rz.kgy() - 1) {
            f4 = ahmVar2.ct * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.jc.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.gg.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.uxe = (scrollX - i) + this.uxe;
        scrollTo(i, getScrollY());
        uq(i);
        return z3;
    }

    private static boolean rz(View view) {
        return view.getClass().getAnnotation(kgy.class) != null;
    }

    private void rz(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void rz() {
        kgy(this.uq);
    }

    public void kgy(int i, boolean z) {
        this.jpc = false;
        kgy(i, z, false);
    }

    public void kgy(int i, boolean z, boolean z2) {
        kgy(i, z, z2, 0);
    }

    public void kgy(int i, boolean z, boolean z2, int i2) {
        com.bytedance.adsdk.ugeno.gf.ahm ahmVar = this.rz;
        if (ahmVar != null && ahmVar.kgy() > 0) {
            if (!z2 && this.uq == i && this.yo.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.rz.kgy()) {
                i = this.rz.kgy() - 1;
            }
            int i3 = this.ft;
            int i4 = this.uq;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.yo.size(); i5++) {
                    this.yo.get(i5).rz = true;
                }
            }
            boolean z3 = this.uq != i;
            if (this.sm) {
                this.uq = i;
                if (z3) {
                    ct(i);
                }
                requestLayout();
                return;
            }
            kgy(i);
            kgy(i, z, i2, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    private void kgy(int i, boolean z, int i2, boolean z2) {
        int iMax;
        ahm ahmVarAhm = ahm(i);
        if (ahmVarAhm != null) {
            iMax = (int) (Math.max(this.sx, Math.min(ahmVarAhm.ct, this.gm)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z) {
            kgy(iMax, 0, i2);
            if (z2) {
                ct(i);
                return;
            }
            return;
        }
        if (z2) {
            ct(i);
        }
        kgy(false);
        scrollTo(iMax, 0);
        uq(iMax);
    }

    public void kgy(uq uqVar) {
        if (this.pft == null) {
            this.pft = new ArrayList();
        }
        this.pft.add(uqVar);
    }

    public void kgy(boolean z, ct ctVar) {
        kgy(z, ctVar, 2);
    }

    public void kgy(boolean z, ct ctVar, int i) {
        boolean z2 = ctVar != null;
        boolean z3 = z2 != (this.naw != null);
        this.naw = ctVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.xkh = z ? 2 : 1;
            this.znm = i;
        } else {
            this.xkh = 0;
        }
        if (z3) {
            rz();
        }
    }

    public float kgy(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public void kgy(int i, int i2, int i3) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.twf;
        if (scroller != null && !scroller.isFinished()) {
            boolean z = this.kus;
            Scroller scroller2 = this.twf;
            scrollX = z ? scroller2.getCurrX() : scroller2.getStartX();
            this.twf.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            kgy(false);
            rz();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float fKgy = (kgy(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2) + f2;
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fKgy / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i5) / ((this.rz.kgy(this.uq) * f) + this.dg)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.kus = false;
        this.twf.startScroll(i4, scrollY, i5, i6, iMin);
        postInvalidateOnAnimation();
    }

    public ahm kgy(int i, int i2) {
        ahm ahmVar = new ahm();
        ahmVar.ahm = i;
        ahmVar.kgy = this.rz.kgy((ViewGroup) this, i);
        ahmVar.uq = this.rz.kgy(i);
        if (i2 >= 0 && i2 < this.yo.size()) {
            this.yo.add(i2, ahmVar);
            return ahmVar;
        }
        this.yo.add(ahmVar);
        return ahmVar;
    }

    public void kgy() {
        setWillNotDraw(false);
        setDescendantFocusability(Constants.REFERRER_LINK_MAX_RESPONSE_CHARS);
        setFocusable(true);
        Context context = getContext();
        this.twf = new Scroller(context, noq);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.ikw = viewConfiguration.getScaledPagingTouchSlop();
        this.wl = (int) (400.0f * f);
        this.gbb = viewConfiguration.getScaledMaximumFlingVelocity();
        this.jc = new EdgeEffect(context);
        this.gg = new EdgeEffect(context);
        this.dta = (int) (25.0f * f);
        this.tp = (int) (2.0f * f);
        this.vg = (int) (f * 16.0f);
    }

    private void kgy(ahm ahmVar, int i, ahm ahmVar2) {
        int i2;
        int i3;
        ahm ahmVar3;
        ahm ahmVar4;
        int iKgy = this.rz.kgy();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.dg / clientWidth : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (ahmVar2 != null) {
            int i4 = ahmVar2.ahm;
            int i5 = ahmVar.ahm;
            if (i4 < i5) {
                float fKgy = ahmVar2.ct + ahmVar2.uq + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= ahmVar.ahm && i7 < this.yo.size()) {
                    ahm ahmVar5 = this.yo.get(i7);
                    while (true) {
                        ahmVar4 = ahmVar5;
                        if (i6 <= ahmVar4.ahm || i7 >= this.yo.size() - 1) {
                            break;
                        }
                        i7++;
                        ahmVar5 = this.yo.get(i7);
                    }
                    while (i6 < ahmVar4.ahm) {
                        fKgy += this.rz.kgy(i6) + f;
                        i6++;
                    }
                    ahmVar4.ct = fKgy;
                    fKgy += ahmVar4.uq + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.yo.size() - 1;
                float fKgy2 = ahmVar2.ct;
                while (true) {
                    i4--;
                    if (i4 < ahmVar.ahm || size < 0) {
                        break;
                    }
                    ahm ahmVar6 = this.yo.get(size);
                    while (true) {
                        ahmVar3 = ahmVar6;
                        if (i4 >= ahmVar3.ahm || size <= 0) {
                            break;
                        }
                        size--;
                        ahmVar6 = this.yo.get(size);
                    }
                    while (i4 > ahmVar3.ahm) {
                        fKgy2 -= this.rz.kgy(i4) + f;
                        i4--;
                    }
                    fKgy2 -= ahmVar3.uq + f;
                    ahmVar3.ct = fKgy2;
                }
            }
        }
        int size2 = this.yo.size();
        float fKgy3 = ahmVar.ct;
        int i8 = ahmVar.ahm;
        int i9 = i8 - 1;
        this.sx = i8 == 0 ? fKgy3 : -3.4028235E38f;
        int i10 = iKgy - 1;
        this.gm = i8 == i10 ? (ahmVar.uq + fKgy3) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            ahm ahmVar7 = this.yo.get(i11);
            while (true) {
                i3 = ahmVar7.ahm;
                if (i9 <= i3) {
                    break;
                }
                fKgy3 -= this.rz.kgy(i9) + f;
                i9--;
            }
            fKgy3 -= ahmVar7.uq + f;
            ahmVar7.ct = fKgy3;
            if (i3 == 0) {
                this.sx = fKgy3;
            }
            i11--;
            i9--;
        }
        float fKgy4 = ahmVar.ct + ahmVar.uq + f;
        int i12 = ahmVar.ahm + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            ahm ahmVar8 = this.yo.get(i13);
            while (true) {
                i2 = ahmVar8.ahm;
                if (i12 >= i2) {
                    break;
                }
                fKgy4 += this.rz.kgy(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.gm = (ahmVar8.uq + fKgy4) - 1.0f;
            }
            ahmVar8.ct = fKgy4;
            fKgy4 += ahmVar8.uq + f;
            i13++;
            i12++;
        }
        this.cc = false;
    }

    public ahm kgy(View view) {
        for (int i = 0; i < this.yo.size(); i++) {
            ahm ahmVar = this.yo.get(i);
            if (this.rz.kgy(view, ahmVar.kgy)) {
                return ahmVar;
            }
        }
        return null;
    }

    private void kgy(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.yo.isEmpty()) {
            if (!this.twf.isFinished()) {
                this.twf.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        ahm ahmVarAhm = ahm(this.uq);
        int iMin = (int) ((ahmVarAhm != null ? Math.min(ahmVarAhm.ct, this.gm) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            kgy(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    public void kgy(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.dpp > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C0193rz c0193rz = (C0193rz) childAt.getLayoutParams();
                if (c0193rz.kgy) {
                    int i4 = c0193rz.ahm & 7;
                    if (i4 == 1) {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        ahm(i, f, i2);
        if (this.naw != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                if (!((C0193rz) childAt2.getLayoutParams()).kgy) {
                    this.naw.kgy(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.pxt = true;
    }

    private void kgy(boolean z) {
        boolean z2 = this.gc == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.twf.isFinished()) {
                this.twf.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.twf.getCurrX();
                int currY = this.twf.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        uq(currX);
                    }
                }
            }
        }
        this.jpc = false;
        for (int i = 0; i < this.yo.size(); i++) {
            ahm ahmVar = this.yo.get(i);
            if (ahmVar.rz) {
                ahmVar.rz = false;
                z2 = true;
            }
        }
        if (z2) {
            Runnable runnable = this.yx;
            if (z) {
                postOnAnimation(runnable);
            } else {
                runnable.run();
            }
        }
    }

    private boolean kgy(float f, float f2) {
        if (f >= this.bmz || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f > ((float) (getWidth() - this.bmz)) && f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    private int kgy(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.dta || Math.abs(i2) <= this.wl) {
            i += (int) (f + (i >= this.uq ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.yo.size() > 0) {
            return Math.max(this.yo.get(0).ahm, Math.min(i, ((ahm) nj.h(1, this.yo)).ahm));
        }
        return i;
    }

    private void kgy(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mca) {
            int i = actionIndex == 0 ? 1 : 0;
            this.uxe = motionEvent.getX(i);
            this.mca = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.ftg;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean kgy(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && kgy(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public boolean kgy(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return uq();
            }
            return rz(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return ct();
            }
            return rz(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return rz(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return rz(1);
        }
        return false;
    }

    private Rect kgy(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
