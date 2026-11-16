package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lu4 extends kt4 implements Runnable {
    public ListenableFuture h;

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final void g() {
        this.h = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final String h() {
        ListenableFuture listenableFuture = this.h;
        if (listenableFuture == null) {
            return null;
        }
        String string = listenableFuture.toString();
        return jc1.o("delegate=[", string, new StringBuilder(string.length() + 11), C4664b4.j.e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.h;
        if (listenableFuture != null) {
            n(listenableFuture);
        }
    }
}
