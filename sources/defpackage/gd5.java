package defpackage;

import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzc;
import com.google.android.gms.internal.measurement.zzzm;
import com.google.android.gms.internal.measurement.zzzo;
import com.google.android.gms.internal.measurement.zzzp;
import com.google.android.gms.internal.measurement.zzzq;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gd5 extends zzzq {
    public final HashMap a;
    public final HashMap b;
    public final ed5 c;
    public final fd5 d;

    @Override // com.google.android.gms.internal.measurement.zzzq
    public final void a(zzyl zzylVar, Object obj, zzzc zzzcVar) {
        zzzp zzzpVar = (zzzp) this.a.get(zzylVar);
        if (zzzpVar != null) {
            zzzpVar.a(zzylVar, obj, zzzcVar);
        } else {
            this.c.a(zzylVar, obj, zzzcVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzq
    public final void b(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
        zzzo zzzoVar = (zzzo) this.b.get(zzylVar);
        if (zzzoVar != null) {
            zzzoVar.a(zzylVar, it, zzzcVar);
            return;
        }
        fd5 fd5Var = this.d;
        if (fd5Var != null && !this.a.containsKey(zzylVar)) {
            fd5Var.a(zzylVar, it, zzzcVar);
        } else {
            while (it.hasNext()) {
                a(zzylVar, it.next(), zzzcVar);
            }
        }
    }

    public /* synthetic */ gd5(zzzm zzzmVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(zzzmVar.a);
        map2.putAll(zzzmVar.b);
        this.c = zzzmVar.c;
        this.d = zzzmVar.d;
    }
}
