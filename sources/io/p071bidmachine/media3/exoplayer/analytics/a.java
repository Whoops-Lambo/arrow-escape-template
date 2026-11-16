package io.p071bidmachine.media3.exoplayer.analytics;

import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.exoplayer.source.d0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public final long a;
    public final r0 b;
    public final int c;
    public final d0 d;
    public final long e;
    public final r0 f;
    public final int g;
    public final d0 h;
    public final long i;
    public final long j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && this.b.equals(aVar.b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f, aVar.f) && Objects.equals(this.h, aVar.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }

    public a(long j, r0 r0Var, int i, d0 d0Var, long j2, r0 r0Var2, int i2, d0 d0Var2, long j3, long j4) {
        this.a = j;
        this.b = r0Var;
        this.c = i;
        this.d = d0Var;
        this.e = j2;
        this.f = r0Var2;
        this.g = i2;
        this.h = d0Var2;
        this.i = j3;
        this.j = j4;
    }
}
