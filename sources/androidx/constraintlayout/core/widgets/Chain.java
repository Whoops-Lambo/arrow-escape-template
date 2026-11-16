package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class Chain {
    /* JADX WARN: Code duplicated, block: B:190:0x0292  */
    /* JADX WARN: Code duplicated, block: B:207:0x02da  */
    /* JADX WARN: Code duplicated, block: B:209:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:211:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:213:0x0304  */
    /* JADX WARN: Code duplicated, block: B:236:0x0372  */
    /* JADX WARN: Code duplicated, block: B:238:0x038c  */
    /* JADX WARN: Code duplicated, block: B:240:0x0391  */
    /* JADX WARN: Code duplicated, block: B:244:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:254:0x0422  */
    /* JADX WARN: Code duplicated, block: B:410:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:413:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:414:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:417:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:418:0x06be  */
    /* JADX WARN: Code duplicated, block: B:420:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:422:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:425:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:427:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:437:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x0117  */
    public static void a(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList arrayList, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        ConstraintWidget constraintWidget;
        LinearSystem linearSystem2;
        ConstraintWidget constraintWidget2;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget3;
        int i6;
        ConstraintAnchor[] constraintAnchorArr;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        int i7;
        ConstraintAnchor[] constraintAnchorArr2;
        int i8;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable4;
        ConstraintAnchor constraintAnchor5;
        SolverVariable solverVariable5;
        int size;
        ArrayList arrayList2;
        float f;
        float f2;
        float f3;
        SolverVariable solverVariable6;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        SolverVariable solverVariable9;
        ArrayRow arrayRowL;
        float f4;
        ConstraintAnchor constraintAnchor6;
        ConstraintWidget constraintWidget4;
        int i9;
        int i10;
        int i11;
        ConstraintWidget constraintWidget5;
        float f5;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        if (i == 0) {
            i2 = constraintWidgetContainer2.A0;
            chainHeadArr = constraintWidgetContainer2.D0;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer2.B0;
            chainHeadArr = constraintWidgetContainer2.C0;
            i3 = 2;
        }
        int i12 = i2;
        ChainHead[] chainHeadArr2 = chainHeadArr;
        int i13 = 0;
        while (i13 < i12) {
            ChainHead chainHead = chainHeadArr2[i13];
            boolean z4 = chainHead.q;
            ConstraintWidget constraintWidget6 = chainHead.a;
            ConstraintAnchor[] constraintAnchorArr3 = constraintWidget6.R;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.c;
            int i14 = 8;
            float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (z4) {
                i4 = i13;
            } else {
                int i15 = chainHead.l;
                int i16 = i15 * 2;
                ConstraintWidget constraintWidget7 = constraintWidget6;
                ConstraintWidget constraintWidget8 = constraintWidget7;
                boolean z5 = false;
                while (!z5) {
                    chainHead.i++;
                    ConstraintWidget[] constraintWidgetArr = constraintWidget7.o0;
                    ConstraintAnchor[] constraintAnchorArr4 = constraintWidget7.R;
                    constraintWidgetArr[i15] = null;
                    constraintWidget7.n0[i15] = null;
                    if (constraintWidget7.i0 != i14) {
                        constraintWidget7.k(i15);
                        constraintAnchorArr4[i16].e();
                        int i17 = i16 + 1;
                        constraintAnchorArr4[i17].e();
                        constraintAnchorArr4[i16].e();
                        constraintAnchorArr4[i17].e();
                        if (chainHead.b == null) {
                            chainHead.b = constraintWidget7;
                        }
                        chainHead.d = constraintWidget7;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget7.U[i15];
                        if (dimensionBehaviour2 == dimensionBehaviour) {
                            int i18 = constraintWidget7.t[i15];
                            i10 = i13;
                            if (i18 == 0 || i18 == 3 || i18 == 2) {
                                chainHead.j++;
                                float f7 = constraintWidget7.m0[i15];
                                if (f7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f5 = f7;
                                    chainHead.k += f5;
                                } else {
                                    f5 = f7;
                                }
                                i11 = i15;
                                if (constraintWidget7.i0 != 8 && dimensionBehaviour2 == dimensionBehaviour && (i18 == 0 || i18 == 3)) {
                                    if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        chainHead.n = true;
                                    } else {
                                        chainHead.o = true;
                                    }
                                    if (chainHead.h == null) {
                                        chainHead.h = new ArrayList();
                                    }
                                    chainHead.h.add(constraintWidget7);
                                }
                                if (chainHead.f == null) {
                                    chainHead.f = constraintWidget7;
                                }
                                ConstraintWidget constraintWidget9 = chainHead.g;
                                if (constraintWidget9 != null) {
                                    constraintWidget9.n0[i11] = constraintWidget7;
                                }
                                chainHead.g = constraintWidget7;
                            } else {
                                i11 = i15;
                            }
                            if (i11 == 0) {
                                if (constraintWidget7.r == 0 && constraintWidget7.u == 0) {
                                    int i19 = constraintWidget7.v;
                                }
                            } else if (constraintWidget7.s == 0 && constraintWidget7.x == 0) {
                                int i20 = constraintWidget7.y;
                            }
                        } else {
                            i10 = i13;
                            i11 = i15;
                        }
                    } else {
                        i10 = i13;
                        i11 = i15;
                    }
                    ConstraintWidget constraintWidget10 = constraintWidget8;
                    if (constraintWidget10 != constraintWidget7) {
                        constraintWidget10.o0[i11] = constraintWidget7;
                    }
                    ConstraintAnchor constraintAnchor7 = constraintAnchorArr4[i16 + 1].f;
                    if (constraintAnchor7 != null) {
                        constraintWidget5 = constraintAnchor7.d;
                        ConstraintAnchor constraintAnchor8 = constraintWidget5.R[i16].f;
                        if (constraintAnchor8 == null || constraintAnchor8.d != constraintWidget7) {
                            constraintWidget5 = null;
                        }
                    } else {
                        constraintWidget5 = null;
                    }
                    if (constraintWidget5 == null) {
                        constraintWidget5 = constraintWidget7;
                        z5 = true;
                    }
                    constraintWidget8 = constraintWidget7;
                    i15 = i11;
                    i14 = 8;
                    constraintWidget7 = constraintWidget5;
                    i13 = i10;
                }
                i4 = i13;
                int i21 = i15;
                ConstraintWidget constraintWidget11 = chainHead.b;
                if (constraintWidget11 != null) {
                    constraintWidget11.R[i16].e();
                }
                ConstraintWidget constraintWidget12 = chainHead.d;
                if (constraintWidget12 != null) {
                    constraintWidget12.R[i16 + 1].e();
                }
                chainHead.c = constraintWidget7;
                if (i21 == 0 && chainHead.m) {
                    chainHead.e = constraintWidget7;
                } else {
                    chainHead.e = constraintWidget6;
                }
                chainHead.p = chainHead.o && chainHead.n;
            }
            chainHead.q = true;
            if (arrayList == 0 || arrayList.contains(constraintWidget6)) {
                ConstraintWidget constraintWidget13 = chainHead.c;
                ConstraintWidget constraintWidget14 = chainHead.b;
                ConstraintWidget constraintWidget15 = chainHead.d;
                ConstraintWidget constraintWidget16 = chainHead.e;
                float f8 = chainHead.k;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer2.U;
                ConstraintAnchor[] constraintAnchorArr5 = constraintAnchorArr3;
                ConstraintAnchor[] constraintAnchorArr6 = constraintWidgetContainer2.R;
                boolean z6 = dimensionBehaviourArr[i] == ConstraintWidget.DimensionBehaviour.b;
                if (i == 0) {
                    int i22 = constraintWidget16.k0;
                    boolean z7 = i22 == 0;
                    z2 = i22 == 1;
                    z3 = i22 == 2;
                    z = z7;
                } else {
                    int i23 = constraintWidget16.l0;
                    z = i23 == 0;
                    z2 = i23 == 1;
                    z3 = i23 == 2;
                }
                boolean z8 = z2;
                boolean z9 = false;
                while (!z9) {
                    ConstraintAnchor[] constraintAnchorArr7 = constraintWidget6.R;
                    ConstraintAnchor constraintAnchor9 = constraintAnchorArr7[i3];
                    int i24 = z3 ? 1 : 4;
                    int iE = constraintAnchor9.e();
                    boolean z10 = z3;
                    boolean z11 = constraintWidget6.U[i] == dimensionBehaviour && constraintWidget6.t[i] == 0;
                    ConstraintAnchor constraintAnchor10 = constraintAnchor9.f;
                    if (constraintAnchor10 != null && constraintWidget6 != constraintWidget6) {
                        iE = constraintAnchor10.e() + iE;
                    }
                    int i25 = iE;
                    if (z10 && constraintWidget6 != constraintWidget6 && constraintWidget6 != constraintWidget14) {
                        i24 = 8;
                    }
                    ConstraintWidget constraintWidget17 = constraintWidget6;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor9.f;
                    if (constraintAnchor11 != null) {
                        SolverVariable solverVariable10 = constraintAnchor9.i;
                        SolverVariable solverVariable11 = constraintAnchor11.i;
                        if (constraintWidget6 == constraintWidget14) {
                            linearSystem.f(solverVariable10, solverVariable11, i25, 6);
                        } else {
                            linearSystem.f(solverVariable10, solverVariable11, i25, 8);
                        }
                        if (z11 && !z10) {
                            i24 = 5;
                        }
                        linearSystem.e(constraintAnchor9.i, constraintAnchor9.f.i, i25, (constraintWidget6 == constraintWidget14 && z10 && constraintWidget6.T[i]) ? 5 : i24);
                    } else {
                        i12 = i12;
                    }
                    if (z6) {
                        if (constraintWidget6.i0 == 8 || constraintWidget6.U[i] != dimensionBehaviour) {
                            i9 = 0;
                        } else {
                            i9 = 0;
                            linearSystem.f(constraintAnchorArr7[i3 + 1].i, constraintAnchorArr7[i3].i, 0, 5);
                        }
                        linearSystem.f(constraintAnchorArr7[i3].i, constraintAnchorArr6[i3].i, i9, 8);
                    }
                    ConstraintAnchor constraintAnchor12 = constraintAnchorArr7[i3 + 1].f;
                    if (constraintAnchor12 != null) {
                        constraintWidget4 = constraintAnchor12.d;
                        ConstraintAnchor constraintAnchor13 = constraintWidget4.R[i3].f;
                        if (constraintAnchor13 == null || constraintAnchor13.d != constraintWidget6) {
                            constraintWidget4 = null;
                        }
                    } else {
                        constraintWidget4 = null;
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget6 = constraintWidget4;
                    } else {
                        z9 = true;
                    }
                    constraintWidget6 = constraintWidget17;
                    z3 = z10;
                    i12 = i12;
                }
                boolean z12 = z3;
                i5 = i12;
                if (constraintWidget15 != null) {
                    int i26 = i3 + 1;
                    if (constraintWidget13.R[i26].f != null) {
                        ConstraintAnchor constraintAnchor14 = constraintWidget15.R[i26];
                        if (constraintWidget15.U[i] == dimensionBehaviour && constraintWidget15.t[i] == 0 && !z12) {
                            ConstraintAnchor constraintAnchor15 = constraintAnchor14.f;
                            if (constraintAnchor15.d == constraintWidgetContainer2) {
                                linearSystem.e(constraintAnchor14.i, constraintAnchor15.i, -constraintAnchor14.e(), 5);
                            } else if (z12) {
                                constraintAnchor6 = constraintAnchor14.f;
                                if (constraintAnchor6.d == constraintWidgetContainer2) {
                                    linearSystem.e(constraintAnchor14.i, constraintAnchor6.i, -constraintAnchor14.e(), 4);
                                }
                            }
                        } else if (z12) {
                            constraintAnchor6 = constraintAnchor14.f;
                            if (constraintAnchor6.d == constraintWidgetContainer2) {
                                linearSystem.e(constraintAnchor14.i, constraintAnchor6.i, -constraintAnchor14.e(), 4);
                            }
                        }
                        linearSystem.g(constraintAnchor14.i, constraintWidget13.R[i26].f.i, -constraintAnchor14.e(), 6);
                    }
                }
                if (z6 != 0) {
                    int i27 = i3 + 1;
                    SolverVariable solverVariable12 = constraintAnchorArr6[i27].i;
                    ConstraintAnchor constraintAnchor16 = constraintWidget13.R[i27];
                    linearSystem.f(solverVariable12, constraintAnchor16.i, constraintAnchor16.e(), 8);
                }
                ArrayList arrayList3 = chainHead.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    float f9 = (!chainHead.n || chainHead.p) ? f8 : chainHead.j;
                    ConstraintWidget constraintWidget18 = null;
                    float f10 = 0.0f;
                    int i28 = 0;
                    while (i28 < size) {
                        ConstraintWidget constraintWidget19 = (ConstraintWidget) arrayList3.get(i28);
                        float[] fArr = constraintWidget19.m0;
                        ConstraintAnchor[] constraintAnchorArr8 = constraintWidget19.R;
                        float f11 = fArr[i];
                        if (f11 >= f6) {
                            arrayList2 = arrayList3;
                            if (f11 == f6) {
                                linearSystem.e(constraintAnchorArr8[i3 + 1].i, constraintAnchorArr8[i3].i, 0, 8);
                                size = size;
                                f2 = f6;
                                f3 = f9;
                            } else {
                                i28 = i28;
                                if (constraintWidget18 != null) {
                                    ConstraintAnchor[] constraintAnchorArr9 = constraintWidget18.R;
                                    solverVariable6 = constraintAnchorArr9[i3].i;
                                    int i29 = i3 + 1;
                                    solverVariable7 = constraintAnchorArr9[i29].i;
                                    solverVariable8 = constraintAnchorArr8[i3].i;
                                    solverVariable9 = constraintAnchorArr8[i29].i;
                                    arrayRowL = linearSystem.l();
                                    f4 = f6;
                                    arrayRowL.b = f4;
                                    f2 = f4;
                                    if (f9 != f4 || f10 == f11) {
                                        f3 = f9;
                                        f = f11;
                                        arrayRowL.d.c(solverVariable6, 1.0f);
                                        arrayRowL.d.c(solverVariable7, -1.0f);
                                        arrayRowL.d.c(solverVariable9, 1.0f);
                                        arrayRowL.d.c(solverVariable8, -1.0f);
                                    } else {
                                        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRowL.d;
                                        if (f10 == f2) {
                                            f3 = f9;
                                            arrayRowVariables.c(solverVariable6, 1.0f);
                                            arrayRowL.d.c(solverVariable7, -1.0f);
                                            f = f11;
                                        } else {
                                            f3 = f9;
                                            f = f11;
                                            if (f11 == f6) {
                                                arrayRowVariables.c(solverVariable8, 1.0f);
                                                arrayRowL.d.c(solverVariable9, -1.0f);
                                            } else {
                                                float f12 = (f10 / f3) / (f / f3);
                                                arrayRowVariables.c(solverVariable6, 1.0f);
                                                arrayRowL.d.c(solverVariable7, -1.0f);
                                                arrayRowL.d.c(solverVariable9, f12);
                                                arrayRowL.d.c(solverVariable8, -f12);
                                            }
                                        }
                                    }
                                    linearSystem.c(arrayRowL);
                                } else {
                                    f = f11;
                                    f2 = f6;
                                    f3 = f9;
                                }
                                constraintWidget18 = constraintWidget19;
                                f10 = f;
                            }
                        } else {
                            if (chainHead.p) {
                                arrayList2 = arrayList3;
                                linearSystem.e(constraintAnchorArr8[i3 + 1].i, constraintAnchorArr8[i3].i, 0, 4);
                            } else {
                                f11 = 1.0f;
                                arrayList2 = arrayList3;
                                if (f11 == f6) {
                                    linearSystem.e(constraintAnchorArr8[i3 + 1].i, constraintAnchorArr8[i3].i, 0, 8);
                                } else {
                                    i28 = i28;
                                    if (constraintWidget18 != null) {
                                        ConstraintAnchor[] constraintAnchorArr10 = constraintWidget18.R;
                                        solverVariable6 = constraintAnchorArr10[i3].i;
                                        int i210 = i3 + 1;
                                        solverVariable7 = constraintAnchorArr10[i210].i;
                                        solverVariable8 = constraintAnchorArr8[i3].i;
                                        solverVariable9 = constraintAnchorArr8[i210].i;
                                        arrayRowL = linearSystem.l();
                                        f4 = f6;
                                        arrayRowL.b = f4;
                                        f2 = f4;
                                        if (f9 != f4) {
                                            f3 = f9;
                                            f = f11;
                                            arrayRowL.d.c(solverVariable6, 1.0f);
                                            arrayRowL.d.c(solverVariable7, -1.0f);
                                            arrayRowL.d.c(solverVariable9, 1.0f);
                                            arrayRowL.d.c(solverVariable8, -1.0f);
                                        } else {
                                            f3 = f9;
                                            f = f11;
                                            arrayRowL.d.c(solverVariable6, 1.0f);
                                            arrayRowL.d.c(solverVariable7, -1.0f);
                                            arrayRowL.d.c(solverVariable9, 1.0f);
                                            arrayRowL.d.c(solverVariable8, -1.0f);
                                        }
                                        linearSystem.c(arrayRowL);
                                    } else {
                                        f = f11;
                                        f2 = f6;
                                        f3 = f9;
                                    }
                                    constraintWidget18 = constraintWidget19;
                                    f10 = f;
                                }
                            }
                            size = size;
                            f2 = f6;
                            f3 = f9;
                        }
                        i28++;
                        f9 = f3;
                        arrayList3 = arrayList2;
                        size = size;
                        f6 = f2;
                    }
                }
                if (constraintWidget14 == null || !(constraintWidget14 == constraintWidget15 || z12)) {
                    constraintWidget = constraintWidget15;
                    if (z && constraintWidget14 != null) {
                        int i30 = chainHead.j;
                        boolean z13 = i30 > 0 && chainHead.i == i30;
                        ConstraintWidget constraintWidget20 = constraintWidget14;
                        ConstraintWidget constraintWidget21 = constraintWidget20;
                        while (true) {
                            ConstraintAnchor[] constraintAnchorArr11 = constraintWidget21.R;
                            if (constraintWidget20 == null) {
                                break;
                            }
                            ConstraintAnchor[] constraintAnchorArr12 = constraintWidget20.R;
                            ConstraintWidget constraintWidget22 = constraintWidget20.o0[i];
                            while (true) {
                                if (constraintWidget22 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (constraintWidget22.i0 != 8) {
                                    break;
                                } else {
                                    constraintWidget22 = constraintWidget22.o0[i];
                                }
                            }
                            if (constraintWidget22 != null || constraintWidget20 == constraintWidget) {
                                ConstraintAnchor constraintAnchor17 = constraintAnchorArr12[i3];
                                SolverVariable solverVariable13 = constraintAnchor17.i;
                                ConstraintAnchor constraintAnchor18 = constraintAnchor17.f;
                                SolverVariable solverVariable14 = constraintAnchor18 != null ? constraintAnchor18.i : null;
                                if (constraintWidget21 != constraintWidget20) {
                                    solverVariable14 = constraintAnchorArr11[i3 + 1].i;
                                } else if (constraintWidget20 == constraintWidget14) {
                                    ConstraintAnchor constraintAnchor19 = constraintAnchorArr5[i3].f;
                                    solverVariable14 = constraintAnchor19 != null ? constraintAnchor19.i : null;
                                }
                                int iE2 = constraintAnchor17.e();
                                int i31 = i3 + 1;
                                int iE3 = constraintAnchorArr12[i31].e();
                                if (constraintWidget22 != null) {
                                    constraintAnchor2 = constraintWidget22.R[i3];
                                    constraintAnchorArr = constraintAnchorArr11;
                                    solverVariable3 = constraintAnchor2.i;
                                } else {
                                    constraintAnchorArr = constraintAnchorArr11;
                                    constraintAnchor2 = constraintWidget13.R[i31].f;
                                    solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.i : null;
                                }
                                SolverVariable solverVariable15 = constraintAnchorArr12[i31].i;
                                if (constraintAnchor2 != null) {
                                    iE3 += constraintAnchor2.e();
                                }
                                int iE4 = constraintAnchorArr[i31].e() + iE2;
                                if (solverVariable13 == null || solverVariable14 == null || solverVariable3 == null || solverVariable15 == null) {
                                    i7 = 8;
                                } else {
                                    if (constraintWidget20 == constraintWidget14) {
                                        iE4 = constraintWidget14.R[i3].e();
                                    }
                                    int i32 = iE4;
                                    if (constraintWidget20 == constraintWidget) {
                                        iE3 = constraintWidget.R[i31].e();
                                    }
                                    i7 = 8;
                                    linearSystem.b(solverVariable13, solverVariable14, i32, 0.5f, solverVariable3, solverVariable15, iE3, z13 ? 8 : 5);
                                }
                            } else {
                                i7 = i6;
                            }
                            if (constraintWidget20.i0 != i7) {
                                constraintWidget21 = constraintWidget20;
                            }
                            constraintWidget20 = constraintWidget22;
                            constraintWidget21 = constraintWidget21;
                            constraintAnchorArr5 = constraintAnchorArr5;
                        }
                    } else {
                        int i33 = 8;
                        if (z8 && constraintWidget14 != null) {
                            int i34 = chainHead.j;
                            boolean z14 = i34 > 0 && chainHead.i == i34;
                            ConstraintWidget constraintWidget23 = constraintWidget14;
                            ConstraintWidget constraintWidget24 = constraintWidget23;
                            while (true) {
                                ConstraintAnchor[] constraintAnchorArr13 = constraintWidget23.R;
                                if (constraintWidget24 == null) {
                                    break;
                                }
                                ConstraintAnchor[] constraintAnchorArr14 = constraintWidget24.R;
                                ConstraintWidget constraintWidget25 = constraintWidget24.o0[i];
                                while (constraintWidget25 != null && constraintWidget25.i0 == i33) {
                                    constraintWidget25 = constraintWidget25.o0[i];
                                }
                                if (constraintWidget24 == constraintWidget14 || constraintWidget24 == constraintWidget || constraintWidget25 == null) {
                                    constraintWidget2 = constraintWidget23;
                                } else {
                                    if (constraintWidget25 == constraintWidget) {
                                        constraintWidget25 = null;
                                    }
                                    ConstraintAnchor constraintAnchor20 = constraintAnchorArr14[i3];
                                    SolverVariable solverVariable16 = constraintAnchor20.i;
                                    int i35 = i3 + 1;
                                    SolverVariable solverVariable17 = constraintAnchorArr13[i35].i;
                                    int iE5 = constraintAnchor20.e();
                                    int iE6 = constraintAnchorArr14[i35].e();
                                    if (constraintWidget25 != null) {
                                        constraintAnchor = constraintWidget25.R[i3];
                                        solverVariable = constraintAnchor.i;
                                        constraintWidget2 = constraintWidget23;
                                        ConstraintAnchor constraintAnchor21 = constraintAnchor.f;
                                        solverVariable2 = constraintAnchor21 != null ? constraintAnchor21.i : null;
                                    } else {
                                        constraintWidget2 = constraintWidget23;
                                        ConstraintAnchor constraintAnchor22 = constraintWidget.R[i3];
                                        solverVariable = constraintAnchor22 != null ? constraintAnchor22.i : null;
                                        SolverVariable solverVariable18 = constraintAnchorArr14[i35].i;
                                        constraintAnchor = constraintAnchor22;
                                        solverVariable2 = solverVariable18;
                                    }
                                    if (constraintAnchor != null) {
                                        iE6 += constraintAnchor.e();
                                    }
                                    int iE7 = constraintAnchorArr13[i35].e() + iE5;
                                    ConstraintWidget constraintWidget26 = constraintWidget25;
                                    int i36 = iE6;
                                    int i37 = z14 ? 8 : 4;
                                    if (solverVariable16 == null || solverVariable17 == null || solverVariable == null || solverVariable2 == null) {
                                        constraintWidget3 = constraintWidget26;
                                    } else {
                                        SolverVariable solverVariable19 = solverVariable;
                                        constraintWidget3 = constraintWidget26;
                                        linearSystem.b(solverVariable16, solverVariable17, iE7, 0.5f, solverVariable19, solverVariable2, i36, i37);
                                    }
                                    constraintWidget25 = constraintWidget3;
                                }
                                i33 = 8;
                                if (constraintWidget24.i0 != 8) {
                                    constraintWidget2 = constraintWidget24;
                                }
                                constraintWidget24 = constraintWidget25;
                                constraintWidget23 = constraintWidget2;
                            }
                            linearSystem2 = linearSystem;
                            ConstraintAnchor constraintAnchor23 = constraintWidget14.R[i3];
                            ConstraintAnchor constraintAnchor24 = constraintAnchorArr5[i3].f;
                            int i38 = i3 + 1;
                            ConstraintAnchor constraintAnchor25 = constraintWidget.R[i38];
                            ConstraintAnchor constraintAnchor26 = constraintWidget13.R[i38].f;
                            if (constraintAnchor24 != null) {
                                if (constraintWidget14 != constraintWidget) {
                                    linearSystem2.e(constraintAnchor23.i, constraintAnchor24.i, constraintAnchor23.e(), 5);
                                } else if (constraintAnchor26 != null) {
                                    linearSystem2.b(constraintAnchor23.i, constraintAnchor24.i, constraintAnchor23.e(), 0.5f, constraintAnchor25.i, constraintAnchor26.i, constraintAnchor25.e(), 5);
                                }
                            }
                            if (constraintAnchor26 != null && constraintWidget14 != constraintWidget) {
                                linearSystem2.e(constraintAnchor25.i, constraintAnchor26.i, -constraintAnchor25.e(), 5);
                            }
                        }
                        if ((z || z8) && constraintWidget14 != null && constraintWidget14 != constraintWidget) {
                            constraintAnchorArr2 = constraintWidget14.R;
                            ConstraintAnchor constraintAnchor27 = constraintAnchorArr2[i3];
                            if (constraintWidget == null) {
                                constraintWidget = constraintWidget14;
                            }
                            ConstraintAnchor[] constraintAnchorArr15 = constraintWidget.R;
                            i8 = i3 + 1;
                            constraintAnchor3 = constraintAnchorArr15[i8];
                            constraintAnchor4 = constraintAnchor27.f;
                            if (constraintAnchor4 != null) {
                                solverVariable4 = constraintAnchor4.i;
                            } else {
                                solverVariable4 = null;
                            }
                            constraintAnchor5 = constraintAnchor3.f;
                            if (constraintAnchor5 != null) {
                                solverVariable5 = constraintAnchor5.i;
                            } else {
                                solverVariable5 = null;
                            }
                            if (constraintWidget13 != constraintWidget) {
                                ConstraintAnchor constraintAnchor28 = constraintWidget13.R[i8].f;
                                solverVariable5 = constraintAnchor28 != null ? constraintAnchor28.i : null;
                            }
                            if (constraintWidget14 == constraintWidget) {
                                constraintAnchor3 = constraintAnchorArr2[i8];
                            }
                            if (solverVariable4 == null && solverVariable5 != null) {
                                linearSystem2.b(constraintAnchor27.i, solverVariable4, constraintAnchor27.e(), 0.5f, solverVariable5, constraintAnchor3.i, constraintAnchorArr15[i8].e(), 5);
                            }
                        }
                    }
                } else {
                    ConstraintAnchor constraintAnchor29 = constraintAnchorArr5[i3];
                    int i39 = i3 + 1;
                    ConstraintAnchor constraintAnchor30 = constraintWidget13.R[i39];
                    ConstraintAnchor constraintAnchor31 = constraintAnchor29.f;
                    SolverVariable solverVariable20 = constraintAnchor31 != null ? constraintAnchor31.i : null;
                    ConstraintAnchor constraintAnchor32 = constraintAnchor30.f;
                    SolverVariable solverVariable21 = constraintAnchor32 != null ? constraintAnchor32.i : null;
                    ConstraintAnchor constraintAnchor33 = constraintWidget14.R[i3];
                    if (constraintWidget15 != null) {
                        constraintAnchor30 = constraintWidget15.R[i39];
                    }
                    if (solverVariable20 == null || solverVariable21 == null) {
                        constraintWidget = constraintWidget15;
                    } else {
                        float f13 = i == 0 ? constraintWidget16.f0 : constraintWidget16.g0;
                        int iE8 = constraintAnchor33.e();
                        int iE9 = constraintAnchor30.e();
                        SolverVariable solverVariable22 = constraintAnchor33.i;
                        SolverVariable solverVariable23 = constraintAnchor30.i;
                        SolverVariable solverVariable24 = solverVariable20;
                        constraintWidget = constraintWidget15;
                        linearSystem.b(solverVariable22, solverVariable24, iE8, f13, solverVariable21, solverVariable23, iE9, 7);
                    }
                }
                linearSystem2 = linearSystem;
                if (z) {
                    constraintAnchorArr2 = constraintWidget14.R;
                    ConstraintAnchor constraintAnchor210 = constraintAnchorArr2[i3];
                    if (constraintWidget == null) {
                        constraintWidget = constraintWidget14;
                    }
                    ConstraintAnchor[] constraintAnchorArr16 = constraintWidget.R;
                    i8 = i3 + 1;
                    constraintAnchor3 = constraintAnchorArr16[i8];
                    constraintAnchor4 = constraintAnchor210.f;
                    if (constraintAnchor4 != null) {
                        solverVariable4 = constraintAnchor4.i;
                    } else {
                        solverVariable4 = null;
                    }
                    constraintAnchor5 = constraintAnchor3.f;
                    if (constraintAnchor5 != null) {
                        solverVariable5 = constraintAnchor5.i;
                    } else {
                        solverVariable5 = null;
                    }
                    if (constraintWidget13 != constraintWidget) {
                        ConstraintAnchor constraintAnchor211 = constraintWidget13.R[i8].f;
                        solverVariable5 = constraintAnchor211 != null ? constraintAnchor211.i : null;
                    }
                    if (constraintWidget14 == constraintWidget) {
                        constraintAnchor3 = constraintAnchorArr2[i8];
                    }
                    if (solverVariable4 == null) {
                    }
                } else {
                    constraintAnchorArr2 = constraintWidget14.R;
                    ConstraintAnchor constraintAnchor212 = constraintAnchorArr2[i3];
                    if (constraintWidget == null) {
                        constraintWidget = constraintWidget14;
                    }
                    ConstraintAnchor[] constraintAnchorArr17 = constraintWidget.R;
                    i8 = i3 + 1;
                    constraintAnchor3 = constraintAnchorArr17[i8];
                    constraintAnchor4 = constraintAnchor212.f;
                    if (constraintAnchor4 != null) {
                        solverVariable4 = constraintAnchor4.i;
                    } else {
                        solverVariable4 = null;
                    }
                    constraintAnchor5 = constraintAnchor3.f;
                    if (constraintAnchor5 != null) {
                        solverVariable5 = constraintAnchor5.i;
                    } else {
                        solverVariable5 = null;
                    }
                    if (constraintWidget13 != constraintWidget) {
                        ConstraintAnchor constraintAnchor213 = constraintWidget13.R[i8].f;
                        solverVariable5 = constraintAnchor213 != null ? constraintAnchor213.i : null;
                    }
                    if (constraintWidget14 == constraintWidget) {
                        constraintAnchor3 = constraintAnchorArr2[i8];
                    }
                    if (solverVariable4 == null) {
                    }
                }
            } else {
                i5 = i12;
            }
            i13 = i4 + 1;
            constraintWidgetContainer2 = constraintWidgetContainer;
            i12 = i5;
        }
    }
}
