package defpackage;

import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreatePasswordCredentialController b;

    public /* synthetic */ t10(CreatePasswordCredentialController createPasswordCredentialController, int i) {
        this.a = i;
        this.b = createPasswordCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CreatePasswordCredentialController createPasswordCredentialController = this.b;
        switch (i) {
            case 0:
                CreatePasswordCredentialController.handleResponse$lambda$2$0(createPasswordCredentialController);
                break;
            default:
                CreatePasswordCredentialController.invokePlayServices$lambda$0$0$0(createPasswordCredentialController);
                break;
        }
    }
}
