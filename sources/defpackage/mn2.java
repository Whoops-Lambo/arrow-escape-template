package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mn2 {
    public a53 A;
    public a53 B;
    public e12 C;
    public final it0 a;
    public final it0 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;
    public int g;
    public yj2 h;
    public yj2 i;
    public String j;
    public yj2 k;
    public yj2 l;
    public yj2 m;
    public int n;
    public Long o;
    public Long p;
    public a53 q;
    public a53 r;
    public a53 s;
    public a53 t;
    public a53 u;
    public a53 v;
    public a53 w;
    public final LinkedHashMap x;
    public a53 y;
    public a53 z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mn2) && s71.b(this.a, ((mn2) obj).a);
    }

    public final yj2 b() {
        int i = this.n;
        LinkedHashMap linkedHashMap = this.x;
        if (!linkedHashMap.isEmpty()) {
            i = Integer.parseInt((String) du.h0(new ArrayList(du.s0(linkedHashMap.keySet(), new zm(11)))));
        }
        return new yj2(i);
    }

    public final void c(yj2 yj2Var) {
        if (yj2Var.a <= 1) {
            throw new nn2("cmpId", yj2Var, null, 4, null);
        }
        this.k = yj2Var;
    }

    public final void d(yj2 yj2Var) throws nn2 {
        if (yj2Var.a <= -1) {
            throw new nn2("cmpVersion", yj2Var, null, 4, null);
        }
        this.l = yj2Var;
    }

    public final void e(yj2 yj2Var) throws nn2 {
        if (yj2Var.a <= -1) {
            throw new nn2("consentScreen", yj2Var, null, 4, null);
        }
        this.h = yj2Var;
    }

    public final void f(yj2 yj2Var) {
        int i = yj2Var.a;
        if (i < 0) {
            throw new nn2("policyVersion", yj2Var, null, 4, null);
        }
        this.i = new yj2(i);
    }

    public final void h(yj2 yj2Var) throws nn2 {
        int i = yj2Var.a;
        if (i < 0) {
            throw new nn2("vendorListVersion", yj2Var, null, 4, null);
        }
        if (i >= 0) {
            this.m = yj2Var;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TCModel(_gvl_=" + this.a + ")";
    }

    public mn2(it0 it0Var) {
        it0Var.getClass();
        this.a = it0Var;
        this.b = it0Var;
        this.c = true;
        this.f = "AA";
        this.g = 2;
        this.h = new yj2(0);
        this.i = new yj2(5);
        this.j = "EN";
        this.k = new yj2(0);
        this.l = new yj2(0);
        this.m = new yj2(0);
        this.q = new a53();
        this.r = new a53();
        this.s = new a53();
        this.t = new a53();
        this.u = new a53();
        this.v = new a53();
        this.w = new a53();
        this.x = new LinkedHashMap();
        this.y = new a53();
        this.z = new a53();
        this.A = new a53();
        this.B = new a53();
        this.C = new e12();
        long jC = new q50().b().c();
        this.p = Long.valueOf(jC);
        this.o = Long.valueOf(jC);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final l7 a(String str) throws nn2 {
        str.getClass();
        switch (str.hashCode()) {
            case -2115730175:
                if (str.equals("vendorConsents")) {
                    return new un2(this.y);
                }
                break;
            case -2076485454:
                if (str.equals("cmpVersion")) {
                    return new tn2(this.l);
                }
                break;
            case -2014745908:
                if (str.equals("numCustomPurposes")) {
                    return new qn2(this.n);
                }
                break;
            case -1710804154:
                if (str.equals("policyVersion")) {
                    return new tn2(this.i);
                }
                break;
            case -879778089:
                if (str.equals("purposeConsents")) {
                    return new un2(this.r);
                }
                break;
            case -740692217:
                if (str.equals("publisherCountryCode")) {
                    return new sn2(this.f);
                }
                break;
            case -442009786:
                if (str.equals("publisherCustomConsents")) {
                    return new un2(this.v);
                }
                break;
            case -145526490:
                if (str.equals("consentScreen")) {
                    return new tn2(this.h);
                }
                break;
            case -117505923:
                if (str.equals("isServiceSpecific")) {
                    return new on2(this.c);
                }
                break;
            case 94785793:
                if (str.equals("cmpId")) {
                    return new tn2(this.k);
                }
                break;
            case 204489283:
                if (str.equals("publisherRestrictions")) {
                    return new rn2(this.C);
                }
                break;
            case 351608024:
                if (str.equals("version")) {
                    return new qn2(this.g);
                }
                break;
            case 439958894:
                if (str.equals("useNonStandardStacks")) {
                    return new on2(this.d);
                }
                break;
            case 501667126:
                if (str.equals("purposeLegitimateInterests")) {
                    return new un2(this.s);
                }
                break;
            case 544050613:
                if (str.equals("publisherConsents")) {
                    return new un2(this.t);
                }
                break;
            case 568283376:
                if (str.equals("purposeOneTreatment")) {
                    return new on2(this.e);
                }
                break;
            case 680983954:
                if (str.equals("consentLanguage")) {
                    return new sn2(this.j);
                }
                break;
            case 1000364236:
                if (str.equals("vendorLegitimateInterests")) {
                    return new un2(this.z);
                }
                break;
            case 1028554472:
                if (str.equals("created")) {
                    return new pn2(this.o);
                }
                break;
            case 1272166759:
                if (str.equals("publisherCustomLegitimateInterests")) {
                    return new un2(this.w);
                }
                break;
            case 1401591704:
                if (str.equals("publisherLegitimateInterests")) {
                    return new un2(this.u);
                }
                break;
            case 1649733957:
                if (str.equals("lastUpdated")) {
                    return new pn2(this.p);
                }
                break;
            case 1722227698:
                if (str.equals("vendorListVersion")) {
                    return new tn2(this.m);
                }
                break;
            case 1886388920:
                if (str.equals("specialFeatureOptins")) {
                    return new un2(this.q);
                }
                break;
            case 1982848911:
                if (str.equals("vendorsDisclosed")) {
                    return new un2(this.A);
                }
                break;
            case 1995874045:
                if (str.equals("vendorsAllowed")) {
                    return new un2(this.B);
                }
                break;
        }
        throw new nn2("Unable to get field from TCModel", str, null, 4, null);
    }

    public final void g(String str) throws nn2 {
        str.getClass();
        Pattern patternCompile = Pattern.compile("^([A-z]){2}$");
        patternCompile.getClass();
        if (patternCompile.matcher(str).matches()) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            this.f = upperCase;
            return;
        }
        throw new nn2("publisherCountryCode", str, null, 4, null);
    }
}
