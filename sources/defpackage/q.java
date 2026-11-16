package defpackage;

import com.ironsource.A;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ A b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ q(A a, int i, String str, int i2) {
        this.a = i2;
        this.b = a;
        this.c = i;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        int i2 = this.c;
        A a = this.b;
        switch (i) {
            case 0:
                A.a(a, i2, str);
                break;
            default:
                A.b(a, i2, str);
                break;
        }
    }
}
