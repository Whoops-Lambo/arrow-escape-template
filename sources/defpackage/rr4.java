package defpackage;

import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.gms.internal.playcore_hsdp.zzk;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class rr4 implements Serializable, zzg {
    public final transient zzk a = new zzk();
    public final zzg b;
    public volatile transient boolean c;
    public transient Object d;

    public final String toString() {
        return pv1.n("Suppliers.memoize(", (this.c ? pv1.n("<supplier that returned ", String.valueOf(this.d), ">") : this.b).toString(), ")");
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
    public final Object zza() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object objZza = this.b.zza();
                        this.d = objZza;
                        this.c = true;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.d;
    }

    public rr4(zzg zzgVar) {
        this.b = zzgVar;
    }
}
