package io.p071bidmachine.analytics.internal.p078g;

import defpackage.e80;
import defpackage.jc1;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    private final String a;
    private final a b;
    private final String c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        UNKNOWN,
        MONITOR_INVALID,
        MONITOR_NO_CONTENT,
        MONITOR_BAD_CONTENT,
        READER_INVALID,
        READER_NO_CONTENT,
        READER_BAD_CONTENT,
        READER_NO_ACCESS
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s71.b(this.a, hVar.a) && this.b == hVar.b && s71.b(this.c, hVar.c);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final a c() {
        return this.b;
    }

    public int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackerError(name=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", reason=");
        return jc1.q(sb, this.c, ')');
    }

    public h(String str, a aVar, String str2) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
    }

    public /* synthetic */ h(String str, a aVar, String str2, int i, e80 e80Var) {
        this(str, aVar, (i & 4) != 0 ? "" : str2);
    }
}
