package defpackage;

import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhc;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ap4 extends zzgx {
    public final byte[] c;

    public int x() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte d(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgx) && h() == ((zzgx) obj).h()) {
            if (h() == 0) {
                return true;
            }
            if (!(obj instanceof ap4)) {
                return obj.equals(this);
            }
            ap4 ap4Var = (ap4) obj;
            int i = this.a;
            int i2 = ap4Var.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int iH = h();
                if (iH > ap4Var.h()) {
                    y.c(iH, h());
                    return false;
                }
                if (iH > ap4Var.h()) {
                    d.r(nj.i(iH, ap4Var.h(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = ap4Var.c;
                int iX = x() + iH;
                int iX2 = x();
                int iX3 = ap4Var.x();
                while (iX2 < iX) {
                    if (this.c[iX2] == bArr[iX3]) {
                        iX2++;
                        iX3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public int h() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public void i(int i, byte[] bArr) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    public final ByteArrayInputStream y() {
        return new ByteArrayInputStream(this.c, x(), h());
    }

    public ap4(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final int k(int i, int i2) {
        int iX = x();
        byte[] bArr = zzhc.a;
        for (int i3 = iX; i3 < iX + i2; i3++) {
            i = (i * 31) + this.c[i3];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final ap4 n(int i, int i2) {
        int iO = zzgx.o(i, i2, h());
        if (iO == 0) {
            return zzgx.b;
        }
        return new bo4(this.c, x() + i, iO);
    }
}
