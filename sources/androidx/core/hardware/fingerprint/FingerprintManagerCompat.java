package androidx.core.hardware.fingerprint;

import android.hardware.fingerprint.FingerprintManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo
@Deprecated
public class FingerprintManagerCompat {

    /* JADX INFO: renamed from: androidx.core.hardware.fingerprint.FingerprintManagerCompat$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    class AnonymousClass1 extends FingerprintManager.AuthenticationCallback {
        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationError(int i, CharSequence charSequence) {
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationFailed() {
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationHelp(int i, CharSequence charSequence) {
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0039  */
        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            CryptoObject cryptoObject;
            FingerprintManager.CryptoObject cryptoObject2 = authenticationResult.getCryptoObject();
            if (cryptoObject2 == null) {
                cryptoObject = null;
            } else if (cryptoObject2.getCipher() != null) {
                cryptoObject = new CryptoObject(cryptoObject2.getCipher());
            } else if (cryptoObject2.getSignature() != null) {
                cryptoObject = new CryptoObject(cryptoObject2.getSignature());
            } else if (cryptoObject2.getMac() != null) {
                cryptoObject = new CryptoObject(cryptoObject2.getMac());
            } else {
                cryptoObject = null;
            }
            new AuthenticationResult(cryptoObject);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class AuthenticationCallback {
        public void a(int i, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(CharSequence charSequence) {
        }

        public void d(AuthenticationResult authenticationResult) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class AuthenticationResult {
        public final CryptoObject a;

        public AuthenticationResult(CryptoObject cryptoObject) {
            this.a = cryptoObject;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class CryptoObject {
        public final Signature a;
        public final Cipher b;
        public final Mac c;

        public CryptoObject(Signature signature) {
            this.a = signature;
            this.b = null;
            this.c = null;
        }

        public CryptoObject(Cipher cipher) {
            this.b = cipher;
            this.a = null;
            this.c = null;
        }

        public CryptoObject(Mac mac) {
            this.c = mac;
            this.b = null;
            this.a = null;
        }
    }
}
