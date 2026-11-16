package defpackage;

import com.ironsource.Ma;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class qg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ma b;

    public /* synthetic */ qg1(Ma ma, int i) {
        this.a = i;
        this.b = ma;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Ma ma = this.b;
        switch (i) {
            case 0:
                Ma.a(ma);
                break;
            default:
                Ma.b(ma);
                break;
        }
    }
}
