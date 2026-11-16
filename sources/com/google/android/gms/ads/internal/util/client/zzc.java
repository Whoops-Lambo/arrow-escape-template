package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzc extends Thread {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;

    public zzc(zzf zzfVar, Context context, String str) {
        this.zza = context;
        this.zzb = str;
        Objects.requireNonNull(zzfVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzu(this.zza, null).zzc(this.zzb, null);
    }
}
