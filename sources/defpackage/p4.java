package defpackage;

import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.ads.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdsMediaSource b;
    public final /* synthetic */ b c;

    public /* synthetic */ p4(AdsMediaSource adsMediaSource, b bVar, int i) {
        this.a = i;
        this.b = adsMediaSource;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.c;
        AdsMediaSource adsMediaSource = this.b;
        switch (i) {
            case 0:
                adsMediaSource.lambda$prepareSourceInternal$0(bVar);
                break;
            default:
                adsMediaSource.lambda$releaseSourceInternal$1(bVar);
                break;
        }
    }
}
