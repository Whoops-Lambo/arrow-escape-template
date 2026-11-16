package defpackage;

import android.credentials.ClearCredentialStateRequest;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialResponse;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ii {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ ClearCredentialStateRequest b(Bundle bundle) {
        return new ClearCredentialStateRequest(bundle);
    }

    public static /* synthetic */ CredentialOption.Builder e(Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle, bundle2);
    }

    public static /* synthetic */ GetCredentialRequest.Builder g(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    public static /* bridge */ /* synthetic */ BeginGetCredentialOption k(Object obj) {
        return (BeginGetCredentialOption) obj;
    }

    public static /* synthetic */ void s() {
        new BeginCreateCredentialResponse.Builder();
    }

    public static /* synthetic */ void y() {
        new BeginGetCredentialResponse.Builder();
    }
}
