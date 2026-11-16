package defpackage;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bt implements CmcdConfiguration.Factory {
    @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory
    public final CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem) {
        return CmcdConfiguration.Factory.lambda$static$0(mediaItem);
    }
}
