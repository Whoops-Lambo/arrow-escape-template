package defpackage;

import com.google.android.exoplayer2.util.Util;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f43 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc2 b;
    public final /* synthetic */ ListenableFuture c;

    public /* synthetic */ f43(lc2 lc2Var, ListenableFuture listenableFuture, int i) {
        this.a = i;
        this.b = lc2Var;
        this.c = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ListenableFuture listenableFuture = this.c;
        lc2 lc2Var = this.b;
        switch (i) {
            case 0:
                Util.lambda$transformFutureAsync$1(lc2Var, listenableFuture);
                break;
            default:
                androidx.media3.common.util.Util.lambda$transformFutureAsync$1(lc2Var, listenableFuture);
                break;
        }
    }
}
