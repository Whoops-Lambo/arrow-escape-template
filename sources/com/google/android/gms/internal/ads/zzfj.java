package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.dh4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfj implements zzdp {
    @Override // com.google.android.gms.internal.ads.zzdp
    public final dh4 a(Looper looper, Handler.Callback callback) {
        return new dh4(new Handler(looper, callback));
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final long zzc() {
        return System.nanoTime();
    }
}
