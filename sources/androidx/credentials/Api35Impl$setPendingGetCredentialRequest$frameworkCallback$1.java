package androidx.credentials;

import android.credentials.GetCredentialException;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.exceptions.NoCredentialException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/Api35Impl$setPendingGetCredentialRequest$frameworkCallback$1", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Api35Impl$setPendingGetCredentialRequest$frameworkCallback$1 implements OutcomeReceiver {
    public final void onError(Throwable th) {
        GetCredentialException getCredentialException = (GetCredentialException) th;
        getCredentialException.getClass();
        Log.w("ViewHandler", "Error: " + getCredentialException.getType() + " , " + getCredentialException.getMessage());
    }

    public final void onResult(Object obj) throws NoCredentialException {
        android.credentials.GetCredentialResponse getCredentialResponse = (android.credentials.GetCredentialResponse) obj;
        getCredentialResponse.getClass();
        android.credentials.Credential credential = getCredentialResponse.getCredential();
        credential.getClass();
        String type = credential.getType();
        type.getClass();
        Bundle data = credential.getData();
        data.getClass();
        Credential.Companion.a(data, type);
        throw null;
    }
}
