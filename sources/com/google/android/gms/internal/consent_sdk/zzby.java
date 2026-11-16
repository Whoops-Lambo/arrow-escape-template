package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzby implements zzth {
    public final zztg a;
    public final zzce b;

    @Override // com.google.android.gms.internal.consent_sdk.zztm
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzbx zzb() {
        zzbz zzbzVar = (zzbz) this.a.zzb();
        Handler handler = zzcz.a;
        zztj.a(handler);
        return new zzbx(zzbzVar, handler, this.b.zzb());
    }

    public zzby(zztg zztgVar, zzce zzceVar) {
        this.a = zztgVar;
        this.b = zzceVar;
    }
}
