package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.query.QueryInfo;
import defpackage.az3;
import defpackage.l24;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbkw {
    public final ScheduledExecutorService a;
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzj b;
    public final com.google.android.gms.ads.nonagon.signalgeneration.zza c;
    public final zzebb d;
    public l24 e;
    public zzbkt f;
    public CustomTabsSession g;
    public String h;
    public long i = 0;
    public long j;
    public JSONArray k;
    public Context l;

    public final void a(String str) {
        try {
            CustomTabsSession customTabsSession = this.g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.j).toString());
            e(jSONObject);
            if (((Boolean) zzblx.c.c()).booleanValue()) {
                jSONObject.put("as", this.c.zzb());
            }
            customTabsSession.c(jSONObject.toString());
            az3 az3Var = new az3(this, str);
            if (((Boolean) zzblx.e.c()).booleanValue()) {
                this.b.zzb(this.g, az3Var);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.l, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), az3Var);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error creating JSON: ", e);
        }
    }

    public final JSONObject b(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzblx.e.c()).booleanValue() ? ((Long) zzblx.h.c()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) zzblx.c.c()).booleanValue()) {
            jSONObject.put("as", this.c.zzb());
        }
        return jSONObject;
    }

    public final JSONObject c(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzblx.e.c()).booleanValue() ? ((Long) zzblx.h.c()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) zzblx.c.c()).booleanValue()) {
            jSONObject.put("as", this.c.zzb());
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjr.Eb)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbkt r0 = r7.f
            if (r0 != 0) goto Lc
            int r7 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r7 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r7)
            return
        Lc:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.c
            boolean r0 = r0.get()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r7.h
            if (r0 == 0) goto L8f
            androidx.browser.customtabs.CustomTabsSession r0 = r7.g
            if (r0 == 0) goto L8f
            java.util.concurrent.ScheduledExecutorService r0 = r7.a
            if (r0 == 0) goto L8f
            long r1 = r7.i
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2a
            goto L39
        L2a:
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzt.zzk()
            long r1 = r1.elapsedRealtime()
            long r3 = r7.i
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L39
            goto L4b
        L39:
            uy3 r1 = com.google.android.gms.internal.ads.zzbjr.Eb
            com.google.android.gms.internal.ads.zzbjp r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L8f
        L4b:
            androidx.browser.customtabs.CustomTabsSession r1 = r7.g
            java.lang.String r2 = r7.h
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.support.customtabs.ICustomTabsCallback r4 = r1.c
            android.support.customtabs.ICustomTabsService r1 = r1.b
            android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> L77
            r5.<init>()     // Catch: android.os.RemoteException -> L77
            boolean r6 = r5.isEmpty()     // Catch: android.os.RemoteException -> L77
            if (r6 == 0) goto L6b
            r5 = 0
        L6b:
            if (r5 == 0) goto L74
            r3.putAll(r5)     // Catch: android.os.RemoteException -> L77
            r1.requestPostMessageChannelWithExtras(r4, r2, r3)     // Catch: android.os.RemoteException -> L77
            goto L77
        L74:
            r1.requestPostMessageChannel(r4, r2)     // Catch: android.os.RemoteException -> L77
        L77:
            l24 r7 = r7.e
            uy3 r1 = com.google.android.gms.internal.ads.zzbjr.Fb
            com.google.android.gms.internal.ads.zzbjp r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r7, r1, r3)
            return
        L8f:
            java.lang.String r7 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkw.d():void");
    }

    public final void e(JSONObject jSONObject) {
        try {
            if (this.k == null) {
                this.k = new JSONArray((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Hb));
            }
            jSONObject.put("eids", this.k);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error fetching the PACT active eids JSON: ", e);
        }
    }

    public zzbkw(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar, com.google.android.gms.ads.nonagon.signalgeneration.zza zzaVar, zzebb zzebbVar) {
        this.a = scheduledExecutorService;
        this.b = zzjVar;
        this.c = zzaVar;
        this.d = zzebbVar;
    }
}
