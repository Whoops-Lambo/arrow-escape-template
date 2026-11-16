package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.Freezable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface PlayerStats extends Freezable<PlayerStats>, Parcelable {
    public static final float UNSET_VALUE = -1.0f;

    float getAverageSessionLength();

    @Deprecated
    float getChurnProbability();

    int getDaysSinceLastPlayed();

    @Deprecated
    float getHighSpenderProbability();

    int getNumberOfPurchases();

    int getNumberOfSessions();

    float getSessionPercentile();

    float getSpendPercentile();

    @Deprecated
    float getSpendProbability();

    @Deprecated
    float getTotalSpendNext28Days();

    @NonNull
    Bundle zza();
}
