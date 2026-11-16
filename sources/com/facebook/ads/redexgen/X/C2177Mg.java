package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2177Mg implements InterfaceC2786eT {
    public static byte[] A07;
    public static String[] A08 = {"up2AOcmrZREHDxdj67mNYlCiqY6MOCkr", "MrVhD", "YB8zrrYuiQdrneSqVSuLE58BIE8o", "a3p0MIH4BRaaoJqPup79hVrU10OeInBc", "7q", "zDKXvav2c0FGmpNau7mYQqRI5RJE", "jjaPw1TJvdRGmbQdEGTa", "Uk14HWnJofQ5Vu8u1YMXRt4ec7aeqrZb"};
    public C2793ea A00;
    public boolean A01;
    public final C2161Lp A02;
    public final SecureRandom A03;
    public final Cipher A04;
    public final SecretKeySpec A05;
    public final boolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{116, 112, 102};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05(HashMap<String, C2785eS> map) throws IOException {
        try {
            C2160Lo c2160LoA03 = this.A02.A03();
            if (this.A00 == null) {
                this.A00 = new C2793ea(c2160LoA03);
            } else {
                this.A00.A00(c2160LoA03);
            }
            C2793ea c2793ea = this.A00;
            DataOutputStream dataOutputStream = new DataOutputStream(c2793ea);
            dataOutputStream.writeInt(2);
            boolean z = this.A06;
            String[] strArr = A08;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A08[0] = "s6X4iwLzIFCe9a27shE2xSLZq3LHRue5";
            dataOutputStream.writeInt(z ? 1 : 0);
            if (this.A06) {
                byte[] bArr = new byte[16];
                ((SecureRandom) N1.A0f(this.A03)).nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    ((Cipher) N1.A0f(this.A04)).init(1, (Key) N1.A0f(this.A05), new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(c2793ea, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(map.size());
            int iA00 = 0;
            for (C2785eS c2785eS : map.values()) {
                A04(c2785eS, dataOutputStream);
                iA00 += A00(c2785eS, 2);
            }
            dataOutputStream.writeInt(iA00);
            this.A02.A06(dataOutputStream);
            N1.A10(null);
            if (A08[3].charAt(6) == 'T') {
                A08[7] = "R5LZO5VIHgrfDlBJEtmXqlugOWywlIRG";
                return;
            }
            String[] strArr2 = A08;
            strArr2[1] = "siPqO";
            strArr2[4] = "eE";
        } catch (Throwable th) {
            N1.A10(null);
            throw th;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(HashMap<String, C2785eS> map, SparseArray<String> sparseArray) {
        if (!this.A02.A07()) {
            return true;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A02.A04());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int i = dataInputStream.readInt();
            if (i < 0 || i > 2) {
                N1.A10(dataInputStream);
                return false;
            }
            int i2 = dataInputStream.readInt() & 1;
            String[] strArr = A08;
            if (strArr[1].length() != strArr[4].length()) {
                A08[3] = "HENQbDXTJbDHz9MUXAcxyEoaFS93HXII";
                if (i2 != 0) {
                    if (this.A04 == null) {
                        N1.A10(dataInputStream);
                        return false;
                    }
                    byte[] bArr = new byte[16];
                    dataInputStream.readFully(bArr);
                    try {
                        this.A04.init(2, (Key) N1.A0f(this.A05), new IvParameterSpec(bArr));
                        dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A04));
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        throw new IllegalStateException(e);
                    }
                } else if (this.A06) {
                    this.A01 = true;
                }
                int i3 = dataInputStream.readInt();
                int iA00 = 0;
                for (int i4 = 0; i4 < i3; i4++) {
                    C2785eS c2785eSA01 = A01(i, dataInputStream);
                    map.put(c2785eSA01.A02, c2785eSA01);
                    sparseArray.put(c2785eSA01.A01, c2785eSA01.A02);
                    iA00 += A00(c2785eSA01, i);
                }
                int i5 = dataInputStream.readInt();
                int i6 = dataInputStream.read();
                if (A08[0].charAt(12) != 'f') {
                    A08[0] = "omDuhpAZ4cJA3bGyTkFBWnjxD6fHcmkv";
                    boolean z = i6 == -1;
                    if (i5 == iA00 && z) {
                        N1.A10(dataInputStream);
                        return true;
                    }
                    N1.A10(dataInputStream);
                    return false;
                }
            }
            throw new RuntimeException();
        } catch (IOException unused) {
            if (0 != 0) {
                N1.A10(null);
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                N1.A10(null);
            }
            throw th;
        }
    }

    static {
        A03();
    }

    public C2177Mg(File file, byte[] bArr, boolean z) {
        AbstractC2159Ln.A08((bArr == null && z) ? false : true);
        Cipher cipherA05 = null;
        SecretKeySpec secretKeySpec = null;
        if (bArr != null) {
            AbstractC2159Ln.A07(bArr.length == 16);
            try {
                cipherA05 = C2787eU.A05();
                secretKeySpec = new SecretKeySpec(bArr, A02(0, 3, 32));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            AbstractC2159Ln.A07(!z);
        }
        this.A06 = z;
        this.A04 = cipherA05;
        this.A05 = secretKeySpec;
        this.A03 = z ? new SecureRandom() : null;
        this.A02 = new C2161Lp(file);
    }

    private int A00(C2785eS c2785eS, int i) {
        int result = c2785eS.A01;
        int i2 = result * 31;
        int result2 = c2785eS.A02.hashCode();
        int result3 = i2 + result2;
        if (i < 2) {
            long jA00 = AbstractC2788eV.A00(c2785eS.A03());
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + c2785eS.A03().hashCode();
    }

    private C2785eS A01(int i, DataInputStream dataInputStream) throws IOException {
        C2176Mf c2176MfA02;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long length = dataInputStream.readLong();
            C2790eX c2790eX = new C2790eX();
            C2790eX.A00(c2790eX, length);
            c2176MfA02 = C2176Mf.A03.A05(c2790eX);
        } else {
            c2176MfA02 = C2787eU.A02(dataInputStream);
        }
        return new C2785eS(i2, utf, c2176MfA02);
    }

    private void A04(C2785eS c2785eS, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(c2785eS.A01);
        dataOutputStream.writeUTF(c2785eS.A02);
        C2787eU.A08(c2785eS.A03(), dataOutputStream);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2786eT
    public final void A6O() {
        this.A02.A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2786eT
    public final boolean A71() {
        return this.A02.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2786eT
    public final void AAt(long j) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2786eT
    public final void ABa(HashMap<String, C2785eS> map, SparseArray<String> idToKey) {
        AbstractC2159Ln.A08(!this.A01);
        if (!A06(map, idToKey)) {
            map.clear();
            idToKey.clear();
            this.A02.A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2786eT
    public final void AGk(C2785eS c2785eS, boolean z) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2786eT
    public final void AHU(C2785eS c2785eS) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2786eT
    public final void ALb(HashMap<String, C2785eS> map) throws IOException {
        A05(map);
        this.A01 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2786eT
    public final void ALc(HashMap<String, C2785eS> map) throws IOException {
        if (!this.A01) {
            return;
        }
        ALb(map);
    }
}
