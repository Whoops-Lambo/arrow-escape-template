package defpackage;

import com.ironsource.A;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ A b;

    public /* synthetic */ m(A a, int i) {
        this.a = i;
        this.b = a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        A a = this.b;
        switch (i) {
            case 0:
                A.f(a);
                break;
            case 1:
                A.e(a);
                break;
            default:
                A.c(a);
                break;
        }
    }
}
