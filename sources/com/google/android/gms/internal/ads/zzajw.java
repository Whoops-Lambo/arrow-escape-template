package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.pv1;
import defpackage.q63;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajw extends zzakg {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public zzajw(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void a(zzam zzamVar) {
        zzamVar.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzajw.class != obj.getClass()) {
            return false;
        }
        zzajw zzajwVar = (zzajw) obj;
        return this.d == zzajwVar.d && this.b.equals(zzajwVar.b) && Objects.equals(this.c, zzajwVar.c) && Arrays.equals(this.e, zzajwVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode();
        String str = this.c;
        return Arrays.hashCode(this.e) + pv1.c(((this.d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + iHashCode, 31, str != null ? str.hashCode() : 0, 31);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final String toString() {
        String str = this.a;
        int length = str.length();
        String str2 = this.b;
        int length2 = str2.length();
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        q63.y(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
