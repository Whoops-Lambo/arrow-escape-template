package defpackage;

import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzqm;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d25 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ol2 b;

    public /* synthetic */ d25(ol2 ol2Var, int i) {
        this.a = i;
        this.b = ol2Var;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        ol2 ol2Var = this.b;
        switch (i) {
            case 0:
                Object obj = zzlk.j;
                return (zzqm) ((os1) ol2Var.get()).h();
            default:
                lo1 lo1Var = (lo1) ol2Var.get();
                lo1Var.getClass();
                rr2 rr2Var = new rr2(ry3.k);
                return new jo1(rr2Var, lo1Var.b.schedule(rr2Var, 10000L, TimeUnit.MILLISECONDS));
        }
    }
}
