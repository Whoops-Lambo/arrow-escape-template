package defpackage;

import io.p071bidmachine.media3.common.q;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.extractor.d;
import io.p071bidmachine.media3.extractor.e;
import io.p071bidmachine.media3.extractor.f;
import io.p071bidmachine.media3.extractor.g;
import io.p071bidmachine.media3.extractor.h;
import io.p071bidmachine.media3.extractor.n;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g1 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public g1() {
        eb1 eb1Var = new eb1(0);
        eb1Var.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        eb1Var.d = iArr;
        eb1Var.b = -1;
        this.c = eb1Var;
        this.e = new StringBuilder();
    }

    public abstract int B();

    public abstract boolean c();

    public abstract String e();

    public abstract byte f();

    public abstract void h(char c);

    public void n() {
    }

    public abstract CharSequence s();

    public abstract String v(String str, boolean z);

    public abstract int y(int i);

    public static /* synthetic */ void q(g1 g1Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = g1Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        g1Var.p(i, str, str2);
        throw null;
    }

    public static boolean u(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public void A(long j) {
        e eVar = (e) this.e;
        if (eVar == null || eVar.a != j) {
            d dVar = (d) this.c;
            this.e = new e(j, dVar.a.timeUsToTargetTime(j), dVar.c, dVar.d, dVar.e, dVar.f);
        }
    }

    public void F(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strL = l();
                this.b = i;
                if (s71.b(strL, "null")) {
                    p(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strB = at.B(at.f(c));
        int i2 = this.b;
        int i3 = i2 - 1;
        q(this, n30.n("Expected ", strB, ", but had '", (i2 == s().length() || i3 < 0) ? "EOF" : String.valueOf(s().charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.e).append((char) (r(i + 3, charSequence) + (r(i, charSequence) << 12) + (r(i + 1, charSequence) << 8) + (r(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        n();
        if (this.b + 4 < charSequence.length()) {
            return a(this.b, charSequence);
        }
        q(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i, int i2) {
        ((StringBuilder) this.e).append(s(), i, i2);
    }

    public long i() {
        boolean z;
        boolean z2;
        double dPow;
        int iY = y(B());
        int i = 0;
        if (iY >= s().length() || iY == -1) {
            q(this, "EOF", 0, null, 6);
            throw null;
        }
        if (s().charAt(iY) == '\"') {
            iY++;
            if (iY == s().length()) {
                q(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i2 = iY;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        while (true) {
            if (i2 == s().length()) {
                z = z;
                z2 = z3;
                break;
            }
            char cCharAt = s().charAt(i2);
            if ((cCharAt != 'e' && cCharAt != 'E') || z3) {
                z = z;
                if (cCharAt == '-' && z3) {
                    if (i2 == iY) {
                        q(this, "Unexpected symbol '-' in numeric literal", i, null, 6);
                        throw null;
                    }
                    i2++;
                    i3 = i;
                } else if (cCharAt != '+' || !z3) {
                    z2 = z3;
                    if (cCharAt != '-') {
                        if (at.f(cCharAt) != 0) {
                            break;
                        }
                        i2++;
                        int i4 = cCharAt - '0';
                        if (i4 < 0 || i4 >= 10) {
                            q(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 6);
                            throw null;
                        }
                        if (z2) {
                            j = (j * 10) + ((long) i4);
                            z3 = z2;
                        } else {
                            j2 = (j2 * 10) - ((long) i4);
                            if (j2 > 0) {
                                q(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                            z = z;
                            z3 = z2;
                            i = 0;
                        }
                    } else {
                        if (i2 != iY) {
                            q(this, "Unexpected symbol '-' in numeric literal", i, null, 6);
                            throw null;
                        }
                        i2++;
                        z = z;
                        z3 = z2;
                        z4 = true;
                    }
                } else {
                    if (i2 == iY) {
                        q(this, "Unexpected symbol '+' in numeric literal", i, null, 6);
                        throw null;
                    }
                    i2++;
                    z = z;
                    i3 = 1;
                }
            } else {
                if (i2 == iY) {
                    q(this, "Unexpected symbol " + cCharAt + " in numeric literal", i, null, 6);
                    throw null;
                }
                i2++;
                i3 = 1;
                z3 = true;
            }
        }
        boolean z5 = i2 != iY;
        if (iY == i2 || (z4 && iY == i2 - 1)) {
            q(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z) {
            if (!z5) {
                q(this, "EOF", 0, null, 6);
                throw null;
            }
            if (s().charAt(i2) != '\"') {
                q(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i2++;
        }
        this.b = i2;
        if (z2) {
            double d = j2;
            if (i3 == 0) {
                dPow = Math.pow(10.0d, -j);
            } else {
                if (i3 != 1) {
                    io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                q(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                q(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j2 = (long) d2;
        }
        if (z4) {
            return j2;
        }
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        q(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public String j() {
        String str = (String) this.d;
        if (str == null) {
            return e();
        }
        str.getClass();
        this.d = null;
        return str;
    }

    public String k(CharSequence charSequence, int i, int i2) {
        String string;
        StringBuilder sb = (StringBuilder) this.e;
        charSequence.getClass();
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                b(i, i2);
                int iY = y(i2 + 1);
                if (iY == -1) {
                    q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iA = iY + 1;
                char cCharAt2 = s().charAt(iY);
                if (cCharAt2 == 'u') {
                    iA = a(iA, s());
                } else {
                    char c = cCharAt2 < 'u' ? uq.a[cCharAt2] : (char) 0;
                    if (c == 0) {
                        q(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    sb.append(c);
                }
                i = y(iA);
                if (i == -1) {
                    q(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    b(i, i2);
                    i = y(i2);
                    if (i == -1) {
                        q(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                }
                cCharAt = charSequence.charAt(i2);
            }
            i2 = i;
            z = true;
            cCharAt = charSequence.charAt(i2);
        }
        if (z) {
            b(i, i2);
            string = sb.toString();
            sb.setLength(0);
        } else {
            string = C(i, i2);
        }
        this.b = i2 + 1;
        return string;
    }

    public String l() {
        String strC;
        StringBuilder sb = (StringBuilder) this.e;
        String str = (String) this.d;
        if (str != null) {
            str.getClass();
            this.d = null;
            return str;
        }
        int iB = B();
        if (iB >= s().length() || iB == -1) {
            q(this, "EOF", iB, null, 4);
            throw null;
        }
        byte bF = at.f(s().charAt(iB));
        if (bF == 1) {
            return j();
        }
        if (bF != 0) {
            q(this, "Expected beginning of the string, but got " + s().charAt(iB), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (at.f(s().charAt(iB)) == 0) {
            iB++;
            if (iB >= s().length()) {
                b(this.b, iB);
                int iY = y(iB);
                if (iY == -1) {
                    this.b = iB;
                    b(0, 0);
                    String string = sb.toString();
                    sb.setLength(0);
                    return string;
                }
                iB = iY;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            b(i, iB);
            String string2 = sb.toString();
            sb.setLength(0);
            strC = string2;
        } else {
            strC = C(i, iB);
        }
        this.b = iB;
        return strC;
    }

    public int t(n nVar, q qVar) {
        h hVar = (h) this.d;
        while (true) {
            e eVar = (e) this.e;
            a.j(eVar);
            long j = eVar.f;
            long j2 = eVar.g;
            long j3 = eVar.h;
            if (j2 - j <= this.b) {
                this.e = null;
                hVar.onSeekFinished();
                return z(nVar, j, qVar);
            }
            long position = j3 - nVar.getPosition();
            if (position < 0 || position > 262144) {
                return z(nVar, j3, qVar);
            }
            nVar.skipFully((int) position);
            nVar.resetPeekPosition();
            g gVarF = hVar.f(nVar, eVar.b);
            int i = gVarF.a;
            long j4 = gVarF.b;
            long j5 = gVarF.c;
            if (i == -3) {
                this.e = null;
                hVar.onSeekFinished();
                return z(nVar, j3, qVar);
            }
            if (i == -2) {
                eVar.d = j4;
                eVar.f = j5;
                eVar.h = e.a(eVar.b, j4, eVar.e, j5, eVar.g, eVar.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        e32.i("Invalid case");
                        return 0;
                    }
                    long position2 = j5 - nVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        nVar.skipFully((int) position2);
                    }
                    this.e = null;
                    hVar.onSeekFinished();
                    return z(nVar, j5, qVar);
                }
                eVar.e = j4;
                eVar.g = j5;
                eVar.h = e.a(eVar.b, eVar.d, j4, eVar.f, j5, eVar.c);
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) s());
                sb.append("', currentPosition=");
                return h50.l(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public static int z(n nVar, long j, q qVar) {
        if (j == nVar.getPosition()) {
            return 0;
        }
        qVar.a = j;
        return 1;
    }

    public String C(int i, int i2) {
        return s().subSequence(i, i2).toString();
    }

    public boolean D() {
        int iB = B();
        CharSequence charSequenceS = s();
        if (iB < charSequenceS.length() && iB != -1 && charSequenceS.charAt(iB) == ',') {
            this.b++;
            return true;
        }
        return false;
    }

    public boolean E(boolean z) {
        int iY = y(B());
        int length = s().length() - iY;
        if (length >= 4 && iY != -1) {
            for (int i = 0; i < 4; i++) {
                if ("null".charAt(i) == s().charAt(iY + i)) {
                }
            }
            if (length <= 4 || at.f(s().charAt(iY + 4)) != 0) {
                if (z) {
                    this.b = iY + 4;
                }
                return true;
            }
        }
        return false;
    }

    public void d(int i, String str) {
        if (s().length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (s().charAt(i + i2) | ' ')) {
                    q(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                    throw null;
                }
            }
            this.b = str.length() + i;
            return;
        }
        q(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    public byte g(byte b) {
        String strValueOf;
        byte bF = f();
        if (bF != b) {
            String strB = at.B(b);
            int i = this.b;
            int i2 = i - 1;
            if (i != s().length() && i2 >= 0) {
                strValueOf = String.valueOf(s().charAt(i2));
            } else {
                strValueOf = "EOF";
            }
            q(this, n30.n("Expected ", strB, ", but had '", strValueOf, "' instead"), i2, null, 4);
            throw null;
        }
        return bF;
    }

    public String m() {
        String strL = l();
        if (s71.b(strL, "null") && s().charAt(this.b - 1) != '\"') {
            q(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
            throw null;
        }
        return strL;
    }

    public void o() {
        if (f() == 10) {
            return;
        }
        q(this, "Expected EOF after parsing, but had " + s().charAt(this.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void p(int i, String str, String str2) {
        String strConcat;
        str2.getClass();
        if (str2.length() == 0) {
            strConcat = "";
        } else {
            strConcat = "\n".concat(str2);
        }
        StringBuilder sbQ = h50.q(str, " at path: ");
        sbQ.append(((eb1) this.c).h());
        sbQ.append(strConcat);
        throw os2.c(i, s(), sbQ.toString());
    }

    public int r(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        q(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public byte w() {
        CharSequence charSequenceS = s();
        int i = this.b;
        while (true) {
            int iY = y(i);
            if (iY != -1) {
                char cCharAt = charSequenceS.charAt(iY);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                    this.b = iY;
                    return at.f(cCharAt);
                }
                i = iY + 1;
            } else {
                this.b = iY;
                return (byte) 10;
            }
        }
    }

    public String x(boolean z) {
        String strJ;
        byte bW = w();
        if (z) {
            if (bW == 1 || bW == 0) {
                strJ = l();
            } else {
                return null;
            }
        } else {
            if (bW != 1) {
                return null;
            }
            strJ = j();
        }
        this.d = strJ;
        return strJ;
    }

    public g1(f fVar, h hVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = hVar;
        this.b = i;
        this.c = new d(fVar, j, j2, j3, j4, j5);
    }
}
