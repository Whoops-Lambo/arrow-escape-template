package com.google.android.gms.games;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.games_v2.zzad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@zzad
public final class AuthenticationResult {

    @NonNull
    public static final AuthenticationResult zza = new AuthenticationResult(true);

    @NonNull
    public static final AuthenticationResult zzb = new AuthenticationResult(false);
    private final boolean zzc;

    @zzad
    public boolean isAuthenticated() {
        return this.zzc;
    }

    private AuthenticationResult(boolean z) {
        this.zzc = z;
    }
}
