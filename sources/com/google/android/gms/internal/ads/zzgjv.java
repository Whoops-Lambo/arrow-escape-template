package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import defpackage.ep0;
import defpackage.jy4;
import defpackage.xl4;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgjv {
    public MessageDigest a;
    public final zzgsw b;
    public final Object c = new Object();
    public boolean d = false;
    public SecureRandom e;

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:com.google.android.gms.internal.ads.zzgsu) VIRTUAL call: com.google.android.gms.internal.ads.zzgsu.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:60), block:B:25:0x0039 */
    public final void a() {
        boolean z;
        zzgsu zzgsuVarC;
        synchronized (this) {
            z = this.d;
        }
        if (z) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            try {
                zzgsu zzgsuVarA = this.b.a(202);
                try {
                    zzgsuVarA.a();
                    this.e = secureRandom;
                    this.a = MessageDigest.getInstance(SameMD5.TAG);
                    this.d = true;
                } catch (NoSuchAlgorithmException e) {
                    zzgsuVarA.b(e);
                } catch (Throwable th) {
                    zzgsuVarA.b(th);
                    throw th;
                }
                zzgsuVarA.c();
            } catch (Throwable th2) {
                zzgsuVarC.c();
                throw th2;
            }
        }
    }

    public final byte[] b(String str, byte[] bArr, boolean z) {
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        zzgvz.a(length <= i);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i2 = i - length;
            byte[] bArr2 = new byte[i2];
            this.e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i2);
            System.arraycopy(bArr2, 0, bArr, length, i2);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        xl4[] xl4VarArr = new zzgkl().K2;
        int length2 = xl4VarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            xl4VarArr[i3].a(bArrArray, bArr3);
        }
        if (!ep0.Q(str)) {
            zzgjx zzgjxVar = new zzgjx(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < 256; i6++) {
                i4 = (i4 + 1) & 255;
                byte[] bArr4 = zzgjxVar.a;
                byte b = bArr4[i4];
                i5 = (i5 + b) & 255;
                bArr4[i4] = bArr4[i5];
                bArr4[i5] = b;
                bArr3[i6] = (byte) (bArr4[(bArr4[i4] + b) & 255] ^ bArr3[i6]);
            }
        }
        return bArr3;
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.c) {
            this.a.reset();
            this.a.update(bArr);
            bArrDigest = this.a.digest();
        }
        return bArrDigest;
    }

    public zzgjv(zzgsw zzgswVar) {
        this.b = zzgswVar;
    }

    public final zzbad d(String str, byte[] bArr) {
        zzbad zzbadVarE = zzbae.E();
        byte[] bArrC = c(bArr);
        jy4 jy4Var = zzifx.b;
        jy4 jy4VarH = zzifx.H(0, bArrC.length, bArrC);
        zzbadVarE.l();
        ((zzbae) zzbadVarE.b).G(jy4VarH);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / 255) + 1) {
                break;
            }
            int i2 = i * 255;
            int i3 = i2 + 255;
            if (length > i3) {
                length = i3;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i2, length));
            i++;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            jy4 jy4VarH2 = zzifx.H(0, 256, b(str, (byte[]) obj, false));
            zzbadVarE.l();
            ((zzbae) zzbadVarE.b).F(jy4VarH2);
        }
        return zzbadVarE;
    }
}
