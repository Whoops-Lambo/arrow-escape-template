package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProgressiveMediaPeriod b;

    public /* synthetic */ d(ProgressiveMediaPeriod progressiveMediaPeriod, int i) {
        this.a = i;
        this.b = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ProgressiveMediaPeriod progressiveMediaPeriod = this.b;
        switch (i) {
            case 0:
                progressiveMediaPeriod.lambda$onLengthKnown$2();
                break;
            case 1:
                progressiveMediaPeriod.maybeFinishPrepare();
                break;
            default:
                progressiveMediaPeriod.lambda$new$0();
                break;
        }
    }
}
