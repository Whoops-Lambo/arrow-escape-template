package defpackage;

import com.google.android.gms.internal.ads.zzfzz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sj4 extends zzfzz {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final long e;

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final boolean b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final boolean c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final long d() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfzz)) {
            return false;
        }
        zzfzz zzfzzVar = (zzfzz) obj;
        return this.a.equals(zzfzzVar.a()) && this.b == zzfzzVar.b() && this.c == zzfzzVar.c() && this.d == zzfzzVar.d() && this.e == zzfzzVar.e();
    }

    public final int hashCode() {
        return ((int) this.e) ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.d)) * 1000003) ^ 1237) * 1000003);
    }

    public final String toString() {
        boolean z = this.b;
        int length = String.valueOf(z).length();
        boolean z2 = this.c;
        int length2 = String.valueOf(z2).length();
        long j = this.d;
        int length3 = String.valueOf(j).length();
        long j2 = this.e;
        int length4 = String.valueOf(j2).length();
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(j);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }

    public /* synthetic */ sj4(String str, boolean z, boolean z2, long j, long j2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = j2;
    }
}
