package androidx.constraintlayout.core;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    public int a;
    public int[] b;
    public int[] c;
    public float[] d;
    public int[] e;
    public int[] f;
    public int g;
    public int h;

    public final String toString() {
        throw null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final SolverVariable b(int i) {
        int i2 = this.g;
        if (i2 != 0) {
            int i3 = this.h;
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 == i && i3 != -1) {
                    throw null;
                }
                i3 = this.f[i3];
                if (i3 == -1) {
                    break;
                }
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            b(i2);
        }
        for (int i3 = 0; i3 < this.a; i3++) {
            this.c[i3] = -1;
            this.b[i3] = -1;
        }
        this.g = 0;
        this.h = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void e(float f) {
        int i = this.g;
        int i2 = this.h;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.d;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void g() {
        int i = this.g;
        int i2 = this.h;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.d;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final int i() {
        return this.g;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float j(ArrayRow arrayRow, boolean z) {
        d(arrayRow.a);
        h(arrayRow.a, z);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.d;
        int i = solverVariableValues.g;
        int i2 = 0;
        while (i > 0) {
            if (solverVariableValues.c[i2] != -1) {
                float f = solverVariableValues.d[i2];
                throw null;
            }
            i2++;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float k(int i) {
        int i2 = this.g;
        int i3 = this.h;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.d[i3];
            }
            i3 = this.f[i3];
            if (i3 == -1) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void l(int i, SolverVariable solverVariable, float f) {
        this.c[i] = solverVariable.b;
        this.d[i] = f;
        this.e[i] = -1;
        this.f[i] = -1;
        throw null;
    }

    public final int m(SolverVariable solverVariable) {
        if (this.g == 0 || solverVariable == null) {
            return -1;
        }
        throw null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final boolean a(SolverVariable solverVariable) {
        m(solverVariable);
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void c(SolverVariable solverVariable, float f) {
        if (f > -0.001f && f < 0.001f) {
            h(solverVariable, true);
            return;
        }
        if (this.g != 0) {
            m(solverVariable);
            int i = this.g + 1;
            int i2 = this.a;
            int i3 = -1;
            if (i >= i2) {
                int i4 = i2 * 2;
                this.c = Arrays.copyOf(this.c, i4);
                this.d = Arrays.copyOf(this.d, i4);
                this.e = Arrays.copyOf(this.e, i4);
                this.f = Arrays.copyOf(this.f, i4);
                this.b = Arrays.copyOf(this.b, i4);
                for (int i5 = this.a; i5 < i4; i5++) {
                    this.c[i5] = -1;
                    this.b[i5] = -1;
                }
                this.a = i4;
            }
            int i6 = this.g;
            int i7 = this.h;
            for (int i8 = 0; i8 < i6; i8++) {
                if (this.c[i7] == solverVariable.b) {
                    this.d[i7] = f;
                    return;
                }
                i7 = this.f[i7];
                if (i7 == -1) {
                    break;
                }
            }
            for (int i9 = 0; i9 < this.a; i9++) {
                if (this.c[i9] == -1) {
                    i3 = i9;
                    break;
                }
            }
            l(i3, solverVariable, f);
            throw null;
        }
        l(0, solverVariable, f);
        throw null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float d(SolverVariable solverVariable) {
        m(solverVariable);
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void f(SolverVariable solverVariable, float f, boolean z) {
        if (f > -0.001f && f < 0.001f) {
            return;
        }
        m(solverVariable);
        c(solverVariable, f);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float h(SolverVariable solverVariable, boolean z) {
        m(solverVariable);
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
