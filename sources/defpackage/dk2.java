package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class dk2 extends kk2 {
    public static String q0(String str, String str2, String str3) {
        int iX = X(str, str2, 0, false, 6);
        return iX == -1 ? str3 : str.substring(str2.length() + iX, str.length());
    }

    public static String u0(String str, String str2) {
        int iX = X(str, str2, 0, false, 6);
        return iX == -1 ? str : str.substring(0, iX);
    }

    public static final int V(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        h71 h71Var;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iT = T(charSequence);
            if (i3 > iT) {
                i3 = iT;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            h71Var = new h71(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            h71Var = new j71(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = h71Var.c;
        int i6 = h71Var.b;
        int i7 = h71Var.a;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    if (kk2.G(str, 0, (String) charSequence, i8, str.length(), z)) {
                        return i8;
                    }
                    if (i8 != i6) {
                        i8 += i5;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!f0(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    public static int W(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? Y(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int X(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return U(charSequence, str, i, z);
    }

    public static int a0(int i, CharSequence charSequence, String str) {
        int iT = (i & 2) != 0 ? T(charSequence) : 0;
        charSequence.getClass();
        str.getClass();
        return !(charSequence instanceof String) ? V(charSequence, str, iT, 0, false, true) : ((String) charSequence).lastIndexOf(str, iT);
    }

    public static int b0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = T(charSequence);
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(n8.l0(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (ns1.m(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static final List c0(String str) {
        he1 he1Var = new he1(str);
        if (!he1Var.hasNext()) {
            return gg0.a;
        }
        Object next = he1Var.next();
        if (!he1Var.hasNext()) {
            return eu.y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (he1Var.hasNext()) {
            arrayList.add(he1Var.next());
        }
        return arrayList;
    }

    public static final void j0(int i) {
        if (i >= 0) {
            return;
        }
        ak1.n(pv1.k(i, "Limit must be non-negative, but was "));
    }

    public static List m0(CharSequence charSequence, char[] cArr, int i) {
        int i2 = 2;
        int i3 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (cArr.length == 1) {
            return l0(i3, charSequence, String.valueOf(cArr[0]));
        }
        j0(i3);
        o8 o8Var = new o8(new ob0(charSequence, i3, new x62(cArr, i2)), i2);
        ArrayList arrayList = new ArrayList(eu.f(o8Var, 10));
        Iterator it = o8Var.iterator();
        while (true) {
            nb0 nb0Var = (nb0) it;
            if (!nb0Var.hasNext()) {
                return arrayList;
            }
            j71 j71Var = (j71) nb0Var.next();
            j71Var.getClass();
            arrayList.add(charSequence.subSequence(j71Var.a, j71Var.b + 1).toString());
        }
    }

    public static List n0(CharSequence charSequence, String[] strArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return l0(i, charSequence, str);
            }
        }
        j0(i);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        o8 o8Var = new o8(new ob0(charSequence, i, new x62(listAsList, 3)), 2);
        ArrayList arrayList = new ArrayList(eu.f(o8Var, 10));
        Iterator it = o8Var.iterator();
        while (true) {
            nb0 nb0Var = (nb0) it;
            if (!nb0Var.hasNext()) {
                return arrayList;
            }
            j71 j71Var = (j71) nb0Var.next();
            j71Var.getClass();
            arrayList.add(charSequence.subSequence(j71Var.a, j71Var.b + 1).toString());
        }
    }

    public static boolean O(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (X(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (V(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean P(CharSequence charSequence, char c) {
        charSequence.getClass();
        if (W(charSequence, c, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static String Q(String str) {
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return w0(length, str);
    }

    public static boolean R(String str, char c) {
        if (str.length() <= 0 || !ns1.m(str.charAt(str.length() - 1), c, false)) {
            return false;
        }
        return true;
    }

    public static boolean S(String str, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence instanceof String) {
            return kk2.C((String) charSequence, str, false);
        }
        return f0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int T(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static final int U(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return V(charSequence, str, i, charSequence.length(), z, false);
    }

    public static final int Y(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(n8.l0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (ns1.m(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i != length) {
                i++;
            } else {
                return -1;
            }
        }
    }

    public static boolean Z(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ns1.t(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String d0(String str, int i, char c) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i >= 0) {
            if (i <= str.length()) {
                charSequenceSubSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                sb.append((CharSequence) str);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append(c);
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                charSequenceSubSequence = sb;
            }
            return charSequenceSubSequence.toString();
        }
        d.r(jc1.k(i, "Desired length ", " is less than zero."));
        return null;
    }

    public static String e0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i >= 0) {
            if (i <= str.length()) {
                charSequenceSubSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append('0');
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                sb.append((CharSequence) str);
                charSequenceSubSequence = sb;
            }
            return charSequenceSubSequence.toString();
        }
        d.r(jc1.k(i, "Desired length ", " is less than zero."));
        return null;
    }

    public static final boolean f0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ns1.m(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String g0(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (o0(str, str2, false)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public static String h0(String str, String str2) {
        if (S(str2, str)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    public static String i0(String str) {
        str.getClass();
        if (str.length() >= 2 && o0(str, "\"", false) && S("\"", str)) {
            return jc1.j(1, 1, str);
        }
        return str;
    }

    public static StringBuilder k0(CharSequence charSequence) {
        charSequence.getClass();
        return new StringBuilder(charSequence).reverse();
    }

    public static final List l0(int i, CharSequence charSequence, String str) {
        boolean z;
        j0(i);
        int iU = U(charSequence, str, 0, false);
        if (iU != -1 && i != 1) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = 10;
            if (z && i <= 10) {
                i2 = i;
            }
            ArrayList arrayList = new ArrayList(i2);
            int length = 0;
            do {
                arrayList.add(charSequence.subSequence(length, iU).toString());
                length = str.length() + iU;
                if (z && arrayList.size() == i - 1) {
                    break;
                }
                iU = U(charSequence, str, length, false);
            } while (iU != -1);
            arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
            return arrayList;
        }
        return eu.y(charSequence.toString());
    }

    public static boolean o0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return kk2.L((String) charSequence, (String) charSequence2, false);
        }
        return f0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static boolean p0(String str, char c) {
        str.getClass();
        if (str.length() <= 0 || !ns1.m(str.charAt(0), c, false)) {
            return false;
        }
        return true;
    }

    public static String r0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iB0 = b0(str, c, 0, 6);
        if (iB0 == -1) {
            return str2;
        }
        return str.substring(iB0 + 1, str.length());
    }

    public static String s0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iA0 = a0(6, str, str2);
        if (iA0 == -1) {
            return str;
        }
        return str.substring(str2.length() + iA0, str.length());
    }

    public static String t0(String str, char c) {
        str.getClass();
        str.getClass();
        int iW = W(str, c, 0, 6);
        if (iW == -1) {
            return str;
        }
        return str.substring(0, iW);
    }

    public static String v0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iA0 = a0(6, str, str2);
        if (iA0 == -1) {
            return str;
        }
        return str.substring(0, iA0);
    }

    public static String w0(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        ak1.n(jc1.k(i, "Requested character count ", " is less than zero."));
        return null;
    }

    public static Boolean x0(String str) {
        str.getClass();
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence y0(CharSequence charSequence) {
        int i;
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean zT = ns1.t(charSequence.charAt(i));
            if (!z) {
                if (!zT) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!zT) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static String z0(String str, char... cArr) {
        int i;
        boolean z;
        str.getClass();
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            char cCharAt = str.charAt(i);
            int length2 = cArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    if (cCharAt == cArr[i3]) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else {
                if (!z) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }
}
