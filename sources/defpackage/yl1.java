package defpackage;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.MetadataRetriever;
import androidx.media3.exoplayer.source.TrackGroupArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class yl1 implements MetadataRetriever.MetadataRetrieverInternal.OnPreparedListener, MetadataRetriever.MetadataRetrieverInternal.OnFailureListener {
    public final /* synthetic */ MetadataRetriever a;

    public /* synthetic */ yl1(MetadataRetriever metadataRetriever) {
        this.a = metadataRetriever;
    }

    @Override // androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.OnFailureListener
    public void onFailure(Exception exc) {
        this.a.lambda$startPreparation$1(exc);
    }

    @Override // androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.OnPreparedListener
    public void onPrepared(TrackGroupArray trackGroupArray, Timeline timeline) {
        this.a.lambda$startPreparation$0(trackGroupArray, timeline);
    }
}
