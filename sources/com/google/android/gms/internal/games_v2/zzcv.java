package com.google.android.gms.internal.games_v2;

import androidx.annotation.RequiresApi;
import com.google.android.gms.games.GamesSignInClient;
import com.google.android.gms.tasks.Task;
import defpackage.d;
import defpackage.jh2;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
public final class zzcv implements GamesSignInClient {
    public final zzaw a;
    public final zzaq b;

    @Override // com.google.android.gms.games.GamesSignInClient
    public final Task isAuthenticated() {
        return this.a.zzc();
    }

    @Override // com.google.android.gms.games.GamesSignInClient
    public final Task requestServerSideAccess(String str, boolean z, List list) {
        Objects.requireNonNull(str, "serverClientId must not be null.");
        if (str.isEmpty()) {
            d.r("serverClientId must not be empty.");
            return null;
        }
        if (list == null || list.contains(null)) {
            d.r("AuthScope array cannot contain null elements.");
            return null;
        }
        return this.a.a(new jh2(2, str, z), list);
    }

    @Override // com.google.android.gms.games.GamesSignInClient
    public final Task signIn() {
        return this.a.zze();
    }

    public zzcv(zzaw zzawVar, zzaq zzaqVar) {
        this.a = zzawVar;
        this.b = zzaqVar;
    }

    @Override // com.google.android.gms.games.GamesSignInClient
    public final Task requestServerSideAccess(String str, boolean z) {
        return this.b.b(new jh2(4, str, z));
    }
}
