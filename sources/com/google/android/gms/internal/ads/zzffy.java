package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbp;
import com.ironsource.C4664b4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzffy implements zzfdt {
    public final Bundle a;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.a;
        if (bundle != null) {
            try {
                zzbp.zzh(zzbp.zzh(jSONObject, C4664b4.i.G), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzay.zza().zzo(bundle));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }

    public zzffy(Bundle bundle) {
        this.a = bundle;
    }
}
