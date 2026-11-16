package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import defpackage.k10;
import defpackage.w14;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzce implements zzth {
    public final zztk a;
    public final zztg b;
    public final zztk c;
    public final zztk d;
    public final zztf e;
    public final zztk f;

    @Override // com.google.android.gms.internal.consent_sdk.zztm
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w14 zzb() {
        Application application = (Application) this.a.zzb();
        zzbz zzbzVar = (zzbz) this.b.zzb();
        Handler handler = zzcz.a;
        zztj.a(handler);
        k10 k10Var = zzcz.b;
        zztj.a(k10Var);
        return new w14(application, zzbzVar, handler, k10Var, (zze) this.c.zzb(), ((zzap) this.d).zzb(), (zzbe) this.e.zzb(), (zzaq) this.f.zzb());
    }

    public zzce(zzti zztiVar, zztg zztgVar, zztg zztgVar2, zzap zzapVar, zztf zztfVar, zztg zztgVar3) {
        this.a = zztiVar;
        this.b = zztgVar;
        this.c = zztgVar2;
        this.d = zzapVar;
        this.e = zztfVar;
        this.f = zztgVar3;
    }
}
