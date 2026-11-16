package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdal implements zzipf {
    public final zzipo a;
    public final zzipo b;
    public final zzddt c;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        String string;
        Clock clock = (Clock) this.a.zzb();
        zzcgm zzcgmVarZzb = ((zzcpq) this.b).zzb();
        String str = this.c.a().g;
        zzcgk zzcgkVar = zzcgmVarZzb.c;
        synchronized (zzcgkVar) {
            string = zzcgkVar.a.toString();
            zzcgkVar.a = zzcgkVar.a.add(BigInteger.ONE);
            zzcgkVar.b = string;
        }
        return new zzcgb(clock, zzcgmVarZzb, string, str);
    }

    public zzdal(zzipe zzipeVar, zzcpq zzcpqVar, zzddt zzddtVar) {
        this.a = zzipeVar;
        this.b = zzcpqVar;
        this.c = zzddtVar;
    }
}
