package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import defpackage.d;
import defpackage.er;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@ExperimentalDigitalCredentialApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/DigitalCredential;", "Landroidx/credentials/Credential;", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DigitalCredential extends Credential {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/DigitalCredential$Companion;", "", "", "TYPE_DIGITAL_CREDENTIAL", "Ljava/lang/String;", "BUNDLE_KEY_REQUEST_JSON", "", "STRING_LEN_THRESHOLD", "I", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static DigitalCredential a(Bundle bundle) throws FrameworkClassParsingException {
            bundle.getClass();
            try {
                Object obj = bundle.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                obj.getClass();
                if (obj instanceof byte[]) {
                    return new DigitalCredential(bundle, new String((byte[]) obj, er.a));
                }
                return new DigitalCredential(bundle, (String) obj);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }
    }

    public DigitalCredential(Bundle bundle, String str) {
        super(bundle, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
        if (RequestValidationHelper.Companion.a(str)) {
            return;
        }
        d.r("credentialJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
