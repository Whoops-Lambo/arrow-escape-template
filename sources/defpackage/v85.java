package defpackage;

import com.google.android.gms.internal.nearby.zzsg;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.G5;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class v85 extends z85 {
    @Override // defpackage.z85, com.google.android.gms.internal.nearby.zzth
    public final void a(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        zzsg.b(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | (bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            s85 s85Var = this.b;
            char[] cArr = s85Var.b;
            char[] cArr2 = s85Var.b;
            appendable.append(cArr[i4 >>> 18]);
            appendable.append(cArr2[(i4 >>> 12) & 63]);
            appendable.append(cArr2[(i4 >>> 6) & 63]);
            appendable.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            c(appendable, bArr, i2, i - i2);
        }
    }

    public v85(String str, String str2) {
        Character chValueOf = Character.valueOf(G5.U);
        s85 s85Var = new s85(str, str2.toCharArray());
        super(s85Var, chValueOf);
        if (s85Var.b.length == 64) {
            return;
        }
        e32.a();
        throw null;
    }
}
