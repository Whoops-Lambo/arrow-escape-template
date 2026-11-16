package defpackage;

import com.explorestack.protobuf.z;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vb2 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final c50 e;
    public final String f;
    public final String g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb2)) {
            return false;
        }
        vb2 vb2Var = (vb2) obj;
        return s71.b(this.a, vb2Var.a) && s71.b(this.b, vb2Var.b) && this.c == vb2Var.c && this.d == vb2Var.d && this.e.equals(vb2Var.e) && this.f.equals(vb2Var.f) && s71.b(this.g, vb2Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + n30.c((this.e.hashCode() + pv1.d(jc1.d(this.c, n30.c(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return jc1.q(sb, this.g, ')');
    }

    public vb2(String str, String str2, int i, long j, c50 c50Var, String str3, String str4) {
        z.r(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = c50Var;
        this.f = str3;
        this.g = str4;
    }
}
