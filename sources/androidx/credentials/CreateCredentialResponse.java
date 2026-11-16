package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/CreateCredentialResponse;", "", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CreateCredentialResponse {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/credentials/CreateCredentialResponse$Companion;", "", "", "EXTRA_CREATE_CREDENTIAL_RESPONSE_TYPE", "Ljava/lang/String;", "EXTRA_CREATE_CREDENTIAL_RESPONSE_DATA", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static CreateCredentialResponse a(Bundle bundle, String str) {
            str.getClass();
            bundle.getClass();
            try {
                int iHashCode = str.hashCode();
                if (iHashCode != -1678407252) {
                    if (iHashCode != -543568185) {
                        if (iHashCode == -95037569 && str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                            try {
                                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                                string.getClass();
                                return new CreatePublicKeyCredentialResponse(bundle, string);
                            } catch (Exception unused) {
                                throw new FrameworkClassParsingException();
                            }
                        }
                    } else if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        return new CreatePasswordResponse(bundle);
                    }
                } else if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                    try {
                        String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                        string2.getClass();
                        new Bundle().putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", string2);
                        CreateDigitalCredentialResponse createDigitalCredentialResponse = new CreateDigitalCredentialResponse();
                        if (RequestValidationHelper.Companion.a(string2)) {
                            return createDigitalCredentialResponse;
                        }
                        throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
                    } catch (Exception unused2) {
                        throw new FrameworkClassParsingException();
                    }
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused3) {
                CreateCustomCredentialResponse createCustomCredentialResponse = new CreateCustomCredentialResponse();
                if (str.length() > 0) {
                    return createCustomCredentialResponse;
                }
                d.r("type should not be empty");
                return null;
            }
        }
    }
}
