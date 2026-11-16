package defpackage;

import com.ironsource.D9;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ D9 b;

    public /* synthetic */ d40(D9 d9, int i) {
        this.a = i;
        this.b = d9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        D9 d9 = this.b;
        switch (i) {
            case 0:
                D9.d(d9);
                break;
            case 1:
                D9.a(d9);
                break;
            case 2:
                D9.c(d9);
                break;
            default:
                D9.b(d9);
                break;
        }
    }
}
