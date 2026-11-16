package androidx.credentials.exceptions;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialProviderConfigurationException;", "Landroidx/credentials/exceptions/GetCredentialException;", "", "errorMessage", "<init>", "(Ljava/lang/CharSequence;)V", "d", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetCredentialProviderConfigurationException extends GetCredentialException {
    public GetCredentialProviderConfigurationException(@Nullable CharSequence charSequence) {
        super("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", charSequence);
    }
}
