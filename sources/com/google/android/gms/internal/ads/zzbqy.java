package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.C4664b4;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbqy implements zzbqs {
    public final Context a;
    public final Map b;

    public zzbqy(Context context, Map map) {
        this.a = context;
        this.b = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final void a(Object obj, Map map) {
        zzcfd zzcfdVarZzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.a;
        if (!zzcfdVarZzD.a(context)) {
            return;
        }
        String str = (String) map.get(C4664b4.i.j0);
        String str2 = (String) map.get("eventId");
        int iHashCode = str.hashCode();
        if (iHashCode != 94399) {
            Map map2 = this.b;
            if (iHashCode != 94401) {
                if (iHashCode == 94407 && str.equals("_ai")) {
                    zzcfd zzcfdVarZzD2 = com.google.android.gms.ads.internal.zzt.zzD();
                    Map map3 = (Map) map2.get("_ai");
                    zzcfdVarZzD2.getClass();
                    zzcfdVarZzD2.h(context, "_ai", str2, zzcfd.f(map3));
                    return;
                }
            } else if (str.equals("_ac")) {
                zzcfd zzcfdVarZzD3 = com.google.android.gms.ads.internal.zzt.zzD();
                Map map4 = (Map) map2.get("_ac");
                zzcfdVarZzD3.getClass();
                zzcfdVarZzD3.h(context, "_ac", str2, zzcfd.f(map4));
                return;
            }
        } else if (str.equals("_aa")) {
            com.google.android.gms.ads.internal.zzt.zzD().h(context, "_aa", str2, null);
            return;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzf("logScionEvent gmsg contained unsupported eventName");
    }
}
