package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzegi implements zzipf {
    public final zzddt a;

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strValueOf;
        com.google.android.gms.ads.internal.client.zzc zzcVar;
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.a.a().d;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.y8)).booleanValue()) {
            String str = zzmVar.zzx;
            if (TextUtils.isEmpty(str)) {
                zzcVar = zzmVar.zzs;
                if (zzcVar != null) {
                    strValueOf = new JSONObject(zzcVar.zza).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt() & Integer.MAX_VALUE);
                    }
                } else {
                    strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt() & Integer.MAX_VALUE);
                }
            } else {
                try {
                    strValueOf = new JSONObject(str).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        zzcVar = zzmVar.zzs;
                        if (zzcVar != null) {
                            try {
                                strValueOf = new JSONObject(zzcVar.zza).getString("request_id");
                                if (TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt() & Integer.MAX_VALUE);
                                }
                            } catch (JSONException unused) {
                            }
                        } else {
                            strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt() & Integer.MAX_VALUE);
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
        } else {
            strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt() & Integer.MAX_VALUE);
        }
        zzipn.a(strValueOf);
        return strValueOf;
    }

    public zzegi(zzddt zzddtVar) {
        this.a = zzddtVar;
    }
}
