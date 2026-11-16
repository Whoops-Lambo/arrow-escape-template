package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f52 {
    public static g52 a(int i) throws Throwable {
        if (i == 0) {
            return g52.NOT_ALLOWED;
        }
        if (i == 1) {
            return g52.REQUIRE_CONSENT;
        }
        if (i == 2) {
            return g52.REQUIRE_LI;
        }
        throw new Throwable(pv1.k(i, "Invalid Value for RestrictionType: "));
    }
}
