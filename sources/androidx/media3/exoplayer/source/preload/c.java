package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.util.Consumer;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreCacheHelper.DownloadCallback b;
    public final /* synthetic */ IOException c;

    public /* synthetic */ c(PreCacheHelper.DownloadCallback downloadCallback, IOException iOException, int i) {
        this.a = i;
        this.b = downloadCallback;
        this.c = iOException;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        IOException iOException = this.c;
        PreCacheHelper.DownloadCallback downloadCallback = this.b;
        PreCacheHelper.Listener listener = (PreCacheHelper.Listener) obj;
        switch (i) {
            case 0:
                downloadCallback.lambda$onDownloadStopped$2(iOException, listener);
                break;
            default:
                downloadCallback.lambda$onPrepareError$1(iOException, listener);
                break;
        }
    }
}
