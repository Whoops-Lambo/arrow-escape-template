package io.p071bidmachine.media3.exoplayer.trackselection;

import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.s0;
import io.p071bidmachine.media3.exoplayer.source.chunk.e;
import io.p071bidmachine.media3.exoplayer.source.chunk.k;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface q {
    int a(n nVar);

    void b(long j, long j2, long j3, List list, k[] kVarArr);

    default boolean c(long j, e eVar, List list) {
        return false;
    }

    void disable();

    void enable();

    int evaluateQueueSize(long j, List list);

    boolean excludeTrack(int i, long j);

    n getFormat(int i);

    int getIndexInTrackGroup(int i);

    n getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    s0 getTrackGroup();

    int indexOf(int i);

    boolean isTrackExcluded(int i, long j);

    int length();

    default void onDiscontinuity() {
    }

    void onPlayWhenReadyChanged(boolean z);

    void onPlaybackSpeed(float f);

    default void onRebuffer() {
    }
}
