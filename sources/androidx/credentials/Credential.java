package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/Credential;", "", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Credential {
    public final Bundle a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/Credential$Companion;", "", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static Credential a(Bundle bundle, String str) throws NoCredentialException {
            str.getClass();
            bundle.getClass();
            try {
                switch (str.hashCode()) {
                    case -1678407252:
                        if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                            return DigitalCredential.Companion.a(bundle);
                        }
                        throw new FrameworkClassParsingException();
                    case -1072734346:
                        if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                            if (string == null) {
                                throw new NoCredentialException("The device does not contain a restore credential.");
                            }
                            RestoreCredential restoreCredential = new RestoreCredential(bundle, "androidx.credentials.TYPE_RESTORE_CREDENTIAL");
                            if (RequestValidationHelper.Companion.a(string)) {
                                return restoreCredential;
                            }
                            throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                        }
                        throw new FrameworkClassParsingException();
                    case -543568185:
                        if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                            try {
                                String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                                String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                                string2.getClass();
                                string3.getClass();
                                return new PasswordCredential(bundle, string3);
                            } catch (Exception unused) {
                                throw new FrameworkClassParsingException();
                            }
                        }
                        throw new FrameworkClassParsingException();
                    case -95037569:
                        if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                            try {
                                String string4 = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                                string4.getClass();
                                return new PublicKeyCredential(bundle, string4);
                            } catch (Exception unused2) {
                                throw new FrameworkClassParsingException();
                            }
                        }
                        throw new FrameworkClassParsingException();
                    default:
                        throw new FrameworkClassParsingException();
                }
            } catch (FrameworkClassParsingException unused3) {
                return new CustomCredential(bundle, str);
            }
        }
    }

    public Credential(Bundle bundle, String str) {
        str.getClass();
        bundle.getClass();
        this.a = bundle;
    }
}
