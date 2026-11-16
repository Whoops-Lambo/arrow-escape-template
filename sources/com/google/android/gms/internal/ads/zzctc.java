package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzctc implements zzcsy {
    public final com.google.android.gms.ads.internal.util.zzg a;

    @Override // com.google.android.gms.internal.ads.zzcsy
    public final void a(HashMap map) {
        this.a.zzd(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }

    public zzctc(com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.a = zzjVar;
    }
}
