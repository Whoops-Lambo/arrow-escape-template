package defpackage;

import com.inmobi.media.C4398t2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class gh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4398t2 b;

    public /* synthetic */ gh3(C4398t2 c4398t2, int i) {
        this.a = i;
        this.b = c4398t2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4398t2 c4398t2 = this.b;
        switch (i) {
            case 0:
                C4398t2.c(c4398t2);
                break;
            case 1:
                C4398t2.d(c4398t2);
                break;
            case 2:
                C4398t2.f(c4398t2);
                break;
            case 3:
                C4398t2.b(c4398t2);
                break;
            default:
                C4398t2.a(c4398t2);
                break;
        }
    }
}
