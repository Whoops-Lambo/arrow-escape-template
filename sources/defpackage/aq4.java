package defpackage;

import com.google.android.gms.internal.ads.zzgwr;
import com.google.android.gms.internal.ads.zzgwx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class aq4 implements zzgwr {
    public final zzgwx a = new zzgwx();
    public volatile zzgwr b;
    public Object c;

    public final String toString() {
        Object objO = this.b;
        if (objO == null) {
            String strValueOf = String.valueOf(this.c);
            objO = jc1.o("<supplier that returned ", strValueOf, new StringBuilder(strValueOf.length() + 25), ">");
        }
        String string = objO.toString();
        return jc1.o("Suppliers.memoize(", string, new StringBuilder(string.length() + 19), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza */
    public final Object mo1232zza() {
        if (this.b != null) {
            synchronized (this.a) {
                try {
                    if (this.b != null) {
                        Object objMo1232zza = this.b.mo1232zza();
                        this.c = objMo1232zza;
                        this.b = null;
                        return objMo1232zza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public aq4(zzgwr zzgwrVar) {
        this.b = zzgwrVar;
    }
}
