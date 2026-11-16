package defpackage;

import com.applovin.impl.g3;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class xi1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaxFullscreenAdImpl b;
    public final /* synthetic */ g3 c;

    public /* synthetic */ xi1(MaxFullscreenAdImpl maxFullscreenAdImpl, g3 g3Var, int i) {
        this.a = i;
        this.b = maxFullscreenAdImpl;
        this.c = g3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        g3 g3Var = this.c;
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.b;
        switch (i) {
            case 0:
                maxFullscreenAdImpl.b(g3Var);
                break;
            default:
                maxFullscreenAdImpl.a(g3Var);
                break;
        }
    }
}
