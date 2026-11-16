package defpackage;

import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CredentialManagerCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialManagerCallback b;
    public final /* synthetic */ CreateCredentialResponse c;

    public /* synthetic */ h20(CredentialManagerCallback credentialManagerCallback, CreateCredentialResponse createCredentialResponse, int i) {
        this.a = i;
        this.b = credentialManagerCallback;
        this.c = createCredentialResponse;
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
