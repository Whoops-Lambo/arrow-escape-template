package defpackage;

import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreatePublicKeyCredentialController b;

    public /* synthetic */ y10(CreatePublicKeyCredentialController createPublicKeyCredentialController, int i) {
        this.a = i;
        this.b = createPublicKeyCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CreatePublicKeyCredentialController createPublicKeyCredentialController = this.b;
        switch (i) {
            case 0:
                CreatePublicKeyCredentialController.handleResponse$lambda$2$0(createPublicKeyCredentialController);
                break;
            default:
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$1$0(createPublicKeyCredentialController);
                break;
        }
    }
}
