package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a0 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final boolean g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!a0Var.a((Object) this)) {
            return false;
        }
        String strB = b();
        String strB2 = a0Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strC = c();
        String strC2 = a0Var.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        String strE = e();
        String strE2 = a0Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = a0Var.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.c;
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.a.equals("applovin.com");
    }

    public boolean h() {
        return this.g;
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public a0(String str, int i) {
        boolean z;
        this.e = str;
        this.f = i;
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != 3 && strArrSplit.length != 4) {
            z = false;
        } else {
            z = true;
        }
        this.g = z;
        if (z) {
            this.a = a(strArrSplit[0]);
            this.b = a(strArrSplit[1]);
            this.c = a(strArrSplit[2]);
            this.d = strArrSplit.length == 4 ? a(strArrSplit[3]) : "";
            return;
        }
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    public boolean a(a0 a0Var) {
        if (a0Var.b().equals(this.a) && a0Var.c().equals(this.b) && a0Var.e().equals(this.c)) {
            if (a0Var.a().equals("")) {
                return true;
            }
            return a0Var.a().equals(this.d);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        String strB = b();
        int iHashCode4 = 43;
        if (strB == null) {
            iHashCode = 43;
        } else {
            iHashCode = strB.hashCode();
        }
        String strC = c();
        int i = (iHashCode + 59) * 59;
        if (strC == null) {
            iHashCode2 = 43;
        } else {
            iHashCode2 = strC.hashCode();
        }
        int i2 = i + iHashCode2;
        String strE = e();
        int i3 = i2 * 59;
        if (strE == null) {
            iHashCode3 = 43;
        } else {
            iHashCode3 = strE.hashCode();
        }
        String strA = a();
        int i4 = (i3 + iHashCode3) * 59;
        if (strA != null) {
            iHashCode4 = strA.hashCode();
        }
        return i4 + iHashCode4;
    }

    public String a() {
        return this.d;
    }

    public boolean a(Object obj) {
        return obj instanceof a0;
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public a0(String str) {
        this(str, -1);
    }
}
