package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.ResponseUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialManagerCallback b;
    public final /* synthetic */ GetCredentialException c;

    public /* synthetic */ d30(CredentialManagerCallback credentialManagerCallback, GetCredentialException getCredentialException, int i) {
        this.a = i;
        this.b = credentialManagerCallback;
        this.c = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        GetCredentialException getCredentialException = this.c;
        CredentialManagerCallback credentialManagerCallback = this.b;
        switch (i) {
            case 0:
                credentialManagerCallback.a(getCredentialException);
                break;
            case 1:
                credentialManagerCallback.a(getCredentialException);
                break;
            default:
                ResponseUtils.Companion.handleGetCredentialResponse$lambda$4$0(credentialManagerCallback, getCredentialException);
                break;
        }
    }
}
