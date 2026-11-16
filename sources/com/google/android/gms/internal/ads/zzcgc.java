package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.mbridge.msdk.MBridgeConstans;
import defpackage.uy3;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcgc {
    public String d;
    public String e;
    public long f;
    public JSONObject g;
    public boolean h;
    public boolean j;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public final ArrayList i = new ArrayList();

    public final boolean b() {
        if (!TextUtils.isEmpty(this.e) && this.g != null) {
            long jC = c();
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (jC >= 0) {
                long j = this.f;
                if (j > jCurrentTimeMillis || (jCurrentTimeMillis - j) / 1000 > jC) {
                    return false;
                }
            }
        }
        return true;
    }

    public final long c() {
        uy3 uy3Var = zzbjr.Cd;
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Bd)).booleanValue() || TextUtils.isEmpty(this.e)) ? ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).longValue() : this.g.optLong("cache_ttl_sec", ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).longValue());
    }

    public zzcgc(String str, long j) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.d = "";
        this.h = false;
        this.j = false;
        this.e = str;
        this.f = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.g = new JSONObject(str);
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.zd)).booleanValue() || !a()) {
                    if (this.g.optInt("status", -1) != 1) {
                        this.h = false;
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("App settings could not be fetched successfully.");
                        return;
                    }
                    this.h = true;
                    this.d = this.g.optString(MBridgeConstans.APP_ID);
                    JSONArray jSONArrayOptJSONArray2 = this.g.optJSONArray("ad_unit_id_settings");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i2);
                            String strOptString = jSONObject.optString("format");
                            String strOptString2 = jSONObject.optString("ad_unit_id");
                            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                                if ("interstitial".equalsIgnoreCase(strOptString)) {
                                    this.b.add(strOptString2);
                                } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                                    this.c.put(strOptString2, new zzbwa(jSONObjectOptJSONObject3));
                                }
                            }
                        }
                    }
                    JSONArray jSONArrayOptJSONArray3 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
                    if (jSONArrayOptJSONArray3 != null) {
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                            this.a.add(jSONArrayOptJSONArray3.optString(i3));
                        }
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.c8)).booleanValue() && (jSONObjectOptJSONObject2 = this.g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                        for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                            this.i.add(jSONArrayOptJSONArray.get(i4).toString());
                        }
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.x7)).booleanValue() && (jSONObjectOptJSONObject = this.g.optJSONObject("common_settings")) != null) {
                        this.j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
                    }
                }
            } catch (JSONException e) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("Exception occurred while processing app setting json", e);
                com.google.android.gms.ads.internal.zzt.zzh().d("AppSettings.parseAppSettingsJson", e);
            }
        }
    }

    public final boolean a() {
        zzeaw zzeawVar;
        if (b()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.r5)).booleanValue() && (zzeawVar = com.google.android.gms.ads.internal.zzt.zzh().i) != null) {
            zzeav zzeavVarA = zzeawVar.a();
            zzeavVarA.b("action", "cld_reset");
            zzeavVarA.b("cld_lut_ms", String.valueOf(this.f));
            zzeavVarA.b("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zzeavVarA.b("cld_ttl_sec", String.valueOf(c()));
            zzeavVarA.c();
        }
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d = "";
        this.e = "";
        this.g = null;
        this.h = false;
        this.i.clear();
        this.j = false;
        return true;
    }
}
