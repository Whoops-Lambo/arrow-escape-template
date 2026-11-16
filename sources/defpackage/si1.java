package defpackage;

import com.applovin.impl.mediation.ads.MaxAdViewImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class si1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaxAdViewImpl b;

    public /* synthetic */ si1(MaxAdViewImpl maxAdViewImpl, int i) {
        this.a = i;
        this.b = maxAdViewImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MaxAdViewImpl maxAdViewImpl = this.b;
        switch (i) {
            case 0:
                maxAdViewImpl.g();
                break;
            default:
                maxAdViewImpl.c();
                break;
        }
    }
}
