package io.p071bidmachine.media3.extractor.metadata.mp4;

import defpackage.h50;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public final long a;
    public final long b;
    public final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        int i = x.a;
        Locale locale = Locale.US;
        StringBuilder sbO = h50.o(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        sbO.append(this.b);
        sbO.append(", speedDivisor=");
        sbO.append(this.c);
        return sbO.toString();
    }

    public b(long j, long j2, int i) {
        boolean z;
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        a.c(z);
        this.a = j;
        this.b = j2;
        this.c = i;
    }
}
