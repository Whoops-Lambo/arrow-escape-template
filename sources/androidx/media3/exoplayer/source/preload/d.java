package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Consumer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreCacheHelper.DownloadCallback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(PreCacheHelper.DownloadCallback downloadCallback, Object obj, int i) {
        this.a = i;
        this.b = downloadCallback;
        this.c = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        PreCacheHelper.DownloadCallback downloadCallback = this.b;
        switch (i) {
            case 0:
                downloadCallback.lambda$onPrepared$0((MediaItem) obj2, (PreCacheHelper.Listener) obj);
                break;
            default:
                downloadCallback.lambda$onDownloadProgress$4((PreCacheHelper.Task) obj2, (PreCacheHelper.Listener) obj);
                break;
        }
    }
}
