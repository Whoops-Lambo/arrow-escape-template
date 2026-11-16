package defpackage;

import com.google.android.gms.internal.consent_sdk.zzpm;
import com.google.android.gms.internal.consent_sdk.zzpv;
import com.google.android.gms.internal.consent_sdk.zzqs;
import io.p071bidmachine.media3.extractor.ts.y;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class x55 extends zzpm {
    public final byte[] c;

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public byte d(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public int h() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final int i(int i, int i2) {
        Charset charset = zzqs.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.c[i3];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final boolean o(zzpm zzpmVar) {
        if (!(zzpmVar instanceof x55)) {
            return zzpmVar.o(this);
        }
        int iH = h();
        if (iH > zzpmVar.h()) {
            y.c(iH, h());
            return false;
        }
        if (iH > zzpmVar.h()) {
            d.r(nj.i(iH, zzpmVar.h(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = ((x55) zzpmVar).c;
        int i = 0;
        int i2 = 0;
        while (i < iH) {
            if (this.c[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public x55(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final w55 k() {
        zzpm.zzi(h());
        byte[] bArr = this.c;
        w55 w55Var = new w55(bArr);
        zzpm.zzi(bArr.length);
        return w55Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final void n(zzpv zzpvVar) {
        zzpvVar.a(h(), this.c);
    }
}
