package com.google.firebase.auth;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class TwitterAuthProvider {

    @NonNull
    public static final String PROVIDER_ID = "twitter.com";

    @NonNull
    public static final String TWITTER_SIGN_IN_METHOD = "twitter.com";

    @NonNull
    public static AuthCredential getCredential(@NonNull String str, @NonNull String str2) {
        return new TwitterAuthCredential(str, str2);
    }

    private TwitterAuthProvider() {
    }
}
