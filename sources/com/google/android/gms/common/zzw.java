package com.google.android.gms.common;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzw {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public final boolean zza() {
        return this.zzc;
    }

    public final zzp zzb(Context context) {
        return new zzp(this.zza, this.zzb, false, new ObjectWrapper(context), false, true, false);
    }

    public /* synthetic */ zzw(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, byte[] bArr) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z4;
    }
}
