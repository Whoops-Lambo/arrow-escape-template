package com.google.android.gms.internal.ads;

import defpackage.pv1;
import defpackage.q63;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzba {
    public final Object a;
    public final int b;
    public final zzak c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzba.class == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (this.b == zzbaVar.b && this.e == zzbaVar.e && this.f == zzbaVar.f && this.g == zzbaVar.g && this.h == zzbaVar.h && this.i == zzbaVar.i && Objects.equals(this.c, zzbaVar.c) && Objects.equals(this.a, zzbaVar.a) && Objects.equals(this.d, zzbaVar.d)) {
                return true;
            }
        }
        return false;
    }

    static {
        String str = zzfq.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        int i = this.b;
        int length = String.valueOf(i).length();
        int i2 = this.e;
        int length2 = String.valueOf(i2).length();
        long j = this.f;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j).length());
        pv1.s(i, i2, "mediaItem=", ", period=", sb);
        String strG = q63.g(j, ", pos=", sb);
        int i3 = this.h;
        if (i3 == -1) {
            return strG;
        }
        int length3 = strG.length();
        long j2 = this.g;
        int length4 = String.valueOf(i3).length() + length3 + 13 + String.valueOf(j2).length() + 10;
        int i4 = this.i;
        StringBuilder sb2 = new StringBuilder(length4 + 5 + String.valueOf(i4).length());
        sb2.append(strG);
        sb2.append(", contentPos=");
        sb2.append(j2);
        return pv1.j(i3, i4, ", adGroup=", ", ad=", sb2);
    }

    public zzba(Object obj, int i, zzak zzakVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.a(z);
        zzgvz.a(i2 >= 0);
        this.a = obj;
        this.b = i;
        this.c = zzakVar;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }
}
