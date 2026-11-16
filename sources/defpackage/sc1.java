package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sc1 {
    public static String b(int i, String str) throws sg0 {
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int iCharAt = ((byte) upperCase.charAt(0)) - 65;
        int iCharAt2 = ((byte) upperCase.charAt(1)) - 65;
        if (iCharAt < 0 || iCharAt > 25 || iCharAt2 < 0 || iCharAt2 > 25) {
            throw new sg0("Invalid Language Code: ".concat(upperCase));
        }
        if (i % 2 == 1) {
            throw new sg0(jc1.k(i, "numBits must be even, ", " is not valid"));
        }
        int i2 = i / 2;
        d71 d71Var = e71.Companion;
        yj2 yj2Var = new yj2(iCharAt);
        d71Var.getClass();
        return d71.b(yj2Var, i2).concat(d71.b(new yj2(iCharAt2), i2));
    }

    public static String a(int i, String str) throws a60 {
        String strSubstring;
        if (i == str.length() && str.length() % 2 == 0) {
            int length = str.length() / 2;
            d71 d71Var = e71.Companion;
            j71 j71Var = new j71(0, length - 1, 1);
            String strSubstring2 = "";
            if (j71Var.isEmpty()) {
                strSubstring = "";
            } else {
                strSubstring = str.substring(0, j71Var.b + 1);
            }
            d71Var.getClass();
            long jA = d71.a(length, strSubstring) + 65;
            j71 j71Var2 = new j71(length, str.length() - 1, 1);
            if (!j71Var2.isEmpty()) {
                strSubstring2 = str.substring(length, j71Var2.b + 1);
            }
            char cA = (char) (d71.a(length, strSubstring2) + 65);
            StringBuilder sb = new StringBuilder();
            sb.append((char) jA);
            sb.append(cA);
            return sb.toString();
        }
        throw new a60("Invalid bit length for language");
    }
}
