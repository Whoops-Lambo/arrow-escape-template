package defpackage;

import com.google.android.gms.internal.ads.zzifx;
import com.google.android.gms.internal.ads.zzigb;
import com.google.android.gms.internal.ads.zzigh;
import com.google.android.gms.internal.ads.zzihp;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jy4 extends iy4 {
    public final byte[] c;

    @Override // com.google.android.gms.internal.ads.zzifx
    public final boolean A(zzifx zzifxVar) {
        boolean z = zzifxVar instanceof jy4;
        byte[] bArr = this.c;
        if (z) {
            return Arrays.equals(bArr, ((jy4) zzifxVar).c);
        }
        return zzifxVar instanceof hy4 ? K(zzifxVar, 0, bArr.length) : zzifxVar.A(this);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final int C(int i, int i2, int i3) {
        return zzihp.b(i, i2, i3, this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final zzigb D() {
        byte[] bArr = this.c;
        return zzigb.f(0, bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final byte k(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final int n() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final zzifx o(int i, int i2) {
        byte[] bArr = this.c;
        int iH = zzifx.h(i, i2, bArr.length);
        return iH == 0 ? zzifx.b : new hy4(bArr, i, iH);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final zzifx r(int i, int i2) {
        byte[] bArr = this.c;
        int iH = zzifx.h(i, i2, bArr.length);
        return iH == 0 ? zzifx.b : new hy4(bArr, i, iH);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final void t(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final ByteBuffer x() {
        return ByteBuffer.wrap(this.c).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final void y(zzigh zzighVar) {
        byte[] bArr = this.c;
        zzighVar.a(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final String z() {
        return new String(this.c, StandardCharsets.ISO_8859_1);
    }

    public jy4(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // defpackage.iy4
    public final boolean K(zzifx zzifxVar, int i, int i2) {
        int iN = zzifxVar.n();
        byte[] bArr = this.c;
        if (i2 <= iN) {
            int i3 = i + i2;
            if (i3 <= zzifxVar.n()) {
                if (zzifxVar instanceof jy4) {
                    return zzifx.i(bArr, 0, i, ((jy4) zzifxVar).c, i2);
                }
                if (zzifxVar instanceof hy4) {
                    hy4 hy4Var = (hy4) zzifxVar;
                    return zzifx.i(bArr, 0, hy4Var.d + i, hy4Var.c, i2);
                }
                return zzifxVar.r(i, i3).equals(r(0, i2));
            }
            int iN2 = zzifxVar.n();
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 24 + String.valueOf(i2).length() + 2 + String.valueOf(iN2).length());
            pv1.s(i, i2, "Ran off end of other: ", ", ", sb);
            d.r(pv1.l(iN2, ", ", sb));
            return false;
        }
        int length2 = String.valueOf(i2).length();
        int length3 = bArr.length;
        StringBuilder sb2 = new StringBuilder(length2 + 18 + String.valueOf(length3).length());
        sb2.append("Length too large: ");
        sb2.append(i2);
        sb2.append(length3);
        throw new IllegalArgumentException(sb2.toString());
    }
}
