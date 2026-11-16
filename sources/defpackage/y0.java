package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class y0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, c1 c1Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(c1Var, j, obj, obj2)) {
            if (unsafe.getObject(c1Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
