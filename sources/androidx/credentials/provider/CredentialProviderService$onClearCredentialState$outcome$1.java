package androidx.credentials.provider;

import android.os.OutcomeReceiver;
import androidx.credentials.exceptions.ClearCredentialException;
import defpackage.a30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/provider/CredentialProviderService$onClearCredentialState$outcome$1", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialProviderService$onClearCredentialState$outcome$1 implements OutcomeReceiver {
    public final void onError(Throwable th) {
        ClearCredentialException clearCredentialException = (ClearCredentialException) th;
        clearCredentialException.getClass();
        a30.B();
        ((OutcomeReceiver) null).onError(a30.f(clearCredentialException.getType(), clearCredentialException.getMessage()));
    }

    public final void onResult(Object obj) {
        ((OutcomeReceiver) null).onResult((Void) obj);
    }
}
