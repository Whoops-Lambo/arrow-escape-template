package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.pv1;
import defpackage.q63;
import defpackage.rl3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajv implements zzao {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajv.class == obj.getClass()) {
            zzajv zzajvVar = (zzajv) obj;
            if (this.a == zzajvVar.a && Objects.equals(this.b, zzajvVar.b) && Objects.equals(this.c, zzajvVar.c) && Objects.equals(this.d, zzajvVar.d) && this.e == zzajvVar.e && this.f == zzajvVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = ((this.a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + iHashCode;
        String str3 = this.d;
        return (((((((i * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void a(zzam zzamVar) {
        String str = this.c;
        if (str != null) {
            zzamVar.y = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            zzamVar.x = str2;
        }
    }

    public final String toString() {
        String str = this.c;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        int length2 = String.valueOf(str2).length();
        int i = this.a;
        int length3 = String.valueOf(i).length();
        int i2 = this.f;
        StringBuilder sb = new StringBuilder(rl3.v(length, 28, length2, 11, length3) + 19 + String.valueOf(i2).length());
        q63.y(sb, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return pv1.j(i, i2, "\", bitrate=", ", metadataInterval=", sb);
    }

    public zzajv(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        zzgvz.a(z2);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }
}
