package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.C5073y1;
import com.safedk.android.analytics.brandsafety.b;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.h50;
import defpackage.n30;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ConstraintSet {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Constraint {
        public int a;
        public final PropertySet b;
        public final Motion c;
        public final Layout d;
        public final Transform e;
        public HashMap f;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class Delta {
            public int[] a;
            public int[] b;
            public int c;
            public int[] d;
            public float[] e;
            public int f;
            public int[] g;
            public String[] h;
            public int i;
            public int[] j;
            public boolean[] k;
            public int l;

            public final void a(float f, int i) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public final void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public final void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        public final void a(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.d;
            layoutParams.e = layout.h;
            layoutParams.f = layout.i;
            layoutParams.g = layout.j;
            layoutParams.h = layout.k;
            layoutParams.i = layout.l;
            layoutParams.j = layout.m;
            layoutParams.k = layout.n;
            layoutParams.l = layout.o;
            layoutParams.m = layout.p;
            layoutParams.n = layout.q;
            layoutParams.o = layout.r;
            layoutParams.s = layout.s;
            layoutParams.t = layout.t;
            layoutParams.u = layout.u;
            layoutParams.v = layout.v;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.F;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.G;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.H;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.I;
            layoutParams.A = layout.R;
            layoutParams.B = layout.Q;
            layoutParams.x = layout.N;
            layoutParams.z = layout.P;
            layoutParams.E = layout.w;
            layoutParams.F = layout.x;
            layoutParams.p = layout.z;
            layoutParams.q = layout.A;
            layoutParams.r = layout.B;
            layoutParams.G = layout.y;
            layoutParams.T = layout.C;
            layoutParams.U = layout.D;
            layoutParams.I = layout.T;
            layoutParams.H = layout.U;
            layoutParams.K = layout.W;
            layoutParams.J = layout.V;
            layoutParams.W = layout.l0;
            layoutParams.X = layout.m0;
            layoutParams.L = layout.X;
            layoutParams.M = layout.Y;
            layoutParams.P = layout.Z;
            layoutParams.Q = layout.a0;
            layoutParams.N = layout.b0;
            layoutParams.O = layout.c0;
            layoutParams.R = layout.d0;
            layoutParams.S = layout.e0;
            layoutParams.V = layout.E;
            layoutParams.c = layout.f;
            layoutParams.a = layout.d;
            layoutParams.b = layout.e;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.b;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.c;
            String str = layout.k0;
            if (str != null) {
                layoutParams.Y = str;
            }
            layoutParams.Z = layout.o0;
            layoutParams.setMarginStart(layout.K);
            layoutParams.setMarginEnd(layout.J);
            layoutParams.a();
        }

        public final void b(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.a = i;
            int i2 = layoutParams.e;
            Layout layout = this.d;
            layout.h = i2;
            layout.i = layoutParams.f;
            layout.j = layoutParams.g;
            layout.k = layoutParams.h;
            layout.l = layoutParams.i;
            layout.m = layoutParams.j;
            layout.n = layoutParams.k;
            layout.o = layoutParams.l;
            layout.p = layoutParams.m;
            layout.q = layoutParams.n;
            layout.r = layoutParams.o;
            layout.s = layoutParams.s;
            layout.t = layoutParams.t;
            layout.u = layoutParams.u;
            layout.v = layoutParams.v;
            layout.w = layoutParams.E;
            layout.x = layoutParams.F;
            layout.y = layoutParams.G;
            layout.z = layoutParams.p;
            layout.A = layoutParams.q;
            layout.B = layoutParams.r;
            layout.C = layoutParams.T;
            layout.D = layoutParams.U;
            layout.E = layoutParams.V;
            layout.f = layoutParams.c;
            layout.d = layoutParams.a;
            layout.e = layoutParams.b;
            layout.b = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.c = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.F = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.G = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.H = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.I = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.L = layoutParams.D;
            layout.T = layoutParams.I;
            layout.U = layoutParams.H;
            layout.W = layoutParams.K;
            layout.V = layoutParams.J;
            layout.l0 = layoutParams.W;
            layout.m0 = layoutParams.X;
            layout.X = layoutParams.L;
            layout.Y = layoutParams.M;
            layout.Z = layoutParams.P;
            layout.a0 = layoutParams.Q;
            layout.b0 = layoutParams.N;
            layout.c0 = layoutParams.O;
            layout.d0 = layoutParams.R;
            layout.e0 = layoutParams.S;
            layout.k0 = layoutParams.Y;
            layout.N = layoutParams.x;
            layout.P = layoutParams.z;
            layout.M = layoutParams.w;
            layout.O = layoutParams.y;
            layout.R = layoutParams.A;
            layout.Q = layoutParams.B;
            layout.S = layoutParams.C;
            layout.o0 = layoutParams.Z;
            layout.J = layoutParams.getMarginEnd();
            layout.K = layoutParams.getMarginStart();
        }

        public final Object clone() {
            Constraint constraint = new Constraint();
            Layout layout = constraint.d;
            layout.getClass();
            Layout layout2 = this.d;
            layout.a = layout2.a;
            layout.b = layout2.b;
            layout.c = layout2.c;
            layout.d = layout2.d;
            layout.e = layout2.e;
            layout.f = layout2.f;
            layout.g = layout2.g;
            layout.h = layout2.h;
            layout.i = layout2.i;
            layout.j = layout2.j;
            layout.k = layout2.k;
            layout.l = layout2.l;
            layout.m = layout2.m;
            layout.n = layout2.n;
            layout.o = layout2.o;
            layout.p = layout2.p;
            layout.q = layout2.q;
            layout.r = layout2.r;
            layout.s = layout2.s;
            layout.t = layout2.t;
            layout.u = layout2.u;
            layout.v = layout2.v;
            layout.w = layout2.w;
            layout.x = layout2.x;
            layout.y = layout2.y;
            layout.z = layout2.z;
            layout.A = layout2.A;
            layout.B = layout2.B;
            layout.C = layout2.C;
            layout.D = layout2.D;
            layout.E = layout2.E;
            layout.F = layout2.F;
            layout.G = layout2.G;
            layout.H = layout2.H;
            layout.I = layout2.I;
            layout.J = layout2.J;
            layout.K = layout2.K;
            layout.L = layout2.L;
            layout.M = layout2.M;
            layout.N = layout2.N;
            layout.O = layout2.O;
            layout.P = layout2.P;
            layout.Q = layout2.Q;
            layout.R = layout2.R;
            layout.S = layout2.S;
            layout.T = layout2.T;
            layout.U = layout2.U;
            layout.V = layout2.V;
            layout.W = layout2.W;
            layout.X = layout2.X;
            layout.Y = layout2.Y;
            layout.Z = layout2.Z;
            layout.a0 = layout2.a0;
            layout.b0 = layout2.b0;
            layout.c0 = layout2.c0;
            layout.d0 = layout2.d0;
            layout.e0 = layout2.e0;
            layout.f0 = layout2.f0;
            layout.g0 = layout2.g0;
            layout.h0 = layout2.h0;
            layout.k0 = layout2.k0;
            int[] iArr = layout2.i0;
            if (iArr == null || layout2.j0 != null) {
                layout.i0 = null;
            } else {
                layout.i0 = Arrays.copyOf(iArr, iArr.length);
            }
            layout.j0 = layout2.j0;
            layout.l0 = layout2.l0;
            layout.m0 = layout2.m0;
            layout.n0 = layout2.n0;
            layout.o0 = layout2.o0;
            Motion motion = constraint.c;
            motion.getClass();
            Motion motion2 = this.c;
            motion2.getClass();
            motion.a = motion2.a;
            motion.c = motion2.c;
            motion.d = motion2.d;
            motion.e = motion2.e;
            motion.g = motion2.g;
            motion.f = motion2.f;
            PropertySet propertySet = this.b;
            int i = propertySet.a;
            PropertySet propertySet2 = constraint.b;
            propertySet2.a = i;
            propertySet2.c = propertySet.c;
            propertySet2.d = propertySet.d;
            propertySet2.b = propertySet.b;
            Transform transform = constraint.e;
            transform.getClass();
            Transform transform2 = this.e;
            transform2.getClass();
            transform.a = transform2.a;
            transform.b = transform2.b;
            transform.c = transform2.c;
            transform.d = transform2.d;
            transform.e = transform2.e;
            transform.f = transform2.f;
            transform.g = transform2.g;
            transform.h = transform2.h;
            transform.i = transform2.i;
            transform.j = transform2.j;
            transform.k = transform2.k;
            transform.l = transform2.l;
            transform.m = transform2.m;
            constraint.a = this.a;
            return constraint;
        }

        public Constraint() {
            PropertySet propertySet = new PropertySet();
            propertySet.a = 0;
            propertySet.b = 0;
            propertySet.c = 1.0f;
            propertySet.d = Float.NaN;
            this.b = propertySet;
            Motion motion = new Motion();
            motion.a = -1;
            motion.b = 0;
            motion.c = null;
            motion.d = -1;
            motion.e = 0;
            motion.f = Float.NaN;
            motion.g = Float.NaN;
            motion.h = Float.NaN;
            motion.i = -1;
            motion.j = null;
            motion.k = -1;
            this.c = motion;
            Layout layout = new Layout();
            layout.a = false;
            layout.d = -1;
            layout.e = -1;
            layout.f = -1.0f;
            layout.g = true;
            layout.h = -1;
            layout.i = -1;
            layout.j = -1;
            layout.k = -1;
            layout.l = -1;
            layout.m = -1;
            layout.n = -1;
            layout.o = -1;
            layout.p = -1;
            layout.q = -1;
            layout.r = -1;
            layout.s = -1;
            layout.t = -1;
            layout.u = -1;
            layout.v = -1;
            layout.w = 0.5f;
            layout.x = 0.5f;
            layout.y = null;
            layout.z = -1;
            layout.A = 0;
            layout.B = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            layout.C = -1;
            layout.D = -1;
            layout.E = -1;
            layout.F = 0;
            layout.G = 0;
            layout.H = 0;
            layout.I = 0;
            layout.J = 0;
            layout.K = 0;
            layout.L = 0;
            layout.M = Integer.MIN_VALUE;
            layout.N = Integer.MIN_VALUE;
            layout.O = Integer.MIN_VALUE;
            layout.P = Integer.MIN_VALUE;
            layout.Q = Integer.MIN_VALUE;
            layout.R = Integer.MIN_VALUE;
            layout.S = Integer.MIN_VALUE;
            layout.T = -1.0f;
            layout.U = -1.0f;
            layout.V = 0;
            layout.W = 0;
            layout.X = 0;
            layout.Y = 0;
            layout.Z = 0;
            layout.a0 = 0;
            layout.b0 = 0;
            layout.c0 = 0;
            layout.d0 = 1.0f;
            layout.e0 = 1.0f;
            layout.f0 = -1;
            layout.g0 = 0;
            layout.h0 = -1;
            layout.l0 = false;
            layout.m0 = false;
            layout.n0 = true;
            layout.o0 = 0;
            this.d = layout;
            Transform transform = new Transform();
            transform.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            transform.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            transform.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            transform.d = 1.0f;
            transform.e = 1.0f;
            transform.f = Float.NaN;
            transform.g = Float.NaN;
            transform.h = -1;
            transform.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            transform.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            transform.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            transform.l = false;
            transform.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.e = transform;
            this.f = new HashMap();
        }

        public final void c(int i, Constraints.LayoutParams layoutParams) {
            b(i, layoutParams);
            this.b.c = layoutParams.r0;
            float f = layoutParams.u0;
            Transform transform = this.e;
            transform.a = f;
            transform.b = layoutParams.v0;
            transform.c = layoutParams.w0;
            transform.d = layoutParams.x0;
            transform.e = layoutParams.y0;
            transform.f = layoutParams.z0;
            transform.g = layoutParams.A0;
            transform.i = layoutParams.B0;
            transform.j = layoutParams.C0;
            transform.k = layoutParams.D0;
            transform.m = layoutParams.t0;
            transform.l = layoutParams.s0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Layout {
        public static final SparseIntArray p0;
        public int A;
        public float B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public float T;
        public float U;
        public int V;
        public int W;
        public int X;
        public int Y;
        public int Z;
        public boolean a;
        public int a0;
        public int b;
        public int b0;
        public int c;
        public int c0;
        public int d;
        public float d0;
        public int e;
        public float e0;
        public float f;
        public int f0;
        public boolean g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int[] i0;
        public int j;
        public String j0;
        public int k;
        public String k0;
        public int l;
        public boolean l0;
        public int m;
        public boolean m0;
        public int n;
        public boolean n0;
        public int o;
        public int o0;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public float w;
        public float x;
        public String y;
        public int z;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = p0;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.p = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.p);
                        break;
                    case 2:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 3:
                        this.o = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.o);
                        break;
                    case 4:
                        this.n = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.n);
                        break;
                    case 5:
                        this.y = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case 7:
                        this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 8:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 9:
                        this.v = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.v);
                        break;
                    case 10:
                        this.u = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.u);
                        break;
                    case 11:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 12:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 13:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 14:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 15:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 16:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 17:
                        this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                        break;
                    case 18:
                        this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case 19:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 20:
                        this.w = typedArrayObtainStyledAttributes.getFloat(index, this.w);
                        break;
                    case 21:
                        this.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case 22:
                        this.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.b);
                        break;
                    case 23:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 24:
                        this.h = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.h);
                        break;
                    case 25:
                        this.i = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                    case 26:
                        this.E = typedArrayObtainStyledAttributes.getInt(index, this.E);
                        break;
                    case 27:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 28:
                        this.j = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.j);
                        break;
                    case 29:
                        this.k = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.k);
                        break;
                    case 30:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 31:
                        this.s = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.s);
                        break;
                    case 32:
                        this.t = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.t);
                        break;
                    case 33:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 34:
                        this.m = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.m);
                        break;
                    case 35:
                        this.l = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.l);
                        break;
                    case 36:
                        this.x = typedArrayObtainStyledAttributes.getFloat(index, this.x);
                        break;
                    case 37:
                        this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 38:
                        this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 39:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 40:
                        this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 41:
                        ConstraintSet.g(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        ConstraintSet.g(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.z = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.z);
                                break;
                            case 62:
                                this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                break;
                            case 63:
                                this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.d0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f0 = typedArrayObtainStyledAttributes.getInt(index, this.f0);
                                        break;
                                    case 73:
                                        this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.g0);
                                        break;
                                    case 74:
                                        this.j0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case 76:
                                        this.o0 = typedArrayObtainStyledAttributes.getInt(index, this.o0);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                                        this.q = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.q);
                                        break;
                                    case 78:
                                        this.r = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.r);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.TIMEZONE_FIELD_NUMBER /* 79 */:
                                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                        break;
                                    case C5073y1.c /* 80 */:
                                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                        break;
                                    case 81:
                                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                                        break;
                                    case 82:
                                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 83:
                                        this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                        break;
                                    case 84:
                                        this.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                        break;
                                    case 85:
                                        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 86:
                                        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 87:
                                        this.l0 = typedArrayObtainStyledAttributes.getBoolean(index, this.l0);
                                        break;
                                    case 88:
                                        this.m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.m0);
                                        break;
                                    case 89:
                                        this.k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.g = typedArrayObtainStyledAttributes.getBoolean(index, this.g);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Motion {
        public static final SparseIntArray l;
        public int a;
        public int b;
        public String c;
        public int d;
        public int e;
        public float f;
        public float g;
        public float h;
        public int i;
        public String j;
        public int k;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            l = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.g);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (l.get(index)) {
                    case 1:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 2:
                        this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.c = Easing.b[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.a = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getInteger(index, this.b);
                        break;
                    case 7:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 8:
                        this.i = typedArrayObtainStyledAttributes.getInteger(index, this.i);
                        break;
                    case 9:
                        this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            this.k = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.j = string;
                            if (string.indexOf("/") > 0) {
                                this.k = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index, this.k);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class PropertySet {
        public int a;
        public int b;
        public float c;
        public float d;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.h);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                } else if (index == 0) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    this.a = i2;
                    this.a = ConstraintSet.d[i2];
                } else if (index == 4) {
                    this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                } else if (index == 3) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Transform {
        public static final SparseIntArray n;
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public int h;
        public float i;
        public float j;
        public float k;
        public boolean l;
        public float m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (n.get(index)) {
                    case 1:
                        this.a = typedArrayObtainStyledAttributes.getFloat(index, this.a);
                        break;
                    case 2:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 3:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 4:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 5:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 6:
                        this.f = typedArrayObtainStyledAttributes.getDimension(index, this.f);
                        break;
                    case 7:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 8:
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 10:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 11:
                        this.l = true;
                        this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                        break;
                    case 12:
                        this.h = ConstraintSet.f(typedArrayObtainStyledAttributes, index, this.h);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class WriteJsonEngine {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class WriteXmlEngine {
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(b.v, 83);
        sparseIntArray.append(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 84);
        sparseIntArray.append(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 85);
        sparseIntArray.append(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = R.id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.m.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static Constraint d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        Constraint constraint = new Constraint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? R.styleable.c : R.styleable.a);
        PropertySet propertySet = constraint.b;
        Transform transform = constraint.e;
        Motion motion = constraint.c;
        Layout layout = constraint.d;
        int[] iArr = d;
        String[] strArr = Easing.b;
        SparseIntArray sparseIntArray = e;
        if (z) {
            Constraint.Delta delta = new Constraint.Delta();
            delta.a = new int[10];
            delta.b = new int[10];
            delta.c = 0;
            delta.d = new int[10];
            delta.e = new float[10];
            delta.f = 0;
            delta.g = new int[5];
            delta.h = new String[5];
            delta.i = 0;
            delta.j = new int[4];
            delta.k = new boolean[4];
            delta.l = 0;
            motion.getClass();
            layout.getClass();
            transform.getClass();
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        delta.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.I));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = indexCount;
                        delta.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 6:
                        i2 = indexCount;
                        delta.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.C));
                        break;
                    case 7:
                        i2 = indexCount;
                        delta.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.D));
                        break;
                    case 8:
                        i2 = indexCount;
                        delta.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.J));
                        break;
                    case 11:
                        i2 = indexCount;
                        delta.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.P));
                        break;
                    case 12:
                        i2 = indexCount;
                        delta.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.Q));
                        break;
                    case 13:
                        i2 = indexCount;
                        delta.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.M));
                        break;
                    case 14:
                        i2 = indexCount;
                        delta.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.O));
                        break;
                    case 15:
                        i2 = indexCount;
                        delta.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.R));
                        break;
                    case 16:
                        i2 = indexCount;
                        delta.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.N));
                        break;
                    case 17:
                        i2 = indexCount;
                        delta.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.d));
                        break;
                    case 18:
                        i2 = indexCount;
                        delta.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.e));
                        break;
                    case 19:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, layout.f), 19);
                        break;
                    case 20:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, layout.w), 20);
                        break;
                    case 21:
                        i2 = indexCount;
                        delta.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, layout.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        delta.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, propertySet.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        delta.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, layout.b));
                        break;
                    case 24:
                        i2 = indexCount;
                        delta.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.F));
                        break;
                    case 27:
                        i2 = indexCount;
                        delta.b(27, typedArrayObtainStyledAttributes.getInt(index, layout.E));
                        break;
                    case 28:
                        i2 = indexCount;
                        delta.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.G));
                        break;
                    case 31:
                        i2 = indexCount;
                        delta.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.K));
                        break;
                    case 34:
                        i2 = indexCount;
                        delta.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.H));
                        break;
                    case 37:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, layout.x), 37);
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, constraint.a);
                        constraint.a = resourceId;
                        delta.b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, layout.U), 39);
                        break;
                    case 40:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, layout.T), 40);
                        break;
                    case 41:
                        i2 = indexCount;
                        delta.b(41, typedArrayObtainStyledAttributes.getInt(index, layout.V));
                        break;
                    case 42:
                        i2 = indexCount;
                        delta.b(42, typedArrayObtainStyledAttributes.getInt(index, layout.W));
                        break;
                    case 43:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, propertySet.c), 43);
                        break;
                    case 44:
                        i2 = indexCount;
                        delta.d(44, true);
                        delta.a(typedArrayObtainStyledAttributes.getDimension(index, transform.m), 44);
                        break;
                    case 45:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, transform.b), 45);
                        break;
                    case 46:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, transform.c), 46);
                        break;
                    case 47:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, transform.d), 47);
                        break;
                    case 48:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, transform.e), 48);
                        break;
                    case 49:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getDimension(index, transform.f), 49);
                        break;
                    case 50:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getDimension(index, transform.g), 50);
                        break;
                    case 51:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getDimension(index, transform.i), 51);
                        break;
                    case 52:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getDimension(index, transform.j), 52);
                        break;
                    case 53:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getDimension(index, transform.k), 53);
                        break;
                    case 54:
                        i2 = indexCount;
                        delta.b(54, typedArrayObtainStyledAttributes.getInt(index, layout.X));
                        break;
                    case 55:
                        i2 = indexCount;
                        delta.b(55, typedArrayObtainStyledAttributes.getInt(index, layout.Y));
                        break;
                    case 56:
                        i2 = indexCount;
                        delta.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.Z));
                        break;
                    case 57:
                        i2 = indexCount;
                        delta.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.a0));
                        break;
                    case 58:
                        i2 = indexCount;
                        delta.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.b0));
                        break;
                    case 59:
                        i2 = indexCount;
                        delta.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.c0));
                        break;
                    case 60:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, transform.a), 60);
                        break;
                    case 62:
                        i2 = indexCount;
                        delta.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.A));
                        break;
                    case 63:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, layout.B), 63);
                        break;
                    case 64:
                        i2 = indexCount;
                        delta.b(64, f(typedArrayObtainStyledAttributes, index, motion.a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            delta.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            delta.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = indexCount;
                        delta.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, motion.g), 67);
                        break;
                    case 68:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, propertySet.d), 68);
                        break;
                    case 69:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        delta.b(72, typedArrayObtainStyledAttributes.getInt(index, layout.f0));
                        break;
                    case 73:
                        i2 = indexCount;
                        delta.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.g0));
                        break;
                    case 74:
                        i2 = indexCount;
                        delta.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = indexCount;
                        delta.d(75, typedArrayObtainStyledAttributes.getBoolean(index, layout.n0));
                        break;
                    case 76:
                        i2 = indexCount;
                        delta.b(76, typedArrayObtainStyledAttributes.getInt(index, motion.d));
                        break;
                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                        i2 = indexCount;
                        delta.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = indexCount;
                        delta.b(78, typedArrayObtainStyledAttributes.getInt(index, propertySet.b));
                        break;
                    case TokenParametersOuterClass$TokenParameters.TIMEZONE_FIELD_NUMBER /* 79 */:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, motion.f), 79);
                        break;
                    case C5073y1.c /* 80 */:
                        i2 = indexCount;
                        delta.d(80, typedArrayObtainStyledAttributes.getBoolean(index, layout.l0));
                        break;
                    case 81:
                        i2 = indexCount;
                        delta.d(81, typedArrayObtainStyledAttributes.getBoolean(index, layout.m0));
                        break;
                    case 82:
                        i2 = indexCount;
                        delta.b(82, typedArrayObtainStyledAttributes.getInteger(index, motion.b));
                        break;
                    case 83:
                        i2 = indexCount;
                        delta.b(83, f(typedArrayObtainStyledAttributes, index, transform.h));
                        break;
                    case 84:
                        i2 = indexCount;
                        delta.b(84, typedArrayObtainStyledAttributes.getInteger(index, motion.i));
                        break;
                    case 85:
                        i2 = indexCount;
                        delta.a(typedArrayObtainStyledAttributes.getFloat(index, motion.h), 85);
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            motion.k = resourceId2;
                            delta.b(89, resourceId2);
                            if (motion.k != -1) {
                                delta.b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            motion.j = string;
                            delta.c(90, string);
                            if (motion.j.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                motion.k = resourceId3;
                                delta.b(89, resourceId3);
                                delta.b(88, -2);
                            } else {
                                delta.b(88, -1);
                            }
                        } else {
                            delta.b(88, typedArrayObtainStyledAttributes.getInteger(index, motion.k));
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        delta.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.L));
                        break;
                    case 94:
                        i2 = indexCount;
                        delta.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.S));
                        break;
                    case 95:
                        i2 = indexCount;
                        g(delta, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        g(delta, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        delta.b(97, typedArrayObtainStyledAttributes.getInt(index, layout.o0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = MotionLayout.c0;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            constraint.a = typedArrayObtainStyledAttributes.getResourceId(index, constraint.a);
                        }
                        break;
                    case 99:
                        i2 = indexCount;
                        delta.d(99, typedArrayObtainStyledAttributes.getBoolean(index, layout.g));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        motion.getClass();
                        layout.getClass();
                        transform.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        layout.p = f(typedArrayObtainStyledAttributes, index2, layout.p);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        layout.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.I);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        layout.o = f(typedArrayObtainStyledAttributes, index2, layout.o);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        layout.n = f(typedArrayObtainStyledAttributes, index2, layout.n);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        layout.y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        layout.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, layout.C);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        layout.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, layout.D);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        layout.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.J);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        layout.v = f(typedArrayObtainStyledAttributes, index2, layout.v);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        layout.u = f(typedArrayObtainStyledAttributes, index2, layout.u);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        layout.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.P);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        layout.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.Q);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        layout.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.M);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        layout.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.O);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        layout.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.R);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        layout.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.N);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        layout.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, layout.d);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        layout.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, layout.e);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        layout.f = typedArrayObtainStyledAttributes.getFloat(index2, layout.f);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        layout.w = typedArrayObtainStyledAttributes.getFloat(index2, layout.w);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        layout.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, layout.c);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, propertySet.a);
                        propertySet.a = i8;
                        propertySet.a = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        layout.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, layout.b);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        layout.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.F);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        layout.h = f(typedArrayObtainStyledAttributes, index2, layout.h);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        layout.i = f(typedArrayObtainStyledAttributes, index2, layout.i);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        layout.E = typedArrayObtainStyledAttributes.getInt(index2, layout.E);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        layout.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.G);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        layout.j = f(typedArrayObtainStyledAttributes, index2, layout.j);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        layout.k = f(typedArrayObtainStyledAttributes, index2, layout.k);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        layout.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.K);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        layout.s = f(typedArrayObtainStyledAttributes, index2, layout.s);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        layout.t = f(typedArrayObtainStyledAttributes, index2, layout.t);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        layout.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.H);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        layout.m = f(typedArrayObtainStyledAttributes, index2, layout.m);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        layout.l = f(typedArrayObtainStyledAttributes, index2, layout.l);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        layout.x = typedArrayObtainStyledAttributes.getFloat(index2, layout.x);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        constraint.a = typedArrayObtainStyledAttributes.getResourceId(index2, constraint.a);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        layout.U = typedArrayObtainStyledAttributes.getFloat(index2, layout.U);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        layout.T = typedArrayObtainStyledAttributes.getFloat(index2, layout.T);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        layout.V = typedArrayObtainStyledAttributes.getInt(index2, layout.V);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        layout.W = typedArrayObtainStyledAttributes.getInt(index2, layout.W);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        propertySet.c = typedArrayObtainStyledAttributes.getFloat(index2, propertySet.c);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        transform.l = true;
                        transform.m = typedArrayObtainStyledAttributes.getDimension(index2, transform.m);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        transform.b = typedArrayObtainStyledAttributes.getFloat(index2, transform.b);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        transform.c = typedArrayObtainStyledAttributes.getFloat(index2, transform.c);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        transform.d = typedArrayObtainStyledAttributes.getFloat(index2, transform.d);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        transform.e = typedArrayObtainStyledAttributes.getFloat(index2, transform.e);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        transform.f = typedArrayObtainStyledAttributes.getDimension(index2, transform.f);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        transform.g = typedArrayObtainStyledAttributes.getDimension(index2, transform.g);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        transform.i = typedArrayObtainStyledAttributes.getDimension(index2, transform.i);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        transform.j = typedArrayObtainStyledAttributes.getDimension(index2, transform.j);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        transform.k = typedArrayObtainStyledAttributes.getDimension(index2, transform.k);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        layout.X = typedArrayObtainStyledAttributes.getInt(index2, layout.X);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        layout.Y = typedArrayObtainStyledAttributes.getInt(index2, layout.Y);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        layout.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.Z);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        layout.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.a0);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        layout.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.b0);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        layout.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.c0);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        transform.a = typedArrayObtainStyledAttributes.getFloat(index2, transform.a);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        layout.z = f(typedArrayObtainStyledAttributes, index2, layout.z);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        layout.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.A);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        layout.B = typedArrayObtainStyledAttributes.getFloat(index2, layout.B);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        motion.a = f(typedArrayObtainStyledAttributes, index2, motion.a);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            motion.c = typedArrayObtainStyledAttributes.getString(index2);
                        } else {
                            motion.c = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                        }
                        i7++;
                        break;
                    case 66:
                        i = indexCount2;
                        motion.e = typedArrayObtainStyledAttributes.getInt(index2, 0);
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        motion.g = typedArrayObtainStyledAttributes.getFloat(index2, motion.g);
                        break;
                    case 68:
                        i = indexCount2;
                        propertySet.d = typedArrayObtainStyledAttributes.getFloat(index2, propertySet.d);
                        break;
                    case 69:
                        i = indexCount2;
                        layout.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        layout.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        layout.f0 = typedArrayObtainStyledAttributes.getInt(index2, layout.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        layout.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        layout.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        layout.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, layout.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        motion.d = typedArrayObtainStyledAttributes.getInt(index2, motion.d);
                        break;
                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                        i = indexCount2;
                        layout.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        propertySet.b = typedArrayObtainStyledAttributes.getInt(index2, propertySet.b);
                        break;
                    case TokenParametersOuterClass$TokenParameters.TIMEZONE_FIELD_NUMBER /* 79 */:
                        i = indexCount2;
                        motion.f = typedArrayObtainStyledAttributes.getFloat(index2, motion.f);
                        break;
                    case C5073y1.c /* 80 */:
                        i = indexCount2;
                        layout.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, layout.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        layout.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, layout.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        motion.b = typedArrayObtainStyledAttributes.getInteger(index2, motion.b);
                        break;
                    case 83:
                        i = indexCount2;
                        transform.h = f(typedArrayObtainStyledAttributes, index2, transform.h);
                        break;
                    case 84:
                        i = indexCount2;
                        motion.i = typedArrayObtainStyledAttributes.getInteger(index2, motion.i);
                        break;
                    case 85:
                        i = indexCount2;
                        motion.h = typedArrayObtainStyledAttributes.getFloat(index2, motion.h);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            motion.k = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            motion.j = string2;
                            if (string2.indexOf("/") > 0) {
                                motion.k = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, motion.k);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        layout.q = f(typedArrayObtainStyledAttributes, index2, layout.q);
                        break;
                    case 92:
                        i = indexCount2;
                        layout.r = f(typedArrayObtainStyledAttributes, index2, layout.r);
                        break;
                    case 93:
                        i = indexCount2;
                        layout.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.L);
                        break;
                    case 94:
                        i = indexCount2;
                        layout.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, layout.S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(layout, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        g(layout, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        layout.o0 = typedArrayObtainStyledAttributes.getInt(index2, layout.o0);
                        break;
                }
                i7++;
            }
            if (layout.j0 != null) {
                layout.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        Constraint.Delta delta;
        Layout layout;
        ConstraintLayout.LayoutParams layoutParams;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
                        layoutParams.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                        layoutParams.X = z;
                        return;
                    }
                }
                if (obj instanceof Layout) {
                    layout = (Layout) obj;
                    if (i2 == 0) {
                        layout.b = i4;
                        layout.l0 = z;
                        return;
                    } else {
                        layout.c = i4;
                        layout.m0 = z;
                        return;
                    }
                }
                if (obj instanceof Constraint.Delta) {
                    delta = (Constraint.Delta) obj;
                    if (i2 == 0) {
                        delta.b(23, i4);
                        delta.d(80, z);
                        return;
                    } else {
                        delta.b(21, i4);
                        delta.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
                    layoutParams.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                    layoutParams.X = z;
                    return;
                }
            }
            if (obj instanceof Layout) {
                layout = (Layout) obj;
                if (i2 == 0) {
                    layout.b = i4;
                    layout.l0 = z;
                    return;
                } else {
                    layout.c = i4;
                    layout.m0 = z;
                    return;
                }
            }
            if (obj instanceof Constraint.Delta) {
                delta = (Constraint.Delta) obj;
                if (i2 == 0) {
                    delta.b(23, i4);
                    delta.d(80, z);
                    return;
                } else {
                    delta.b(21, i4);
                    delta.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                    }
                    h(layoutParams2, strTrim2);
                    return;
                }
                if (obj instanceof Layout) {
                    ((Layout) obj).y = strTrim2;
                    return;
                } else {
                    if (obj instanceof Constraint.Delta) {
                        ((Constraint.Delta) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.H = f2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.I = f2;
                            return;
                        }
                    }
                    if (obj instanceof Layout) {
                        Layout layout2 = (Layout) obj;
                        if (i2 == 0) {
                            layout2.b = 0;
                            layout2.U = f2;
                            return;
                        } else {
                            layout2.c = 0;
                            layout2.T = f2;
                            return;
                        }
                    }
                    if (obj instanceof Constraint.Delta) {
                        Constraint.Delta delta2 = (Constraint.Delta) obj;
                        if (i2 == 0) {
                            delta2.b(23, 0);
                            delta2.a(f2, 39);
                            return;
                        } else {
                            delta2.b(21, 0);
                            delta2.a(f2, 40);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
                            layoutParams4.R = fMax;
                            layoutParams4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).height = 0;
                            layoutParams4.S = fMax;
                            layoutParams4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof Layout) {
                        Layout layout3 = (Layout) obj;
                        if (i2 == 0) {
                            layout3.b = 0;
                            layout3.d0 = fMax;
                            layout3.X = 2;
                            return;
                        } else {
                            layout3.c = 0;
                            layout3.e0 = fMax;
                            layout3.Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof Constraint.Delta) {
                        Constraint.Delta delta3 = (Constraint.Delta) obj;
                        if (i2 == 0) {
                            delta3.b(23, 0);
                            delta3.b(54, 2);
                        } else {
                            delta3.b(21, 0);
                            delta3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void h(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            if (i2 == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        ConstraintSet constraintSet = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = constraintSet.c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (constraintSet.b && id == -1) {
                    y.j("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        Constraint constraint = (Constraint) map2.get(Integer.valueOf(id));
                        if (constraint != null) {
                            PropertySet propertySet = constraint.b;
                            Layout layout = constraint.d;
                            Transform transform = constraint.e;
                            if (childAt instanceof Barrier) {
                                layout.h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(layout.f0);
                                barrier.setMargin(layout.g0);
                                barrier.setAllowsGoneWidget(layout.n0);
                                int[] iArr = layout.i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = layout.j0;
                                    if (str != null) {
                                        int[] iArrC = c(barrier, str);
                                        layout.i0 = iArrC;
                                        barrier.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.a();
                            constraint.a(layoutParams);
                            HashMap map3 = constraint.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                ConstraintAttribute constraintAttribute = (ConstraintAttribute) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strY = !constraintAttribute.a ? n30.y("set", str2) : str2;
                                int i3 = i2;
                                try {
                                    int iOrdinal = constraintAttribute.c.ordinal();
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iOrdinal) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strY, cls3).invoke(childAt, Integer.valueOf(constraintAttribute.d));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strY, cls2).invoke(childAt, Float.valueOf(constraintAttribute.e));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strY, cls3).invoke(childAt, Integer.valueOf(constraintAttribute.h));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strY, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(constraintAttribute.h);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder sbR = h50.r(" Custom Attribute \"", str2, "\" not found on ");
                                                sbR.append(cls.getName());
                                                Log.e("TransitionLayout", sbR.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strY);
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                StringBuilder sbR2 = h50.r(" Custom Attribute \"", str2, "\" not found on ");
                                                sbR2.append(cls.getName());
                                                Log.e("TransitionLayout", sbR2.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strY, CharSequence.class).invoke(childAt, constraintAttribute.f);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strY, Boolean.TYPE).invoke(childAt, Boolean.valueOf(constraintAttribute.g));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strY, cls2).invoke(childAt, Float.valueOf(constraintAttribute.e));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strY, cls3).invoke(childAt, Integer.valueOf(constraintAttribute.d));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    map = map3;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    map = map3;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i2 = i3;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i2;
                            childAt.setLayoutParams(layoutParams);
                            if (propertySet.b == 0) {
                                childAt.setVisibility(propertySet.a);
                            }
                            childAt.setAlpha(propertySet.c);
                            childAt.setRotation(transform.a);
                            childAt.setRotationX(transform.b);
                            childAt.setRotationY(transform.c);
                            childAt.setScaleX(transform.d);
                            childAt.setScaleY(transform.e);
                            if (transform.h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(transform.h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(transform.f)) {
                                    childAt.setPivotX(transform.f);
                                }
                                if (!Float.isNaN(transform.g)) {
                                    childAt.setPivotY(transform.g);
                                }
                            }
                            childAt.setTranslationX(transform.i);
                            childAt.setTranslationY(transform.j);
                            childAt.setTranslationZ(transform.k);
                            if (transform.l) {
                                childAt.setElevation(transform.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2 = i + 1;
                constraintSet = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            constraintSet = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            Constraint constraint2 = (Constraint) map2.get(num);
            if (constraint2 != null) {
                Layout layout2 = constraint2.d;
                if (layout2.h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = layout2.i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = layout2.j0;
                        if (str3 != null) {
                            int[] iArrC2 = c(barrier2, str3);
                            layout2.i0 = iArrC2;
                            barrier2.setReferencedIds(iArrC2);
                        }
                    }
                    barrier2.setType(layout2.f0);
                    barrier2.setMargin(layout2.g0);
                    SharedValues sharedValues = ConstraintLayout.r;
                    ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams();
                    barrier2.m();
                    constraint2.a(layoutParams2);
                    constraintLayout.addView(barrier2, layoutParams2);
                }
                if (layout2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    SharedValues sharedValues2 = ConstraintLayout.r;
                    ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams();
                    constraint2.a(layoutParams3);
                    constraintLayout.addView(guideline, layoutParams3);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).f(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        ConstraintSet constraintSet = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = constraintSet.c;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (constraintSet.b && id == -1) {
                y.j("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = (Constraint) map3.get(Integer.valueOf(id));
            if (constraint == null) {
                i = childCount;
                map = map3;
            } else {
                PropertySet propertySet = constraint.b;
                Layout layout = constraint.d;
                Transform transform = constraint.e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = constraintSet.a;
                for (String str : map5.keySet()) {
                    ConstraintAttribute constraintAttribute = (ConstraintAttribute) map5.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                e.printStackTrace();
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                e.printStackTrace();
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        map2 = map3;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                constraint.f = map4;
                constraint.b(id, layoutParams);
                propertySet.a = childAt.getVisibility();
                propertySet.c = childAt.getAlpha();
                transform.a = childAt.getRotation();
                transform.b = childAt.getRotationX();
                transform.c = childAt.getRotationY();
                transform.d = childAt.getScaleX();
                transform.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    transform.f = pivotX;
                    transform.g = pivotY;
                }
                transform.i = childAt.getTranslationX();
                transform.j = childAt.getTranslationY();
                transform.k = childAt.getTranslationZ();
                if (transform.l) {
                    transform.m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    layout.n0 = barrier.getAllowsGoneWidget();
                    layout.i0 = barrier.getReferencedIds();
                    layout.f0 = barrier.getType();
                    layout.g0 = barrier.getMargin();
                }
            }
            i2++;
            constraintSet = this;
            childCount = i;
            map3 = map;
        }
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        Constraint constraintD = d(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            constraintD.d.a = true;
                        }
                        this.c.put(Integer.valueOf(constraintD.a), constraintD);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
