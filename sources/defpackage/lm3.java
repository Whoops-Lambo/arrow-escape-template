package defpackage;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzaed;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lm3 extends jm3 {
    public final byte[] c;

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int d() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final jm3 h(int i, int i2) {
        byte[] bArr = this.c;
        int iY = zzacr.y(0, i2, bArr.length);
        return iY == 0 ? zzacr.b : new im3(bArr, 0, iY);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void i(int i, byte[] bArr) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void k(zzada zzadaVar) {
        byte[] bArr = this.c;
        zzadaVar.a(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final boolean n(zzacr zzacrVar) {
        boolean z = zzacrVar instanceof lm3;
        byte[] bArr = this.c;
        if (z) {
            return Arrays.equals(bArr, ((lm3) zzacrVar).c);
        }
        boolean z2 = zzacrVar instanceof im3;
        if (!z2) {
            return zzacrVar.n(this);
        }
        im3 im3Var = (im3) zzacrVar;
        int i = im3Var.e;
        int length = bArr.length;
        if (length > i) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length > i) {
            d.r(pv1.j(length, i, "Ran off end of other: 0, ", ", ", new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i).length())));
            return false;
        }
        if (z) {
            return zzacr.z(bArr, 0, 0, ((lm3) zzacrVar).c, length);
        }
        if (!z2) {
            return zzacrVar.h(0, length).equals(h(0, length));
        }
        return zzacr.z(bArr, 0, im3Var.d, im3Var.c, length);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int o(int i, int i2) {
        return zzaed.a(i, this.c, 0, i2);
    }

    public lm3(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }
}
