package androidx.constraintlayout.core;

import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {
    public final ArrayRow b;
    public final Cache c;
    public int a = 0;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void c(SolverVariable solverVariable, float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            h(solverVariable, true);
            return;
        }
        int i = this.h;
        ArrayRow arrayRow = this.b;
        if (i == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = solverVariable.b;
            this.f[0] = -1;
            solverVariable.l++;
            solverVariable.a(arrayRow);
            this.a++;
            if (this.j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.e;
            if (i2 >= iArr.length) {
                this.j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.e[i];
            int i6 = solverVariable.b;
            if (i5 == i6) {
                this.g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f[i];
        }
        int length = this.i;
        int i7 = length + 1;
        if (this.j) {
            int[] iArr2 = this.e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.e;
        if (length >= iArr3.length && this.a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.d * 2;
            this.d = i9;
            this.j = false;
            this.i = length - 1;
            this.g = Arrays.copyOf(this.g, i9);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[length] = solverVariable.b;
        this.g[length] = f;
        int[] iArr6 = this.f;
        if (i3 != -1) {
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            iArr6[length] = this.h;
            this.h = length;
        }
        solverVariable.l++;
        solverVariable.a(arrayRow);
        int i10 = this.a + 1;
        this.a = i10;
        if (!this.j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i10 >= iArr7.length) {
            this.j = true;
        }
        if (this.i >= iArr7.length) {
            this.j = true;
            this.i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final boolean a(SolverVariable solverVariable) {
        int i = this.h;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                if (this.e[i] == solverVariable.b) {
                    return true;
                }
                i = this.f[i];
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final SolverVariable b(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.c.c[this.e[i2]];
            }
            i2 = this.f[i2];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            SolverVariable solverVariable = this.c.c[this.e[i]];
            if (solverVariable != null) {
                solverVariable.b(this.b);
            }
            i = this.f[i];
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float d(SolverVariable solverVariable) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.e[i] == solverVariable.b) {
                return this.g[i];
            }
            i = this.f[i];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void e(float f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] / f;
            i = this.f[i];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void g() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f[i];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float h(SolverVariable solverVariable, boolean z) {
        int i = this.h;
        if (i == -1) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.e[i] == solverVariable.b) {
                int i4 = this.h;
                int[] iArr = this.f;
                if (i == i4) {
                    this.h = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.b(this.b);
                }
                solverVariable.l--;
                this.a--;
                this.e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.g[i];
            }
            i2++;
            i3 = i;
            i = this.f[i];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final int i() {
        return this.a;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float j(ArrayRow arrayRow, boolean z) {
        float fD = d(arrayRow.a);
        h(arrayRow.a, z);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.d;
        int i = arrayRowVariables.i();
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableB = arrayRowVariables.b(i2);
            f(solverVariableB, arrayRowVariables.d(solverVariableB) * fD, z);
        }
        return fD;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float k(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.g[i2];
            }
            i2 = this.f[i2];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final String toString() {
        int i = this.h;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            StringBuilder sbP = h50.p(string.concat(" -> "));
            sbP.append(this.g[i]);
            sbP.append(" : ");
            StringBuilder sbP2 = h50.p(sbP.toString());
            sbP2.append(this.c.c[this.e[i]]);
            string = sbP2.toString();
            i = this.f[i];
        }
        return string;
    }

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.b = arrayRow;
        this.c = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void f(SolverVariable solverVariable, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.h;
            ArrayRow arrayRow = this.b;
            if (i == -1) {
                this.h = 0;
                this.g[0] = f;
                this.e[0] = solverVariable.b;
                this.f[0] = -1;
                solverVariable.l++;
                solverVariable.a(arrayRow);
                this.a++;
                if (!this.j) {
                    int i2 = this.i + 1;
                    this.i = i2;
                    int[] iArr = this.e;
                    if (i2 >= iArr.length) {
                        this.j = true;
                        this.i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int i5 = this.e[i];
                int i6 = solverVariable.b;
                if (i5 == i6) {
                    float[] fArr = this.g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        int i7 = this.h;
                        int[] iArr2 = this.f;
                        if (i == i7) {
                            this.h = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.b(arrayRow);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        solverVariable.l--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f[i];
            }
            int length = this.i;
            int i8 = length + 1;
            if (this.j) {
                int[] iArr3 = this.e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.e;
            if (length >= iArr4.length && this.a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.j = false;
                this.i = length - 1;
                this.g = Arrays.copyOf(this.g, i10);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.e[length] = solverVariable.b;
            this.g[length] = f;
            int[] iArr7 = this.f;
            if (i3 != -1) {
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                iArr7[length] = this.h;
                this.h = length;
            }
            solverVariable.l++;
            solverVariable.a(arrayRow);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.e;
            if (i11 >= iArr8.length) {
                this.j = true;
                this.i = iArr8.length - 1;
            }
        }
    }
}
