package androidx.media3.exoplayer.scheduler;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RequirementsWatcher.NetworkCallback b;

    public /* synthetic */ a(RequirementsWatcher.NetworkCallback networkCallback, int i) {
        this.a = i;
        this.b = networkCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RequirementsWatcher.NetworkCallback networkCallback = this.b;
        switch (i) {
            case 0:
                networkCallback.lambda$postCheckRequirements$0();
                break;
            default:
                networkCallback.lambda$postRecheckNotMetNetworkRequirements$1();
                break;
        }
    }
}
