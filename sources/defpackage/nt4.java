package defpackage;

import com.google.android.gms.internal.ads.zzhcz;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class nt4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, zzhcz zzhczVar, long j, it4 it4Var, it4 it4Var2) {
        while (!unsafe.compareAndSwapObject(zzhczVar, j, it4Var, it4Var2)) {
            if (unsafe.getObject(zzhczVar, j) != it4Var) {
                return false;
            }
        }
        return true;
    }
}
