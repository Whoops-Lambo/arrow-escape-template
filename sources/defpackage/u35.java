package defpackage;

import com.google.android.gms.internal.ads.zzbd;
import com.google.android.gms.internal.ads.zzbe;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzc;
import com.google.android.gms.internal.ads.zzxg;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u35 extends zzxg {
    public final zzbe c;

    @Override // com.google.android.gms.internal.ads.zzxg, com.google.android.gms.internal.ads.zzbf
    public final zzbd d(int i, zzbd zzbdVar, boolean z) {
        zzbf zzbfVar = this.b;
        zzbd zzbdVarD = zzbfVar.d(i, zzbdVar, z);
        if (!zzbfVar.b(zzbdVarD.c, this.c, 0L).b()) {
            zzbdVarD.e = true;
            return zzbdVarD;
        }
        Object obj = zzbdVar.a;
        Object obj2 = zzbdVar.b;
        int i2 = zzbdVar.c;
        long j = zzbdVar.d;
        zzc zzcVar = zzc.b;
        zzbdVarD.a(obj, obj2, i2, j, true);
        return zzbdVarD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u35(w35 w35Var, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(w35Var);
        this.c = new zzbe();
    }
}
