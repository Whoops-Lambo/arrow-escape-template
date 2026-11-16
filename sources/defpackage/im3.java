package defpackage;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzaed;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class im3 extends jm3 {
    public final byte[] c;
    public final int d;
    public final int e;

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final byte c(int i) {
        return this.c[this.d + i];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int d() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final jm3 h(int i, int i2) {
        int iY = zzacr.y(i, i2, this.e);
        if (iY == 0) {
            return zzacr.b;
        }
        return new im3(this.c, this.d + i, iY);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void i(int i, byte[] bArr) {
        System.arraycopy(this.c, this.d, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void k(zzada zzadaVar) {
        zzadaVar.a(this.c, this.d, this.e);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final boolean n(zzacr zzacrVar) {
        boolean z = zzacrVar instanceof lm3;
        if (!z && !(zzacrVar instanceof im3)) {
            return zzacrVar.n(this);
        }
        int iD = zzacrVar.d();
        int i = this.e;
        if (i > iD) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i > zzacrVar.d()) {
            int iD2 = zzacrVar.d();
            d.r(pv1.j(i, iD2, "Ran off end of other: 0, ", ", ", new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(iD2).length())));
            return false;
        }
        byte[] bArr = this.c;
        int i2 = this.d;
        if (z) {
            return zzacr.z(bArr, i2, 0, ((lm3) zzacrVar).c, i);
        }
        if (!(zzacrVar instanceof im3)) {
            return zzacrVar.h(0, i).equals(h(i2, i + i2));
        }
        im3 im3Var = (im3) zzacrVar;
        return zzacr.z(bArr, i2, im3Var.d, im3Var.c, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int o(int i, int i2) {
        return zzaed.a(i, this.c, this.d, i2);
    }

    public im3(byte[] bArr, int i, int i2) {
        zzacr.y(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }
}
