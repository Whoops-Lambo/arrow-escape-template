package defpackage;

import com.google.android.gms.internal.fido.zzbm;
import com.google.android.gms.internal.fido.zzgf;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ak4 extends kk4 {
    public final char[] e;

    public ak4(yj4 yj4Var) {
        super(yj4Var, (Character) null);
        this.e = new char[512];
        char[] cArr = yj4Var.b;
        if (cArr.length != 16) {
            e32.a();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.kk4, com.google.android.gms.internal.fido.zzgf
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        zzbm.b(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // defpackage.kk4
    public final zzgf d(yj4 yj4Var, Character ch) {
        return new ak4(yj4Var);
    }
}
