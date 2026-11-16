package androidx.media3.exoplayer.source.preload;

import defpackage.ly1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements ly1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // defpackage.ly1
    public final boolean apply(Object obj) {
        DefaultPreloadManager.PreloadStatus preloadStatus = (DefaultPreloadManager.PreloadStatus) obj;
        switch (this.a) {
            case 0:
                return DefaultPreloadManager.SourcePreloadControl.lambda$onTracksSelected$1(preloadStatus);
            default:
                return DefaultPreloadManager.SourcePreloadControl.lambda$onSourcePrepared$0(preloadStatus);
        }
    }
}
