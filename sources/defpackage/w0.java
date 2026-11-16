package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class w0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, c1 c1Var, long j, b1 b1Var, b1 b1Var2) {
        while (!unsafe.compareAndSwapObject(c1Var, j, b1Var, b1Var2)) {
            if (unsafe.getObject(c1Var, j) != b1Var) {
                return false;
            }
        }
        return true;
    }
}
