package defpackage;

import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ui3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MaxAdViewAdListener c;
    public final /* synthetic */ MaxAd d;

    public /* synthetic */ ui3(boolean z, MaxAdViewAdListener maxAdViewAdListener, MaxAd maxAd, int i) {
        this.a = i;
        this.b = z;
        this.c = maxAdViewAdListener;
        this.d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MaxAd maxAd = this.d;
        MaxAdViewAdListener maxAdViewAdListener = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                x2.b(z, maxAdViewAdListener, maxAd);
                break;
            default:
                x2.d(z, maxAdViewAdListener, maxAd);
                break;
        }
    }
}
