package com.google.android.gms.games;

import androidx.annotation.NonNull;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class PlayerBuffer extends AbstractDataBuffer<Player> {
    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @NonNull
    public Player get(int i) {
        return new PlayerRef(this.mDataHolder, i, null);
    }

    public PlayerBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
    }
}
