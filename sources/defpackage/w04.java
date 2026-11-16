package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w04 {
    public final Object a;
    public final Object b;
    public final Object c;

    public final IllegalArgumentException a() {
        Object obj = this.a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.b);
        return new IllegalArgumentException(jc1.o(String.valueOf(obj), "=", pv1.r("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(this.c)));
    }

    public w04(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
