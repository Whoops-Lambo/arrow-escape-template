package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.singular.sdk.internal.Constants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedq implements zzdef, zzdhi, zzdfu {
    public final zzeec a;
    public final String b;
    public final String c;
    public zzddv f;
    public com.google.android.gms.ads.internal.client.zze g;
    public JSONObject k;
    public JSONObject l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String h = "";
    public String i = "";
    public String j = "";
    public int d = 0;
    public zzedp e = zzedp.a;

    public static JSONObject c(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : c(zzeVar2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdfu
    public final void N(zzcyy zzcyyVar) {
        zzeec zzeecVar = this.a;
        if (zzeecVar.f()) {
            this.f = zzcyyVar.f;
            this.e = zzedp.b;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ab)).booleanValue()) {
                zzeecVar.c(this.b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void R(zzcch zzcchVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ab)).booleanValue()) {
            return;
        }
        zzeec zzeecVar = this.a;
        if (zzeecVar.f()) {
            zzeecVar.c(this.b, this);
        }
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectB;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.e);
        jSONObject.put("format", zzflq.a(this.d));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ab)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.m);
            if (this.m) {
                jSONObject.put("shown", this.n);
            }
        }
        zzddv zzddvVar = this.f;
        if (zzddvVar != null) {
            jSONObjectB = b(zzddvVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.g;
            JSONObject jSONObjectB2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzddv zzddvVar2 = (zzddv) iBinder;
                jSONObjectB2 = b(zzddvVar2);
                if (zzddvVar2.e.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.g));
                    jSONObjectB2.put(Constants.RequestParamsKeys.REMOTE_ERROR_COLLECTION_KEY, jSONArray);
                }
            }
            jSONObjectB = jSONObjectB2;
        }
        jSONObject.put("responseInfo", jSONObjectB);
        return jSONObject;
    }

    public final JSONObject b(zzddv zzddvVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzddvVar.a);
        jSONObject.put("responseSecsSinceEpoch", zzddvVar.f);
        jSONObject.put("responseId", zzddvVar.b);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ta)).booleanValue()) {
            String str = zzddvVar.g;
            if (!TextUtils.isEmpty(str)) {
                String strValueOf = String.valueOf(str);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Bidding data: ".concat(strValueOf));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.h)) {
            jSONObject.put("adRequestUrl", this.h);
        }
        if (!TextUtils.isEmpty(this.i)) {
            jSONObject.put("postBody", this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            jSONObject.put("adResponseBody", this.j);
        }
        Object obj = this.k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.l;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Wa)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.o);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzv zzvVar : zzddvVar.e) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.zza);
            jSONObject2.put("latencyMillis", zzvVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ua)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzay.zza().zzo(zzvVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : c(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void m(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeec zzeecVar = this.a;
        if (zzeecVar.f()) {
            this.e = zzedp.c;
            this.g = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ab)).booleanValue()) {
                zzeecVar.c(this.b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void z(zzfmb zzfmbVar) {
        zzeec zzeecVar = this.a;
        if (zzeecVar.f()) {
            zzfma zzfmaVar = zzfmbVar.b;
            List list = zzfmaVar.a;
            if (!list.isEmpty()) {
                this.d = ((zzflq) list.get(0)).b;
            }
            zzflt zzfltVar = zzfmaVar.b;
            String str = zzfltVar.l;
            if (!TextUtils.isEmpty(str)) {
                this.h = str;
            }
            String str2 = zzfltVar.m;
            if (!TextUtils.isEmpty(str2)) {
                this.i = str2;
            }
            JSONObject jSONObject = zzfltVar.p;
            if (jSONObject.length() > 0) {
                this.l = jSONObject;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Wa)).booleanValue()) {
                if (zzeecVar.w >= ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Xa)).longValue()) {
                    this.o = true;
                    return;
                }
                String str3 = zzfltVar.n;
                if (!TextUtils.isEmpty(str3)) {
                    this.j = str3;
                }
                JSONObject jSONObject2 = zzfltVar.o;
                if (jSONObject2.length() > 0) {
                    this.k = jSONObject2;
                }
                JSONObject jSONObject3 = this.k;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.j)) {
                    length += this.j.length();
                }
                long j = length;
                synchronized (zzeecVar) {
                    zzeecVar.w += j;
                }
            }
        }
    }

    public zzedq(zzeec zzeecVar, zzfmj zzfmjVar, String str) {
        this.a = zzeecVar;
        this.c = str;
        this.b = zzfmjVar.g;
    }
}
