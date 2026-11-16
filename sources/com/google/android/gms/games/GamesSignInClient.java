package com.google.android.gms.games;

import androidx.annotation.NonNull;
import com.google.android.gms.games.gamessignin.AuthResponse;
import com.google.android.gms.games.gamessignin.AuthScope;
import com.google.android.gms.internal.games_v2.zzad;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@zzad
public interface GamesSignInClient {
    @NonNull
    @zzad
    Task<AuthenticationResult> isAuthenticated();

    @NonNull
    @zzad
    Task<String> requestServerSideAccess(@NonNull String str, boolean z);

    @NonNull
    @zzad
    Task<AuthResponse> requestServerSideAccess(@NonNull String str, boolean z, @NonNull List<AuthScope> list);

    @NonNull
    @zzad
    Task<AuthenticationResult> signIn();
}
