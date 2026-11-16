package com.google.android.gms.internal.games_v2;

import androidx.annotation.RequiresApi;
import com.google.android.gms.games.PlayerStatsClient;
import com.google.android.gms.tasks.Task;
import defpackage.a50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
public final class zzdt implements PlayerStatsClient {
    public final zzaq a;

    @Override // com.google.android.gms.games.PlayerStatsClient
    public final Task loadPlayerStats(boolean z) {
        return this.a.b(new a50(z, 18));
    }

    public zzdt(zzaq zzaqVar) {
        this.a = zzaqVar;
    }
}
