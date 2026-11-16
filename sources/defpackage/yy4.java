package defpackage;

import com.google.android.gms.internal.ads.zzifx;
import com.google.android.gms.internal.ads.zzigm;
import com.google.android.gms.internal.ads.zzihu;
import com.google.android.gms.internal.ads.zziii;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yy4 {
    public final zziii a;
    public final zzigm b;
    public volatile zzifx c;
    public volatile zziii d;

    public final zziii a() {
        try {
            return this.d;
        } catch (zzihu unused) {
            zzigm zzigmVar = zzigm.b;
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
        if (!(obj instanceof yy4)) {
            return a().equals(obj);
        }
        yy4 yy4Var = (yy4) obj;
        if (this.c == null || yy4Var.c == null || this.b != yy4Var.b || !this.c.equals(yy4Var.c)) {
            return a().equals(yy4Var.a());
        }
        return true;
    }

    public yy4(zziii zziiiVar) {
        if (zziiiVar != null) {
            this.d = zziiiVar;
            this.a = zziiiVar.i();
            zzigm zzigmVar = zzigm.b;
            int i = dy4.a;
            this.b = zzigm.c;
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
