package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import defpackage.k10;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzcs implements zzth {
    public final zztg a;
    public final zzti b;
    public final zztg c;

    @Override // com.google.android.gms.internal.consent_sdk.zztm
    public final Object zzb() {
        Application application = (Application) this.b.a;
        k10 k10Var = zzcz.b;
        zztj.a(k10Var);
        return new zzcr(application, k10Var, (zzco) this.c.zzb(), false);
    }

    public zzcs(zztg zztgVar, zztg zztgVar2, zzti zztiVar) {
        this.a = zztgVar;
        this.b = zztiVar;
        this.c = zztgVar2;
    }
}
