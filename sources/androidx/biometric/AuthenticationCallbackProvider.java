package androidx.biometric;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
class AuthenticationCallbackProvider {

    /* JADX INFO: renamed from: androidx.biometric.AuthenticationCallbackProvider$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes10.dex */
    class AnonymousClass1 extends FingerprintManagerCompat.AuthenticationCallback {
        @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
        public final void a(int i, CharSequence charSequence) {
            throw null;
        }

        @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
        public final void b() {
            throw null;
        }

        @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
        public final void c(CharSequence charSequence) {
            throw null;
        }

        @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
        public final void d(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
            FingerprintManagerCompat.CryptoObject cryptoObject = authenticationResult.a;
            BiometricPrompt.CryptoObject cryptoObject2 = (cryptoObject == null || (cryptoObject.b == null && cryptoObject.a == null && cryptoObject.c == null)) ? null : new BiometricPrompt.CryptoObject();
            new BiometricPrompt.AuthenticationResult(cryptoObject2, 2);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api28Impl {

        /* JADX INFO: renamed from: androidx.biometric.AuthenticationCallbackProvider$Api28Impl$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        class AnonymousClass1 extends android.hardware.biometrics.BiometricPrompt$AuthenticationCallback {
            public void onAuthenticationError(int i, CharSequence charSequence) {
                throw null;
            }

            public void onAuthenticationFailed() {
                throw null;
            }

            public void onAuthenticationHelp(int i, CharSequence charSequence) {
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0040  */
            public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.CryptoObject cryptoObject;
                android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject2;
                if (authenticationResult == null || (cryptoObject2 = authenticationResult.getCryptoObject()) == null) {
                    cryptoObject = null;
                } else if (CryptoObjectUtils.Api28Impl.a(cryptoObject2) != null || CryptoObjectUtils.Api28Impl.c(cryptoObject2) != null || CryptoObjectUtils.Api28Impl.b(cryptoObject2) != null) {
                    cryptoObject = new BiometricPrompt.CryptoObject();
                } else if (Build.VERSION.SDK_INT < 30 || CryptoObjectUtils.Api30Impl.a(cryptoObject2) == null) {
                    cryptoObject = null;
                } else {
                    cryptoObject = new BiometricPrompt.CryptoObject();
                }
                int i = Build.VERSION.SDK_INT;
                int iA = -1;
                if (i >= 30) {
                    if (authenticationResult != null) {
                        iA = Api30Impl.a(authenticationResult);
                    }
                } else if (i != 29) {
                    iA = 2;
                }
                new BiometricPrompt.AuthenticationResult(cryptoObject, iA);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Listener {
        public void a(int i, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(BiometricPrompt.AuthenticationResult authenticationResult) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api30Impl {
        public static int a(@NonNull android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }
}
