package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g30 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ CredentialManagerCallback c;
    public final /* synthetic */ GetCredentialResponse d;

    public /* synthetic */ g30(Executor executor, CredentialManagerCallback credentialManagerCallback, GetCredentialResponse getCredentialResponse, int i) {
        this.a = i;
        this.b = executor;
        this.c = credentialManagerCallback;
        this.d = getCredentialResponse;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        GetCredentialResponse getCredentialResponse = this.d;
        CredentialManagerCallback credentialManagerCallback = this.c;
        Executor executor = this.b;
        switch (i) {
            case 0:
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$0(executor, credentialManagerCallback, getCredentialResponse);
            default:
                return ResponseUtils.Companion.handleGetCredentialResponse$lambda$3(executor, credentialManagerCallback, getCredentialResponse);
        }
    }
}
