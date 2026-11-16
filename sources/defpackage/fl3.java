package defpackage;

import com.google.android.gms.internal.ads.zzgyo;
import com.google.android.gms.internal.ads.zznk;
import com.google.android.gms.internal.ads.zzv;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fl3 implements Comparable {
    public final boolean a;
    public final boolean b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fl3 fl3Var = (fl3) obj;
        return zzgyo.a.d(this.b, fl3Var.b).d(this.a, fl3Var.a).e();
    }

    public fl3(zzv zzvVar, int i) {
        this.a = 1 == (zzvVar.e & 1);
        this.b = zznk.e(i, false);
    }
}
