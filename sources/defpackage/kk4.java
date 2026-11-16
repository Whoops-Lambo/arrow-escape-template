package defpackage;

import com.google.android.gms.internal.fido.zzbm;
import com.google.android.gms.internal.fido.zzbo;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgh;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.G5;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kk4 extends zzgf {
    public final yj4 b;
    public final Character c;
    public volatile zzgf d;

    @Override // com.google.android.gms.internal.fido.zzgf
    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zzbm.b(0, i, bArr.length);
        while (i2 < i) {
            yj4 yj4Var = this.b;
            e(i2, Math.min(yj4Var.f, i - i2), sb, bArr);
            i2 += yj4Var.f;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public final int b(int i) {
        yj4 yj4Var = this.b;
        int i2 = yj4Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        return yj4Var.e * zzgh.a(i, i2);
    }

    public zzgf d(yj4 yj4Var, Character ch) {
        return new kk4(yj4Var, ch);
    }

    public final void e(int i, int i2, StringBuilder sb, byte[] bArr) {
        zzbm.b(i, i + i2, bArr.length);
        yj4 yj4Var = this.b;
        int i3 = yj4Var.f;
        int i4 = yj4Var.d;
        if (i2 > i3) {
            e32.a();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) << 8;
        }
        int i7 = (i2 + 1) * 8;
        while (i5 < i2 * 8) {
            sb.append(yj4Var.b[((int) (j >>> ((i7 - i4) - i5))) & yj4Var.c]);
            i5 += i4;
        }
        if (this.c != null) {
            while (i5 < yj4Var.f * 8) {
                sb.append(G5.U);
                i5 += i4;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kk4) {
            kk4 kk4Var = (kk4) obj;
            if (this.b.equals(kk4Var.b) && Objects.equals(this.c, kk4Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.c) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        yj4 yj4Var = this.b;
        sb.append(yj4Var);
        if (8 % yj4Var.d != 0) {
            Character ch = this.c;
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

    public kk4(yj4 yj4Var, Character ch) {
        this.b = yj4Var;
        if (ch != null) {
            byte[] bArr = yj4Var.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                d.r(zzbo.a("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.c = ch;
    }

    public kk4(String str, String str2) {
        this(new yj4(str, str2.toCharArray()), Character.valueOf(G5.U));
    }
}
