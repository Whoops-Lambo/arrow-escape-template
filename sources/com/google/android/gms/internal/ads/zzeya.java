package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ps0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeya implements zzfdv {
    public final zzher a;
    public final Context b;

    public final Intent a() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Oc)).booleanValue();
        Context context = this.b;
        return (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return this.a.submit(new ps0(this, 17));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 14;
    }

    public zzeya(Context context, zzher zzherVar) {
        this.a = zzherVar;
        this.b = context;
    }
}
