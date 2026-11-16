package defpackage;

import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.gms.internal.playcore_hsdp.zzk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class dx4 implements zzg {
    public final zzk a = new zzk();
    public volatile zzg b;
    public Object c;

    public final String toString() {
        Object objN = this.b;
        if (objN == null) {
            objN = pv1.n("<supplier that returned ", String.valueOf(this.c), ">");
        }
        return pv1.n("Suppliers.memoize(", objN.toString(), ")");
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
    public final Object zza() {
        if (this.b != null) {
            synchronized (this.a) {
                try {
                    if (this.b != null) {
                        Object objZza = this.b.zza();
                        this.c = objZza;
                        this.b = null;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public dx4(zzg zzgVar) {
        this.b = zzgVar;
    }
}
