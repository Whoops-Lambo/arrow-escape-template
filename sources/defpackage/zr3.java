package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzamv;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zr3 {
    public final Object a;
    public final int b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zr3)) {
            return false;
        }
        zr3 zr3Var = (zr3) obj;
        return this.a == zr3Var.a && this.b == zr3Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }

    public zr3(int i, zzamv zzamvVar) {
        this.a = zzamvVar;
        this.b = i;
    }
}
