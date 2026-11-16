package com.google.android.gms.internal.ads;

import defpackage.jc1;
import defpackage.nj;
import defpackage.pv1;
import defpackage.q63;
import defpackage.yx4;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzifa implements Closeable {
    public final StringReader a;
    public long h;
    public int i;
    public int[] j;
    public String[] l;
    public int[] m;
    public final char[] b = new char[1024];
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int k = 1;

    public final String G() throws zzifd {
        char[] cArr;
        String string;
        int i = 0;
        int i2 = 0;
        StringBuilder sb = null;
        while (true) {
            int i3 = this.c + i2;
            int i4 = this.d;
            cArr = this.b;
            if (i3 < i4) {
                char c = cArr[i3];
                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                    if (c != '#') {
                        if (c != ',') {
                            if (c != '/' && c != '=') {
                                if (c != '{' && c != '}' && c != ':') {
                                    if (c != ';') {
                                        switch (c) {
                                            case '[':
                                            case ']':
                                                break;
                                            case '\\':
                                                break;
                                            default:
                                                i2++;
                                                continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    R();
                    throw null;
                }
                i = i2;
            } else if (i2 >= 1024) {
                if (sb == null) {
                    sb = new StringBuilder(Math.max(i2, 16));
                }
                sb.append(cArr, this.c, i2);
                this.c += i2;
                if (L(1)) {
                    i2 = 0;
                }
            } else if (!L(i2 + 1)) {
                i = i2;
            }
        }
        int i5 = this.c;
        if (sb == null) {
            string = new String(cArr, i5, i);
        } else {
            sb.append(cArr, i5, i);
            string = sb.toString();
        }
        this.c += i;
        return string;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.g = 0;
        this.j[0] = 8;
        this.k = 1;
        this.a.close();
    }

    public final String t(char c) throws zzifd {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.c;
            int i3 = this.d;
            int i4 = i2;
            while (true) {
                cArr = this.b;
                if (i2 < i3) {
                    int i5 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        int i6 = (i5 - i4) - 1;
                        this.c = i5;
                        if (sb == null) {
                            return new String(cArr, i4, i6);
                        }
                        sb.append(cArr, i4, i6);
                        return sb.toString();
                    }
                    char c3 = '\n';
                    if (c2 == '\\') {
                        int i7 = i5 - i4;
                        int i8 = i7 - 1;
                        this.c = i5;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i7 + i7, 16));
                        }
                        sb.append(cArr, i4, i8);
                        if (this.c == this.d && !L(1)) {
                            T("Unterminated escape sequence");
                            throw null;
                        }
                        int i9 = this.c;
                        int i10 = i9 + 1;
                        this.c = i10;
                        char c4 = cArr[i9];
                        if (c4 != '\n') {
                            if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
                                if (c4 == 'b') {
                                    c3 = '\b';
                                } else if (c4 == 'f') {
                                    c3 = '\f';
                                } else if (c4 != 'n') {
                                    if (c4 == 'r') {
                                        c3 = '\r';
                                    } else if (c4 == 't') {
                                        c3 = '\t';
                                    } else {
                                        if (c4 != 'u') {
                                            T("Invalid escape sequence");
                                            throw null;
                                        }
                                        if (i9 + 5 > this.d && !L(4)) {
                                            T("Unterminated escape sequence");
                                            throw null;
                                        }
                                        int i11 = this.c;
                                        int i12 = i11 + 4;
                                        int i13 = 0;
                                        while (i11 < i12) {
                                            int i14 = i13 << 4;
                                            char c5 = cArr[i11];
                                            if (c5 >= '0' && c5 <= '9') {
                                                i = c5 - '0';
                                            } else if (c5 >= 'a' && c5 <= 'f') {
                                                i = c5 - 'W';
                                            } else {
                                                if (c5 < 'A' || c5 > 'F') {
                                                    T("Malformed Unicode escape \\u".concat(new String(cArr, this.c, 4)));
                                                    throw null;
                                                }
                                                i = c5 - '7';
                                            }
                                            i13 = i + i14;
                                            i11++;
                                        }
                                        this.c += 4;
                                        c3 = (char) i13;
                                    }
                                }
                            }
                            sb.append(c3);
                            i4 = this.c;
                            i3 = this.d;
                            i2 = i4;
                        } else {
                            this.e++;
                            this.f = i10;
                        }
                        c3 = c4;
                        sb.append(c3);
                        i4 = this.c;
                        i3 = this.d;
                        i2 = i4;
                    } else {
                        if (c2 == '\n') {
                            this.e++;
                            this.f = i5;
                        }
                        i2 = i5;
                    }
                }
            }
            int i15 = i2 - i4;
            if (sb == null) {
                sb = new StringBuilder(Math.max(i15 + i15, 16));
            }
            sb.append(cArr, i4, i15);
            this.c = i2;
        } while (L(1));
        T("Unterminated string");
        throw null;
    }

    static {
        new yx4();
    }

    public final void K(int i) throws zzifd {
        int i2 = this.k;
        if (i2 - 1 >= 1280) {
            String strO = o();
            throw new zzifd(nj.q(new StringBuilder(strO.length() + 26), "Nesting limit 1280 reached", strO));
        }
        int[] iArr = this.j;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.j = Arrays.copyOf(iArr, i3);
            this.m = Arrays.copyOf(this.m, i3);
            this.l = (String[]) Arrays.copyOf(this.l, i3);
        }
        int[] iArr2 = this.j;
        int i4 = this.k;
        this.k = i4 + 1;
        iArr2[i4] = i;
    }

    public final boolean L(int i) throws IOException {
        int i2;
        int i3 = this.f;
        int i4 = this.c;
        this.f = i3 - i4;
        int i5 = this.d;
        char[] cArr = this.b;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.d = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.d = 0;
        }
        this.c = 0;
        do {
            int i7 = this.d;
            int i8 = this.a.read(cArr, i7, 1024 - i7);
            if (i8 == -1) {
                return false;
            }
            i2 = this.d + i8;
            this.d = i2;
            if (this.e == 0 && this.f == 0 && i2 > 0 && cArr[0] == 65279) {
                this.c++;
                this.f = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final int N(boolean z) throws IOException {
        int i = this.c;
        int i2 = this.d;
        while (true) {
            if (i == i2) {
                this.c = i;
                if (!L(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(o()));
                    }
                    return -1;
                }
                i = this.c;
                i2 = this.d;
            }
            int i3 = i + 1;
            char c = this.b[i];
            if (c == '\n') {
                this.e++;
                this.f = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c != '/') {
                    if (c != '#') {
                        this.c = i3;
                        return c;
                    }
                    this.c = i3;
                    R();
                    throw null;
                }
                this.c = i3;
                if (i3 == i2) {
                    this.c = i;
                    boolean zL = L(2);
                    this.c++;
                    if (!zL) {
                        return 47;
                    }
                }
                R();
                throw null;
            }
            i = i3;
        }
    }

    public final void R() throws zzifd {
        T("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void T(String str) throws zzifd {
        String strO = o();
        throw new zzifd(jc1.o(str, strO, new StringBuilder(str.length() + strO.length() + 79), "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0151  */
    /* JADX WARN: Code duplicated, block: B:103:0x0155  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x01dc A[DONT_INVERT, PHI: r7
  0x01dc: PHI (r7v23 int) = (r7v10 int), (r7v26 int) binds: [B:142:0x01b4, B:148:0x01c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x01de  */
    /* JADX WARN: Code duplicated, block: B:173:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:175:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:178:0x0201  */
    /* JADX WARN: Code duplicated, block: B:183:0x020c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:184:0x020d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0217  */
    /* JADX WARN: Code duplicated, block: B:188:0x021b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0221 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:236:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0121  */
    /* JADX WARN: Code duplicated, block: B:92:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:0x013b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0145  */
    /* JADX WARN: Code duplicated, block: B:99:0x0149 A[PHI: r1 r3
  0x0149: PHI (r1v27 int) = (r1v26 int), (r1v41 int) binds: [B:91:0x0131, B:98:0x0145] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r3v8 int) = (r3v7 int), (r3v9 int) binds: [B:91:0x0131, B:98:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c9, code lost:
    
        if (r6 == 0) goto L156;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzifa.d():int");
    }

    public final String k() throws IOException {
        String str;
        int iD = this.g;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 10) {
            str = G();
        } else if (iD == 8) {
            str = t('\'');
        } else if (iD == 9) {
            str = t('\"');
        } else if (iD == 11) {
            str = null;
        } else if (iD == 15) {
            str = Long.toString(this.h);
        } else {
            if (iD != 16) {
                throw U("a string");
            }
            str = new String(this.b, this.c, this.i);
            this.c += this.i;
        }
        this.g = 0;
        int[] iArr = this.m;
        int i = this.k - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public final String o() {
        int i = this.e + 1;
        int i2 = this.c - this.f;
        StringBuilder sb = new StringBuilder("$");
        for (int i3 = 0; i3 < this.k; i3++) {
            int i4 = this.j[i3];
            switch (i4) {
                case 1:
                case 2:
                    int i5 = this.m[i3];
                    sb.append('[');
                    sb.append(i5);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.l[i3];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    defpackage.d.p(pv1.l(i4, "Unknown scope value: ", new StringBuilder(String.valueOf(i4).length() + 21)));
                    return null;
            }
        }
        int i6 = i2 + 1;
        String string = sb.toString();
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i6).length();
        StringBuilder sb2 = new StringBuilder(string.length() + length2 + length + 17 + 6);
        pv1.s(i, i6, " at line ", " column ", sb2);
        return nj.q(sb2, " path ", string);
    }

    public final int q() throws IOException {
        int iD = this.g;
        if (iD == 0) {
            iD = d();
        }
        switch (iD) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final boolean r(char c) throws zzifd {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        R();
        throw null;
    }

    public final String toString() {
        return "zzifa".concat(o());
    }

    public zzifa(StringReader stringReader) {
        int[] iArr = new int[32];
        this.j = iArr;
        iArr[0] = 6;
        this.l = new String[32];
        this.m = new int[32];
        this.a = stringReader;
    }

    public final IllegalStateException U(String str) throws IOException {
        String str2;
        int iQ = q();
        String strA = zzifb.a(q());
        String strO = o();
        int iA = q63.a(str.length() + 18, strO.length(), strA);
        if (iQ == 9) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2);
        StringBuilder sb = new StringBuilder(strConcat.length() + iA + 5);
        q63.y(sb, "Expected ", str, " but was ", strA);
        return new IllegalStateException(jc1.o(strO, "\nSee ", sb, strConcat));
    }
}
