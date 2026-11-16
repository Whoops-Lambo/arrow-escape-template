package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbph implements zzbqs {
    public final zzbpi a;

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final void a(Object obj, Map map) {
        zzbpi zzbpiVar = this.a;
        if (zzbpiVar == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzh("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleZzl = null;
        if (map.containsKey("info")) {
            try {
                bundleZzl = zzbp.zzl(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundleZzl != null) {
            zzbpiVar.n(bundleZzl, str);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Failed to convert ad metadata to Bundle.");
        }
    }

    public zzbph(zzbpi zzbpiVar) {
        this.a = zzbpiVar;
    }
}
