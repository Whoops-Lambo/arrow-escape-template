package androidx.constraintlayout.core;

import androidx.constraintlayout.core.PriorityGoalRow.GoalVariableAccessor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class LinearSystem {
    public static boolean p = false;
    public static int q = 1000;
    public final PriorityGoalRow c;
    public ArrayRow[] f;
    public final Cache l;
    public ArrayRow o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public SolverVariable[] m = new SolverVariable[q];
    public int n = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Row {
        SolverVariable a(boolean[] zArr);

        SolverVariable getKey();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ValuesRow extends ArrayRow {
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            ArrayRow arrayRow = this.f[i];
            arrayRow.a.e = arrayRow.b;
        }
    }

    public final void r(Row row) {
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.i * 2) {
                return;
            }
            if (row.getKey() != null) {
                this.h[row.getKey().b] = true;
            }
            SolverVariable solverVariableA = row.a(this.h);
            if (solverVariableA != null) {
                boolean[] zArr = this.h;
                int i3 = solverVariableA.b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (solverVariableA != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.j; i5++) {
                    ArrayRow arrayRow = this.f[i5];
                    if (arrayRow.a.i != SolverVariable.Type.a && !arrayRow.e && arrayRow.d.a(solverVariableA)) {
                        float fD = arrayRow.d.d(solverVariableA);
                        if (fD < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float f2 = (-arrayRow.b) / fD;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    ArrayRow arrayRow2 = this.f[i4];
                    arrayRow2.a.c = -1;
                    arrayRow2.g(solverVariableA);
                    SolverVariable solverVariable = arrayRow2.a;
                    solverVariable.c = i4;
                    solverVariable.e(this, arrayRow2);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            ArrayRow arrayRow = this.f[i];
            if (arrayRow != null) {
                this.l.a.a(arrayRow);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        Cache cache;
        int i = 0;
        while (true) {
            cache = this.l;
            SolverVariable[] solverVariableArr = cache.c;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.c();
            }
            i++;
        }
        Pools.SimplePool simplePool = cache.b;
        SolverVariable[] solverVariableArr2 = this.m;
        int length = this.n;
        simplePool.getClass();
        if (length > solverVariableArr2.length) {
            length = solverVariableArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            SolverVariable solverVariable2 = solverVariableArr2[i2];
            int i3 = simplePool.b;
            Object[] objArr = simplePool.a;
            if (i3 < objArr.length) {
                objArr[i3] = solverVariable2;
                simplePool.b = i3 + 1;
            }
        }
        this.n = 0;
        Arrays.fill(cache.c, (Object) null);
        this.b = 0;
        PriorityGoalRow priorityGoalRow = this.c;
        priorityGoalRow.h = 0;
        priorityGoalRow.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.i = 1;
        for (int i4 = 0; i4 < this.j; i4++) {
            ArrayRow arrayRow = this.f[i4];
        }
        s();
        this.j = 0;
        this.o = new ArrayRow(cache);
    }

    public static int n(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).i;
        if (solverVariable != null) {
            return (int) (solverVariable.e + 0.5f);
        }
        return 0;
    }

    public final SolverVariable a(SolverVariable.Type type) {
        Pools.SimplePool simplePool = this.l.b;
        int i = simplePool.b;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = simplePool.a;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            simplePool.b = i2;
            obj = obj2;
        }
        SolverVariable solverVariable = (SolverVariable) obj;
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type);
            solverVariable.i = type;
        } else {
            solverVariable.c();
            solverVariable.i = type;
        }
        int i3 = this.n;
        int i4 = q;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            q = i5;
            this.m = (SolverVariable[]) Arrays.copyOf(this.m, i5);
        }
        SolverVariable[] solverVariableArr = this.m;
        int i6 = this.n;
        this.n = i6 + 1;
        solverVariableArr[i6] = solverVariable;
        return solverVariable;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0197  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    public final void c(ArrayRow arrayRow) {
        boolean z;
        SolverVariable.Type type;
        boolean z2;
        SolverVariable solverVariableF;
        boolean z3 = true;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            o();
        }
        if (arrayRow.e) {
            z = false;
        } else {
            ArrayList arrayList = arrayRow.c;
            if (this.f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int i = arrayRow.d.i();
                    for (int i2 = 0; i2 < i; i2++) {
                        SolverVariable solverVariableB = arrayRow.d.b(i2);
                        if (solverVariableB.c != -1 || solverVariableB.f) {
                            arrayList.add(solverVariableB);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i3 = 0; i3 < size; i3++) {
                            SolverVariable solverVariable = (SolverVariable) arrayList.get(i3);
                            if (solverVariable.f) {
                                arrayRow.h(this, solverVariable, true);
                            } else {
                                arrayRow.i(this, this.f[solverVariable.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (arrayRow.a != null && arrayRow.d.i() == 0) {
                    arrayRow.e = true;
                    this.a = true;
                }
            }
            if (arrayRow.e()) {
                return;
            }
            float f = arrayRow.b;
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                arrayRow.b = f * (-1.0f);
                arrayRow.d.g();
            }
            int i4 = arrayRow.d.i();
            float f3 = 0.0f;
            float f4 = 0.0f;
            SolverVariable solverVariable2 = null;
            SolverVariable solverVariable3 = null;
            int i5 = 0;
            boolean z5 = false;
            boolean z6 = false;
            while (true) {
                type = SolverVariable.Type.a;
                if (i5 >= i4) {
                    break;
                }
                float fK = arrayRow.d.k(i5);
                float f5 = f2;
                SolverVariable solverVariableB2 = arrayRow.d.b(i5);
                if (solverVariableB2.i == type) {
                    if (solverVariable2 == null) {
                        if (solverVariableB2.l <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        f3 = fK;
                        solverVariable2 = solverVariableB2;
                    } else {
                        if (f3 > fK) {
                            if (solverVariableB2.l > 1) {
                                z5 = false;
                            }
                            f3 = fK;
                            solverVariable2 = solverVariableB2;
                        } else if (z5 || solverVariableB2.l > 1) {
                        }
                        z5 = true;
                        f3 = fK;
                        solverVariable2 = solverVariableB2;
                    }
                } else if (solverVariable2 == null && fK < f5) {
                    if (solverVariable3 == null) {
                        if (solverVariableB2.l <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        f4 = fK;
                        solverVariable3 = solverVariableB2;
                    } else {
                        if (f4 > fK) {
                            if (solverVariableB2.l > 1) {
                                z6 = false;
                            }
                            f4 = fK;
                            solverVariable3 = solverVariableB2;
                        } else if (z6 || solverVariableB2.l > 1) {
                        }
                        z6 = true;
                        f4 = fK;
                        solverVariable3 = solverVariableB2;
                    }
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (solverVariable2 == null) {
                solverVariable2 = solverVariable3;
            }
            if (solverVariable2 == null) {
                z2 = true;
            } else {
                arrayRow.g(solverVariable2);
                z2 = false;
            }
            if (arrayRow.d.i() == 0) {
                arrayRow.e = true;
            }
            if (z2) {
                if (this.i + 1 >= this.e) {
                    o();
                }
                SolverVariable solverVariableA = a(SolverVariable.Type.b);
                int i6 = this.b + 1;
                this.b = i6;
                this.i++;
                solverVariableA.b = i6;
                Cache cache = this.l;
                cache.c[i6] = solverVariableA;
                arrayRow.a = solverVariableA;
                int i7 = this.j;
                h(arrayRow);
                if (this.j == i7 + 1) {
                    ArrayRow arrayRow2 = this.o;
                    arrayRow2.a = null;
                    arrayRow2.d.clear();
                    for (int i8 = 0; i8 < arrayRow.d.i(); i8++) {
                        arrayRow2.d.f(arrayRow.d.b(i8), arrayRow.d.k(i8), true);
                    }
                    r(this.o);
                    if (solverVariableA.c == -1) {
                        if (arrayRow.a == solverVariableA && (solverVariableF = arrayRow.f(null, solverVariableA)) != null) {
                            arrayRow.g(solverVariableF);
                        }
                        if (!arrayRow.e) {
                            arrayRow.a.e(this, arrayRow);
                        }
                        cache.a.a(arrayRow);
                        this.j--;
                    }
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            SolverVariable solverVariable4 = arrayRow.a;
            if (solverVariable4 == null) {
                return;
            }
            if (solverVariable4.i != type && arrayRow.b < f6) {
                return;
            } else {
                z = z3;
            }
        }
        if (z) {
            return;
        }
        h(arrayRow);
    }

    public final void d(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.c;
        if (i2 == -1) {
            solverVariable.d(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                SolverVariable solverVariable2 = this.l.c[i3];
            }
            return;
        }
        if (i2 == -1) {
            ArrayRow arrayRowL = l();
            arrayRowL.a = solverVariable;
            float f = i;
            solverVariable.e = f;
            arrayRowL.b = f;
            arrayRowL.e = true;
            c(arrayRowL);
            return;
        }
        ArrayRow arrayRow = this.f[i2];
        if (arrayRow.e) {
            arrayRow.b = i;
            return;
        }
        if (arrayRow.d.i() == 0) {
            arrayRow.e = true;
            arrayRow.b = i;
            return;
        }
        ArrayRow arrayRowL2 = l();
        if (i < 0) {
            arrayRowL2.b = i * (-1);
            arrayRowL2.d.c(solverVariable, 1.0f);
        } else {
            arrayRowL2.b = i;
            arrayRowL2.d.c(solverVariable, -1.0f);
        }
        c(arrayRowL2);
    }

    public final void e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (i2 == 8 && solverVariable2.f && solverVariable.c == -1) {
            solverVariable.d(this, solverVariable2.e + i);
            return;
        }
        ArrayRow arrayRowL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            arrayRowL.b = i;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRowL.d;
        if (z) {
            arrayRowVariables.c(solverVariable, 1.0f);
            arrayRowL.d.c(solverVariable2, -1.0f);
        } else {
            arrayRowVariables.c(solverVariable, -1.0f);
            arrayRowL.d.c(solverVariable2, 1.0f);
        }
        if (i2 != 8) {
            arrayRowL.b(this, i2);
        }
        c(arrayRowL);
    }

    public final void h(ArrayRow arrayRow) {
        int i;
        if (arrayRow.e) {
            arrayRow.a.d(this, arrayRow.b);
        } else {
            ArrayRow[] arrayRowArr = this.f;
            int i2 = this.j;
            arrayRowArr[i2] = arrayRow;
            SolverVariable solverVariable = arrayRow.a;
            solverVariable.c = i2;
            this.j = i2 + 1;
            solverVariable.e(this, arrayRow);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                ArrayRow arrayRow2 = this.f[i3];
                if (arrayRow2 != null && arrayRow2.e) {
                    arrayRow2.a.d(this, arrayRow2.b);
                    this.l.a.a(arrayRow2);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        ArrayRow[] arrayRowArr2 = this.f;
                        int i6 = i4 - 1;
                        ArrayRow arrayRow3 = arrayRowArr2[i4];
                        arrayRowArr2[i6] = arrayRow3;
                        SolverVariable solverVariable2 = arrayRow3.a;
                        if (solverVariable2.c == i4) {
                            solverVariable2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final SolverVariable j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.c);
        float[] fArr = solverVariableA.h;
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        solverVariableA.b = i2;
        solverVariableA.d = i;
        this.l.c[i2] = solverVariableA;
        PriorityGoalRow priorityGoalRow = this.c;
        priorityGoalRow.i.a = solverVariableA;
        Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fArr[solverVariableA.d] = 1.0f;
        priorityGoalRow.j(solverVariableA);
        return solverVariableA;
    }

    public final SolverVariable k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (!(obj instanceof ConstraintAnchor)) {
            return null;
        }
        ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
        SolverVariable solverVariable = constraintAnchor.i;
        if (solverVariable == null) {
            constraintAnchor.k();
            solverVariable = constraintAnchor.i;
        }
        int i = solverVariable.b;
        Cache cache = this.l;
        if (i != -1 && i <= this.b && cache.c[i] != null) {
            return solverVariable;
        }
        if (i != -1) {
            solverVariable.c();
        }
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        solverVariable.b = i2;
        solverVariable.i = SolverVariable.Type.a;
        cache.c[i2] = solverVariable;
        return solverVariable;
    }

    public final ArrayRow l() {
        Object obj;
        Cache cache = this.l;
        Pools.SimplePool simplePool = cache.a;
        int i = simplePool.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = simplePool.a;
            obj = objArr[i2];
            objArr[i2] = null;
            simplePool.b = i2;
        } else {
            obj = null;
        }
        ArrayRow arrayRow = (ArrayRow) obj;
        if (arrayRow == null) {
            return new ArrayRow(cache);
        }
        arrayRow.a = null;
        arrayRow.d.clear();
        arrayRow.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        arrayRow.e = false;
        return arrayRow;
    }

    public final SolverVariable m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.b);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        solverVariableA.b = i;
        this.l.c[i] = solverVariableA;
        return solverVariableA;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (ArrayRow[]) Arrays.copyOf(this.f, i);
        Cache cache = this.l;
        cache.c = (SolverVariable[]) Arrays.copyOf(cache.c, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        PriorityGoalRow priorityGoalRow = this.c;
        if (priorityGoalRow.e()) {
            i();
            return;
        }
        if (!this.g) {
            q(priorityGoalRow);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f[i].e) {
                q(priorityGoalRow);
                return;
            }
        }
        i();
    }

    public final void q(PriorityGoalRow priorityGoalRow) {
        for (int i = 0; i < this.j; i++) {
            ArrayRow arrayRow = this.f[i];
            SolverVariable.Type type = arrayRow.a.i;
            SolverVariable.Type type2 = SolverVariable.Type.a;
            if (type != type2) {
                float f = arrayRow.b;
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f3 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.j) {
                            ArrayRow arrayRow2 = this.f[i3];
                            if (arrayRow2.a.i != type2 && !arrayRow2.e && arrayRow2.b < f2) {
                                int i7 = arrayRow2.d.i();
                                int i8 = 0;
                                while (i8 < i7) {
                                    SolverVariable solverVariableB = arrayRow2.d.b(i8);
                                    float f4 = f2;
                                    float fD = arrayRow2.d.d(solverVariableB);
                                    if (fD > f4) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f5 = solverVariableB.g[i9] / fD;
                                            if ((f5 < f3 && i9 == i6) || i9 > i6) {
                                                i6 = i9;
                                                i5 = solverVariableB.b;
                                                i4 = i3;
                                                f3 = f5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f2 = f4;
                                }
                            }
                            i3++;
                            f2 = f2;
                        }
                        float f6 = f2;
                        if (i4 != -1) {
                            ArrayRow arrayRow3 = this.f[i4];
                            arrayRow3.a.c = -1;
                            arrayRow3.g(this.l.c[i5]);
                            SolverVariable solverVariable = arrayRow3.a;
                            solverVariable.c = i4;
                            solverVariable.e(this, arrayRow3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.i / 2) {
                            z = true;
                        }
                        f2 = f6;
                    }
                    break;
                }
            }
        }
        r(priorityGoalRow);
        i();
    }

    public LinearSystem() {
        this.f = null;
        this.f = new ArrayRow[32];
        s();
        Cache cache = new Cache();
        new Pools.SimplePool();
        cache.a = new Pools.SimplePool();
        cache.b = new Pools.SimplePool();
        cache.c = new SolverVariable[32];
        this.l = cache;
        PriorityGoalRow priorityGoalRow = new PriorityGoalRow(cache);
        priorityGoalRow.f = new SolverVariable[128];
        priorityGoalRow.g = new SolverVariable[128];
        priorityGoalRow.h = 0;
        priorityGoalRow.i = priorityGoalRow.new GoalVariableAccessor();
        this.c = priorityGoalRow;
        this.o = new ArrayRow(cache);
    }

    public final void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        ArrayRow arrayRowL = l();
        if (solverVariable2 == solverVariable3) {
            arrayRowL.d.c(solverVariable, 1.0f);
            arrayRowL.d.c(solverVariable4, 1.0f);
            arrayRowL.d.c(solverVariable2, -2.0f);
        } else {
            ArrayRow.ArrayRowVariables arrayRowVariables = arrayRowL.d;
            if (f == 0.5f) {
                arrayRowVariables.c(solverVariable, 1.0f);
                arrayRowL.d.c(solverVariable2, -1.0f);
                arrayRowL.d.c(solverVariable3, -1.0f);
                arrayRowL.d.c(solverVariable4, 1.0f);
                if (i > 0 || i2 > 0) {
                    arrayRowL.b = (-i) + i2;
                }
            } else if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                arrayRowVariables.c(solverVariable, -1.0f);
                arrayRowL.d.c(solverVariable2, 1.0f);
                arrayRowL.b = i;
            } else if (f >= 1.0f) {
                arrayRowVariables.c(solverVariable4, -1.0f);
                arrayRowL.d.c(solverVariable3, 1.0f);
                arrayRowL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                arrayRowVariables.c(solverVariable, f2 * 1.0f);
                arrayRowL.d.c(solverVariable2, f2 * (-1.0f));
                arrayRowL.d.c(solverVariable3, (-1.0f) * f);
                arrayRowL.d.c(solverVariable4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    arrayRowL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            arrayRowL.b(this, i3);
        }
        c(arrayRowL);
    }

    public final void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow arrayRowL = l();
        SolverVariable solverVariableM = m();
        solverVariableM.d = 0;
        arrayRowL.c(solverVariable, solverVariable2, solverVariableM, i);
        if (i2 != 8) {
            arrayRowL.d.c(j(i2), (int) (arrayRowL.d.d(solverVariableM) * (-1.0f)));
        }
        c(arrayRowL);
    }

    public final void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow arrayRowL = l();
        SolverVariable solverVariableM = m();
        solverVariableM.d = 0;
        arrayRowL.d(solverVariable, solverVariable2, solverVariableM, i);
        if (i2 != 8) {
            arrayRowL.d.c(j(i2), (int) (arrayRowL.d.d(solverVariableM) * (-1.0f)));
        }
        c(arrayRowL);
    }
}
