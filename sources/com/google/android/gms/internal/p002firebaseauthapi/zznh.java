package com.google.android.gms.internal.p002firebaseauthapi;

import android.crypto.hpke.Hpke;
import android.crypto.hpke.Message;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zznh implements zzbs {
    public static final byte[] e = new byte[0];
    public static final byte[] f;
    public static final byte[] g;
    public final PrivateKey a;
    public final String b;
    public final int c;
    public final byte[] d;

    static {
        Charset charset = StandardCharsets.UTF_8;
        f = "Workload".getBytes(charset);
        g = "ContextInfo".getBytes(charset);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.d;
        int length = bArr3.length + this.c;
        if (bArr.length < length) {
            e.d("Ciphertext is too short");
            return null;
        }
        if (!zzqu.b(bArr3, bArr)) {
            e.d("Invalid ciphertext (output prefix mismatch)");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, length);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length, bArr.length);
        return Hpke.getInstance(this.b).open(this.a, bArr2, new Message(bArrCopyOfRange, bArrCopyOfRange2), e);
    }

    public zznh(PrivateKey privateKey, String str, int i, byte[] bArr) {
        this.a = privateKey;
        this.b = str;
        this.c = i;
        this.d = bArr;
    }
}
