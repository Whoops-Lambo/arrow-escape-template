package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.pv1;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaju implements zzao {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    @Override // com.google.android.gms.internal.ads.zzao
    public final void a(zzam zzamVar) {
        zzamVar.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaju.class != obj.getClass()) {
            return false;
        }
        zzaju zzajuVar = (zzaju) obj;
        return this.a == zzajuVar.a && this.b.equals(zzajuVar.b) && this.c.equals(zzajuVar.c) && this.d == zzajuVar.d && this.e == zzajuVar.e && this.f == zzajuVar.f && this.g == zzajuVar.g && Arrays.equals(this.h, zzajuVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((((this.c.hashCode() + ((this.b.hashCode() + ((this.a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        String str = this.b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.c;
        return pv1.p(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }

    public zzaju(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static zzaju b(zzey zzeyVar) {
        int iB = zzeyVar.b();
        String strH = zzas.h(zzeyVar.k(zzeyVar.b(), StandardCharsets.US_ASCII));
        String strK = zzeyVar.k(zzeyVar.b(), StandardCharsets.UTF_8);
        int iB2 = zzeyVar.b();
        int iB3 = zzeyVar.b();
        int iB4 = zzeyVar.b();
        int iB5 = zzeyVar.b();
        int iB6 = zzeyVar.b();
        byte[] bArr = new byte[iB6];
        zzeyVar.H(0, iB6, bArr);
        return new zzaju(iB, strH, strK, iB2, iB3, iB4, iB5, bArr);
    }
}
