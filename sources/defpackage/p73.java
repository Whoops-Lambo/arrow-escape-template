package defpackage;

import com.ironsource.W2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p73 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ W2 b;

    public /* synthetic */ p73(W2 w2, int i) {
        this.a = i;
        this.b = w2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        W2 w2 = this.b;
        switch (i) {
            case 0:
                W2.b(w2);
                break;
            case 1:
                W2.d(w2);
                break;
            default:
                W2.c(w2);
                break;
        }
    }
}
