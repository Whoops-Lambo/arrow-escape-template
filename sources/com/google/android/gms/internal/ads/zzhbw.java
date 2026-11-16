package com.google.android.gms.internal.ads;

import defpackage.qs4;
import defpackage.rs4;
import defpackage.ss4;
import defpackage.ts4;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzhbw {
    public static final ss4 a = new ss4("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final ss4 b = new ss4("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    public static final rs4 c;

    public abstract void a(StringBuilder sb, byte[] bArr, int i);

    public abstract int b(byte[] bArr, CharSequence charSequence);

    public abstract int c(int i);

    public abstract int d(int i);

    public CharSequence e(CharSequence charSequence) {
        throw null;
    }

    public final String f(int i, byte[] bArr) {
        zzgvz.k(0, i, bArr.length);
        StringBuilder sb = new StringBuilder(c(i));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            defpackage.d.p(e);
            return null;
        }
    }

    static {
        new ts4("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new ts4("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        c = new rs4(new qs4("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public final byte[] g(String str) {
        try {
            CharSequence charSequenceE = e(str);
            int iD = d(charSequenceE.length());
            byte[] bArr = new byte[iD];
            int iB = b(bArr, charSequenceE);
            if (iB == iD) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (zzhbu e) {
            defpackage.d.n(e);
            return null;
        }
    }
}
