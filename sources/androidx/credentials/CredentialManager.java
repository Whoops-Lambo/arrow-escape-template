package androidx.credentials;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CancellationSignal;
import defpackage.az2;
import defpackage.b8;
import defpackage.dy;
import defpackage.dz;
import defpackage.kc2;
import defpackage.qo;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/credentials/CredentialManager;", "", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
public interface CredentialManager {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/CredentialManager$Companion;", "", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    void c(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, b8 b8Var, CredentialManager$getCredential$2$callback$1 credentialManager$getCredential$2$callback$1);

    void d(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, b8 b8Var, CredentialManager$clearCredentialState$2$callback$1 credentialManager$clearCredentialState$2$callback$1);

    default Object a(ClearCredentialStateRequest clearCredentialStateRequest, dy dyVar) {
        qo qoVar = new qo(1, kc2.q(dyVar));
        qoVar.s();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        qoVar.v(new wr0() { // from class: androidx.credentials.CredentialManager$clearCredentialState$2$1
            @Override // defpackage.wr0
            public final Object invoke(Object obj) {
                cancellationSignal.cancel();
                return az2.a;
            }
        });
        d(clearCredentialStateRequest, cancellationSignal, new b8(1), new CredentialManager$clearCredentialState$2$callback$1(qoVar));
        Object objR = qoVar.r();
        return objR == dz.a ? objR : az2.a;
    }

    default Object b(Context context, GetCredentialRequest getCredentialRequest, dy dyVar) {
        qo qoVar = new qo(1, kc2.q(dyVar));
        qoVar.s();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        qoVar.v(new wr0() { // from class: androidx.credentials.CredentialManager$getCredential$2$1
            @Override // defpackage.wr0
            public final Object invoke(Object obj) {
                cancellationSignal.cancel();
                return az2.a;
            }
        });
        c(context, getCredentialRequest, cancellationSignal, new b8(1), new CredentialManager$getCredential$2$callback$1(qoVar));
        return qoVar.r();
    }
}
