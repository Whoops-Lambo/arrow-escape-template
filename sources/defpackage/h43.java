package defpackage;

import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h43 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc2 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h43(lc2 lc2Var, Runnable runnable, Object obj, int i) {
        this.a = i;
        this.b = lc2Var;
        this.c = runnable;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Runnable runnable = this.c;
        lc2 lc2Var = this.b;
        switch (i) {
            case 0:
                Util.lambda$postOrRunWithCompletion$0(lc2Var, runnable, obj);
                break;
            default:
                androidx.media3.common.util.Util.lambda$postOrRunWithCompletion$0(lc2Var, runnable, obj);
                break;
        }
    }
}
