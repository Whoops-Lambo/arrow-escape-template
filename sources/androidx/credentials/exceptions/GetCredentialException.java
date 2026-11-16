package androidx.credentials.exceptions;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u000e\b&\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u001d\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "type", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Ljava/lang/CharSequence;", "getErrorMessage", "()Ljava/lang/CharSequence;", "c", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class GetCredentialException extends Exception {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final CharSequence errorMessage;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialException$Companion;", "", "", "EXTRA_GET_CREDENTIAL_EXCEPTION_TYPE", "Ljava/lang/String;", "EXTRA_GET_CREDENTIAL_EXCEPTION_MESSAGE", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @RestrictTo
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getType() {
        return this.type;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GetCredentialException(@NotNull String str, @Nullable CharSequence charSequence) {
        String string;
        str.getClass();
        if (charSequence != null) {
            string = charSequence.toString();
        } else {
            string = null;
        }
        super(string);
        this.type = str;
        this.errorMessage = charSequence;
    }
}
