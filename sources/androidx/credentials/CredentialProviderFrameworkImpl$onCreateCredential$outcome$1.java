package androidx.credentials;

import android.os.OutcomeReceiver;
import android.util.Log;
import defpackage.a30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/CredentialProviderFrameworkImpl$onCreateCredential$outcome$1", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/CreateCredentialResponse;", "Landroid/credentials/CreateCredentialException;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialProviderFrameworkImpl$onCreateCredential$outcome$1 implements OutcomeReceiver {
    public final void onError(Throwable th) {
        a30.i(th).getClass();
        Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
        throw null;
    }

    public final void onResult(Object obj) {
        a30.j(obj).getClass();
        Log.i("CredManProvService", "Create Result returned from framework: ");
        throw null;
    }
}
