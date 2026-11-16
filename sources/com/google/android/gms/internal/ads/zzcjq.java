package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.p04;
import defpackage.rl3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcjq implements zzbqs {
    public final p04 a;

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final /* synthetic */ void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("src missing from video GMSG.");
            } else {
                this.a.a.zzc(rl3.g("mediaUrl", str2));
            }
        }
    }

    public zzcjq(p04 p04Var) {
        this.a = p04Var;
    }
}
