package defpackage;

import com.ironsource.C4863m6;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class cf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4863m6 b;

    public /* synthetic */ cf3(C4863m6 c4863m6, int i) {
        this.a = i;
        this.b = c4863m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4863m6 c4863m6 = this.b;
        switch (i) {
            case 0:
                C4863m6.d(c4863m6);
                break;
            case 1:
                C4863m6.g(c4863m6);
                break;
            case 2:
                C4863m6.f(c4863m6);
                break;
            case 3:
                C4863m6.c(c4863m6);
                break;
            case 4:
                C4863m6.b(c4863m6);
                break;
            default:
                C4863m6.e(c4863m6);
                break;
        }
    }
}
