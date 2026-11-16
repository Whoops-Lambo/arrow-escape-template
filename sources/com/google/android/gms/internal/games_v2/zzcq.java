package com.google.android.gms.internal.games_v2;

import androidx.annotation.RequiresApi;
import com.google.android.gms.games.EventsClient;
import com.google.android.gms.tasks.Task;
import defpackage.a50;
import defpackage.e01;
import defpackage.g34;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
public final class zzcq implements EventsClient {
    public final zzaq a;

    @Override // com.google.android.gms.games.EventsClient
    public final void increment(String str, int i) {
        this.a.b(new e01(str, i, 5));
    }

    @Override // com.google.android.gms.games.EventsClient
    public final Task load(boolean z) {
        return this.a.b(new a50(z, 12));
    }

    @Override // com.google.android.gms.games.EventsClient
    public final Task loadByIds(boolean z, String... strArr) {
        return this.a.b(new g34(z, strArr));
    }

    public zzcq(zzaq zzaqVar) {
        this.a = zzaqVar;
    }
}
