package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c30 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ CredentialManagerCallback c;
    public final /* synthetic */ GetCredentialException d;

    public /* synthetic */ c30(Executor executor, CredentialManagerCallback credentialManagerCallback, GetCredentialException getCredentialException, int i) {
        this.a = i;
        this.b = executor;
        this.c = credentialManagerCallback;
        this.d = getCredentialException;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        GetCredentialException getCredentialException = this.d;
        CredentialManagerCallback credentialManagerCallback = this.c;
        Executor executor = this.b;
        switch (i) {
            case 0:
                return CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$2$0(executor, credentialManagerCallback, getCredentialException);
            default:
                return ResponseUtils.Companion.handleGetCredentialResponse$lambda$4(executor, credentialManagerCallback, getCredentialException);
        }
    }
}
