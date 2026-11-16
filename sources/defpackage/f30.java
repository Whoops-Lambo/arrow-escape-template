package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialResponse;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialManagerCallback b;
    public final /* synthetic */ GetCredentialResponse c;

    public /* synthetic */ f30(CredentialManagerCallback credentialManagerCallback, GetCredentialResponse getCredentialResponse, int i) {
        this.a = i;
        this.b = credentialManagerCallback;
        this.c = getCredentialResponse;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onResult(this.c);
                break;
            default:
                this.b.onResult(this.c);
                break;
        }
    }
}
