package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import androidx.constraintlayout.core.widgets.analyzer.Direct;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidgetContainer extends WidgetContainer {
    public int A0;
    public int B0;
    public ChainHead[] C0;
    public ChainHead[] D0;
    public int E0;
    public boolean F0;
    public boolean G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public WeakReference K0;
    public final HashSet L0;
    public final BasicMeasure.Measure M0;
    public final BasicMeasure s0;
    public final DependencyGraph t0;
    public int u0;
    public BasicMeasure.Measurer v0;
    public boolean w0;
    public final LinearSystem x0;
    public int y0;
    public int z0;

    /* JADX WARN: Code duplicated, block: B:339:0x0604  */
    /* JADX WARN: Code duplicated, block: B:341:0x060d  */
    /* JADX WARN: Code duplicated, block: B:348:0x0626  */
    /* JADX WARN: Code duplicated, block: B:349:0x062d  */
    /* JADX WARN: Code duplicated, block: B:355:0x0640  */
    /* JADX WARN: Code duplicated, block: B:361:0x0658  */
    /* JADX WARN: Code duplicated, block: B:364:0x065e  */
    /* JADX WARN: Code duplicated, block: B:366:0x0666 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:369:0x0674  */
    /* JADX WARN: Code duplicated, block: B:375:0x0684  */
    /* JADX WARN: Code duplicated, block: B:379:0x068f  */
    /* JADX WARN: Code duplicated, block: B:382:0x069a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:384:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:387:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:391:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:394:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:396:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:400:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:405:0x06e9 A[Catch: Exception -> 0x06f7, LOOP:12: B:404:0x06e7->B:405:0x06e9, LOOP_END, TryCatch #5 {Exception -> 0x06f7, blocks: (B:403:0x06df, B:405:0x06e9, B:409:0x0702), top: B:536:0x06df }] */
    /* JADX WARN: Code duplicated, block: B:414:0x070f A[Catch: Exception -> 0x073a, TRY_LEAVE, TryCatch #4 {Exception -> 0x073a, blocks: (B:412:0x0709, B:414:0x070f), top: B:534:0x0709 }] */
    /* JADX WARN: Code duplicated, block: B:427:0x0742  */
    /* JADX WARN: Code duplicated, block: B:430:0x074c A[Catch: Exception -> 0x072e, TRY_ENTER, TryCatch #1 {Exception -> 0x072e, blocks: (B:418:0x0727, B:430:0x074c, B:432:0x0752, B:435:0x0770, B:437:0x0776, B:441:0x078c), top: B:528:0x0727 }] */
    /* JADX WARN: Code duplicated, block: B:435:0x0770 A[Catch: Exception -> 0x072e, TRY_ENTER, TryCatch #1 {Exception -> 0x072e, blocks: (B:418:0x0727, B:430:0x074c, B:432:0x0752, B:435:0x0770, B:437:0x0776, B:441:0x078c), top: B:528:0x0727 }] */
    /* JADX WARN: Code duplicated, block: B:447:0x079b A[Catch: Exception -> 0x07c0, TryCatch #0 {Exception -> 0x07c0, blocks: (B:428:0x0748, B:433:0x076c, B:445:0x0797, B:447:0x079b, B:449:0x07a1), top: B:526:0x0748 }] */
    /* JADX WARN: Code duplicated, block: B:456:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:466:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:468:0x0814  */
    /* JADX WARN: Code duplicated, block: B:470:0x082a  */
    /* JADX WARN: Code duplicated, block: B:472:0x082e  */
    /* JADX WARN: Code duplicated, block: B:475:0x083a  */
    /* JADX WARN: Code duplicated, block: B:477:0x0843 A[LOOP:15: B:476:0x0841->B:477:0x0843, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:481:0x0856 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:496:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:499:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:502:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:503:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:505:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:507:0x08f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:510:0x0901  */
    /* JADX WARN: Code duplicated, block: B:513:0x090f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:517:0x0923 A[PHI: r15 r25
  0x0923: PHI (r15v10 ??) = (r15v9 ??), (r15v14 ??), (r15v14 ??), (r15v14 ??) binds: [B:504:0x08f1, B:512:0x090d, B:513:0x090f, B:515:0x0915] A[DONT_GENERATE, DONT_INLINE]
  0x0923: PHI (r25v7 boolean) = (r25v6 boolean), (r25v8 boolean), (r25v8 boolean), (r25v8 boolean) binds: [B:504:0x08f1, B:512:0x090d, B:513:0x090f, B:515:0x0915] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:519:0x0929  */
    /* JADX WARN: Code duplicated, block: B:523:0x093b  */
    /* JADX WARN: Code duplicated, block: B:534:0x0709 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x06c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:0x092a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r33v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.widgets.WidgetContainer] */
    @Override // androidx.constraintlayout.core.widgets.WidgetContainer
    public final void S() {
        ConstraintAnchor constraintAnchor;
        int i;
        int i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintAnchor constraintAnchor2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        LinearSystem linearSystem;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i3;
        int i4;
        boolean zW;
        boolean z4;
        int i5;
        ?? r15;
        boolean z5;
        int i6;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        boolean z6;
        ConstraintAnchor constraintAnchor4;
        ?? r16;
        boolean[] zArr;
        boolean[] zArr2;
        int i7;
        boolean z7;
        int iMax;
        boolean z8;
        int iMax2;
        ?? r14;
        ?? r17;
        int i8;
        ?? r18;
        boolean zW2;
        int size;
        int i9;
        boolean z9;
        ConstraintWidget constraintWidget;
        ?? r19;
        int i10;
        ConstraintAnchor constraintAnchor5;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        ConstraintAnchor constraintAnchor6;
        ConstraintWidget constraintWidget2;
        int i11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7;
        WidgetGroup widgetGroup;
        WidgetGroup widgetGroup2;
        int i12;
        int iR;
        int i13;
        int iL;
        int size2;
        int i14;
        int i15;
        WidgetGroup widgetGroup3;
        int iB;
        WidgetGroup widgetGroup4;
        WidgetGroup widgetGroup5;
        int i16;
        ConstraintAnchor constraintAnchor7;
        this.a0 = 0;
        this.b0 = 0;
        this.F0 = false;
        this.G0 = false;
        int size3 = this.r0.size();
        int iMax3 = Math.max(0, r());
        int iMax4 = Math.max(0, l());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.U;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviourArr[0];
        int i17 = this.u0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.c;
        ConstraintAnchor constraintAnchor8 = this.K;
        ConstraintAnchor constraintAnchor9 = this.J;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.a;
        if (i17 == 0 && Optimizer.b(this.E0, 1)) {
            BasicMeasure.Measurer measurer = this.v0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dimensionBehaviourArr[1];
            F();
            ArrayList arrayList = this.r0;
            int size4 = arrayList.size();
            for (int i18 = 0; i18 < size4; i18++) {
                ((ConstraintWidget) arrayList.get(i18)).F();
            }
            boolean z10 = this.w0;
            if (dimensionBehaviour12 == dimensionBehaviour11) {
                K(0, r());
            } else {
                constraintAnchor9.l(0);
                this.a0 = 0;
            }
            boolean z11 = false;
            int i19 = 0;
            boolean z12 = false;
            while (i19 < size4) {
                boolean z13 = z11;
                ConstraintWidget constraintWidget3 = (ConstraintWidget) arrayList.get(i19);
                int i20 = i19;
                if (constraintWidget3 instanceof Guideline) {
                    Guideline guideline = (Guideline) constraintWidget3;
                    constraintAnchor7 = constraintAnchor9;
                    if (guideline.v0 == 1) {
                        int i21 = guideline.s0;
                        if (i21 != -1) {
                            guideline.S(i21);
                        } else if (guideline.t0 != -1 && B()) {
                            guideline.S(r() - guideline.t0);
                        } else if (B()) {
                            guideline.S((int) ((guideline.r0 * r()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else {
                    constraintAnchor7 = constraintAnchor9;
                    if ((constraintWidget3 instanceof Barrier) && ((Barrier) constraintWidget3).U() == 0) {
                        z11 = z13;
                        z12 = true;
                    }
                    i19 = i20 + 1;
                    constraintAnchor9 = constraintAnchor7;
                }
                z11 = z13;
                i19 = i20 + 1;
                constraintAnchor9 = constraintAnchor7;
            }
            constraintAnchor = constraintAnchor9;
            if (z11) {
                for (int i22 = 0; i22 < size4; i22 = i16 + 1) {
                    ConstraintWidget constraintWidget4 = (ConstraintWidget) arrayList.get(i22);
                    if (constraintWidget4 instanceof Guideline) {
                        Guideline guideline2 = (Guideline) constraintWidget4;
                        i16 = i22;
                        if (guideline2.v0 == 1) {
                            Direct.b(0, guideline2, measurer, z10);
                        }
                    } else {
                        i16 = i22;
                    }
                }
            }
            Direct.b(0, this, measurer, z10);
            if (z12) {
                for (int i23 = 0; i23 < size4; i23++) {
                    ConstraintWidget constraintWidget5 = (ConstraintWidget) arrayList.get(i23);
                    if (constraintWidget5 instanceof Barrier) {
                        Barrier barrier = (Barrier) constraintWidget5;
                        if (barrier.U() == 0 && barrier.T()) {
                            Direct.b(1, barrier, measurer, z10);
                        }
                    }
                }
            }
            if (dimensionBehaviour13 == dimensionBehaviour11) {
                L(0, l());
            } else {
                constraintAnchor8.l(0);
                this.b0 = 0;
            }
            int i24 = 0;
            boolean z14 = false;
            boolean z15 = false;
            while (i24 < size4) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) arrayList.get(i24);
                int i25 = i24;
                if (constraintWidget6 instanceof Guideline) {
                    Guideline guideline3 = (Guideline) constraintWidget6;
                    if (guideline3.v0 == 0) {
                        int i26 = guideline3.s0;
                        if (i26 != -1) {
                            guideline3.S(i26);
                        } else if (guideline3.t0 != -1 && C()) {
                            guideline3.S(l() - guideline3.t0);
                        } else if (C()) {
                            guideline3.S((int) ((guideline3.r0 * l()) + 0.5f));
                        }
                        z14 = true;
                    }
                } else if ((constraintWidget6 instanceof Barrier) && ((Barrier) constraintWidget6).U() == 1) {
                    z15 = true;
                }
                i24 = i25 + 1;
            }
            if (z14) {
                for (int i27 = 0; i27 < size4; i27++) {
                    ConstraintWidget constraintWidget7 = (ConstraintWidget) arrayList.get(i27);
                    if (constraintWidget7 instanceof Guideline) {
                        Guideline guideline4 = (Guideline) constraintWidget7;
                        if (guideline4.v0 == 0) {
                            Direct.g(1, guideline4, measurer);
                        }
                    }
                }
            }
            Direct.g(0, this, measurer);
            if (z15) {
                for (int i28 = 0; i28 < size4; i28++) {
                    ConstraintWidget constraintWidget8 = (ConstraintWidget) arrayList.get(i28);
                    if (constraintWidget8 instanceof Barrier) {
                        Barrier barrier2 = (Barrier) constraintWidget8;
                        if (barrier2.U() == 1 && barrier2.T()) {
                            Direct.g(1, barrier2, measurer);
                        }
                    }
                }
            }
            for (int i29 = 0; i29 < size4; i29++) {
                ConstraintWidget constraintWidget9 = (ConstraintWidget) arrayList.get(i29);
                if (constraintWidget9.A() && Direct.a(constraintWidget9)) {
                    V(constraintWidget9, measurer, Direct.a);
                    if (!(constraintWidget9 instanceof Guideline)) {
                        Direct.b(0, constraintWidget9, measurer, z10);
                        Direct.g(0, constraintWidget9, measurer);
                    } else if (((Guideline) constraintWidget9).v0 == 0) {
                        Direct.g(0, constraintWidget9, measurer);
                    } else {
                        Direct.b(0, constraintWidget9, measurer, z10);
                    }
                }
            }
            for (int i30 = 0; i30 < size3; i30++) {
                ConstraintWidget constraintWidget10 = (ConstraintWidget) this.r0.get(i30);
                if (constraintWidget10.A() && !(constraintWidget10 instanceof Guideline) && !(constraintWidget10 instanceof Barrier) && !(constraintWidget10 instanceof VirtualLayout) && !constraintWidget10.G) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourK = constraintWidget10.k(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourK2 = constraintWidget10.k(1);
                    if (dimensionBehaviourK != dimensionBehaviour10 || constraintWidget10.r == 1 || dimensionBehaviourK2 != dimensionBehaviour10 || constraintWidget10.s == 1) {
                        V(constraintWidget10, this.v0, new BasicMeasure.Measure());
                    }
                }
            }
        } else {
            iMax4 = iMax4;
            constraintAnchor = constraintAnchor9;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.b;
        LinearSystem linearSystem2 = this.x0;
        if (size3 <= 2 || !((dimensionBehaviour9 == dimensionBehaviour14 || dimensionBehaviour8 == dimensionBehaviour14) && Optimizer.b(this.E0, 1024))) {
            i = iMax3;
            i2 = size3;
            dimensionBehaviour = dimensionBehaviour14;
            dimensionBehaviour2 = dimensionBehaviour9;
            constraintAnchor2 = constraintAnchor8;
            dimensionBehaviour3 = dimensionBehaviour11;
            linearSystem = linearSystem2;
            dimensionBehaviour4 = dimensionBehaviour8;
        } else {
            BasicMeasure.Measurer measurer2 = this.v0;
            ArrayList arrayList2 = this.r0;
            int size5 = arrayList2.size();
            int i31 = 0;
            while (true) {
                if (i31 < size5) {
                    ConstraintWidget constraintWidget11 = (ConstraintWidget) arrayList2.get(i31);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = dimensionBehaviourArr[0];
                    int i32 = i31;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dimensionBehaviourArr[1];
                    constraintAnchor2 = constraintAnchor8;
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget11.U;
                    i2 = size3;
                    if (Grouping.b(dimensionBehaviour15, dimensionBehaviour16, dimensionBehaviourArr2[0], dimensionBehaviourArr2[1]) && !(constraintWidget11 instanceof Flow)) {
                        i31 = i32 + 1;
                        constraintAnchor8 = constraintAnchor2;
                        size3 = i2;
                    } else {
                        i11 = iMax3;
                        dimensionBehaviour = dimensionBehaviour14;
                        dimensionBehaviour6 = dimensionBehaviour8;
                        dimensionBehaviour7 = dimensionBehaviour9;
                        dimensionBehaviour3 = dimensionBehaviour11;
                        linearSystem = linearSystem2;
                    }
                } else {
                    i2 = size3;
                    constraintAnchor2 = constraintAnchor8;
                    i11 = iMax3;
                    dimensionBehaviour6 = dimensionBehaviour8;
                    ArrayList arrayList3 = null;
                    int i33 = 0;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i33 < size5) {
                        int i34 = i33;
                        ConstraintWidget constraintWidget12 = (ConstraintWidget) arrayList2.get(i33);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviour9;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviourArr[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviour11;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = dimensionBehaviourArr[1];
                        LinearSystem linearSystem3 = linearSystem2;
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = constraintWidget12.U;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = dimensionBehaviour14;
                        if (!Grouping.b(dimensionBehaviour18, dimensionBehaviour20, dimensionBehaviourArr3[0], dimensionBehaviourArr3[1])) {
                            V(constraintWidget12, measurer2, this.M0);
                        }
                        boolean z16 = constraintWidget12 instanceof Guideline;
                        if (z16) {
                            Guideline guideline5 = (Guideline) constraintWidget12;
                            if (guideline5.v0 == 0) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(guideline5);
                            }
                            if (guideline5.v0 == 1) {
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(guideline5);
                            }
                        }
                        if (constraintWidget12 instanceof HelperWidget) {
                            if (constraintWidget12 instanceof Barrier) {
                                Barrier barrier3 = (Barrier) constraintWidget12;
                                if (barrier3.U() == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(barrier3);
                                }
                                if (barrier3.U() == 1) {
                                    if (arrayList8 == null) {
                                        arrayList8 = new ArrayList();
                                    }
                                    arrayList8.add(barrier3);
                                }
                            } else {
                                HelperWidget helperWidget = (HelperWidget) constraintWidget12;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(helperWidget);
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(helperWidget);
                            }
                        }
                        if (constraintWidget12.J.f == null && constraintWidget12.L.f == null && !z16 && !(constraintWidget12 instanceof Barrier)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(constraintWidget12);
                        }
                        if (constraintWidget12.K.f == null && constraintWidget12.M.f == null && constraintWidget12.N.f == null && !z16 && !(constraintWidget12 instanceof Barrier)) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(constraintWidget12);
                        }
                        i33 = i34 + 1;
                        dimensionBehaviour9 = dimensionBehaviour17;
                        dimensionBehaviour11 = dimensionBehaviour19;
                        linearSystem2 = linearSystem3;
                        dimensionBehaviour14 = dimensionBehaviour21;
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = dimensionBehaviour14;
                    LinearSystem linearSystem4 = linearSystem2;
                    dimensionBehaviour7 = dimensionBehaviour9;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour23 = dimensionBehaviour11;
                    ArrayList arrayList9 = new ArrayList();
                    if (arrayList4 != null) {
                        int size6 = arrayList4.size();
                        int i35 = 0;
                        while (i35 < size6) {
                            Object obj = arrayList4.get(i35);
                            i35++;
                            Grouping.a((Guideline) obj, 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        int size7 = arrayList5.size();
                        int i36 = 0;
                        while (i36 < size7) {
                            Object obj2 = arrayList5.get(i36);
                            i36++;
                            HelperWidget helperWidget2 = (HelperWidget) obj2;
                            WidgetGroup widgetGroupA = Grouping.a(helperWidget2, 0, arrayList9, null);
                            helperWidget2.S(0, widgetGroupA, arrayList9);
                            widgetGroupA.a(arrayList9);
                        }
                    }
                    HashSet hashSet = j(ConstraintAnchor.Type.a).a;
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            Grouping.a(((ConstraintAnchor) it.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = j(ConstraintAnchor.Type.c).a;
                    if (hashSet2 != null) {
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            Grouping.a(((ConstraintAnchor) it2.next()).d, 0, arrayList9, null);
                        }
                    }
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.f;
                    HashSet hashSet3 = j(type).a;
                    if (hashSet3 != null) {
                        Iterator it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            Grouping.a(((ConstraintAnchor) it3.next()).d, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size8 = arrayList6.size();
                        int i37 = 0;
                        while (i37 < size8) {
                            Object obj3 = arrayList6.get(i37);
                            i37++;
                            Grouping.a((ConstraintWidget) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size9 = arrayList7.size();
                        int i38 = 0;
                        while (i38 < size9) {
                            Object obj4 = arrayList7.get(i38);
                            i38++;
                            Grouping.a((Guideline) obj4, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size10 = arrayList8.size();
                        int i39 = 0;
                        while (i39 < size10) {
                            Object obj5 = arrayList8.get(i39);
                            i39++;
                            HelperWidget helperWidget3 = (HelperWidget) obj5;
                            WidgetGroup widgetGroupA2 = Grouping.a(helperWidget3, 1, arrayList9, null);
                            helperWidget3.S(1, widgetGroupA2, arrayList9);
                            widgetGroupA2.a(arrayList9);
                        }
                    }
                    HashSet hashSet4 = j(ConstraintAnchor.Type.b).a;
                    if (hashSet4 != null) {
                        Iterator it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            Grouping.a(((ConstraintAnchor) it4.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = j(ConstraintAnchor.Type.e).a;
                    if (hashSet5 != null) {
                        Iterator it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            Grouping.a(((ConstraintAnchor) it5.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = j(ConstraintAnchor.Type.d).a;
                    if (hashSet6 != null) {
                        Iterator it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            Grouping.a(((ConstraintAnchor) it6.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = j(type).a;
                    if (hashSet7 != null) {
                        Iterator it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            Grouping.a(((ConstraintAnchor) it7.next()).d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList3 != null) {
                        int size11 = arrayList3.size();
                        int i40 = 0;
                        while (i40 < size11) {
                            Object obj6 = arrayList3.get(i40);
                            i40++;
                            Grouping.a((ConstraintWidget) obj6, 1, arrayList9, null);
                        }
                    }
                    char c2 = 1;
                    int i41 = 0;
                    while (i41 < size5) {
                        ConstraintWidget constraintWidget13 = (ConstraintWidget) arrayList2.get(i41);
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = constraintWidget13.U;
                        if (dimensionBehaviourArr4[0] == dimensionBehaviour10 && dimensionBehaviourArr4[c2] == dimensionBehaviour10) {
                            int i42 = constraintWidget13.p0;
                            int size12 = arrayList9.size();
                            int i43 = 0;
                            while (true) {
                                if (i43 >= size12) {
                                    widgetGroup4 = null;
                                    break;
                                }
                                widgetGroup4 = (WidgetGroup) arrayList9.get(i43);
                                if (i42 == widgetGroup4.b) {
                                    break;
                                } else {
                                    i43++;
                                }
                            }
                            int i44 = constraintWidget13.q0;
                            int size13 = arrayList9.size();
                            int i45 = 0;
                            while (true) {
                                if (i45 >= size13) {
                                    widgetGroup5 = null;
                                    break;
                                }
                                widgetGroup5 = (WidgetGroup) arrayList9.get(i45);
                                if (i44 == widgetGroup5.b) {
                                    break;
                                } else {
                                    i45++;
                                }
                            }
                            if (widgetGroup4 != null && widgetGroup5 != null) {
                                widgetGroup4.c(0, widgetGroup5);
                                widgetGroup5.c = 2;
                                arrayList9.remove(widgetGroup4);
                            }
                        }
                        i41++;
                        c2 = 1;
                    }
                    if (arrayList9.size() > 1) {
                        dimensionBehaviour = dimensionBehaviour22;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour) {
                            int size14 = arrayList9.size();
                            int i46 = 0;
                            int i47 = 0;
                            widgetGroup = null;
                            while (i47 < size14) {
                                Object obj7 = arrayList9.get(i47);
                                i47++;
                                WidgetGroup widgetGroup6 = (WidgetGroup) obj7;
                                if (widgetGroup6.c != 1) {
                                    LinearSystem linearSystem5 = linearSystem4;
                                    int iB2 = widgetGroup6.b(linearSystem5, 0);
                                    if (iB2 > i46) {
                                        widgetGroup = widgetGroup6;
                                        i46 = iB2;
                                    }
                                    linearSystem4 = linearSystem5;
                                }
                            }
                            linearSystem = linearSystem4;
                            dimensionBehaviour3 = dimensionBehaviour23;
                            if (widgetGroup != null) {
                                N(dimensionBehaviour3);
                                P(i46);
                            }
                            if (dimensionBehaviourArr[1] == dimensionBehaviour) {
                                size2 = arrayList9.size();
                                i14 = 0;
                                i15 = 0;
                                widgetGroup2 = null;
                                while (i15 < size2) {
                                    Object obj8 = arrayList9.get(i15);
                                    i15++;
                                    widgetGroup3 = (WidgetGroup) obj8;
                                    if (widgetGroup3.c != 0 && (iB = widgetGroup3.b(linearSystem, 1)) > i14) {
                                        widgetGroup2 = widgetGroup3;
                                        i14 = iB;
                                    }
                                }
                                if (widgetGroup2 != null) {
                                    O(dimensionBehaviour3);
                                    M(i14);
                                } else {
                                    widgetGroup2 = null;
                                }
                            } else {
                                widgetGroup2 = null;
                            }
                            if (widgetGroup == null || widgetGroup2 != null) {
                                dimensionBehaviour2 = dimensionBehaviour7;
                                if (dimensionBehaviour2 == dimensionBehaviour) {
                                    i12 = i11;
                                    if (i12 < r() || i12 <= 0) {
                                        iR = r();
                                    } else {
                                        P(i12);
                                        this.F0 = true;
                                    }
                                    dimensionBehaviour4 = dimensionBehaviour6;
                                    if (dimensionBehaviour4 == dimensionBehaviour) {
                                        i13 = iMax4;
                                        if (i13 < l() || i13 <= 0) {
                                            iL = l();
                                        } else {
                                            M(i13);
                                            this.G0 = true;
                                        }
                                        iMax4 = iL;
                                        i = iR;
                                        z = true;
                                    } else {
                                        i13 = iMax4;
                                    }
                                    iL = i13;
                                    iMax4 = iL;
                                    i = iR;
                                    z = true;
                                } else {
                                    i12 = i11;
                                }
                                iR = i12;
                                dimensionBehaviour4 = dimensionBehaviour6;
                                if (dimensionBehaviour4 == dimensionBehaviour) {
                                    i13 = iMax4;
                                    if (i13 < l()) {
                                    }
                                    iL = l();
                                    iMax4 = iL;
                                    i = iR;
                                    z = true;
                                } else {
                                    i13 = iMax4;
                                }
                                iL = i13;
                                iMax4 = iL;
                                i = iR;
                                z = true;
                            }
                            if (!W(64) || W(128)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            linearSystem.getClass();
                            linearSystem.g = false;
                            if (this.E0 == 0 && z2) {
                                c = 1;
                                linearSystem.g = true;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList10 = this.r0;
                            if (dimensionBehaviourArr[0] != dimensionBehaviour || dimensionBehaviourArr[c] == dimensionBehaviour) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.A0 = 0;
                            this.B0 = 0;
                            i3 = i2;
                            for (i4 = 0; i4 < i3; i4++) {
                                constraintWidget2 = (ConstraintWidget) this.r0.get(i4);
                                if (constraintWidget2 instanceof WidgetContainer) {
                                    ((WidgetContainer) constraintWidget2).S();
                                }
                            }
                            zW = W(64);
                            z4 = z;
                            i5 = 0;
                            r15 = 1;
                            while (r15 != 0) {
                                i6 = i5 + 1;
                                try {
                                    linearSystem.t();
                                    dimensionBehaviour5 = dimensionBehaviour3;
                                    try {
                                        this.A0 = 0;
                                        this.B0 = 0;
                                        h(linearSystem);
                                        for (i10 = 0; i10 < i3; i10++) {
                                            ((ConstraintWidget) this.r0.get(i10)).h(linearSystem);
                                        }
                                        U(linearSystem);
                                        try {
                                            weakReference = this.H0;
                                            if (weakReference != null) {
                                                try {
                                                    if (weakReference.get() != null) {
                                                        constraintAnchor5 = constraintAnchor2;
                                                        try {
                                                            z3 = z3;
                                                            z6 = z4;
                                                            try {
                                                                linearSystem.f(linearSystem.k((ConstraintAnchor) this.H0.get()), linearSystem.k(constraintAnchor5), 0, 5);
                                                                this.H0 = null;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                constraintAnchor3 = constraintAnchor5;
                                                                r19 = 1;
                                                                e.printStackTrace();
                                                                constraintAnchor4 = constraintAnchor3;
                                                                System.out.println("EXCEPTION : " + e);
                                                                r16 = r19;
                                                                zArr = Optimizer.a;
                                                                if (r16 != 0) {
                                                                    zArr[2] = false;
                                                                    zW2 = W(64);
                                                                    R(linearSystem, zW2);
                                                                    size = this.r0.size();
                                                                    i9 = 0;
                                                                    z9 = false;
                                                                    while (i9 < size) {
                                                                        boolean[] zArr3 = zArr;
                                                                        constraintWidget = (ConstraintWidget) this.r0.get(i9);
                                                                        constraintWidget.R(linearSystem, zW2);
                                                                        int i48 = i9;
                                                                        boolean z17 = zW2;
                                                                        if (constraintWidget.h == -1) {
                                                                            z9 = true;
                                                                        } else {
                                                                            z9 = true;
                                                                        }
                                                                        i9 = i48 + 1;
                                                                        zArr = zArr3;
                                                                        zW2 = z17;
                                                                        z9 = z9;
                                                                    }
                                                                    zArr2 = zArr;
                                                                    z7 = z9;
                                                                } else {
                                                                    zArr2 = zArr;
                                                                    R(linearSystem, zW);
                                                                    for (i7 = 0; i7 < i3; i7++) {
                                                                        ((ConstraintWidget) this.r0.get(i7)).R(linearSystem, zW);
                                                                    }
                                                                    z7 = false;
                                                                }
                                                                if (!z3) {
                                                                }
                                                                iMax = Math.max(this.d0, r());
                                                                z8 = z7;
                                                                if (iMax > r()) {
                                                                    P(iMax);
                                                                    dimensionBehaviourArr[0] = dimensionBehaviour5;
                                                                    z8 = true;
                                                                    z6 = true;
                                                                }
                                                                iMax2 = Math.max(this.e0, l());
                                                                if (iMax2 > l()) {
                                                                    M(iMax2);
                                                                    r14 = 1;
                                                                    dimensionBehaviourArr[1] = dimensionBehaviour5;
                                                                    r17 = 1;
                                                                    z6 = true;
                                                                } else {
                                                                    r14 = 1;
                                                                }
                                                                if (z6) {
                                                                    r17 = z8;
                                                                    z4 = z6;
                                                                    i8 = 8;
                                                                    r18 = r17;
                                                                } else {
                                                                    r17 = z8;
                                                                    if (dimensionBehaviourArr[0] == dimensionBehaviour) {
                                                                        r17 = r17;
                                                                        if (r() > i) {
                                                                            this.F0 = r14;
                                                                            dimensionBehaviourArr[0] = dimensionBehaviour5;
                                                                            P(i);
                                                                            ?? r110 = r14;
                                                                            z6 = r110 == true ? 1 : 0;
                                                                            r17 = r110;
                                                                        }
                                                                    }
                                                                    r17 = r17;
                                                                    r17 = r17;
                                                                    if (dimensionBehaviourArr[r14] == dimensionBehaviour) {
                                                                        r17 = z8;
                                                                        z4 = z6;
                                                                        i8 = 8;
                                                                        r18 = r17;
                                                                    } else {
                                                                        r17 = z8;
                                                                        z4 = z6;
                                                                        i8 = 8;
                                                                        r18 = r17;
                                                                    }
                                                                }
                                                                if (i6 > i8) {
                                                                    r18 = 0;
                                                                }
                                                                i5 = i6;
                                                                z3 = z3;
                                                                dimensionBehaviour3 = dimensionBehaviour5;
                                                                constraintAnchor2 = constraintAnchor4;
                                                                r15 = r18;
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            z3 = z3;
                                                            z6 = z4;
                                                        }
                                                    } else {
                                                        z6 = z4;
                                                        constraintAnchor5 = constraintAnchor2;
                                                        z3 = z3;
                                                    }
                                                    try {
                                                        weakReference2 = this.J0;
                                                        if (weakReference2 != null && weakReference2.get() != null) {
                                                            linearSystem.f(linearSystem.k(this.M), linearSystem.k((ConstraintAnchor) this.J0.get()), 0, 5);
                                                            this.J0 = null;
                                                        }
                                                        weakReference3 = this.I0;
                                                        if (weakReference3 != null && weakReference3.get() != null) {
                                                            constraintAnchor6 = constraintAnchor;
                                                            try {
                                                                constraintAnchor = constraintAnchor6;
                                                                linearSystem.f(linearSystem.k((ConstraintAnchor) this.I0.get()), linearSystem.k(constraintAnchor6), 0, 5);
                                                                this.I0 = null;
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                constraintAnchor = constraintAnchor6;
                                                                constraintAnchor3 = constraintAnchor5;
                                                                r19 = 1;
                                                                e.printStackTrace();
                                                                constraintAnchor4 = constraintAnchor3;
                                                                System.out.println("EXCEPTION : " + e);
                                                                r16 = r19;
                                                            }
                                                        }
                                                        weakReference4 = this.K0;
                                                        if (weakReference4 == null && weakReference4.get() != null) {
                                                            linearSystem.f(linearSystem.k(this.L), linearSystem.k((ConstraintAnchor) this.K0.get()), 0, 5);
                                                            try {
                                                                this.K0 = null;
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                constraintAnchor3 = constraintAnchor5;
                                                                r19 = 1;
                                                                e.printStackTrace();
                                                                constraintAnchor4 = constraintAnchor3;
                                                                System.out.println("EXCEPTION : " + e);
                                                                r16 = r19;
                                                            }
                                                        }
                                                        linearSystem.p();
                                                        constraintAnchor4 = constraintAnchor5;
                                                        r16 = 1;
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                    }
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    z6 = z4;
                                                    constraintAnchor5 = constraintAnchor2;
                                                    z3 = z3;
                                                }
                                            } else {
                                                z6 = z4;
                                                constraintAnchor5 = constraintAnchor2;
                                                z3 = z3;
                                                weakReference2 = this.J0;
                                                if (weakReference2 != null) {
                                                    linearSystem.f(linearSystem.k(this.M), linearSystem.k((ConstraintAnchor) this.J0.get()), 0, 5);
                                                    this.J0 = null;
                                                }
                                                weakReference3 = this.I0;
                                                if (weakReference3 != null) {
                                                    constraintAnchor6 = constraintAnchor;
                                                    constraintAnchor = constraintAnchor6;
                                                    linearSystem.f(linearSystem.k((ConstraintAnchor) this.I0.get()), linearSystem.k(constraintAnchor6), 0, 5);
                                                    this.I0 = null;
                                                }
                                                weakReference4 = this.K0;
                                                if (weakReference4 == null) {
                                                }
                                                linearSystem.p();
                                                constraintAnchor4 = constraintAnchor5;
                                                r16 = 1;
                                            }
                                        } catch (Exception e7) {
                                            e = e7;
                                            z6 = z4;
                                            constraintAnchor5 = constraintAnchor2;
                                            z3 = z3;
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                        constraintAnchor3 = constraintAnchor2;
                                        z6 = z4;
                                        r19 = r15;
                                        e.printStackTrace();
                                        constraintAnchor4 = constraintAnchor3;
                                        System.out.println("EXCEPTION : " + e);
                                        r16 = r19;
                                        zArr = Optimizer.a;
                                        if (r16 != 0) {
                                            zArr[2] = false;
                                            zW2 = W(64);
                                            R(linearSystem, zW2);
                                            size = this.r0.size();
                                            i9 = 0;
                                            z9 = false;
                                            while (i9 < size) {
                                                boolean[] zArr4 = zArr;
                                                constraintWidget = (ConstraintWidget) this.r0.get(i9);
                                                constraintWidget.R(linearSystem, zW2);
                                                int i49 = i9;
                                                boolean z18 = zW2;
                                                if (constraintWidget.h == -1) {
                                                    z9 = true;
                                                } else {
                                                    z9 = true;
                                                }
                                                i9 = i49 + 1;
                                                zArr = zArr4;
                                                zW2 = z18;
                                                z9 = z9;
                                            }
                                            zArr2 = zArr;
                                            z7 = z9;
                                        } else {
                                            zArr2 = zArr;
                                            R(linearSystem, zW);
                                            while (i7 < i3) {
                                                ((ConstraintWidget) this.r0.get(i7)).R(linearSystem, zW);
                                            }
                                            z7 = false;
                                        }
                                        if (!z3) {
                                        }
                                        iMax = Math.max(this.d0, r());
                                        z8 = z7;
                                        if (iMax > r()) {
                                            P(iMax);
                                            dimensionBehaviourArr[0] = dimensionBehaviour5;
                                            z8 = true;
                                            z6 = true;
                                        }
                                        iMax2 = Math.max(this.e0, l());
                                        if (iMax2 > l()) {
                                            M(iMax2);
                                            r14 = 1;
                                            dimensionBehaviourArr[1] = dimensionBehaviour5;
                                            r17 = 1;
                                            z6 = true;
                                        } else {
                                            r14 = 1;
                                        }
                                        if (z6) {
                                            r17 = z8;
                                            if (dimensionBehaviourArr[0] == dimensionBehaviour) {
                                                r17 = r17;
                                                if (r() > i) {
                                                    this.F0 = r14;
                                                    dimensionBehaviourArr[0] = dimensionBehaviour5;
                                                    P(i);
                                                    ?? r111 = r14;
                                                    z6 = r111 == true ? 1 : 0;
                                                    r17 = r111;
                                                }
                                            }
                                            r17 = r17;
                                            r17 = r17;
                                            if (dimensionBehaviourArr[r14] == dimensionBehaviour) {
                                                r17 = z8;
                                                z4 = z6;
                                                i8 = 8;
                                                r18 = r17;
                                            } else {
                                                r17 = z8;
                                                z4 = z6;
                                                i8 = 8;
                                                r18 = r17;
                                            }
                                        } else {
                                            r17 = z8;
                                            z4 = z6;
                                            i8 = 8;
                                            r18 = r17;
                                        }
                                        if (i6 > i8) {
                                            r18 = 0;
                                        }
                                        i5 = i6;
                                        z3 = z3;
                                        dimensionBehaviour3 = dimensionBehaviour5;
                                        constraintAnchor2 = constraintAnchor4;
                                        r15 = r18;
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                    constraintAnchor3 = constraintAnchor2;
                                    dimensionBehaviour5 = dimensionBehaviour3;
                                }
                                zArr = Optimizer.a;
                                if (r16 != 0) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    R(linearSystem, zW2);
                                    size = this.r0.size();
                                    i9 = 0;
                                    z9 = false;
                                    while (i9 < size) {
                                        boolean[] zArr5 = zArr;
                                        constraintWidget = (ConstraintWidget) this.r0.get(i9);
                                        constraintWidget.R(linearSystem, zW2);
                                        int i410 = i9;
                                        boolean z19 = zW2;
                                        if (constraintWidget.h == -1 || constraintWidget.i != -1) {
                                            z9 = true;
                                        }
                                        i9 = i410 + 1;
                                        zArr = zArr5;
                                        zW2 = z19;
                                        z9 = z9;
                                    }
                                    zArr2 = zArr;
                                    z7 = z9;
                                } else {
                                    zArr2 = zArr;
                                    R(linearSystem, zW);
                                    while (i7 < i3) {
                                        ((ConstraintWidget) this.r0.get(i7)).R(linearSystem, zW);
                                    }
                                    z7 = false;
                                }
                                if (!z3 && i6 < 8) {
                                    if (zArr2[2]) {
                                        int iMax5 = 0;
                                        int iMax6 = 0;
                                        for (int i50 = 0; i50 < i3; i50++) {
                                            ConstraintWidget constraintWidget14 = (ConstraintWidget) this.r0.get(i50);
                                            iMax6 = Math.max(iMax6, constraintWidget14.r() + constraintWidget14.a0);
                                            iMax5 = Math.max(iMax5, constraintWidget14.l() + constraintWidget14.b0);
                                        }
                                        int iMax7 = Math.max(this.d0, iMax6);
                                        int iMax8 = Math.max(this.e0, iMax5);
                                        z7 = z7;
                                        if (dimensionBehaviour2 == dimensionBehaviour && r() < iMax7) {
                                            z7 = z7;
                                            P(iMax7);
                                            dimensionBehaviourArr[0] = dimensionBehaviour;
                                            z7 = true;
                                            z6 = true;
                                        }
                                        if (dimensionBehaviour4 == dimensionBehaviour && l() < iMax8) {
                                            M(iMax8);
                                            dimensionBehaviourArr[1] = dimensionBehaviour;
                                            z7 = true;
                                            z6 = true;
                                        }
                                    }
                                }
                                iMax = Math.max(this.d0, r());
                                z8 = z7;
                                if (iMax > r()) {
                                    P(iMax);
                                    dimensionBehaviourArr[0] = dimensionBehaviour5;
                                    z8 = true;
                                    z6 = true;
                                }
                                iMax2 = Math.max(this.e0, l());
                                if (iMax2 > l()) {
                                    M(iMax2);
                                    r14 = 1;
                                    dimensionBehaviourArr[1] = dimensionBehaviour5;
                                    r17 = 1;
                                    z6 = true;
                                } else {
                                    r14 = 1;
                                }
                                if (z6) {
                                    r17 = z8;
                                    if (dimensionBehaviourArr[0] == dimensionBehaviour && i > 0) {
                                        r17 = r17;
                                        if (r() > i) {
                                            this.F0 = r14;
                                            dimensionBehaviourArr[0] = dimensionBehaviour5;
                                            P(i);
                                            ?? r112 = r14;
                                            z6 = r112 == true ? 1 : 0;
                                            r17 = r112;
                                        }
                                    }
                                    r17 = r17;
                                    r17 = r17;
                                    if (dimensionBehaviourArr[r14] == dimensionBehaviour || iMax4 <= 0 || l() <= iMax4) {
                                        r17 = z8;
                                        z4 = z6;
                                        i8 = 8;
                                        r18 = r17;
                                    } else {
                                        this.G0 = r14;
                                        dimensionBehaviourArr[r14] = dimensionBehaviour5;
                                        M(iMax4);
                                        i8 = 8;
                                        z4 = true;
                                        r18 = 1;
                                    }
                                } else {
                                    r17 = z8;
                                    z4 = z6;
                                    i8 = 8;
                                    r18 = r17;
                                }
                                if (i6 > i8) {
                                    r18 = 0;
                                }
                                i5 = i6;
                                z3 = z3;
                                dimensionBehaviour3 = dimensionBehaviour5;
                                constraintAnchor2 = constraintAnchor4;
                                r15 = r18;
                            }
                            z5 = z4;
                            this.r0 = arrayList10;
                            if (z5) {
                                dimensionBehaviourArr[0] = dimensionBehaviour2;
                                dimensionBehaviourArr[1] = dimensionBehaviour4;
                            }
                            G(linearSystem.l);
                        }
                        linearSystem = linearSystem4;
                        dimensionBehaviour3 = dimensionBehaviour23;
                        widgetGroup = null;
                        if (dimensionBehaviourArr[1] == dimensionBehaviour) {
                            size2 = arrayList9.size();
                            i14 = 0;
                            i15 = 0;
                            widgetGroup2 = null;
                            while (i15 < size2) {
                                Object obj9 = arrayList9.get(i15);
                                i15++;
                                widgetGroup3 = (WidgetGroup) obj9;
                                if (widgetGroup3.c != 0) {
                                    widgetGroup2 = widgetGroup3;
                                    i14 = iB;
                                }
                            }
                            if (widgetGroup2 != null) {
                                O(dimensionBehaviour3);
                                M(i14);
                            } else {
                                widgetGroup2 = null;
                            }
                        } else {
                            widgetGroup2 = null;
                        }
                        if (widgetGroup == null) {
                        }
                        dimensionBehaviour2 = dimensionBehaviour7;
                        if (dimensionBehaviour2 == dimensionBehaviour) {
                            i12 = i11;
                            if (i12 < r()) {
                            }
                            iR = r();
                            dimensionBehaviour4 = dimensionBehaviour6;
                            if (dimensionBehaviour4 == dimensionBehaviour) {
                                i13 = iMax4;
                                if (i13 < l()) {
                                }
                                iL = l();
                                iMax4 = iL;
                                i = iR;
                                z = true;
                                if (W(64)) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                linearSystem.getClass();
                                linearSystem.g = false;
                                if (this.E0 == 0) {
                                    c = 1;
                                } else {
                                    c = 1;
                                }
                                ArrayList arrayList11 = this.r0;
                                if (dimensionBehaviourArr[0] != dimensionBehaviour) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                this.A0 = 0;
                                this.B0 = 0;
                                i3 = i2;
                                while (i4 < i3) {
                                    constraintWidget2 = (ConstraintWidget) this.r0.get(i4);
                                    if (constraintWidget2 instanceof WidgetContainer) {
                                        ((WidgetContainer) constraintWidget2).S();
                                    }
                                }
                                zW = W(64);
                                z4 = z;
                                i5 = 0;
                                r15 = 1;
                                while (r15 != 0) {
                                    i6 = i5 + 1;
                                    linearSystem.t();
                                    dimensionBehaviour5 = dimensionBehaviour3;
                                    this.A0 = 0;
                                    this.B0 = 0;
                                    h(linearSystem);
                                    while (i10 < i3) {
                                        ((ConstraintWidget) this.r0.get(i10)).h(linearSystem);
                                    }
                                    U(linearSystem);
                                    weakReference = this.H0;
                                    if (weakReference != null) {
                                        if (weakReference.get() != null) {
                                            constraintAnchor5 = constraintAnchor2;
                                            z3 = z3;
                                            z6 = z4;
                                            linearSystem.f(linearSystem.k((ConstraintAnchor) this.H0.get()), linearSystem.k(constraintAnchor5), 0, 5);
                                            this.H0 = null;
                                        } else {
                                            z6 = z4;
                                            constraintAnchor5 = constraintAnchor2;
                                            z3 = z3;
                                        }
                                        weakReference2 = this.J0;
                                        if (weakReference2 != null) {
                                            linearSystem.f(linearSystem.k(this.M), linearSystem.k((ConstraintAnchor) this.J0.get()), 0, 5);
                                            this.J0 = null;
                                        }
                                        weakReference3 = this.I0;
                                        if (weakReference3 != null) {
                                            constraintAnchor6 = constraintAnchor;
                                            constraintAnchor = constraintAnchor6;
                                            linearSystem.f(linearSystem.k((ConstraintAnchor) this.I0.get()), linearSystem.k(constraintAnchor6), 0, 5);
                                            this.I0 = null;
                                        }
                                        weakReference4 = this.K0;
                                        if (weakReference4 == null) {
                                        }
                                        linearSystem.p();
                                        constraintAnchor4 = constraintAnchor5;
                                        r16 = 1;
                                    } else {
                                        z6 = z4;
                                        constraintAnchor5 = constraintAnchor2;
                                        z3 = z3;
                                        weakReference2 = this.J0;
                                        if (weakReference2 != null) {
                                            linearSystem.f(linearSystem.k(this.M), linearSystem.k((ConstraintAnchor) this.J0.get()), 0, 5);
                                            this.J0 = null;
                                        }
                                        weakReference3 = this.I0;
                                        if (weakReference3 != null) {
                                            constraintAnchor6 = constraintAnchor;
                                            constraintAnchor = constraintAnchor6;
                                            linearSystem.f(linearSystem.k((ConstraintAnchor) this.I0.get()), linearSystem.k(constraintAnchor6), 0, 5);
                                            this.I0 = null;
                                        }
                                        weakReference4 = this.K0;
                                        if (weakReference4 == null) {
                                        }
                                        linearSystem.p();
                                        constraintAnchor4 = constraintAnchor5;
                                        r16 = 1;
                                    }
                                    zArr = Optimizer.a;
                                    if (r16 != 0) {
                                        zArr[2] = false;
                                        zW2 = W(64);
                                        R(linearSystem, zW2);
                                        size = this.r0.size();
                                        i9 = 0;
                                        z9 = false;
                                        while (i9 < size) {
                                            boolean[] zArr6 = zArr;
                                            constraintWidget = (ConstraintWidget) this.r0.get(i9);
                                            constraintWidget.R(linearSystem, zW2);
                                            int i411 = i9;
                                            boolean z110 = zW2;
                                            if (constraintWidget.h == -1) {
                                                z9 = true;
                                            } else {
                                                z9 = true;
                                            }
                                            i9 = i411 + 1;
                                            zArr = zArr6;
                                            zW2 = z110;
                                            z9 = z9;
                                        }
                                        zArr2 = zArr;
                                        z7 = z9;
                                    } else {
                                        zArr2 = zArr;
                                        R(linearSystem, zW);
                                        while (i7 < i3) {
                                            ((ConstraintWidget) this.r0.get(i7)).R(linearSystem, zW);
                                        }
                                        z7 = false;
                                    }
                                    if (!z3) {
                                    }
                                    iMax = Math.max(this.d0, r());
                                    z8 = z7;
                                    if (iMax > r()) {
                                        P(iMax);
                                        dimensionBehaviourArr[0] = dimensionBehaviour5;
                                        z8 = true;
                                        z6 = true;
                                    }
                                    iMax2 = Math.max(this.e0, l());
                                    if (iMax2 > l()) {
                                        M(iMax2);
                                        r14 = 1;
                                        dimensionBehaviourArr[1] = dimensionBehaviour5;
                                        r17 = 1;
                                        z6 = true;
                                    } else {
                                        r14 = 1;
                                    }
                                    if (z6) {
                                        r17 = z8;
                                        if (dimensionBehaviourArr[0] == dimensionBehaviour) {
                                            r17 = r17;
                                            if (r() > i) {
                                                this.F0 = r14;
                                                dimensionBehaviourArr[0] = dimensionBehaviour5;
                                                P(i);
                                                ?? r113 = r14;
                                                z6 = r113 == true ? 1 : 0;
                                                r17 = r113;
                                            }
                                        }
                                        r17 = r17;
                                        r17 = r17;
                                        if (dimensionBehaviourArr[r14] == dimensionBehaviour) {
                                            r17 = z8;
                                            z4 = z6;
                                            i8 = 8;
                                            r18 = r17;
                                        } else {
                                            r17 = z8;
                                            z4 = z6;
                                            i8 = 8;
                                            r18 = r17;
                                        }
                                    } else {
                                        r17 = z8;
                                        z4 = z6;
                                        i8 = 8;
                                        r18 = r17;
                                    }
                                    if (i6 > i8) {
                                        r18 = 0;
                                    }
                                    i5 = i6;
                                    z3 = z3;
                                    dimensionBehaviour3 = dimensionBehaviour5;
                                    constraintAnchor2 = constraintAnchor4;
                                    r15 = r18;
                                }
                                z5 = z4;
                                this.r0 = arrayList11;
                                if (z5) {
                                    dimensionBehaviourArr[0] = dimensionBehaviour2;
                                    dimensionBehaviourArr[1] = dimensionBehaviour4;
                                }
                                G(linearSystem.l);
                            }
                            i13 = iMax4;
                            iL = i13;
                            iMax4 = iL;
                            i = iR;
                            z = true;
                            if (W(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            linearSystem.getClass();
                            linearSystem.g = false;
                            if (this.E0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList12 = this.r0;
                            if (dimensionBehaviourArr[0] != dimensionBehaviour) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.A0 = 0;
                            this.B0 = 0;
                            i3 = i2;
                            while (i4 < i3) {
                                constraintWidget2 = (ConstraintWidget) this.r0.get(i4);
                                if (constraintWidget2 instanceof WidgetContainer) {
                                    ((WidgetContainer) constraintWidget2).S();
                                }
                            }
                            zW = W(64);
                            z4 = z;
                            i5 = 0;
                            r15 = 1;
                            while (r15 != 0) {
                                i6 = i5 + 1;
                                linearSystem.t();
                                dimensionBehaviour5 = dimensionBehaviour3;
                                this.A0 = 0;
                                this.B0 = 0;
                                h(linearSystem);
                                while (i10 < i3) {
                                    ((ConstraintWidget) this.r0.get(i10)).h(linearSystem);
                                }
                                U(linearSystem);
                                weakReference = this.H0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        constraintAnchor5 = constraintAnchor2;
                                        z3 = z3;
                                        z6 = z4;
                                        linearSystem.f(linearSystem.k((ConstraintAnchor) this.H0.get()), linearSystem.k(constraintAnchor5), 0, 5);
                                        this.H0 = null;
                                    } else {
                                        z6 = z4;
                                        constraintAnchor5 = constraintAnchor2;
                                        z3 = z3;
                                    }
                                    weakReference2 = this.J0;
                                    if (weakReference2 != null) {
                                        linearSystem.f(linearSystem.k(this.M), linearSystem.k((ConstraintAnchor) this.J0.get()), 0, 5);
                                        this.J0 = null;
                                    }
                                    weakReference3 = this.I0;
                                    if (weakReference3 != null) {
                                        constraintAnchor6 = constraintAnchor;
                                        constraintAnchor = constraintAnchor6;
                                        linearSystem.f(linearSystem.k((ConstraintAnchor) this.I0.get()), linearSystem.k(constraintAnchor6), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference4 = this.K0;
                                    if (weakReference4 == null) {
                                    }
                                    linearSystem.p();
                                    constraintAnchor4 = constraintAnchor5;
                                    r16 = 1;
                                } else {
                                    z6 = z4;
                                    constraintAnchor5 = constraintAnchor2;
                                    z3 = z3;
                                    weakReference2 = this.J0;
                                    if (weakReference2 != null) {
                                        linearSystem.f(linearSystem.k(this.M), linearSystem.k((ConstraintAnchor) this.J0.get()), 0, 5);
                                        this.J0 = null;
                                    }
                                    weakReference3 = this.I0;
                                    if (weakReference3 != null) {
                                        constraintAnchor6 = constraintAnchor;
                                        constraintAnchor = constraintAnchor6;
                                        linearSystem.f(linearSystem.k((ConstraintAnchor) this.I0.get()), linearSystem.k(constraintAnchor6), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference4 = this.K0;
                                    if (weakReference4 == null) {
                                    }
                                    linearSystem.p();
                                    constraintAnchor4 = constraintAnchor5;
                                    r16 = 1;
                                }
                                zArr = Optimizer.a;
                                if (r16 != 0) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    R(linearSystem, zW2);
                                    size = this.r0.size();
                                    i9 = 0;
                                    z9 = false;
                                    while (i9 < size) {
                                        boolean[] zArr7 = zArr;
                                        constraintWidget = (ConstraintWidget) this.r0.get(i9);
                                        constraintWidget.R(linearSystem, zW2);
                                        int i412 = i9;
                                        boolean z111 = zW2;
                                        if (constraintWidget.h == -1) {
                                            z9 = true;
                                        } else {
                                            z9 = true;
                                        }
                                        i9 = i412 + 1;
                                        zArr = zArr7;
                                        zW2 = z111;
                                        z9 = z9;
                                    }
                                    zArr2 = zArr;
                                    z7 = z9;
                                } else {
                                    zArr2 = zArr;
                                    R(linearSystem, zW);
                                    while (i7 < i3) {
                                        ((ConstraintWidget) this.r0.get(i7)).R(linearSystem, zW);
                                    }
                                    z7 = false;
                                }
                                if (!z3) {
                                }
                                iMax = Math.max(this.d0, r());
                                z8 = z7;
                                if (iMax > r()) {
                                    P(iMax);
                                    dimensionBehaviourArr[0] = dimensionBehaviour5;
                                    z8 = true;
                                    z6 = true;
                                }
                                iMax2 = Math.max(this.e0, l());
                                if (iMax2 > l()) {
                                    M(iMax2);
                                    r14 = 1;
                                    dimensionBehaviourArr[1] = dimensionBehaviour5;
                                    r17 = 1;
                                    z6 = true;
                                } else {
                                    r14 = 1;
                                }
                                if (z6) {
                                    r17 = z8;
                                    if (dimensionBehaviourArr[0] == dimensionBehaviour) {
                                        r17 = r17;
                                        if (r() > i) {
                                            this.F0 = r14;
                                            dimensionBehaviourArr[0] = dimensionBehaviour5;
                                            P(i);
                                            ?? r114 = r14;
                                            z6 = r114 == true ? 1 : 0;
                                            r17 = r114;
                                        }
                                    }
                                    r17 = r17;
                                    r17 = r17;
                                    if (dimensionBehaviourArr[r14] == dimensionBehaviour) {
                                        r17 = z8;
                                        z4 = z6;
                                        i8 = 8;
                                        r18 = r17;
                                    } else {
                                        r17 = z8;
                                        z4 = z6;
                                        i8 = 8;
                                        r18 = r17;
                                    }
                                } else {
                                    r17 = z8;
                                    z4 = z6;
                                    i8 = 8;
                                    r18 = r17;
                                }
                                if (i6 > i8) {
                                    r18 = 0;
                                }
                                i5 = i6;
                                z3 = z3;
                                dimensionBehaviour3 = dimensionBehaviour5;
                                constraintAnchor2 = constraintAnchor4;
                                r15 = r18;
                            }
                            z5 = z4;
                            this.r0 = arrayList12;
                            if (z5) {
                                dimensionBehaviourArr[0] = dimensionBehaviour2;
                                dimensionBehaviourArr[1] = dimensionBehaviour4;
                            }
                            G(linearSystem.l);
                        }
                        i12 = i11;
                        iR = i12;
                        dimensionBehaviour4 = dimensionBehaviour6;
                        if (dimensionBehaviour4 == dimensionBehaviour) {
                            i13 = iMax4;
                            if (i13 < l()) {
                            }
                            iL = l();
                            iMax4 = iL;
                            i = iR;
                            z = true;
                            if (W(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            linearSystem.getClass();
                            linearSystem.g = false;
                            if (this.E0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList13 = this.r0;
                            if (dimensionBehaviourArr[0] != dimensionBehaviour) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.A0 = 0;
                            this.B0 = 0;
                            i3 = i2;
                            while (i4 < i3) {
                                constraintWidget2 = (ConstraintWidget) this.r0.get(i4);
                                if (constraintWidget2 instanceof WidgetContainer) {
                                    ((WidgetContainer) constraintWidget2).S();
                                }
                            }
                            zW = W(64);
                            z4 = z;
                            i5 = 0;
                            r15 = 1;
                            while (r15 != 0) {
                                i6 = i5 + 1;
                                linearSystem.t();
                                dimensionBehaviour5 = dimensionBehaviour3;
                                this.A0 = 0;
                                this.B0 = 0;
                                h(linearSystem);
                                while (i10 < i3) {
                                    ((ConstraintWidget) this.r0.get(i10)).h(linearSystem);
                                }
                                U(linearSystem);
                                weakReference = this.H0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        constraintAnchor5 = constraintAnchor2;
                                        z3 = z3;
                                        z6 = z4;
                                        linearSystem.f(linearSystem.k((ConstraintAnchor) this.H0.get()), linearSystem.k(constraintAnchor5), 0, 5);
                                        this.H0 = null;
                                    } else {
                                        z6 = z4;
                                        constraintAnchor5 = constraintAnchor2;
                                        z3 = z3;
                                    }
                                    weakReference2 = this.J0;
                                    if (weakReference2 != null) {
                                        linearSystem.f(linearSystem.k(this.M), linearSystem.k((ConstraintAnchor) this.J0.get()), 0, 5);
                                        this.J0 = null;
                                    }
                                    weakReference3 = this.I0;
                                    if (weakReference3 != null) {
                                        constraintAnchor6 = constraintAnchor;
                                        constraintAnchor = constraintAnchor6;
                                        linearSystem.f(linearSystem.k((ConstraintAnchor) this.I0.get()), linearSystem.k(constraintAnchor6), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference4 = this.K0;
                                    if (weakReference4 == null) {
                                    }
                                    linearSystem.p();
                                    constraintAnchor4 = constraintAnchor5;
                                    r16 = 1;
                                } else {
                                    z6 = z4;
                                    constraintAnchor5 = constraintAnchor2;
                                    z3 = z3;
                                    weakReference2 = this.J0;
                                    if (weakReference2 != null) {
                                        linearSystem.f(linearSystem.k(this.M), linearSystem.k((ConstraintAnchor) this.J0.get()), 0, 5);
                                        this.J0 = null;
                                    }
                                    weakReference3 = this.I0;
                                    if (weakReference3 != null) {
                                        constraintAnchor6 = constraintAnchor;
                                        constraintAnchor = constraintAnchor6;
                                        linearSystem.f(linearSystem.k((ConstraintAnchor) this.I0.get()), linearSystem.k(constraintAnchor6), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference4 = this.K0;
                                    if (weakReference4 == null) {
                                    }
                                    linearSystem.p();
                                    constraintAnchor4 = constraintAnchor5;
                                    r16 = 1;
                                }
                                zArr = Optimizer.a;
                                if (r16 != 0) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    R(linearSystem, zW2);
                                    size = this.r0.size();
                                    i9 = 0;
                                    z9 = false;
                                    while (i9 < size) {
                                        boolean[] zArr8 = zArr;
                                        constraintWidget = (ConstraintWidget) this.r0.get(i9);
                                        constraintWidget.R(linearSystem, zW2);
                                        int i413 = i9;
                                        boolean z112 = zW2;
                                        if (constraintWidget.h == -1) {
                                            z9 = true;
                                        } else {
                                            z9 = true;
                                        }
                                        i9 = i413 + 1;
                                        zArr = zArr8;
                                        zW2 = z112;
                                        z9 = z9;
                                    }
                                    zArr2 = zArr;
                                    z7 = z9;
                                } else {
                                    zArr2 = zArr;
                                    R(linearSystem, zW);
                                    while (i7 < i3) {
                                        ((ConstraintWidget) this.r0.get(i7)).R(linearSystem, zW);
                                    }
                                    z7 = false;
                                }
                                if (!z3) {
                                }
                                iMax = Math.max(this.d0, r());
                                z8 = z7;
                                if (iMax > r()) {
                                    P(iMax);
                                    dimensionBehaviourArr[0] = dimensionBehaviour5;
                                    z8 = true;
                                    z6 = true;
                                }
                                iMax2 = Math.max(this.e0, l());
                                if (iMax2 > l()) {
                                    M(iMax2);
                                    r14 = 1;
                                    dimensionBehaviourArr[1] = dimensionBehaviour5;
                                    r17 = 1;
                                    z6 = true;
                                } else {
                                    r14 = 1;
                                }
                                if (z6) {
                                    r17 = z8;
                                    if (dimensionBehaviourArr[0] == dimensionBehaviour) {
                                        r17 = r17;
                                        if (r() > i) {
                                            this.F0 = r14;
                                            dimensionBehaviourArr[0] = dimensionBehaviour5;
                                            P(i);
                                            ?? r115 = r14;
                                            z6 = r115 == true ? 1 : 0;
                                            r17 = r115;
                                        }
                                    }
                                    r17 = r17;
                                    r17 = r17;
                                    if (dimensionBehaviourArr[r14] == dimensionBehaviour) {
                                        r17 = z8;
                                        z4 = z6;
                                        i8 = 8;
                                        r18 = r17;
                                    } else {
                                        r17 = z8;
                                        z4 = z6;
                                        i8 = 8;
                                        r18 = r17;
                                    }
                                } else {
                                    r17 = z8;
                                    z4 = z6;
                                    i8 = 8;
                                    r18 = r17;
                                }
                                if (i6 > i8) {
                                    r18 = 0;
                                }
                                i5 = i6;
                                z3 = z3;
                                dimensionBehaviour3 = dimensionBehaviour5;
                                constraintAnchor2 = constraintAnchor4;
                                r15 = r18;
                            }
                            z5 = z4;
                            this.r0 = arrayList13;
                            if (z5) {
                                dimensionBehaviourArr[0] = dimensionBehaviour2;
                                dimensionBehaviourArr[1] = dimensionBehaviour4;
                            }
                            G(linearSystem.l);
                        }
                        i13 = iMax4;
                        iL = i13;
                        iMax4 = iL;
                        i = iR;
                        z = true;
                        if (W(64)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        linearSystem.getClass();
                        linearSystem.g = false;
                        if (this.E0 == 0) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        ArrayList arrayList14 = this.r0;
                        if (dimensionBehaviourArr[0] != dimensionBehaviour) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        this.A0 = 0;
                        this.B0 = 0;
                        i3 = i2;
                        while (i4 < i3) {
                            constraintWidget2 = (ConstraintWidget) this.r0.get(i4);
                            if (constraintWidget2 instanceof WidgetContainer) {
                                ((WidgetContainer) constraintWidget2).S();
                            }
                        }
                        zW = W(64);
                        z4 = z;
                        i5 = 0;
                        r15 = 1;
                        while (r15 != 0) {
                            i6 = i5 + 1;
                            linearSystem.t();
                            dimensionBehaviour5 = dimensionBehaviour3;
                            this.A0 = 0;
                            this.B0 = 0;
                            h(linearSystem);
                            while (i10 < i3) {
                                ((ConstraintWidget) this.r0.get(i10)).h(linearSystem);
                            }
                            U(linearSystem);
                            weakReference = this.H0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    constraintAnchor5 = constraintAnchor2;
                                    z3 = z3;
                                    z6 = z4;
                                    linearSystem.f(linearSystem.k((ConstraintAnchor) this.H0.get()), linearSystem.k(constraintAnchor5), 0, 5);
                                    this.H0 = null;
                                } else {
                                    z6 = z4;
                                    constraintAnchor5 = constraintAnchor2;
                                    z3 = z3;
                                }
                                weakReference2 = this.J0;
                                if (weakReference2 != null) {
                                    linearSystem.f(linearSystem.k(this.M), linearSystem.k((ConstraintAnchor) this.J0.get()), 0, 5);
                                    this.J0 = null;
                                }
                                weakReference3 = this.I0;
                                if (weakReference3 != null) {
                                    constraintAnchor6 = constraintAnchor;
                                    constraintAnchor = constraintAnchor6;
                                    linearSystem.f(linearSystem.k((ConstraintAnchor) this.I0.get()), linearSystem.k(constraintAnchor6), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference4 = this.K0;
                                if (weakReference4 == null) {
                                }
                                linearSystem.p();
                                constraintAnchor4 = constraintAnchor5;
                                r16 = 1;
                            } else {
                                z6 = z4;
                                constraintAnchor5 = constraintAnchor2;
                                z3 = z3;
                                weakReference2 = this.J0;
                                if (weakReference2 != null) {
                                    linearSystem.f(linearSystem.k(this.M), linearSystem.k((ConstraintAnchor) this.J0.get()), 0, 5);
                                    this.J0 = null;
                                }
                                weakReference3 = this.I0;
                                if (weakReference3 != null) {
                                    constraintAnchor6 = constraintAnchor;
                                    constraintAnchor = constraintAnchor6;
                                    linearSystem.f(linearSystem.k((ConstraintAnchor) this.I0.get()), linearSystem.k(constraintAnchor6), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference4 = this.K0;
                                if (weakReference4 == null) {
                                }
                                linearSystem.p();
                                constraintAnchor4 = constraintAnchor5;
                                r16 = 1;
                            }
                            zArr = Optimizer.a;
                            if (r16 != 0) {
                                zArr[2] = false;
                                zW2 = W(64);
                                R(linearSystem, zW2);
                                size = this.r0.size();
                                i9 = 0;
                                z9 = false;
                                while (i9 < size) {
                                    boolean[] zArr9 = zArr;
                                    constraintWidget = (ConstraintWidget) this.r0.get(i9);
                                    constraintWidget.R(linearSystem, zW2);
                                    int i414 = i9;
                                    boolean z113 = zW2;
                                    if (constraintWidget.h == -1) {
                                        z9 = true;
                                    } else {
                                        z9 = true;
                                    }
                                    i9 = i414 + 1;
                                    zArr = zArr9;
                                    zW2 = z113;
                                    z9 = z9;
                                }
                                zArr2 = zArr;
                                z7 = z9;
                            } else {
                                zArr2 = zArr;
                                R(linearSystem, zW);
                                while (i7 < i3) {
                                    ((ConstraintWidget) this.r0.get(i7)).R(linearSystem, zW);
                                }
                                z7 = false;
                            }
                            if (!z3) {
                            }
                            iMax = Math.max(this.d0, r());
                            z8 = z7;
                            if (iMax > r()) {
                                P(iMax);
                                dimensionBehaviourArr[0] = dimensionBehaviour5;
                                z8 = true;
                                z6 = true;
                            }
                            iMax2 = Math.max(this.e0, l());
                            if (iMax2 > l()) {
                                M(iMax2);
                                r14 = 1;
                                dimensionBehaviourArr[1] = dimensionBehaviour5;
                                r17 = 1;
                                z6 = true;
                            } else {
                                r14 = 1;
                            }
                            if (z6) {
                                r17 = z8;
                                if (dimensionBehaviourArr[0] == dimensionBehaviour) {
                                    r17 = r17;
                                    if (r() > i) {
                                        this.F0 = r14;
                                        dimensionBehaviourArr[0] = dimensionBehaviour5;
                                        P(i);
                                        ?? r116 = r14;
                                        z6 = r116 == true ? 1 : 0;
                                        r17 = r116;
                                    }
                                }
                                r17 = r17;
                                r17 = r17;
                                if (dimensionBehaviourArr[r14] == dimensionBehaviour) {
                                    r17 = z8;
                                    z4 = z6;
                                    i8 = 8;
                                    r18 = r17;
                                } else {
                                    r17 = z8;
                                    z4 = z6;
                                    i8 = 8;
                                    r18 = r17;
                                }
                            } else {
                                r17 = z8;
                                z4 = z6;
                                i8 = 8;
                                r18 = r17;
                            }
                            if (i6 > i8) {
                                r18 = 0;
                            }
                            i5 = i6;
                            z3 = z3;
                            dimensionBehaviour3 = dimensionBehaviour5;
                            constraintAnchor2 = constraintAnchor4;
                            r15 = r18;
                        }
                        z5 = z4;
                        this.r0 = arrayList14;
                        if (z5) {
                            dimensionBehaviourArr[0] = dimensionBehaviour2;
                            dimensionBehaviourArr[1] = dimensionBehaviour4;
                        }
                        G(linearSystem.l);
                    }
                    dimensionBehaviour3 = dimensionBehaviour23;
                    linearSystem = linearSystem4;
                    dimensionBehaviour = dimensionBehaviour22;
                }
                dimensionBehaviour4 = dimensionBehaviour6;
                i = i11;
                dimensionBehaviour2 = dimensionBehaviour7;
            }
        }
        z = false;
        if (W(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        linearSystem.getClass();
        linearSystem.g = false;
        if (this.E0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList15 = this.r0;
        if (dimensionBehaviourArr[0] != dimensionBehaviour) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.A0 = 0;
        this.B0 = 0;
        i3 = i2;
        while (i4 < i3) {
            constraintWidget2 = (ConstraintWidget) this.r0.get(i4);
            if (constraintWidget2 instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget2).S();
            }
        }
        zW = W(64);
        z4 = z;
        i5 = 0;
        r15 = 1;
        while (r15 != 0) {
            i6 = i5 + 1;
            linearSystem.t();
            dimensionBehaviour5 = dimensionBehaviour3;
            this.A0 = 0;
            this.B0 = 0;
            h(linearSystem);
            while (i10 < i3) {
                ((ConstraintWidget) this.r0.get(i10)).h(linearSystem);
            }
            U(linearSystem);
            weakReference = this.H0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    constraintAnchor5 = constraintAnchor2;
                    z3 = z3;
                    z6 = z4;
                    linearSystem.f(linearSystem.k((ConstraintAnchor) this.H0.get()), linearSystem.k(constraintAnchor5), 0, 5);
                    this.H0 = null;
                } else {
                    z6 = z4;
                    constraintAnchor5 = constraintAnchor2;
                    z3 = z3;
                }
                weakReference2 = this.J0;
                if (weakReference2 != null) {
                    linearSystem.f(linearSystem.k(this.M), linearSystem.k((ConstraintAnchor) this.J0.get()), 0, 5);
                    this.J0 = null;
                }
                weakReference3 = this.I0;
                if (weakReference3 != null) {
                    constraintAnchor6 = constraintAnchor;
                    constraintAnchor = constraintAnchor6;
                    linearSystem.f(linearSystem.k((ConstraintAnchor) this.I0.get()), linearSystem.k(constraintAnchor6), 0, 5);
                    this.I0 = null;
                }
                weakReference4 = this.K0;
                if (weakReference4 == null) {
                }
                linearSystem.p();
                constraintAnchor4 = constraintAnchor5;
                r16 = 1;
            } else {
                z6 = z4;
                constraintAnchor5 = constraintAnchor2;
                z3 = z3;
                weakReference2 = this.J0;
                if (weakReference2 != null) {
                    linearSystem.f(linearSystem.k(this.M), linearSystem.k((ConstraintAnchor) this.J0.get()), 0, 5);
                    this.J0 = null;
                }
                weakReference3 = this.I0;
                if (weakReference3 != null) {
                    constraintAnchor6 = constraintAnchor;
                    constraintAnchor = constraintAnchor6;
                    linearSystem.f(linearSystem.k((ConstraintAnchor) this.I0.get()), linearSystem.k(constraintAnchor6), 0, 5);
                    this.I0 = null;
                }
                weakReference4 = this.K0;
                if (weakReference4 == null) {
                }
                linearSystem.p();
                constraintAnchor4 = constraintAnchor5;
                r16 = 1;
            }
            zArr = Optimizer.a;
            if (r16 != 0) {
                zArr[2] = false;
                zW2 = W(64);
                R(linearSystem, zW2);
                size = this.r0.size();
                i9 = 0;
                z9 = false;
                while (i9 < size) {
                    boolean[] zArr10 = zArr;
                    constraintWidget = (ConstraintWidget) this.r0.get(i9);
                    constraintWidget.R(linearSystem, zW2);
                    int i415 = i9;
                    boolean z114 = zW2;
                    if (constraintWidget.h == -1) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    i9 = i415 + 1;
                    zArr = zArr10;
                    zW2 = z114;
                    z9 = z9;
                }
                zArr2 = zArr;
                z7 = z9;
            } else {
                zArr2 = zArr;
                R(linearSystem, zW);
                while (i7 < i3) {
                    ((ConstraintWidget) this.r0.get(i7)).R(linearSystem, zW);
                }
                z7 = false;
            }
            if (!z3) {
            }
            iMax = Math.max(this.d0, r());
            z8 = z7;
            if (iMax > r()) {
                P(iMax);
                dimensionBehaviourArr[0] = dimensionBehaviour5;
                z8 = true;
                z6 = true;
            }
            iMax2 = Math.max(this.e0, l());
            if (iMax2 > l()) {
                M(iMax2);
                r14 = 1;
                dimensionBehaviourArr[1] = dimensionBehaviour5;
                r17 = 1;
                z6 = true;
            } else {
                r14 = 1;
            }
            if (z6) {
                r17 = z8;
                if (dimensionBehaviourArr[0] == dimensionBehaviour) {
                    r17 = r17;
                    if (r() > i) {
                        this.F0 = r14;
                        dimensionBehaviourArr[0] = dimensionBehaviour5;
                        P(i);
                        ?? r117 = r14;
                        z6 = r117 == true ? 1 : 0;
                        r17 = r117;
                    }
                }
                r17 = r17;
                r17 = r17;
                if (dimensionBehaviourArr[r14] == dimensionBehaviour) {
                    r17 = z8;
                    z4 = z6;
                    i8 = 8;
                    r18 = r17;
                } else {
                    r17 = z8;
                    z4 = z6;
                    i8 = 8;
                    r18 = r17;
                }
            } else {
                r17 = z8;
                z4 = z6;
                i8 = 8;
                r18 = r17;
            }
            if (i6 > i8) {
                r18 = 0;
            }
            i5 = i6;
            z3 = z3;
            dimensionBehaviour3 = dimensionBehaviour5;
            constraintAnchor2 = constraintAnchor4;
            r15 = r18;
        }
        z5 = z4;
        this.r0 = arrayList15;
        if (z5) {
            dimensionBehaviourArr[0] = dimensionBehaviour2;
            dimensionBehaviourArr[1] = dimensionBehaviour4;
        }
        G(linearSystem.l);
    }

    public final void T(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            int i2 = this.A0 + 1;
            ChainHead[] chainHeadArr = this.D0;
            if (i2 >= chainHeadArr.length) {
                this.D0 = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
            }
            ChainHead[] chainHeadArr2 = this.D0;
            int i3 = this.A0;
            chainHeadArr2[i3] = new ChainHead(constraintWidget, 0, this.w0);
            this.A0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.B0 + 1;
            ChainHead[] chainHeadArr3 = this.C0;
            if (i4 >= chainHeadArr3.length) {
                this.C0 = (ChainHead[]) Arrays.copyOf(chainHeadArr3, chainHeadArr3.length * 2);
            }
            ChainHead[] chainHeadArr4 = this.C0;
            int i5 = this.B0;
            chainHeadArr4[i5] = new ChainHead(constraintWidget, 1, this.w0);
            this.B0 = i5 + 1;
        }
    }

    public static void V(ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, BasicMeasure.Measure measure) {
        int i;
        int i2;
        if (measurer == null) {
            return;
        }
        int i3 = constraintWidget.i0;
        int[] iArr = constraintWidget.t;
        if (i3 == 8 || (constraintWidget instanceof Guideline) || (constraintWidget instanceof Barrier)) {
            measure.e = 0;
            measure.f = 0;
            return;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
        measure.a = dimensionBehaviourArr[0];
        measure.b = dimensionBehaviourArr[1];
        measure.c = constraintWidget.r();
        measure.d = constraintWidget.l();
        measure.i = false;
        measure.j = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.c;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = measure.b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.Y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z4 = z2 && constraintWidget.Y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.a;
        if (z && constraintWidget.u(0) && constraintWidget.r == 0 && !z3) {
            measure.a = dimensionBehaviour3;
            if (z2 && constraintWidget.s == 0) {
                measure.a = dimensionBehaviour4;
            }
            z = false;
        }
        if (z2 && constraintWidget.u(1) && constraintWidget.s == 0 && !z4) {
            measure.b = dimensionBehaviour3;
            if (z && constraintWidget.r == 0) {
                measure.b = dimensionBehaviour4;
            }
            z2 = false;
        }
        if (constraintWidget.B()) {
            measure.a = dimensionBehaviour4;
            z = false;
        }
        if (constraintWidget.C()) {
            measure.b = dimensionBehaviour4;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                measure.a = dimensionBehaviour4;
            } else if (!z2) {
                if (measure.b == dimensionBehaviour4) {
                    i2 = measure.d;
                } else {
                    measure.a = dimensionBehaviour3;
                    measurer.b(constraintWidget, measure);
                    i2 = measure.f;
                }
                measure.a = dimensionBehaviour4;
                measure.c = (int) (constraintWidget.Y * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                measure.b = dimensionBehaviour4;
            } else if (!z) {
                if (measure.a == dimensionBehaviour4) {
                    i = measure.c;
                } else {
                    measure.b = dimensionBehaviour3;
                    measurer.b(constraintWidget, measure);
                    i = measure.e;
                }
                measure.b = dimensionBehaviour4;
                int i4 = constraintWidget.Z;
                float f = constraintWidget.Y;
                if (i4 == -1) {
                    measure.d = (int) (i / f);
                } else {
                    measure.d = (int) (f * i);
                }
            }
        }
        measurer.b(constraintWidget, measure);
        constraintWidget.P(measure.e);
        constraintWidget.M(measure.f);
        constraintWidget.E = measure.h;
        constraintWidget.J(measure.g);
        measure.j = 0;
    }

    @Override // androidx.constraintlayout.core.widgets.WidgetContainer, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void D() {
        this.x0.t();
        this.y0 = 0;
        this.z0 = 0;
        super.D();
    }

    public final void U(LinearSystem linearSystem) {
        ConstraintWidgetContainer constraintWidgetContainer;
        LinearSystem linearSystem2;
        boolean zW = W(64);
        c(linearSystem, zW);
        int size = this.r0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.r0.get(i);
            boolean[] zArr = constraintWidget.T;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof Barrier) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.r0.get(i2);
                if (constraintWidget2 instanceof Barrier) {
                    Barrier barrier = (Barrier) constraintWidget2;
                    for (int i3 = 0; i3 < barrier.s0; i3++) {
                        ConstraintWidget constraintWidget3 = barrier.r0[i3];
                        if (barrier.u0 || constraintWidget3.d()) {
                            int i4 = barrier.t0;
                            if (i4 == 0 || i4 == 1) {
                                constraintWidget3.T[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                constraintWidget3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.L0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = (ConstraintWidget) this.r0.get(i5);
            constraintWidget4.getClass();
            boolean z2 = constraintWidget4 instanceof VirtualLayout;
            if (z2 || (constraintWidget4 instanceof Guideline)) {
                if (z2) {
                    hashSet.add(constraintWidget4);
                } else {
                    constraintWidget4.c(linearSystem, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                VirtualLayout virtualLayout = (VirtualLayout) ((ConstraintWidget) it.next());
                for (int i6 = 0; i6 < virtualLayout.s0; i6++) {
                    if (hashSet.contains(virtualLayout.r0[i6])) {
                        virtualLayout.c(linearSystem, zW);
                        hashSet.remove(virtualLayout);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ConstraintWidget) it2.next()).c(linearSystem, zW);
                }
                hashSet.clear();
            }
        }
        boolean z3 = LinearSystem.p;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.b;
        if (z3) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) this.r0.get(i7);
                constraintWidget5.getClass();
                if (!(constraintWidget5 instanceof VirtualLayout) && !(constraintWidget5 instanceof Guideline)) {
                    hashSet2.add(constraintWidget5);
                }
            }
            constraintWidgetContainer = this;
            linearSystem2 = linearSystem;
            constraintWidgetContainer.b(this, linearSystem2, hashSet2, this.U[0] == dimensionBehaviour ? 0 : 1, false);
            for (ConstraintWidget constraintWidget6 : hashSet2) {
                Optimizer.a(constraintWidgetContainer, linearSystem2, constraintWidget6);
                constraintWidget6.c(linearSystem2, zW);
            }
        } else {
            constraintWidgetContainer = this;
            linearSystem2 = linearSystem;
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget7 = (ConstraintWidget) constraintWidgetContainer.r0.get(i8);
                if (constraintWidget7 instanceof ConstraintWidgetContainer) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.U;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.a;
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget7.N(dimensionBehaviour4);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget7.O(dimensionBehaviour4);
                    }
                    constraintWidget7.c(linearSystem2, zW);
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget7.N(dimensionBehaviour2);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget7.O(dimensionBehaviour3);
                    }
                } else {
                    Optimizer.a(constraintWidgetContainer, linearSystem2, constraintWidget7);
                    if (!(constraintWidget7 instanceof VirtualLayout) && !(constraintWidget7 instanceof Guideline)) {
                        constraintWidget7.c(linearSystem2, zW);
                    }
                }
            }
        }
        if (constraintWidgetContainer.A0 > 0) {
            Chain.a(constraintWidgetContainer, linearSystem2, null, 0);
        }
        if (constraintWidgetContainer.B0 > 0) {
            Chain.a(constraintWidgetContainer, linearSystem2, null, 1);
        }
    }

    public final boolean W(int i) {
        return (this.E0 & i) == i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void o(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        ArrayList arrayList = this.r0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ConstraintWidget) obj).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public ConstraintWidgetContainer() {
        this.r0 = new ArrayList();
        this.s0 = new BasicMeasure(this);
        DependencyGraph dependencyGraph = new DependencyGraph();
        dependencyGraph.b = true;
        dependencyGraph.c = true;
        dependencyGraph.e = new ArrayList();
        new ArrayList();
        dependencyGraph.f = null;
        dependencyGraph.g = new BasicMeasure.Measure();
        dependencyGraph.h = new ArrayList();
        dependencyGraph.a = this;
        dependencyGraph.d = this;
        this.t0 = dependencyGraph;
        this.v0 = null;
        this.w0 = false;
        this.x0 = new LinearSystem();
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new ChainHead[4];
        this.D0 = new ChainHead[4];
        this.E0 = 257;
        this.F0 = false;
        this.G0 = false;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = null;
        this.L0 = new HashSet();
        this.M0 = new BasicMeasure.Measure();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void Q(boolean z, boolean z2) {
        super.Q(z, z2);
        int size = this.r0.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.r0.get(i)).Q(z, z2);
        }
    }
}
