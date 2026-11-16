package defpackage;

import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q20 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ q20(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th, int i) {
        this.a = i;
        this.b = credentialProviderCreatePublicKeyCredentialController;
        this.c = th;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        Throwable th = this.c;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.b;
        switch (i) {
            case 0:
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$6(credentialProviderCreatePublicKeyCredentialController, th);
            default:
                return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$1(credentialProviderCreatePublicKeyCredentialController, th);
        }
    }
}
