package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vu4 extends gu4 {
    public ListenableFuture h;
    public ScheduledFuture i;

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final void g() {
        o(this.h);
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.h = null;
        this.i = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final String h() {
        ListenableFuture listenableFuture = this.h;
        ScheduledFuture scheduledFuture = this.i;
        if (listenableFuture == null) {
            return null;
        }
        String string = listenableFuture.toString();
        String strO = jc1.o("inputFuture=[", string, new StringBuilder(string.length() + 14), C4664b4.j.e);
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                int length = strO.length();
                StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
                sb.append(strO);
                sb.append(", remaining delay=[");
                sb.append(delay);
                sb.append(" ms]");
                return sb.toString();
            }
        }
        return strO;
    }
}
