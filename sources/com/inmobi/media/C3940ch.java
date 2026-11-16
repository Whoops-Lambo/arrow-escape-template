package com.inmobi.media;

import defpackage.s71;

/* JADX INFO: renamed from: com.inmobi.media.ch, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3940ch {
    public final Vg a;
    public final int b;
    public final String c;
    public final long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3940ch)) {
            return false;
        }
        C3940ch c3940ch = (C3940ch) obj;
        return s71.b(this.a, c3940ch.a) && this.b == c3940ch.b && s71.b(this.c, c3940ch.c) && this.d == c3940ch.d;
    }

    public final int hashCode() {
        int iA = Hj.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return Long.hashCode(this.d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PingResult(ping=" + this.a + ", statusCode=" + this.b + ", error=" + this.c + ", timestamp=" + this.d + ")";
    }

    public C3940ch(Vg vg, int i, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        vg.getClass();
        this.a = vg;
        this.b = i;
        this.c = str;
        this.d = jCurrentTimeMillis;
    }
}
