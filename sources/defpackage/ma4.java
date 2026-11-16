package defpackage;

import com.google.android.gms.internal.ads.zzeqs;
import com.google.android.gms.internal.ads.zzhdo;
import com.google.android.gms.internal.ads.zzheh;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ma4 implements zzhdo {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListenableFuture b;

    public /* synthetic */ ma4(int i, ListenableFuture listenableFuture) {
        this.a = i;
        this.b = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhdo
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        int i = this.a;
        ListenableFuture listenableFuture = this.b;
        switch (i) {
            case 0:
                return obj != null ? listenableFuture : zzheh.b(new zzeqs(1, "Retrieve required value in native ad response failed."));
            default:
                return listenableFuture;
        }
    }
}
