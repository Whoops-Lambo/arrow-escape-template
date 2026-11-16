package defpackage;

import android.os.Trace;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzafi;
import com.google.android.gms.internal.ads.zzvu;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mn3 implements zzafi {
    public final /* synthetic */ zzvu a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zzadu c;

    @Override // com.google.android.gms.internal.ads.zzafi
    public final void a(long j) {
        this.c.B0(this.a, this.b, j);
    }

    @Override // com.google.android.gms.internal.ads.zzafi
    public final void zzb() {
        zzadu zzaduVar = this.c;
        zzaduVar.getClass();
        Trace.beginSection("dropVideoBuffer");
        this.a.g(this.b);
        Trace.endSection();
        zzaduVar.z0(0, 1);
    }

    public mn3(zzadu zzaduVar, zzvu zzvuVar, int i, long j) {
        this.a = zzvuVar;
        this.b = i;
        this.c = zzaduVar;
    }
}
