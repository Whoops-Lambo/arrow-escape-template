package androidx.credentials;

import android.os.Bundle;
import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/PasswordCredential;", "Landroidx/credentials/Credential;", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PasswordCredential extends Credential {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/credentials/PasswordCredential$Companion;", "", "", "TYPE_PASSWORD_CREDENTIAL", "Ljava/lang/String;", "BUNDLE_KEY_ID", "BUNDLE_KEY_PASSWORD", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public PasswordCredential(Bundle bundle, String str) {
        super(bundle, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
        if (str.length() > 0) {
            return;
        }
        d.r("password should not be empty");
        throw null;
    }
}
