package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAuthUserCollisionException extends FirebaseAuthException {

    @Nullable
    private AuthCredential zza;

    @Nullable
    private String zzb;

    @Nullable
    public final String getEmail() {
        return this.zzb;
    }

    @Nullable
    public final AuthCredential getUpdatedCredential() {
        return this.zza;
    }

    @NonNull
    public final FirebaseAuthUserCollisionException zza(@NonNull AuthCredential authCredential) {
        this.zza = authCredential;
        return this;
    }

    public FirebaseAuthUserCollisionException(@NonNull String str, @NonNull String str2) {
        super(str, str2);
    }

    @NonNull
    public final FirebaseAuthUserCollisionException zza(@NonNull String str) {
        this.zzb = str;
        return this;
    }
}
