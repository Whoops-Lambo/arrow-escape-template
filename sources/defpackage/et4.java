package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class et4 {
    public static final et4 c;
    public static final et4 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (st4.f) {
            d = null;
            c = null;
        } else {
            d = new et4(null, false);
            c = new et4(null, true);
        }
    }

    public et4(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
