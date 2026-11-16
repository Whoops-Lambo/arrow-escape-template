package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 {
    public static final n0 c;
    public static final n0 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (c1.d) {
            d = null;
            c = null;
        } else {
            d = new n0(null, false);
            c = new n0(null, true);
        }
    }

    public n0(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
