package androidx.credentials.provider;

import defpackage.dt1;
import defpackage.qh1;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/provider/AuthenticationError;", "", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthenticationError {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/credentials/provider/AuthenticationError$Companion;", "", "", "EXTRA_BIOMETRIC_AUTH_ERROR", "Ljava/lang/String;", "EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK", "EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE", "EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE_FALLBACK", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        qh1.X(new dt1(5, 5), new dt1(12, 12), new dt1(1, 1), new dt1(7, 7), new dt1(9, 9), new dt1(11, 11), new dt1(14, 14), new dt1(4, 4), new dt1(15, 15), new dt1(3, 3), new dt1(2, 2), new dt1(10, 10), new dt1(8, 8));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AuthenticationError);
    }

    public final int hashCode() {
        return Objects.hash(0, null);
    }
}
