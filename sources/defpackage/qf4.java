package defpackage;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class qf4 {
    public final ListenableFuture a;
    public final long b;
    public final Clock c;

    public qf4(ListenableFuture listenableFuture, long j, Clock clock) {
        this.a = listenableFuture;
        this.c = clock;
        this.b = clock.elapsedRealtime() + j;
    }
}
