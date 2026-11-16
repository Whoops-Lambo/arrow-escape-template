package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vf extends a62 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a62)) {
            return false;
        }
        vf vfVar = (vf) ((a62) obj);
        return this.b.equals(vfVar.b) && this.c.equals(vfVar.c) && this.d.equals(vfVar.d) && this.e.equals(vfVar.e) && this.f == vfVar.f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return jc1.m(this.f, "}", sb);
    }

    public vf(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                this.d = str3;
                if (str4 != null) {
                    this.e = str4;
                    this.f = j;
                    return;
                } else {
                    d.w("Null variantId");
                    throw null;
                }
            }
            d.w("Null parameterKey");
            throw null;
        }
        d.w("Null rolloutId");
        throw null;
    }
}
