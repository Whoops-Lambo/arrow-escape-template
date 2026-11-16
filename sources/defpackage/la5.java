package defpackage;

import com.google.android.gms.internal.measurement.zzww;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class la5 extends zzww {
    public final d31 a;
    public final d31 b;
    public final UUID c;
    public final long d;

    @Override // com.google.android.gms.internal.measurement.zzww
    public final d31 a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final d31 b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final UUID c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzww)) {
            return false;
        }
        zzww zzwwVar = (zzww) obj;
        return this.a.equals(zzwwVar.a()) && this.b.equals(zzwwVar.b()) && this.c.equals(zzwwVar.c()) && this.d == zzwwVar.d();
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ (iHashCode * 1000003);
    }

    public /* synthetic */ la5(y32 y32Var, y32 y32Var2, UUID uuid, long j) {
        this.a = y32Var;
        this.b = y32Var2;
        this.c = uuid;
        this.d = j;
    }
}
