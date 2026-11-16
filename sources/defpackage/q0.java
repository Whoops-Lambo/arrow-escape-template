package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 {
    public static final q0 d = new q0();
    public final Runnable a;
    public final Executor b;
    public q0 c;

    public q0() {
        this.a = null;
        this.b = null;
    }

    public q0(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
