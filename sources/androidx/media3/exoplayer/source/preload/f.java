package androidx.media3.exoplayer.source.preload;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreCacheHelper.ReleasableExecutorSupplier b;

    public /* synthetic */ f(PreCacheHelper.ReleasableExecutorSupplier releasableExecutorSupplier, int i) {
        this.a = i;
        this.b = releasableExecutorSupplier;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PreCacheHelper.ReleasableExecutorSupplier releasableExecutorSupplier = this.b;
        switch (i) {
            case 0:
                releasableExecutorSupplier.lambda$onExecutorReleased$0();
                break;
            default:
                releasableExecutorSupplier.onExecutorReleased();
                break;
        }
    }
}
