package defpackage;

import com.google.android.gms.internal.ads.zzabk;
import com.google.android.gms.internal.ads.zzabm;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzv;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gc5 extends zzabm {
    public final zzbg b;

    @Override // com.google.android.gms.internal.ads.zzabm
    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzabm, com.google.android.gms.internal.ads.zzabp
    public final zzbg zza() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzabm, com.google.android.gms.internal.ads.zzabp
    public final zzv zzb(int i) {
        return this.b.d[this.a.zzf(i)];
    }

    @Override // com.google.android.gms.internal.ads.zzabm, com.google.android.gms.internal.ads.zzabk
    public final zzv zzc() {
        return this.b.d[this.a.zzh()];
    }

    public gc5(zzabk zzabkVar, zzbg zzbgVar) {
        super(zzabkVar);
        this.b = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof gc5)) {
            return this.b.equals(((gc5) obj).b);
        }
        return false;
    }
}
