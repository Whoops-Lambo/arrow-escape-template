package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfck implements zzipf {
    public final zzipo a;
    public final zzipo b;
    public final zzipo c;

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfci zzb() {
        return new zzfci((ApplicationInfo) this.a.zzb(), (PackageInfo) this.b.zzb(), ((zzcox) this.c).a());
    }

    public zzfck(zzcox zzcoxVar, zzipe zzipeVar, zzipe zzipeVar2) {
        this.a = zzipeVar;
        this.b = zzipeVar2;
        this.c = zzcoxVar;
    }
}
