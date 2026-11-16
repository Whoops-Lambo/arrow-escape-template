package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzmi {
    public final long a;
    public final float b;
    public final long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmi)) {
            return false;
        }
        zzmi zzmiVar = (zzmi) obj;
        return this.a == zzmiVar.a && this.b == zzmiVar.b && this.c == zzmiVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }

    public /* synthetic */ zzmi(zzmh zzmhVar) {
        this.a = zzmhVar.a;
        this.b = zzmhVar.b;
        this.c = zzmhVar.c;
    }
}
