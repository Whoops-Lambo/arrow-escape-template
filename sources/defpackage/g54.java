package defpackage;

import com.google.android.gms.internal.ads.zzecg;
import com.google.android.gms.internal.ads.zzech;
import com.google.android.gms.internal.ads.zzipn;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g54 implements zzecg, zzech {
    public Long a;
    public String b;
    public final z44 c;
    public final h54 d;

    public g54 a() {
        zzipn.b(Long.class, this.a);
        zzipn.b(String.class, this.b);
        return new g54(this.c, this.d, this.a, this.b);
    }

    public g54(z44 z44Var, h54 h54Var, Long l, String str) {
        this.c = z44Var;
        this.d = h54Var;
        this.a = l;
        this.b = str;
    }

    public /* bridge */ /* synthetic */ g54 b(String str) {
        str.getClass();
        this.b = str;
        return this;
    }

    public /* bridge */ /* synthetic */ g54 c(long j) {
        this.a = Long.valueOf(j);
        return this;
    }

    public /* synthetic */ g54(z44 z44Var, h54 h54Var) {
        this.c = z44Var;
        this.d = h54Var;
    }
}
