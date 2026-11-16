package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcow implements zzipf {
    public final zzcox a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = this.a.a().getApplicationInfo();
        zzipn.a(applicationInfo);
        return applicationInfo;
    }

    public zzcow(zzcox zzcoxVar) {
        this.a = zzcoxVar;
    }
}
