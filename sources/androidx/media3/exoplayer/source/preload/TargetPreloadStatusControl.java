package androidx.media3.exoplayer.source.preload;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface TargetPreloadStatusControl<T, PreloadStatusT> {
    @Nullable
    PreloadStatusT getTargetPreloadStatus(T t);
}
