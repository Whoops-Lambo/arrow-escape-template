package com.google.android.gms.internal.ads;

import defpackage.h50;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakn {
    public final long a;
    public final long b;
    public final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakn.class == obj.getClass()) {
            zzakn zzaknVar = (zzakn) obj;
            if (this.a == zzaknVar.a && this.b == zzaknVar.b && this.c == zzaknVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = zzfq.a;
        Locale locale = Locale.US;
        StringBuilder sbO = h50.o(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        sbO.append(this.b);
        sbO.append(", speedDivisor=");
        sbO.append(this.c);
        return sbO.toString();
    }

    public zzakn(long j, long j2, int i) {
        boolean z;
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.a(z);
        this.a = j;
        this.b = j2;
        this.c = i;
    }
}
