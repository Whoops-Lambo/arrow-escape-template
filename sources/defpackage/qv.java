package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class qv {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final yv f;
    public final Set g;

    public static pv a(l12 l12Var) {
        return new pv(l12Var, new l12[0]);
    }

    public static pv b(Class cls) {
        return new pv(cls, new Class[0]);
    }

    public static qv c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(l12.a(cls));
        for (Class cls2 : clsArr) {
            rd1.e(cls2, "Null interface");
            hashSet.add(l12.a(cls2));
        }
        return new qv(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ov(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    public qv(String str, Set set, Set set2, int i, int i2, yv yvVar, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = yvVar;
        this.g = Collections.unmodifiableSet(set3);
    }
}
