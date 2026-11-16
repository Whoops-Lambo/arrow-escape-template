package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ConstraintLayout extends ViewGroup {
    public static SharedValues r;
    public final SparseArray a;
    public final ArrayList b;
    public final ConstraintWidgetContainer c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public ConstraintSet j;
    public ConstraintLayoutStates k;
    public int l;
    public HashMap m;
    public final SparseArray n;
    public final Measurer o;
    public int p;
    public int q;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;
        public final boolean d;
        public boolean d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public float m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public ConstraintWidget q0;
        public float r;
        public int s;
        public int t;
        public int u;
        public int v;
        public final int w;
        public int x;
        public final int y;
        public int z;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class Table {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 66);
            }
        }

        public final void a() {
            this.d0 = false;
            this.a0 = true;
            this.b0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.X) {
                this.b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.a0 = false;
                if (i == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.b0 = false;
                if (i2 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.d0 = true;
            this.a0 = true;
            this.b0 = true;
            if (!(this.q0 instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                this.q0 = new androidx.constraintlayout.core.widgets.Guideline();
            }
            ((androidx.constraintlayout.core.widgets.Guideline) this.q0).T(this.V);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x0051  */
        /* JADX WARN: Code duplicated, block: B:22:0x0058  */
        /* JADX WARN: Code duplicated, block: B:25:0x005e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0064  */
        /* JADX WARN: Code duplicated, block: B:37:0x007a  */
        /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x0084  */
        /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public final void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.i0 = -1;
            this.j0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.k0 = this.w;
            this.l0 = this.y;
            float f = this.E;
            this.m0 = f;
            int i8 = this.a;
            this.n0 = i8;
            int i9 = this.b;
            this.o0 = i9;
            float f2 = this.c;
            this.p0 = f2;
            int i10 = this.s;
            if (z2) {
                if (i10 != -1) {
                    this.i0 = i10;
                } else {
                    int i11 = this.t;
                    if (i11 != -1) {
                        this.j0 = i11;
                    } else {
                        i2 = this.u;
                        if (i2 != -1) {
                            this.h0 = i2;
                            z = true;
                        }
                        i3 = this.v;
                        if (i3 != -1) {
                            this.g0 = i3;
                            z = true;
                        }
                        i4 = this.A;
                        if (i4 != Integer.MIN_VALUE) {
                            this.l0 = i4;
                        }
                        i5 = this.B;
                        if (i5 != Integer.MIN_VALUE) {
                            this.k0 = i5;
                        }
                        if (z) {
                            this.m0 = 1.0f - f;
                        }
                        if (this.d0 && this.V == 1 && this.d) {
                            if (f2 != -1.0f) {
                                this.p0 = 1.0f - f2;
                                this.n0 = -1;
                                this.o0 = -1;
                            } else if (i8 != -1) {
                                this.o0 = i8;
                                this.n0 = -1;
                                this.p0 = -1.0f;
                            } else if (i9 != -1) {
                                this.n0 = i9;
                                this.o0 = -1;
                                this.p0 = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.u;
                if (i2 != -1) {
                    this.h0 = i2;
                    z = true;
                }
                i3 = this.v;
                if (i3 != -1) {
                    this.g0 = i3;
                    z = true;
                }
                i4 = this.A;
                if (i4 != Integer.MIN_VALUE) {
                    this.l0 = i4;
                }
                i5 = this.B;
                if (i5 != Integer.MIN_VALUE) {
                    this.k0 = i5;
                }
                if (z) {
                    this.m0 = 1.0f - f;
                }
                if (this.d0) {
                    if (f2 != -1.0f) {
                        this.p0 = 1.0f - f2;
                        this.n0 = -1;
                        this.o0 = -1;
                    } else if (i8 != -1) {
                        this.o0 = i8;
                        this.n0 = -1;
                        this.p0 = -1.0f;
                    } else if (i9 != -1) {
                        this.n0 = i9;
                        this.o0 = -1;
                        this.p0 = -1.0f;
                    }
                }
            } else {
                if (i10 != -1) {
                    this.h0 = i10;
                }
                int i12 = this.t;
                if (i12 != -1) {
                    this.g0 = i12;
                }
                int i13 = this.u;
                if (i13 != -1) {
                    this.i0 = i13;
                }
                int i14 = this.v;
                if (i14 != -1) {
                    this.j0 = i14;
                }
                int i15 = this.A;
                if (i15 != Integer.MIN_VALUE) {
                    this.k0 = i15;
                }
                int i16 = this.B;
                if (i16 != Integer.MIN_VALUE) {
                    this.l0 = i16;
                }
            }
            if (this.u == -1 && this.v == -1 && this.t == -1 && i10 == -1) {
                int i17 = this.g;
                if (i17 != -1) {
                    this.i0 = i17;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i18 = this.h;
                    if (i18 != -1) {
                        this.j0 = i18;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i19 = this.e;
                if (i19 != -1) {
                    this.g0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i20 = this.f;
                if (i20 != -1) {
                    this.h0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ConstraintWidget();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = Table.a.get(index);
                switch (i2) {
                    case 1:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.r = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 23:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = typedArrayObtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.L = i3;
                        if (i3 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.M = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                        break;
                    case 35:
                        this.R = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, typedArrayObtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                        break;
                    case 38:
                        this.S = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, typedArrayObtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                ConstraintSet.h(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = typedArrayObtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        ConstraintSet.g(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        ConstraintSet.g(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public LayoutParams() {
            super(-2, -2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ConstraintWidget();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ConstraintWidget();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class Measurer implements BasicMeasure.Measurer {
        public final ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public static boolean c(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        public final void a() {
            ConstraintLayout constraintLayout = this.a;
            ArrayList arrayList = constraintLayout.b;
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) childAt;
                    if (placeholder.b != null) {
                        LayoutParams layoutParams = (LayoutParams) placeholder.getLayoutParams();
                        LayoutParams layoutParams2 = (LayoutParams) placeholder.b.getLayoutParams();
                        ConstraintWidget constraintWidget = layoutParams2.q0;
                        constraintWidget.i0 = 0;
                        ConstraintWidget constraintWidget2 = layoutParams.q0;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.U[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.a;
                        if (dimensionBehaviour != dimensionBehaviour2) {
                            constraintWidget2.P(constraintWidget.r());
                        }
                        ConstraintWidget constraintWidget3 = layoutParams.q0;
                        if (constraintWidget3.U[1] != dimensionBehaviour2) {
                            constraintWidget3.M(layoutParams2.q0.l());
                        }
                        layoutParams2.q0.i0 = 8;
                    }
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) arrayList.get(i2)).getClass();
                }
            }
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        public final void b(ConstraintWidget constraintWidget, BasicMeasure.Measure measure) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMax;
            int iMax2;
            boolean z;
            int baseline;
            int i;
            if (constraintWidget == null) {
                return;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.L;
            ConstraintAnchor constraintAnchor2 = constraintWidget.J;
            if (constraintWidget.i0 == 8 && !constraintWidget.F) {
                measure.e = 0;
                measure.f = 0;
                measure.g = 0;
                return;
            }
            if (constraintWidget.V == null) {
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.b;
            int i2 = measure.c;
            int i3 = measure.d;
            int i4 = this.b + this.c;
            int i5 = this.d;
            View view = constraintWidget.h0;
            int iOrdinal = dimensionBehaviour.ordinal();
            if (iOrdinal == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else if (iOrdinal == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
            } else if (iOrdinal == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
                boolean z2 = constraintWidget.r == 1;
                int i6 = measure.j;
                if (i6 == 1 || i6 == 2) {
                    boolean z3 = view.getMeasuredHeight() == constraintWidget.l();
                    if (measure.j == 2 || !z2 || ((z2 && z3) || (view instanceof Placeholder) || constraintWidget.B())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.r(), 1073741824);
                    }
                }
            } else if (iOrdinal != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i7 = this.f;
                int i8 = constraintAnchor2 != null ? constraintAnchor2.g : 0;
                if (constraintAnchor != null) {
                    i8 += constraintAnchor.g;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
            }
            int iOrdinal2 = dimensionBehaviour2.ordinal();
            if (iOrdinal2 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (iOrdinal2 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
            } else if (iOrdinal2 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
                boolean z4 = constraintWidget.s == 1;
                int i9 = measure.j;
                if (i9 == 1 || i9 == 2) {
                    boolean z5 = view.getMeasuredWidth() == constraintWidget.r();
                    if (measure.j == 2 || !z4 || ((z4 && z5) || (view instanceof Placeholder) || constraintWidget.C())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.l(), 1073741824);
                    }
                }
            } else if (iOrdinal2 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i10 = this.g;
                int i11 = constraintAnchor2 != null ? constraintWidget.K.g : 0;
                if (constraintAnchor != null) {
                    i11 += constraintWidget.M.g;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, i4 + i11, -1);
            }
            ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.V;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (constraintWidgetContainer != null && Optimizer.b(constraintLayout.i, 256) && view.getMeasuredWidth() == constraintWidget.r() && view.getMeasuredWidth() < constraintWidgetContainer.r() && view.getMeasuredHeight() == constraintWidget.l() && view.getMeasuredHeight() < constraintWidgetContainer.l() && view.getBaseline() == constraintWidget.c0 && !constraintWidget.A() && c(constraintWidget.H, iMakeMeasureSpec, constraintWidget.r()) && c(constraintWidget.I, iMakeMeasureSpec2, constraintWidget.l())) {
                measure.e = constraintWidget.r();
                measure.f = constraintWidget.l();
                measure.g = constraintWidget.c0;
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.c;
            boolean z6 = dimensionBehaviour == dimensionBehaviour3;
            boolean z7 = dimensionBehaviour2 == dimensionBehaviour3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.d;
            boolean z8 = dimensionBehaviour2 == dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour4;
            boolean z9 = dimensionBehaviour == dimensionBehaviour5 || dimensionBehaviour == dimensionBehaviour4;
            boolean z10 = z6 && constraintWidget.Y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            boolean z11 = z7 && constraintWidget.Y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (view == null) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i12 = measure.j;
            if (i12 != 1 && i12 != 2 && z6 && constraintWidget.r == 0 && z7 && constraintWidget.s == 0) {
                i = -1;
                z = false;
                baseline = 0;
                iMax = 0;
                iMax2 = 0;
            } else {
                if ((view instanceof VirtualLayout) && (constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) {
                    ((VirtualLayout) view).n((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                constraintWidget.H = iMakeMeasureSpec;
                constraintWidget.I = iMakeMeasureSpec2;
                constraintWidget.g = false;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i13 = constraintWidget.u;
                iMax = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
                int i14 = constraintWidget.v;
                if (i14 > 0) {
                    iMax = Math.min(i14, iMax);
                }
                int i15 = constraintWidget.x;
                iMax2 = i15 > 0 ? Math.max(i15, measuredHeight) : measuredHeight;
                int i16 = iMakeMeasureSpec2;
                int i17 = constraintWidget.y;
                if (i17 > 0) {
                    iMax2 = Math.min(i17, iMax2);
                }
                if (!Optimizer.b(constraintLayout.i, 1)) {
                    if (z10 && z8) {
                        iMax = (int) ((iMax2 * constraintWidget.Y) + 0.5f);
                    } else if (z11 && z9) {
                        iMax2 = (int) ((iMax / constraintWidget.Y) + 0.5f);
                    }
                }
                if (measuredWidth == iMax && measuredHeight == iMax2) {
                    baseline = baseline2;
                    i = -1;
                    z = false;
                } else {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i16;
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    constraintWidget.H = iMakeMeasureSpec;
                    constraintWidget.I = iMakeMeasureSpec3;
                    z = false;
                    constraintWidget.g = false;
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMax = measuredWidth2;
                    iMax2 = measuredHeight2;
                    i = -1;
                }
            }
            boolean z12 = baseline != i ? true : z;
            measure.i = (iMax == measure.c && iMax2 == measure.d) ? z : true;
            boolean z13 = layoutParams.c0 ? true : z12;
            if (z13 && baseline != -1 && constraintWidget.c0 != baseline) {
                measure.i = true;
            }
            measure.e = iMax;
            measure.f = iMax2;
            measure.h = z13;
            measure.g = baseline;
        }

        public Measurer(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static SharedValues getSharedValues() {
        if (r == null) {
            SharedValues sharedValues = new SharedValues();
            new SparseIntArray();
            sharedValues.a = new HashMap();
            r = sharedValues;
        }
        return r;
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    public final ConstraintWidget b(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).q0;
        }
        view.setLayoutParams(new LayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).q0;
        }
        return null;
    }

    public final void c(AttributeSet attributeSet, int i) {
        ConstraintWidgetContainer constraintWidgetContainer = this.c;
        constraintWidgetContainer.h0 = this;
        Measurer measurer = this.o;
        constraintWidgetContainer.v0 = measurer;
        constraintWidgetContainer.t0.f = measurer;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 15) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 113) {
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            e(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.j = constraintSet;
                        constraintSet.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        constraintWidgetContainer.E0 = this.i;
        LinearSystem.p = constraintWidgetContainer.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((ConstraintHelper) arrayList.get(i)).l(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void e(int i) {
        this.k = new ConstraintLayoutStates(getContext(), this, i);
    }

    public final void f(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        Measurer measurer = this.o;
        int i5 = measurer.e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + measurer.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.g, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    public final void g(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray sparseArray, int i, ConstraintAnchor.Type type) {
        View view = (View) this.a.get(i);
        ConstraintWidget constraintWidget2 = (ConstraintWidget) sparseArray.get(i);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.c0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.e;
        if (type == type2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.c0 = true;
            layoutParams2.q0.E = true;
        }
        constraintWidget.j(type2).b(constraintWidget2.j(type), layoutParams.D, layoutParams.C, true);
        constraintWidget.E = true;
        constraintWidget.j(ConstraintAnchor.Type.b).j();
        constraintWidget.j(ConstraintAnchor.Type.d).j();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.E0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        ConstraintWidgetContainer constraintWidgetContainer = this.c;
        if (constraintWidgetContainer.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                constraintWidgetContainer.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                constraintWidgetContainer.j = "parent";
            }
        }
        if (constraintWidgetContainer.j0 == null) {
            constraintWidgetContainer.j0 = constraintWidgetContainer.j;
            Log.v("ConstraintLayout", " setDebugName " + constraintWidgetContainer.j0);
        }
        ArrayList arrayList = constraintWidgetContainer.r0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ConstraintWidget constraintWidget = (ConstraintWidget) obj;
            View view = constraintWidget.h0;
            if (view != null) {
                if (constraintWidget.j == null && (id = view.getId()) != -1) {
                    constraintWidget.j = getContext().getResources().getResourceEntryName(id);
                }
                if (constraintWidget.j0 == null) {
                    constraintWidget.j0 = constraintWidget.j;
                    Log.v("ConstraintLayout", " setDebugName " + constraintWidget.j0);
                }
            }
        }
        constraintWidgetContainer.o(sb);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:130:0x0240  */
    /* JADX WARN: Code duplicated, block: B:180:0x038a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0394  */
    /* JADX WARN: Code duplicated, block: B:183:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:192:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:194:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:195:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:196:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:203:0x040a  */
    /* JADX WARN: Code duplicated, block: B:205:0x0413  */
    /* JADX WARN: Code duplicated, block: B:207:0x0422  */
    /* JADX WARN: Code duplicated, block: B:214:0x0441  */
    /* JADX WARN: Code duplicated, block: B:215:0x0457  */
    /* JADX WARN: Code duplicated, block: B:217:0x0466  */
    /* JADX WARN: Code duplicated, block: B:218:0x0475  */
    /* JADX WARN: Code duplicated, block: B:220:0x0480  */
    /* JADX WARN: Code duplicated, block: B:223:0x0487  */
    /* JADX WARN: Code duplicated, block: B:226:0x048f  */
    /* JADX WARN: Code duplicated, block: B:249:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:251:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:253:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:254:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:256:0x0512  */
    /* JADX WARN: Code duplicated, block: B:257:0x051a  */
    /* JADX WARN: Code duplicated, block: B:259:0x052a  */
    /* JADX WARN: Code duplicated, block: B:264:0x0537  */
    /* JADX WARN: Code duplicated, block: B:300:0x05c4 A[PHI: r29
  0x05c4: PHI (r29v10 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
  (r29v9 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
  (r29v12 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
  (r29v12 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
  (r29v12 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
  (r29v12 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
  (r29v12 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
 binds: [B:297:0x05bd, B:283:0x058c, B:285:0x0592, B:641:0x05c4, B:287:0x059e, B:289:0x05a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:303:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:312:0x0601  */
    /* JADX WARN: Code duplicated, block: B:319:0x0618  */
    /* JADX WARN: Code duplicated, block: B:322:0x0629  */
    /* JADX WARN: Code duplicated, block: B:361:0x0722 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:362:0x0724  */
    /* JADX WARN: Code duplicated, block: B:364:0x0728  */
    /* JADX WARN: Code duplicated, block: B:365:0x0730  */
    /* JADX WARN: Code duplicated, block: B:366:0x0740 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:367:0x0742  */
    /* JADX WARN: Code duplicated, block: B:368:0x0751  */
    /* JADX WARN: Code duplicated, block: B:370:0x0758  */
    /* JADX WARN: Code duplicated, block: B:372:0x075d  */
    /* JADX WARN: Code duplicated, block: B:373:0x0765  */
    /* JADX WARN: Code duplicated, block: B:376:0x0773  */
    /* JADX WARN: Code duplicated, block: B:378:0x0779  */
    /* JADX WARN: Code duplicated, block: B:384:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:385:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:388:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:389:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:392:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:396:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:398:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:400:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:402:0x080b  */
    /* JADX WARN: Code duplicated, block: B:404:0x0810  */
    /* JADX WARN: Code duplicated, block: B:407:0x0817  */
    /* JADX WARN: Code duplicated, block: B:408:0x0819  */
    /* JADX WARN: Code duplicated, block: B:410:0x081c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:414:0x0828  */
    /* JADX WARN: Code duplicated, block: B:417:0x082f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:419:0x0836  */
    /* JADX WARN: Code duplicated, block: B:432:0x0856 A[PHI: r1
  0x0856: PHI (r1v7 boolean) = (r1v6 boolean), (r1v81 boolean) binds: [B:397:0x07f0, B:678:0x0856] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:434:0x085c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:435:0x085e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:440:0x0867  */
    /* JADX WARN: Code duplicated, block: B:442:0x0882  */
    /* JADX WARN: Code duplicated, block: B:444:0x0888  */
    /* JADX WARN: Code duplicated, block: B:446:0x0891  */
    /* JADX WARN: Code duplicated, block: B:447:0x0893  */
    /* JADX WARN: Code duplicated, block: B:449:0x0896  */
    /* JADX WARN: Code duplicated, block: B:451:0x089c  */
    /* JADX WARN: Code duplicated, block: B:454:0x08a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:456:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:458:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:460:0x08c6 A[LOOP:15: B:459:0x08c4->B:460:0x08c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:462:0x091f  */
    /* JADX WARN: Code duplicated, block: B:465:0x093f  */
    /* JADX WARN: Code duplicated, block: B:466:0x0946  */
    /* JADX WARN: Code duplicated, block: B:468:0x094a  */
    /* JADX WARN: Code duplicated, block: B:470:0x0954 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:471:0x0956  */
    /* JADX WARN: Code duplicated, block: B:472:0x0958  */
    /* JADX WARN: Code duplicated, block: B:474:0x095b  */
    /* JADX WARN: Code duplicated, block: B:475:0x095d  */
    /* JADX WARN: Code duplicated, block: B:477:0x0962  */
    /* JADX WARN: Code duplicated, block: B:479:0x096c  */
    /* JADX WARN: Code duplicated, block: B:481:0x096f  */
    /* JADX WARN: Code duplicated, block: B:483:0x0973  */
    /* JADX WARN: Code duplicated, block: B:485:0x0984  */
    /* JADX WARN: Code duplicated, block: B:487:0x0990  */
    /* JADX WARN: Code duplicated, block: B:488:0x0997  */
    /* JADX WARN: Code duplicated, block: B:506:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:512:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:514:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a02 A[PHI: r1
  0x0a02: PHI (r1v42 boolean) = (r1v41 boolean), (r1v41 boolean), (r1v41 boolean), (r1v45 boolean) binds: [B:513:0x09d3, B:515:0x09d9, B:517:0x09dd, B:533:0x09ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:540:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:541:0x0a12  */
    /* JADX WARN: Code duplicated, block: B:544:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:547:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:549:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:551:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:553:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:556:0x0a42  */
    /* JADX WARN: Code duplicated, block: B:557:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a5f  */
    /* JADX WARN: Code duplicated, block: B:562:0x0a69  */
    /* JADX WARN: Code duplicated, block: B:563:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:565:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:567:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:570:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:572:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:574:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:576:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:579:0x0aea  */
    /* JADX WARN: Code duplicated, block: B:581:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:587:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:589:0x0b1c  */
    /* JADX WARN: Code duplicated, block: B:591:0x0b2a  */
    /* JADX WARN: Code duplicated, block: B:595:0x0b34  */
    /* JADX WARN: Code duplicated, block: B:601:0x0b42 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:609:0x0b59 A[PHI: r19
  0x0b59: PHI (r19v3 int) = (r19v1 int), (r19v1 int), (r19v1 int), (r19v4 int) binds: [B:599:0x0b3f, B:608:0x0b57, B:605:0x0b52, B:594:0x0b2f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:612:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:615:0x0b87  */
    /* JADX WARN: Code duplicated, block: B:617:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:622:0x0bac  */
    /* JADX WARN: Code duplicated, block: B:624:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:630:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:636:0x0bf1 A[LOOP:13: B:585:0x0b12->B:636:0x0bf1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:678:0x0856 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0bfe A[EDGE_INSN: B:691:0x0bfe->B:637:0x0bfe BREAK  A[LOOP:13: B:585:0x0b12->B:636:0x0bf1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0bfe A[EDGE_INSN: B:692:0x0bfe->B:637:0x0bfe BREAK  A[LOOP:13: B:585:0x0b12->B:636:0x0bf1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:0x0bd8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        int i3;
        int iMax;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        int i4;
        ConstraintAnchor.Type type3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        int iMax2;
        int iR;
        DependencyGraph dependencyGraph;
        char c;
        int i5;
        int i6;
        ConstraintWidgetContainer constraintWidgetContainer;
        ArrayList arrayList;
        BasicMeasure.Measurer measurer;
        int size;
        int iR2;
        int iL;
        boolean zB;
        boolean z;
        boolean z2;
        int i7;
        boolean z3;
        boolean z4;
        BasicMeasure.Measurer measurer2;
        int i8;
        boolean zF;
        int i9;
        int size2;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7;
        int i10;
        int i11;
        int iMax3;
        int iMax4;
        int i12;
        int i13;
        int i14;
        int i15;
        ConstraintAnchor.Type type4;
        ConstraintAnchor.Type type5;
        int i16;
        BasicMeasure.Measurer measurer3;
        int iMax5;
        int i17;
        int i18;
        int i19;
        int i20;
        ArrayList arrayList2;
        ConstraintWidget constraintWidget;
        int i21;
        int iR3;
        int iL2;
        ArrayList arrayList3;
        BasicMeasure.Measurer measurer4;
        int iR4;
        int i22;
        int iL3;
        ConstraintWidget constraintWidget2;
        int iR5;
        int iL4;
        int i23;
        int i24;
        BasicMeasure.Measurer measurer5;
        int iR6;
        int i25;
        int iL5;
        ConstraintAnchor.Type type6;
        ConstraintAnchor.Type type7;
        int i26;
        int i27;
        int size3;
        BasicMeasure.Measurer measurer6;
        int i28;
        ConstraintWidget constraintWidget3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourK;
        int i29;
        boolean z5;
        HorizontalWidgetRun horizontalWidgetRun;
        VerticalWidgetRun verticalWidgetRun;
        int iMin;
        int iMin2;
        int i30;
        boolean z6;
        ConstraintWidgetContainer constraintWidgetContainer2;
        int i31;
        int i32;
        ArrayList arrayList4;
        int size4;
        int i33;
        boolean z7;
        boolean z8;
        int i34;
        boolean z9;
        ConstraintWidget constraintWidget4;
        int i35;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2;
        boolean z10;
        boolean z11;
        boolean z12;
        byte b;
        int i36;
        int i37;
        int i38;
        ConstraintAnchor.Type type8;
        ConstraintWidget constraintWidget5;
        ConstraintAnchor.Type type9;
        ConstraintWidget constraintWidget6;
        ConstraintAnchor.Type type10;
        int i39;
        ConstraintAnchor.Type type11;
        int i40;
        ConstraintWidget constraintWidget7;
        int i41;
        int i42;
        ConstraintWidget constraintWidget8;
        LayoutParams layoutParams;
        int i43;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour10;
        float f;
        ConstraintAnchor.Type type12;
        int i44;
        int i45;
        ConstraintAnchor.Type type13;
        ConstraintWidget constraintWidget9;
        ConstraintAnchor.Type type14;
        float f2;
        ConstraintWidget constraintWidget10;
        ConstraintWidget constraintWidget11;
        ConstraintWidget constraintWidget12;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour12;
        SparseArray sparseArray;
        String str;
        int i46;
        int i47;
        float f3;
        int i48;
        int i49;
        float f4;
        int i50;
        int i51;
        float fAbs;
        int i52;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour13;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour14;
        int i53;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour15;
        boolean z13;
        ConstraintWidget constraintWidget13;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.p == i) {
            int i54 = constraintLayout.q;
        }
        boolean z14 = true;
        if (!constraintLayout.h) {
            int childCount = constraintLayout.getChildCount();
            for (int i55 = 0; i55 < childCount; i55++) {
                if (constraintLayout.getChildAt(i55).isLayoutRequested()) {
                    constraintLayout.h = true;
                    break;
                }
            }
        }
        constraintLayout.p = i;
        constraintLayout.q = i2;
        boolean zD = constraintLayout.d();
        ConstraintWidgetContainer constraintWidgetContainer3 = constraintLayout.c;
        constraintWidgetContainer3.w0 = zD;
        BasicMeasure basicMeasure = constraintWidgetContainer3.s0;
        boolean z15 = constraintLayout.h;
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.d;
        ConstraintAnchor.Type type16 = ConstraintAnchor.Type.c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = ConstraintWidget.DimensionBehaviour.b;
        if (z15) {
            constraintLayout.h = false;
            int childCount2 = constraintLayout.getChildCount();
            int i56 = 0;
            while (true) {
                if (i56 >= childCount2) {
                    b = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i56).isLayoutRequested()) {
                        b = true;
                        break;
                    }
                    i56++;
                }
            }
            if (b == true) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i57 = 0; i57 < childCount3; i57++) {
                    ConstraintWidget constraintWidgetB = constraintLayout.b(constraintLayout.getChildAt(i57));
                    if (constraintWidgetB != null) {
                        constraintWidgetB.D();
                    }
                }
                if (zIsInEditMode) {
                    int i58 = 0;
                    i36 = 2;
                    while (i58 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i58);
                        try {
                            z13 = z14;
                            try {
                                String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                                Integer numValueOf = Integer.valueOf(childAt.getId());
                                if (resourceName != null) {
                                    if (constraintLayout.m == null) {
                                        constraintLayout.m = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout.m.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                }
                                int iIndexOf2 = resourceName.indexOf(47);
                                if (iIndexOf2 != -1) {
                                    resourceName = resourceName.substring(iIndexOf2 + 1);
                                }
                                int id = childAt.getId();
                                if (id != 0) {
                                    View viewFindViewById = (View) constraintLayout.a.get(id);
                                    if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                        constraintLayout.onViewAdded(viewFindViewById);
                                    }
                                    constraintWidget13 = viewFindViewById == constraintLayout ? constraintWidgetContainer3 : viewFindViewById == null ? null : ((LayoutParams) viewFindViewById.getLayoutParams()).q0;
                                }
                                constraintWidget13.j0 = resourceName;
                            } catch (Resources.NotFoundException unused) {
                            }
                        } catch (Resources.NotFoundException unused2) {
                            z13 = z14;
                        }
                        i58++;
                        z14 = z13;
                    }
                } else {
                    i36 = 2;
                }
                boolean z16 = z14;
                if (constraintLayout.l != -1) {
                    for (int i59 = 0; i59 < childCount3; i59++) {
                        View childAt2 = constraintLayout.getChildAt(i59);
                        if (childAt2.getId() == constraintLayout.l && (childAt2 instanceof Constraints)) {
                            constraintLayout.j = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                ConstraintSet constraintSet = constraintLayout.j;
                if (constraintSet != null) {
                    constraintSet.a(constraintLayout);
                }
                constraintWidgetContainer3.r0.clear();
                ArrayList arrayList5 = constraintLayout.b;
                int size5 = arrayList5.size();
                if (size5 > 0) {
                    int i60 = 0;
                    while (i60 < size5) {
                        ConstraintHelper constraintHelper = (ConstraintHelper) arrayList5.get(i60);
                        HashMap map = constraintHelper.h;
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.e);
                        }
                        HelperWidget helperWidget = constraintHelper.d;
                        if (helperWidget == null) {
                            dimensionBehaviour13 = dimensionBehaviour16;
                            dimensionBehaviour14 = dimensionBehaviour17;
                        } else {
                            helperWidget.s0 = 0;
                            Arrays.fill(helperWidget.r0, (Object) null);
                            int i61 = 0;
                            while (i61 < constraintHelper.b) {
                                int i62 = constraintHelper.a[i61];
                                View viewA = constraintLayout.a(i62);
                                if (viewA == null) {
                                    String str2 = (String) map.get(Integer.valueOf(i62));
                                    i53 = i61;
                                    int iG = constraintHelper.g(constraintLayout, str2);
                                    dimensionBehaviour15 = dimensionBehaviour16;
                                    if (iG != 0) {
                                        constraintHelper.a[i53] = iG;
                                        map.put(Integer.valueOf(iG), str2);
                                        viewA = constraintLayout.a(iG);
                                    }
                                } else {
                                    i53 = i61;
                                    dimensionBehaviour15 = dimensionBehaviour16;
                                }
                                View view = viewA;
                                if (view != null) {
                                    HelperWidget helperWidget2 = constraintHelper.d;
                                    ConstraintWidget constraintWidgetB2 = constraintLayout.b(view);
                                    helperWidget2.getClass();
                                    if (constraintWidgetB2 != helperWidget2 && constraintWidgetB2 != null) {
                                        int i63 = helperWidget2.s0 + 1;
                                        ConstraintWidget[] constraintWidgetArr = helperWidget2.r0;
                                        if (i63 > constraintWidgetArr.length) {
                                            helperWidget2.r0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
                                        }
                                        ConstraintWidget[] constraintWidgetArr2 = helperWidget2.r0;
                                        int i64 = helperWidget2.s0;
                                        constraintWidgetArr2[i64] = constraintWidgetB2;
                                        helperWidget2.s0 = i64 + 1;
                                    }
                                }
                                i61 = i53 + 1;
                                dimensionBehaviour16 = dimensionBehaviour15;
                                dimensionBehaviour17 = dimensionBehaviour17;
                            }
                            dimensionBehaviour13 = dimensionBehaviour16;
                            dimensionBehaviour14 = dimensionBehaviour17;
                            constraintHelper.d.a();
                        }
                        i60++;
                        arrayList5 = arrayList5;
                        dimensionBehaviour16 = dimensionBehaviour13;
                        dimensionBehaviour17 = dimensionBehaviour14;
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviour16;
                dimensionBehaviour = dimensionBehaviour17;
                int i65 = 0;
                while (i65 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i65);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.a == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.c);
                        }
                        View viewFindViewById2 = constraintLayout.findViewById(placeholder.a);
                        placeholder.b = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((LayoutParams) viewFindViewById2.getLayoutParams()).f0 = z16;
                            placeholder.b.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                    i65++;
                    z16 = true;
                }
                SparseArray sparseArray2 = constraintLayout.n;
                sparseArray2.clear();
                sparseArray2.put(0, constraintWidgetContainer3);
                sparseArray2.put(constraintLayout.getId(), constraintWidgetContainer3);
                for (int i66 = 0; i66 < childCount3; i66++) {
                    View childAt4 = constraintLayout.getChildAt(i66);
                    sparseArray2.put(childAt4.getId(), constraintLayout.b(childAt4));
                }
                int i67 = 0;
                while (i67 < childCount3) {
                    View childAt5 = constraintLayout.getChildAt(i67);
                    ConstraintWidget constraintWidgetB3 = constraintLayout.b(childAt5);
                    if (constraintWidgetB3 == null) {
                        i38 = childCount3;
                        sparseArray = sparseArray2;
                        dimensionBehaviour12 = dimensionBehaviour18;
                        i37 = i67;
                        type13 = type15;
                        type12 = type16;
                        i48 = i36;
                        dimensionBehaviour11 = dimensionBehaviour19;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) childAt5.getLayoutParams();
                        constraintWidgetContainer3.r0.add(constraintWidgetB3);
                        ConstraintWidget constraintWidget14 = constraintWidgetB3.V;
                        if (constraintWidget14 != null) {
                            ((WidgetContainer) constraintWidget14).r0.remove(constraintWidgetB3);
                            constraintWidgetB3.D();
                        }
                        constraintWidgetB3.V = constraintWidgetContainer3;
                        layoutParams2.a();
                        constraintWidgetB3.i0 = childAt5.getVisibility();
                        if (layoutParams2.f0) {
                            constraintWidgetB3.F = true;
                            constraintWidgetB3.i0 = 8;
                        }
                        constraintWidgetB3.h0 = childAt5;
                        if (childAt5 instanceof ConstraintHelper) {
                            ((ConstraintHelper) childAt5).j(constraintWidgetB3, constraintWidgetContainer3.w0);
                        }
                        if (layoutParams2.d0) {
                            androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidgetB3;
                            int i68 = layoutParams2.n0;
                            int i69 = layoutParams2.o0;
                            float f5 = layoutParams2.p0;
                            if (f5 != -1.0f) {
                                if (f5 > -1.0f) {
                                    guideline.r0 = f5;
                                    guideline.s0 = -1;
                                    guideline.t0 = -1;
                                }
                            } else if (i68 != -1) {
                                if (i68 > -1) {
                                    guideline.r0 = -1.0f;
                                    guideline.s0 = i68;
                                    guideline.t0 = -1;
                                }
                            } else if (i69 != -1 && i69 > -1) {
                                guideline.r0 = -1.0f;
                                guideline.s0 = -1;
                                guideline.t0 = i69;
                            }
                            i38 = childCount3;
                            sparseArray = sparseArray2;
                            dimensionBehaviour12 = dimensionBehaviour18;
                            i37 = i67;
                            type13 = type15;
                            type12 = type16;
                            i48 = i36;
                            dimensionBehaviour11 = dimensionBehaviour19;
                        } else {
                            int i70 = layoutParams2.g0;
                            int i71 = layoutParams2.h0;
                            int i72 = layoutParams2.i0;
                            int i73 = layoutParams2.j0;
                            int i74 = layoutParams2.k0;
                            int i75 = layoutParams2.l0;
                            i37 = i67;
                            float f6 = layoutParams2.m0;
                            int i76 = layoutParams2.p;
                            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.a;
                            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.b;
                            i38 = childCount3;
                            int i77 = -1;
                            if (i76 != -1) {
                                ConstraintWidget constraintWidget15 = (ConstraintWidget) sparseArray2.get(i76);
                                if (constraintWidget15 != null) {
                                    float f7 = layoutParams2.r;
                                    int i78 = layoutParams2.q;
                                    ConstraintAnchor.Type type19 = ConstraintAnchor.Type.f;
                                    constraintWidgetB3.w(type19, constraintWidget15, type19, i78, 0);
                                    constraintWidgetB3.D = f7;
                                }
                                constraintLayout = this;
                                layoutParams = layoutParams2;
                                dimensionBehaviour8 = dimensionBehaviour18;
                                constraintWidget9 = constraintWidgetB3;
                                type13 = type15;
                                type12 = type16;
                                type9 = type17;
                                dimensionBehaviour9 = dimensionBehaviour19;
                                dimensionBehaviour10 = dimensionBehaviour;
                                type14 = type18;
                                i77 = -1;
                                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            } else {
                                if (i70 != -1) {
                                    ConstraintWidget constraintWidget16 = (ConstraintWidget) sparseArray2.get(i70);
                                    if (constraintWidget16 != null) {
                                        type8 = type17;
                                        constraintWidgetB3.w(type8, constraintWidget16, type17, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, i74);
                                    } else {
                                        type8 = type17;
                                    }
                                } else {
                                    type8 = type17;
                                    if (i71 != -1 && (constraintWidget5 = (ConstraintWidget) sparseArray2.get(i71)) != null) {
                                        ConstraintAnchor.Type type20 = type16;
                                        constraintWidgetB3.w(type8, constraintWidget5, type20, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, i74);
                                        type16 = type20;
                                    }
                                    if (i72 != i77) {
                                        constraintWidget12 = (ConstraintWidget) sparseArray2.get(i72);
                                        if (constraintWidget12 != null) {
                                            ConstraintAnchor.Type type21 = type8;
                                            constraintWidgetB3.w(type16, constraintWidget12, type21, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, i75);
                                            type9 = type21;
                                        } else {
                                            type9 = type8;
                                        }
                                    } else {
                                        type9 = type8;
                                        if (i73 != i77 && (constraintWidget6 = (ConstraintWidget) sparseArray2.get(i73)) != null) {
                                            constraintWidgetB3.w(type16, constraintWidget6, type16, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, i75);
                                        }
                                    }
                                    type10 = type16;
                                    i39 = layoutParams2.i;
                                    if (i39 != i77) {
                                        constraintWidget11 = (ConstraintWidget) sparseArray2.get(i39);
                                        if (constraintWidget11 != null) {
                                            type11 = type18;
                                            constraintWidgetB3.w(type11, constraintWidget11, type18, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, layoutParams2.x);
                                        } else {
                                            type11 = type18;
                                        }
                                    } else {
                                        type11 = type18;
                                        i40 = layoutParams2.j;
                                        if (i40 != i77 && (constraintWidget7 = (ConstraintWidget) sparseArray2.get(i40)) != null) {
                                            ConstraintAnchor.Type type22 = type15;
                                            constraintWidgetB3.w(type11, constraintWidget7, type22, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, layoutParams2.x);
                                            type15 = type22;
                                        }
                                    }
                                    i41 = layoutParams2.k;
                                    if (i41 != i77) {
                                        constraintWidget10 = (ConstraintWidget) sparseArray2.get(i41);
                                        if (constraintWidget10 != null) {
                                            constraintWidgetB3.w(type15, constraintWidget10, type11, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, layoutParams2.z);
                                        }
                                    } else {
                                        i42 = layoutParams2.l;
                                        if (i42 != i77 && (constraintWidget8 = (ConstraintWidget) sparseArray2.get(i42)) != null) {
                                            constraintWidgetB3.w(type15, constraintWidget8, type15, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, layoutParams2.z);
                                        }
                                    }
                                    layoutParams = layoutParams2;
                                    i43 = layoutParams.m;
                                    if (i43 != i77) {
                                        ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = dimensionBehaviour18;
                                        ConstraintAnchor.Type type23 = ConstraintAnchor.Type.e;
                                        dimensionBehaviour8 = dimensionBehaviour20;
                                        constraintWidget9 = constraintWidgetB3;
                                        dimensionBehaviour9 = dimensionBehaviour19;
                                        dimensionBehaviour10 = dimensionBehaviour;
                                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        type12 = type10;
                                        constraintLayout = this;
                                        constraintLayout.g(constraintWidget9, layoutParams, sparseArray2, i43, type23);
                                        type13 = type15;
                                        type14 = type11;
                                    } else {
                                        dimensionBehaviour8 = dimensionBehaviour18;
                                        dimensionBehaviour9 = dimensionBehaviour19;
                                        dimensionBehaviour10 = dimensionBehaviour;
                                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        type12 = type10;
                                        i44 = layoutParams.n;
                                        if (i44 != i77) {
                                            constraintWidget9 = constraintWidgetB3;
                                            ConstraintAnchor.Type type24 = type11;
                                            g(constraintWidget9, layoutParams, sparseArray2, i44, type24);
                                            ConstraintAnchor.Type type25 = type15;
                                            type14 = type24;
                                            type13 = type25;
                                            constraintLayout = this;
                                        } else {
                                            i45 = layoutParams.o;
                                            constraintLayout = this;
                                            type13 = type15;
                                            constraintWidget9 = constraintWidgetB3;
                                            type14 = type11;
                                            if (i45 != i77) {
                                                constraintLayout.g(constraintWidget9, layoutParams, sparseArray2, i45, type13);
                                            }
                                        }
                                    }
                                    if (f6 >= f) {
                                        constraintWidget9.f0 = f6;
                                    }
                                    f2 = layoutParams.F;
                                    if (f2 >= f) {
                                        constraintWidget9.g0 = f2;
                                    }
                                }
                                if (i72 != i77) {
                                    constraintWidget12 = (ConstraintWidget) sparseArray2.get(i72);
                                    if (constraintWidget12 != null) {
                                        ConstraintAnchor.Type type26 = type8;
                                        constraintWidgetB3.w(type16, constraintWidget12, type26, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, i75);
                                        type9 = type26;
                                    } else {
                                        type9 = type8;
                                    }
                                } else {
                                    type9 = type8;
                                    if (i73 != i77) {
                                        constraintWidgetB3.w(type16, constraintWidget6, type16, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, i75);
                                    }
                                }
                                type10 = type16;
                                i39 = layoutParams2.i;
                                if (i39 != i77) {
                                    constraintWidget11 = (ConstraintWidget) sparseArray2.get(i39);
                                    if (constraintWidget11 != null) {
                                        type11 = type18;
                                        constraintWidgetB3.w(type11, constraintWidget11, type18, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, layoutParams2.x);
                                    } else {
                                        type11 = type18;
                                    }
                                } else {
                                    type11 = type18;
                                    i40 = layoutParams2.j;
                                    if (i40 != i77) {
                                        ConstraintAnchor.Type type27 = type15;
                                        constraintWidgetB3.w(type11, constraintWidget7, type27, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, layoutParams2.x);
                                        type15 = type27;
                                    }
                                }
                                i41 = layoutParams2.k;
                                if (i41 != i77) {
                                    constraintWidget10 = (ConstraintWidget) sparseArray2.get(i41);
                                    if (constraintWidget10 != null) {
                                        constraintWidgetB3.w(type15, constraintWidget10, type11, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, layoutParams2.z);
                                    }
                                } else {
                                    i42 = layoutParams2.l;
                                    if (i42 != i77) {
                                        constraintWidgetB3.w(type15, constraintWidget8, type15, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, layoutParams2.z);
                                    }
                                }
                                layoutParams = layoutParams2;
                                i43 = layoutParams.m;
                                if (i43 != i77) {
                                    ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = dimensionBehaviour18;
                                    ConstraintAnchor.Type type28 = ConstraintAnchor.Type.e;
                                    dimensionBehaviour8 = dimensionBehaviour21;
                                    constraintWidget9 = constraintWidgetB3;
                                    dimensionBehaviour9 = dimensionBehaviour19;
                                    dimensionBehaviour10 = dimensionBehaviour;
                                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    type12 = type10;
                                    constraintLayout = this;
                                    constraintLayout.g(constraintWidget9, layoutParams, sparseArray2, i43, type28);
                                    type13 = type15;
                                    type14 = type11;
                                } else {
                                    dimensionBehaviour8 = dimensionBehaviour18;
                                    dimensionBehaviour9 = dimensionBehaviour19;
                                    dimensionBehaviour10 = dimensionBehaviour;
                                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    type12 = type10;
                                    i44 = layoutParams.n;
                                    if (i44 != i77) {
                                        constraintWidget9 = constraintWidgetB3;
                                        ConstraintAnchor.Type type29 = type11;
                                        g(constraintWidget9, layoutParams, sparseArray2, i44, type29);
                                        ConstraintAnchor.Type type210 = type15;
                                        type14 = type29;
                                        type13 = type210;
                                        constraintLayout = this;
                                    } else {
                                        i45 = layoutParams.o;
                                        constraintLayout = this;
                                        type13 = type15;
                                        constraintWidget9 = constraintWidgetB3;
                                        type14 = type11;
                                        if (i45 != i77) {
                                            constraintLayout.g(constraintWidget9, layoutParams, sparseArray2, i45, type13);
                                        }
                                    }
                                }
                                if (f6 >= f) {
                                    constraintWidget9.f0 = f6;
                                }
                                f2 = layoutParams.F;
                                if (f2 >= f) {
                                    constraintWidget9.g0 = f2;
                                }
                            }
                            if (zIsInEditMode && ((i52 = layoutParams.T) != i77 || layoutParams.U != i77)) {
                                int i79 = layoutParams.U;
                                constraintWidget9.a0 = i52;
                                constraintWidget9.b0 = i79;
                            }
                            boolean z17 = layoutParams.a0;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = ConstraintWidget.DimensionBehaviour.d;
                            if (z17) {
                                dimensionBehaviour11 = dimensionBehaviour9;
                                constraintWidget9.N(dimensionBehaviour10);
                                constraintWidget9.P(((ViewGroup.MarginLayoutParams) layoutParams).width);
                                if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                                    dimensionBehaviour12 = dimensionBehaviour8;
                                    constraintWidget9.N(dimensionBehaviour12);
                                }
                                if (layoutParams.b0) {
                                    sparseArray = sparseArray2;
                                    constraintWidget9.O(dimensionBehaviour10);
                                    constraintWidget9.M(((ViewGroup.MarginLayoutParams) layoutParams).height);
                                    if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                                        constraintWidget9.O(dimensionBehaviour12);
                                    }
                                } else {
                                    sparseArray = sparseArray2;
                                    if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                                        if (layoutParams.X) {
                                            constraintWidget9.O(dimensionBehaviour11);
                                        } else {
                                            constraintWidget9.O(dimensionBehaviour22);
                                        }
                                        constraintWidget9.j(type14).g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                                        constraintWidget9.j(type13).g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                                    } else {
                                        constraintWidget9.O(dimensionBehaviour11);
                                        constraintWidget9.M(0);
                                    }
                                }
                                str = layoutParams.G;
                                if (str != null || str.length() == 0) {
                                    dimensionBehaviour = dimensionBehaviour10;
                                    constraintWidget9.Y = f;
                                } else {
                                    int length = str.length();
                                    int iIndexOf3 = str.indexOf(44);
                                    if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                        i50 = -1;
                                        i51 = 0;
                                    } else {
                                        String strSubstring = str.substring(0, iIndexOf3);
                                        i50 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                                        i51 = iIndexOf3 + 1;
                                    }
                                    int iIndexOf4 = str.indexOf(58);
                                    if (iIndexOf4 >= 0) {
                                        dimensionBehaviour = dimensionBehaviour10;
                                        if (iIndexOf4 < length - 1) {
                                            String strSubstring2 = str.substring(i51, iIndexOf4);
                                            String strSubstring3 = str.substring(iIndexOf4 + 1);
                                            if (strSubstring2.length() <= 0 || strSubstring3.length() <= 0) {
                                                fAbs = f;
                                            } else {
                                                try {
                                                    float f8 = Float.parseFloat(strSubstring2);
                                                    float f9 = Float.parseFloat(strSubstring3);
                                                    if (f8 <= f || f9 <= f) {
                                                        fAbs = f;
                                                    } else {
                                                        fAbs = i50 == 1 ? Math.abs(f9 / f8) : Math.abs(f8 / f9);
                                                    }
                                                } catch (NumberFormatException unused3) {
                                                }
                                            }
                                        }
                                        if (fAbs > f) {
                                            constraintWidget9.Y = fAbs;
                                            constraintWidget9.Z = i50;
                                        }
                                    } else {
                                        dimensionBehaviour = dimensionBehaviour10;
                                    }
                                    String strSubstring4 = str.substring(i51);
                                    if (strSubstring4.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring4);
                                    } else {
                                        fAbs = f;
                                    }
                                    if (fAbs > f) {
                                        constraintWidget9.Y = fAbs;
                                        constraintWidget9.Z = i50;
                                    }
                                }
                                float f10 = layoutParams.H;
                                float[] fArr = constraintWidget9.m0;
                                fArr[0] = f10;
                                fArr[1] = layoutParams.I;
                                constraintWidget9.k0 = layoutParams.J;
                                constraintWidget9.l0 = layoutParams.K;
                                i46 = layoutParams.Z;
                                if (i46 >= 0 && i46 <= 3) {
                                    constraintWidget9.q = i46;
                                }
                                int i80 = layoutParams.L;
                                int i81 = layoutParams.N;
                                i47 = layoutParams.P;
                                f3 = layoutParams.R;
                                constraintWidget9.r = i80;
                                constraintWidget9.u = i81;
                                if (i47 == Integer.MAX_VALUE) {
                                    i47 = 0;
                                }
                                constraintWidget9.v = i47;
                                constraintWidget9.w = f3;
                                if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 >= 1.0f || i80 != 0) {
                                    i48 = 2;
                                } else {
                                    i48 = 2;
                                    constraintWidget9.r = 2;
                                }
                                int i82 = layoutParams.M;
                                int i83 = layoutParams.O;
                                i49 = layoutParams.Q;
                                f4 = layoutParams.S;
                                constraintWidget9.s = i82;
                                constraintWidget9.x = i83;
                                if (i49 == Integer.MAX_VALUE) {
                                    i49 = 0;
                                }
                                constraintWidget9.y = i49;
                                constraintWidget9.z = f4;
                                if (f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 < 1.0f && i82 == 0) {
                                    constraintWidget9.s = i48;
                                }
                            } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == i77) {
                                if (layoutParams.W) {
                                    dimensionBehaviour11 = dimensionBehaviour9;
                                    constraintWidget9.N(dimensionBehaviour11);
                                } else {
                                    dimensionBehaviour11 = dimensionBehaviour9;
                                    constraintWidget9.N(dimensionBehaviour22);
                                }
                                constraintWidget9.j(type9).g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                                constraintWidget9.j(type12).g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            } else {
                                dimensionBehaviour11 = dimensionBehaviour9;
                                constraintWidget9.N(dimensionBehaviour11);
                                constraintWidget9.P(0);
                            }
                            dimensionBehaviour12 = dimensionBehaviour8;
                            if (layoutParams.b0) {
                                sparseArray = sparseArray2;
                                if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                                    if (layoutParams.X) {
                                        constraintWidget9.O(dimensionBehaviour11);
                                    } else {
                                        constraintWidget9.O(dimensionBehaviour22);
                                    }
                                    constraintWidget9.j(type14).g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                                    constraintWidget9.j(type13).g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                                } else {
                                    constraintWidget9.O(dimensionBehaviour11);
                                    constraintWidget9.M(0);
                                }
                            } else {
                                sparseArray = sparseArray2;
                                constraintWidget9.O(dimensionBehaviour10);
                                constraintWidget9.M(((ViewGroup.MarginLayoutParams) layoutParams).height);
                                if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                                    constraintWidget9.O(dimensionBehaviour12);
                                }
                            }
                            str = layoutParams.G;
                            if (str != null) {
                                dimensionBehaviour = dimensionBehaviour10;
                                constraintWidget9.Y = f;
                            } else {
                                dimensionBehaviour = dimensionBehaviour10;
                                constraintWidget9.Y = f;
                            }
                            float f11 = layoutParams.H;
                            float[] fArr2 = constraintWidget9.m0;
                            fArr2[0] = f11;
                            fArr2[1] = layoutParams.I;
                            constraintWidget9.k0 = layoutParams.J;
                            constraintWidget9.l0 = layoutParams.K;
                            i46 = layoutParams.Z;
                            if (i46 >= 0) {
                                constraintWidget9.q = i46;
                            }
                            int i84 = layoutParams.L;
                            int i85 = layoutParams.N;
                            i47 = layoutParams.P;
                            f3 = layoutParams.R;
                            constraintWidget9.r = i84;
                            constraintWidget9.u = i85;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            constraintWidget9.v = i47;
                            constraintWidget9.w = f3;
                            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                i48 = 2;
                            } else {
                                i48 = 2;
                            }
                            int i86 = layoutParams.M;
                            int i87 = layoutParams.O;
                            i49 = layoutParams.Q;
                            f4 = layoutParams.S;
                            constraintWidget9.s = i86;
                            constraintWidget9.x = i87;
                            if (i49 == Integer.MAX_VALUE) {
                                i49 = 0;
                            }
                            constraintWidget9.y = i49;
                            constraintWidget9.z = f4;
                            if (f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            }
                        }
                    }
                    i67 = i37 + 1;
                    i36 = i48;
                    dimensionBehaviour19 = dimensionBehaviour11;
                    type15 = type13;
                    dimensionBehaviour18 = dimensionBehaviour12;
                    type16 = type12;
                    sparseArray2 = sparseArray;
                    childCount3 = i38;
                }
                dimensionBehaviour3 = dimensionBehaviour19;
            } else {
                dimensionBehaviour = dimensionBehaviour17;
                dimensionBehaviour3 = dimensionBehaviour16;
            }
            dimensionBehaviour2 = dimensionBehaviour18;
            type = type15;
            type2 = type16;
            if (b != false) {
                basicMeasure.c(constraintWidgetContainer3);
            }
        } else {
            dimensionBehaviour = dimensionBehaviour17;
            dimensionBehaviour2 = dimensionBehaviour18;
            type = type15;
            type2 = type16;
            dimensionBehaviour3 = dimensionBehaviour16;
        }
        int i88 = constraintLayout.i;
        int mode = View.MeasureSpec.getMode(i);
        int size6 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size7 = View.MeasureSpec.getSize(i2);
        int iMax6 = Math.max(0, constraintLayout.getPaddingTop());
        int iMax7 = Math.max(0, constraintLayout.getPaddingBottom());
        int i89 = iMax6 + iMax7;
        int paddingWidth = constraintLayout.getPaddingWidth();
        ConstraintAnchor.Type type30 = type;
        Measurer measurer7 = constraintLayout.o;
        measurer7.b = iMax6;
        measurer7.c = iMax7;
        measurer7.d = paddingWidth;
        measurer7.e = i89;
        measurer7.f = i;
        measurer7.g = i2;
        int iMax8 = Math.max(0, constraintLayout.getPaddingStart());
        int iMax9 = Math.max(0, constraintLayout.getPaddingEnd());
        if (iMax8 <= 0 && iMax9 <= 0) {
            iMax8 = Math.max(0, constraintLayout.getPaddingLeft());
        } else if (constraintLayout.d()) {
            iMax8 = iMax9;
        }
        int i90 = size6 - paddingWidth;
        int i91 = size7 - i89;
        int i92 = measurer7.e;
        int i93 = measurer7.d;
        int childCount4 = constraintLayout.getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i3 = i92;
                    dimensionBehaviour4 = dimensionBehaviour;
                    iMax = 0;
                } else {
                    i3 = i92;
                    i4 = Integer.MIN_VALUE;
                    iMax = Math.min(constraintLayout.f - i93, i90);
                    dimensionBehaviour4 = dimensionBehaviour;
                }
                if (mode2 == i4) {
                    type3 = type2;
                    if (childCount4 == 0) {
                        iMax2 = Math.max(0, constraintLayout.e);
                        dimensionBehaviour5 = dimensionBehaviour2;
                        dimensionBehaviour6 = dimensionBehaviour5;
                    } else {
                        dimensionBehaviour5 = dimensionBehaviour2;
                        dimensionBehaviour6 = dimensionBehaviour5;
                        iMax2 = i91;
                    }
                } else if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        dimensionBehaviour6 = dimensionBehaviour2;
                        type3 = type2;
                        dimensionBehaviour5 = dimensionBehaviour;
                        iMax2 = 0;
                    } else {
                        dimensionBehaviour6 = dimensionBehaviour2;
                        type3 = type2;
                        iMax2 = Math.min(constraintLayout.g - i3, i91);
                        dimensionBehaviour5 = dimensionBehaviour;
                    }
                } else if (childCount4 == 0) {
                    type3 = type2;
                    dimensionBehaviour5 = dimensionBehaviour2;
                    dimensionBehaviour6 = dimensionBehaviour5;
                    iMax2 = Math.max(0, constraintLayout.e);
                } else {
                    type3 = type2;
                    iMax2 = 0;
                    dimensionBehaviour5 = dimensionBehaviour2;
                    dimensionBehaviour6 = dimensionBehaviour5;
                }
                iR = constraintWidgetContainer3.r();
                dependencyGraph = constraintWidgetContainer3.t0;
                if (iMax == iR || iMax2 != constraintWidgetContainer3.l()) {
                    dependencyGraph.c = true;
                    c = 1;
                } else {
                    c = 1;
                }
                constraintWidgetContainer3.a0 = 0;
                constraintWidgetContainer3.b0 = 0;
                int i94 = constraintLayout.f - i93;
                int[] iArr = constraintWidgetContainer3.C;
                iArr[0] = i94;
                iArr[c] = constraintLayout.g - i3;
                constraintWidgetContainer3.d0 = 0;
                constraintWidgetContainer3.e0 = 0;
                constraintWidgetContainer3.N(dimensionBehaviour4);
                constraintWidgetContainer3.P(iMax);
                constraintWidgetContainer3.O(dimensionBehaviour5);
                constraintWidgetContainer3.M(iMax2);
                i5 = constraintLayout.d - i93;
                if (i5 < 0) {
                    constraintWidgetContainer3.d0 = 0;
                } else {
                    constraintWidgetContainer3.d0 = i5;
                }
                i6 = constraintLayout.e - i3;
                if (i6 < 0) {
                    constraintWidgetContainer3.e0 = 0;
                } else {
                    constraintWidgetContainer3.e0 = i6;
                }
                constraintWidgetContainer3.y0 = iMax8;
                constraintWidgetContainer3.z0 = iMax6;
                constraintWidgetContainer = basicMeasure.c;
                arrayList = basicMeasure.a;
                measurer = constraintWidgetContainer3.v0;
                size = constraintWidgetContainer3.r0.size();
                iR2 = constraintWidgetContainer3.r();
                iL = constraintWidgetContainer3.l();
                zB = Optimizer.b(i88, 128);
                if (!zB || Optimizer.b(i88, 64)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i34 = 0;
                    while (true) {
                        if (i34 < size) {
                            z9 = z;
                            constraintWidget4 = (ConstraintWidget) constraintWidgetContainer3.r0.get(i34);
                            i35 = i34;
                            dimensionBehaviourArr2 = constraintWidget4.U;
                            if (dimensionBehaviourArr2[0] == dimensionBehaviour3) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (dimensionBehaviourArr2[1] == dimensionBehaviour3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z10 || !z11 || constraintWidget4.Y <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if ((constraintWidget4.y() || !z12) && !((constraintWidget4.z() && z12) || (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.VirtualLayout) || constraintWidget4.y() || constraintWidget4.z())) {
                                i34 = i35 + 1;
                                z = z9;
                            } else {
                                i7 = 1073741824;
                                z2 = false;
                            }
                        } else {
                            z2 = z;
                            i7 = 1073741824;
                        }
                    }
                } else {
                    z2 = z;
                    i7 = 1073741824;
                }
                z3 = z2 & ((mode != i7 && mode2 == i7) || zB);
                if (z3) {
                    iMin = Math.min(constraintWidgetContainer3.C[0], i90);
                    z4 = z3;
                    iMin2 = Math.min(constraintWidgetContainer3.C[1], i91);
                    i30 = 1073741824;
                    if (mode == 1073741824) {
                        if (constraintWidgetContainer3.r() != iMin) {
                            constraintWidgetContainer3.P(iMin);
                            z6 = true;
                            dependencyGraph.b = true;
                        } else {
                            z6 = true;
                        }
                        i30 = 1073741824;
                    } else {
                        z6 = true;
                    }
                    if (mode2 == i30) {
                        if (constraintWidgetContainer3.l() != iMin2) {
                            constraintWidgetContainer3.M(iMin2);
                            dependencyGraph.b = z6;
                        }
                        i30 = 1073741824;
                    }
                    if (mode == i30 || mode2 != i30) {
                        constraintWidgetContainer2 = dependencyGraph.a;
                        if (dependencyGraph.b) {
                            arrayList4 = constraintWidgetContainer2.r0;
                            size4 = arrayList4.size();
                            i33 = 0;
                            while (i33 < size4) {
                                Object obj = arrayList4.get(i33);
                                int i95 = i33 + 1;
                                ArrayList arrayList6 = arrayList4;
                                ConstraintWidget constraintWidget17 = (ConstraintWidget) obj;
                                constraintWidget17.i();
                                constraintWidget17.a = false;
                                HorizontalWidgetRun horizontalWidgetRun2 = constraintWidget17.d;
                                horizontalWidgetRun2.e.j = false;
                                horizontalWidgetRun2.g = false;
                                horizontalWidgetRun2.n();
                                VerticalWidgetRun verticalWidgetRun2 = constraintWidget17.e;
                                verticalWidgetRun2.e.j = false;
                                verticalWidgetRun2.g = false;
                                verticalWidgetRun2.m();
                                size4 = size4;
                                i33 = i95;
                                arrayList4 = arrayList6;
                                measurer = measurer;
                            }
                            measurer2 = measurer;
                            i31 = 0;
                            constraintWidgetContainer2.i();
                            constraintWidgetContainer2.a = false;
                            HorizontalWidgetRun horizontalWidgetRun3 = constraintWidgetContainer2.d;
                            horizontalWidgetRun3.e.j = false;
                            horizontalWidgetRun3.g = false;
                            horizontalWidgetRun3.n();
                            VerticalWidgetRun verticalWidgetRun3 = constraintWidgetContainer2.e;
                            verticalWidgetRun3.e.j = false;
                            verticalWidgetRun3.g = false;
                            verticalWidgetRun3.m();
                            dependencyGraph.c();
                        } else {
                            measurer2 = measurer;
                            i31 = 0;
                        }
                        dependencyGraph.b(dependencyGraph.d);
                        constraintWidgetContainer2.a0 = i31;
                        constraintWidgetContainer2.b0 = i31;
                        constraintWidgetContainer2.d.h.d(i31);
                        constraintWidgetContainer2.e.h.d(i31);
                        i32 = 1073741824;
                        if (mode == 1073741824) {
                            zF = dependencyGraph.f(i31, zB);
                            i8 = 1;
                        } else {
                            i8 = 0;
                            zF = true;
                        }
                        if (mode2 == 1073741824) {
                            zF &= dependencyGraph.f(1, zB);
                            i8++;
                        }
                    } else {
                        zF = dependencyGraph.e(zB);
                        measurer2 = measurer;
                        size = size;
                        i32 = 1073741824;
                        i8 = 2;
                    }
                    if (zF) {
                        if (mode == i32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (mode2 == i32) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        constraintWidgetContainer3.Q(z7, z8);
                    }
                } else {
                    z4 = z3;
                    measurer2 = measurer;
                    size = size;
                    i8 = 0;
                    zF = false;
                }
                if (zF || i8 != 2) {
                    int i96 = constraintWidgetContainer3.E0;
                    if (size > 0) {
                        size3 = constraintWidgetContainer3.r0.size();
                        boolean zW = constraintWidgetContainer3.W(64);
                        measurer6 = constraintWidgetContainer3.v0;
                        i28 = 0;
                        while (i28 < size3) {
                            constraintWidget3 = (ConstraintWidget) constraintWidgetContainer3.r0.get(i28);
                            if (!(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.Guideline) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.Barrier) || constraintWidget3.G || (zW && (horizontalWidgetRun = constraintWidget3.d) != null && (verticalWidgetRun = constraintWidget3.e) != null && horizontalWidgetRun.e.j && verticalWidgetRun.e.j)) {
                                i29 = size3;
                            } else {
                                dimensionBehaviourK = constraintWidget3.k(0);
                                ConstraintWidget.DimensionBehaviour dimensionBehaviourK2 = constraintWidget3.k(1);
                                i29 = size3;
                                if (dimensionBehaviourK == dimensionBehaviour3 || constraintWidget3.r == 1 || dimensionBehaviourK2 != dimensionBehaviour3 || constraintWidget3.s == 1) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if (z5 && constraintWidgetContainer3.W(1) && !(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) {
                                    if (dimensionBehaviourK == dimensionBehaviour3 && constraintWidget3.r == 0 && dimensionBehaviourK2 != dimensionBehaviour3 && !constraintWidget3.y()) {
                                        z5 = true;
                                    }
                                    if (dimensionBehaviourK2 == dimensionBehaviour3 && constraintWidget3.s == 0 && dimensionBehaviourK != dimensionBehaviour3 && !constraintWidget3.y()) {
                                        z5 = true;
                                    }
                                    if (dimensionBehaviourK == dimensionBehaviour3 || dimensionBehaviourK2 == dimensionBehaviour3) {
                                        if (constraintWidget3.Y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            z5 = true;
                                        }
                                    }
                                }
                                if (!z5) {
                                    basicMeasure.a(0, constraintWidget3, measurer6);
                                }
                            }
                            i28++;
                            size3 = i29;
                        }
                        i9 = 0;
                        measurer6.a();
                    } else {
                        i9 = 0;
                    }
                    basicMeasure.c(constraintWidgetContainer3);
                    size2 = arrayList.size();
                    if (size > 0) {
                        basicMeasure.b(constraintWidgetContainer3, i9, iR2, iL);
                    }
                    if (size2 > 0) {
                        dimensionBehaviourArr = constraintWidgetContainer3.U;
                        dimensionBehaviour7 = dimensionBehaviour6;
                        if (dimensionBehaviourArr[i9] == dimensionBehaviour7) {
                            i10 = 1;
                        } else {
                            i10 = i9;
                        }
                        if (dimensionBehaviourArr[1] == dimensionBehaviour7) {
                            i11 = 1;
                        } else {
                            i11 = i9;
                        }
                        iMax3 = Math.max(constraintWidgetContainer3.r(), constraintWidgetContainer.d0);
                        iMax4 = Math.max(constraintWidgetContainer3.l(), constraintWidgetContainer.e0);
                        i12 = i9;
                        i13 = i12;
                        while (i12 < size2) {
                            constraintWidget2 = (ConstraintWidget) arrayList.get(i12);
                            if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.VirtualLayout) {
                                iR5 = constraintWidget2.r();
                                iL4 = constraintWidget2.l();
                                i23 = i11;
                                i24 = i10;
                                measurer5 = measurer2;
                                int i97 = i13 | (basicMeasure.a(1, constraintWidget2, measurer5) ? 1 : 0);
                                iR6 = constraintWidget2.r();
                                i25 = i97;
                                iL5 = constraintWidget2.l();
                                if (iR6 != iR5) {
                                    constraintWidget2.P(iR6);
                                    if (i24 != 0 || constraintWidget2.s() + constraintWidget2.W <= iMax3) {
                                        type6 = type3;
                                    } else {
                                        type6 = type3;
                                        iMax3 = Math.max(iMax3, constraintWidget2.j(type6).e() + constraintWidget2.s() + constraintWidget2.W);
                                    }
                                    i25 = 1;
                                } else {
                                    type6 = type3;
                                }
                                if (iL5 != iL4) {
                                    constraintWidget2.M(iL5);
                                    if (i23 != 0 || constraintWidget2.t() + constraintWidget2.X <= iMax4) {
                                        type7 = type30;
                                    } else {
                                        type7 = type30;
                                        iMax4 = Math.max(iMax4, constraintWidget2.j(type7).e() + constraintWidget2.t() + constraintWidget2.X);
                                    }
                                    i26 = iMax4;
                                    i27 = 1;
                                } else {
                                    type7 = type30;
                                    i26 = iMax4;
                                    i27 = i25;
                                }
                                i13 = (((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget2).z0 ? 1 : 0) | i27;
                                iMax4 = i26;
                            } else {
                                i23 = i11;
                                i24 = i10;
                                type7 = type30;
                                type6 = type3;
                                measurer5 = measurer2;
                            }
                            i12++;
                            measurer2 = measurer5;
                            type30 = type7;
                            type3 = type6;
                            i11 = i23;
                            i10 = i24;
                        }
                        i14 = i11;
                        i15 = i10;
                        type4 = type30;
                        type5 = type3;
                        i16 = 0;
                        while (true) {
                            measurer3 = measurer2;
                            if (i16 >= 2) {
                                break;
                            }
                            iMax5 = iMax4;
                            i17 = i13;
                            i18 = 0;
                            while (i18 < size2) {
                                constraintWidget = (ConstraintWidget) arrayList.get(i18);
                                int i98 = size2;
                                if (((constraintWidget instanceof Helper) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                                    i21 = i18;
                                    if (constraintWidget.i0 == 8 && ((!z4 || !constraintWidget.d.e.j || !constraintWidget.e.e.j) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout))) {
                                        iR3 = constraintWidget.r();
                                        iL2 = constraintWidget.l();
                                        arrayList3 = arrayList;
                                        int i99 = constraintWidget.c0;
                                        i17 |= basicMeasure.a(i16 == 1 ? 2 : 1, constraintWidget, measurer3) ? 1 : 0;
                                        measurer4 = measurer3;
                                        iR4 = constraintWidget.r();
                                        i22 = i16;
                                        iL3 = constraintWidget.l();
                                        if (iR4 != iR3) {
                                            constraintWidget.P(iR4);
                                            if (i15 != 0 && constraintWidget.s() + constraintWidget.W > iMax3) {
                                                iMax3 = Math.max(iMax3, constraintWidget.j(type5).e() + constraintWidget.s() + constraintWidget.W);
                                            }
                                            i17 = 1;
                                        }
                                        if (iL3 != iL2) {
                                            constraintWidget.M(iL3);
                                            if (i14 != 0 && constraintWidget.t() + constraintWidget.X > iMax5) {
                                                iMax5 = Math.max(iMax5, constraintWidget.j(type4).e() + constraintWidget.t() + constraintWidget.X);
                                            }
                                            i17 = 1;
                                        }
                                        if (!constraintWidget.E && i99 != constraintWidget.c0) {
                                            i17 = 1;
                                        }
                                    }
                                    i18 = i21 + 1;
                                    size2 = i98;
                                    arrayList = arrayList3;
                                    i16 = i22;
                                    measurer3 = measurer4;
                                } else {
                                    i21 = i18;
                                }
                                measurer4 = measurer3;
                                i22 = i16;
                                arrayList3 = arrayList;
                                i18 = i21 + 1;
                                size2 = i98;
                                arrayList = arrayList3;
                                i16 = i22;
                                measurer3 = measurer4;
                            }
                            i19 = size2;
                            measurer2 = measurer3;
                            i20 = i16;
                            arrayList2 = arrayList;
                            if (i17 == 0) {
                                break;
                            }
                            i16 = i20 + 1;
                            basicMeasure.b(constraintWidgetContainer3, i16, iR2, iL);
                            iMax4 = iMax5;
                            size2 = i19;
                            arrayList = arrayList2;
                            i13 = 0;
                        }
                    }
                    constraintWidgetContainer3.E0 = i96;
                    LinearSystem.p = constraintWidgetContainer3.W(512);
                }
                f(i, i2, constraintWidgetContainer3.r(), constraintWidgetContainer3.l(), constraintWidgetContainer3.F0, constraintWidgetContainer3.G0);
            }
            if (childCount4 == 0) {
                i3 = i92;
                dimensionBehaviour4 = dimensionBehaviour2;
                iMax = Math.max(0, constraintLayout.d);
            } else {
                i3 = i92;
                iMax = 0;
            }
            i4 = Integer.MIN_VALUE;
            if (mode2 == i4) {
                type3 = type2;
                if (childCount4 == 0) {
                    iMax2 = Math.max(0, constraintLayout.e);
                    dimensionBehaviour5 = dimensionBehaviour2;
                    dimensionBehaviour6 = dimensionBehaviour5;
                } else {
                    dimensionBehaviour5 = dimensionBehaviour2;
                    dimensionBehaviour6 = dimensionBehaviour5;
                    iMax2 = i91;
                }
            } else if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    dimensionBehaviour6 = dimensionBehaviour2;
                    type3 = type2;
                    dimensionBehaviour5 = dimensionBehaviour;
                    iMax2 = 0;
                } else {
                    dimensionBehaviour6 = dimensionBehaviour2;
                    type3 = type2;
                    iMax2 = Math.min(constraintLayout.g - i3, i91);
                    dimensionBehaviour5 = dimensionBehaviour;
                }
            } else if (childCount4 == 0) {
                type3 = type2;
                dimensionBehaviour5 = dimensionBehaviour2;
                dimensionBehaviour6 = dimensionBehaviour5;
                iMax2 = Math.max(0, constraintLayout.e);
            } else {
                type3 = type2;
                iMax2 = 0;
                dimensionBehaviour5 = dimensionBehaviour2;
                dimensionBehaviour6 = dimensionBehaviour5;
            }
            iR = constraintWidgetContainer3.r();
            dependencyGraph = constraintWidgetContainer3.t0;
            if (iMax == iR) {
                dependencyGraph.c = true;
                c = 1;
            } else {
                dependencyGraph.c = true;
                c = 1;
            }
            constraintWidgetContainer3.a0 = 0;
            constraintWidgetContainer3.b0 = 0;
            int i910 = constraintLayout.f - i93;
            int[] iArr2 = constraintWidgetContainer3.C;
            iArr2[0] = i910;
            iArr2[c] = constraintLayout.g - i3;
            constraintWidgetContainer3.d0 = 0;
            constraintWidgetContainer3.e0 = 0;
            constraintWidgetContainer3.N(dimensionBehaviour4);
            constraintWidgetContainer3.P(iMax);
            constraintWidgetContainer3.O(dimensionBehaviour5);
            constraintWidgetContainer3.M(iMax2);
            i5 = constraintLayout.d - i93;
            if (i5 < 0) {
                constraintWidgetContainer3.d0 = 0;
            } else {
                constraintWidgetContainer3.d0 = i5;
            }
            i6 = constraintLayout.e - i3;
            if (i6 < 0) {
                constraintWidgetContainer3.e0 = 0;
            } else {
                constraintWidgetContainer3.e0 = i6;
            }
            constraintWidgetContainer3.y0 = iMax8;
            constraintWidgetContainer3.z0 = iMax6;
            constraintWidgetContainer = basicMeasure.c;
            arrayList = basicMeasure.a;
            measurer = constraintWidgetContainer3.v0;
            size = constraintWidgetContainer3.r0.size();
            iR2 = constraintWidgetContainer3.r();
            iL = constraintWidgetContainer3.l();
            zB = Optimizer.b(i88, 128);
            if (zB) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i34 = 0;
                while (true) {
                    if (i34 < size) {
                        z9 = z;
                        constraintWidget4 = (ConstraintWidget) constraintWidgetContainer3.r0.get(i34);
                        i35 = i34;
                        dimensionBehaviourArr2 = constraintWidget4.U;
                        if (dimensionBehaviourArr2[0] == dimensionBehaviour3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (dimensionBehaviourArr2[1] == dimensionBehaviour3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (constraintWidget4.y()) {
                            i34 = i35 + 1;
                            z = z9;
                        } else {
                            i34 = i35 + 1;
                            z = z9;
                        }
                        i7 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i7 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i7 = 1073741824;
            }
            z3 = z2 & ((mode != i7 && mode2 == i7) || zB);
            if (z3) {
                iMin = Math.min(constraintWidgetContainer3.C[0], i90);
                z4 = z3;
                iMin2 = Math.min(constraintWidgetContainer3.C[1], i91);
                i30 = 1073741824;
                if (mode == 1073741824) {
                    if (constraintWidgetContainer3.r() != iMin) {
                        constraintWidgetContainer3.P(iMin);
                        z6 = true;
                        dependencyGraph.b = true;
                    } else {
                        z6 = true;
                    }
                    i30 = 1073741824;
                } else {
                    z6 = true;
                }
                if (mode2 == i30) {
                    if (constraintWidgetContainer3.l() != iMin2) {
                        constraintWidgetContainer3.M(iMin2);
                        dependencyGraph.b = z6;
                    }
                    i30 = 1073741824;
                }
                if (mode == i30) {
                    constraintWidgetContainer2 = dependencyGraph.a;
                    if (dependencyGraph.b) {
                        arrayList4 = constraintWidgetContainer2.r0;
                        size4 = arrayList4.size();
                        i33 = 0;
                        while (i33 < size4) {
                            Object obj2 = arrayList4.get(i33);
                            int i911 = i33 + 1;
                            ArrayList arrayList7 = arrayList4;
                            ConstraintWidget constraintWidget18 = (ConstraintWidget) obj2;
                            constraintWidget18.i();
                            constraintWidget18.a = false;
                            HorizontalWidgetRun horizontalWidgetRun4 = constraintWidget18.d;
                            horizontalWidgetRun4.e.j = false;
                            horizontalWidgetRun4.g = false;
                            horizontalWidgetRun4.n();
                            VerticalWidgetRun verticalWidgetRun4 = constraintWidget18.e;
                            verticalWidgetRun4.e.j = false;
                            verticalWidgetRun4.g = false;
                            verticalWidgetRun4.m();
                            size4 = size4;
                            i33 = i911;
                            arrayList4 = arrayList7;
                            measurer = measurer;
                        }
                        measurer2 = measurer;
                        i31 = 0;
                        constraintWidgetContainer2.i();
                        constraintWidgetContainer2.a = false;
                        HorizontalWidgetRun horizontalWidgetRun5 = constraintWidgetContainer2.d;
                        horizontalWidgetRun5.e.j = false;
                        horizontalWidgetRun5.g = false;
                        horizontalWidgetRun5.n();
                        VerticalWidgetRun verticalWidgetRun5 = constraintWidgetContainer2.e;
                        verticalWidgetRun5.e.j = false;
                        verticalWidgetRun5.g = false;
                        verticalWidgetRun5.m();
                        dependencyGraph.c();
                    } else {
                        measurer2 = measurer;
                        i31 = 0;
                    }
                    dependencyGraph.b(dependencyGraph.d);
                    constraintWidgetContainer2.a0 = i31;
                    constraintWidgetContainer2.b0 = i31;
                    constraintWidgetContainer2.d.h.d(i31);
                    constraintWidgetContainer2.e.h.d(i31);
                    i32 = 1073741824;
                    if (mode == 1073741824) {
                        zF = dependencyGraph.f(i31, zB);
                        i8 = 1;
                    } else {
                        i8 = 0;
                        zF = true;
                    }
                    if (mode2 == 1073741824) {
                        zF &= dependencyGraph.f(1, zB);
                        i8++;
                    }
                } else {
                    constraintWidgetContainer2 = dependencyGraph.a;
                    if (dependencyGraph.b) {
                        arrayList4 = constraintWidgetContainer2.r0;
                        size4 = arrayList4.size();
                        i33 = 0;
                        while (i33 < size4) {
                            Object obj3 = arrayList4.get(i33);
                            int i912 = i33 + 1;
                            ArrayList arrayList8 = arrayList4;
                            ConstraintWidget constraintWidget19 = (ConstraintWidget) obj3;
                            constraintWidget19.i();
                            constraintWidget19.a = false;
                            HorizontalWidgetRun horizontalWidgetRun6 = constraintWidget19.d;
                            horizontalWidgetRun6.e.j = false;
                            horizontalWidgetRun6.g = false;
                            horizontalWidgetRun6.n();
                            VerticalWidgetRun verticalWidgetRun6 = constraintWidget19.e;
                            verticalWidgetRun6.e.j = false;
                            verticalWidgetRun6.g = false;
                            verticalWidgetRun6.m();
                            size4 = size4;
                            i33 = i912;
                            arrayList4 = arrayList8;
                            measurer = measurer;
                        }
                        measurer2 = measurer;
                        i31 = 0;
                        constraintWidgetContainer2.i();
                        constraintWidgetContainer2.a = false;
                        HorizontalWidgetRun horizontalWidgetRun7 = constraintWidgetContainer2.d;
                        horizontalWidgetRun7.e.j = false;
                        horizontalWidgetRun7.g = false;
                        horizontalWidgetRun7.n();
                        VerticalWidgetRun verticalWidgetRun7 = constraintWidgetContainer2.e;
                        verticalWidgetRun7.e.j = false;
                        verticalWidgetRun7.g = false;
                        verticalWidgetRun7.m();
                        dependencyGraph.c();
                    } else {
                        measurer2 = measurer;
                        i31 = 0;
                    }
                    dependencyGraph.b(dependencyGraph.d);
                    constraintWidgetContainer2.a0 = i31;
                    constraintWidgetContainer2.b0 = i31;
                    constraintWidgetContainer2.d.h.d(i31);
                    constraintWidgetContainer2.e.h.d(i31);
                    i32 = 1073741824;
                    if (mode == 1073741824) {
                        zF = dependencyGraph.f(i31, zB);
                        i8 = 1;
                    } else {
                        i8 = 0;
                        zF = true;
                    }
                    if (mode2 == 1073741824) {
                        zF &= dependencyGraph.f(1, zB);
                        i8++;
                    }
                }
                if (zF) {
                    if (mode == i32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (mode2 == i32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    constraintWidgetContainer3.Q(z7, z8);
                }
            } else {
                z4 = z3;
                measurer2 = measurer;
                size = size;
                i8 = 0;
                zF = false;
            }
            if (zF) {
                int i913 = constraintWidgetContainer3.E0;
                if (size > 0) {
                    size3 = constraintWidgetContainer3.r0.size();
                    boolean zW2 = constraintWidgetContainer3.W(64);
                    measurer6 = constraintWidgetContainer3.v0;
                    i28 = 0;
                    while (i28 < size3) {
                        constraintWidget3 = (ConstraintWidget) constraintWidgetContainer3.r0.get(i28);
                        if (!(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                            i29 = size3;
                        } else {
                            dimensionBehaviourK = constraintWidget3.k(0);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviourK3 = constraintWidget3.k(1);
                            i29 = size3;
                            if (dimensionBehaviourK == dimensionBehaviour3) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                            }
                            if (!z5) {
                                basicMeasure.a(0, constraintWidget3, measurer6);
                            }
                        }
                        i28++;
                        size3 = i29;
                    }
                    i9 = 0;
                    measurer6.a();
                } else {
                    i9 = 0;
                }
                basicMeasure.c(constraintWidgetContainer3);
                size2 = arrayList.size();
                if (size > 0) {
                    basicMeasure.b(constraintWidgetContainer3, i9, iR2, iL);
                }
                if (size2 > 0) {
                    dimensionBehaviourArr = constraintWidgetContainer3.U;
                    dimensionBehaviour7 = dimensionBehaviour6;
                    if (dimensionBehaviourArr[i9] == dimensionBehaviour7) {
                        i10 = 1;
                    } else {
                        i10 = i9;
                    }
                    if (dimensionBehaviourArr[1] == dimensionBehaviour7) {
                        i11 = 1;
                    } else {
                        i11 = i9;
                    }
                    iMax3 = Math.max(constraintWidgetContainer3.r(), constraintWidgetContainer.d0);
                    iMax4 = Math.max(constraintWidgetContainer3.l(), constraintWidgetContainer.e0);
                    i12 = i9;
                    i13 = i12;
                    while (i12 < size2) {
                        constraintWidget2 = (ConstraintWidget) arrayList.get(i12);
                        if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.VirtualLayout) {
                            i23 = i11;
                            i24 = i10;
                            type7 = type30;
                            type6 = type3;
                            measurer5 = measurer2;
                        } else {
                            iR5 = constraintWidget2.r();
                            iL4 = constraintWidget2.l();
                            i23 = i11;
                            i24 = i10;
                            measurer5 = measurer2;
                            int i914 = i13 | (basicMeasure.a(1, constraintWidget2, measurer5) ? 1 : 0);
                            iR6 = constraintWidget2.r();
                            i25 = i914;
                            iL5 = constraintWidget2.l();
                            if (iR6 != iR5) {
                                constraintWidget2.P(iR6);
                                if (i24 != 0) {
                                    type6 = type3;
                                } else {
                                    type6 = type3;
                                }
                                i25 = 1;
                            } else {
                                type6 = type3;
                            }
                            if (iL5 != iL4) {
                                constraintWidget2.M(iL5);
                                if (i23 != 0) {
                                    type7 = type30;
                                } else {
                                    type7 = type30;
                                }
                                i26 = iMax4;
                                i27 = 1;
                            } else {
                                type7 = type30;
                                i26 = iMax4;
                                i27 = i25;
                            }
                            i13 = (((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget2).z0 ? 1 : 0) | i27;
                            iMax4 = i26;
                        }
                        i12++;
                        measurer2 = measurer5;
                        type30 = type7;
                        type3 = type6;
                        i11 = i23;
                        i10 = i24;
                    }
                    i14 = i11;
                    i15 = i10;
                    type4 = type30;
                    type5 = type3;
                    i16 = 0;
                    while (true) {
                        measurer3 = measurer2;
                        if (i16 >= 2) {
                            break;
                            break;
                        }
                        iMax5 = iMax4;
                        i17 = i13;
                        i18 = 0;
                        while (i18 < size2) {
                            constraintWidget = (ConstraintWidget) arrayList.get(i18);
                            int i915 = size2;
                            if (constraintWidget instanceof Helper) {
                                i21 = i18;
                                if (constraintWidget.i0 == 8) {
                                    measurer4 = measurer3;
                                    i22 = i16;
                                    arrayList3 = arrayList;
                                } else {
                                    iR3 = constraintWidget.r();
                                    iL2 = constraintWidget.l();
                                    arrayList3 = arrayList;
                                    int i916 = constraintWidget.c0;
                                    i17 |= basicMeasure.a(i16 == 1 ? 2 : 1, constraintWidget, measurer3) ? 1 : 0;
                                    measurer4 = measurer3;
                                    iR4 = constraintWidget.r();
                                    i22 = i16;
                                    iL3 = constraintWidget.l();
                                    if (iR4 != iR3) {
                                        constraintWidget.P(iR4);
                                        if (i15 != 0) {
                                            iMax3 = Math.max(iMax3, constraintWidget.j(type5).e() + constraintWidget.s() + constraintWidget.W);
                                        }
                                        i17 = 1;
                                    }
                                    if (iL3 != iL2) {
                                        constraintWidget.M(iL3);
                                        if (i14 != 0) {
                                            iMax5 = Math.max(iMax5, constraintWidget.j(type4).e() + constraintWidget.t() + constraintWidget.X);
                                        }
                                        i17 = 1;
                                    }
                                    if (!constraintWidget.E) {
                                    }
                                }
                            } else {
                                i21 = i18;
                                if (constraintWidget.i0 == 8) {
                                    measurer4 = measurer3;
                                    i22 = i16;
                                    arrayList3 = arrayList;
                                } else {
                                    iR3 = constraintWidget.r();
                                    iL2 = constraintWidget.l();
                                    arrayList3 = arrayList;
                                    int i917 = constraintWidget.c0;
                                    i17 |= basicMeasure.a(i16 == 1 ? 2 : 1, constraintWidget, measurer3) ? 1 : 0;
                                    measurer4 = measurer3;
                                    iR4 = constraintWidget.r();
                                    i22 = i16;
                                    iL3 = constraintWidget.l();
                                    if (iR4 != iR3) {
                                        constraintWidget.P(iR4);
                                        if (i15 != 0) {
                                            iMax3 = Math.max(iMax3, constraintWidget.j(type5).e() + constraintWidget.s() + constraintWidget.W);
                                        }
                                        i17 = 1;
                                    }
                                    if (iL3 != iL2) {
                                        constraintWidget.M(iL3);
                                        if (i14 != 0) {
                                            iMax5 = Math.max(iMax5, constraintWidget.j(type4).e() + constraintWidget.t() + constraintWidget.X);
                                        }
                                        i17 = 1;
                                    }
                                    if (!constraintWidget.E) {
                                    }
                                }
                            }
                            i18 = i21 + 1;
                            size2 = i915;
                            arrayList = arrayList3;
                            i16 = i22;
                            measurer3 = measurer4;
                        }
                        i19 = size2;
                        measurer2 = measurer3;
                        i20 = i16;
                        arrayList2 = arrayList;
                        if (i17 == 0) {
                            break;
                            break;
                        }
                        i16 = i20 + 1;
                        basicMeasure.b(constraintWidgetContainer3, i16, iR2, iL);
                        iMax4 = iMax5;
                        size2 = i19;
                        arrayList = arrayList2;
                        i13 = 0;
                    }
                }
                constraintWidgetContainer3.E0 = i913;
                LinearSystem.p = constraintWidgetContainer3.W(512);
            } else {
                int i918 = constraintWidgetContainer3.E0;
                if (size > 0) {
                    size3 = constraintWidgetContainer3.r0.size();
                    boolean zW3 = constraintWidgetContainer3.W(64);
                    measurer6 = constraintWidgetContainer3.v0;
                    i28 = 0;
                    while (i28 < size3) {
                        constraintWidget3 = (ConstraintWidget) constraintWidgetContainer3.r0.get(i28);
                        if (!(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                            i29 = size3;
                        } else {
                            dimensionBehaviourK = constraintWidget3.k(0);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviourK4 = constraintWidget3.k(1);
                            i29 = size3;
                            if (dimensionBehaviourK == dimensionBehaviour3) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                            }
                            if (!z5) {
                                basicMeasure.a(0, constraintWidget3, measurer6);
                            }
                        }
                        i28++;
                        size3 = i29;
                    }
                    i9 = 0;
                    measurer6.a();
                } else {
                    i9 = 0;
                }
                basicMeasure.c(constraintWidgetContainer3);
                size2 = arrayList.size();
                if (size > 0) {
                    basicMeasure.b(constraintWidgetContainer3, i9, iR2, iL);
                }
                if (size2 > 0) {
                    dimensionBehaviourArr = constraintWidgetContainer3.U;
                    dimensionBehaviour7 = dimensionBehaviour6;
                    if (dimensionBehaviourArr[i9] == dimensionBehaviour7) {
                        i10 = 1;
                    } else {
                        i10 = i9;
                    }
                    if (dimensionBehaviourArr[1] == dimensionBehaviour7) {
                        i11 = 1;
                    } else {
                        i11 = i9;
                    }
                    iMax3 = Math.max(constraintWidgetContainer3.r(), constraintWidgetContainer.d0);
                    iMax4 = Math.max(constraintWidgetContainer3.l(), constraintWidgetContainer.e0);
                    i12 = i9;
                    i13 = i12;
                    while (i12 < size2) {
                        constraintWidget2 = (ConstraintWidget) arrayList.get(i12);
                        if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.VirtualLayout) {
                            i23 = i11;
                            i24 = i10;
                            type7 = type30;
                            type6 = type3;
                            measurer5 = measurer2;
                        } else {
                            iR5 = constraintWidget2.r();
                            iL4 = constraintWidget2.l();
                            i23 = i11;
                            i24 = i10;
                            measurer5 = measurer2;
                            int i919 = i13 | (basicMeasure.a(1, constraintWidget2, measurer5) ? 1 : 0);
                            iR6 = constraintWidget2.r();
                            i25 = i919;
                            iL5 = constraintWidget2.l();
                            if (iR6 != iR5) {
                                constraintWidget2.P(iR6);
                                if (i24 != 0) {
                                    type6 = type3;
                                } else {
                                    type6 = type3;
                                }
                                i25 = 1;
                            } else {
                                type6 = type3;
                            }
                            if (iL5 != iL4) {
                                constraintWidget2.M(iL5);
                                if (i23 != 0) {
                                    type7 = type30;
                                } else {
                                    type7 = type30;
                                }
                                i26 = iMax4;
                                i27 = 1;
                            } else {
                                type7 = type30;
                                i26 = iMax4;
                                i27 = i25;
                            }
                            i13 = (((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget2).z0 ? 1 : 0) | i27;
                            iMax4 = i26;
                        }
                        i12++;
                        measurer2 = measurer5;
                        type30 = type7;
                        type3 = type6;
                        i11 = i23;
                        i10 = i24;
                    }
                    i14 = i11;
                    i15 = i10;
                    type4 = type30;
                    type5 = type3;
                    i16 = 0;
                    while (true) {
                        measurer3 = measurer2;
                        if (i16 >= 2) {
                            break;
                            break;
                        }
                        iMax5 = iMax4;
                        i17 = i13;
                        i18 = 0;
                        while (i18 < size2) {
                            constraintWidget = (ConstraintWidget) arrayList.get(i18);
                            int i9110 = size2;
                            if (constraintWidget instanceof Helper) {
                                i21 = i18;
                                if (constraintWidget.i0 == 8) {
                                    measurer4 = measurer3;
                                    i22 = i16;
                                    arrayList3 = arrayList;
                                } else {
                                    iR3 = constraintWidget.r();
                                    iL2 = constraintWidget.l();
                                    arrayList3 = arrayList;
                                    int i9111 = constraintWidget.c0;
                                    i17 |= basicMeasure.a(i16 == 1 ? 2 : 1, constraintWidget, measurer3) ? 1 : 0;
                                    measurer4 = measurer3;
                                    iR4 = constraintWidget.r();
                                    i22 = i16;
                                    iL3 = constraintWidget.l();
                                    if (iR4 != iR3) {
                                        constraintWidget.P(iR4);
                                        if (i15 != 0) {
                                            iMax3 = Math.max(iMax3, constraintWidget.j(type5).e() + constraintWidget.s() + constraintWidget.W);
                                        }
                                        i17 = 1;
                                    }
                                    if (iL3 != iL2) {
                                        constraintWidget.M(iL3);
                                        if (i14 != 0) {
                                            iMax5 = Math.max(iMax5, constraintWidget.j(type4).e() + constraintWidget.t() + constraintWidget.X);
                                        }
                                        i17 = 1;
                                    }
                                    if (!constraintWidget.E) {
                                    }
                                }
                            } else {
                                i21 = i18;
                                if (constraintWidget.i0 == 8) {
                                    measurer4 = measurer3;
                                    i22 = i16;
                                    arrayList3 = arrayList;
                                } else {
                                    iR3 = constraintWidget.r();
                                    iL2 = constraintWidget.l();
                                    arrayList3 = arrayList;
                                    int i9112 = constraintWidget.c0;
                                    i17 |= basicMeasure.a(i16 == 1 ? 2 : 1, constraintWidget, measurer3) ? 1 : 0;
                                    measurer4 = measurer3;
                                    iR4 = constraintWidget.r();
                                    i22 = i16;
                                    iL3 = constraintWidget.l();
                                    if (iR4 != iR3) {
                                        constraintWidget.P(iR4);
                                        if (i15 != 0) {
                                            iMax3 = Math.max(iMax3, constraintWidget.j(type5).e() + constraintWidget.s() + constraintWidget.W);
                                        }
                                        i17 = 1;
                                    }
                                    if (iL3 != iL2) {
                                        constraintWidget.M(iL3);
                                        if (i14 != 0) {
                                            iMax5 = Math.max(iMax5, constraintWidget.j(type4).e() + constraintWidget.t() + constraintWidget.X);
                                        }
                                        i17 = 1;
                                    }
                                    if (!constraintWidget.E) {
                                    }
                                }
                            }
                            i18 = i21 + 1;
                            size2 = i9110;
                            arrayList = arrayList3;
                            i16 = i22;
                            measurer3 = measurer4;
                        }
                        i19 = size2;
                        measurer2 = measurer3;
                        i20 = i16;
                        arrayList2 = arrayList;
                        if (i17 == 0) {
                            break;
                            break;
                        }
                        i16 = i20 + 1;
                        basicMeasure.b(constraintWidgetContainer3, i16, iR2, iL);
                        iMax4 = iMax5;
                        size2 = i19;
                        arrayList = arrayList2;
                        i13 = 0;
                    }
                }
                constraintWidgetContainer3.E0 = i918;
                LinearSystem.p = constraintWidgetContainer3.W(512);
            }
            f(i, i2, constraintWidgetContainer3.r(), constraintWidgetContainer3.l(), constraintWidgetContainer3.F0, constraintWidgetContainer3.G0);
        }
        i3 = i92;
        iMax = childCount4 == 0 ? Math.max(0, constraintLayout.d) : i90;
        dimensionBehaviour4 = dimensionBehaviour2;
        i4 = Integer.MIN_VALUE;
        if (mode2 == i4) {
            type3 = type2;
            if (childCount4 == 0) {
                iMax2 = Math.max(0, constraintLayout.e);
                dimensionBehaviour5 = dimensionBehaviour2;
                dimensionBehaviour6 = dimensionBehaviour5;
            } else {
                dimensionBehaviour5 = dimensionBehaviour2;
                dimensionBehaviour6 = dimensionBehaviour5;
                iMax2 = i91;
            }
        } else if (mode2 != 0) {
            if (mode2 != 1073741824) {
                dimensionBehaviour6 = dimensionBehaviour2;
                type3 = type2;
                dimensionBehaviour5 = dimensionBehaviour;
                iMax2 = 0;
            } else {
                dimensionBehaviour6 = dimensionBehaviour2;
                type3 = type2;
                iMax2 = Math.min(constraintLayout.g - i3, i91);
                dimensionBehaviour5 = dimensionBehaviour;
            }
        } else if (childCount4 == 0) {
            type3 = type2;
            dimensionBehaviour5 = dimensionBehaviour2;
            dimensionBehaviour6 = dimensionBehaviour5;
            iMax2 = Math.max(0, constraintLayout.e);
        } else {
            type3 = type2;
            iMax2 = 0;
            dimensionBehaviour5 = dimensionBehaviour2;
            dimensionBehaviour6 = dimensionBehaviour5;
        }
        iR = constraintWidgetContainer3.r();
        dependencyGraph = constraintWidgetContainer3.t0;
        if (iMax == iR) {
            dependencyGraph.c = true;
            c = 1;
        } else {
            dependencyGraph.c = true;
            c = 1;
        }
        constraintWidgetContainer3.a0 = 0;
        constraintWidgetContainer3.b0 = 0;
        int i9113 = constraintLayout.f - i93;
        int[] iArr3 = constraintWidgetContainer3.C;
        iArr3[0] = i9113;
        iArr3[c] = constraintLayout.g - i3;
        constraintWidgetContainer3.d0 = 0;
        constraintWidgetContainer3.e0 = 0;
        constraintWidgetContainer3.N(dimensionBehaviour4);
        constraintWidgetContainer3.P(iMax);
        constraintWidgetContainer3.O(dimensionBehaviour5);
        constraintWidgetContainer3.M(iMax2);
        i5 = constraintLayout.d - i93;
        if (i5 < 0) {
            constraintWidgetContainer3.d0 = 0;
        } else {
            constraintWidgetContainer3.d0 = i5;
        }
        i6 = constraintLayout.e - i3;
        if (i6 < 0) {
            constraintWidgetContainer3.e0 = 0;
        } else {
            constraintWidgetContainer3.e0 = i6;
        }
        constraintWidgetContainer3.y0 = iMax8;
        constraintWidgetContainer3.z0 = iMax6;
        constraintWidgetContainer = basicMeasure.c;
        arrayList = basicMeasure.a;
        measurer = constraintWidgetContainer3.v0;
        size = constraintWidgetContainer3.r0.size();
        iR2 = constraintWidgetContainer3.r();
        iL = constraintWidgetContainer3.l();
        zB = Optimizer.b(i88, 128);
        if (zB) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i34 = 0;
            while (true) {
                if (i34 < size) {
                    z9 = z;
                    constraintWidget4 = (ConstraintWidget) constraintWidgetContainer3.r0.get(i34);
                    i35 = i34;
                    dimensionBehaviourArr2 = constraintWidget4.U;
                    if (dimensionBehaviourArr2[0] == dimensionBehaviour3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (dimensionBehaviourArr2[1] == dimensionBehaviour3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (constraintWidget4.y()) {
                        i34 = i35 + 1;
                        z = z9;
                    } else {
                        i34 = i35 + 1;
                        z = z9;
                    }
                    i7 = 1073741824;
                    z2 = false;
                } else {
                    z2 = z;
                    i7 = 1073741824;
                }
            }
        } else {
            z2 = z;
            i7 = 1073741824;
        }
        z3 = z2 & ((mode != i7 && mode2 == i7) || zB);
        if (z3) {
            iMin = Math.min(constraintWidgetContainer3.C[0], i90);
            z4 = z3;
            iMin2 = Math.min(constraintWidgetContainer3.C[1], i91);
            i30 = 1073741824;
            if (mode == 1073741824) {
                if (constraintWidgetContainer3.r() != iMin) {
                    constraintWidgetContainer3.P(iMin);
                    z6 = true;
                    dependencyGraph.b = true;
                } else {
                    z6 = true;
                }
                i30 = 1073741824;
            } else {
                z6 = true;
            }
            if (mode2 == i30) {
                if (constraintWidgetContainer3.l() != iMin2) {
                    constraintWidgetContainer3.M(iMin2);
                    dependencyGraph.b = z6;
                }
                i30 = 1073741824;
            }
            if (mode == i30) {
                constraintWidgetContainer2 = dependencyGraph.a;
                if (dependencyGraph.b) {
                    arrayList4 = constraintWidgetContainer2.r0;
                    size4 = arrayList4.size();
                    i33 = 0;
                    while (i33 < size4) {
                        Object obj4 = arrayList4.get(i33);
                        int i9114 = i33 + 1;
                        ArrayList arrayList9 = arrayList4;
                        ConstraintWidget constraintWidget110 = (ConstraintWidget) obj4;
                        constraintWidget110.i();
                        constraintWidget110.a = false;
                        HorizontalWidgetRun horizontalWidgetRun8 = constraintWidget110.d;
                        horizontalWidgetRun8.e.j = false;
                        horizontalWidgetRun8.g = false;
                        horizontalWidgetRun8.n();
                        VerticalWidgetRun verticalWidgetRun8 = constraintWidget110.e;
                        verticalWidgetRun8.e.j = false;
                        verticalWidgetRun8.g = false;
                        verticalWidgetRun8.m();
                        size4 = size4;
                        i33 = i9114;
                        arrayList4 = arrayList9;
                        measurer = measurer;
                    }
                    measurer2 = measurer;
                    i31 = 0;
                    constraintWidgetContainer2.i();
                    constraintWidgetContainer2.a = false;
                    HorizontalWidgetRun horizontalWidgetRun9 = constraintWidgetContainer2.d;
                    horizontalWidgetRun9.e.j = false;
                    horizontalWidgetRun9.g = false;
                    horizontalWidgetRun9.n();
                    VerticalWidgetRun verticalWidgetRun9 = constraintWidgetContainer2.e;
                    verticalWidgetRun9.e.j = false;
                    verticalWidgetRun9.g = false;
                    verticalWidgetRun9.m();
                    dependencyGraph.c();
                } else {
                    measurer2 = measurer;
                    i31 = 0;
                }
                dependencyGraph.b(dependencyGraph.d);
                constraintWidgetContainer2.a0 = i31;
                constraintWidgetContainer2.b0 = i31;
                constraintWidgetContainer2.d.h.d(i31);
                constraintWidgetContainer2.e.h.d(i31);
                i32 = 1073741824;
                if (mode == 1073741824) {
                    zF = dependencyGraph.f(i31, zB);
                    i8 = 1;
                } else {
                    i8 = 0;
                    zF = true;
                }
                if (mode2 == 1073741824) {
                    zF &= dependencyGraph.f(1, zB);
                    i8++;
                }
            } else {
                constraintWidgetContainer2 = dependencyGraph.a;
                if (dependencyGraph.b) {
                    arrayList4 = constraintWidgetContainer2.r0;
                    size4 = arrayList4.size();
                    i33 = 0;
                    while (i33 < size4) {
                        Object obj5 = arrayList4.get(i33);
                        int i9115 = i33 + 1;
                        ArrayList arrayList10 = arrayList4;
                        ConstraintWidget constraintWidget111 = (ConstraintWidget) obj5;
                        constraintWidget111.i();
                        constraintWidget111.a = false;
                        HorizontalWidgetRun horizontalWidgetRun10 = constraintWidget111.d;
                        horizontalWidgetRun10.e.j = false;
                        horizontalWidgetRun10.g = false;
                        horizontalWidgetRun10.n();
                        VerticalWidgetRun verticalWidgetRun10 = constraintWidget111.e;
                        verticalWidgetRun10.e.j = false;
                        verticalWidgetRun10.g = false;
                        verticalWidgetRun10.m();
                        size4 = size4;
                        i33 = i9115;
                        arrayList4 = arrayList10;
                        measurer = measurer;
                    }
                    measurer2 = measurer;
                    i31 = 0;
                    constraintWidgetContainer2.i();
                    constraintWidgetContainer2.a = false;
                    HorizontalWidgetRun horizontalWidgetRun11 = constraintWidgetContainer2.d;
                    horizontalWidgetRun11.e.j = false;
                    horizontalWidgetRun11.g = false;
                    horizontalWidgetRun11.n();
                    VerticalWidgetRun verticalWidgetRun11 = constraintWidgetContainer2.e;
                    verticalWidgetRun11.e.j = false;
                    verticalWidgetRun11.g = false;
                    verticalWidgetRun11.m();
                    dependencyGraph.c();
                } else {
                    measurer2 = measurer;
                    i31 = 0;
                }
                dependencyGraph.b(dependencyGraph.d);
                constraintWidgetContainer2.a0 = i31;
                constraintWidgetContainer2.b0 = i31;
                constraintWidgetContainer2.d.h.d(i31);
                constraintWidgetContainer2.e.h.d(i31);
                i32 = 1073741824;
                if (mode == 1073741824) {
                    zF = dependencyGraph.f(i31, zB);
                    i8 = 1;
                } else {
                    i8 = 0;
                    zF = true;
                }
                if (mode2 == 1073741824) {
                    zF &= dependencyGraph.f(1, zB);
                    i8++;
                }
            }
            if (zF) {
                if (mode == i32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (mode2 == i32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                constraintWidgetContainer3.Q(z7, z8);
            }
        } else {
            z4 = z3;
            measurer2 = measurer;
            size = size;
            i8 = 0;
            zF = false;
        }
        if (zF) {
            int i9116 = constraintWidgetContainer3.E0;
            if (size > 0) {
                size3 = constraintWidgetContainer3.r0.size();
                boolean zW4 = constraintWidgetContainer3.W(64);
                measurer6 = constraintWidgetContainer3.v0;
                i28 = 0;
                while (i28 < size3) {
                    constraintWidget3 = (ConstraintWidget) constraintWidgetContainer3.r0.get(i28);
                    if (!(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                        i29 = size3;
                    } else {
                        dimensionBehaviourK = constraintWidget3.k(0);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviourK5 = constraintWidget3.k(1);
                        i29 = size3;
                        if (dimensionBehaviourK == dimensionBehaviour3) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                        }
                        if (!z5) {
                            basicMeasure.a(0, constraintWidget3, measurer6);
                        }
                    }
                    i28++;
                    size3 = i29;
                }
                i9 = 0;
                measurer6.a();
            } else {
                i9 = 0;
            }
            basicMeasure.c(constraintWidgetContainer3);
            size2 = arrayList.size();
            if (size > 0) {
                basicMeasure.b(constraintWidgetContainer3, i9, iR2, iL);
            }
            if (size2 > 0) {
                dimensionBehaviourArr = constraintWidgetContainer3.U;
                dimensionBehaviour7 = dimensionBehaviour6;
                if (dimensionBehaviourArr[i9] == dimensionBehaviour7) {
                    i10 = 1;
                } else {
                    i10 = i9;
                }
                if (dimensionBehaviourArr[1] == dimensionBehaviour7) {
                    i11 = 1;
                } else {
                    i11 = i9;
                }
                iMax3 = Math.max(constraintWidgetContainer3.r(), constraintWidgetContainer.d0);
                iMax4 = Math.max(constraintWidgetContainer3.l(), constraintWidgetContainer.e0);
                i12 = i9;
                i13 = i12;
                while (i12 < size2) {
                    constraintWidget2 = (ConstraintWidget) arrayList.get(i12);
                    if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.VirtualLayout) {
                        i23 = i11;
                        i24 = i10;
                        type7 = type30;
                        type6 = type3;
                        measurer5 = measurer2;
                    } else {
                        iR5 = constraintWidget2.r();
                        iL4 = constraintWidget2.l();
                        i23 = i11;
                        i24 = i10;
                        measurer5 = measurer2;
                        int i9117 = i13 | (basicMeasure.a(1, constraintWidget2, measurer5) ? 1 : 0);
                        iR6 = constraintWidget2.r();
                        i25 = i9117;
                        iL5 = constraintWidget2.l();
                        if (iR6 != iR5) {
                            constraintWidget2.P(iR6);
                            if (i24 != 0) {
                                type6 = type3;
                            } else {
                                type6 = type3;
                            }
                            i25 = 1;
                        } else {
                            type6 = type3;
                        }
                        if (iL5 != iL4) {
                            constraintWidget2.M(iL5);
                            if (i23 != 0) {
                                type7 = type30;
                            } else {
                                type7 = type30;
                            }
                            i26 = iMax4;
                            i27 = 1;
                        } else {
                            type7 = type30;
                            i26 = iMax4;
                            i27 = i25;
                        }
                        i13 = (((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget2).z0 ? 1 : 0) | i27;
                        iMax4 = i26;
                    }
                    i12++;
                    measurer2 = measurer5;
                    type30 = type7;
                    type3 = type6;
                    i11 = i23;
                    i10 = i24;
                }
                i14 = i11;
                i15 = i10;
                type4 = type30;
                type5 = type3;
                i16 = 0;
                while (true) {
                    measurer3 = measurer2;
                    if (i16 >= 2) {
                        break;
                        break;
                    }
                    iMax5 = iMax4;
                    i17 = i13;
                    i18 = 0;
                    while (i18 < size2) {
                        constraintWidget = (ConstraintWidget) arrayList.get(i18);
                        int i9118 = size2;
                        if (constraintWidget instanceof Helper) {
                            i21 = i18;
                            if (constraintWidget.i0 == 8) {
                                measurer4 = measurer3;
                                i22 = i16;
                                arrayList3 = arrayList;
                            } else {
                                iR3 = constraintWidget.r();
                                iL2 = constraintWidget.l();
                                arrayList3 = arrayList;
                                int i9119 = constraintWidget.c0;
                                i17 |= basicMeasure.a(i16 == 1 ? 2 : 1, constraintWidget, measurer3) ? 1 : 0;
                                measurer4 = measurer3;
                                iR4 = constraintWidget.r();
                                i22 = i16;
                                iL3 = constraintWidget.l();
                                if (iR4 != iR3) {
                                    constraintWidget.P(iR4);
                                    if (i15 != 0) {
                                        iMax3 = Math.max(iMax3, constraintWidget.j(type5).e() + constraintWidget.s() + constraintWidget.W);
                                    }
                                    i17 = 1;
                                }
                                if (iL3 != iL2) {
                                    constraintWidget.M(iL3);
                                    if (i14 != 0) {
                                        iMax5 = Math.max(iMax5, constraintWidget.j(type4).e() + constraintWidget.t() + constraintWidget.X);
                                    }
                                    i17 = 1;
                                }
                                if (!constraintWidget.E) {
                                }
                            }
                        } else {
                            i21 = i18;
                            if (constraintWidget.i0 == 8) {
                                measurer4 = measurer3;
                                i22 = i16;
                                arrayList3 = arrayList;
                            } else {
                                iR3 = constraintWidget.r();
                                iL2 = constraintWidget.l();
                                arrayList3 = arrayList;
                                int i91110 = constraintWidget.c0;
                                i17 |= basicMeasure.a(i16 == 1 ? 2 : 1, constraintWidget, measurer3) ? 1 : 0;
                                measurer4 = measurer3;
                                iR4 = constraintWidget.r();
                                i22 = i16;
                                iL3 = constraintWidget.l();
                                if (iR4 != iR3) {
                                    constraintWidget.P(iR4);
                                    if (i15 != 0) {
                                        iMax3 = Math.max(iMax3, constraintWidget.j(type5).e() + constraintWidget.s() + constraintWidget.W);
                                    }
                                    i17 = 1;
                                }
                                if (iL3 != iL2) {
                                    constraintWidget.M(iL3);
                                    if (i14 != 0) {
                                        iMax5 = Math.max(iMax5, constraintWidget.j(type4).e() + constraintWidget.t() + constraintWidget.X);
                                    }
                                    i17 = 1;
                                }
                                if (!constraintWidget.E) {
                                }
                            }
                        }
                        i18 = i21 + 1;
                        size2 = i9118;
                        arrayList = arrayList3;
                        i16 = i22;
                        measurer3 = measurer4;
                    }
                    i19 = size2;
                    measurer2 = measurer3;
                    i20 = i16;
                    arrayList2 = arrayList;
                    if (i17 == 0) {
                        break;
                        break;
                    }
                    i16 = i20 + 1;
                    basicMeasure.b(constraintWidgetContainer3, i16, iR2, iL);
                    iMax4 = iMax5;
                    size2 = i19;
                    arrayList = arrayList2;
                    i13 = 0;
                }
            }
            constraintWidgetContainer3.E0 = i9116;
            LinearSystem.p = constraintWidgetContainer3.W(512);
        } else {
            int i91111 = constraintWidgetContainer3.E0;
            if (size > 0) {
                size3 = constraintWidgetContainer3.r0.size();
                boolean zW5 = constraintWidgetContainer3.W(64);
                measurer6 = constraintWidgetContainer3.v0;
                i28 = 0;
                while (i28 < size3) {
                    constraintWidget3 = (ConstraintWidget) constraintWidgetContainer3.r0.get(i28);
                    if (!(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                        i29 = size3;
                    } else {
                        dimensionBehaviourK = constraintWidget3.k(0);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviourK6 = constraintWidget3.k(1);
                        i29 = size3;
                        if (dimensionBehaviourK == dimensionBehaviour3) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                        }
                        if (!z5) {
                            basicMeasure.a(0, constraintWidget3, measurer6);
                        }
                    }
                    i28++;
                    size3 = i29;
                }
                i9 = 0;
                measurer6.a();
            } else {
                i9 = 0;
            }
            basicMeasure.c(constraintWidgetContainer3);
            size2 = arrayList.size();
            if (size > 0) {
                basicMeasure.b(constraintWidgetContainer3, i9, iR2, iL);
            }
            if (size2 > 0) {
                dimensionBehaviourArr = constraintWidgetContainer3.U;
                dimensionBehaviour7 = dimensionBehaviour6;
                if (dimensionBehaviourArr[i9] == dimensionBehaviour7) {
                    i10 = 1;
                } else {
                    i10 = i9;
                }
                if (dimensionBehaviourArr[1] == dimensionBehaviour7) {
                    i11 = 1;
                } else {
                    i11 = i9;
                }
                iMax3 = Math.max(constraintWidgetContainer3.r(), constraintWidgetContainer.d0);
                iMax4 = Math.max(constraintWidgetContainer3.l(), constraintWidgetContainer.e0);
                i12 = i9;
                i13 = i12;
                while (i12 < size2) {
                    constraintWidget2 = (ConstraintWidget) arrayList.get(i12);
                    if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.VirtualLayout) {
                        i23 = i11;
                        i24 = i10;
                        type7 = type30;
                        type6 = type3;
                        measurer5 = measurer2;
                    } else {
                        iR5 = constraintWidget2.r();
                        iL4 = constraintWidget2.l();
                        i23 = i11;
                        i24 = i10;
                        measurer5 = measurer2;
                        int i91112 = i13 | (basicMeasure.a(1, constraintWidget2, measurer5) ? 1 : 0);
                        iR6 = constraintWidget2.r();
                        i25 = i91112;
                        iL5 = constraintWidget2.l();
                        if (iR6 != iR5) {
                            constraintWidget2.P(iR6);
                            if (i24 != 0) {
                                type6 = type3;
                            } else {
                                type6 = type3;
                            }
                            i25 = 1;
                        } else {
                            type6 = type3;
                        }
                        if (iL5 != iL4) {
                            constraintWidget2.M(iL5);
                            if (i23 != 0) {
                                type7 = type30;
                            } else {
                                type7 = type30;
                            }
                            i26 = iMax4;
                            i27 = 1;
                        } else {
                            type7 = type30;
                            i26 = iMax4;
                            i27 = i25;
                        }
                        i13 = (((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget2).z0 ? 1 : 0) | i27;
                        iMax4 = i26;
                    }
                    i12++;
                    measurer2 = measurer5;
                    type30 = type7;
                    type3 = type6;
                    i11 = i23;
                    i10 = i24;
                }
                i14 = i11;
                i15 = i10;
                type4 = type30;
                type5 = type3;
                i16 = 0;
                while (true) {
                    measurer3 = measurer2;
                    if (i16 >= 2) {
                        break;
                        break;
                    }
                    iMax5 = iMax4;
                    i17 = i13;
                    i18 = 0;
                    while (i18 < size2) {
                        constraintWidget = (ConstraintWidget) arrayList.get(i18);
                        int i91113 = size2;
                        if (constraintWidget instanceof Helper) {
                            i21 = i18;
                            if (constraintWidget.i0 == 8) {
                                measurer4 = measurer3;
                                i22 = i16;
                                arrayList3 = arrayList;
                            } else {
                                iR3 = constraintWidget.r();
                                iL2 = constraintWidget.l();
                                arrayList3 = arrayList;
                                int i91114 = constraintWidget.c0;
                                i17 |= basicMeasure.a(i16 == 1 ? 2 : 1, constraintWidget, measurer3) ? 1 : 0;
                                measurer4 = measurer3;
                                iR4 = constraintWidget.r();
                                i22 = i16;
                                iL3 = constraintWidget.l();
                                if (iR4 != iR3) {
                                    constraintWidget.P(iR4);
                                    if (i15 != 0) {
                                        iMax3 = Math.max(iMax3, constraintWidget.j(type5).e() + constraintWidget.s() + constraintWidget.W);
                                    }
                                    i17 = 1;
                                }
                                if (iL3 != iL2) {
                                    constraintWidget.M(iL3);
                                    if (i14 != 0) {
                                        iMax5 = Math.max(iMax5, constraintWidget.j(type4).e() + constraintWidget.t() + constraintWidget.X);
                                    }
                                    i17 = 1;
                                }
                                if (!constraintWidget.E) {
                                }
                            }
                        } else {
                            i21 = i18;
                            if (constraintWidget.i0 == 8) {
                                measurer4 = measurer3;
                                i22 = i16;
                                arrayList3 = arrayList;
                            } else {
                                iR3 = constraintWidget.r();
                                iL2 = constraintWidget.l();
                                arrayList3 = arrayList;
                                int i91115 = constraintWidget.c0;
                                i17 |= basicMeasure.a(i16 == 1 ? 2 : 1, constraintWidget, measurer3) ? 1 : 0;
                                measurer4 = measurer3;
                                iR4 = constraintWidget.r();
                                i22 = i16;
                                iL3 = constraintWidget.l();
                                if (iR4 != iR3) {
                                    constraintWidget.P(iR4);
                                    if (i15 != 0) {
                                        iMax3 = Math.max(iMax3, constraintWidget.j(type5).e() + constraintWidget.s() + constraintWidget.W);
                                    }
                                    i17 = 1;
                                }
                                if (iL3 != iL2) {
                                    constraintWidget.M(iL3);
                                    if (i14 != 0) {
                                        iMax5 = Math.max(iMax5, constraintWidget.j(type4).e() + constraintWidget.t() + constraintWidget.X);
                                    }
                                    i17 = 1;
                                }
                                if (!constraintWidget.E) {
                                }
                            }
                        }
                        i18 = i21 + 1;
                        size2 = i91113;
                        arrayList = arrayList3;
                        i16 = i22;
                        measurer3 = measurer4;
                    }
                    i19 = size2;
                    measurer2 = measurer3;
                    i20 = i16;
                    arrayList2 = arrayList;
                    if (i17 == 0) {
                        break;
                        break;
                    }
                    i16 = i20 + 1;
                    basicMeasure.b(constraintWidgetContainer3, i16, iR2, iL);
                    iMax4 = iMax5;
                    size2 = i19;
                    arrayList = arrayList2;
                    i13 = 0;
                }
            }
            constraintWidgetContainer3.E0 = i91111;
            LinearSystem.p = constraintWidgetContainer3.W(512);
        }
        f(i, i2, constraintWidgetContainer3.r(), constraintWidgetContainer3.l(), constraintWidgetContainer3.F0, constraintWidgetContainer3.G0);
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.j = constraintSet;
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        ConstraintWidgetContainer constraintWidgetContainer = this.c;
        constraintWidgetContainer.E0 = i;
        LinearSystem.p = constraintWidgetContainer.W(512);
    }

    public ConstraintLayout(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ConstraintWidgetContainer();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new Measurer(this);
        this.p = 0;
        this.q = 0;
        c(null, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (iMax2 > 0) {
            return iMax2;
        }
        return iMax;
    }

    public final boolean d() {
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.q0;
            if ((childAt.getVisibility() != 8 || layoutParams.d0 || layoutParams.e0 || zIsInEditMode) && !layoutParams.f0) {
                int iS = constraintWidget.s();
                int iT = constraintWidget.t();
                int iR = constraintWidget.r() + iS;
                int iL = constraintWidget.l() + iT;
                childAt.layout(iS, iT, iR, iL);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iS, iT, iR, iL);
                }
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ConstraintHelper) arrayList.get(i6)).k();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget constraintWidgetB = b(view);
        if ((view instanceof Guideline) && !(constraintWidgetB instanceof androidx.constraintlayout.core.widgets.Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.Guideline guideline = new androidx.constraintlayout.core.widgets.Guideline();
            layoutParams.q0 = guideline;
            layoutParams.d0 = true;
            guideline.T(layoutParams.V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m();
            ((LayoutParams) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(constraintHelper)) {
                arrayList.add(constraintHelper);
            }
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        ConstraintWidget constraintWidgetB = b(view);
        this.c.r0.remove(constraintWidgetB);
        constraintWidgetB.D();
        this.b.remove(view);
        this.h = true;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ConstraintWidgetContainer();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new Measurer(this);
        this.p = 0;
        this.q = 0;
        c(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ConstraintWidgetContainer();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new Measurer(this);
        this.p = 0;
        this.q = 0;
        c(attributeSet, i);
    }
}
