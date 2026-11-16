package defpackage;

import com.google.android.gms.internal.ads.zzecc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vb4 extends zzecc {
    public final long a;
    public final int b;

    @Override // com.google.android.gms.internal.ads.zzecc
    public final long a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzecc)) {
            return false;
        }
        zzecc zzeccVar = (zzecc) obj;
        return this.a == zzeccVar.a() && this.b == zzeccVar.b();
    }

    public final int hashCode() {
        long j = this.a;
        return this.b ^ ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        int length = String.valueOf(j).length();
        int i = this.b;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i).length() + 1);
        n30.x(sb, "OnDeviceStorageKey{id=", j, ", eventType=");
        return nj.l(i, "}", sb);
    }

    public /* synthetic */ vb4(long j, int i) {
        this.a = j;
        this.b = i;
    }
}
