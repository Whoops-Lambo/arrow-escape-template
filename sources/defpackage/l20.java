package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderBeginSignInController b;
    public final /* synthetic */ GetCredentialException c;

    public /* synthetic */ l20(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException, int i) {
        this.a = i;
        this.b = credentialProviderBeginSignInController;
        this.c = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        GetCredentialException getCredentialException = this.c;
        CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.b;
        switch (i) {
            case 0:
                CredentialProviderBeginSignInController.invokePlayServices$lambda$2$0$0(credentialProviderBeginSignInController, getCredentialException);
                break;
            case 1:
                CredentialProviderBeginSignInController.handleResponse$lambda$1$0(credentialProviderBeginSignInController, getCredentialException);
                break;
            default:
                CredentialProviderBeginSignInController.handleResponse$lambda$4$0(credentialProviderBeginSignInController, getCredentialException);
                break;
        }
    }
}
