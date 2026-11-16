package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import defpackage.k10;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzap implements zzth {
    public final zzti a;
    public final zztg b;
    public final zztg c;

    @Override // com.google.android.gms.internal.consent_sdk.zztm
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzao zzb() {
        Application application = (Application) this.a.a;
        zzaq zzaqVar = (zzaq) this.b.zzb();
        zzl zzlVar = (zzl) this.c.zzb();
        k10 k10Var = zzcz.b;
        zztj.a(k10Var);
        return new zzao(application, zzaqVar, zzlVar, k10Var);
    }

    public zzap(zztg zztgVar, zztg zztgVar2, zzti zztiVar) {
        this.a = zztiVar;
        this.b = zztgVar;
        this.c = zztgVar2;
    }
}
