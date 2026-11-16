package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zznq implements zzco {
    public static final Object a = new Object();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza {
        @RequiresApi
        public zza() {
        }
    }

    @RequiresApi
    public zznq() throws GeneralSecurityException {
        new zza();
    }

    public static boolean a(String str) {
        synchronized (a) {
            try {
                String strA = zzaap.a(str);
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (keyStore.containsAlias(strA)) {
                        return false;
                    }
                    KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strA, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpecBuild);
                    keyGenerator.generateKey();
                    return true;
                } catch (IOException e) {
                    throw new GeneralSecurityException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzco
    public final zznr zza(String str) throws GeneralSecurityException {
        zznr zznrVar;
        try {
            synchronized (a) {
                try {
                    zznrVar = new zznr(zzaap.a(str));
                    byte[] bArrA = zzqm.a(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(bArrA, zznrVar.a(zznrVar.b(bArrA, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zznrVar;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzco
    public final boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
