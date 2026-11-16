package defpackage;

import com.applovin.impl.y1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class xi3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ xi3(y1 y1Var, String str, int i) {
        this.a = i;
        this.b = y1Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        y1 y1Var = this.b;
        switch (i) {
            case 0:
                y1Var.b(str);
                break;
            default:
                y1Var.c(str);
                break;
        }
    }
}
