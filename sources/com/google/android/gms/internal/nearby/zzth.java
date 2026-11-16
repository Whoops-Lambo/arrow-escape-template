package com.google.android.gms.internal.nearby;

import defpackage.t85;
import defpackage.v85;
import defpackage.z85;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzth {
    public static final t85 a;

    public abstract void a(Appendable appendable, byte[] bArr, int i);

    public abstract int b(int i);

    static {
        new v85("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new v85("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new z85("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new z85("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        a = new t85();
    }
}
