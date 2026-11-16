package androidx.credentials.exceptions.restorecredential;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.domerrors.DomError;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/credentials/exceptions/restorecredential/CreateRestoreCredentialDomException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroidx/credentials/exceptions/domerrors/DomError;", "domError", "", "errorMessage", "<init>", "(Landroidx/credentials/exceptions/domerrors/DomError;Ljava/lang/CharSequence;)V", "d", "Landroidx/credentials/exceptions/domerrors/DomError;", "getDomError", "()Landroidx/credentials/exceptions/domerrors/DomError;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateRestoreCredentialDomException extends CreateCredentialException {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final DomError domError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRestoreCredentialDomException(@NotNull DomError domError, @NotNull CharSequence charSequence) {
        super("androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/".concat(domError.a), charSequence);
        domError.getClass();
        charSequence.getClass();
        this.domError = domError;
    }
}
