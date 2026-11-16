package androidx.constraintlayout.core;

import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ArrayRow implements LinearSystem.Row {
    public final ArrayRowVariables d;
    public SolverVariable a = null;
    public float b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ArrayRowVariables {
        boolean a(SolverVariable solverVariable);

        SolverVariable b(int i);

        void c(SolverVariable solverVariable, float f);

        void clear();

        float d(SolverVariable solverVariable);

        void e(float f);

        void f(SolverVariable solverVariable, float f, boolean z);

        void g();

        float h(SolverVariable solverVariable, boolean z);

        int i();

        float j(ArrayRow arrayRow, boolean z);

        float k(int i);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        ArrayRowVariables arrayRowVariables = this.d;
        if (z) {
            arrayRowVariables.c(solverVariable, 1.0f);
            arrayRowVariables.c(solverVariable2, -1.0f);
            arrayRowVariables.c(solverVariable3, -1.0f);
        } else {
            arrayRowVariables.c(solverVariable, -1.0f);
            arrayRowVariables.c(solverVariable2, 1.0f);
            arrayRowVariables.c(solverVariable3, 1.0f);
        }
    }

    public final void d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        ArrayRowVariables arrayRowVariables = this.d;
        if (z) {
            arrayRowVariables.c(solverVariable, 1.0f);
            arrayRowVariables.c(solverVariable2, -1.0f);
            arrayRowVariables.c(solverVariable3, 1.0f);
        } else {
            arrayRowVariables.c(solverVariable, -1.0f);
            arrayRowVariables.c(solverVariable2, 1.0f);
            arrayRowVariables.c(solverVariable3, -1.0f);
        }
    }

    public boolean e() {
        return this.a == null && this.b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.d.i() == 0;
    }

    public final SolverVariable f(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        ArrayRowVariables arrayRowVariables = this.d;
        int i = arrayRowVariables.i();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            float fK = arrayRowVariables.k(i2);
            if (fK < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                SolverVariable solverVariableB = arrayRowVariables.b(i2);
                if ((zArr == null || !zArr[solverVariableB.b]) && solverVariableB != solverVariable && (((type = solverVariableB.i) == SolverVariable.Type.b || type == SolverVariable.Type.c) && fK < f)) {
                    f = fK;
                    solverVariable2 = solverVariableB;
                }
            }
        }
        return solverVariable2;
    }

    public final void g(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.a;
        ArrayRowVariables arrayRowVariables = this.d;
        if (solverVariable2 != null) {
            arrayRowVariables.c(solverVariable2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float fH = arrayRowVariables.h(solverVariable, true) * (-1.0f);
        this.a = solverVariable;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        arrayRowVariables.e(fH);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public final SolverVariable getKey() {
        return this.a;
    }

    public final void h(LinearSystem linearSystem, SolverVariable solverVariable, boolean z) {
        if (solverVariable.f) {
            ArrayRowVariables arrayRowVariables = this.d;
            float fD = arrayRowVariables.d(solverVariable);
            this.b = (solverVariable.e * fD) + this.b;
            arrayRowVariables.h(solverVariable, z);
            if (z) {
                solverVariable.b(this);
            }
            if (arrayRowVariables.i() == 0) {
                this.e = true;
                linearSystem.a = true;
            }
        }
    }

    public void i(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        ArrayRowVariables arrayRowVariables = this.d;
        float fJ = arrayRowVariables.j(arrayRow, z);
        this.b = (arrayRow.b * fJ) + this.b;
        if (z) {
            arrayRow.a.b(this);
        }
        if (this.a == null || arrayRowVariables.i() != 0) {
            return;
        }
        this.e = true;
        linearSystem.a = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.a == null ? "0" : "" + this.a).concat(" = ");
        if (this.b != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            StringBuilder sbP = h50.p(strConcat);
            sbP.append(this.b);
            strConcat = sbP.toString();
            z = true;
        } else {
            z = false;
        }
        ArrayRowVariables arrayRowVariables = this.d;
        int i = arrayRowVariables.i();
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableB = arrayRowVariables.b(i2);
            if (solverVariableB != null) {
                float fK = arrayRowVariables.k(i2);
                if (fK != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    String string = solverVariableB.toString();
                    if (z) {
                        if (fK > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            fK *= -1.0f;
                        }
                    } else if (fK < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        strConcat = strConcat.concat("- ");
                        fK *= -1.0f;
                    }
                    strConcat = fK == 1.0f ? strConcat.concat(string) : strConcat + fK + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }

    public ArrayRow(Cache cache) {
        this.d = new ArrayLinkedVariables(this, cache);
    }

    public final void b(LinearSystem linearSystem, int i) {
        SolverVariable solverVariableJ = linearSystem.j(i);
        ArrayRowVariables arrayRowVariables = this.d;
        arrayRowVariables.c(solverVariableJ, 1.0f);
        arrayRowVariables.c(linearSystem.j(i), -1.0f);
    }
}
