package com.google.android.gms.internal.ads;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfbi implements zzipf {
    public final zzipo a;
    public final zzipo b;

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfbg zzb() {
        return new zzfbg(((zzcox) this.a).a(), (Intent) this.b.zzb());
    }

    public zzfbi(zzcox zzcoxVar, zzipe zzipeVar) {
        this.a = zzcoxVar;
        this.b = zzipeVar;
    }
}
