package com.google.android.gms.internal.ads;

import defpackage.o24;
import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcvo implements zzipf {
    public final zzipe a;
    public final zzipe b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        zzcvl zzcvlVar = (zzcvl) this.a.zzb();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        Set setSingleton = ((JSONObject) this.b.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new zzdmb(zzcvlVar, o24Var));
        zzipn.a(setSingleton);
        return setSingleton;
    }

    public zzcvo(zzipe zzipeVar, zzipe zzipeVar2) {
        this.a = zzipeVar;
        this.b = zzipeVar2;
    }
}
