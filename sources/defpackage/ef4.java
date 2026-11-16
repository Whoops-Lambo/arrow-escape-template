package defpackage;

import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzga;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ef4 extends ze4 {
    public final byte[] c;

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final byte d(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int h(int i, int i2) {
        return zzga.a(i, this.c, 0, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int i() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final ze4 k(int i, int i2) {
        byte[] bArr = this.c;
        int iR = zzev.r(0, i2, bArr.length);
        return iR == 0 ? zzev.b : new me4(bArr, 0, iR);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void n(tf4 tf4Var) {
        byte[] bArr = this.c;
        tf4Var.z(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final boolean o(zzev zzevVar) {
        boolean z = zzevVar instanceof ef4;
        byte[] bArr = this.c;
        if (z) {
            return Arrays.equals(bArr, ((ef4) zzevVar).c);
        }
        boolean z2 = zzevVar instanceof me4;
        if (!z2) {
            return zzevVar.o(this);
        }
        me4 me4Var = (me4) zzevVar;
        int i = me4Var.e;
        int length = bArr.length;
        if (length > i) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > i) {
            d.r(nj.i(length, i, "Ran off end of other: 0, ", ", "));
            return false;
        }
        if (z) {
            return zzev.x(bArr, 0, 0, ((ef4) zzevVar).c, length);
        }
        if (!z2) {
            return zzevVar.k(0, length).equals(k(0, length));
        }
        return zzev.x(bArr, 0, me4Var.d, me4Var.c, length);
    }

    public ef4(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }
}
