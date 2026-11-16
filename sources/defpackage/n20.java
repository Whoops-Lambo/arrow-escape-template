package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderCreatePasswordController b;
    public final /* synthetic */ CreateCredentialException c;

    public /* synthetic */ n20(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialException createCredentialException, int i) {
        this.a = i;
        this.b = credentialProviderCreatePasswordController;
        this.c = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CreateCredentialException createCredentialException = this.c;
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.b;
        switch (i) {
            case 0:
                CredentialProviderCreatePasswordController.handleResponse$lambda$1$0(credentialProviderCreatePasswordController, createCredentialException);
                break;
            default:
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$0$0(credentialProviderCreatePasswordController, createCredentialException);
                break;
        }
    }
}
