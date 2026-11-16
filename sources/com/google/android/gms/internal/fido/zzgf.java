package com.google.android.gms.internal.fido;

import defpackage.ak4;
import defpackage.fk4;
import defpackage.kk4;
import defpackage.yj4;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgf {
    public static final ak4 a;

    public abstract void a(StringBuilder sb, byte[] bArr, int i);

    public abstract int b(int i);

    public final String c(int i, byte[] bArr) {
        zzbm.b(0, i, bArr.length);
        StringBuilder sb = new StringBuilder(b(i));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            defpackage.d.p(e);
            return null;
        }
    }

    static {
        new fk4("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new fk4("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new kk4("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new kk4("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        a = new ak4(new yj4("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
