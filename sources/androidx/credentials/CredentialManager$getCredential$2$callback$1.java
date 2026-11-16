package androidx.credentials;

import androidx.credentials.exceptions.GetCredentialException;
import defpackage.j52;
import defpackage.qo;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/CredentialManager$getCredential$2$callback$1", "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialManager$getCredential$2$callback$1 implements CredentialManagerCallback<GetCredentialResponse, GetCredentialException> {
    public final /* synthetic */ qo a;

    @Override // androidx.credentials.CredentialManagerCallback
    public final void a(Object obj) {
        GetCredentialException getCredentialException = (GetCredentialException) obj;
        getCredentialException.getClass();
        qo qoVar = this.a;
        if (qoVar.isActive()) {
            qoVar.resumeWith(new j52(getCredentialException));
        }
    }

    @Override // androidx.credentials.CredentialManagerCallback
    public final void onResult(Object obj) {
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
        getCredentialResponse.getClass();
        qo qoVar = this.a;
        if (qoVar.isActive()) {
            qoVar.resumeWith(getCredentialResponse);
        }
    }

    public CredentialManager$getCredential$2$callback$1(qo qoVar) {
        this.a = qoVar;
    }
}
