package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderGetSignInIntentController b;
    public final /* synthetic */ GetCredentialException c;

    public /* synthetic */ i30(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException, int i) {
        this.a = i;
        this.b = credentialProviderGetSignInIntentController;
        this.c = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        GetCredentialException getCredentialException = this.c;
        CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.b;
        switch (i) {
            case 0:
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3$0$0(credentialProviderGetSignInIntentController, getCredentialException);
                break;
            case 1:
                CredentialProviderGetSignInIntentController.handleResponse$lambda$1$0(credentialProviderGetSignInIntentController, getCredentialException);
                break;
            default:
                CredentialProviderGetSignInIntentController.handleResponse$lambda$4$0(credentialProviderGetSignInIntentController, getCredentialException);
                break;
        }
    }
}
