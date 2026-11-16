package defpackage;

import com.google.android.gms.internal.ads.zzgwq;
import com.google.android.gms.internal.ads.zzhdo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ut4 extends wt4 {
    @Override // defpackage.wt4
    public final /* synthetic */ void u(Object obj) {
        n((ListenableFuture) obj);
    }

    @Override // defpackage.wt4
    public final Object v(Object obj, Object obj2) {
        zzhdo zzhdoVar = (zzhdo) obj;
        ListenableFuture listenableFutureZza = zzhdoVar.zza(obj2);
        if (listenableFutureZza != null) {
            return listenableFutureZza;
        }
        d.w(zzgwq.a("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhdoVar));
        return null;
    }
}
