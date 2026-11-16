package defpackage;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ui1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaxFullscreenAdImpl b;
    public final /* synthetic */ String c;

    public /* synthetic */ ui1(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, int i) {
        this.a = i;
        this.b = maxFullscreenAdImpl;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.b;
        switch (i) {
            case 0:
                maxFullscreenAdImpl.c(str);
                break;
            case 1:
                maxFullscreenAdImpl.a(str);
                break;
            default:
                maxFullscreenAdImpl.b(str);
                break;
        }
    }
}
