package com.google.android.gms.internal.ads;

import com.ironsource.C4664b4;
import defpackage.jc1;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahs {
    public static final zzahs c = new zzahs(0, 0);
    public final long a;
    public final long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahs.class == obj.getClass()) {
            zzahs zzahsVar = (zzahs) obj;
            if (this.a == zzahsVar.a && this.b == zzahsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        long j = this.a;
        int length = String.valueOf(j).length();
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j2).length() + 1);
        n30.x(sb, "[timeUs=", j, ", position=");
        return jc1.m(j2, C4664b4.j.e, sb);
    }

    public zzahs(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
