package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajp implements zzao {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajp.class == obj.getClass()) {
            zzajp zzajpVar = (zzajp) obj;
            if (this.a == zzajpVar.a && this.b == zzajpVar.b && this.c == zzajpVar.c && this.d == zzajpVar.d && this.e == zzajpVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((Long.hashCode(this.d) + ((Long.hashCode(this.c) + ((Long.hashCode(this.b) + ((Long.hashCode(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        long j = this.a;
        int length = String.valueOf(j).length();
        long j2 = this.b;
        int length2 = String.valueOf(j2).length();
        long j3 = this.c;
        int length3 = String.valueOf(j3).length();
        long j4 = this.d;
        int length4 = String.valueOf(j4).length();
        long j5 = this.e;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j5).length());
        n30.x(sb, "Motion photo metadata: photoStartPosition=", j, ", photoSize=");
        sb.append(j2);
        n30.x(sb, ", photoPresentationTimestampUs=", j3, ", videoStartPosition=");
        sb.append(j4);
        return q63.g(j5, ", videoSize=", sb);
    }

    public zzajp(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }
}
