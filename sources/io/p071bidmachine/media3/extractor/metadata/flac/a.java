package io.p071bidmachine.media3.extractor.metadata.flac;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import io.p071bidmachine.media3.common.a0;
import io.p071bidmachine.media3.common.c0;
import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.util.q;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements c0 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    @Override // io.p071bidmachine.media3.common.c0
    public final void a(a0 a0Var) {
        a0Var.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && Arrays.equals(this.h, aVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((n30.c(n30.c((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    public a(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static a b(q qVar) {
        int iG = qVar.g();
        String strP = f0.p(qVar.r(qVar.g(), StandardCharsets.US_ASCII));
        String strR = qVar.r(qVar.g(), StandardCharsets.UTF_8);
        int iG2 = qVar.g();
        int iG3 = qVar.g();
        int iG4 = qVar.g();
        int iG5 = qVar.g();
        int iG6 = qVar.g();
        byte[] bArr = new byte[iG6];
        qVar.e(bArr, 0, iG6);
        return new a(iG, strP, strR, iG2, iG3, iG4, iG5, bArr);
    }
}
