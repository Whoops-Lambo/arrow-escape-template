package io.p071bidmachine.analytics.internal.p078g;

import defpackage.e80;
import defpackage.h50;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final a e;
    private final h f;
    private final boolean g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.g.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class C1581a implements a {
            private final String a;
            private final String b;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1581a)) {
                    return false;
                }
                C1581a c1581a = (C1581a) obj;
                return s71.b(this.a, c1581a.a) && s71.b(this.b, c1581a.b);
            }

            public final String a() {
                return this.b;
            }

            public final String b() {
                return this.a;
            }

            public int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public C1581a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public String toString() {
                return super.toString();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class b implements a {
            private final String a;
            private final String b;
            private final String c;
            private final boolean d;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return s71.b(this.a, bVar.a) && s71.b(this.b, bVar.b) && s71.b(this.c, bVar.c) && this.d == bVar.d;
            }

            public final String a() {
                return this.b;
            }

            public final String b() {
                return this.c;
            }

            public final boolean c() {
                return this.d;
            }

            public final String d() {
                return this.a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [int] */
            /* JADX WARN: Type inference failed for: r3v2, types: [int] */
            /* JADX WARN: Type inference failed for: r3v3 */
            /* JADX WARN: Type inference failed for: r3v4 */
            public int hashCode() {
                int iC = n30.c(this.a.hashCode() * 31, 31, this.b);
                String str = this.c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                boolean z = this.d;
                ?? r3 = z;
                if (z) {
                    r3 = 1;
                }
                return iHashCode + r3;
            }

            public b(String str, String str2, String str3, boolean z) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = z;
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s71.b(this.a, eVar.a) && s71.b(this.b, eVar.b) && this.c == eVar.c && s71.b(this.d, eVar.d) && s71.b(this.e, eVar.e) && s71.b(this.f, eVar.f) && this.g == eVar.g;
    }

    public /* synthetic */ e(String str, String str2, long j, String str3, a aVar, h hVar, boolean z, int i, e80 e80Var) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, str2, j, str3, aVar, (i & 32) != 0 ? null : hVar, (i & 64) != 0 ? true : z);
    }

    public static /* synthetic */ e a(e eVar, String str, String str2, long j, String str3, a aVar, h hVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.a;
        }
        if ((i & 2) != 0) {
            str2 = eVar.b;
        }
        if ((i & 4) != 0) {
            j = eVar.c;
        }
        if ((i & 8) != 0) {
            str3 = eVar.d;
        }
        if ((i & 16) != 0) {
            aVar = eVar.e;
        }
        if ((i & 32) != 0) {
            hVar = eVar.f;
        }
        if ((i & 64) != 0) {
            z = eVar.g;
        }
        long j2 = j;
        return eVar.a(str, str2, j2, str3, aVar, hVar, z);
    }

    public final h b() {
        return this.f;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final a e() {
        return this.e;
    }

    public final long f() {
        return this.c;
    }

    public final boolean g() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public int hashCode() {
        int iHashCode = (this.e.hashCode() + n30.c(pv1.d(n30.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        h hVar = this.f;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        boolean z = this.g;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        return iHashCode2 + r4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReaderRecord(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", dataHash=");
        sb.append(this.d);
        sb.append(", rule=");
        sb.append(this.e);
        sb.append(", error=");
        sb.append(this.f);
        sb.append(", isDirty=");
        return h50.m(sb, this.g, ')');
    }

    public e(String str, String str2, long j, String str3, a aVar, h hVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = aVar;
        this.f = hVar;
        this.g = z;
    }

    public final e a(String str, String str2, long j, String str3, a aVar, h hVar, boolean z) {
        return new e(str, str2, j, str3, aVar, hVar, z);
    }

    public final String a() {
        return this.d;
    }
}
