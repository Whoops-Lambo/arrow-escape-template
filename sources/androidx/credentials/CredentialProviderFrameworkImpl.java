package androidx.credentials;

import android.content.Context;
import android.credentials.GetCredentialException;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.ClearCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.internal.ConversionUtilsKt;
import defpackage.a30;
import defpackage.b8;
import defpackage.ii;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/CredentialProviderFrameworkImpl;", "Landroidx/credentials/CredentialProvider;", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialProviderFrameworkImpl implements CredentialProvider {
    public final android.credentials.CredentialManager a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/credentials/CredentialProviderFrameworkImpl$Companion;", "", "", "TAG", "Ljava/lang/String;", "GET_DOM_EXCEPTION_PREFIX", "CREATE_DOM_EXCEPTION_PREFIX", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.credentials.CredentialProvider
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    @Override // androidx.credentials.CredentialProvider
    public final void onClearCredential(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        Log.i("CredManProvService", "In CredentialProviderFrameworkImpl onClearCredential");
        final CredentialManager$clearCredentialState$2$callback$1 credentialManager$clearCredentialState$2$callback$1 = (CredentialManager$clearCredentialState$2$callback$1) credentialManagerCallback;
        android.credentials.CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            credentialManager$clearCredentialState$2$callback$1.a(new ClearCredentialUnsupportedException("Your device doesn't support credential manager"));
            return;
        }
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onClearCredential$outcome$1
            public final void onResult(Object obj) {
                Log.i("CredManProvService", "Clear result returned from framework: ");
                credentialManager$clearCredentialState$2$callback$1.onResult((Void) obj);
            }

            public final void onError(Throwable th) {
                a30.g(th).getClass();
                Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
                credentialManager$clearCredentialState$2$callback$1.a(new ClearCredentialUnknownException(null, 1, null));
            }
        };
        credentialManager.getClass();
        a30.u();
        credentialManager.clearCredentialState(ii.b(new Bundle()), cancellationSignal, (b8) executor, outcomeReceiver);
    }

    public CredentialProviderFrameworkImpl(Context context) {
        context.getClass();
        this.a = a30.l(context.getSystemService("credential"));
    }

    @Override // androidx.credentials.CredentialProvider
    public final void onGetCredential(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        context.getClass();
        getCredentialRequest.getClass();
        final CredentialManager$getCredential$2$callback$1 credentialManager$getCredential$2$callback$1 = (CredentialManager$getCredential$2$callback$1) credentialManagerCallback;
        android.credentials.CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            credentialManager$getCredential$2$callback$1.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
            return;
        }
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver(this) { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$outcome$2
            public final void onError(Throwable th) {
                GetCredentialException getCredentialExceptionN = a30.n(th);
                getCredentialExceptionN.getClass();
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                String type = getCredentialExceptionN.getType();
                type.getClass();
                this.a.a(ConversionUtilsKt.b(type, getCredentialExceptionN.getMessage()));
            }

            public final void onResult(Object obj) {
                android.credentials.GetCredentialResponse getCredentialResponseO = a30.o(obj);
                getCredentialResponseO.getClass();
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                android.credentials.Credential credential = getCredentialResponseO.getCredential();
                credential.getClass();
                String type = credential.getType();
                type.getClass();
                Bundle data = credential.getData();
                data.getClass();
                this.a.onResult(new GetCredentialResponse(Credential.Companion.a(data, type)));
            }
        };
        credentialManager.getClass();
        ii.B();
        android.credentials.GetCredentialRequest.Builder builderG = ii.g(GetCredentialRequest.Companion.a(getCredentialRequest));
        for (CredentialOption credentialOption : getCredentialRequest.a) {
            ii.D();
            credentialOption.getClass();
            builderG.addCredentialOption(ii.e(credentialOption.a, credentialOption.b).setIsSystemProviderRequired(true).setAllowedProviders(credentialOption.d).build());
        }
        android.credentials.GetCredentialRequest getCredentialRequestBuild = builderG.build();
        getCredentialRequestBuild.getClass();
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, (b8) executor, (OutcomeReceiver<android.credentials.GetCredentialResponse, GetCredentialException>) outcomeReceiver);
    }
}
