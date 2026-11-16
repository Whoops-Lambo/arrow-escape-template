package defpackage;

import com.google.android.gms.internal.fido.zzbm;
import com.google.android.gms.internal.fido.zzgf;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.G5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fk4 extends kk4 {
    @Override // defpackage.kk4, com.google.android.gms.internal.fido.zzgf
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zzbm.b(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | (bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            yj4 yj4Var = this.b;
            char[] cArr = yj4Var.b;
            char[] cArr2 = yj4Var.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            e(i2, i - i2, sb, bArr);
        }
    }

    public fk4(String str, String str2) {
        this(new yj4(str, str2.toCharArray()), Character.valueOf(G5.U));
    }

    @Override // defpackage.kk4
    public final zzgf d(yj4 yj4Var, Character ch) {
        return new fk4(yj4Var, ch);
    }

    public fk4(yj4 yj4Var, Character ch) {
        super(yj4Var, ch);
        if (yj4Var.b.length == 64) {
            return;
        }
        e32.a();
        throw null;
    }
}
