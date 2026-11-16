package androidx.media3.exoplayer.video;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((DefaultVideoSink.FrameRendererImpl) obj).lambda$renderFrame$1();
                break;
            case 1:
                ((DefaultVideoSink.FrameRendererImpl) obj).lambda$dropFrame$2();
                break;
            default:
                ((DefaultVideoSink) obj).lambda$handleInputFrame$2();
                break;
        }
    }
}
