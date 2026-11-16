package com.google.android.gms.games;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface GamesClient {
    @NonNull
    @Deprecated
    Task<Bundle> getActivationHint();

    @NonNull
    @Deprecated
    Task<String> getAppId();

    @NonNull
    @RequiresPermission
    @Deprecated
    Task<String> getCurrentAccountName();

    @NonNull
    @Deprecated
    Task<Intent> getSettingsIntent();

    @NonNull
    @Deprecated
    Task<Void> setGravityForPopups(int i);

    @NonNull
    @Deprecated
    Task<Void> setViewForPopups(@NonNull View view);
}
