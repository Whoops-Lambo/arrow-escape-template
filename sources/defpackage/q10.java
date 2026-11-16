package defpackage;

import android.os.CancellationSignal;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q10 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CancellationSignal b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ CredentialManagerCallback d;

    public /* synthetic */ q10(CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, int i) {
        this.a = i;
        this.b = cancellationSignal;
        this.c = executor;
        this.d = credentialManagerCallback;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i = this.a;
        CredentialManagerCallback credentialManagerCallback = this.d;
        Executor executor = this.c;
        CancellationSignal cancellationSignal = this.b;
        switch (i) {
            case 0:
                CreateDigitalCredentialController.invokePlayServices$lambda$2(cancellationSignal, executor, credentialManagerCallback, exc);
                break;
            case 1:
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2(cancellationSignal, executor, credentialManagerCallback, exc);
                break;
            case 2:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2(cancellationSignal, executor, credentialManagerCallback, exc);
                break;
            default:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3(cancellationSignal, executor, credentialManagerCallback, exc);
                break;
        }
    }
}
