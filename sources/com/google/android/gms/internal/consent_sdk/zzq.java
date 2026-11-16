package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import defpackage.n35;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzq implements zzth {
    public final zzti a;
    public final zztg b;

    @Override // com.google.android.gms.internal.consent_sdk.zztm
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n35 zzb() {
        return new n35((Application) this.a.a, (zzaq) this.b.zzb());
    }

    public zzq(zzti zztiVar, zztg zztgVar) {
        this.a = zztiVar;
        this.b = zztgVar;
    }
}
