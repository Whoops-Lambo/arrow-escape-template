package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzde {
    public static void zza(zzjd zzjdVar, BillingResult billingResult, zzcz zzczVar, int i, int i2) {
        int i3 = zzcy.zza;
        zzczVar.zzb(zzcy.zzb(zzjdVar, i, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), i2);
    }

    public static void zzb(zzjd zzjdVar, BillingResult billingResult, zzcz zzczVar, int i, int i2, @Nullable String str) {
        int i3 = zzcy.zza;
        zzczVar.zzb(zzcy.zzb(zzjdVar, i, billingResult, str, zzjk.BROADCAST_ACTION_UNSPECIFIED), i2);
    }
}
