package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m2 {
    public n2[] a;
    public int b;
    public int c;
    public cl2 d;

    public final n2 b() {
        n2 n2VarC;
        cl2 cl2Var;
        synchronized (this) {
            try {
                n2[] n2VarArrE = this.a;
                if (n2VarArrE == null) {
                    n2VarArrE = e();
                    this.a = n2VarArrE;
                } else if (this.b >= n2VarArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(n2VarArrE, n2VarArrE.length * 2);
                    this.a = (n2[]) objArrCopyOf;
                    n2VarArrE = (n2[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    n2VarC = n2VarArrE[i];
                    if (n2VarC == null) {
                        n2VarC = c();
                        n2VarArrE[i] = n2VarC;
                    }
                    i++;
                    if (i >= n2VarArrE.length) {
                        i = 0;
                    }
                } while (!n2VarC.a(this));
                this.c = i;
                this.b++;
                cl2Var = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cl2Var != null) {
            cl2Var.v(1);
        }
        return n2VarC;
    }

    public abstract n2 c();

    public abstract n2[] e();

    public final void g(n2 n2Var) {
        cl2 cl2Var;
        int i;
        dy[] dyVarArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                cl2Var = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                n2Var.getClass();
                dyVarArrB = n2Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (dy dyVar : dyVarArrB) {
            if (dyVar != null) {
                dyVar.resumeWith(az2.a);
            }
        }
        if (cl2Var != null) {
            cl2Var.v(-1);
        }
    }

    public final cl2 h() {
        cl2 cl2Var;
        synchronized (this) {
            cl2Var = this.d;
            if (cl2Var == null) {
                int i = this.b;
                cl2Var = new cl2(1, Integer.MAX_VALUE, ck.b);
                cl2Var.f(Integer.valueOf(i));
                this.d = cl2Var;
            }
        }
        return cl2Var;
    }
}
