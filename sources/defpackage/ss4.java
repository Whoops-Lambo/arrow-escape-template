package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhbu;
import com.google.android.gms.internal.ads.zzhbw;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.G5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ss4 extends ts4 {
    @Override // defpackage.ts4, com.google.android.gms.internal.ads.zzhbw
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zzgvz.k(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | (bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            char[] cArr = this.d.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr[(i4 >>> 12) & 63]);
            sb.append(cArr[(i4 >>> 6) & 63]);
            sb.append(cArr[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            i(i2, i - i2, sb, bArr);
        }
    }

    public ss4(String str, String str2) {
        this(new qs4(str, str2.toCharArray()), Character.valueOf(G5.U));
    }

    @Override // defpackage.ts4
    public final zzhbw h(qs4 qs4Var, Character ch) {
        return new ss4(qs4Var, ch);
    }

    @Override // defpackage.ts4, com.google.android.gms.internal.ads.zzhbw
    public final int b(byte[] bArr, CharSequence charSequence) throws zzhbu {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        qs4 qs4Var = this.d;
        if (qs4Var.h[length % qs4Var.e]) {
            int i = 0;
            int i2 = 0;
            while (i < charSequenceE.length()) {
                int i3 = i2 + 1;
                int iA = (qs4Var.a(charSequenceE.charAt(i + 1)) << 12) | (qs4Var.a(charSequenceE.charAt(i)) << 18);
                bArr[i2] = (byte) (iA >>> 16);
                int i4 = i + 2;
                if (i4 < charSequenceE.length()) {
                    int i5 = i + 3;
                    int iA2 = iA | (qs4Var.a(charSequenceE.charAt(i4)) << 6);
                    int i6 = i2 + 2;
                    bArr[i3] = (byte) ((iA2 >>> 8) & 255);
                    if (i5 < charSequenceE.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((iA2 | qs4Var.a(charSequenceE.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i = i4;
                    i2 = i3;
                }
            }
            return i2;
        }
        int length2 = charSequenceE.length();
        throw new zzhbu(pv1.l(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
    }

    public ss4(qs4 qs4Var, Character ch) {
        super(qs4Var, ch);
        zzgvz.a(qs4Var.b.length == 64);
    }
}
