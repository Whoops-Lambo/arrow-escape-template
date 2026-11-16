package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o10 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ CredentialManagerCallback c;
    public final /* synthetic */ Exception d;

    public /* synthetic */ o10(Exception exc, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        this.a = 3;
        this.d = exc;
        this.b = executor;
        this.c = credentialManagerCallback;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        CredentialManagerCallback credentialManagerCallback = this.c;
        Executor executor = this.b;
        Exception exc = this.d;
        switch (i) {
            case 0:
                return CreateDigitalCredentialController.invokePlayServices$lambda$2$0(executor, credentialManagerCallback, exc);
            case 1:
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0$1(executor, credentialManagerCallback, exc);
            case 2:
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$1(executor, credentialManagerCallback, exc);
            default:
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0(exc, executor, credentialManagerCallback);
        }
    }

    public /* synthetic */ o10(Executor executor, CredentialManagerCallback credentialManagerCallback, Exception exc, int i) {
        this.a = i;
        this.b = executor;
        this.c = credentialManagerCallback;
        this.d = exc;
    }
}
