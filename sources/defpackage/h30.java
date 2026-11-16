package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h30 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderGetSignInIntentController b;
    public final /* synthetic */ GetCredentialException c;

    public /* synthetic */ h30(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException, int i) {
        this.a = i;
        this.b = credentialProviderGetSignInIntentController;
        this.c = getCredentialException;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        GetCredentialException getCredentialException = this.c;
        CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.b;
        switch (i) {
            case 0:
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$4(credentialProviderGetSignInIntentController, getCredentialException);
            default:
                return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3$0(credentialProviderGetSignInIntentController, getCredentialException);
        }
    }
}
