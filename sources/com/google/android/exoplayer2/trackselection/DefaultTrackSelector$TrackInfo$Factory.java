package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroup;
import defpackage.pa0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface DefaultTrackSelector$TrackInfo$Factory<T extends pa0> {
    List<T> create(int i, TrackGroup trackGroup, int[] iArr);
}
