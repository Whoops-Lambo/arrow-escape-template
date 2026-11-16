package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mo0 {
    public static a53 a(String str, Integer num) throws a60 {
        if (str.length() == num.intValue()) {
            a53 a53Var = new a53();
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                i++;
                qj.Companion.getClass();
                if (cCharAt == '1') {
                    a53Var.d(i);
                }
            }
            a53Var.a = str.length();
            return a53Var;
        }
        throw new a60("bitfield encoding length mismatch");
    }

    public static String b(a53 a53Var, Integer num) {
        int iIntValue;
        a53Var.getClass();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = a53Var.b;
        }
        StringBuilder sb = new StringBuilder();
        int i = 1;
        if (1 <= iIntValue) {
            while (true) {
                pj pjVar = qj.Companion;
                boolean zC = a53Var.c(i);
                pjVar.getClass();
                sb.append(pj.a(zC));
                if (i == iIntValue) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }
}
