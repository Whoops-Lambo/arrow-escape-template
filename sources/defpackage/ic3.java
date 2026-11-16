package defpackage;

import com.ironsource.C4689cb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ic3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4689cb b;

    public /* synthetic */ ic3(C4689cb c4689cb, int i) {
        this.a = i;
        this.b = c4689cb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4689cb c4689cb = this.b;
        switch (i) {
            case 0:
                C4689cb.a(c4689cb);
                break;
            default:
                C4689cb.c(c4689cb);
                break;
        }
    }
}
