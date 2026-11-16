package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class EmailAuthProvider {

    @NonNull
    public static final String EMAIL_LINK_SIGN_IN_METHOD = "emailLink";

    @NonNull
    public static final String EMAIL_PASSWORD_SIGN_IN_METHOD = "password";

    @NonNull
    public static final String PROVIDER_ID = "password";

    private EmailAuthProvider() {
    }

    @NonNull
    public static AuthCredential getCredential(@NonNull String str, @NonNull String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return new EmailAuthCredential(str, str2, null, null, false);
    }

    @NonNull
    public static AuthCredential getCredentialWithLink(@NonNull String str, @NonNull String str2) {
        if (EmailAuthCredential.d(str2)) {
            return new EmailAuthCredential(str, null, str2, null, false);
        }
        defpackage.d.r("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
        return null;
    }
}
