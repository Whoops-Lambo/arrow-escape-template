package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbjr;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@TargetApi(30)
public final class zzy extends zzx {
    @Override // com.google.android.gms.ads.internal.util.zzz
    public final int zzk(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ga)).booleanValue()) {
            return 0;
        }
        return super.zzk(context);
    }
}
