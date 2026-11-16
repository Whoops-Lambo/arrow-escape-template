package com.google.android.gms.games.achievement;

import androidx.annotation.NonNull;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class AchievementBuffer extends AbstractDataBuffer<Achievement> {
    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @NonNull
    public Achievement get(int i) {
        return new AchievementRef(this.mDataHolder, i);
    }

    public AchievementBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
    }
}
