package defpackage;

import com.google.android.gms.internal.play_billing.zzo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m15 extends wz2 {
    @Override // defpackage.wz2
    public final boolean g0(zzo zzoVar, qr4 qr4Var, qr4 qr4Var2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.b != qr4Var) {
                    return false;
                }
                zzoVar.b = qr4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wz2
    public final boolean h0(zzo zzoVar, Object obj, Object obj2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.a != obj) {
                    return false;
                }
                zzoVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wz2
    public final boolean i0(zzo zzoVar, n25 n25Var, n25 n25Var2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.c != n25Var) {
                    return false;
                }
                zzoVar.c = n25Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wz2
    public final void c0(n25 n25Var, n25 n25Var2) {
        n25Var.b = n25Var2;
    }

    @Override // defpackage.wz2
    public final void f0(n25 n25Var, Thread thread) {
        n25Var.a = thread;
    }
}
