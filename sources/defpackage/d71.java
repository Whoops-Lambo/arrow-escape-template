package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d71 {
    public static String c(int i, long j) throws sg0 {
        ns1.d(2);
        String string = Long.toString(j, 2);
        string.getClass();
        if (string.length() <= i && j >= 0) {
            return string.length() < i ? n30.m(kk2.H(i - string.length(), "0"), string) : string;
        }
        throw new sg0(j + " too large to encode into " + i);
    }

    public static String b(yj2 yj2Var, int i) throws sg0 {
        Integer numValueOf = yj2Var instanceof yj2 ? Integer.valueOf(yj2Var.a) : null;
        if (numValueOf == null) {
            throw new sg0("Invalid value: " + yj2Var);
        }
        int iIntValue = numValueOf.intValue();
        ns1.d(2);
        String string = Integer.toString(iIntValue, 2);
        string.getClass();
        if (string.length() <= i && numValueOf.intValue() >= 0) {
            return string.length() < i ? n30.m(kk2.H(i - string.length(), "0"), string) : string;
        }
        throw new sg0(yj2Var + " too large to encode into " + i);
    }

    public static long a(int i, String str) throws a60 {
        str.getClass();
        if (i == str.length()) {
            ns1.d(2);
            return Long.parseLong(str, 2);
        }
        throw new a60("Invalid Bit Length");
    }
}
