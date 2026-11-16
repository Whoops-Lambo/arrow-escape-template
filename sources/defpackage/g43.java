package defpackage;

import com.google.android.exoplayer2.util.Util;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g43 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListenableFuture b;
    public final /* synthetic */ lc2 c;
    public final /* synthetic */ w8 d;

    public /* synthetic */ g43(ListenableFuture listenableFuture, lc2 lc2Var, w8 w8Var, int i) {
        this.a = i;
        this.b = listenableFuture;
        this.c = lc2Var;
        this.d = w8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        w8 w8Var = this.d;
        lc2 lc2Var = this.c;
        ListenableFuture listenableFuture = this.b;
        switch (i) {
            case 0:
                Util.lambda$transformFutureAsync$2(listenableFuture, lc2Var, w8Var);
                break;
            default:
                androidx.media3.common.util.Util.lambda$transformFutureAsync$2(listenableFuture, lc2Var, w8Var);
                break;
        }
    }
}
