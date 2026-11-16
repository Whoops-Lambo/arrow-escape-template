package defpackage;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class da1 implements pg0 {
    public static final ba1 f;
    public static final ba1 g;
    public final HashMap a;
    public final HashMap b;
    public final aa1 c;
    public boolean d;
    public static final aa1 e = new aa1(0);
    public static final ca1 h = new ca1();

    /* JADX WARN: Type inference failed for: r0v1, types: [ba1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ba1] */
    static {
        final int i = 0;
        f = new v43() { // from class: ba1
            @Override // defpackage.og0
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((w43) obj2).add((String) obj);
                        break;
                    default:
                        ((w43) obj2).a(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new v43() { // from class: ba1
            @Override // defpackage.og0
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((w43) obj2).add((String) obj);
                        break;
                    default:
                        ((w43) obj2).a(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public final pg0 a(Class cls, sr1 sr1Var) {
        this.a.put(cls, sr1Var);
        this.b.remove(cls);
        return this;
    }

    public da1() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }
}
