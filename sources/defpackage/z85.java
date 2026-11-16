package defpackage;

import com.google.android.gms.internal.nearby.zzsg;
import com.google.android.gms.internal.nearby.zzsi;
import com.google.android.gms.internal.nearby.zzth;
import com.google.android.gms.internal.nearby.zztj;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.G5;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class z85 extends zzth {
    public final s85 b;
    public final Character c;

    @Override // com.google.android.gms.internal.nearby.zzth
    public void a(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        zzsg.b(0, i, bArr.length);
        while (i2 < i) {
            s85 s85Var = this.b;
            c(appendable, bArr, i2, Math.min(s85Var.f, i - i2));
            i2 += s85Var.f;
        }
    }

    @Override // com.google.android.gms.internal.nearby.zzth
    public final int b(int i) {
        s85 s85Var = this.b;
        return zztj.a(i, s85Var.f, RoundingMode.CEILING) * s85Var.e;
    }

    public final void c(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzsg.b(i, i + i2, bArr.length);
        s85 s85Var = this.b;
        int i3 = s85Var.f;
        int i4 = s85Var.d;
        if (i2 > i3) {
            e32.a();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            appendable.append(s85Var.b[s85Var.c & ((int) (j >>> (i7 - i5)))]);
            i5 += i4;
        }
        Character ch = this.c;
        if (ch != null) {
            while (i5 < s85Var.f * 8) {
                appendable.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z85) {
            z85 z85Var = (z85) obj;
            if (this.b.equals(z85Var.b)) {
                Object obj2 = z85Var.c;
                Character ch = this.c;
                if (ch == obj2) {
                    return true;
                }
                if (ch != null && ch.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode();
        Character ch = this.c;
        return (ch == null ? 0 : ch.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        s85 s85Var = this.b;
        sb.append(s85Var);
        if (8 % s85Var.d != 0) {
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

    public z85(s85 s85Var, Character ch) {
        char cCharValue;
        this.b = s85Var;
        boolean z = true;
        if (ch != null && (cCharValue = ch.charValue()) < 128 && s85Var.g[cCharValue] != -1) {
            z = false;
        }
        if (z) {
            this.c = ch;
        } else {
            d.r(zzsi.a("Padding character %s was already in alphabet", ch));
            throw null;
        }
    }

    public z85(String str, String str2) {
        this(new s85(str, str2.toCharArray()), Character.valueOf(G5.U));
    }
}
