package defpackage;

import com.google.android.gms.measurement.internal.zzgg;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzoq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r25 extends zzgg {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ zznl b;

    public r25(zznl zznlVar, AtomicReference atomicReference) {
        this.a = atomicReference;
        this.b = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final void A3(zzoq zzoqVar) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            zzgu zzguVar = ((zzic) this.b.a).f;
            zzic.l(zzguVar);
            zzguVar.n.b(Integer.valueOf(zzoqVar.a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
