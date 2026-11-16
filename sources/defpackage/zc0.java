package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zc0 implements ad0 {
    public final ScheduledFuture a;

    @Override // defpackage.ad0
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }

    public zc0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }
}
