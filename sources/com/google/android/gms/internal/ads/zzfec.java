package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfec implements zzfdt {
    public final int a;
    public final int b;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final void zza(Object obj) {
        int i;
        Bundle bundle = (Bundle) obj;
        int i2 = this.a;
        if (i2 == -1 || (i = this.b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i2);
        bundle.putInt("crashes_without_flags", i);
        int i3 = com.google.android.gms.ads.internal.client.zzay.zza;
        if (com.google.android.gms.ads.internal.client.zzba.zzc().j) {
            bundle.putBoolean("did_reset", true);
        }
    }

    public zzfec(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
