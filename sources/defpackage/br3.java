package defpackage;

import com.google.android.gms.internal.ads.zzajn;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzx;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class br3 implements zzajn {
    public final long a;
    public final long b;
    public final boolean c;
    public final zzx d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && br3.class == obj.getClass()) {
            br3 br3Var = (br3) obj;
            if (this.a == br3Var.a && this.b == br3Var.b && this.c == br3Var.c && Objects.equals(this.d, br3Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.b) + ((Long.hashCode(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        zzx zzxVar = this.d;
        return (((iHashCode * 31) + (this.c ? 1 : 0)) * 31) + (zzxVar != null ? zzxVar.hashCode() : 0);
    }

    public final String toString() {
        long j = this.a;
        Object objValueOf = j == -9223372036854775807L ? "UNSET" : Long.valueOf(j);
        long j2 = this.b;
        String string = objValueOf.toString();
        String strG = j2 == -9223372036854775807L ? "" : q63.g(j2, ", endTimeMs=", new StringBuilder(String.valueOf(j2).length() + 12));
        zzx zzxVar = this.d;
        String strConcat = zzxVar == null ? "" : ", title=".concat(zzxVar.toString());
        String str = true == this.c ? ", hidden" : "";
        StringBuilder sb = new StringBuilder(str.length() + strG.length() + string.length() + 21 + strConcat.length());
        q63.y(sb, "Chapter: startTimeMs=", string, strG, str);
        sb.append(strConcat);
        return sb.toString();
    }

    public br3(long j, long j2, boolean z, zzx zzxVar) {
        boolean z2 = true;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L && j > j2) {
            z2 = false;
        }
        zzgvz.a(z2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = zzxVar;
    }
}
