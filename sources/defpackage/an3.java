package defpackage;

import com.google.android.gms.internal.measurement.zzafc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class an3 {
    public final Object a;
    public final int b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof an3)) {
            return false;
        }
        an3 an3Var = (an3) obj;
        return this.a == an3Var.a && this.b == an3Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }

    public an3(int i, zzafc zzafcVar) {
        this.a = zzafcVar;
        this.b = i;
    }
}
