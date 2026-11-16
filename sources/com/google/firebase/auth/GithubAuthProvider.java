package com.google.firebase.auth;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class GithubAuthProvider {

    @NonNull
    public static final String GITHUB_SIGN_IN_METHOD = "github.com";

    @NonNull
    public static final String PROVIDER_ID = "github.com";

    @NonNull
    public static AuthCredential getCredential(@NonNull String str) {
        return new GithubAuthCredential(str);
    }

    private GithubAuthProvider() {
    }
}
