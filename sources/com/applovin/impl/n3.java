package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class n3 {
    private final String a;
    private final MaxAdFormat b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        if (!n3Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = n3Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = n3Var.a();
        return maxAdFormatA != null ? maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 == null;
    }

    public static n3 a(String str) {
        String[] strArrSplit = str.split("-");
        return new n3(strArrSplit[0], MaxAdFormat.formatFromString(strArrSplit[1]));
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return this.a + "-" + this.b.getLabel();
    }

    public n3(String str, MaxAdFormat maxAdFormat) {
        this.a = str;
        this.b = maxAdFormat;
    }

    public int hashCode() {
        int iHashCode;
        String strB = b();
        int iHashCode2 = 43;
        if (strB == null) {
            iHashCode = 43;
        } else {
            iHashCode = strB.hashCode();
        }
        MaxAdFormat maxAdFormatA = a();
        int i = (iHashCode + 59) * 59;
        if (maxAdFormatA != null) {
            iHashCode2 = maxAdFormatA.hashCode();
        }
        return i + iHashCode2;
    }

    public MaxAdFormat a() {
        return this.b;
    }

    public boolean a(Object obj) {
        return obj instanceof n3;
    }
}
