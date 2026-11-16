package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class pt4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, st4 st4Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(st4Var, j, obj, obj2)) {
            if (unsafe.getObject(st4Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
