package androidx.credentials.provider;

import defpackage.dt1;
import defpackage.qh1;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/provider/AuthenticationResult;", "", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthenticationResult {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/credentials/provider/AuthenticationResult$Companion;", "", "", "EXTRA_BIOMETRIC_AUTH_RESULT_TYPE", "Ljava/lang/String;", "EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        qh1.X(new dt1(2, 2), new dt1(1, 1));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AuthenticationResult);
    }

    public final int hashCode() {
        return Objects.hash(0);
    }
}
