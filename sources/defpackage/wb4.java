package defpackage;

import com.google.android.gms.internal.auth.zzef;
import com.google.android.gms.internal.auth.zzfa;
import io.p071bidmachine.media3.extractor.ts.y;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class wb4 extends zzef {
    public final byte[] c;

    @Override // com.google.android.gms.internal.auth.zzef
    public final wb4 k() {
        int iR = zzef.r(0, 47, h());
        return iR == 0 ? zzef.b : new eb4(this.c, iR);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte d(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzef) && h() == ((zzef) obj).h()) {
            if (h() == 0) {
                return true;
            }
            if (!(obj instanceof wb4)) {
                return obj.equals(this);
            }
            wb4 wb4Var = (wb4) obj;
            int i = this.a;
            int i2 = wb4Var.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int iH = h();
                if (iH > wb4Var.h()) {
                    y.c(iH, h());
                    return false;
                }
                if (iH > wb4Var.h()) {
                    d.r(nj.i(iH, wb4Var.h(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = wb4Var.c;
                int i3 = 0;
                int i4 = 0;
                while (i3 < iH) {
                    if (this.c[i3] == bArr[i4]) {
                        i3++;
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public int h() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final int i(int i, int i2) {
        Charset charset = zzfa.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.c[i3];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final String n(Charset charset) {
        return new String(this.c, 0, h(), charset);
    }

    public wb4(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean o() {
        int iH = h();
        sv4.a.getClass();
        return c94.b(0, iH, this.c);
    }
}
