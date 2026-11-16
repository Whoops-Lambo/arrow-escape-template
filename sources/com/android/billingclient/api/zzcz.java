package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzkn;
import com.google.android.gms.internal.play_billing.zzkr;
import defpackage.x24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
interface zzcz {
    public static final /* synthetic */ int zza = 0;

    void zza(zziw zziwVar);

    void zzb(@Nullable zziw zziwVar, int i);

    void zzc(zziw zziwVar, int i, long j);

    void zzd(zziw zziwVar, long j, boolean z);

    void zze(zziw zziwVar, int i, long j, boolean z);

    void zzf(@Nullable zzja zzjaVar);

    void zzg(@Nullable zzja zzjaVar, int i);

    void zzh(zzja zzjaVar, long j, boolean z);

    void zzi(zzji zzjiVar);

    void zzj(zzkn zzknVar);

    void zzk(@Nullable zzkr zzkrVar);

    static {
        x24.h(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", zzjk.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", zzjk.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", zzjk.ALTERNATIVE_BILLING_ACTION}, null);
    }
}
