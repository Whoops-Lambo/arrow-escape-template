package defpackage;

import com.adsurge.adn.managers.localt.MMPProvider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class og1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MMPProvider b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MMPProvider.Callback d;

    public /* synthetic */ og1(MMPProvider mMPProvider, int i, MMPProvider.Callback callback, int i2) {
        this.a = i2;
        this.b = mMPProvider;
        this.c = i;
        this.d = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MMPProvider.Callback callback = this.d;
        int i2 = this.c;
        MMPProvider mMPProvider = this.b;
        switch (i) {
            case 0:
                mMPProvider.b(i2, callback);
                break;
            default:
                mMPProvider.c(i2, callback);
                break;
        }
    }
}
