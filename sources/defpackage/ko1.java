package defpackage;

import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ko1 extends v0 implements Runnable {
    public final Runnable h;

    @Override // defpackage.c1
    public final String k() {
        return "task=[" + this.h + C4664b4.j.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            n(th);
            throw th;
        }
    }

    public ko1(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }
}
