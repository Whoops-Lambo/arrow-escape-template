package androidx.biometric;

import android.security.identity.IdentityCredential;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
class CryptoObjectUtils {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api28Impl {
        @Nullable
        public static Cipher a(@NonNull android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        @Nullable
        public static Mac b(@NonNull android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        @Nullable
        public static Signature c(@NonNull android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api30Impl {
        @Nullable
        public static IdentityCredential a(@NonNull android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }
}
