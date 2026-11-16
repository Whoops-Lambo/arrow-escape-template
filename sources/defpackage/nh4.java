package defpackage;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfov;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class nh4 {
    public final int b;
    public final int c;
    public final LinkedList a = new LinkedList();
    public final dp1 d = new dp1(2);

    public final void a() {
        while (true) {
            LinkedList linkedList = this.a;
            if (linkedList.isEmpty()) {
                return;
            }
            if (zzt.zzk().currentTimeMillis() - ((zzfoh) linkedList.getFirst()).d < this.c) {
                return;
            }
            dp1 dp1Var = this.d;
            dp1Var.f++;
            ((zzfov) dp1Var.a).b++;
            linkedList.remove();
        }
    }

    public nh4(int i, int i2) {
        this.b = i;
        this.c = i2;
    }
}
