package io.p071bidmachine.tracking;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public final long a;
    public long b;
    public HashMap c;

    public d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final void a(Object obj, String str) {
        obj.getClass();
        if (this.c == null) {
            this.c = new HashMap();
        }
        HashMap map = this.c;
        if (map != null) {
            map.put(str, obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this(jCurrentTimeMillis, jCurrentTimeMillis);
    }
}
