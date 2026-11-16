package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jp4 extends ip4 {
    public final char a;

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.a;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return jc1.o("CharMatcher.is('", strCopyValueOf, new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "')");
    }

    @Override // com.google.android.gms.internal.ads.zzgvn
    public final boolean a(char c) {
        return c == this.a;
    }

    public jp4(char c) {
        this.a = c;
    }
}
