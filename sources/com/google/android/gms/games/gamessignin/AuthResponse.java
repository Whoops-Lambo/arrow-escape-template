package com.google.android.gms.games.gamessignin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.q63;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class AuthResponse {
    private final List zza;
    private final String zzb;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthResponse) {
            AuthResponse authResponse = (AuthResponse) obj;
            if (this.zza.equals(authResponse.zza) && this.zzb.equals(authResponse.zzb)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getAuthCode() {
        return this.zzb;
    }

    @NonNull
    public List<AuthScope> getGrantedScopes() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    @NonNull
    public String toString() {
        String strValueOf = String.valueOf(this.zza);
        int length = strValueOf.length();
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(str).length() + 2);
        q63.y(sb, "AuthResponse{grantedScopes=", strValueOf, ", authCode='", str);
        sb.append("'}");
        return sb.toString();
    }

    public AuthResponse(@NonNull String str, @NonNull List<AuthScope> list) {
        Objects.requireNonNull(list, "Granted scopes list cannot be null");
        this.zzb = str;
        this.zza = list;
    }
}
