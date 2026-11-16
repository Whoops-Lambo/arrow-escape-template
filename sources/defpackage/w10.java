package defpackage;

import android.os.CancellationSignal;
import androidx.credentials.ClearCredentialStateRequest;
import androidx.credentials.CreatePasswordRequest;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w10 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CancellationSignal b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ CredentialManagerCallback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w10(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        this.a = 1;
        this.e = credentialProviderPlayServicesImpl;
        this.f = clearCredentialStateRequest;
        this.b = cancellationSignal;
        this.c = executor;
        this.d = credentialManagerCallback;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                CreatePasswordCredentialController.invokePlayServices$lambda$2((CreatePasswordCredentialController) obj2, (CreatePasswordRequest) obj, this.d, this.c, this.b, exc);
                break;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$6((CredentialProviderPlayServicesImpl) obj2, (ClearCredentialStateRequest) obj, this.b, this.c, this.d, exc);
                break;
            default:
                GetCredentialController.invokePlayServices$lambda$2((GetCredentialRequest) obj2, (GetCredentialController) obj, this.d, this.c, this.b, exc);
                break;
        }
    }

    public /* synthetic */ w10(Object obj, Object obj2, CredentialManagerCallback credentialManagerCallback, Executor executor, CancellationSignal cancellationSignal, int i) {
        this.a = i;
        this.e = obj;
        this.f = obj2;
        this.d = credentialManagerCallback;
        this.c = executor;
        this.b = cancellationSignal;
    }
}
