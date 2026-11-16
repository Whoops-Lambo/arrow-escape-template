package defpackage;

import com.google.android.gms.internal.ads.zzgwr;
import com.google.android.gms.internal.ads.zzgwx;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zp4 implements Serializable, zzgwr {
    public final transient zzgwx a = new zzgwx();
    public final zzgwr b;
    public volatile transient boolean c;
    public transient Object d;

    public final String toString() {
        Object objO;
        if (this.c) {
            String strValueOf = String.valueOf(this.d);
            objO = jc1.o("<supplier that returned ", strValueOf, new StringBuilder(strValueOf.length() + 25), ">");
        } else {
            objO = this.b;
        }
        String string = objO.toString();
        return jc1.o("Suppliers.memoize(", string, new StringBuilder(string.length() + 19), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza */
    public final Object mo1232zza() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object objMo1232zza = this.b.mo1232zza();
                        this.d = objMo1232zza;
                        this.c = true;
                        return objMo1232zza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.d;
    }

    public zp4(zzgwr zzgwrVar) {
        this.b = zzgwrVar;
    }
}
