package defpackage;

import com.google.android.gms.internal.fido.zzgx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bo4 extends ap4 {
    public final int d;
    public final int e;

    @Override // defpackage.ap4, com.google.android.gms.internal.fido.zzgx
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

    @Override // defpackage.ap4, com.google.android.gms.internal.fido.zzgx
    public final byte d(int i) {
        return this.c[this.d + i];
    }

    @Override // defpackage.ap4, com.google.android.gms.internal.fido.zzgx
    public final int h() {
        return this.e;
    }

    @Override // defpackage.ap4, com.google.android.gms.internal.fido.zzgx
    public final void i(int i, byte[] bArr) {
        System.arraycopy(this.c, this.d, bArr, 0, i);
    }

    @Override // defpackage.ap4
    public final int x() {
        return this.d;
    }

    public bo4(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgx.o(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }
}
