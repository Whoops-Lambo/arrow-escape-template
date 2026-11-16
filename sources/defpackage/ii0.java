package defpackage;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ii0 implements Runnable, Comparable, ad0 {

    @Nullable
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public final int c(long j, ji0 ji0Var, ki0 ki0Var) {
        synchronized (this) {
            if (this._heap == s71.a) {
                return 2;
            }
            synchronized (ji0Var) {
                try {
                    ii0[] ii0VarArr = ji0Var.a;
                    ii0 ii0Var = ii0VarArr != null ? ii0VarArr[0] : null;
                    if (ki0.i.get(ki0Var) == 1) {
                        return 1;
                    }
                    if (ii0Var == null) {
                        ji0Var.c = j;
                    } else {
                        long j2 = ii0Var.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - ji0Var.c > 0) {
                            ji0Var.c = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = ji0Var.c;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    ji0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.ad0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                tx txVar = s71.a;
                if (obj == txVar) {
                    return;
                }
                ji0 ji0Var = obj instanceof ji0 ? (ji0) obj : null;
                if (ji0Var != null) {
                    synchronized (ji0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof np2 ? (np2) obj2 : null) != null) {
                            ji0Var.b(this.b);
                        }
                    }
                }
                this._heap = txVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((ii0) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(ji0 ji0Var) {
        if (this._heap != s71.a) {
            this._heap = ji0Var;
        } else {
            d.r("Failed requirement.");
        }
    }

    public String toString() {
        return n30.o(new StringBuilder("Delayed[nanos="), this.a, ']');
    }

    public ii0(long j) {
        this.a = j;
    }
}
