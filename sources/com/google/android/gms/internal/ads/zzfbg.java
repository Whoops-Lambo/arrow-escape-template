package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfbg implements zzfdv {
    public final Context a;
    public final Intent b;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ie)).booleanValue()) {
            return zzheh.a(new zzfbh(null));
        }
        boolean z = false;
        try {
            if (this.b.resolveActivity(this.a.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z = true;
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("HsdpMigrationSignal.isHsdpMigrationSupported", e);
        }
        return zzheh.a(new zzfbh(Boolean.valueOf(z)));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 60;
    }

    public zzfbg(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }
}
