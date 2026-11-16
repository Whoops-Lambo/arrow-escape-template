package androidx.media3.exoplayer.source.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdsMediaSource b;
    public final /* synthetic */ AdsMediaSource.ComponentListener c;

    public /* synthetic */ a(AdsMediaSource adsMediaSource, AdsMediaSource.ComponentListener componentListener, int i) {
        this.a = i;
        this.b = adsMediaSource;
        this.c = componentListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdsMediaSource.ComponentListener componentListener = this.c;
        AdsMediaSource adsMediaSource = this.b;
        switch (i) {
            case 0:
                adsMediaSource.lambda$prepareSourceInternal$0(componentListener);
                break;
            default:
                adsMediaSource.lambda$releaseSourceInternal$1(componentListener);
                break;
        }
    }
}
