package com.applovin.impl;

import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class t2 {
    private String a;
    private String b;
    private int c;
    private int d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        private String a;
        private String b;
        private int c;
        private int d;

        public t2 a() {
            return new t2(this.a, this.b, this.c, this.d);
        }

        public a b(int i) {
            this.c = i;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=");
            sb.append(this.a);
            sb.append(", signature=");
            sb.append(this.b);
            sb.append(", responseCode=");
            sb.append(this.c);
            sb.append(", nonce=");
            return nj.l(this.d, ")", sb);
        }

        public a b(String str) {
            this.a = str;
            return this;
        }

        public a a(int i) {
            this.d = i;
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        if (!t2Var.a(this) || c() != t2Var.c() || b() != t2Var.b()) {
            return false;
        }
        String strE = e();
        String strE2 = t2Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = t2Var.d();
        return strD != null ? strD.equals(strD2) : strD2 == null;
    }

    public static a a() {
        return new a();
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + ")";
    }

    public t2(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public int hashCode() {
        int iHashCode;
        int iB = b() + ((c() + 59) * 59);
        String strE = e();
        int i = iB * 59;
        int iHashCode2 = 43;
        if (strE == null) {
            iHashCode = 43;
        } else {
            iHashCode = strE.hashCode();
        }
        String strD = d();
        int i2 = (i + iHashCode) * 59;
        if (strD != null) {
            iHashCode2 = strD.hashCode();
        }
        return i2 + iHashCode2;
    }

    public boolean a(Object obj) {
        return obj instanceof t2;
    }
}
