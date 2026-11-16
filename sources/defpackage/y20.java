package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialManagerCallback b;
    public final /* synthetic */ m32 c;

    public /* synthetic */ y20(CredentialManagerCallback credentialManagerCallback, m32 m32Var, int i) {
        this.a = i;
        this.b = credentialManagerCallback;
        this.c = m32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        m32 m32Var = this.c;
        CredentialManagerCallback credentialManagerCallback = this.b;
        switch (i) {
            case 0:
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2$0$0(credentialManagerCallback, m32Var);
                break;
            case 1:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2$0$0(credentialManagerCallback, m32Var);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0(credentialManagerCallback, m32Var);
                break;
            default:
                SignalCredentialStateController.invokePlayServices$lambda$2$0(credentialManagerCallback, m32Var);
                break;
        }
    }
}
