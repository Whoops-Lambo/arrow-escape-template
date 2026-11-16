package androidx.constraintlayout.core;

import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class PriorityGoalRow extends ArrayRow {
    public SolverVariable[] f;
    public SolverVariable[] g;
    public int h;
    public GoalVariableAccessor i;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.PriorityGoalRow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    class AnonymousClass1 implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.b - solverVariable2.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class GoalVariableAccessor {
        public SolverVariable a;

        public final String toString() {
            String string = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sbP = h50.p(string);
                    sbP.append(this.a.h[i]);
                    sbP.append(" ");
                    string = sbP.toString();
                }
            }
            StringBuilder sbQ = h50.q(string, "] ");
            sbQ.append(this.a);
            return sbQ.toString();
        }

        public GoalVariableAccessor() {
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public final SolverVariable a(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            SolverVariable[] solverVariableArr = this.f;
            SolverVariable solverVariable = solverVariableArr[i2];
            if (!zArr[solverVariable.b]) {
                GoalVariableAccessor goalVariableAccessor = this.i;
                goalVariableAccessor.a = solverVariable;
                int i3 = 8;
                if (i != -1) {
                    SolverVariable solverVariable2 = solverVariableArr[i];
                    while (i3 >= 0) {
                        float f = solverVariable2.h[i3];
                        float f2 = goalVariableAccessor.a.h[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = goalVariableAccessor.a.h[i3];
                        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            break;
                        }
                        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    public final void k(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == solverVariable) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        solverVariable.a = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public final boolean e() {
        return this.h == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public final void i(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        SolverVariable solverVariable = arrayRow.a;
        if (solverVariable == null) {
            return;
        }
        float[] fArr = solverVariable.h;
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.d;
        int i = arrayRowVariables.i();
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableB = arrayRowVariables.b(i2);
            float fK = arrayRowVariables.k(i2);
            GoalVariableAccessor goalVariableAccessor = this.i;
            goalVariableAccessor.a = solverVariableB;
            if (solverVariableB.a) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr2 = goalVariableAccessor.a.h;
                    float f = (fArr[i3] * fK) + fArr2[i3];
                    fArr2[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        goalVariableAccessor.a.h[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    PriorityGoalRow.this.k(goalVariableAccessor.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = fArr[i4];
                    if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f3 = f2 * fK;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        goalVariableAccessor.a.h[i4] = f3;
                    } else {
                        goalVariableAccessor.a.h[i4] = 0.0f;
                    }
                }
                j(solverVariableB);
            }
            this.b = (arrayRow.b * fK) + this.b;
        }
        k(solverVariable);
    }

    public final void j(SolverVariable solverVariable) {
        int i;
        SolverVariable[] solverVariableArr;
        int i2 = this.h + 1;
        SolverVariable[] solverVariableArr2 = this.f;
        if (i2 > solverVariableArr2.length) {
            SolverVariable[] solverVariableArr3 = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
            this.f = solverVariableArr3;
            this.g = (SolverVariable[]) Arrays.copyOf(solverVariableArr3, solverVariableArr3.length * 2);
        }
        SolverVariable[] solverVariableArr4 = this.f;
        int i3 = this.h;
        solverVariableArr4[i3] = solverVariable;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && solverVariableArr4[i3].b > solverVariable.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                solverVariableArr = this.g;
                if (i5 >= i) {
                    break;
                }
                solverVariableArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(solverVariableArr, 0, i, new AnonymousClass1());
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        solverVariable.a = true;
        solverVariable.a(this);
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public final String toString() {
        GoalVariableAccessor goalVariableAccessor = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            goalVariableAccessor.a = this.f[i];
            str = str + goalVariableAccessor + " ";
        }
        return str;
    }
}
