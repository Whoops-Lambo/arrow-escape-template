package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;
import com.google.android.gms.common.util.PlatformVersion;
import com.ironsource.C4664b4;
import com.ironsource.C4788i2;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.ea0;
import defpackage.jp4;
import defpackage.mp4;
import defpackage.xp4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzead implements zzdhi, zzdfq, zzdef, zzdmv {
    public final zzear a;
    public final zzebb b;
    public final Context c;

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void R(zzcch zzcchVar) {
        this.a.a(zzcchVar.a);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.lb)).booleanValue()) {
            c();
        }
    }

    public final void a(Bundle bundle, zzgzb zzgzbVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.V2)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong("public-api-callback", com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        zzear zzearVar = this.a;
        zzearVar.getClass();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.qf)).booleanValue()) {
            zzearVar.b("brr", true != zzearVar.c.q ? "0" : "1");
        }
        if (bundle.containsKey("ls")) {
            zzearVar.b("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgzbVar.size();
        for (int i = 0; i < size; i++) {
            zzeag zzeagVar = (zzeag) zzgzbVar.get(i);
            long j = bundle.getLong(zzeagVar.b.a, -1L);
            long j2 = bundle.getLong(zzeagVar.c.a, -1L);
            if (j > 0 && j2 > 0) {
                zzearVar.b(zzeagVar.a, String.valueOf(j2 - j));
            }
        }
        b(bundle.getBundle("client_sig_latency_key"));
        b(bundle.getBundle("gms_sig_latency_key"));
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.a.b(str, String.valueOf(j));
            }
        }
    }

    public final void c() {
        List historicalProcessExitReasons;
        if (((Boolean) zzbly.d.c()).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().q.getAndSet(true) || !PlatformVersion.isAtLeastR()) {
            return;
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.nb);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Context context = this.c;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 1)) == null || historicalProcessExitReasons.isEmpty()) {
                return;
            }
            int reason = ea0.c(historicalProcessExitReasons.get(0)).getReason();
            try {
                zzgwo zzgwoVarB = zzgwo.a(new jp4(',')).b(mp4.c);
                zzgwo zzgwoVar = new zzgwo(zzgwoVarB.c, true, zzgwoVarB.a);
                str.getClass();
                Iterator itG = zzgwoVar.c.g(zzgwoVar, str);
                while (true) {
                    xp4 xp4Var = (xp4) itG;
                    if (!xp4Var.hasNext()) {
                        return;
                    }
                    String str2 = (String) xp4Var.next();
                    try {
                        if (Integer.parseInt(str2) == reason) {
                            zzebb zzebbVar = this.b;
                            zzebbVar.getClass();
                            HashMap map = new HashMap(zzebbVar.a);
                            map.put("action", "aei");
                            map.put("aeir", String.valueOf(reason));
                            zzebbVar.c(map);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53);
                        sb.append("Invalid number format in appExitInfoReasonAllowlist: ");
                        sb.append(str2);
                        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    }
                }
            } catch (NoClassDefFoundError e) {
                e = e;
            } catch (RuntimeException e2) {
                e = e2;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError | RuntimeException e3) {
            e = e3;
        }
        com.google.android.gms.ads.internal.zzt.zzh().d("CsiAdLoadListener.maybeLogAppExitInfo", e);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void m(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzear zzearVar = this.a;
        zzearVar.a.put("action", "ftl");
        zzearVar.b("ftl", String.valueOf(zzeVar.zza));
        zzearVar.b("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.v8)).booleanValue()) {
            zzearVar.b("emsg", zzeVar.zzb);
        }
        zzearVar.d();
        this.b.b(zzearVar.a);
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void z(zzfmb zzfmbVar) {
        zzear zzearVar = this.a;
        zzearVar.getClass();
        zzfma zzfmaVar = zzfmbVar.b;
        List list = zzfmaVar.a;
        if (!list.isEmpty()) {
            int i = ((zzflq) list.get(0)).b;
            zzearVar.b("ad_format", zzflq.a(i));
            if (i == 6) {
                zzearVar.a.put("as", true != zzearVar.b.g ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.X2)).booleanValue()) {
            zzearVar.b(com.safedk.android.analytics.brandsafety.m.d, Integer.toString(list.size()));
        }
        zzearVar.b("gqi", zzfmaVar.b.b);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.kb)).booleanValue()) {
            c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmv
    public final void zzd(zzbc zzbcVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.g8)).booleanValue()) {
            zzebb zzebbVar = this.b;
            zzear zzearVar = this.a;
            if (zzbcVar == null) {
                ConcurrentHashMap concurrentHashMap = zzearVar.a;
                concurrentHashMap.put("action", "sgs");
                concurrentHashMap.put("request_id", C4788i2.f);
                zzebbVar.b(concurrentHashMap);
                return;
            }
            zzcch zzcchVar = zzbcVar.zzc;
            if (zzcchVar != null) {
                a(zzcchVar.m, zzeag.d);
            }
            try {
                JSONObject jSONObject = new JSONObject(zzbcVar.zzb);
                ConcurrentHashMap concurrentHashMap2 = zzearVar.a;
                ConcurrentHashMap concurrentHashMap3 = zzearVar.a;
                concurrentHashMap2.put("action", "sgs");
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ub)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS).getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzg("Error retrieving JSONObject from the requestJson, ", e);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                concurrentHashMap3.put("tpc", str);
                zzcch zzcchVar2 = zzbcVar.zzc;
                if (zzcchVar2 != null) {
                    zzearVar.a(zzcchVar2.a);
                }
                zzearVar.d();
                zzebbVar.b(concurrentHashMap3);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.mb)).booleanValue()) {
                    c();
                }
            } catch (JSONException unused) {
                ConcurrentHashMap concurrentHashMap4 = zzearVar.a;
                concurrentHashMap4.put("action", "sgf");
                concurrentHashMap4.put("sgf_reason", "request_invalid");
                zzebbVar.b(concurrentHashMap4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmv
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.g8)).booleanValue()) {
            zzear zzearVar = this.a;
            zzearVar.a.put("action", "sgf");
            zzearVar.b("sgf_reason", str);
            zzearVar.d();
            this.b.b(zzearVar.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzg() {
        Bundle bundle;
        zzear zzearVar = this.a;
        zzearVar.a.put("action", C4664b4.i.r);
        synchronized (zzearVar) {
            bundle = zzearVar.e;
        }
        a(bundle, zzeag.e);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ye)).booleanValue()) {
            zzearVar.a.put("mafe", true != WebViewFeature.a("MUTE_AUDIO") ? "0" : "1");
        }
        zzearVar.d();
        this.b.b(zzearVar.a);
    }

    public zzead(zzear zzearVar, zzebb zzebbVar, Context context) {
        this.a = zzearVar;
        this.b = zzebbVar;
        this.c = context;
    }
}
