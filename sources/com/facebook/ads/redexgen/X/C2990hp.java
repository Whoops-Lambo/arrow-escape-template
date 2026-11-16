package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import androidx.media3.common.PlaybackException;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.ironsource.C5073y1;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2990hp extends ViewGroup {
    public static byte[] A0s;
    public static String[] A0t = {"Pb5dMBpLoD8olSqqN3M1wt71s6WfJWWx", "mawes8eGWKEfT5kg0DwbKE", "yCX0UAcI", "nBGVAWTalDrx8Q3Q0HTp4hPpqgaJoZ5h", "", "", "gKpLqM1fc4CgqUT7jB7tIrf4xsKdVFyY", "wKHjR3FqXT8StRIGs0zAAfuJmbbhub4H"};
    public static final int[] A0u;
    public static final Interpolator A0v;
    public static final C2989ho A0w;
    public static final Comparator<C2982hh> A0x;
    public int A00;
    public AbstractC2962hM A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public InterfaceC2985hk A0Y;
    public C2987hm A0Z;
    public ClassLoader A0a;
    public ArrayList<View> A0b;
    public List<ViewPager.OnAdapterChangeListener> A0c;
    public List<InterfaceC2985hk> A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public final Rect A0o;
    public final C2982hh A0p;
    public final Runnable A0q;
    public final ArrayList<C2982hh> A0r;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private C2982hh A05() {
        int clientWidth = getClientWidth();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (clientWidth > 0) {
            f = this.A0M / clientWidth;
        }
        int i = -1;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z = true;
        C2982hh c2982hh = null;
        int i2 = 0;
        while (i2 < this.A0r.size()) {
            C2982hh c2982hh2 = this.A0r.get(i2);
            if (!z && c2982hh2.A02 != i + 1) {
                c2982hh2 = this.A0p;
                c2982hh2.A00 = f2 + f3 + f;
                c2982hh2.A02 = i + 1;
                c2982hh2.A01 = this.A01.A00(c2982hh2.A02);
                i2--;
            }
            f2 = c2982hh2.A00;
            float f4 = c2982hh2.A01 + f2 + f;
            if (!z) {
                String[] strArr = A0t;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0t;
                strArr2[3] = "VrUwTTzuyHD2SkMMCenWDHvarMqbXCCI";
                strArr2[6] = "LX2NnyEsDXWEx3dFbPH8p7fzI1U1dTZ8";
                if (scrollX < f2) {
                    return c2982hh;
                }
            }
            if (scrollX >= f4) {
                int size = this.A0r.size() - 1;
                String[] strArr3 = A0t;
                if (strArr3[3].charAt(15) != strArr3[6].charAt(15)) {
                    A0t[2] = "sbP3P6ChvdnfvWI";
                    if (i2 != size) {
                        z = false;
                        i = c2982hh2.A02;
                        f3 = c2982hh2.A01;
                        c2982hh = c2982hh2;
                        i2++;
                    }
                } else {
                    A0t[1] = "kvGf4Zg53U8bz7GLeUNnCLzy4o";
                    if (i2 != size) {
                        z = false;
                        i = c2982hh2.A02;
                        f3 = c2982hh2.A01;
                        c2982hh = c2982hh2;
                        i2++;
                    }
                }
            }
            return c2982hh2;
        }
        return c2982hh;
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0s, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0s = new byte[]{-99, -70, -69, -99, -62, -14, 3, 9, 7, 20, -62, 5, 14, 3, 21, 21, -36, -62, -48, 0, 17, 23, 21, 34, -48, 25, 20, -22, -48, -34, 14, 48, 45, 32, 42, 35, 43, 31, 50, 39, 33, -34, 31, 34, 31, 46, 50, 35, 48, -8, -34, -30, 54, 49, 49, -30, 53, 47, 35, 46, 46, -3, -30, 38, 39, 40, 35, 55, 46, 54, 43, 48, 41, -30, 54, 49, -30, -66, -78, -8, 1, 7, 0, -10, -52, -78, -69, -39, -26, -26, -25, -20, -104, -39, -36, -36, -104, -24, -39, -33, -35, -22, -104, -36, -35, -37, -25, -22, -104, -18, -31, -35, -17, -104, -36, -19, -22, -31, -26, -33, -104, -28, -39, -15, -25, -19, -20, -10, 9, 21, 25, 9, 23, 24, 9, 8, -60, 19, 10, 10, 23, 7, 22, 9, 9, 18, -60, 20, 5, 11, 9, -60, 16, 13, 17, 13, 24, -60, -10, 10, 7, -62, 3, 18, 18, 14, 11, 5, 3, 22, 11, 17, 16, -55, 21, -62, -14, 3, 9, 7, 20, -29, 6, 3, 18, 22, 7, 20, -62, 5, 10, 3, 16, 9, 7, 6, -62, 22, 10, 7, -62, 3, 6, 3, 18, 22, 7, 20, -55, 21, -62, 5, 17, 16, 22, 7, 16, 22, 21, -62, 25, 11, 22, 10, 17, 23, 22, -62, 5, 3, 14, 14, 11, 16, 9, -62, -14, 3, 9, 7, 20, -29, 6, 3, 18, 22, 7, 20, -59, 16, 17, 22, 11, 8, 27, -26, 3, 22, 3, -11, 7, 22, -27, 10, 3, 16, 9, 7, 6, -61, -62, -25, 26, 18, 7, 5, 22, 7, 6, -62, 3, 6, 3, 18, 22, 7, 20, -62, 11, 22, 7, 15, -62, 5, 17, 23, 16, 22, -36, -62, -19, 0, -4, 14, -25, -8, -2, -4, 9, 25, 42, 42, 39, 47, 11, 27, 42, 39, 36, 36, -40, 44, 42, 33, 29, 28, -40, 44, 39, -40, 30, 33, 38, 28, -40, 30, 39, 27, 45, 43, -40, 26, 25, 43, 29, 28, -40, 39, 38, -40, 38, 39, 38, -27, 27, 32, 33, 36, 28, -40, 27, 45, 42, 42, 29, 38, 44, -40, 30, 39, 27, 45, 43, 29, 28, -40, 46, 33, 29, 47, -40, 76, 75, 30, 65, 62, 77, 81, 66, 79, 32, 69, 62, 75, 68, 66, 65, 19, 18, -12, 5, 11, 9, -9, 7, 22, 19, 16, 16, 9, 8, -60, 8, 13, 8, -60, 18, 19, 24, -60, 7, 5, 16, 16, -60, 23, 25, 20, 9, 22, 7, 16, 5, 23, 23, -60, 13, 17, 20, 16, 9, 17, 9, 18, 24, 5, 24, 13, 19, 18, 85, 83, 66, 79, 84, 71, 80, 83, 78, 49, 66, 72, 70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final void A0L(int i, int i2, int i3) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if ((this.A0X == null || this.A0X.isFinished()) ? false : true) {
            scrollX = this.A0j ? this.A0X.getCurrX() : this.A0X.getStartX();
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            A0T(false);
            A0h();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float fA02 = i6 + (i6 * A02(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth)));
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            float f = fA02 / iAbs2;
            if (A0t[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[4] = "";
            strArr[5] = "";
            iAbs = Math.round(Math.abs(f) * 1000.0f) * 4;
        } else {
            iAbs = (int) ((1.0f + (Math.abs(i4) / (this.A0M + (clientWidth * this.A01.A00(this.A00))))) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.A0j = false;
        this.A0X.startScroll(scrollX, scrollY, i4, i5, iMin);
        AbstractC2977hb.A07(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C2982hh c2982hhA09;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c2982hhA09 = A09(childAt)) != null && c2982hhA09.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C2983hi c2983hi;
        int i3;
        int i4;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.A0I = Math.min(measuredWidth / 10, this.A0E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C2983hi c2983hi2 = (C2983hi) childAt.getLayoutParams();
                if (A0t[1].length() == 12) {
                    throw new RuntimeException();
                }
                String[] strArr = A0t;
                strArr[4] = "";
                strArr[5] = "";
                if (c2983hi2 != null && c2983hi2.A05) {
                    int i6 = c2983hi2.A04 & 7;
                    int i7 = c2983hi2.A04 & 112;
                    int i8 = Integer.MIN_VALUE;
                    int i9 = Integer.MIN_VALUE;
                    boolean z = i7 == 48 || i7 == 80;
                    boolean z2 = i6 == 3 || i6 == 5;
                    if (z) {
                        i8 = 1073741824;
                    } else if (z2) {
                        i9 = 1073741824;
                    }
                    if (c2983hi2.width != -2) {
                        i8 = 1073741824;
                        i3 = c2983hi2.width != -1 ? c2983hi2.width : paddingLeft;
                    } else {
                        i3 = paddingLeft;
                    }
                    if (c2983hi2.height != -2) {
                        i9 = 1073741824;
                        if (c2983hi2.height != -1) {
                            i4 = c2983hi2.height;
                            if (A0t[1].length() != 12) {
                                A0t[1] = "VKsSzAx6pk9J5wmYrW5ACp";
                            }
                        } else {
                            i4 = measuredHeight;
                        }
                    } else {
                        i4 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, i8), View.MeasureSpec.makeMeasureSpec(i4, i9));
                    if (z) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z2) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        this.A0B = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.A0A = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.A0h = true;
        A0h();
        this.A0h = false;
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8 && ((c2983hi = (C2983hi) childAt2.getLayoutParams()) == null || !c2983hi.A05)) {
                float f = paddingLeft;
                String[] strArr2 = A0t;
                if (strArr2[4].length() != strArr2[5].length()) {
                    throw new RuntimeException();
                }
                A0t[1] = "11cm9STM7FlxGR3";
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c2983hi.A00), 1073741824), this.A0A);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A0f) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || this.A01 == null || this.A01.A01() == 0) {
            return false;
        }
        if (this.A0U == null) {
            this.A0U = VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        boolean zA0W = false;
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.A0X.abortAnimation();
                this.A0m = false;
                A0h();
                float x = motionEvent.getX();
                this.A03 = x;
                this.A05 = x;
                float y = motionEvent.getY();
                this.A04 = y;
                this.A06 = y;
                this.A08 = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.A0i) {
                    VelocityTracker velocityTracker = this.A0U;
                    velocityTracker.computeCurrentVelocity(1000, this.A0J);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.A08);
                    this.A0m = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C2982hh c2982hhA05 = A05();
                    A0Q(A03(c2982hhA05.A02, ((scrollX / clientWidth) - c2982hhA05.A00) / (c2982hhA05.A01 + (this.A0M / clientWidth)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.A08)) - this.A03)), true, true, xVelocity);
                    zA0W = A0W();
                }
                break;
            case 2:
                if (!this.A0i) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.A08);
                    if (iFindPointerIndex != -1) {
                        float x2 = motionEvent.getX(iFindPointerIndex);
                        float fAbs = Math.abs(x2 - this.A05);
                        float y2 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y2 - this.A06);
                        if (fAbs > this.A0R && fAbs > fAbs2) {
                            this.A0i = true;
                            A0V(true);
                            this.A05 = x2 - this.A03 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.A03 + this.A0R : this.A03 - this.A0R;
                            this.A06 = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.A0i) {
                            zA0W = false | A0Z(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                        }
                    } else {
                        zA0W = A0W();
                    }
                } else if (this.A0i) {
                    zA0W = false | A0Z(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                }
                break;
            case 3:
                if (this.A0i) {
                    A0O(this.A00, true, 0, false);
                    zA0W = A0W();
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.A05 = motionEvent.getX(actionIndex);
                this.A08 = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                A0R(motionEvent);
                this.A05 = motionEvent.getX(motionEvent.findPointerIndex(this.A08));
                break;
        }
        if (zA0W) {
            AbstractC2977hb.A07(this);
        }
        return true;
    }

    static {
        A0E();
        A0u = new int[]{R.attr.layout_gravity};
        A0x = new C2979hd();
        A0v = new InterpolatorC2980he();
        A0w = new C2989ho();
    }

    public C2990hp(Context context) {
        super(context);
        this.A0r = new ArrayList<>();
        this.A0p = new C2982hh();
        this.A0o = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0a = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0g = true;
        this.A0l = false;
        this.A0q = new RunnableC2981hf(this);
        this.A0P = 0;
        A0F();
    }

    private final float A02(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A03(int i, float f, int i2, int i3) {
        if (Math.abs(i3) > this.A0H && Math.abs(i2) > this.A0K) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            int targetPage = this.A00;
            float truncator = i >= targetPage ? 0.4f : 0.6f;
            i = ((int) (f + truncator)) + i;
        }
        int targetPage2 = this.A0r.size();
        if (targetPage2 > 0) {
            C2982hh lastItem = this.A0r.get(0);
            ArrayList<C2982hh> arrayList = this.A0r;
            int targetPage3 = this.A0r.size();
            C2982hh c2982hh = arrayList.get(targetPage3 - 1);
            int i4 = lastItem.A02;
            int targetPage4 = c2982hh.A02;
            return Math.max(i4, Math.min(i, targetPage4));
        }
        return i;
    }

    private Rect A04(Rect rect, View view) {
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
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private final C2982hh A06(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            C2982hh ii = this.A0r.get(i2);
            int i3 = ii.A02;
            if (i3 == i) {
                return ii;
            }
        }
        return null;
    }

    private final C2982hh A07(int i, int i2) {
        C2982hh c2982hh = new C2982hh();
        c2982hh.A02 = i;
        c2982hh.A03 = this.A01.A04(this, i);
        c2982hh.A01 = this.A01.A00(i);
        if (i2 < 0 || i2 >= this.A0r.size()) {
            this.A0r.add(c2982hh);
        } else {
            this.A0r.add(i2, c2982hh);
        }
        return c2982hh;
    }

    private final C2982hh A08(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return A09(view);
            }
        }
    }

    private final C2982hh A09(View view) {
        for (int i = 0; i < i; i++) {
            C2982hh c2982hh = this.A0r.get(i);
            if (this.A01.A08(view, c2982hh.A03)) {
                return c2982hh;
            }
        }
        String[] strArr = A0t;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0t[1] = "T6ty";
        return null;
    }

    private void A0B() {
        this.A0i = false;
        this.A0k = false;
        if (this.A0U != null) {
            this.A0U.recycle();
            String[] strArr = A0t;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0t[1] = "yoRarqzFlsm2scdQtgnfRphmjo";
            this.A0U = null;
        }
    }

    private void A0C() {
        int i = 0;
        while (i < i) {
            if (!((C2983hi) getChildAt(i).getLayoutParams()).A05) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void A0D() {
        if (this.A0F != 0) {
            if (this.A0b == null) {
                this.A0b = new ArrayList<>();
            } else {
                this.A0b.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0b.add(getChildAt(i));
            }
            Collections.sort(this.A0b, A0w);
        }
    }

    private final void A0F() {
        setWillNotDraw(false);
        setDescendantFocusability(Constants.REFERRER_LINK_MAX_RESPONSE_CHARS);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0v);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f);
        this.A0C = (int) (2.0f * f);
        this.A0E = (int) (16.0f * f);
        AbstractC2977hb.A0B(this, new JK(this));
        if (AbstractC2977hb.A00(this) == 0) {
            AbstractC2977hb.A09(this, 1);
        }
        AbstractC2977hb.A0C(this, new JL(this));
    }

    private void A0G(int i) {
        if (this.A0d != null) {
            int z = this.A0d.size();
            for (int i2 = 0; i2 < z; i2++) {
                this.A0d.get(i2);
            }
        }
    }

    private void A0H(int i) {
        if (this.A0d != null) {
            int z = this.A0d.size();
            for (int i2 = 0; i2 < z; i2++) {
                this.A0d.get(i2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:92:0x019a  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b4  */
    private final void A0I(int i) {
        String hexString;
        C2982hh c2982hhA08;
        C2982hh c2982hh;
        float f;
        C2982hh ii;
        float leftWidthNeeded;
        int curIndex;
        C2982hh curItem = null;
        if (this.A00 != i) {
            curItem = A06(this.A00);
            this.A00 = i;
        }
        if (this.A01 == null) {
            A0D();
            return;
        }
        if (this.A0m) {
            A0D();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i2 = this.A0L;
        int pos = Math.max(0, this.A00 - i2);
        int startPos = this.A01.A01();
        int endPos = Math.min(startPos - 1, this.A00 + i2);
        if (startPos == this.A0G) {
            C2982hh c2982hhA07 = null;
            if (A0t[2].length() != 14) {
                A0t[1] = "Tot0RAE";
                int pageLimit = 0;
                while (pageLimit < curIndex) {
                    C2982hh c2982hh2 = this.A0r.get(pageLimit);
                    int i3 = c2982hh2.A02;
                    int curIndex2 = this.A00;
                    if (i3 >= curIndex2) {
                        int i4 = c2982hh2.A02;
                        int curIndex3 = this.A00;
                        if (i4 != curIndex3) {
                            break;
                        }
                        c2982hhA07 = c2982hh2;
                        break;
                    }
                    pageLimit++;
                }
                if (c2982hhA07 == null && startPos > 0) {
                    int N = this.A00;
                    if (A0t[1].length() != 12) {
                        A0t[2] = "0";
                        c2982hhA07 = A07(N, pageLimit);
                    } else {
                        String[] strArr = A0t;
                        strArr[4] = "";
                        strArr[5] = "";
                        c2982hhA07 = A07(N, pageLimit);
                    }
                }
                if (c2982hhA07 != null) {
                    float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    int i5 = pageLimit - 1;
                    if (i5 >= 0) {
                        C2982hh c2982hh3 = this.A0r.get(i5);
                        String[] strArr2 = A0t;
                        String str = strArr2[3];
                        String str2 = strArr2[6];
                        int iCharAt = str.charAt(15);
                        int curIndex4 = str2.charAt(15);
                        if (iCharAt != curIndex4) {
                            A0t[1] = "VNMCyWdkMCax4jTa2KYBa9F64T8dlp";
                            c2982hh = c2982hh3;
                        }
                    } else {
                        c2982hh = null;
                    }
                    int clientWidth = getClientWidth();
                    if (clientWidth <= 0) {
                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        float f3 = 2.0f - c2982hhA07.A01;
                        int curIndex5 = getPaddingLeft();
                        f = f3 + (curIndex5 / clientWidth);
                    }
                    int curIndex6 = this.A00;
                    for (int itemIndex = curIndex6 - 1; itemIndex >= 0; itemIndex--) {
                        if (f2 >= f && itemIndex < pos) {
                            if (c2982hh == null) {
                                break;
                            }
                            int curIndex7 = c2982hh.A02;
                            if (itemIndex == curIndex7 && !c2982hh.A04) {
                                this.A0r.remove(i5);
                                this.A01.A07(this, itemIndex, c2982hh.A03);
                                i5--;
                                pageLimit--;
                                c2982hh = i5 >= 0 ? this.A0r.get(i5) : null;
                            }
                        } else if (c2982hh != null && itemIndex == c2982hh.A02) {
                            f2 += c2982hh.A01;
                            String[] strArr3 = A0t;
                            if (strArr3[7].charAt(10) == strArr3[0].charAt(10)) {
                                String[] strArr4 = A0t;
                                strArr4[4] = "";
                                strArr4[5] = "";
                                i5--;
                                c2982hh = i5 >= 0 ? this.A0r.get(i5) : null;
                            }
                        } else {
                            f2 += A07(itemIndex, i5 + 1).A01;
                            pageLimit++;
                            c2982hh = i5 >= 0 ? this.A0r.get(i5) : null;
                        }
                    }
                    float f4 = c2982hhA07.A01;
                    int i6 = pageLimit + 1;
                    if (f4 < 2.0f) {
                        int curIndex8 = this.A0r.size();
                        if (i6 < curIndex8) {
                            ii = this.A0r.get(i6);
                        } else {
                            ii = null;
                        }
                        if (clientWidth <= 0) {
                            leftWidthNeeded = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            int curIndex9 = getPaddingRight();
                            float f5 = curIndex9;
                            float rightWidthNeeded = clientWidth;
                            String[] strArr5 = A0t;
                            String str3 = strArr5[4];
                            String str4 = strArr5[5];
                            int length = str3.length();
                            int curIndex10 = str4.length();
                            if (length != curIndex10) {
                                throw new RuntimeException();
                            }
                            String[] strArr6 = A0t;
                            strArr6[4] = "";
                            strArr6[5] = "";
                            leftWidthNeeded = (f5 / rightWidthNeeded) + 2.0f;
                        }
                        int curIndex11 = this.A00;
                        for (int i7 = curIndex11 + 1; i7 < startPos; i7++) {
                            if (f4 >= leftWidthNeeded && i7 > endPos) {
                                if (ii == null) {
                                    break;
                                }
                                int curIndex12 = ii.A02;
                                if (i7 == curIndex12 && !ii.A04) {
                                    this.A0r.remove(i6);
                                    this.A01.A07(this, i7, ii.A03);
                                    int curIndex13 = this.A0r.size();
                                    if (i6 < curIndex13) {
                                        C2982hh ii2 = this.A0r.get(i6);
                                        ii = ii2;
                                    } else {
                                        ii = null;
                                    }
                                }
                            } else if (ii != null) {
                                int curIndex14 = ii.A02;
                                if (i7 == curIndex14) {
                                    f4 += ii.A01;
                                    i6++;
                                    int curIndex15 = this.A0r.size();
                                    if (i6 < curIndex15) {
                                        C2982hh ii3 = this.A0r.get(i6);
                                        ii = ii3;
                                    } else {
                                        ii = null;
                                    }
                                } else {
                                    C2982hh c2982hhA09 = A07(i7, i6);
                                    i6++;
                                    f4 += c2982hhA09.A01;
                                    curIndex = this.A0r.size();
                                    if (i6 < curIndex) {
                                        C2982hh ii4 = this.A0r.get(i6);
                                        ii = ii4;
                                    } else {
                                        ii = null;
                                    }
                                }
                            } else {
                                C2982hh c2982hhA010 = A07(i7, i6);
                                i6++;
                                f4 += c2982hhA010.A01;
                                curIndex = this.A0r.size();
                                if (i6 < curIndex) {
                                    C2982hh ii5 = this.A0r.get(i6);
                                    ii = ii5;
                                } else {
                                    ii = null;
                                }
                            }
                        }
                    }
                    A0S(c2982hhA07, pageLimit, curItem);
                }
                int N2 = getChildCount();
                for (int i8 = 0; i8 < N2; i8++) {
                    View childAt = getChildAt(i8);
                    C2983hi c2983hi = (C2983hi) childAt.getLayoutParams();
                    c2983hi.A01 = i8;
                    if (!c2983hi.A05 && c2983hi.A00 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        C2982hh c2982hhA011 = A09(childAt);
                        String[] strArr7 = A0t;
                        String str5 = strArr7[7];
                        String str6 = strArr7[0];
                        int iCharAt2 = str5.charAt(10);
                        int curIndex16 = str6.charAt(10);
                        if (iCharAt2 != curIndex16) {
                            if (c2982hhA011 != null) {
                                c2983hi.A00 = c2982hhA011.A01;
                                int curIndex17 = c2982hhA011.A02;
                                c2983hi.A02 = curIndex17;
                            }
                        } else {
                            A0t[1] = "EEa7ILjnbFiKaMBJBW0FEjvS9loAIL";
                            if (c2982hhA011 != null) {
                                c2983hi.A00 = c2982hhA011.A01;
                                int curIndex18 = c2982hhA011.A02;
                                c2983hi.A02 = curIndex18;
                            }
                        }
                    }
                }
                A0D();
                String[] strArr8 = A0t;
                String str7 = strArr8[4];
                String resName = strArr8[5];
                if (str7.length() != resName.length()) {
                    throw new RuntimeException();
                }
                String[] strArr9 = A0t;
                strArr9[7] = "fAvJTe45YQ8jwRLJzle6w88GhXZAW5fe";
                strArr9[0] = "XHTmtVqtTM8ykl9XiQ4ZuPNQzfhQsr72";
                if (hasFocus()) {
                    View currentFocused = findFocus();
                    String[] strArr10 = A0t;
                    if (strArr10[3].charAt(15) == strArr10[6].charAt(15)) {
                        throw new RuntimeException();
                    }
                    String[] strArr11 = A0t;
                    strArr11[3] = "98nQxxcA6vj5924MyChW7mkeiNJnWKv2";
                    strArr11[6] = "ju5RZqhAYuaQhiOPGNIJcLOaoEeV3OP8";
                    if (currentFocused != null) {
                        c2982hhA08 = A08(currentFocused);
                    } else {
                        c2982hhA08 = null;
                    }
                    if (c2982hhA08 == null || c2982hhA08.A02 != this.A00) {
                        for (int i9 = 0; i9 < getChildCount(); i9++) {
                            View childAt2 = getChildAt(i9);
                            C2982hh c2982hhA012 = A09(childAt2);
                            if (c2982hhA012 != null && c2982hhA012.A02 == this.A00 && childAt2.requestFocus(2)) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            try {
                Resources resources = getResources();
                int curIndex19 = getId();
                hexString = resources.getResourceName(curIndex19);
            } catch (Resources.NotFoundException unused) {
                int curIndex20 = getId();
                hexString = Integer.toHexString(curIndex20);
                if (A0t[2].length() != 14) {
                    A0t[2] = "3cJ8G";
                }
                throw new RuntimeException();
            }
            StringBuilder sb = new StringBuilder();
            String resName2 = A0A(158, 142, 58);
            StringBuilder sbAppend = sb.append(resName2).append(this.A0G);
            String resName3 = A0A(77, 9, 42);
            StringBuilder sbAppend2 = sbAppend.append(resName3).append(startPos);
            String resName4 = A0A(18, 11, 72);
            StringBuilder sbAppend3 = sbAppend2.append(resName4).append(hexString);
            String resName5 = A0A(4, 14, 58);
            StringBuilder sbAppend4 = sbAppend3.append(resName5).append(getClass());
            String resName6 = A0A(29, 22, 86);
            throw new IllegalStateException(sbAppend4.append(resName6).append(this.A01.getClass()).toString());
        }
        throw new RuntimeException();
    }

    private void A0J(int i, float f, int i2) {
        if (this.A0d != null) {
            int z = this.A0d.size();
            for (int i3 = 0; i3 < z; i3++) {
                this.A0d.get(i3);
            }
        }
    }

    private final void A0K(int childLeft, float f, int i) {
        int iMax;
        if (this.A0D > 0) {
            int hgrav = getScrollX();
            int width = getPaddingLeft();
            int paddingRight = getPaddingRight();
            if (A0t[1].length() != 12) {
                String[] strArr = A0t;
                strArr[3] = "hSwONVQ9BwzgmNPK4tziO3X6uj4eQvsQ";
                strArr[6] = "gKhZoL4mhYlFRC9fFMXnjqdiW6EOuKfZ";
                int paddingLeft = getWidth();
                int scrollX = getChildCount();
                for (int childCount = 0; childCount < scrollX; childCount++) {
                    View childAt = getChildAt(childCount);
                    C2983hi c2983hi = (C2983hi) childAt.getLayoutParams();
                    if (c2983hi.A05) {
                        int paddingRight2 = c2983hi.A04;
                        switch (paddingRight2 & 7) {
                            case 1:
                                int paddingRight3 = childAt.getMeasuredWidth();
                                iMax = Math.max((paddingLeft - paddingRight3) / 2, width);
                                break;
                            case 2:
                            case 4:
                            default:
                                iMax = width;
                                break;
                            case 3:
                                iMax = width;
                                int paddingRight4 = childAt.getWidth();
                                width += paddingRight4;
                                break;
                            case 5:
                                int paddingRight5 = childAt.getMeasuredWidth();
                                iMax = (paddingLeft - paddingRight) - paddingRight5;
                                int paddingRight6 = childAt.getMeasuredWidth();
                                paddingRight += paddingRight6;
                                break;
                        }
                        int paddingRight7 = childAt.getLeft();
                        int i2 = (iMax + hgrav) - paddingRight7;
                        if (i2 != 0) {
                            childAt.offsetLeftAndRight(i2);
                        }
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
        A0J(childLeft, f, i);
        if (0 != 0) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = getChildAt(i3);
                if (!((C2983hi) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw new NullPointerException(A0A(450, 13, Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
                }
            }
        }
        this.A0e = true;
    }

    private void A0M(int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            ArrayList<C2982hh> arrayList = this.A0r;
            String[] strArr = A0t;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0t[1] = "xS6wP2kv8Ukjp2mlI4OFB7EI";
            if (!arrayList.isEmpty()) {
                boolean zIsFinished = this.A0X.isFinished();
                if (A0t[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0t[2] = "M3IvNYMGgF0qb538wmgDMK0nNkgqAt";
                if (!zIsFinished) {
                    this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                    return;
                }
                int paddingLeft = ((i - getPaddingLeft()) - getPaddingRight()) + i3;
                int widthWithMargin = getPaddingLeft();
                int i5 = i2 - widthWithMargin;
                int widthWithMargin2 = getPaddingRight();
                int i6 = (i5 - widthWithMargin2) + i4;
                int widthWithMargin3 = getScrollX();
                int oldWidthWithMargin = (int) (paddingLeft * (widthWithMargin3 / i6));
                int widthWithMargin4 = getScrollY();
                scrollTo(oldWidthWithMargin, widthWithMargin4);
                return;
            }
        }
        C2982hh ii = A06(this.A00);
        float scrollOffset = ii != null ? Math.min(ii.A00, this.A07) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int paddingLeft2 = (int) (((i - getPaddingLeft()) - getPaddingRight()) * scrollOffset);
        if (paddingLeft2 != getScrollX()) {
            A0T(false);
            scrollTo(paddingLeft2, getScrollY());
        }
    }

    private final void A0N(int i, boolean z) {
        this.A0m = false;
        A0P(i, z, false);
    }

    private void A0O(int i, boolean z, int i2, boolean z2) {
        C2982hh c2982hhA06 = A06(i);
        int clientWidth = 0;
        if (c2982hhA06 != null) {
            clientWidth = (int) (getClientWidth() * Math.max(this.A02, Math.min(c2982hhA06.A00, this.A07)));
        }
        int destX = A0t[2].length();
        if (destX == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0t;
        strArr[3] = "qWyJthdIKprwmupmlWytZXkwKuTz6nwm";
        strArr[6] = "fDmSwMvEmt93O90vXMKXMmFP8biUMO95";
        if (z) {
            A0L(clientWidth, 0, i2);
            if (z2) {
                A0G(i);
                return;
            }
            return;
        }
        if (z2) {
            A0G(i);
        }
        A0T(false);
        scrollTo(clientWidth, 0);
        A0b(clientWidth);
    }

    private final void A0P(int i, boolean z, boolean z2) {
        A0Q(i, z, z2, 0);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[LOOP:0: B:30:0x006b->B:32:0x0073, LOOP_END] */
    private final void A0Q(int i, boolean z, boolean z2, int i2) {
        int i3;
        if (this.A01 == null || this.A01.A01() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.A00 == i && this.A0r.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.A01.A01()) {
            i = this.A01.A01() - 1;
        }
        int i4 = this.A0L;
        if (i <= this.A00 + i4) {
            int i5 = this.A00;
            String[] strArr = A0t;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[3] = "HdD8kb8A1NTv0LjA3C8pNf8B8Uhf5Rjf";
            strArr2[6] = "hEPxY7plOgAB5ujpSYVhyDABeqG0KedF";
            if (i < i5 - i4) {
                for (i3 = 0; i3 < this.A0r.size(); i3++) {
                    this.A0r.get(i3).A04 = true;
                }
            }
        } else {
            while (i3 < this.A0r.size()) {
                this.A0r.get(i3).A04 = true;
            }
        }
        boolean z3 = this.A00 != i;
        boolean dispatchSelected = this.A0g;
        if (dispatchSelected) {
            this.A00 = i;
            if (z3) {
                A0G(i);
            }
            requestLayout();
            return;
        }
        A0I(i);
        A0O(i, z, i2, z3);
    }

    private void A0R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int pointerIndex = this.A08;
        if (pointerId == pointerIndex) {
            int i = actionIndex == 0 ? 1 : 0;
            this.A05 = motionEvent.getX(i);
            String[] strArr = A0t;
            String str = strArr[4];
            String str2 = strArr[5];
            int pointerId2 = str.length();
            int pointerIndex2 = str2.length();
            if (pointerId2 != pointerIndex2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[4] = "";
            strArr2[5] = "";
            int pointerIndex3 = motionEvent.getPointerId(i);
            this.A08 = pointerIndex3;
            if (this.A0U != null) {
                this.A0U.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x018b  */
    private void A0S(C2982hh c2982hh, int i, C2982hh c2982hh2) {
        float f;
        float f2;
        C2982hh c2982hh3;
        C2982hh c2982hh4;
        int iA01 = this.A01.A01();
        int width = getClientWidth();
        if (width > 0) {
            int N = this.A0M;
            f = N / width;
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (c2982hh2 != null) {
            int width2 = c2982hh2.A02;
            int N2 = c2982hh.A02;
            if (width2 < N2) {
                int i2 = 0;
                float fA00 = c2982hh2.A00 + c2982hh2.A01 + f;
                int i3 = width2 + 1;
                while (i3 <= N) {
                    int N3 = this.A0r.size();
                    if (i2 >= N3) {
                        break;
                    }
                    C2982hh c2982hh5 = this.A0r.get(i2);
                    while (true) {
                        c2982hh4 = c2982hh5;
                        int N4 = c2982hh4.A02;
                        if (i3 <= N4) {
                            break;
                        }
                        int N5 = this.A0r.size();
                        if (i2 >= N5 - 1) {
                            break;
                        }
                        i2++;
                        c2982hh5 = this.A0r.get(i2);
                    }
                    while (i3 < N) {
                        AbstractC2962hM abstractC2962hM = this.A01;
                        if (A0t[2].length() == 14) {
                            throw new RuntimeException();
                        }
                        A0t[2] = "unjnr1JPHveRA3A";
                        fA00 += abstractC2962hM.A00(i3) + f;
                        i3++;
                    }
                    c2982hh4.A00 = fA00;
                    fA00 += c2982hh4.A01 + f;
                    i3++;
                }
            } else {
                int N6 = c2982hh.A02;
                if (width2 > N6) {
                    int N7 = this.A0r.size();
                    int i4 = N7 - 1;
                    float fA01 = c2982hh2.A00;
                    int i5 = width2 - 1;
                    while (i5 >= N && i4 >= 0) {
                        C2982hh c2982hh6 = this.A0r.get(i4);
                        while (true) {
                            c2982hh3 = c2982hh6;
                            int N8 = c2982hh3.A02;
                            if (i5 >= N8 || i4 <= 0) {
                                break;
                            }
                            i4--;
                            c2982hh6 = this.A0r.get(i4);
                        }
                        while (true) {
                            int i6 = c2982hh3.A02;
                            String[] strArr = A0t;
                            String str = strArr[4];
                            String str2 = strArr[5];
                            int width3 = str.length();
                            int N9 = str2.length();
                            if (width3 == N9) {
                                A0t[2] = "eK1wjFwqyv9CJUk";
                                if (i5 <= i6) {
                                    break;
                                }
                                fA01 -= this.A01.A00(i5) + f;
                                i5--;
                            } else {
                                A0t[1] = "tUoZSKhLB59JJ";
                                if (i5 <= i6) {
                                    break;
                                }
                                fA01 -= this.A01.A00(i5) + f;
                                i5--;
                            }
                        }
                        fA01 -= c2982hh3.A01 + f;
                        c2982hh3.A00 = fA01;
                        i5--;
                    }
                }
            }
        }
        int i7 = this.A0r.size();
        float offset = c2982hh.A00;
        int N10 = c2982hh.A02;
        int pos = N10 - 1;
        int N11 = c2982hh.A02;
        this.A02 = N11 == 0 ? c2982hh.A00 : -3.4028235E38f;
        int N12 = iA01 - 1;
        if (c2982hh.A02 == N12) {
            f2 = (c2982hh.A00 + c2982hh.A01) - 1.0f;
        } else {
            f2 = Float.MAX_VALUE;
        }
        this.A07 = f2;
        int i8 = i - 1;
        while (i8 >= 0) {
            C2982hh c2982hh7 = this.A0r.get(i8);
            while (pos > N) {
                offset -= this.A01.A00(pos) + f;
                pos--;
            }
            offset -= c2982hh7.A01 + f;
            c2982hh7.A00 = offset;
            int N13 = c2982hh7.A02;
            if (N13 == 0) {
                this.A02 = offset;
            }
            i8--;
            pos--;
        }
        float offset2 = c2982hh.A00;
        float offset3 = offset2 + c2982hh.A01 + f;
        int N14 = c2982hh.A02;
        int i9 = N14 + 1;
        int i10 = i + 1;
        while (i10 < i7) {
            C2982hh c2982hh8 = this.A0r.get(i10);
            while (i9 < N) {
                offset3 += this.A01.A00(i9) + f;
                i9++;
            }
            int i11 = c2982hh8.A02;
            if (A0t[2].length() != 14) {
                String[] strArr2 = A0t;
                strArr2[3] = "LKMrFShf3NXE5XfaxsCGHUW3hns0S8Wh";
                strArr2[6] = "xptjAJKkekqR5TDnJjimQZvUd22mQJJ9";
                int N15 = iA01 - 1;
                if (i11 == N15) {
                    this.A07 = (c2982hh8.A01 + offset3) - 1.0f;
                }
            } else {
                int N16 = iA01 - 1;
                if (i11 == N16) {
                    this.A07 = (c2982hh8.A01 + offset3) - 1.0f;
                }
            }
            c2982hh8.A00 = offset3;
            offset3 += c2982hh8.A01 + f;
            i10++;
            i9++;
        }
        this.A0l = false;
    }

    private void A0T(boolean z) {
        boolean z2 = this.A0P == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            boolean needPopulate = this.A0X.isFinished();
            if (!needPopulate) {
                this.A0X.abortAnimation();
                if (A0t[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0t[1] = "La7";
                int scrollX = getScrollX();
                int oldX = getScrollY();
                int currX = this.A0X.getCurrX();
                int currY = this.A0X.getCurrY();
                if (scrollX != currX || oldX != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0b(currX);
                    }
                }
            }
        }
        this.A0m = false;
        for (int i = 0; i < this.A0r.size(); i++) {
            C2982hh c2982hh = this.A0r.get(i);
            boolean needPopulate2 = c2982hh.A04;
            if (needPopulate2) {
                z2 = true;
                c2982hh.A04 = false;
            }
        }
        if (z2) {
            if (z) {
                AbstractC2977hb.A0D(this, this.A0q);
            } else {
                this.A0q.run();
            }
        }
    }

    private void A0U(boolean z) {
        int layerType;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (z) {
                layerType = this.A0N;
            } else {
                layerType = 0;
            }
            getChildAt(i).setLayerType(layerType, null);
        }
    }

    private void A0V(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean A0W() {
        this.A08 = -1;
        A0B();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0X() {
        if (this.A00 > 0) {
            A0N(this.A00 - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0Y() {
        if (this.A01 != null && this.A00 < this.A01.A01() - 1) {
            A0N(this.A00 + 1, true);
            return true;
        }
        if (A0t[2].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0t;
        strArr[7] = "AXA5EDUbYu85ntxkUdYhY3hIIlQIUQar";
        strArr[0] = "7HhQN1X94o8BEMOAnE9vO9t08zapWTmy";
        return false;
    }

    private boolean A0Z(float f) {
        boolean z = false;
        float f2 = this.A05 - f;
        this.A05 = f;
        float scrollX = getScrollX() + f2;
        int clientWidth = getClientWidth();
        float f3 = clientWidth * this.A02;
        float deltaX = clientWidth;
        float deltaX2 = deltaX * this.A07;
        boolean rightAbsolute = true;
        boolean leftAbsolute = true;
        C2982hh c2982hh = this.A0r.get(0);
        C2982hh c2982hh2 = this.A0r.get(this.A0r.size() - 1);
        if (c2982hh.A02 != 0) {
            rightAbsolute = false;
            float f4 = c2982hh.A00;
            if (A0t[1].length() == 12) {
                throw new RuntimeException();
            }
            A0t[1] = "a";
            f3 = f4 * clientWidth;
        }
        if (c2982hh2.A02 != this.A01.A01() - 1) {
            leftAbsolute = false;
            float deltaX3 = c2982hh2.A00;
            deltaX2 = deltaX3 * clientWidth;
        }
        if (scrollX < f3) {
            if (rightAbsolute) {
                this.A0V.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z = true;
            }
            scrollX = f3;
        } else if (scrollX > deltaX2) {
            if (leftAbsolute) {
                EdgeEffect edgeEffect = this.A0W;
                float fAbs = Math.abs(scrollX - deltaX2);
                float scrollX2 = clientWidth;
                String[] strArr = A0t;
                if (strArr[4].length() != strArr[5].length()) {
                    edgeEffect.onPull(fAbs / scrollX2);
                    z = true;
                } else {
                    A0t[1] = "TwKB2lBmR";
                    edgeEffect.onPull(fAbs / scrollX2);
                    z = true;
                }
            }
            scrollX = deltaX2;
        }
        this.A05 += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        A0b((int) scrollX);
        return z;
    }

    private final boolean A0a(float f, float f2) {
        if (f >= this.A0I || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f > getWidth() - this.A0I) {
                if (A0t[2].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A0t;
                strArr[3] = "LoLbwLodEQ0RZhoADzk4YxqyeMxGbPNe";
                strArr[6] = "uXFtlpuRRgamX4n9Zkql1HjWorEkSQ7b";
                if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
            }
            return false;
        }
        return true;
    }

    private boolean A0b(int i) {
        int size = this.A0r.size();
        String strA0A = A0A(397, 53, 60);
        if (size == 0) {
            if (this.A0g) {
                return false;
            }
            this.A0e = false;
            A0K(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            String[] strArr = A0t;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0t[2] = "c3ramapljB1reDSufYjA";
            if (this.A0e) {
                return false;
            }
            throw new IllegalStateException(strA0A);
        }
        C2982hh c2982hhA05 = A05();
        int clientWidth = getClientWidth();
        int currentPage = this.A0M + clientWidth;
        float marginOffset = this.A0M / clientWidth;
        int i2 = c2982hhA05.A02;
        float f = ((i / clientWidth) - c2982hhA05.A00) / (c2982hhA05.A01 + marginOffset);
        this.A0e = false;
        A0K(i2, f, (int) (currentPage * f));
        if (this.A0e) {
            return true;
        }
        throw new IllegalStateException(strA0A);
    }

    private final boolean A0c(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            boolean z = false;
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(A0A(0, 4, 21)).append(parent2.getClass().getSimpleName());
                }
                Log.e(A0A(300, 9, 47), A0A(Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, 72, 80) + sb.toString());
                viewFindFocus = null;
            }
        }
        boolean zA0X = false;
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (nextFocused != null && nextFocused != viewFindFocus) {
            if (i == 17) {
                zA0X = (viewFindFocus == null || A04(this.A0o, nextFocused).left < A04(this.A0o, viewFindFocus).left) ? nextFocused.requestFocus() : A0X();
            } else if (i == 66) {
                zA0X = (viewFindFocus == null || A04(this.A0o, nextFocused).left > A04(this.A0o, viewFindFocus).left) ? nextFocused.requestFocus() : A0Y();
            }
        } else if (i == 17 || i == 1) {
            zA0X = A0X();
        } else if (i == 66 || i == 2) {
            zA0X = A0Y();
        }
        if (zA0X) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zA0X;
    }

    private final boolean A0d(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                boolean handled = keyEvent.hasModifiers(2);
                if (handled) {
                    return A0X();
                }
                return A0c(17);
            case 22:
                boolean zHasModifiers = keyEvent.hasModifiers(2);
                String[] strArr = A0t;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0t[1] = "lC1XoLB2bpdljamdt6Vm";
                if (zHasModifiers) {
                    return A0Y();
                }
                return A0c(66);
            case 61:
                boolean handled2 = keyEvent.hasNoModifiers();
                if (handled2) {
                    return A0c(2);
                }
                boolean handled3 = keyEvent.hasModifiers(1);
                if (!handled3) {
                    return false;
                }
                return A0c(1);
            default:
                return false;
        }
    }

    public static boolean A0e(View view) {
        return view.getClass().getAnnotation(ViewPager$DecorView.class) != null;
    }

    private final boolean A0f(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    int left = (i2 + scrollX) - childAt.getLeft();
                    int i4 = i3 + scrollY;
                    int i5 = childAt.getTop();
                    if (A0t[1].length() == 12) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0t;
                    strArr[4] = "";
                    strArr[5] = "";
                    if (A0f(childAt, true, i, left, i4 - i5)) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    public final void A0g() {
        boolean z;
        int iA01 = this.A01.A01();
        this.A0G = iA01;
        int size = this.A0r.size();
        int adapterCount = this.A0L;
        if (size < (adapterCount * 2) + 1) {
            int adapterCount2 = this.A0r.size();
            if (adapterCount2 < iA01) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int i = this.A00;
        boolean z2 = false;
        int newCurrItem = 0;
        while (newCurrItem < adapterCount) {
            C2982hh c2982hh = this.A0r.get(newCurrItem);
            int iA02 = this.A01.A02(c2982hh.A03);
            if (iA02 != -1) {
                if (iA02 == -2) {
                    this.A0r.remove(newCurrItem);
                    newCurrItem--;
                    if (!z2) {
                        z2 = true;
                    }
                    this.A01.A07(this, c2982hh.A02, c2982hh.A03);
                    z = true;
                    int i2 = this.A00;
                    int adapterCount3 = c2982hh.A02;
                    if (i2 == adapterCount3) {
                        int adapterCount4 = iA01 - 1;
                        i = Math.max(0, Math.min(this.A00, adapterCount4));
                        z = true;
                    }
                } else {
                    int adapterCount5 = c2982hh.A02;
                    if (adapterCount5 != iA02) {
                        int i3 = c2982hh.A02;
                        int adapterCount6 = this.A00;
                        if (i3 == adapterCount6) {
                            i = iA02;
                        }
                        c2982hh.A02 = iA02;
                        z = true;
                    }
                }
            }
            newCurrItem++;
        }
        Collections.sort(this.A0r, A0x);
        if (z) {
            int childCount = getChildCount();
            for (int newCurrItem2 = 0; newCurrItem2 < childCount; newCurrItem2++) {
                C2983hi c2983hi = (C2983hi) getChildAt(newCurrItem2).getLayoutParams();
                if (!c2983hi.A05) {
                    c2983hi.A00 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            A0P(i, false, true);
            if (A0t[2].length() == 14) {
                throw new RuntimeException();
            }
            A0t[2] = "iBz2AIJ6C";
            requestLayout();
        }
    }

    public final void A0h() {
        A0I(this.A00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C2982hh c2982hhA09;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < focusableCount; i3++) {
                View childAt = getChildAt(i3);
                int focusableCount = childAt.getVisibility();
                if (focusableCount == 0 && (c2982hhA09 = A09(childAt)) != null) {
                    int descendantFocusability2 = c2982hhA09.A02;
                    int focusableCount2 = this.A00;
                    if (descendantFocusability2 == focusableCount2) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if (descendantFocusability == 262144) {
            int focusableCount3 = arrayList.size();
            if (size != focusableCount3) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        int descendantFocusability3 = i2 & 1;
        if ((descendantFocusability3 != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C2983hi c2983hi = (C2983hi) layoutParams;
        c2983hi.A05 |= A0e(view);
        if (this.A0h) {
            if (c2983hi == null || !c2983hi.A05) {
                c2983hi.A03 = true;
                if (A0t[2].length() == 14) {
                    throw new RuntimeException();
                }
                A0t[1] = "XL6oa3uLuKs2IOpHyjfCXdHiJnTalh";
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException(A0A(86, 41, 16));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.A01 == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) width) * this.A02));
        }
        return i > 0 && scrollX < ((int) (((float) width) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2983hi) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0j = true;
        if (!this.A0X.isFinished() && this.A0X.computeScrollOffset()) {
            int scrollX = getScrollX();
            int y = getScrollY();
            int x = this.A0X.getCurrX();
            int oldY = this.A0X.getCurrY();
            if (scrollX != x || y != oldY) {
                scrollTo(x, oldY);
                if (!A0b(x)) {
                    this.A0X.abortAnimation();
                    scrollTo(0, oldY);
                }
            }
            AbstractC2977hb.A07(this);
            return;
        }
        A0T(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0d(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C2982hh c2982hhA09;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int childCount2 = childAt.getVisibility();
            if (childCount2 == 0 && (c2982hhA09 = A09(childAt)) != null) {
                int i2 = c2982hhA09.A02;
                String[] strArr = A0t;
                String str = strArr[7];
                String str2 = strArr[0];
                int i3 = str.charAt(10);
                int childCount3 = str2.charAt(10);
                if (i3 != childCount3) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0t;
                strArr2[4] = "";
                strArr2[5] = "";
                int childCount4 = this.A00;
                if (i2 == childCount4 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d7  */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean zIsFinished;
        int overScrollMode;
        boolean needsInvalidate;
        super.draw(canvas);
        boolean z = false;
        int overScrollMode2 = getOverScrollMode();
        if (overScrollMode2 == 0) {
            zIsFinished = this.A0V.isFinished();
            overScrollMode = A0t[1].length();
            if (overScrollMode != 12) {
                A0t[1] = "sR19g1oBfMrUqPxbyG4ArbsnA";
                if (!zIsFinished) {
                    int iSave = canvas.save();
                    int width = (getHeight() - getPaddingTop()) - getPaddingBottom();
                    int height = getWidth();
                    canvas.rotate(270.0f);
                    int overScrollMode3 = -width;
                    canvas.translate(overScrollMode3 + getPaddingTop(), this.A02 * height);
                    this.A0V.setSize(width, height);
                    boolean needsInvalidate2 = this.A0V.draw(canvas);
                    z = false | needsInvalidate2;
                    canvas.restoreToCount(iSave);
                }
            } else {
                String[] strArr = A0t;
                strArr[4] = "";
                strArr[5] = "";
                if (!zIsFinished) {
                    int iSave2 = canvas.save();
                    int width2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                    int height2 = getWidth();
                    canvas.rotate(270.0f);
                    int overScrollMode4 = -width2;
                    canvas.translate(overScrollMode4 + getPaddingTop(), this.A02 * height2);
                    this.A0V.setSize(width2, height2);
                    boolean needsInvalidate3 = this.A0V.draw(canvas);
                    z = false | needsInvalidate3;
                    canvas.restoreToCount(iSave2);
                }
            }
            needsInvalidate = this.A0W.isFinished();
            if (!needsInvalidate) {
                int width3 = canvas.save();
                int width4 = getWidth();
                int height3 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.A07 + 1.0f)) * width4);
                this.A0W.setSize(height3, width4);
                boolean needsInvalidate4 = this.A0W.draw(canvas);
                z |= needsInvalidate4;
                canvas.restoreToCount(width3);
            }
        } else {
            if (overScrollMode2 == 1) {
                AbstractC2962hM abstractC2962hM = this.A01;
                String[] strArr2 = A0t;
                String str = strArr2[7];
                String str2 = strArr2[0];
                int overScrollMode5 = str.charAt(10);
                if (overScrollMode5 != str2.charAt(10)) {
                    throw new RuntimeException();
                }
                A0t[1] = "uCo1AgFx4bPu4bwpitwpleYcuNfeFds";
                if (abstractC2962hM != null && this.A01.A01() > 1) {
                    zIsFinished = this.A0V.isFinished();
                    overScrollMode = A0t[1].length();
                    if (overScrollMode != 12) {
                        A0t[1] = "sR19g1oBfMrUqPxbyG4ArbsnA";
                        if (!zIsFinished) {
                            int iSave3 = canvas.save();
                            int width5 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                            int height4 = getWidth();
                            canvas.rotate(270.0f);
                            int overScrollMode6 = -width5;
                            canvas.translate(overScrollMode6 + getPaddingTop(), this.A02 * height4);
                            this.A0V.setSize(width5, height4);
                            boolean needsInvalidate5 = this.A0V.draw(canvas);
                            z = false | needsInvalidate5;
                            canvas.restoreToCount(iSave3);
                        }
                    } else {
                        String[] strArr3 = A0t;
                        strArr3[4] = "";
                        strArr3[5] = "";
                        if (!zIsFinished) {
                            int iSave4 = canvas.save();
                            int width6 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                            int height5 = getWidth();
                            canvas.rotate(270.0f);
                            int overScrollMode7 = -width6;
                            canvas.translate(overScrollMode7 + getPaddingTop(), this.A02 * height5);
                            this.A0V.setSize(width6, height5);
                            boolean needsInvalidate6 = this.A0V.draw(canvas);
                            z = false | needsInvalidate6;
                            canvas.restoreToCount(iSave4);
                        }
                    }
                    needsInvalidate = this.A0W.isFinished();
                    if (!needsInvalidate) {
                        int width7 = canvas.save();
                        int width8 = getWidth();
                        int height6 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                        canvas.rotate(90.0f);
                        canvas.translate(-getPaddingTop(), (-(this.A07 + 1.0f)) * width8);
                        this.A0W.setSize(height6, width8);
                        boolean needsInvalidate7 = this.A0W.draw(canvas);
                        z |= needsInvalidate7;
                        canvas.restoreToCount(width7);
                    }
                }
            }
            this.A0V.finish();
            this.A0W.finish();
        }
        if (z) {
            AbstractC2977hb.A07(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2983hi();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2983hi(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC2962hM getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int result = this.A0F == 2 ? (i - 1) - i2 : i2;
        int index = ((C2983hi) this.A0b.get(result).getLayoutParams()).A01;
        return index;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0q);
        if (this.A0X != null && !this.A0X.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.A0M > 0 && this.A0S != null && this.A0r.size() > 0 && this.A01 != null) {
            int lastPos = getScrollX();
            int firstPos = getWidth();
            float f2 = this.A0M / firstPos;
            int i = 0;
            C2982hh c2982hh = this.A0r.get(0);
            float f3 = c2982hh.A00;
            int size = this.A0r.size();
            int i2 = this.A0r.get(size - 1).A02;
            for (int itemIndex = c2982hh.A02; itemIndex < i2; itemIndex++) {
                while (itemIndex > c2982hh.A02 && i < size) {
                    i++;
                    C2982hh c2982hh2 = this.A0r.get(i);
                    String[] strArr = A0t;
                    String str = strArr[7];
                    String str2 = strArr[0];
                    int scrollX = str.charAt(10);
                    if (scrollX != str2.charAt(10)) {
                        throw new RuntimeException();
                    }
                    A0t[2] = "Qpfq";
                    c2982hh = c2982hh2;
                }
                if (itemIndex == c2982hh.A02) {
                    f = (c2982hh.A00 + c2982hh.A01) * firstPos;
                    f3 = c2982hh.A00 + c2982hh.A01 + f2;
                } else {
                    float fA00 = this.A01.A00(itemIndex);
                    f = (f3 + fA00) * firstPos;
                    f3 += fA00 + f2;
                }
                if (this.A0M + f > lastPos) {
                    Drawable drawable = this.A0S;
                    int iRound = Math.round(f);
                    int i3 = this.A0Q;
                    int scrollX2 = Math.round(this.A0M + f);
                    drawable.setBounds(iRound, i3, scrollX2, this.A09);
                    Drawable drawable2 = this.A0S;
                    String[] strArr2 = A0t;
                    String str3 = strArr2[7];
                    String str4 = strArr2[0];
                    int scrollX3 = str3.charAt(10);
                    if (scrollX3 != str4.charAt(10)) {
                        A0t[1] = "";
                        drawable2.draw(canvas);
                    } else {
                        String[] strArr3 = A0t;
                        strArr3[4] = "";
                        strArr3[5] = "";
                        drawable2.draw(canvas);
                    }
                }
                int i4 = lastPos + firstPos;
                int scrollX4 = A0t[1].length();
                if (scrollX4 == 12) {
                    throw new RuntimeException();
                }
                A0t[1] = "DrXdt";
                if (f > i4) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A0W();
            String[] strArr = A0t;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0t[2] = "iW5W";
            return false;
        }
        if (action != 0) {
            if (this.A0i) {
                return true;
            }
            if (this.A0k) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.A03 = x;
                this.A05 = x;
                float y = motionEvent.getY();
                this.A04 = y;
                this.A06 = y;
                this.A08 = motionEvent.getPointerId(0);
                this.A0k = false;
                this.A0j = true;
                this.A0X.computeScrollOffset();
                if (this.A0P != 2 || Math.abs(this.A0X.getFinalX() - this.A0X.getCurrX()) <= this.A0C) {
                    A0T(false);
                    this.A0i = false;
                } else {
                    this.A0X.abortAnimation();
                    this.A0m = false;
                    A0h();
                    this.A0i = true;
                    A0V(true);
                    setScrollState(1);
                }
                break;
            case 2:
                int i = this.A08;
                if (i != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float f2 = x2 - this.A05;
                    float y2 = Math.abs(f2);
                    float y3 = motionEvent.getY(iFindPointerIndex);
                    float fAbs = Math.abs(y3 - this.A04);
                    if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !A0a(this.A05, f2) && A0f(this, false, (int) f2, (int) x2, (int) y3)) {
                        this.A05 = x2;
                        this.A06 = y3;
                        this.A0k = true;
                        return false;
                    }
                    if (y2 > this.A0R && 0.5f * y2 > fAbs) {
                        this.A0i = true;
                        A0V(true);
                        setScrollState(1);
                        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f = this.A03 - this.A0R;
                        } else {
                            float f3 = this.A03;
                            int i2 = this.A0R;
                            String[] strArr2 = A0t;
                            if (strArr2[7].charAt(10) != strArr2[0].charAt(10)) {
                                f = f3 + i2;
                            } else {
                                String[] strArr3 = A0t;
                                strArr3[7] = "WpQimEPBWZ8vG05HKhTxshBMY3NNEur0";
                                strArr3[0] = "BEtp4ufX6D8x3OZlDxdpMoFh1oKQqP0t";
                                f = f3 + i2;
                            }
                        }
                        this.A05 = f;
                        this.A06 = y3;
                        setScrollingCacheEnabled(true);
                    } else if (fAbs > this.A0R) {
                        this.A0k = true;
                    }
                    if (this.A0i && A0Z(x2)) {
                        AbstractC2977hb.A07(this);
                    }
                }
                break;
            case 6:
                A0R(motionEvent);
                break;
        }
        VelocityTracker velocityTracker = this.A0U;
        if (A0t[2].length() != 14) {
            String[] strArr4 = A0t;
            strArr4[3] = "qZEBvpK5WM51NnTYZj9Wv9V85vPNkfCF";
            strArr4[6] = "8DoAZte0LwUXg2aXlHvSBWFBy3vUeqDy";
            if (velocityTracker == null) {
                this.A0U = VelocityTracker.obtain();
            }
            this.A0U.addMovement(motionEvent);
            return this.A0i;
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C2982hh c2982hhA09;
        int iMax;
        int count;
        int paddingLeft = getChildCount();
        int paddingRight = i3 - i;
        int i5 = i4 - i2;
        int scrollX = getPaddingLeft();
        int decorCount = getPaddingTop();
        int childLeft = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int hgrav = getScrollX();
        int paddingBottom2 = 0;
        int i6 = 0;
        while (true) {
            int i7 = 8;
            String[] strArr = A0t;
            String str = strArr[4];
            String str2 = strArr[5];
            int count2 = str.length();
            if (count2 == str2.length()) {
                A0t[1] = "";
                if (i6 < paddingLeft) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8) {
                        C2983hi c2983hi = (C2983hi) childAt.getLayoutParams();
                        if (c2983hi.A05) {
                            int count3 = c2983hi.A04 & 7;
                            int childTop = c2983hi.A04 & 112;
                            switch (count3) {
                                case 1:
                                    iMax = Math.max((paddingRight - childAt.getMeasuredWidth()) / 2, scrollX);
                                    break;
                                case 2:
                                case 4:
                                default:
                                    iMax = scrollX;
                                    break;
                                case 3:
                                    iMax = scrollX;
                                    scrollX += childAt.getMeasuredWidth();
                                    break;
                                case 5:
                                    int i8 = paddingRight - childLeft;
                                    int measuredWidth = childAt.getMeasuredWidth();
                                    String[] strArr2 = A0t;
                                    String str3 = strArr2[7];
                                    String str4 = strArr2[0];
                                    int count4 = str3.charAt(10);
                                    if (count4 == str4.charAt(10)) {
                                        A0t[1] = "51Hkg";
                                        iMax = i8 - measuredWidth;
                                        childLeft += childAt.getMeasuredWidth();
                                    }
                                    break;
                            }
                            switch (childTop) {
                                case 16:
                                    count = Math.max((i5 - childAt.getMeasuredHeight()) / 2, decorCount);
                                    break;
                                case 48:
                                    count = decorCount;
                                    decorCount += childAt.getMeasuredHeight();
                                    break;
                                case C5073y1.c /* 80 */:
                                    int count5 = i5 - paddingBottom;
                                    count = count5 - childAt.getMeasuredHeight();
                                    paddingBottom += childAt.getMeasuredHeight();
                                    break;
                                default:
                                    count = decorCount;
                                    break;
                            }
                            int i9 = iMax + hgrav;
                            int width = i9 + childAt.getMeasuredWidth();
                            childAt.layout(i9, count, width, childAt.getMeasuredHeight() + count);
                            paddingBottom2++;
                        } else {
                            continue;
                        }
                    }
                    i6++;
                } else {
                    int paddingRight2 = (paddingRight - scrollX) - childLeft;
                    int i10 = 0;
                    while (i10 < paddingLeft) {
                        View childAt2 = getChildAt(i10);
                        if (childAt2.getVisibility() != i7) {
                            C2983hi c2983hi2 = (C2983hi) childAt2.getLayoutParams();
                            if (!c2983hi2.A05 && (c2982hhA09 = A09(childAt2)) != null) {
                                int childWidth = scrollX + ((int) (paddingRight2 * c2982hhA09.A00));
                                if (c2983hi2.A03) {
                                    c2983hi2.A03 = false;
                                    int widthSpec = View.MeasureSpec.makeMeasureSpec((int) (paddingRight2 * c2983hi2.A00), 1073741824);
                                    childAt2.measure(widthSpec, View.MeasureSpec.makeMeasureSpec((i5 - decorCount) - paddingBottom, 1073741824));
                                }
                                int heightSpec = childAt2.getMeasuredWidth();
                                int widthSpec2 = childAt2.getMeasuredHeight();
                                int i11 = decorCount;
                                childAt2.layout(childWidth, i11, heightSpec + childWidth, widthSpec2 + i11);
                            }
                        }
                        i10++;
                        i7 = 8;
                    }
                    this.A0Q = decorCount;
                    this.A09 = i5 - paddingBottom;
                    this.A0D = paddingBottom2;
                    if (this.A0g) {
                        int i12 = this.A00;
                        z2 = false;
                        String[] strArr3 = A0t;
                        if (strArr3[4].length() != strArr3[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0t;
                        strArr4[4] = "";
                        strArr4[5] = "";
                        A0O(i12, false, 0, false);
                    } else {
                        z2 = false;
                    }
                    this.A0g = z2;
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int end;
        int i2;
        C2982hh c2982hhA09;
        int i3 = getChildCount();
        int count = i & 2;
        if (count != 0) {
            end = 0;
            i2 = 1;
        } else {
            end = i3 - 1;
            i2 = -1;
            i3 = -1;
        }
        while (end != i3) {
            View child = getChildAt(end);
            int index = A0t[2].length();
            if (index == 14) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[3] = "wvs0VrXDMEHK1ZrgMliCmQkmYIqFRPYZ";
            strArr[6] = "yeuyy9yC0QSIfk9tyj8D1No5khczL5F7";
            int count2 = child.getVisibility();
            if (count2 == 0 && (c2982hhA09 = A09(child)) != null) {
                int index2 = c2982hhA09.A02;
                int count3 = this.A00;
                if (index2 == count3 && child.requestFocus(i, rect)) {
                    return true;
                }
            }
            end += i2;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Context context = getContext();
            String[] strArr = A0t;
            if (strArr[3].charAt(15) == strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[7] = "Ly8LvMv3iU8o2fiJAVqvd6K7Aqz3gZKY";
            strArr2[0] = "HcNmsPXina8Ul250FP3kUGj1pgK53N1r";
            classLoader = context.getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) state;
        super.onRestoreInstanceState(viewPager$SavedState.A04());
        if (this.A01 != null) {
            A0P(viewPager$SavedState.A00, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0a = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        ViewPager$SavedState ss = new ViewPager$SavedState(superState);
        ss.A00 = this.A00;
        if (this.A01 != null) {
            Parcelable superState2 = this.A01.A03();
            ss.A01 = superState2;
        }
        Parcelable superState3 = new WrappedParcelable(ss);
        return superState3;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            A0M(i, i3, this.A0M, this.A0M);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0h) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC2962hM abstractC2962hM) {
        if (this.A01 != null) {
            this.A01.A06(null);
            for (int i = 0; i < i; i++) {
                C2982hh c2982hh = this.A0r.get(i);
                this.A01.A07(this, c2982hh.A02, c2982hh.A03);
            }
            this.A0r.clear();
            A0C();
            this.A00 = 0;
            scrollTo(0, 0);
        }
        this.A01 = abstractC2962hM;
        this.A0G = 0;
        AbstractC2962hM oldAdapter = this.A01;
        if (oldAdapter != null) {
            if (this.A0Z == null) {
                this.A0Z = new C2987hm(this);
            }
            this.A01.A06(this.A0Z);
            this.A0m = false;
            boolean z = this.A0g;
            this.A0g = true;
            AbstractC2962hM oldAdapter2 = this.A01;
            this.A0G = oldAdapter2.A01();
            if (this.A0O >= 0) {
                A0P(this.A0O, false, true);
                this.A0O = -1;
                this.A0T = null;
                this.A0a = null;
            } else if (!z) {
                A0h();
            } else {
                requestLayout();
            }
        }
        if (this.A0c != null && !this.A0c.isEmpty() && 0 < this.A0c.size()) {
            this.A0c.get(0);
            throw new NullPointerException(A0A(381, 16, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
        }
    }

    public void setCurrentItem(int i) {
        this.A0m = false;
        A0P(i, !this.A0g, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(A0A(300, 9, 47), A0A(127, 31, 60) + i + A0A(51, 26, 90) + 1);
            i = 1;
        }
        if (i != this.A0L) {
            this.A0L = i;
            A0h();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC2985hk interfaceC2985hk) {
        this.A0Y = interfaceC2985hk;
    }

    public void setPageMargin(int i) {
        int width = this.A0M;
        this.A0M = i;
        int oldMargin = getWidth();
        A0M(oldMargin, oldMargin, i, width);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(AbstractC2933gs.A00(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.A0P == i) {
            return;
        }
        this.A0P = i;
        if (0 != 0) {
            A0U(i != 0);
        }
        A0H(i);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0n != z) {
            this.A0n = z;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}
