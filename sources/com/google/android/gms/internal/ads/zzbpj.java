package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbpj implements zzbqs {
    public final zzbpk a;

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final void a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("App event with no name parameter.");
        } else {
            this.a.L(str, (String) map.get("info"));
        }
    }

    public zzbpj(zzbpk zzbpkVar) {
        this.a = zzbpkVar;
    }
}
