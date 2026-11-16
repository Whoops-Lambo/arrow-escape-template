package androidx.credentials;

import androidx.credentials.exceptions.CreateCredentialException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/CredentialManager$createCredential$2$callback$1", "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialManager$createCredential$2$callback$1 implements CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> {
    @Override // androidx.credentials.CredentialManagerCallback
    public final void a(Object obj) {
        ((CreateCredentialException) obj).getClass();
        throw null;
    }

    @Override // androidx.credentials.CredentialManagerCallback
    public final void onResult(Object obj) {
        ((CreateCredentialResponse) obj).getClass();
        throw null;
    }
}
