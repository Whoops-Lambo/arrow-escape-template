package com.google.android.gms.internal.ads;

import com.ironsource.C4664b4;
import defpackage.pv1;
import defpackage.rl3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzcl {
    public static final zzcl e = new zzcl(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcl)) {
            return false;
        }
        zzcl zzclVar = (zzcl) obj;
        return this.a == zzclVar.a && this.b == zzclVar.b && this.c == zzclVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(rl3.v(length, 38, length2, 11, String.valueOf(i3).length()) + 1);
        pv1.s(i, i2, "AudioFormat[sampleRate=", ", channelCount=", sb);
        return rl3.k(sb, ", encoding=", i3, C4664b4.j.e);
    }

    public zzcl(int i, int i2, int i3) {
        int iF;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (zzfq.d(i3)) {
            iF = zzfq.f(i3) * i2;
        } else {
            iF = -1;
        }
        this.d = iF;
    }
}
