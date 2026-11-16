package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreateDigitalCredentialController b;
    public final /* synthetic */ CreateCredentialException c;

    public /* synthetic */ n10(CreateDigitalCredentialController createDigitalCredentialController, CreateCredentialException createCredentialException, int i) {
        this.a = i;
        this.b = createDigitalCredentialController;
        this.c = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CreateCredentialException createCredentialException = this.c;
        CreateDigitalCredentialController createDigitalCredentialController = this.b;
        switch (i) {
            case 0:
                CreateDigitalCredentialController.handleResponse$lambda$3$0(createDigitalCredentialController, createCredentialException);
                break;
            default:
                CreateDigitalCredentialController.handleResponse$lambda$1$0(createDigitalCredentialController, createCredentialException);
                break;
        }
    }
}
