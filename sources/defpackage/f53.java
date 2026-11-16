package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f53 {
    public static a53 a(String str) throws Throwable {
        c53 c53Var;
        int i;
        a53 a53VarA;
        d71 d71Var = e71.Companion;
        String strSubstring = str.substring(0, 16);
        d71Var.getClass();
        int iA = (int) d71.a(16, strSubstring);
        b53 b53Var = c53.Companion;
        int iA2 = (int) d71.a(1, String.valueOf(str.charAt(16)));
        b53Var.getClass();
        c53 c53Var2 = c53.b;
        if (iA2 == 0) {
            c53Var = c53.a;
        } else {
            if (iA2 != 1) {
                throw new Throwable(jc1.k(iA2, "Invalid Value for VectorEncodingType: ", ", valid values are 0 and 1"));
            }
            c53Var = c53Var2;
        }
        if (c53Var == c53Var2) {
            a53VarA = new a53();
            i = 29;
            int iA3 = (int) d71.a(12, str.substring(17, 29));
            for (int i2 = 0; i2 < iA3; i2++) {
                pj pjVar = qj.Companion;
                String strValueOf = String.valueOf(str.charAt(i));
                pjVar.getClass();
                strValueOf.getClass();
                boolean zEquals = strValueOf.equals("1");
                d71 d71Var2 = e71.Companion;
                int i3 = i + 17;
                String strSubstring2 = str.substring(i + 1, i3);
                d71Var2.getClass();
                int iA4 = (int) d71.a(16, strSubstring2);
                if (zEquals) {
                    i += 33;
                    int iA5 = (int) d71.a(16, str.substring(i3, i));
                    if (iA4 <= iA5) {
                        while (true) {
                            a53VarA.d(iA4);
                            if (iA4 != iA5) {
                                iA4++;
                            }
                        }
                    }
                } else {
                    a53VarA.d(iA4);
                    i = i3;
                }
            }
        } else {
            i = 17 + iA;
            String strSubstring3 = str.substring(17, i);
            mo0 mo0Var = no0.Companion;
            Integer numValueOf = Integer.valueOf(iA);
            mo0Var.getClass();
            a53VarA = mo0.a(strSubstring3, numValueOf);
        }
        a53VarA.a = i;
        return a53VarA;
    }

    public static String b(a53 a53Var) throws sg0 {
        boolean z;
        a53Var.getClass();
        ArrayList arrayList = new ArrayList();
        m32 m32Var = new m32();
        m32Var.a = new ArrayList();
        d71 d71Var = e71.Companion;
        yj2 yj2Var = new yj2(a53Var.b);
        d71Var.getClass();
        String strB = d71.b(yj2Var, 16);
        m32 m32Var2 = new m32();
        m32Var2.a = "";
        h32 h32Var = new h32();
        int i = 17 + a53Var.b;
        k32 k32Var = new k32();
        k32Var.a = 29;
        e53 e53Var = new e53(m32Var2, h32Var, a53Var, k32Var, i, m32Var, arrayList);
        for (int i2 = 1; i2 <= a53Var.b; i2++) {
            e53Var.invoke(Boolean.valueOf(a53Var.c(i2)), Integer.valueOf(i2));
        }
        if (h32Var.a) {
            String strConcat = strB.concat("1");
            String strB2 = d71.b(new yj2(arrayList.size()), 12);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                List list = (List) obj;
                if (list.size() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                qj.Companion.getClass();
                String str = ((Object) strB2) + pj.a(!z);
                d71 d71Var2 = e71.Companion;
                yj2 yj2Var2 = new yj2(((Number) list.get(0)).intValue());
                d71Var2.getClass();
                strB2 = ((Object) str) + d71.b(yj2Var2, 16);
                if (!z) {
                    strB2 = ((Object) strB2) + d71.b(new yj2(((Number) list.get(1)).intValue()), 16);
                }
            }
            return strConcat.concat(strB2);
        }
        return strB.concat("0") + m32Var2.a;
    }
}
