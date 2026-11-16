package androidx.credentials.exceptions.publickeycredential;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/SignalCredentialRateLimitExceededException;", "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "", "retryMillis", "", "errorMessage", "<init>", "(JLjava/lang/CharSequence;)V", "c", "J", "getRetryMillis", "()J", "d", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SignalCredentialRateLimitExceededException extends SignalCredentialStateException {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long retryMillis;

    public SignalCredentialRateLimitExceededException(long j, @Nullable CharSequence charSequence) {
        super("androidx.credentials.SignalCredentialStateException.RATE_LIMIT_EXCEEDED", charSequence);
        this.retryMillis = j;
    }
}
