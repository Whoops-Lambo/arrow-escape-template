package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcto implements zzcsy {
    public final Context a;
    public final com.google.android.gms.ads.internal.util.zzj b = com.google.android.gms.ads.internal.zzt.zzh().g();

    public zzcto(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcsy
    public final void a(HashMap map) {
        String str;
        if (!map.isEmpty() && (str = (String) map.get("gad_idless")) != null) {
            boolean z = Boolean.parseBoolean(str);
            this.b.zzw(z);
            if (z) {
                com.google.android.gms.ads.internal.util.zzac.zza(this.a);
            }
        }
    }
}
