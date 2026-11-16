package defpackage;

import com.applovin.impl.adview.g;
import com.applovin.impl.y1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class yi3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ yi3(g gVar, Runnable runnable, int i) {
        this.a = i;
        this.b = gVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y1.b(this.b, this.c);
                break;
            case 1:
                y1.a(this.b, this.c);
                break;
            default:
                y1.c(this.b, this.c);
                break;
        }
    }
}
