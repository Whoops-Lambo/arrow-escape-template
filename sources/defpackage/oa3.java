package defpackage;

import com.ironsource.C4656ae;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oa3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4656ae b;

    public /* synthetic */ oa3(C4656ae c4656ae, int i) {
        this.a = i;
        this.b = c4656ae;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4656ae c4656ae = this.b;
        switch (i) {
            case 0:
                C4656ae.a(c4656ae);
                break;
            case 1:
                C4656ae.c(c4656ae);
                break;
            case 2:
                C4656ae.e(c4656ae);
                break;
            case 3:
                C4656ae.b(c4656ae);
                break;
            default:
                C4656ae.d(c4656ae);
                break;
        }
    }
}
