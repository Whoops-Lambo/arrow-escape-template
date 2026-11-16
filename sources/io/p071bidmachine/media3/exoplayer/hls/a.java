package io.p071bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import defpackage.dr0;
import io.p071bidmachine.media3.datasource.h;
import io.p071bidmachine.media3.datasource.j;
import io.p071bidmachine.media3.datasource.k;
import io.p071bidmachine.media3.exoplayer.upstream.e;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements h {
    public final h a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    @Override // io.p071bidmachine.media3.datasource.h
    public final long a(k kVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                j jVar = new j(this.a, kVar);
                this.d = new CipherInputStream(jVar, cipher);
                if (jVar.d) {
                    return -1L;
                }
                jVar.a.a(jVar.b);
                jVar.d = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                dr0.m(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            dr0.m(e2);
            return 0L;
        }
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // io.p071bidmachine.media3.common.g
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    public a(h hVar, byte[] bArr, byte[] bArr2) {
        this.a = hVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final void b(e eVar) {
        eVar.getClass();
        this.a.b(eVar);
    }
}
