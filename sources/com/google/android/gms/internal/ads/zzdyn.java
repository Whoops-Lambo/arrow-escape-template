package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdyn {
    public final zzfnf a;
    public final zzdyk b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14, types: [com.google.android.gms.internal.ads.zzbwg] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.zzbwj] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.zzbxh] */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.google.android.gms.internal.ads.zzbwj] */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.ads.zzbxh] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzbwg] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final zzfnh a(String str, JSONObject jSONObject) {
        ?? Zza;
        ?? r5;
        zzdyk zzdykVar = this.b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                Zza = new zzbxh(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                Zza = new zzbxh(new zzbyy());
            } else {
                Zza = (zzbwg) this.a.c.get();
                if (Zza == 0) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        r5 = Zza;
                        String string = jSONObject.getString(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLASS_NAME);
                        if (Zza.zzb(string)) {
                            Zza = Zza.zza("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            Zza = Zza.d(string) ? Zza.zza(string) : Zza.zza("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzg("Invalid custom event.", e);
                        r5 = Zza;
                        r5 = Zza;
                        Zza = r5.zza(str);
                    }
                } else {
                    r5 = Zza;
                    Zza = r5.zza(str);
                }
            }
            zzfnh zzfnhVar = new zzfnh(Zza);
            zzdykVar.a(str, zzfnhVar);
            return zzfnhVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Za)).booleanValue()) {
                zzdykVar.a(str, null);
            }
            throw new zzfmq(th);
        }
    }

    public final zzbyf b(String str) throws RemoteException {
        zzbwg zzbwgVar = (zzbwg) this.a.c.get();
        if (zzbwgVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Unexpected call to adapter creator.");
            io.p071bidmachine.media3.extractor.ts.y.s();
            return null;
        }
        zzbyf zzbyfVarZzd = zzbwgVar.zzd(str);
        zzdyk zzdykVar = this.b;
        synchronized (zzdykVar) {
            if (zzdykVar.a.containsKey(str)) {
                return zzbyfVarZzd;
            }
            try {
                zzdykVar.a.put(str, new zzdyj(str, zzbyfVarZzd.zzf(), zzbyfVarZzd.zzg(), true));
                return zzbyfVarZzd;
            } catch (Throwable unused) {
                return zzbyfVarZzd;
            }
        }
    }

    public zzdyn(zzfnf zzfnfVar, zzdyk zzdykVar) {
        this.a = zzfnfVar;
        this.b = zzdykVar;
    }
}
