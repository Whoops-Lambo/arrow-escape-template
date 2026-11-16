package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class GoogleAuthProvider {

    @NonNull
    public static final String GOOGLE_SIGN_IN_METHOD = "google.com";

    @NonNull
    public static final String PROVIDER_ID = "google.com";

    @NonNull
    public static AuthCredential getCredential(@Nullable String str, @Nullable String str2) {
        return new GoogleAuthCredential(str, str2);
    }

    private GoogleAuthProvider() {
    }
}
