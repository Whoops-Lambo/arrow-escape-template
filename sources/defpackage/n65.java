package defpackage;

import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzpl;
import com.google.android.gms.internal.measurement.zzpm;
import com.google.android.gms.internal.measurement.zzqc;
import com.google.android.gms.internal.measurement.zzqe;
import com.google.android.gms.internal.measurement.zzqm;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n65 implements zzpm {
    public final zzqm a;
    public final /* synthetic */ zzqe b;

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final void a(zzpl zzplVar) {
        Iterator it = this.b.f.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((zzqc) it.next()).a((zzaef) zzplVar.z()) && !z) {
                this.a.zza();
                z = true;
            }
        }
    }

    public n65(zzqe zzqeVar, zzqm zzqmVar) {
        Objects.requireNonNull(zzqeVar);
        this.b = zzqeVar;
        this.a = zzqmVar;
    }
}
