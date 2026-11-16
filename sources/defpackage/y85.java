package defpackage;

import com.google.android.gms.internal.nearby.zzth;
import com.google.android.gms.internal.nearby.zztj;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y85 extends zzth {
    public final zzth b;
    public final String c = ":";

    @Override // com.google.android.gms.internal.nearby.zzth
    public final void a(Appendable appendable, byte[] bArr, int i) {
        this.b.a(new q85(appendable), bArr, i);
    }

    @Override // com.google.android.gms.internal.nearby.zzth
    public final int b(int i) {
        int iB = this.b.b(i);
        return (zztj.a(Math.max(0, iB - 1), 2, RoundingMode.FLOOR) * this.c.length()) + iB;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(".withSeparator(\"");
        return nj.q(sb, this.c, "\", 2)");
    }

    public y85(z85 z85Var) {
        this.b = z85Var;
    }
}
