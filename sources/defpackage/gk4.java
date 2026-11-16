package defpackage;

import com.google.android.gms.internal.games_v2.zzgz;
import com.google.android.gms.internal.games_v2.zzhd;
import com.google.android.gms.internal.games_v2.zzhh;
import com.google.android.gms.internal.games_v2.zzhi;
import com.google.android.gms.internal.games_v2.zzhj;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class gk4 implements Supplier {
    public static final /* synthetic */ gk4 b = new gk4(0);
    public static final /* synthetic */ gk4 c = new gk4(1);
    public static final /* synthetic */ gk4 d = new gk4(2);
    public final /* synthetic */ int a;

    public /* synthetic */ gk4(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                ur4 ur4Var = zzhd.b;
                return new zzgz(4);
            case 1:
                zzhi zzhiVar = zzhi.b;
                return new zzhh();
            default:
                return new zzhj();
        }
    }
}
