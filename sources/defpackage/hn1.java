package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class hn1 {
    public static final HashMap m = qh1.W(new dt1("embedding.weight", "embed.weight"), new dt1("dense1.weight", "fc1.weight"), new dt1("dense2.weight", "fc2.weight"), new dt1("dense3.weight", "fc3.weight"), new dt1("dense1.bias", "fc1.bias"), new dt1("dense2.bias", "fc2.bias"), new dt1("dense3.bias", "fc3.bias"));
    public final pg1 a;
    public final pg1 b;
    public final pg1 c;
    public final pg1 d;
    public final pg1 e;
    public final pg1 f;
    public final pg1 g;
    public final pg1 h;
    public final pg1 i;
    public final pg1 j;
    public final pg1 k;
    public final HashMap l;

    public final pg1 a(pg1 pg1Var, String[] strArr, String str) {
        HashMap map = this.l;
        if (!lz.a.contains(this)) {
            try {
                pg1 pg1VarH = ns1.h(ns1.l(strArr, this.a), this.b);
                ns1.b(pg1VarH, this.e);
                ns1.x(pg1VarH);
                pg1 pg1VarH2 = ns1.h(pg1VarH, this.c);
                ns1.b(pg1VarH2, this.f);
                ns1.x(pg1VarH2);
                pg1 pg1VarV = ns1.v(pg1VarH2, 2);
                pg1 pg1VarH3 = ns1.h(pg1VarV, this.d);
                ns1.b(pg1VarH3, this.g);
                ns1.x(pg1VarH3);
                pg1 pg1VarV2 = ns1.v(pg1VarH, pg1VarH.a[1]);
                pg1 pg1VarV3 = ns1.v(pg1VarV, pg1VarV.a[1]);
                pg1 pg1VarV4 = ns1.v(pg1VarH3, pg1VarH3.a[1]);
                ns1.q(pg1VarV2);
                ns1.q(pg1VarV3);
                ns1.q(pg1VarV4);
                pg1 pg1VarK = ns1.k(ns1.f(new pg1[]{pg1VarV2, pg1VarV3, pg1VarV4, pg1Var}), this.h, this.j);
                ns1.x(pg1VarK);
                pg1 pg1VarK2 = ns1.k(pg1VarK, this.i, this.k);
                ns1.x(pg1VarK2);
                pg1 pg1Var2 = (pg1) map.get(str.concat(".weight"));
                pg1 pg1Var3 = (pg1) map.get(str.concat(".bias"));
                if (pg1Var2 != null && pg1Var3 != null) {
                    pg1 pg1VarK3 = ns1.k(pg1VarK2, pg1Var2, pg1Var3);
                    ns1.y(pg1VarK3);
                    return pg1VarK3;
                }
            } catch (Throwable th) {
                lz.a(this, th);
                return null;
            }
        }
        return null;
    }

    public hn1(HashMap map) {
        Object obj = map.get("embed.weight");
        if (obj != null) {
            this.a = (pg1) obj;
            Object obj2 = map.get("convs.0.weight");
            if (obj2 != null) {
                this.b = ns1.E((pg1) obj2);
                Object obj3 = map.get("convs.1.weight");
                if (obj3 != null) {
                    this.c = ns1.E((pg1) obj3);
                    Object obj4 = map.get("convs.2.weight");
                    if (obj4 != null) {
                        this.d = ns1.E((pg1) obj4);
                        Object obj5 = map.get("convs.0.bias");
                        if (obj5 != null) {
                            this.e = (pg1) obj5;
                            Object obj6 = map.get("convs.1.bias");
                            if (obj6 != null) {
                                this.f = (pg1) obj6;
                                Object obj7 = map.get("convs.2.bias");
                                if (obj7 != null) {
                                    this.g = (pg1) obj7;
                                    Object obj8 = map.get("fc1.weight");
                                    if (obj8 != null) {
                                        this.h = ns1.D((pg1) obj8);
                                        Object obj9 = map.get("fc2.weight");
                                        if (obj9 != null) {
                                            this.i = ns1.D((pg1) obj9);
                                            Object obj10 = map.get("fc1.bias");
                                            if (obj10 != null) {
                                                this.j = (pg1) obj10;
                                                Object obj11 = map.get("fc2.bias");
                                                if (obj11 != null) {
                                                    this.k = (pg1) obj11;
                                                    this.l = new HashMap();
                                                    for (String str : n8.q0(new String[]{jc1.a(1), jc1.a(2)})) {
                                                        String strM = n30.m(str, ".weight");
                                                        String strM2 = n30.m(str, ".bias");
                                                        pg1 pg1Var = (pg1) map.get(strM);
                                                        pg1 pg1Var2 = (pg1) map.get(strM2);
                                                        if (pg1Var != null) {
                                                            this.l.put(strM, ns1.D(pg1Var));
                                                        }
                                                        if (pg1Var2 != null) {
                                                            this.l.put(strM2, pg1Var2);
                                                        }
                                                    }
                                                    return;
                                                }
                                                e32.i("Required value was null.");
                                                throw null;
                                            }
                                            e32.i("Required value was null.");
                                            throw null;
                                        }
                                        e32.i("Required value was null.");
                                        throw null;
                                    }
                                    e32.i("Required value was null.");
                                    throw null;
                                }
                                e32.i("Required value was null.");
                                throw null;
                            }
                            e32.i("Required value was null.");
                            throw null;
                        }
                        e32.i("Required value was null.");
                        throw null;
                    }
                    e32.i("Required value was null.");
                    throw null;
                }
                e32.i("Required value was null.");
                throw null;
            }
            e32.i("Required value was null.");
            throw null;
        }
        e32.i("Required value was null.");
        throw null;
    }
}
