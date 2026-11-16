package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzakb;
import com.google.android.gms.internal.p002firebaseauthapi.zzalf;
import com.google.android.gms.internal.p002firebaseauthapi.zzamd;
import com.google.android.gms.internal.p002firebaseauthapi.zzamv;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ps3 {
    public final zzamv a;
    public final zzalf b;
    public volatile zzakb c;
    public volatile zzamv d;

    public final zzamv a() {
        try {
            return this.d;
        } catch (zzamd unused) {
            zzalf zzalfVar = zzalf.b;
            return this.a;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps3)) {
            return a().equals(obj);
        }
        ps3 ps3Var = (ps3) obj;
        if (this.c == null || ps3Var.c == null || this.b != ps3Var.b || !this.c.equals(ps3Var.c)) {
            return a().equals(ps3Var.a());
        }
        return true;
    }

    public ps3(zzamv zzamvVar) {
        if (zzamvVar != null) {
            this.d = zzamvVar;
            this.a = zzamvVar.zzg();
            this.b = zzalf.b;
            this.c = null;
            return;
        }
        d.r("message cannot be null");
        throw null;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
