package defpackage;

import com.applovin.impl.f3;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ti1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaxAdViewImpl b;
    public final /* synthetic */ f3 c;

    public /* synthetic */ ti1(MaxAdViewImpl maxAdViewImpl, f3 f3Var, int i) {
        this.a = i;
        this.b = maxAdViewImpl;
        this.c = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        f3 f3Var = this.c;
        MaxAdViewImpl maxAdViewImpl = this.b;
        switch (i) {
            case 0:
                maxAdViewImpl.b(f3Var);
                break;
            default:
                maxAdViewImpl.a(f3Var);
                break;
        }
    }
}
