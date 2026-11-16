package com.google.android.gms.identitycredentials;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00060\u0001j\u0002`\u0002:\u0001\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/google/android/gms/identitycredentials/GetCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "type", "b", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetCredentialException extends Exception {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String type;

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
