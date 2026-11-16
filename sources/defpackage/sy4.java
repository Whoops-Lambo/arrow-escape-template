package defpackage;

import com.google.android.gms.internal.ads.zziii;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class sy4 {
    public final Object a;
    public final int b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof sy4)) {
            return false;
        }
        sy4 sy4Var = (sy4) obj;
        return this.a == sy4Var.a && this.b == sy4Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }

    public sy4(int i, zziii zziiiVar) {
        this.a = zziiiVar;
        this.b = i;
    }
}
