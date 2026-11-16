package com.applovin.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class f0 {
    private final String a;
    private final Map b;
    private final Map c;
    private final Map d;
    private final String e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (!f0Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = f0Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        Map mapD = d();
        Map mapD2 = f0Var.d();
        if (mapD != null ? !mapD.equals(mapD2) : mapD2 != null) {
            return false;
        }
        Map mapC = c();
        Map mapC2 = f0Var.c();
        if (mapC != null ? !mapC.equals(mapC2) : mapC2 != null) {
            return false;
        }
        Map mapE = e();
        Map mapE2 = f0Var.e();
        if (mapE != null ? !mapE.equals(mapE2) : mapE2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = f0Var.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public boolean a(Object obj) {
        return obj instanceof f0;
    }

    public String b() {
        return this.a;
    }

    public Map c() {
        return this.c;
    }

    public Map d() {
        return this.b;
    }

    public Map e() {
        return this.d;
    }

    public String toString() {
        return "AxonEventModel(eventName=" + b() + ", parameters=" + d() + ", options=" + c() + ", userData=" + e() + ", errorMessage=" + a() + ")";
    }

    public f0(String str, Map map, Map map2, Map map3, String str2) {
        this.a = str;
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = str2;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        String strB = b();
        int iHashCode5 = 43;
        if (strB == null) {
            iHashCode = 43;
        } else {
            iHashCode = strB.hashCode();
        }
        Map mapD = d();
        int i = (iHashCode + 59) * 59;
        if (mapD == null) {
            iHashCode2 = 43;
        } else {
            iHashCode2 = mapD.hashCode();
        }
        int i2 = i + iHashCode2;
        Map mapC = c();
        int i3 = i2 * 59;
        if (mapC == null) {
            iHashCode3 = 43;
        } else {
            iHashCode3 = mapC.hashCode();
        }
        int i4 = i3 + iHashCode3;
        Map mapE = e();
        int i5 = i4 * 59;
        if (mapE == null) {
            iHashCode4 = 43;
        } else {
            iHashCode4 = mapE.hashCode();
        }
        String strA = a();
        int i6 = (i5 + iHashCode4) * 59;
        if (strA != null) {
            iHashCode5 = strA.hashCode();
        }
        return i6 + iHashCode5;
    }

    public String a() {
        return this.e;
    }
}
