package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.JsonWriter;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.C4664b4;
import com.ironsource.Yf;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzebv implements AppEventListener, zzdhi, com.google.android.gms.ads.internal.client.zza, zzdec, zzdew, zzdex, zzdfq, zzdef, zzfqw {
    public final List a;
    public final zzebj b;
    public long c;

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void L() {
        V(zzdec.class, Yf.k, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void N() {
        V(zzdec.class, Yf.c, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void O() {
        V(zzdec.class, Yf.g, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void Q() {
        V(zzdew.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        V(com.google.android.gms.ads.internal.client.zza.class, Yf.f, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void z(zzfmb zzfmbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zze() {
        V(zzdec.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zzf() {
        V(zzdec.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void m(com.google.android.gms.ads.internal.client.zze zzeVar) {
        V(zzdef.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    public zzebv(zzebj zzebjVar, zzcoo zzcooVar) {
        this.b = zzebjVar;
        this.a = Collections.singletonList(zzcooVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void A(zzccq zzccqVar, String str, String str2) {
        V(zzdec.class, "onRewarded", zzccqVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void H(String str) {
        V(zzfqo.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void K(zzfqp zzfqpVar, String str, Throwable th) {
        V(zzfqo.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void R(zzcch zzcchVar) {
        this.c = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        V(zzdhi.class, "onAdRequest", new Object[0]);
    }

    public final void V(Class cls, String str, Object... objArr) {
        String string;
        String simpleName = cls.getSimpleName();
        List list = this.a;
        String strConcat = "Event-".concat(simpleName);
        zzebj zzebjVar = this.b;
        zzebjVar.getClass();
        if (!((Boolean) zzblu.a.c()).booleanValue()) {
            return;
        }
        long jCurrentTimeMillis = zzebjVar.a.currentTimeMillis();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(jCurrentTimeMillis);
            jsonWriter.name("source").value(strConcat);
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next().toString());
            }
            jsonWriter.endArray();
            jsonWriter.name("params").beginArray();
            for (Object obj : objArr) {
                if (obj != null) {
                    string = obj.toString();
                } else {
                    string = null;
                }
                jsonWriter.value(string);
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("unable to log", e);
        }
        String strValueOf = String.valueOf(stringWriter.toString());
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh("AD-DBG ".concat(strValueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void d(Context context) {
        V(zzdex.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void f(zzfqp zzfqpVar, String str) {
        V(zzfqo.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void n(zzfqp zzfqpVar, String str) {
        V(zzfqo.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        V(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void x(Context context) {
        V(zzdex.class, C4664b4.i.u0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zza(Context context) {
        V(zzdex.class, C4664b4.i.t0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzg() {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(jElapsedRealtime);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        V(zzdfq.class, Yf.j, new Object[0]);
    }
}
