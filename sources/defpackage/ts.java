package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ts {
    public final Throwable a;

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable a(wr0 wr0Var) {
        Throwable th = this.a;
        if (th == 0) {
            return null;
        }
        if (th instanceof oy) {
            return ((oy) th).d();
        }
        return th instanceof CancellationException ? j7.I(((CancellationException) th).getMessage(), th) : (Throwable) wr0Var.invoke(th);
    }

    public ts(Throwable th) {
        this.a = th;
    }
}
