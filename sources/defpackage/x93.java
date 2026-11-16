package defpackage;

import com.applovin.impl.adview.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x93 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ x93(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.p();
                break;
            case 1:
                aVar.q();
                break;
            case 2:
                aVar.s();
                break;
            case 3:
                aVar.o();
                break;
            default:
                aVar.r();
                break;
        }
    }
}
