package androidx.media3.exoplayer.offline;

import androidx.media3.common.StreamKey;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public interface FilterableManifest<T> {
    T copy(List<StreamKey> list);
}
