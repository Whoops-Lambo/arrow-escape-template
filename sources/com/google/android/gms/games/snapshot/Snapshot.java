package com.google.android.gms.games.snapshot;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.Freezable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface Snapshot extends Freezable<Snapshot>, Parcelable {
    @NonNull
    SnapshotMetadata getMetadata();

    @NonNull
    SnapshotContents getSnapshotContents();
}
