package defpackage;

import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b20 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreatePublicKeyCredentialController b;

    public /* synthetic */ b20(CreatePublicKeyCredentialController createPublicKeyCredentialController, int i) {
        this.a = i;
        this.b = createPublicKeyCredentialController;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        CreatePublicKeyCredentialController createPublicKeyCredentialController = this.b;
        switch (i) {
            case 0:
                return CreatePublicKeyCredentialController.handleResponse$lambda$2(createPublicKeyCredentialController);
            default:
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$0$1(createPublicKeyCredentialController);
        }
    }
}
