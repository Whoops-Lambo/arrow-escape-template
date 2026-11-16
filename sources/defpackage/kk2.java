package defpackage;

import com.explorestack.protobuf.z;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class kk2 extends jk2 {
    public static String A(char[] cArr, int i, int i2) {
        j1 j1Var = n1.Companion;
        int length = cArr.length;
        j1Var.getClass();
        j1.a(i, i2, length);
        return new String(cArr, i, i2 - i);
    }

    public static boolean E(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final void F(String str) {
        throw new NumberFormatException(n30.g('\'', "Invalid number format: '", str));
    }

    public static Long N(String str) {
        boolean z;
        str.getClass();
        ns1.d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (s71.h(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static String B(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, er.a);
    }

    public static boolean C(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.endsWith(str2);
        }
        return str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean G(String str, int i, String str2, int i2, int i3, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static String H(int i, String str) {
        str.getClass();
        if (i >= 0) {
            if (i != 0) {
                int i2 = 1;
                if (i != 1) {
                    int length = str.length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb = new StringBuilder(str.length() * i);
                            if (1 <= i) {
                                while (true) {
                                    sb.append((CharSequence) str);
                                    if (i2 == i) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            return sb.toString();
                        }
                        char cCharAt = str.charAt(0);
                        char[] cArr = new char[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            cArr[i3] = cCharAt;
                        }
                        return new String(cArr);
                    }
                    return "";
                }
                return str.toString();
            }
            return "";
        }
        ak1.n(n30.k("Count 'n' must be non-negative, but was ", i, '.'));
        return null;
    }

    public static String I(String str, String str2, String str3, boolean z) {
        z.r(str, str2, str3);
        int i = 0;
        int iU = dk2.U(str, str2, 0, z);
        if (iU < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = 1;
        if (length >= 1) {
            i2 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, iU);
                sb.append(str3);
                i = iU + length;
                if (iU >= str.length()) {
                    break;
                }
                iU = dk2.U(str, str2, iU + i2, z);
            } while (iU > 0);
            sb.append((CharSequence) str, i, str.length());
            return sb.toString();
        }
        dr0.n();
        return null;
    }

    public static String J(String str, char c, char c2) {
        str.getClass();
        String strReplace = str.replace(c, c2);
        strReplace.getClass();
        return strReplace;
    }

    public static boolean K(int i, String str, boolean z, String str2) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        return G(str, i, str2, 0, str2.length(), z);
    }

    public static boolean L(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.startsWith(str2);
        }
        return G(str, 0, str2, 0, str2.length(), z);
    }

    public static Integer M(String str) {
        boolean z;
        int i;
        int i2;
        str.getClass();
        ns1.d(10);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char cCharAt = str.charAt(0);
            int i4 = -2147483647;
            if (s71.h(cCharAt, 48) < 0) {
                i = 1;
                if (length != 1) {
                    if (cCharAt != '+') {
                        if (cCharAt == '-') {
                            i4 = Integer.MIN_VALUE;
                            z = true;
                        } else {
                            return null;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    return null;
                }
            } else {
                z = false;
                i = 0;
            }
            int i5 = -59652323;
            while (i < length) {
                int iDigit = Character.digit((int) str.charAt(i), 10);
                if (iDigit >= 0) {
                    if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iDigit) {
                        return null;
                    }
                    i3 = i2 - iDigit;
                    i++;
                } else {
                    return null;
                }
            }
            if (z) {
                return Integer.valueOf(i3);
            }
            return Integer.valueOf(-i3);
        }
        return null;
    }
}
