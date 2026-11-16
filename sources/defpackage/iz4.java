package defpackage;

import com.google.android.gms.internal.ads.b0;
import com.google.android.gms.internal.ads.zzifs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class iz4 extends gy4 {
    public final c62 a;
    public zzifs b = a();

    public final fy4 a() {
        c62 c62Var = this.a;
        if (c62Var.hasNext()) {
            return new fy4(c62Var.b());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // com.google.android.gms.internal.ads.zzifs
    public final byte zza() {
        zzifs zzifsVar = this.b;
        if (zzifsVar == null) {
            d.v();
            return (byte) 0;
        }
        byte bZza = zzifsVar.zza();
        if (!this.b.hasNext()) {
            this.b = a();
        }
        return bZza;
    }

    public iz4(b0 b0Var) {
        this.a = new c62(b0Var);
    }
}
