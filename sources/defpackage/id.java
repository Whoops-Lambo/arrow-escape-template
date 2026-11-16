package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class id {
    public final int a;
    public final long b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof id)) {
            return false;
        }
        id idVar = (id) obj;
        return h50.b(this.a, idVar.a) && this.b == idVar.b;
    }

    public final int hashCode() {
        int iC = (h50.C(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ iC;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return jc1.m(this.b, "}", sb);
    }

    public id(int i, long j) {
        if (i != 0) {
            this.a = i;
            this.b = j;
        } else {
            d.w("Null status");
            throw null;
        }
    }
}
