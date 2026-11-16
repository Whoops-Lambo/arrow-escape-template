package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ry0 {
    public final nq a;
    public int b;
    public int c;
    public vw0 d;

    public final void d() {
        this.b = 0;
        this.c = 0;
        tk tkVar = sy0.b;
        tkVar.E(this.d);
        this.d = (vw0) tkVar.e0();
    }

    public final lq a(String str) {
        if (this.b == 0) {
            return null;
        }
        int i = cr.a;
        int iAbs = Math.abs(cr.a(str, 0, str.length()));
        int i2 = this.c;
        while (true) {
            int i3 = iAbs % i2;
            int i4 = i3 * 6;
            if (this.d.a(i4) == -1) {
                return null;
            }
            if (b(i4, str)) {
                return (lq) this.a.subSequence(this.d.a(i4 + 3), this.d.a(i4 + 4));
            }
            iAbs = i3 + 1;
            i2 = this.c;
        }
    }

    public final boolean b(int i, CharSequence charSequence) {
        int iA = this.d.a(i + 1);
        int iA2 = this.d.a(i + 2);
        int i2 = cr.a;
        nq nqVar = this.a;
        nqVar.getClass();
        if (iA2 - iA != charSequence.length()) {
            return false;
        }
        for (int i3 = iA; i3 < iA2; i3++) {
            int iCharAt = nqVar.charAt(i3);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            int iCharAt2 = charSequence.charAt(i3 - iA);
            if (65 <= iCharAt2 && iCharAt2 < 91) {
                iCharAt2 += 32;
            }
            if (iCharAt != iCharAt2) {
                return false;
            }
        }
        return true;
    }

    public final void c(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.b;
        double d = i6;
        int i7 = this.c;
        if (d >= ((double) i7) * 0.75d) {
            vw0 vw0Var = this.d;
            this.b = 0;
            this.c = (i7 * 2) | 128;
            vw0 vw0Var2 = (vw0) sy0.b.e0();
            int size = (vw0Var.a.size() * 2) | 1;
            for (int i8 = 0; i8 < size; i8++) {
                vw0Var2.a.add(sy0.a.e0());
            }
            this.d = vw0Var2;
            m92 m92VarT = at.t(new uw0(vw0Var, null));
            while (m92VarT.hasNext()) {
                int iIntValue = ((Number) m92VarT.next()).intValue();
                c(vw0Var.a(iIntValue + 1), vw0Var.a(iIntValue + 2), vw0Var.a(iIntValue + 3), vw0Var.a(iIntValue + 4));
            }
            sy0.b.E(vw0Var);
            if (i6 != this.b) {
                d.r("Failed requirement.");
                return;
            }
        }
        nq nqVar = this.a;
        int iAbs = Math.abs(cr.a(nqVar, i, i2));
        CharSequence charSequenceSubSequence = nqVar.subSequence(i, i2);
        int i9 = iAbs % this.c;
        int i10 = -1;
        while (true) {
            i5 = i9 * 6;
            if (this.d.a(i5) == -1) {
                break;
            }
            if (b(i5, charSequenceSubSequence)) {
                i10 = i9;
            }
            i9 = (i9 + 1) % this.c;
        }
        this.d.b(i5, iAbs);
        this.d.b(i5 + 1, i);
        this.d.b(i5 + 2, i2);
        this.d.b(i5 + 3, i3);
        this.d.b(i5 + 4, i4);
        this.d.b(i5 + 5, -1);
        if (i10 != -1) {
            this.d.b((i10 * 6) + 5, i9);
        }
        this.b++;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        tk tkVar = sy0.a;
        vw0 vw0Var = this.d;
        vw0Var.getClass();
        m92 m92VarT = at.t(new uw0(vw0Var, null));
        while (m92VarT.hasNext()) {
            int iIntValue = ((Number) m92VarT.next()).intValue();
            sb.append((CharSequence) "");
            int iA = this.d.a(iIntValue + 1);
            int iA2 = this.d.a(iIntValue + 2);
            nq nqVar = this.a;
            sb.append(nqVar.subSequence(iA, iA2));
            sb.append((CharSequence) " => ");
            sb.append(nqVar.subSequence(this.d.a(iIntValue + 3), this.d.a(iIntValue + 4)));
            sb.append((CharSequence) "\n");
        }
        return sb.toString();
    }

    public ry0(nq nqVar) {
        nqVar.getClass();
        this.a = nqVar;
        this.d = (vw0) sy0.b.e0();
    }
}
