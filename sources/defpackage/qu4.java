package defpackage;

import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qu4 extends kt4 implements Runnable {
    public final Runnable h;

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final String h() {
        String string = this.h.toString();
        return jc1.o("task=[", string, new StringBuilder(string.length() + 7), C4664b4.j.e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            f(th);
            throw th;
        }
    }

    public qu4(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }
}
