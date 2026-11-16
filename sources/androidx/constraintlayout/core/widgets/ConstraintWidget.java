package androidx.constraintlayout.core.widgets;

import android.view.View;
import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.h50;
import defpackage.nj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ConstraintWidget {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final ConstraintAnchor J;
    public final ConstraintAnchor K;
    public final ConstraintAnchor L;
    public final ConstraintAnchor M;
    public final ConstraintAnchor N;
    public final ConstraintAnchor O;
    public final ConstraintAnchor P;
    public final ConstraintAnchor Q;
    public final ConstraintAnchor[] R;
    public final ArrayList S;
    public final boolean[] T;
    public final DimensionBehaviour[] U;
    public ConstraintWidget V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public int a0;
    public ChainRun b;
    public int b0;
    public ChainRun c;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public float g0;
    public View h0;
    public int i0;
    public String j;
    public String j0;
    public boolean k;
    public int k0;
    public boolean l;
    public int l0;
    public boolean m;
    public final float[] m0;
    public boolean n;
    public final ConstraintWidget[] n0;
    public int o;
    public final ConstraintWidget[] o0;
    public int p;
    public int p0;
    public int q;
    public int q0;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public HorizontalWidgetRun d = null;
    public VerticalWidgetRun e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class DimensionBehaviour {
        public static final DimensionBehaviour a;
        public static final DimensionBehaviour b;
        public static final DimensionBehaviour c;
        public static final DimensionBehaviour d;
        public static final /* synthetic */ DimensionBehaviour[] e;

        static {
            DimensionBehaviour dimensionBehaviour = new DimensionBehaviour("FIXED", 0);
            a = dimensionBehaviour;
            DimensionBehaviour dimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
            b = dimensionBehaviour2;
            DimensionBehaviour dimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
            c = dimensionBehaviour3;
            DimensionBehaviour dimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
            d = dimensionBehaviour4;
            e = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour2, dimensionBehaviour3, dimensionBehaviour4};
        }

        public static DimensionBehaviour valueOf(String str) {
            return (DimensionBehaviour) Enum.valueOf(DimensionBehaviour.class, str);
        }

        public static DimensionBehaviour[] values() {
            return (DimensionBehaviour[]) e.clone();
        }
    }

    public final void F() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) arrayList.get(i);
            constraintAnchor.c = false;
            constraintAnchor.b = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:229:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:231:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:240:0x041a  */
    /* JADX WARN: Code duplicated, block: B:257:0x044d  */
    /* JADX WARN: Code duplicated, block: B:259:0x0453  */
    /* JADX WARN: Code duplicated, block: B:270:0x0468  */
    /* JADX WARN: Code duplicated, block: B:275:0x0472  */
    /* JADX WARN: Code duplicated, block: B:277:0x0476  */
    /* JADX WARN: Code duplicated, block: B:278:0x0478  */
    /* JADX WARN: Code duplicated, block: B:281:0x0480  */
    /* JADX WARN: Code duplicated, block: B:287:0x048e A[PHI: r0
  0x048e: PHI (r0v16 int) = (r0v15 int), (r0v20 int), (r0v20 int), (r0v20 int) binds: [B:280:0x047e, B:282:0x0484, B:283:0x0486, B:285:0x048a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:292:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:294:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:337:0x051e  */
    public final void e(LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int iMin;
        int i9;
        int i10;
        boolean z12;
        SolverVariable solverVariableK;
        SolverVariable solverVariableK2;
        ConstraintAnchor constraintAnchor3;
        SolverVariable solverVariable3;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        ConstraintWidget constraintWidget;
        boolean z17;
        int iMin2;
        boolean z18;
        int i13;
        int iE;
        int i14;
        int i15;
        HashSet hashSet;
        boolean z19;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z20;
        boolean z21;
        int i22;
        linearSystem = linearSystem;
        int i23 = i7;
        int i24 = i8;
        SolverVariable solverVariableK3 = linearSystem.k(constraintAnchor);
        SolverVariable solverVariableK4 = linearSystem.k(constraintAnchor2);
        SolverVariable solverVariableK5 = linearSystem.k(constraintAnchor.f);
        SolverVariable solverVariableK6 = linearSystem.k(constraintAnchor2.f);
        boolean zH = constraintAnchor.h();
        boolean zH2 = constraintAnchor2.h();
        boolean zH3 = this.Q.h();
        int i25 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i25++;
        }
        int i26 = i25;
        int i27 = z6 ? 3 : i5;
        int iOrdinal = dimensionBehaviour.ordinal();
        boolean z22 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i27 == 4) ? false : true;
        int i28 = this.h;
        if (i28 != -1 && z) {
            this.h = -1;
            i2 = i28;
            z22 = false;
        }
        int i29 = this.i;
        if (i29 == -1 || z) {
            i29 = i2;
        } else {
            this.i = -1;
            z22 = false;
        }
        int i30 = i29;
        if (this.i0 == 8) {
            z22 = false;
            iMin = 0;
        } else {
            iMin = i30;
        }
        if (z11) {
            if (!zH && !zH2 && !zH3) {
                linearSystem.d(solverVariableK3, i);
            } else if (zH && !zH2) {
                i9 = 8;
                linearSystem.e(solverVariableK3, solverVariableK5, constraintAnchor.e(), 8);
            }
            i9 = 8;
        } else {
            i9 = 8;
        }
        if (z22 != 0) {
            if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (i24 == -2) {
                    i24 = iMin;
                }
                if (iMin > 0 && i27 != 1) {
                    iMin = 0;
                }
                if (i23 > 0) {
                    linearSystem.f(solverVariableK4, solverVariableK3, i23, 8);
                    iMin = Math.max(iMin, i23);
                }
                if (i24 > 0) {
                    if (!z2 || i27 != 1) {
                        linearSystem.g(solverVariableK4, solverVariableK3, i24, 8);
                    }
                    iMin = Math.min(iMin, i24);
                }
                if (i27 == 1) {
                    if (z2) {
                        linearSystem.e(solverVariableK4, solverVariableK3, iMin, 8);
                    } else if (z8) {
                        linearSystem.e(solverVariableK4, solverVariableK3, iMin, 5);
                        linearSystem.g(solverVariableK4, solverVariableK3, iMin, 8);
                    } else {
                        linearSystem.e(solverVariableK4, solverVariableK3, iMin, 5);
                        linearSystem.g(solverVariableK4, solverVariableK3, iMin, 8);
                    }
                } else if (i27 == 2) {
                    ConstraintAnchor.Type type = constraintAnchor.e;
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.d;
                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.b;
                    if (type == type3 || type == type2) {
                        solverVariableK = linearSystem.k(this.V.j(type3));
                        solverVariableK2 = linearSystem.k(this.V.j(type2));
                    } else {
                        solverVariableK = linearSystem.k(this.V.j(ConstraintAnchor.Type.a));
                        solverVariableK2 = linearSystem.k(this.V.j(ConstraintAnchor.Type.c));
                    }
                    ArrayRow arrayRowL = linearSystem.l();
                    int i31 = i23;
                    arrayRowL.d.c(solverVariableK4, -1.0f);
                    arrayRowL.d.c(solverVariableK3, 1.0f);
                    arrayRowL.d.c(solverVariableK2, f2);
                    arrayRowL.d.c(solverVariableK, -f2);
                    linearSystem.c(arrayRowL);
                    if (z2) {
                        z22 = false;
                    }
                    z12 = z4;
                    i10 = i31;
                } else {
                    i10 = i23;
                    z12 = true;
                }
            } else {
                int iMax = Math.max(i23, iMin);
                if (i24 > 0) {
                    iMax = Math.min(i24, iMax);
                }
                linearSystem.e(solverVariableK4, solverVariableK3, iMax, 8);
                z12 = z4;
                i10 = i23;
                z22 = false;
            }
            if (z11 || z8) {
                boolean z23 = z12;
                if (i26 >= 2 && z2 && z23) {
                    linearSystem.f(solverVariableK3, solverVariable, 0, 8);
                    ConstraintAnchor constraintAnchor4 = this.N;
                    boolean z24 = z || constraintAnchor4.f == null;
                    if (!z && (constraintAnchor3 = constraintAnchor4.f) != null) {
                        ConstraintWidget constraintWidget2 = constraintAnchor3.d;
                        if (constraintWidget2.Y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.U;
                            DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                            DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.c;
                            if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                        } else {
                            z24 = false;
                        }
                    }
                    if (z24) {
                        linearSystem.f(solverVariable2, solverVariableK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zH || zH2 || zH3) {
                if (zH && !zH2) {
                    constraintAnchor2 = constraintAnchor2;
                    solverVariableK4 = solverVariableK4;
                    z12 = z12;
                    solverVariable3 = solverVariableK6;
                    z17 = z2;
                    i22 = (z2 && (constraintAnchor.f.d instanceof Barrier)) ? 8 : 5;
                } else if (zH || !zH2) {
                    solverVariable3 = solverVariableK6;
                    if (zH && zH2) {
                        ConstraintWidget constraintWidget3 = constraintAnchor.f.d;
                        ConstraintWidget constraintWidget4 = constraintAnchor2.f.d;
                        z12 = z12;
                        ConstraintWidget constraintWidget5 = this.V;
                        int i32 = 6;
                        if (z22) {
                            if (i27 == 0) {
                                if (i24 != 0 || i10 != 0) {
                                    i20 = 5;
                                    i21 = 5;
                                    z20 = true;
                                    z21 = false;
                                    z14 = true;
                                } else if (solverVariableK5.f && solverVariable3.f) {
                                    linearSystem.e(solverVariableK3, solverVariableK5, constraintAnchor.e(), 8);
                                    linearSystem.e(solverVariableK4, solverVariable3, -constraintAnchor2.e(), 8);
                                    return;
                                } else {
                                    i20 = 8;
                                    i21 = 8;
                                    z20 = false;
                                    z21 = true;
                                    z14 = false;
                                }
                                if ((constraintWidget3 instanceof Barrier) || (constraintWidget4 instanceof Barrier)) {
                                    i11 = i20;
                                    solverVariableK5 = solverVariableK5;
                                    linearSystem = linearSystem;
                                    i27 = i27;
                                    solverVariableK3 = solverVariableK3;
                                    solverVariableK4 = solverVariableK4;
                                    i32 = 6;
                                    z15 = z21;
                                    solverVariable2 = solverVariable2;
                                    z13 = z20;
                                    i12 = 4;
                                } else {
                                    i11 = i20;
                                    solverVariableK5 = solverVariableK5;
                                    linearSystem = linearSystem;
                                    solverVariableK3 = solverVariableK3;
                                    solverVariableK4 = solverVariableK4;
                                    i32 = 6;
                                    z15 = z21;
                                    z13 = z20;
                                    i12 = i21;
                                    i27 = i27;
                                    solverVariable2 = solverVariable2;
                                }
                            } else {
                                if (i27 == 2) {
                                    if ((constraintWidget3 instanceof Barrier) || (constraintWidget4 instanceof Barrier)) {
                                        i11 = 5;
                                    } else {
                                        linearSystem = linearSystem;
                                        i27 = i27;
                                        solverVariableK3 = solverVariableK3;
                                        solverVariableK4 = solverVariableK4;
                                        solverVariableK5 = solverVariableK5;
                                        i32 = 6;
                                        i11 = 5;
                                        i12 = 5;
                                    }
                                    z13 = true;
                                    z14 = true;
                                    z15 = false;
                                    solverVariable2 = solverVariable2;
                                } else if (i27 == 1) {
                                    i11 = 8;
                                } else if (i27 == 3) {
                                    i27 = i27;
                                    if (this.A == -1) {
                                        if (z9) {
                                            linearSystem = linearSystem;
                                            solverVariable2 = solverVariable2;
                                            solverVariableK3 = solverVariableK3;
                                            solverVariableK4 = solverVariableK4;
                                            solverVariableK5 = solverVariableK5;
                                            i32 = z2 ? 5 : 4;
                                        } else {
                                            linearSystem = linearSystem;
                                            solverVariable2 = solverVariable2;
                                            solverVariableK3 = solverVariableK3;
                                            solverVariableK4 = solverVariableK4;
                                            solverVariableK5 = solverVariableK5;
                                            i32 = 8;
                                        }
                                        i11 = 8;
                                    } else {
                                        if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i18 = 5;
                                                i19 = 4;
                                            } else {
                                                i18 = 8;
                                                i19 = 5;
                                            }
                                            i12 = i19;
                                            z13 = true;
                                            z14 = true;
                                            z15 = true;
                                        } else {
                                            if (i24 > 0) {
                                                linearSystem = linearSystem;
                                                solverVariable2 = solverVariable2;
                                                solverVariableK3 = solverVariableK3;
                                                solverVariableK4 = solverVariableK4;
                                                solverVariableK5 = solverVariableK5;
                                                i32 = 6;
                                                i11 = 5;
                                            } else if (i24 != 0 || i10 != 0) {
                                                linearSystem = linearSystem;
                                                solverVariable2 = solverVariable2;
                                                solverVariableK3 = solverVariableK3;
                                                solverVariableK4 = solverVariableK4;
                                                solverVariableK5 = solverVariableK5;
                                                i32 = 6;
                                                i11 = 5;
                                                i12 = 4;
                                            } else if (z9) {
                                                i18 = (constraintWidget3 == constraintWidget5 || constraintWidget4 == constraintWidget5) ? 5 : 4;
                                                i12 = 4;
                                                z13 = true;
                                                z14 = true;
                                                z15 = true;
                                            } else {
                                                linearSystem = linearSystem;
                                                solverVariable2 = solverVariable2;
                                                solverVariableK3 = solverVariableK3;
                                                solverVariableK4 = solverVariableK4;
                                                solverVariableK5 = solverVariableK5;
                                                i32 = 6;
                                                i11 = 5;
                                                i12 = 8;
                                            }
                                            z13 = true;
                                            z14 = true;
                                            z15 = true;
                                        }
                                        i11 = i18;
                                        linearSystem = linearSystem;
                                    }
                                    i12 = 5;
                                    z13 = true;
                                    z14 = true;
                                    z15 = true;
                                } else {
                                    i11 = 5;
                                    i12 = 4;
                                    z13 = false;
                                    z14 = false;
                                }
                                i12 = 4;
                                z13 = true;
                                z14 = true;
                                z15 = false;
                                solverVariable2 = solverVariable2;
                            }
                            if (z14 || solverVariableK5 != solverVariable3 || constraintWidget3 == constraintWidget5) {
                                z16 = true;
                            } else {
                                z14 = false;
                                z16 = false;
                            }
                            if (z13) {
                                if (z22 && !z7 && !z9 && solverVariableK5 == solverVariable && solverVariable3 == solverVariable2) {
                                    i17 = 8;
                                    z17 = false;
                                    i16 = 8;
                                    z19 = false;
                                } else {
                                    z17 = z2;
                                    z19 = z16;
                                    i16 = i11;
                                    i17 = i32;
                                }
                                SolverVariable solverVariable4 = solverVariableK5;
                                constraintWidget = constraintWidget4;
                                linearSystem.b(solverVariableK3, solverVariable4, constraintAnchor.e(), f, solverVariable3, solverVariableK4, constraintAnchor2.e(), i17);
                                solverVariableK5 = solverVariable4;
                                i11 = i16;
                                z16 = z19;
                            } else {
                                constraintWidget = constraintWidget4;
                                z17 = z2;
                            }
                            if (this.i0 != 8 && ((hashSet = constraintAnchor2.a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z14) {
                                if (z17 && solverVariableK5 != solverVariable3 && !z22 && ((constraintWidget3 instanceof Barrier) || (constraintWidget instanceof Barrier))) {
                                    i11 = 6;
                                }
                                linearSystem.f(solverVariableK3, solverVariableK5, constraintAnchor.e(), i11);
                                linearSystem.g(solverVariableK4, solverVariable3, -constraintAnchor2.e(), i11);
                            }
                            if (z17 || !z10 || (constraintWidget3 instanceof Barrier) || (constraintWidget instanceof Barrier) || constraintWidget == constraintWidget5) {
                                iMin2 = i12;
                                z18 = z16;
                            } else {
                                iMin2 = 6;
                                i11 = 6;
                                z18 = true;
                            }
                            if (z18) {
                                if (z15 && (!z9 || z3)) {
                                    if (constraintWidget3 != constraintWidget5 && constraintWidget != constraintWidget5) {
                                        i32 = iMin2;
                                    }
                                    if ((constraintWidget3 instanceof Guideline) || (constraintWidget instanceof Guideline)) {
                                        i32 = 5;
                                    }
                                    if ((constraintWidget3 instanceof Barrier) || (constraintWidget instanceof Barrier)) {
                                        i32 = 5;
                                    }
                                    if (z9) {
                                        i15 = 5;
                                    } else {
                                        i15 = i32;
                                    }
                                    iMin2 = Math.max(i15, iMin2);
                                }
                                if (z17) {
                                    iMin2 = Math.min(i11, iMin2);
                                    if (z6 || z9 || !(constraintWidget3 == constraintWidget5 || constraintWidget == constraintWidget5)) {
                                        i14 = iMin2;
                                    } else {
                                        i14 = 4;
                                    }
                                } else {
                                    i14 = iMin2;
                                }
                                linearSystem.e(solverVariableK3, solverVariableK5, constraintAnchor.e(), i14);
                                linearSystem.e(solverVariableK4, solverVariable3, -constraintAnchor2.e(), i14);
                            }
                            if (z17) {
                                if (solverVariable == solverVariableK5) {
                                    iE = constraintAnchor.e();
                                } else {
                                    iE = 0;
                                }
                                if (solverVariableK5 != solverVariable) {
                                    linearSystem.f(solverVariableK3, solverVariable, iE, 5);
                                }
                            }
                            if (z17 || !z22 || i3 != 0 || i10 != 0) {
                                i13 = 5;
                            } else if (z22 && i27 == 3) {
                                linearSystem.f(solverVariableK4, solverVariableK3, 0, 8);
                                i13 = 5;
                            } else {
                                i13 = 5;
                                linearSystem.f(solverVariableK4, solverVariableK3, 0, 5);
                            }
                        } else {
                            if (solverVariableK5.f && solverVariable3.f) {
                                linearSystem.b(solverVariableK3, solverVariableK5, constraintAnchor.e(), f, solverVariable3, solverVariableK4, constraintAnchor2.e(), 8);
                                if (z2 && z12) {
                                    int iE2 = constraintAnchor2.f != null ? constraintAnchor2.e() : 0;
                                    if (solverVariable3 != solverVariable2) {
                                        linearSystem.f(solverVariable2, solverVariableK4, iE2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i11 = 5;
                            i12 = 4;
                            z13 = true;
                            z14 = true;
                        }
                        z15 = false;
                        if (z14) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (z13) {
                            if (z22) {
                                z17 = z2;
                                z19 = z16;
                                i16 = i11;
                                i17 = i32;
                            } else {
                                z17 = z2;
                                z19 = z16;
                                i16 = i11;
                                i17 = i32;
                            }
                            SolverVariable solverVariable5 = solverVariableK5;
                            constraintWidget = constraintWidget4;
                            linearSystem.b(solverVariableK3, solverVariable5, constraintAnchor.e(), f, solverVariable3, solverVariableK4, constraintAnchor2.e(), i17);
                            solverVariableK5 = solverVariable5;
                            i11 = i16;
                            z16 = z19;
                        } else {
                            constraintWidget = constraintWidget4;
                            z17 = z2;
                        }
                        if (this.i0 != 8) {
                        }
                        if (z14) {
                            if (z17) {
                                i11 = 6;
                            }
                            linearSystem.f(solverVariableK3, solverVariableK5, constraintAnchor.e(), i11);
                            linearSystem.g(solverVariableK4, solverVariable3, -constraintAnchor2.e(), i11);
                        }
                        if (z17) {
                            iMin2 = i12;
                            z18 = z16;
                        } else {
                            iMin2 = i12;
                            z18 = z16;
                        }
                        if (z18) {
                            if (z15) {
                                if (constraintWidget3 != constraintWidget5) {
                                    i32 = iMin2;
                                }
                                if (constraintWidget3 instanceof Guideline) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (constraintWidget3 instanceof Barrier) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (z9) {
                                    i15 = 5;
                                } else {
                                    i15 = i32;
                                }
                                iMin2 = Math.max(i15, iMin2);
                            }
                            if (z17) {
                                iMin2 = Math.min(i11, iMin2);
                                if (z6) {
                                    i14 = iMin2;
                                } else {
                                    i14 = iMin2;
                                }
                            } else {
                                i14 = iMin2;
                            }
                            linearSystem.e(solverVariableK3, solverVariableK5, constraintAnchor.e(), i14);
                            linearSystem.e(solverVariableK4, solverVariable3, -constraintAnchor2.e(), i14);
                        }
                        if (z17) {
                            if (solverVariable == solverVariableK5) {
                                iE = constraintAnchor.e();
                            } else {
                                iE = 0;
                            }
                            if (solverVariableK5 != solverVariable) {
                                linearSystem.f(solverVariableK3, solverVariable, iE, 5);
                            }
                        }
                        if (z17) {
                            i13 = 5;
                        } else {
                            i13 = 5;
                        }
                    }
                    i22 = i13;
                } else {
                    solverVariable3 = solverVariableK6;
                    linearSystem.e(solverVariableK4, solverVariable3, -constraintAnchor2.e(), 8);
                    if (z2) {
                        linearSystem.f(solverVariableK3, solverVariable, 0, 5);
                        constraintAnchor2 = constraintAnchor2;
                        i13 = 5;
                        solverVariableK4 = solverVariableK4;
                        z12 = z12;
                    }
                    z17 = z2;
                    i22 = i13;
                }
                if (z17 || !z12) {
                    return;
                }
                int iE3 = constraintAnchor2.f != null ? constraintAnchor2.e() : 0;
                if (solverVariable3 != solverVariable2) {
                    linearSystem.f(solverVariable2, solverVariableK4, iE3, i22);
                    return;
                }
                return;
            }
            solverVariable3 = solverVariableK6;
            i13 = 5;
            z17 = z2;
            i22 = i13;
            if (z17) {
                return;
            } else {
                return;
            }
        }
        if (z5) {
            linearSystem.e(solverVariableK4, solverVariableK3, 0, 3);
            if (i3 > 0) {
                linearSystem.f(solverVariableK4, solverVariableK3, i3, i9);
            }
            if (i4 < Integer.MAX_VALUE) {
                linearSystem.g(solverVariableK4, solverVariableK3, i4, i9);
            }
        } else {
            linearSystem.e(solverVariableK4, solverVariableK3, iMin, i9);
        }
        z12 = z4;
        i10 = i23;
        if (z11) {
        }
        boolean z25 = z12;
        if (i26 >= 2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean u(int i) {
        if (i == 0) {
            if ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.K.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) + (this.N.f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[3] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[4] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[5] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[6] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[7] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[8] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[0] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static void H(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void I(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void q(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f == null) {
            return;
        }
        h50.x("    ", str, sb, " : [ '");
        sb.append(constraintAnchor.f);
        sb.append("'");
        if (constraintAnchor.h != Integer.MIN_VALUE || constraintAnchor.g != 0) {
            sb.append(",");
            sb.append(constraintAnchor.g);
            if (constraintAnchor.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        return this.g && this.i0 != 8;
    }

    public boolean B() {
        if (this.k) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public boolean C() {
        if (this.l) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public void D() {
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.V = null;
        this.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.W = 0;
        this.X = 0;
        this.Y = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.U;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.a;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.h0 = null;
        this.i0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        float[] fArr = this.m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void E() {
        ConstraintWidget constraintWidget = this.V;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            ((ConstraintWidgetContainer) constraintWidget).getClass();
        }
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintAnchor) arrayList.get(i)).j();
        }
    }

    public void G(Cache cache) {
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.Q.k();
        this.O.k();
        this.P.k();
    }

    public final void J(int i) {
        this.c0 = i;
        this.E = i > 0;
    }

    public final void K(int i, int i2) {
        if (this.k) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.a0 = i;
        this.W = i2 - i;
        this.k = true;
    }

    public final void L(int i, int i2) {
        if (this.l) {
            return;
        }
        this.K.l(i);
        this.M.l(i2);
        this.b0 = i;
        this.X = i2 - i;
        if (this.E) {
            this.N.l(i + this.c0);
        }
        this.l = true;
    }

    public final void M(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public final void N(DimensionBehaviour dimensionBehaviour) {
        this.U[0] = dimensionBehaviour;
    }

    public final void O(DimensionBehaviour dimensionBehaviour) {
        this.U[1] = dimensionBehaviour;
    }

    public final void P(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void Q(boolean z, boolean z2) {
        int i;
        int i2;
        HorizontalWidgetRun horizontalWidgetRun = this.d;
        boolean z3 = z & horizontalWidgetRun.g;
        VerticalWidgetRun verticalWidgetRun = this.e;
        boolean z4 = z2 & verticalWidgetRun.g;
        int i3 = horizontalWidgetRun.h.g;
        int i4 = verticalWidgetRun.h.g;
        int i5 = horizontalWidgetRun.i.g;
        int i6 = verticalWidgetRun.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.a0 = i3;
        }
        if (z4) {
            this.b0 = i4;
        }
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.U;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.a;
        if (z3) {
            if (dimensionBehaviourArr[0] == dimensionBehaviour && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i10 = this.d0;
            if (i8 < i10) {
                this.W = i10;
            }
        }
        if (z4) {
            if (dimensionBehaviourArr[1] == dimensionBehaviour && i9 < (i = this.X)) {
                i9 = i;
            }
            this.X = i9;
            int i11 = this.e0;
            if (i9 < i11) {
                this.X = i11;
            }
        }
    }

    public final void b(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.a(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            c(linearSystem, constraintWidgetContainer.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((ConstraintAnchor) it.next()).d.b(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((ConstraintAnchor) it2.next()).d.b(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((ConstraintAnchor) it3.next()).d.b(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((ConstraintAnchor) it4.next()).d.b(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((ConstraintAnchor) it5.next()).d.b(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x020c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0214  */
    /* JADX WARN: Code duplicated, block: B:129:0x021d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0223  */
    /* JADX WARN: Code duplicated, block: B:132:0x022e  */
    /* JADX WARN: Code duplicated, block: B:135:0x023a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0243  */
    /* JADX WARN: Code duplicated, block: B:146:0x0269  */
    /* JADX WARN: Code duplicated, block: B:158:0x028f  */
    /* JADX WARN: Code duplicated, block: B:162:0x029a  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:169:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:171:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:184:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:188:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:251:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:253:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:261:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:265:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:268:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:272:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:276:0x0407  */
    /* JADX WARN: Code duplicated, block: B:278:0x040c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:281:0x0412  */
    /* JADX WARN: Code duplicated, block: B:284:0x0418  */
    /* JADX WARN: Code duplicated, block: B:289:0x0424  */
    /* JADX WARN: Code duplicated, block: B:292:0x042b  */
    /* JADX WARN: Code duplicated, block: B:295:0x0431  */
    /* JADX WARN: Code duplicated, block: B:297:0x0434  */
    /* JADX WARN: Code duplicated, block: B:300:0x044f  */
    /* JADX WARN: Code duplicated, block: B:335:0x0548  */
    /* JADX WARN: Code duplicated, block: B:337:0x055e  */
    /* JADX WARN: Code duplicated, block: B:353:0x05af  */
    /* JADX WARN: Code duplicated, block: B:356:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:357:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:359:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:396:0x0681  */
    /* JADX WARN: Code duplicated, block: B:398:0x0687  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:400:0x0690  */
    /* JADX WARN: Code duplicated, block: B:401:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:404:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:407:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127  */
    /* JADX WARN: Code duplicated, block: B:76:0x0131  */
    /* JADX WARN: Code duplicated, block: B:80:0x0149  */
    /* JADX WARN: Code duplicated, block: B:83:0x0154  */
    /* JADX WARN: Code duplicated, block: B:87:0x016c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0177  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r61v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    public void c(LinearSystem linearSystem, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ?? r19;
        boolean[] zArr;
        int i6;
        boolean z2;
        HashSet hashSet;
        ConstraintWidget constraintWidget;
        ConstraintWidgetContainer constraintWidgetContainer;
        WeakReference weakReference;
        WeakReference weakReference2;
        ConstraintWidget constraintWidget2;
        ConstraintWidgetContainer constraintWidgetContainer2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        ConstraintAnchor constraintAnchor;
        boolean[] zArr3;
        boolean z3;
        ?? r12;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        DimensionBehaviour[] dimensionBehaviourArr;
        DimensionBehaviour dimensionBehaviour;
        DimensionBehaviour dimensionBehaviour2;
        boolean z5;
        DimensionBehaviour dimensionBehaviour3;
        boolean z6;
        int i12;
        float f;
        int i13;
        int i14;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        int i15;
        int i16;
        boolean z7;
        int i17;
        boolean z8;
        boolean z9;
        ConstraintAnchor constraintAnchor2;
        int i18;
        boolean z10;
        ?? r20;
        ?? r110;
        boolean z11;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        float f2;
        ?? r27;
        VerticalWidgetRun verticalWidgetRun;
        boolean z12;
        HorizontalWidgetRun horizontalWidgetRun;
        int i25;
        int i26;
        int i27;
        ?? Y;
        boolean z13;
        HorizontalWidgetRun horizontalWidgetRun2;
        VerticalWidgetRun verticalWidgetRun2;
        boolean z14;
        ArrayList arrayList;
        int size;
        int i28;
        HashSet hashSet2;
        LinearSystem linearSystem2 = linearSystem;
        ConstraintAnchor constraintAnchor3 = this.J;
        SolverVariable solverVariableK = linearSystem2.k(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = this.L;
        SolverVariable solverVariableK2 = linearSystem2.k(constraintAnchor4);
        ConstraintAnchor constraintAnchor5 = this.K;
        SolverVariable solverVariableK3 = linearSystem2.k(constraintAnchor5);
        ConstraintAnchor constraintAnchor6 = this.M;
        SolverVariable solverVariableK4 = linearSystem2.k(constraintAnchor6);
        ConstraintAnchor constraintAnchor7 = this.N;
        SolverVariable solverVariableK5 = linearSystem2.k(constraintAnchor7);
        ConstraintWidget constraintWidget3 = this.V;
        DimensionBehaviour dimensionBehaviour4 = DimensionBehaviour.b;
        if (constraintWidget3 != null) {
            DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget3.U;
            i2 = 0;
            i4 = dimensionBehaviourArr2[0] == dimensionBehaviour4 ? 1 : 0;
            int i29 = dimensionBehaviourArr2[1] == dimensionBehaviour4 ? 1 : 0;
            int i30 = this.q;
            if (i30 != 1) {
                i = 1;
                if (i30 == 2) {
                    i4 = 0;
                } else if (i30 != 3) {
                }
                i3 = i29;
            } else {
                i = 1;
                i3 = 0;
            }
            i5 = this.i0;
            r19 = i3;
            zArr = this.T;
            if (i5 == 8) {
                arrayList = this.S;
                size = arrayList.size();
                i6 = i4;
                i28 = i2;
                while (true) {
                    if (i28 < size) {
                        if (!zArr[i2] || zArr[i]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i31 = size;
                    hashSet2 = ((ConstraintAnchor) arrayList.get(i28)).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i28++;
                    size = i31;
                }
            } else {
                i6 = i4;
            }
            z2 = this.k;
            if (z2 || this.l) {
                if (z2) {
                    linearSystem2.d(solverVariableK, this.a0);
                    linearSystem2.d(solverVariableK2, this.a0 + this.W);
                    if (i6 != 0 && (constraintWidget2 = this.V) != null) {
                        constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget2;
                        weakReference3 = constraintWidgetContainer2.I0;
                        if (weakReference3 != null || weakReference3.get() == null || constraintAnchor3.d() > ((ConstraintAnchor) constraintWidgetContainer2.I0.get()).d()) {
                            constraintWidgetContainer2.I0 = new WeakReference(constraintAnchor3);
                        }
                        weakReference4 = constraintWidgetContainer2.K0;
                        if (weakReference4 != null || weakReference4.get() == null || constraintAnchor4.d() > ((ConstraintAnchor) constraintWidgetContainer2.K0.get()).d()) {
                            constraintWidgetContainer2.K0 = new WeakReference(constraintAnchor4);
                        }
                    }
                }
                if (this.l) {
                    linearSystem2.d(solverVariableK3, this.b0);
                    linearSystem2.d(solverVariableK4, this.b0 + this.X);
                    hashSet = constraintAnchor7.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        linearSystem2.d(solverVariableK5, this.b0 + this.c0);
                    }
                    if (r19 != 0 && (constraintWidget = this.V) != null) {
                        constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget;
                        weakReference = constraintWidgetContainer.H0;
                        if (weakReference != null || weakReference.get() == null || constraintAnchor5.d() > ((ConstraintAnchor) constraintWidgetContainer.H0.get()).d()) {
                            constraintWidgetContainer.H0 = new WeakReference(constraintAnchor5);
                        }
                        weakReference2 = constraintWidgetContainer.J0;
                        if (weakReference2 != null || weakReference2.get() == null || constraintAnchor6.d() > ((ConstraintAnchor) constraintWidgetContainer.J0.get()).d()) {
                            constraintWidgetContainer.J0 = new WeakReference(constraintAnchor6);
                        }
                    }
                }
                if (this.k && this.l) {
                    ?? r13 = i2;
                    this.k = r13;
                    this.l = r13;
                    return;
                }
            }
            zArr2 = this.f;
            if (z || (horizontalWidgetRun2 = this.d) == null || (verticalWidgetRun2 = this.e) == null) {
                constraintAnchor = constraintAnchor7;
                zArr3 = zArr2;
            } else {
                constraintAnchor = constraintAnchor7;
                DependencyNode dependencyNode = horizontalWidgetRun2.h;
                zArr3 = zArr2;
                if (dependencyNode.j && horizontalWidgetRun2.i.j && verticalWidgetRun2.h.j && verticalWidgetRun2.i.j) {
                    linearSystem2.d(solverVariableK, dependencyNode.g);
                    linearSystem2.d(solverVariableK2, this.d.i.g);
                    linearSystem2.d(solverVariableK3, this.e.h.g);
                    linearSystem2.d(solverVariableK4, this.e.i.g);
                    linearSystem2.d(solverVariableK5, this.e.k.g);
                    if (this.V == null) {
                        z14 = false;
                    } else {
                        if (i6 != 0 && zArr3[0] && !y()) {
                            linearSystem2.f(linearSystem2.k(this.V.L), solverVariableK2, 0, 8);
                        }
                        if (r19 == 0 || !zArr3[i] || z()) {
                            z14 = false;
                        } else {
                            z14 = false;
                            linearSystem2.f(linearSystem2.k(this.V.M), solverVariableK4, 0, 8);
                        }
                    }
                    this.k = z14;
                    this.l = z14;
                    return;
                }
            }
            if (this.V != null) {
                if (x(0)) {
                    ((ConstraintWidgetContainer) this.V).T(this, 0);
                    int i32 = i;
                    i27 = i32 == true ? 1 : 0;
                    Y = i32;
                } else {
                    i27 = i;
                    Y = y();
                }
                if (x(i27)) {
                    ((ConstraintWidgetContainer) this.V).T(this, i27);
                    z13 = true;
                } else {
                    z13 = z();
                }
                if (Y != 0 && i6 != 0 && this.i0 != 8 && constraintAnchor3.f == null && constraintAnchor4.f == null) {
                    linearSystem2.f(linearSystem2.k(this.V.L), solverVariableK2, 0, 1);
                }
                if (!z13 && r19 != 0 && this.i0 != 8 && constraintAnchor5.f == null && constraintAnchor6.f == null && constraintAnchor == null) {
                    linearSystem2.f(linearSystem2.k(this.V.M), solverVariableK4, 0, 1);
                }
                z3 = z13;
                r12 = Y;
            } else {
                constraintAnchor3 = constraintAnchor3;
                z3 = false;
                r12 = 0;
            }
            i7 = this.W;
            i8 = this.d0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.X;
            z4 = z3;
            i10 = this.e0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            dimensionBehaviourArr = this.U;
            dimensionBehaviour = dimensionBehaviourArr[0];
            dimensionBehaviour2 = DimensionBehaviour.c;
            if (dimensionBehaviour != dimensionBehaviour2) {
                z5 = true;
            } else {
                z5 = false;
            }
            dimensionBehaviour3 = dimensionBehaviourArr[1];
            if (dimensionBehaviour3 != dimensionBehaviour2) {
                z6 = true;
            } else {
                z6 = false;
            }
            i12 = this.Z;
            this.A = i12;
            f = this.Y;
            this.B = f;
            i13 = this.r;
            i14 = this.s;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                solverVariable = solverVariableK4;
                if (this.i0 != 8) {
                    if (dimensionBehaviour == dimensionBehaviour2 || i13 != 0) {
                        i15 = i13;
                    } else {
                        i15 = 3;
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour2 || i14 != 0) {
                        i26 = i14;
                    } else {
                        i26 = 3;
                    }
                    if (dimensionBehaviour != dimensionBehaviour2 && dimensionBehaviour3 == dimensionBehaviour2) {
                        solverVariable2 = solverVariableK5;
                        if (i15 == 3 && i26 == 3) {
                            if (i12 == -1) {
                                if (z5 && !z6) {
                                    this.A = 0;
                                } else if (!z5 && z6) {
                                    this.A = 1;
                                    if (i12 == -1) {
                                        this.B = 1.0f / f;
                                    }
                                }
                            }
                            if (this.A == 0 && (!constraintAnchor5.h() || !constraintAnchor6.h())) {
                                this.A = 1;
                            } else if (this.A == 1 && (!constraintAnchor3.h() || !constraintAnchor4.h())) {
                                this.A = 0;
                            }
                            if (this.A == -1 && (!constraintAnchor5.h() || !constraintAnchor6.h() || !constraintAnchor3.h() || !constraintAnchor4.h())) {
                                if (constraintAnchor5.h() && constraintAnchor6.h()) {
                                    this.A = 0;
                                } else if (constraintAnchor3.h() && constraintAnchor4.h()) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            if (this.A == -1) {
                                int i33 = this.u;
                                if (i33 > 0 && this.x == 0) {
                                    this.A = 0;
                                } else if (i33 == 0 && this.x > 0) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                        }
                        i6 = i6;
                        z7 = true;
                        i16 = i26;
                        int[] iArr = this.t;
                        iArr[0] = i15;
                        iArr[1] = i16;
                        if (z7) {
                            int i34 = this.A;
                            i17 = -1;
                            boolean z15 = i34 != 0 || i34 == -1;
                            if (z7 || !((i25 = this.A) == 1 || i25 == i17)) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            if (dimensionBehaviourArr[0] == dimensionBehaviour4 || !(this instanceof ConstraintWidgetContainer)) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (z9) {
                                i8 = 0;
                            }
                            constraintAnchor2 = this.Q;
                            boolean z16 = !constraintAnchor2.h();
                            boolean z17 = zArr[0];
                            boolean z18 = zArr[1];
                            i18 = this.o;
                            int[] iArr2 = this.C;
                            if (i18 == 2 && !this.k) {
                                if (z && (horizontalWidgetRun = this.d) != null) {
                                    DependencyNode dependencyNode2 = horizontalWidgetRun.h;
                                    z12 = i6 == true ? 1 : 0;
                                    if (dependencyNode2.j && horizontalWidgetRun.i.j) {
                                        if (z) {
                                            linearSystem2.d(solverVariableK, dependencyNode2.g);
                                            linearSystem2.d(solverVariableK2, this.d.i.g);
                                            if (this.V != null && z12 && zArr3[0] && !y()) {
                                                linearSystem2.f(linearSystem2.k(this.V.L), solverVariableK2, 0, 8);
                                            }
                                        }
                                        i6 = z12 ? 1 : 0;
                                    }
                                    if (z || (verticalWidgetRun = this.e) == null) {
                                        solverVariable3 = 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05af: MOVE (r4v2 'solverVariable3' androidx.constraintlayout.core.SolverVariable) = (r34v0 androidx.constraintlayout.core.SolverVariable) (LINE:1457) in method: androidx.constraintlayout.core.widgets.ConstraintWidget.c(androidx.constraintlayout.core.LinearSystem, boolean):void, file: classes6.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 androidx.constraintlayout.core.SolverVariable
                                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                            */
                                        /*
                                            Method dump skipped, instruction units count: 1946
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.c(androidx.constraintlayout.core.LinearSystem, boolean):void");
                                    }

                                    public boolean d() {
                                        return this.i0 != 8;
                                    }

                                    public final void f(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
                                        boolean z;
                                        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.h;
                                        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.g;
                                        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.a;
                                        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.b;
                                        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.c;
                                        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.d;
                                        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.f;
                                        if (type == type9) {
                                            if (type2 != type9) {
                                                if (type2 == type5 || type2 == type7) {
                                                    f(type5, constraintWidget, type2, 0);
                                                    f(type7, constraintWidget, type2, 0);
                                                    j(type9).a(constraintWidget.j(type2), 0);
                                                    return;
                                                } else {
                                                    if (type2 == type6 || type2 == type8) {
                                                        f(type6, constraintWidget, type2, 0);
                                                        f(type8, constraintWidget, type2, 0);
                                                        j(type9).a(constraintWidget.j(type2), 0);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                            ConstraintAnchor constraintAnchorJ = j(type5);
                                            ConstraintAnchor constraintAnchorJ2 = j(type7);
                                            ConstraintAnchor constraintAnchorJ3 = j(type6);
                                            ConstraintAnchor constraintAnchorJ4 = j(type8);
                                            boolean z2 = true;
                                            if ((constraintAnchorJ == null || !constraintAnchorJ.h()) && (constraintAnchorJ2 == null || !constraintAnchorJ2.h())) {
                                                f(type5, constraintWidget, type5, 0);
                                                f(type7, constraintWidget, type7, 0);
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if ((constraintAnchorJ3 == null || !constraintAnchorJ3.h()) && (constraintAnchorJ4 == null || !constraintAnchorJ4.h())) {
                                                f(type6, constraintWidget, type6, 0);
                                                f(type8, constraintWidget, type8, 0);
                                            } else {
                                                z2 = false;
                                            }
                                            if (z && z2) {
                                                j(type9).a(constraintWidget.j(type9), 0);
                                                return;
                                            } else if (z) {
                                                j(type4).a(constraintWidget.j(type4), 0);
                                                return;
                                            } else {
                                                if (z2) {
                                                    j(type3).a(constraintWidget.j(type3), 0);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        if (type == type4 && (type2 == type5 || type2 == type7)) {
                                            ConstraintAnchor constraintAnchorJ5 = j(type5);
                                            ConstraintAnchor constraintAnchorJ6 = constraintWidget.j(type2);
                                            ConstraintAnchor constraintAnchorJ7 = j(type7);
                                            constraintAnchorJ5.a(constraintAnchorJ6, 0);
                                            constraintAnchorJ7.a(constraintAnchorJ6, 0);
                                            j(type4).a(constraintAnchorJ6, 0);
                                            return;
                                        }
                                        if (type == type3 && (type2 == type6 || type2 == type8)) {
                                            ConstraintAnchor constraintAnchorJ8 = constraintWidget.j(type2);
                                            j(type6).a(constraintAnchorJ8, 0);
                                            j(type8).a(constraintAnchorJ8, 0);
                                            j(type3).a(constraintAnchorJ8, 0);
                                            return;
                                        }
                                        if (type == type4 && type2 == type4) {
                                            j(type5).a(constraintWidget.j(type5), 0);
                                            j(type7).a(constraintWidget.j(type7), 0);
                                            j(type4).a(constraintWidget.j(type2), 0);
                                            return;
                                        }
                                        if (type == type3 && type2 == type3) {
                                            j(type6).a(constraintWidget.j(type6), 0);
                                            j(type8).a(constraintWidget.j(type8), 0);
                                            j(type3).a(constraintWidget.j(type2), 0);
                                            return;
                                        }
                                        ConstraintAnchor constraintAnchorJ9 = j(type);
                                        ConstraintAnchor constraintAnchorJ10 = constraintWidget.j(type2);
                                        if (constraintAnchorJ9.i(constraintAnchorJ10)) {
                                            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.e;
                                            if (type == type10) {
                                                ConstraintAnchor constraintAnchorJ11 = j(type6);
                                                ConstraintAnchor constraintAnchorJ12 = j(type8);
                                                if (constraintAnchorJ11 != null) {
                                                    constraintAnchorJ11.j();
                                                }
                                                if (constraintAnchorJ12 != null) {
                                                    constraintAnchorJ12.j();
                                                }
                                            } else if (type == type6 || type == type8) {
                                                ConstraintAnchor constraintAnchorJ13 = j(type10);
                                                if (constraintAnchorJ13 != null) {
                                                    constraintAnchorJ13.j();
                                                }
                                                ConstraintAnchor constraintAnchorJ14 = j(type9);
                                                if (constraintAnchorJ14.f != constraintAnchorJ10) {
                                                    constraintAnchorJ14.j();
                                                }
                                                ConstraintAnchor constraintAnchorF = j(type).f();
                                                ConstraintAnchor constraintAnchorJ15 = j(type3);
                                                if (constraintAnchorJ15.h()) {
                                                    constraintAnchorF.j();
                                                    constraintAnchorJ15.j();
                                                }
                                            } else if (type == type5 || type == type7) {
                                                ConstraintAnchor constraintAnchorJ16 = j(type9);
                                                if (constraintAnchorJ16.f != constraintAnchorJ10) {
                                                    constraintAnchorJ16.j();
                                                }
                                                ConstraintAnchor constraintAnchorF2 = j(type).f();
                                                ConstraintAnchor constraintAnchorJ17 = j(type4);
                                                if (constraintAnchorJ17.h()) {
                                                    constraintAnchorF2.j();
                                                    constraintAnchorJ17.j();
                                                }
                                            }
                                            constraintAnchorJ9.a(constraintAnchorJ10, i);
                                        }
                                    }

                                    public final void g(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
                                        if (constraintAnchor.d == this) {
                                            f(constraintAnchor.e, constraintAnchor2.d, constraintAnchor2.e, i);
                                        }
                                    }

                                    public final void h(LinearSystem linearSystem) {
                                        linearSystem.k(this.J);
                                        linearSystem.k(this.K);
                                        linearSystem.k(this.L);
                                        linearSystem.k(this.M);
                                        if (this.c0 > 0) {
                                            linearSystem.k(this.N);
                                        }
                                    }

                                    public final void i() {
                                        if (this.d == null) {
                                            this.d = new HorizontalWidgetRun(this);
                                        }
                                        if (this.e == null) {
                                            this.e = new VerticalWidgetRun(this);
                                        }
                                    }

                                    public final DimensionBehaviour k(int i) {
                                        if (i == 0) {
                                            return this.U[0];
                                        }
                                        if (i == 1) {
                                            return this.U[1];
                                        }
                                        return null;
                                    }

                                    public final int l() {
                                        if (this.i0 == 8) {
                                            return 0;
                                        }
                                        return this.X;
                                    }

                                    public final ConstraintWidget m(int i) {
                                        ConstraintAnchor constraintAnchor;
                                        ConstraintAnchor constraintAnchor2;
                                        if (i != 0) {
                                            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.M).f) != null && constraintAnchor2.f == constraintAnchor) {
                                                return constraintAnchor2.d;
                                            }
                                            return null;
                                        }
                                        ConstraintAnchor constraintAnchor3 = this.L;
                                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
                                        if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
                                            return null;
                                        }
                                        return constraintAnchor4.d;
                                    }

                                    public final ConstraintWidget n(int i) {
                                        ConstraintAnchor constraintAnchor;
                                        ConstraintAnchor constraintAnchor2;
                                        if (i != 0) {
                                            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.K).f) != null && constraintAnchor2.f == constraintAnchor) {
                                                return constraintAnchor2.d;
                                            }
                                            return null;
                                        }
                                        ConstraintAnchor constraintAnchor3 = this.J;
                                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
                                        if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
                                            return null;
                                        }
                                        return constraintAnchor4.d;
                                    }

                                    public void o(StringBuilder sb) {
                                        sb.append("  " + this.j + ":{\n");
                                        StringBuilder sb2 = new StringBuilder("    actualWidth:");
                                        sb2.append(this.W);
                                        sb.append(sb2.toString());
                                        sb.append("\n");
                                        sb.append("    actualHeight:" + this.X);
                                        sb.append("\n");
                                        sb.append("    actualLeft:" + this.a0);
                                        sb.append("\n");
                                        sb.append("    actualTop:" + this.b0);
                                        sb.append("\n");
                                        q(sb, "left", this.J);
                                        q(sb, "top", this.K);
                                        q(sb, "right", this.L);
                                        q(sb, "bottom", this.M);
                                        q(sb, "baseline", this.N);
                                        q(sb, "centerX", this.O);
                                        q(sb, "centerY", this.P);
                                        int i = this.W;
                                        int i2 = this.d0;
                                        int[] iArr = this.C;
                                        int i3 = iArr[0];
                                        int i4 = this.u;
                                        int i5 = this.r;
                                        float f = this.w;
                                        float[] fArr = this.m0;
                                        float f2 = fArr[0];
                                        p(sb, "    width", i, i2, i3, i4, i5, f);
                                        int i6 = this.X;
                                        int i7 = this.e0;
                                        int i8 = iArr[1];
                                        int i9 = this.x;
                                        int i10 = this.s;
                                        float f3 = this.z;
                                        float f4 = fArr[1];
                                        p(sb, "    height", i6, i7, i8, i9, i10, f3);
                                        float f5 = this.Y;
                                        int i11 = this.Z;
                                        if (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            sb.append("    dimensionRatio");
                                            sb.append(" :  [");
                                            sb.append(f5);
                                            sb.append(",");
                                            sb.append(i11);
                                            sb.append("");
                                            sb.append("],\n");
                                        }
                                        I(sb, "    horizontalBias", this.f0, 0.5f);
                                        I(sb, "    verticalBias", this.g0, 0.5f);
                                        H(this.k0, 0, "    horizontalChainStyle", sb);
                                        H(this.l0, 0, "    verticalChainStyle", sb);
                                        sb.append("  }");
                                    }

                                    public final int r() {
                                        if (this.i0 == 8) {
                                            return 0;
                                        }
                                        return this.W;
                                    }

                                    public final int s() {
                                        ConstraintWidget constraintWidget = this.V;
                                        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.a0 : ((ConstraintWidgetContainer) constraintWidget).y0 + this.a0;
                                    }

                                    public final int t() {
                                        ConstraintWidget constraintWidget = this.V;
                                        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.b0 : ((ConstraintWidgetContainer) constraintWidget).z0 + this.b0;
                                    }

                                    public String toString() {
                                        StringBuilder sbP = h50.p("");
                                        sbP.append(this.j0 != null ? nj.q(new StringBuilder("id: "), this.j0, " ") : "");
                                        sbP.append("(");
                                        sbP.append(this.a0);
                                        sbP.append(", ");
                                        sbP.append(this.b0);
                                        sbP.append(") - (");
                                        sbP.append(this.W);
                                        sbP.append(" x ");
                                        return nj.l(this.X, ")", sbP);
                                    }

                                    public final boolean v(int i, int i2) {
                                        ConstraintAnchor constraintAnchor;
                                        ConstraintAnchor constraintAnchor2;
                                        ConstraintAnchor constraintAnchor3;
                                        ConstraintAnchor constraintAnchor4;
                                        if (i == 0) {
                                            ConstraintAnchor constraintAnchor5 = this.J;
                                            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f;
                                            if (constraintAnchor6 == null || !constraintAnchor6.c || (constraintAnchor4 = (constraintAnchor3 = this.L).f) == null || !constraintAnchor4.c) {
                                                return false;
                                            }
                                            return (constraintAnchor4.d() - constraintAnchor3.e()) - (constraintAnchor5.e() + constraintAnchor5.f.d()) >= i2;
                                        }
                                        ConstraintAnchor constraintAnchor7 = this.K;
                                        ConstraintAnchor constraintAnchor8 = constraintAnchor7.f;
                                        if (constraintAnchor8 == null || !constraintAnchor8.c || (constraintAnchor2 = (constraintAnchor = this.M).f) == null || !constraintAnchor2.c) {
                                            return false;
                                        }
                                        return (constraintAnchor2.d() - constraintAnchor.e()) - (constraintAnchor7.e() + constraintAnchor7.f.d()) >= i2;
                                    }

                                    public final boolean x(int i) {
                                        ConstraintAnchor constraintAnchor;
                                        ConstraintAnchor constraintAnchor2;
                                        int i2 = i * 2;
                                        ConstraintAnchor[] constraintAnchorArr = this.R;
                                        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
                                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
                                        return (constraintAnchor4 == null || constraintAnchor4.f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).f) == null || constraintAnchor2.f != constraintAnchor) ? false : true;
                                    }

                                    public final boolean y() {
                                        ConstraintAnchor constraintAnchor = this.J;
                                        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
                                        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
                                            return true;
                                        }
                                        ConstraintAnchor constraintAnchor3 = this.L;
                                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
                                        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
                                    }

                                    public final boolean z() {
                                        ConstraintAnchor constraintAnchor = this.K;
                                        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
                                        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
                                            return true;
                                        }
                                        ConstraintAnchor constraintAnchor3 = this.M;
                                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
                                        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
                                    }

                                    public ConstraintWidget() {
                                        new HashMap();
                                        this.k = false;
                                        this.l = false;
                                        this.m = false;
                                        this.n = false;
                                        this.o = -1;
                                        this.p = -1;
                                        this.q = 0;
                                        this.r = 0;
                                        this.s = 0;
                                        this.t = new int[2];
                                        this.u = 0;
                                        this.v = 0;
                                        this.w = 1.0f;
                                        this.x = 0;
                                        this.y = 0;
                                        this.z = 1.0f;
                                        this.A = -1;
                                        this.B = 1.0f;
                                        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
                                        this.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        this.E = false;
                                        this.G = false;
                                        this.H = 0;
                                        this.I = 0;
                                        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.a);
                                        this.J = constraintAnchor;
                                        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.b);
                                        this.K = constraintAnchor2;
                                        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.c);
                                        this.L = constraintAnchor3;
                                        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.d);
                                        this.M = constraintAnchor4;
                                        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.e);
                                        this.N = constraintAnchor5;
                                        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.g);
                                        this.O = constraintAnchor6;
                                        ConstraintAnchor constraintAnchor7 = new ConstraintAnchor(this, ConstraintAnchor.Type.h);
                                        this.P = constraintAnchor7;
                                        ConstraintAnchor constraintAnchor8 = new ConstraintAnchor(this, ConstraintAnchor.Type.f);
                                        this.Q = constraintAnchor8;
                                        this.R = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor8};
                                        ArrayList arrayList = new ArrayList();
                                        this.S = arrayList;
                                        this.T = new boolean[2];
                                        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.a;
                                        this.U = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
                                        this.V = null;
                                        this.W = 0;
                                        this.X = 0;
                                        this.Y = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        this.Z = -1;
                                        this.a0 = 0;
                                        this.b0 = 0;
                                        this.c0 = 0;
                                        this.f0 = 0.5f;
                                        this.g0 = 0.5f;
                                        this.i0 = 0;
                                        this.j0 = null;
                                        this.k0 = 0;
                                        this.l0 = 0;
                                        this.m0 = new float[]{-1.0f, -1.0f};
                                        this.n0 = new ConstraintWidget[]{null, null};
                                        this.o0 = new ConstraintWidget[]{null, null};
                                        this.p0 = -1;
                                        this.q0 = -1;
                                        arrayList.add(constraintAnchor);
                                        arrayList.add(constraintAnchor2);
                                        arrayList.add(constraintAnchor3);
                                        arrayList.add(constraintAnchor4);
                                        arrayList.add(constraintAnchor6);
                                        arrayList.add(constraintAnchor7);
                                        arrayList.add(constraintAnchor8);
                                        arrayList.add(constraintAnchor5);
                                    }

                                    public static void p(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
                                        sb.append(str);
                                        sb.append(" :  {\n");
                                        H(i, 0, "      size", sb);
                                        H(i2, 0, "      min", sb);
                                        H(i3, Integer.MAX_VALUE, "      max", sb);
                                        H(i4, 0, "      matchMin", sb);
                                        H(i5, 0, "      matchDef", sb);
                                        I(sb, "      matchPercent", f, 1.0f);
                                        sb.append("    },\n");
                                    }

                                    public void R(LinearSystem linearSystem, boolean z) {
                                        int i;
                                        int i2;
                                        VerticalWidgetRun verticalWidgetRun;
                                        HorizontalWidgetRun horizontalWidgetRun;
                                        linearSystem.getClass();
                                        int iN = LinearSystem.n(this.J);
                                        int iN2 = LinearSystem.n(this.K);
                                        int iN3 = LinearSystem.n(this.L);
                                        int iN4 = LinearSystem.n(this.M);
                                        if (z && (horizontalWidgetRun = this.d) != null) {
                                            DependencyNode dependencyNode = horizontalWidgetRun.h;
                                            if (dependencyNode.j) {
                                                DependencyNode dependencyNode2 = horizontalWidgetRun.i;
                                                if (dependencyNode2.j) {
                                                    iN = dependencyNode.g;
                                                    iN3 = dependencyNode2.g;
                                                }
                                            }
                                        }
                                        if (z && (verticalWidgetRun = this.e) != null) {
                                            DependencyNode dependencyNode3 = verticalWidgetRun.h;
                                            if (dependencyNode3.j) {
                                                DependencyNode dependencyNode4 = verticalWidgetRun.i;
                                                if (dependencyNode4.j) {
                                                    iN2 = dependencyNode3.g;
                                                    iN4 = dependencyNode4.g;
                                                }
                                            }
                                        }
                                        int i3 = iN4 - iN2;
                                        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
                                            iN = 0;
                                            iN2 = 0;
                                            iN3 = 0;
                                            iN4 = 0;
                                        }
                                        int i4 = iN3 - iN;
                                        int i5 = iN4 - iN2;
                                        this.a0 = iN;
                                        this.b0 = iN2;
                                        if (this.i0 == 8) {
                                            this.W = 0;
                                            this.X = 0;
                                            return;
                                        }
                                        DimensionBehaviour[] dimensionBehaviourArr = this.U;
                                        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                                        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.a;
                                        if (dimensionBehaviour == dimensionBehaviour2 && i4 < (i2 = this.W)) {
                                            i4 = i2;
                                        }
                                        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i5 < (i = this.X)) {
                                            i5 = i;
                                        }
                                        this.W = i4;
                                        this.X = i5;
                                        int i6 = this.e0;
                                        if (i5 < i6) {
                                            this.X = i6;
                                        }
                                        int i7 = this.d0;
                                        if (i4 < i7) {
                                            this.W = i7;
                                        }
                                        int i8 = this.v;
                                        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.c;
                                        if (i8 > 0 && dimensionBehaviour == dimensionBehaviour3) {
                                            this.W = Math.min(this.W, i8);
                                        }
                                        int i9 = this.y;
                                        if (i9 > 0 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
                                            this.X = Math.min(this.X, i9);
                                        }
                                        int i10 = this.W;
                                        if (i4 != i10) {
                                            this.h = i10;
                                        }
                                        int i11 = this.X;
                                        if (i5 != i11) {
                                            this.i = i11;
                                        }
                                    }

                                    public ConstraintAnchor j(ConstraintAnchor.Type type) {
                                        switch (type.ordinal()) {
                                            case 0:
                                                return null;
                                            case 1:
                                                return this.J;
                                            case 2:
                                                return this.K;
                                            case 3:
                                                return this.L;
                                            case 4:
                                                return this.M;
                                            case 5:
                                                return this.N;
                                            case 6:
                                                return this.Q;
                                            case 7:
                                                return this.O;
                                            case 8:
                                                return this.P;
                                            default:
                                                d.p(type.name());
                                                return null;
                                        }
                                    }

                                    public final void w(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
                                        j(type).b(constraintWidget.j(type2), i, i2, true);
                                    }
                                }
