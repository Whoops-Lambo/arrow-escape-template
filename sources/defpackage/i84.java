package defpackage;

import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzdc;
import com.ironsource.C4664b4;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i84 extends zzcu implements zzdc {
    public zzdc h;
    public ScheduledFuture i;

    @Override // com.google.android.gms.internal.play_billing.zzcm
    public final String e() {
        zzdc zzdcVar = this.h;
        ScheduledFuture scheduledFuture = this.i;
        if (zzdcVar == null) {
            return null;
        }
        String strN = pv1.n("inputFuture=[", zzdcVar.toString(), C4664b4.j.e);
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strN + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strN;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcm
    public final void f() {
        zzdc zzdcVar = this.h;
        if ((this.a instanceof w34) & (zzdcVar != null)) {
            Object obj = this.a;
            zzdcVar.cancel((obj instanceof w34) && ((w34) obj).a);
        }
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.h = null;
        this.i = null;
    }
}
