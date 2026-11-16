package defpackage;

import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p20 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController b;
    public final /* synthetic */ JSONException c;

    public /* synthetic */ p20(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException, int i) {
        this.a = i;
        this.b = credentialProviderCreatePublicKeyCredentialController;
        this.c = jSONException;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        JSONException jSONException = this.c;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.b;
        switch (i) {
            case 0:
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$5(credentialProviderCreatePublicKeyCredentialController, jSONException);
            default:
                return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$0(credentialProviderCreatePublicKeyCredentialController, jSONException);
        }
    }
}
