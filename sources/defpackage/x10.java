package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialManagerCallback b;

    public /* synthetic */ x10(CredentialManagerCallback credentialManagerCallback, int i) {
        this.a = i;
        this.b = credentialManagerCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CredentialManagerCallback credentialManagerCallback = this.b;
        switch (i) {
            case 0:
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$0$0(credentialManagerCallback);
                break;
            case 1:
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$3$0(credentialManagerCallback);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(credentialManagerCallback);
                break;
            case 3:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(credentialManagerCallback);
                break;
            case 4:
                credentialManagerCallback.onResult(null);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onSignalCredentialState$lambda$0(credentialManagerCallback);
                break;
            case 6:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(credentialManagerCallback);
                break;
            case 7:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(credentialManagerCallback);
                break;
            case 8:
                credentialManagerCallback.onResult(null);
                break;
            case 9:
                credentialManagerCallback.onResult(null);
                break;
            case 10:
                GetCredentialController.invokePlayServices$lambda$0$0$0(credentialManagerCallback);
                break;
            case 11:
                ResponseUtils.Companion.handleGetCredentialResponse$lambda$2$0(credentialManagerCallback);
                break;
            default:
                SignalCredentialStateController.invokePlayServices$lambda$0$0(credentialManagerCallback);
                break;
        }
    }
}
