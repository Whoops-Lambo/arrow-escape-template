package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w34 {
    public static final w34 c;
    public static final w34 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (n44.f) {
            d = null;
            c = null;
        } else {
            d = new w34(null, false);
            c = new w34(null, true);
        }
    }

    public w34(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
