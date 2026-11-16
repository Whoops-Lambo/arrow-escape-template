package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzafe;
import com.google.android.gms.internal.ads.zzafh;
import com.google.android.gms.internal.ads.zznh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ln3 implements zzafh {
    public final /* synthetic */ zzadu b;

    @Override // com.google.android.gms.internal.ads.zzafh
    public final void zza() {
        zznh zznhVar = this.b.I;
        if (zznhVar != null) {
            zznhVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final void zzb() {
        zzadu zzaduVar = this.b;
        Surface surface = zzaduVar.Y0;
        if (surface != null) {
            zzafe zzafeVar = zzaduVar.G0;
            Handler handler = zzafeVar.a;
            if (handler != null) {
                handler.post(new mo3(zzafeVar, surface, SystemClock.elapsedRealtime()));
            }
            zzaduVar.b1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final void zzc() {
        zzadu zzaduVar = this.b;
        if (zzaduVar.Y0 != null) {
            zzaduVar.z0(0, 1);
        }
    }

    public ln3(zzadu zzaduVar) {
        this.b = zzaduVar;
    }
}
