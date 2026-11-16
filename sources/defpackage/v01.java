package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class v01 {
    public Long a = 0L;
    public Long b;
    public Long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v01.class != obj.getClass()) {
            return false;
        }
        v01 v01Var = (v01) obj;
        return s71.b(this.a, v01Var.a) && s71.b(this.b, v01Var.b) && s71.b(this.c, v01Var.c);
    }

    static {
        p32.a(v01.class);
        try {
            p32.d(v01.class);
        } catch (Throwable unused) {
        }
        if (dk2.Z("TimeoutConfiguration")) {
            d.r("Name can't be blank");
        }
    }

    public static void a(Long l) {
        if (l == null || l.longValue() > 0) {
            return;
        }
        d.r("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS");
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public v01() {
        this.b = 0L;
        this.c = 0L;
        b(null);
        this.b = null;
        this.c = null;
    }

    public final void b(Long l) {
        a(l);
        this.a = l;
    }
}
