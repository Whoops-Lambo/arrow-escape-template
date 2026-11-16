package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcpi implements zzipf {
    public final zzcox a;
    public final zzipe b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.packageManager(this.a.a()).getPackageInfo(((ApplicationInfo) this.b.zzb()).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public zzcpi(zzcox zzcoxVar, zzipe zzipeVar) {
        this.a = zzcoxVar;
        this.b = zzipeVar;
    }
}
