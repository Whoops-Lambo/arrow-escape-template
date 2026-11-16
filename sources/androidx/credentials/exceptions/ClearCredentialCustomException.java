package androidx.credentials.exceptions;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialCustomException;", "Landroidx/credentials/exceptions/ClearCredentialException;", "", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "type", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClearCredentialCustomException extends ClearCredentialException {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String type;

    @Override // androidx.credentials.exceptions.ClearCredentialException
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getType() {
        return this.type;
    }
}
