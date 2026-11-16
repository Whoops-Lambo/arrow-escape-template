package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreatePublicKeyCredentialController b;
    public final /* synthetic */ CreateCredentialException c;

    public /* synthetic */ c20(CreatePublicKeyCredentialController createPublicKeyCredentialController, CreateCredentialException createCredentialException, int i) {
        this.a = i;
        this.b = createPublicKeyCredentialController;
        this.c = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CreateCredentialException createCredentialException = this.c;
        CreatePublicKeyCredentialController createPublicKeyCredentialController = this.b;
        switch (i) {
            case 0:
                CreatePublicKeyCredentialController.handleResponse$lambda$1$0(createPublicKeyCredentialController, createCredentialException);
                break;
            default:
                CreatePublicKeyCredentialController.handleResponse$lambda$4$0(createPublicKeyCredentialController, createCredentialException);
                break;
        }
    }
}
