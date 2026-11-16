package androidx.credentials.exceptions.domerrors;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/domerrors/ConstraintError;", "Landroidx/credentials/exceptions/domerrors/DomError;", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConstraintError extends DomError {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/exceptions/domerrors/ConstraintError$Companion;", "", "", "TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_CONSTRAINT_ERROR", "Ljava/lang/String;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ConstraintError() {
        super("androidx.credentials.TYPE_CONSTRAINT_ERROR");
    }
}
