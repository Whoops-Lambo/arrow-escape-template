package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zznv {
    public final long a;
    public final zzbf b;
    public final int c;
    public final zzxt d;
    public final long e;
    public final zzbf f;
    public final int g;
    public final zzxt h;
    public final long i;
    public final long j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznv.class == obj.getClass()) {
            zznv zznvVar = (zznv) obj;
            if (this.a == zznvVar.a && this.c == zznvVar.c && this.e == zznvVar.e && this.g == zznvVar.g && this.i == zznvVar.i && this.j == zznvVar.j && Objects.equals(this.b, zznvVar.b) && Objects.equals(this.d, zznvVar.d) && Objects.equals(this.f, zznvVar.f) && Objects.equals(this.h, zznvVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }

    public zznv(long j, zzbf zzbfVar, int i, zzxt zzxtVar, long j2, zzbf zzbfVar2, int i2, zzxt zzxtVar2, long j3, long j4) {
        this.a = j;
        this.b = zzbfVar;
        this.c = i;
        this.d = zzxtVar;
        this.e = j2;
        this.f = zzbfVar2;
        this.g = i2;
        this.h = zzxtVar2;
        this.i = j3;
        this.j = j4;
    }
}
