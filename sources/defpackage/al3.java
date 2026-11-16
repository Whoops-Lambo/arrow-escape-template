package defpackage;

import com.google.android.gms.internal.measurement.zzaat;
import com.google.android.gms.internal.measurement.zzabe;
import com.google.android.gms.internal.measurement.zzzj;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class al3 extends zzaat {
    public static final al3 b = new al3(gl3.a);
    public final AtomicReference a;

    @Override // com.google.android.gms.internal.measurement.zzaat
    public final void a(String str, Level level, boolean z) {
        ((zzaat) this.a.get()).a(str, level, z);
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    public final zzabe b() {
        return ((zzaat) this.a.get()).b();
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    public final zzzj c() {
        return ((zzaat) this.a.get()).c();
    }

    public al3(zzaat zzaatVar) {
        this.a = new AtomicReference(zzaatVar);
    }
}
