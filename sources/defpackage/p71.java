package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class p71 extends AbstractOwnableSynchronizer implements Runnable {
    public final q71 a;

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.a.toString();
    }

    public p71(q71 q71Var) {
        this.a = q71Var;
    }

    public static void a(p71 p71Var, Thread thread) {
        p71Var.setExclusiveOwnerThread(thread);
    }
}
