package defpackage;

import com.ironsource.A;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ A c;

    public /* synthetic */ k(Throwable th, A a, int i) {
        this.a = i;
        this.b = th;
        this.c = a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        A a = this.c;
        Throwable th = this.b;
        switch (i) {
            case 0:
                A.a(th, a);
                break;
            default:
                A.b(th, a);
                break;
        }
    }
}
