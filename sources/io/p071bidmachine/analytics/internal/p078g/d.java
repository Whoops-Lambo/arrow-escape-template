package io.p071bidmachine.analytics.internal.p078g;

import defpackage.e80;
import defpackage.hg0;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static final a g = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final Map e;
    private final h f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s71.b(this.a, dVar.a) && s71.b(this.b, dVar.b) && s71.b(this.c, dVar.c) && this.d == dVar.d && s71.b(this.e, dVar.e) && s71.b(this.f, dVar.f);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(String str, String str2, String str3, long j, Map map, h hVar, int i, e80 e80Var) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, j, (i & 16) != 0 ? hg0.a : map, (i & 32) != 0 ? null : hVar);
    }

    public static /* synthetic */ d a(d dVar, String str, String str2, String str3, long j, Map map, h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.a;
        }
        if ((i & 2) != 0) {
            str2 = dVar.b;
        }
        if ((i & 4) != 0) {
            str3 = dVar.c;
        }
        if ((i & 8) != 0) {
            j = dVar.d;
        }
        if ((i & 16) != 0) {
            map = dVar.e;
        }
        if ((i & 32) != 0) {
            hVar = dVar.f;
        }
        long j2 = j;
        String str4 = str3;
        return dVar.a(str, str2, str4, j2, map, hVar);
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

    public final String e() {
        return this.c;
    }

    public final long f() {
        return this.d;
    }

    public int hashCode() {
        int iG = pv1.g(this.e, pv1.d(n30.c(n30.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        h hVar = this.f;
        return iG + (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "MonitorRecord(id=" + this.a + ", name=" + this.b + ", sessionId=" + this.c + ", timestamp=" + this.d + ", data=" + this.e + ", error=" + this.f + ')';
    }

    public d(String str, String str2, String str3, long j, Map map, h hVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = map;
        this.f = hVar;
    }

    public final d a(String str, String str2, String str3, long j, Map map, h hVar) {
        return new d(str, str2, str3, j, map, hVar);
    }

    public final Map a() {
        return this.e;
    }
}
