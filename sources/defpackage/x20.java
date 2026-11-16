package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x20 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ CredentialManagerCallback c;
    public final /* synthetic */ m32 d;

    public /* synthetic */ x20(Executor executor, CredentialManagerCallback credentialManagerCallback, m32 m32Var, int i) {
        this.a = i;
        this.b = executor;
        this.c = credentialManagerCallback;
        this.d = m32Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        m32 m32Var = this.d;
        CredentialManagerCallback credentialManagerCallback = this.c;
        Executor executor = this.b;
        switch (i) {
            case 0:
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2$0(executor, credentialManagerCallback, m32Var);
            case 1:
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2$0(executor, credentialManagerCallback, m32Var);
            default:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0(executor, credentialManagerCallback, m32Var);
        }
    }
}
