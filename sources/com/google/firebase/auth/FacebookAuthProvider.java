package com.google.firebase.auth;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class FacebookAuthProvider {

    @NonNull
    public static final String FACEBOOK_SIGN_IN_METHOD = "facebook.com";

    @NonNull
    public static final String PROVIDER_ID = "facebook.com";

    @NonNull
    public static AuthCredential getCredential(@NonNull String str) {
        return new FacebookAuthCredential(str);
    }

    private FacebookAuthProvider() {
    }
}
