package com.google.android.gms.internal.ads;

import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi
public final class zzbrr extends zzbrt {
    public final OnH5AdsEventListener a;

    @Override // com.google.android.gms.internal.ads.zzbru
    public final void zza(String str) {
        this.a.onH5AdsEvent(str);
    }

    public zzbrr(OnH5AdsEventListener onH5AdsEventListener) {
        this.a = onH5AdsEventListener;
    }
}
