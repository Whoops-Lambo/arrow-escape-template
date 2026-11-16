package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreatePasswordCredentialController b;
    public final /* synthetic */ CreateCredentialException c;

    public /* synthetic */ u10(CreatePasswordCredentialController createPasswordCredentialController, CreateCredentialException createCredentialException, int i) {
        this.a = i;
        this.b = createPasswordCredentialController;
        this.c = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CreateCredentialException createCredentialException = this.c;
        CreatePasswordCredentialController createPasswordCredentialController = this.b;
        switch (i) {
            case 0:
                CreatePasswordCredentialController.handleResponse$lambda$1$0(createPasswordCredentialController, createCredentialException);
                break;
            default:
                CreatePasswordCredentialController.handleResponse$lambda$4$0(createPasswordCredentialController, createCredentialException);
                break;
        }
    }
}
