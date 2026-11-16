package com.google.android.gms.games.stats;

import androidx.annotation.NonNull;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class PlayerStatsBuffer extends AbstractDataBuffer<PlayerStats> {
    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @NonNull
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final PlayerStats get(int i) {
        return new zzb(this.mDataHolder, i);
    }

    public PlayerStatsBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
    }
}
