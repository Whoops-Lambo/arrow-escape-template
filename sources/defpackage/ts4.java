package defpackage;

import com.google.android.gms.internal.ads.zzgvh;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgwq;
import com.google.android.gms.internal.ads.zzhbu;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhcj;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.G5;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ts4 extends zzhbw {
    public final qs4 d;
    public final Character e;
    public volatile zzhbw f;

    @Override // com.google.android.gms.internal.ads.zzhbw
    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zzgvz.k(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.d.f;
            i(i2, Math.min(i3, i - i2), sb, bArr);
            i2 += i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbw
    public int b(byte[] bArr, CharSequence charSequence) throws zzhbu {
        int i;
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        qs4 qs4Var = this.d;
        boolean z = qs4Var.h[length % qs4Var.e];
        int i2 = qs4Var.d;
        if (!z) {
            int length2 = charSequenceE.length();
            throw new zzhbu(pv1.l(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < charSequenceE.length()) {
            long jA = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = qs4Var.e;
                if (i5 >= i) {
                    break;
                }
                jA <<= i2;
                if (i3 + i5 < charSequenceE.length()) {
                    jA |= (long) qs4Var.a(charSequenceE.charAt(i6 + i3));
                    i6++;
                }
                i5++;
            }
            int i7 = qs4Var.f;
            int i8 = i6 * i2;
            int i9 = (i7 - 1) * 8;
            while (i9 >= (i7 * 8) - i8) {
                bArr[i4] = (byte) ((jA >>> i9) & 255);
                i9 -= 8;
                i4++;
            }
            i3 += i;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhbw
    public final int c(int i) {
        qs4 qs4Var = this.d;
        int i2 = qs4Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        return qs4Var.e * zzhcj.a(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbw
    public final int d(int i) {
        return (int) (((((long) this.d.d) * ((long) i)) + 7) / 8);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ts4) {
            ts4 ts4Var = (ts4) obj;
            if (this.d.equals(ts4Var.d) && Objects.equals(this.e, ts4Var.e)) {
                return true;
            }
        }
        return false;
    }

    public zzhbw h(qs4 qs4Var, Character ch) {
        return new ts4(qs4Var, ch);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) ^ this.d.hashCode();
    }

    public final void i(int i, int i2, StringBuilder sb, byte[] bArr) {
        zzgvz.k(i, i + i2, bArr.length);
        qs4 qs4Var = this.d;
        int i3 = qs4Var.f;
        int i4 = 0;
        zzgvz.a(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = qs4Var.d;
        while (i4 < i2 * 8) {
            sb.append(qs4Var.b[qs4Var.c & ((int) (j >>> ((i6 - i7) - i4)))]);
            i4 += i7;
        }
        if (this.e != null) {
            while (i4 < i3 * 8) {
                sb.append(G5.U);
                i4 += i7;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    public final zzhbw j() {
        qs4 qs4Var;
        boolean z;
        zzhbw zzhbwVarH = this.f;
        if (zzhbwVarH == null) {
            qs4 qs4Var2 = this.d;
            int i = 0;
            while (true) {
                char[] cArr = qs4Var2.b;
                int length = cArr.length;
                if (i >= length) {
                    qs4Var = qs4Var2;
                    break;
                }
                if (zzgvh.c(cArr[i])) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        }
                        char c = cArr[i2];
                        if (c >= 'a' && c <= 'z') {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    zzgvz.g("Cannot call lowerCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c2 = cArr[i3];
                        if (zzgvh.c(c2)) {
                            c2 ^= 32;
                        }
                        cArr2[i3] = (char) c2;
                    }
                    qs4Var = new qs4(qs4Var2.a.concat(".lowerCase()"), cArr2);
                    if (!qs4Var2.i || qs4Var.i) {
                        break;
                        break;
                    }
                    byte[] bArr = qs4Var.g;
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                    for (int i4 = 65; i4 <= 90; i4++) {
                        int i5 = i4 | 32;
                        byte b = bArr[i4];
                        byte b2 = bArr[i5];
                        if (b == -1) {
                            bArrCopyOf[i4] = b2;
                        } else {
                            char c3 = (char) i4;
                            char c4 = (char) i5;
                            if (b2 != -1) {
                                e32.i(zzgwq.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c3), Character.valueOf(c4)));
                                return null;
                            }
                            bArrCopyOf[i5] = b;
                        }
                    }
                    qs4Var = new qs4(qs4Var.a.concat(".ignoreCase()"), qs4Var.b, bArrCopyOf, true);
                    break;
                }
                i++;
            }
            zzhbwVarH = qs4Var == qs4Var2 ? this : h(qs4Var, this.e);
            this.f = zzhbwVarH;
        }
        return zzhbwVarH;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        qs4 qs4Var = this.d;
        sb.append(qs4Var);
        if (8 % qs4Var.d != 0) {
            Character ch = this.e;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public ts4(qs4 qs4Var, Character ch) {
        this.d = qs4Var;
        boolean z = true;
        if (ch != null) {
            byte[] bArr = qs4Var.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        zzgvz.e(z, "Padding character %s was already in alphabet", ch);
        this.e = ch;
    }

    @Override // com.google.android.gms.internal.ads.zzhbw
    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.e == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public ts4(String str, String str2) {
        this(new qs4(str, str2.toCharArray()), Character.valueOf(G5.U));
    }
}
