package androidx.credentials;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import defpackage.b8;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/CredentialManagerImpl;", "Landroidx/credentials/CredentialManager;", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
public final class CredentialManagerImpl implements CredentialManager {
    public final Context a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/credentials/CredentialManagerImpl$Companion;", "", "", "ORIGIN_PERMISSION", "Ljava/lang/String;", "INTENT_ACTION_FOR_CREDENTIAL_PROVIDER_SETTINGS", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.credentials.CredentialManager
    public final void d(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, b8 b8Var, CredentialManager$clearCredentialState$2$callback$1 credentialManager$clearCredentialState$2$callback$1) {
        CredentialProvider credentialProviderA = CredentialProviderFactory.a(new CredentialProviderFactory(this.a), clearCredentialStateRequest.a);
        if (credentialProviderA == null) {
            credentialManager$clearCredentialState$2$callback$1.a(new ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            credentialProviderA.onClearCredential(clearCredentialStateRequest, cancellationSignal, b8Var, credentialManager$clearCredentialState$2$callback$1);
        }
    }

    public CredentialManagerImpl(Context context) {
        this.a = context;
    }

    @Override // androidx.credentials.CredentialManager
    public final void c(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, b8 b8Var, CredentialManager$getCredential$2$callback$1 credentialManager$getCredential$2$callback$1) {
        context.getClass();
        getCredentialRequest.getClass();
        CredentialProvider credentialProviderA = CredentialProviderFactory.a(new CredentialProviderFactory(context), getCredentialRequest);
        if (credentialProviderA == null) {
            credentialManager$getCredential$2$callback$1.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            credentialProviderA.onGetCredential(context, getCredentialRequest, cancellationSignal, b8Var, credentialManager$getCredential$2$callback$1);
        }
    }
}
