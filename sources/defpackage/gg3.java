package defpackage;

import com.vungle.ads.internal.presenter.r;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class gg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ gg3(r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        r rVar = this.b;
        switch (i) {
            case 0:
                r.c(rVar);
                break;
            case 1:
                r.e(rVar);
                break;
            default:
                r.d(rVar);
                break;
        }
    }
}
