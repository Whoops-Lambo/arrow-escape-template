package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class FirebaseAuthException extends FirebaseException {
    private final String zza;

    @NonNull
    public String getErrorCode() {
        return this.zza;
    }

    public FirebaseAuthException(@NonNull String str, @NonNull String str2) {
        super(str2);
        this.zza = Preconditions.checkNotEmpty(str);
    }
}
