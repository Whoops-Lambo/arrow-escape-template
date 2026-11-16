package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import defpackage.b45;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zznr implements zzbm {
    public final b45 a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws BadPaddingException {
        b45 b45Var = this.a;
        try {
            return b45Var.a(bArr, bArr2);
        } catch (BadPaddingException e) {
            throw e;
        } catch (GeneralSecurityException e2) {
            e = e2;
            Log.w("zznr", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return b45Var.a(bArr, bArr2);
        } catch (ProviderException e3) {
            e = e3;
            Log.w("zznr", "encountered a potentially transient KeyStore error, will wait and retry", e);
            Thread.sleep((int) (Math.random() * 100.0d));
            return b45Var.a(bArr, bArr2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        b45 b45Var = this.a;
        try {
            return b45Var.b(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("zznr", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return b45Var.b(bArr, bArr2);
        }
    }

    public zznr(String str) throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.a = new b45(str, keyStore);
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
