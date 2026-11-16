package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ju {
    public static final String a(ju juVar, int i) {
        juVar.getClass();
        ns1.d(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return dk2.e0(2, string);
    }

    public static ku b(String str) {
        str.getClass();
        if (dk2.p0(str, '#')) {
            str = str.substring(1);
        }
        String strSubstring = str.substring(0, 2);
        String strSubstring2 = str.substring(2, 4);
        String strSubstring3 = str.substring(4, 6);
        ns1.d(16);
        int i = Integer.parseInt(strSubstring, 16);
        ns1.d(16);
        int i2 = Integer.parseInt(strSubstring3, 16);
        ns1.d(16);
        return new ku(i, i2, Integer.parseInt(strSubstring2, 16));
    }
}
