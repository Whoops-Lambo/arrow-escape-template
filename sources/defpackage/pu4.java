package defpackage;

import com.google.android.gms.internal.ads.zzhcz;
import com.google.android.gms.internal.ads.zzheb;
import com.google.android.gms.internal.ads.zzheq;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pu4 extends zzheb implements zzheq {
    public final ScheduledFuture b;

    @Override // com.google.android.gms.internal.ads.zzhea, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.a.cancel(z);
        if (zCancel) {
            this.b.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.b.getDelay(timeUnit);
    }

    public pu4(zzhcz zzhczVar, ScheduledFuture scheduledFuture) {
        super(zzhczVar);
        this.b = scheduledFuture;
    }
}
