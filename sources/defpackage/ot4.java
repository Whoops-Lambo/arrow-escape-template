package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class ot4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, st4 st4Var, long j, rt4 rt4Var, rt4 rt4Var2) {
        while (!unsafe.compareAndSwapObject(st4Var, j, rt4Var, rt4Var2)) {
            if (unsafe.getObject(st4Var, j) != rt4Var) {
                return false;
            }
        }
        return true;
    }
}
