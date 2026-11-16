package defpackage;

import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oi3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MaxAdListener c;
    public final /* synthetic */ MaxAd d;

    public /* synthetic */ oi3(boolean z, MaxAdListener maxAdListener, MaxAd maxAd, int i) {
        this.a = i;
        this.b = z;
        this.c = maxAdListener;
        this.d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MaxAd maxAd = this.d;
        MaxAdListener maxAdListener = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                x2.e(z, maxAdListener, maxAd);
                break;
            case 1:
                x2.f(z, maxAdListener, maxAd);
                break;
            case 2:
                x2.a(z, maxAdListener, maxAd);
                break;
            default:
                x2.c(z, maxAdListener, maxAd);
                break;
        }
    }
}
