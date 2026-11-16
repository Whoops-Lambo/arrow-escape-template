package defpackage;

import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzga;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class me4 extends ze4 {
    public final byte[] c;
    public final int d;
    public final int e;

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final byte c(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.c[this.d + i];
        }
        if (i < 0) {
            d.l(pv1.k(i, "Index < 0: "));
            return (byte) 0;
        }
        d.l(nj.i(i, i2, "Index > length: ", ", "));
        return (byte) 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final byte d(int i) {
        return this.c[this.d + i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int h(int i, int i2) {
        return zzga.a(i, this.c, this.d, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int i() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final ze4 k(int i, int i2) {
        int iR = zzev.r(i, i2, this.e);
        if (iR == 0) {
            return zzev.b;
        }
        return new me4(this.c, this.d + i, iR);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void n(tf4 tf4Var) {
        tf4Var.z(this.c, this.d, this.e);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final boolean o(zzev zzevVar) {
        boolean z = zzevVar instanceof ef4;
        if (!z && !(zzevVar instanceof me4)) {
            return zzevVar.o(this);
        }
        int i = zzevVar.i();
        int i2 = this.e;
        if (i2 > i) {
            throw new IllegalArgumentException("Length too large: " + i2 + i2);
        }
        if (i2 > zzevVar.i()) {
            d.r(nj.i(i2, zzevVar.i(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = this.c;
        int i3 = this.d;
        if (z) {
            return zzev.x(bArr, i3, 0, ((ef4) zzevVar).c, i2);
        }
        if (!(zzevVar instanceof me4)) {
            return zzevVar.k(0, i2).equals(k(i3, i2 + i3));
        }
        me4 me4Var = (me4) zzevVar;
        return zzev.x(bArr, i3, me4Var.d, me4Var.c, i2);
    }

    public me4(byte[] bArr, int i, int i2) {
        zzev.r(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }
}
