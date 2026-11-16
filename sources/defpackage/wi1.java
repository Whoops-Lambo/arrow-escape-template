package defpackage;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wi1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaxFullscreenAdImpl b;

    public /* synthetic */ wi1(MaxFullscreenAdImpl maxFullscreenAdImpl, int i) {
        this.a = i;
        this.b = maxFullscreenAdImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.b;
        switch (i) {
            case 0:
                maxFullscreenAdImpl.c();
                break;
            default:
                maxFullscreenAdImpl.d();
                break;
        }
    }
}
