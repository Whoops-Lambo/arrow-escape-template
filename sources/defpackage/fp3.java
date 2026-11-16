package defpackage;

import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fp3 implements Runnable {
    public final /* synthetic */ hp3 a;
    public final /* synthetic */ yo3 b;

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a.h) {
            try {
                if (!this.b.a.h.isEmpty()) {
                    this.a.a((PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.b.a.h.get(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public fp3(yo3 yo3Var, hp3 hp3Var) {
        this.a = hp3Var;
        this.b = yo3Var;
    }
}
