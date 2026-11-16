package defpackage;

import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zznl;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q25 extends zzgd {
    public final /* synthetic */ AtomicReference a;

    public q25(zznl zznlVar, AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // com.google.android.gms.measurement.internal.zzge
    public final void k(List list) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
