package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzxt {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public final boolean c(zzxt zzxtVar) {
        if (zzxtVar == null) {
            return false;
        }
        if (this == zzxtVar) {
            return true;
        }
        return this.a.equals(zzxtVar.a) && this.b == zzxtVar.b && this.c == zzxtVar.c && this.d == zzxtVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxt)) {
            return false;
        }
        zzxt zzxtVar = (zzxt) obj;
        return c(zzxtVar) && this.e == zzxtVar.e;
    }

    public final zzxt a(Object obj) {
        return this.a.equals(obj) ? this : new zzxt(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public zzxt(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public zzxt(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzxt(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
