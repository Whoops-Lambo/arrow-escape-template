package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialManagerCallback b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ r10(CredentialManagerCallback credentialManagerCallback, Exception exc, int i) {
        this.a = i;
        this.b = credentialManagerCallback;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CreateDigitalCredentialController.invokePlayServices$lambda$2$0$0(this.b, this.c);
                break;
            case 1:
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0$1$0(this.b, this.c);
                break;
            case 2:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$1$0(this.b, this.c);
                break;
            default:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0(this.b, this.c);
                break;
        }
    }
}
