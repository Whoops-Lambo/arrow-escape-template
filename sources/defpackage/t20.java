package defpackage;

import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController b;
    public final /* synthetic */ JSONException c;

    public /* synthetic */ t20(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException, int i) {
        this.a = i;
        this.b = credentialProviderCreatePublicKeyCredentialController;
        this.c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        JSONException jSONException = this.c;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.b;
        switch (i) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$5$0(credentialProviderCreatePublicKeyCredentialController, jSONException);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$0$0(credentialProviderCreatePublicKeyCredentialController, jSONException);
                break;
        }
    }
}
