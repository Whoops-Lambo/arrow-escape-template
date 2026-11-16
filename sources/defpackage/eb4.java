package defpackage;

import com.google.android.gms.internal.auth.zzef;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class eb4 extends wb4 {
    public final int d;

    @Override // defpackage.wb4, com.google.android.gms.internal.auth.zzef
    public final byte c(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.c[i];
        }
        if (i < 0) {
            d.l(pv1.k(i, "Index < 0: "));
            return (byte) 0;
        }
        d.l(nj.i(i, i2, "Index > length: ", ", "));
        return (byte) 0;
    }

    @Override // defpackage.wb4, com.google.android.gms.internal.auth.zzef
    public final byte d(int i) {
        return this.c[i];
    }

    @Override // defpackage.wb4, com.google.android.gms.internal.auth.zzef
    public final int h() {
        return this.d;
    }

    public eb4(byte[] bArr, int i) {
        super(bArr);
        zzef.r(0, i, bArr.length);
        this.d = i;
    }
}
