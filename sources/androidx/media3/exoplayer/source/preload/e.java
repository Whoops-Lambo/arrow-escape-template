package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.util.Consumer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreCacheHelper.DownloadCallback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(PreCacheHelper.DownloadCallback downloadCallback, Object obj, int i) {
        this.a = i;
        this.b = downloadCallback;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        PreCacheHelper.DownloadCallback downloadCallback = this.b;
        switch (i) {
            case 0:
                downloadCallback.lambda$onDownloadProgress$5((PreCacheHelper.Task) obj);
                break;
            case 1:
                downloadCallback.lambda$onDownloadStopped$3((PreCacheHelper.Task) obj);
                break;
            default:
                downloadCallback.lambda$notifyListeners$6((Consumer) obj);
                break;
        }
    }
}
