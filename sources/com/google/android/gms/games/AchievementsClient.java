package com.google.android.gms.games;

import android.content.Intent;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface AchievementsClient {
    @NonNull
    Task<Intent> getAchievementsIntent();

    void increment(@NonNull String str, @IntRange int i);

    @NonNull
    Task<Boolean> incrementImmediate(@NonNull String str, @IntRange int i);

    @NonNull
    Task<AnnotatedData<AchievementBuffer>> load(boolean z);

    void reveal(@NonNull String str);

    @NonNull
    Task<Void> revealImmediate(@NonNull String str);

    void setSteps(@NonNull String str, @IntRange int i);

    @NonNull
    Task<Boolean> setStepsImmediate(@NonNull String str, @IntRange int i);

    void unlock(@NonNull String str);

    @NonNull
    Task<Void> unlockImmediate(@NonNull String str);
}
