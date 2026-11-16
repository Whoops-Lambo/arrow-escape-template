package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class e3 {
    private final String a;
    private final MaxAdFormat b;
    private final Map c;
    private final Map d;
    private final Map e;
    private final h f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        if (!e3Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = e3Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = e3Var.a();
        if (maxAdFormatA != null ? !maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 != null) {
            return false;
        }
        Map mapE = e();
        Map mapE2 = e3Var.e();
        if (mapE != null ? !mapE.equals(mapE2) : mapE2 != null) {
            return false;
        }
        Map mapD = d();
        Map mapD2 = e3Var.d();
        if (mapD != null ? !mapD.equals(mapD2) : mapD2 != null) {
            return false;
        }
        Map mapC = c();
        Map mapC2 = e3Var.c();
        if (mapC != null ? !mapC.equals(mapC2) : mapC2 != null) {
            return false;
        }
        h hVarF = f();
        h hVarF2 = e3Var.f();
        return hVarF != null ? hVarF.equals(hVarF2) : hVarF2 == null;
    }

    public boolean a(Object obj) {
        return obj instanceof e3;
    }

    public String b() {
        return this.a;
    }

    public Map c() {
        return this.e;
    }

    public Map d() {
        return this.d;
    }

    public Map e() {
        return this.c;
    }

    public h f() {
        return this.f;
    }

    public String toString() {
        return "MediatedAdRequestParameters(adUnitId=" + b() + ", adFormat=" + a() + ")";
    }

    public e3(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, h hVar) {
        this.a = str;
        this.b = maxAdFormat;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = hVar;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        String strB = b();
        int iHashCode6 = 43;
        if (strB == null) {
            iHashCode = 43;
        } else {
            iHashCode = strB.hashCode();
        }
        MaxAdFormat maxAdFormatA = a();
        int i = (iHashCode + 59) * 59;
        if (maxAdFormatA == null) {
            iHashCode2 = 43;
        } else {
            iHashCode2 = maxAdFormatA.hashCode();
        }
        int i2 = i + iHashCode2;
        Map mapE = e();
        int i3 = i2 * 59;
        if (mapE == null) {
            iHashCode3 = 43;
        } else {
            iHashCode3 = mapE.hashCode();
        }
        int i4 = i3 + iHashCode3;
        Map mapD = d();
        int i5 = i4 * 59;
        if (mapD == null) {
            iHashCode4 = 43;
        } else {
            iHashCode4 = mapD.hashCode();
        }
        int i6 = i5 + iHashCode4;
        Map mapC = c();
        int i7 = i6 * 59;
        if (mapC == null) {
            iHashCode5 = 43;
        } else {
            iHashCode5 = mapC.hashCode();
        }
        h hVarF = f();
        int i8 = (i7 + iHashCode5) * 59;
        if (hVarF != null) {
            iHashCode6 = hVarF.hashCode();
        }
        return i8 + iHashCode6;
    }

    public MaxAdFormat a() {
        return this.b;
    }
}
