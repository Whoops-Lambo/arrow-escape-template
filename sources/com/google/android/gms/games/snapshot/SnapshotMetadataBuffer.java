package com.google.android.gms.games.snapshot;

import androidx.annotation.NonNull;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class SnapshotMetadataBuffer extends AbstractDataBuffer<SnapshotMetadata> {
    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @NonNull
    public SnapshotMetadata get(int i) {
        return new SnapshotMetadataRef(this.mDataHolder, i);
    }

    public SnapshotMetadataBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
    }
}
