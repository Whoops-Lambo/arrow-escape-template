package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhbu;
import com.google.android.gms.internal.ads.zzhbw;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class rs4 extends ts4 {
    public final char[] g;

    public rs4(qs4 qs4Var) {
        super(qs4Var, (Character) null);
        this.g = new char[512];
        zzgvz.a(qs4Var.b.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.g;
            char[] cArr2 = qs4Var.b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // defpackage.ts4, com.google.android.gms.internal.ads.zzhbw
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        zzgvz.k(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr = this.g;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // defpackage.ts4
    public final zzhbw h(qs4 qs4Var, Character ch) {
        return new rs4(qs4Var);
    }

    @Override // defpackage.ts4, com.google.android.gms.internal.ads.zzhbw
    public final int b(byte[] bArr, CharSequence charSequence) throws zzhbu {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                char cCharAt = charSequence.charAt(i);
                qs4 qs4Var = this.d;
                bArr[i2] = (byte) ((qs4Var.a(cCharAt) << 4) | qs4Var.a(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        int length = charSequence.length();
        throw new zzhbu(pv1.l(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
    }
}
