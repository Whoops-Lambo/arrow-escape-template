package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzdtt;
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import defpackage.b64;
import defpackage.gu4;
import defpackage.ka4;
import defpackage.la4;
import defpackage.ma4;
import defpackage.nu4;
import defpackage.o24;
import defpackage.rl3;
import defpackage.ut4;
import defpackage.xm4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdun {
    public final Context a;
    public final zzdtt b;
    public final zzbbo c;
    public final VersionInfoParcel d;
    public final com.google.android.gms.ads.internal.zza e;
    public final zzbiq f;
    public final Executor g;
    public final zzbmv h;
    public final zzdvf i;
    public final zzdxt j;
    public final ScheduledExecutorService k;
    public final zzdwo l;
    public final zzeaw m;
    public final zzftx n;
    public final zzelr o;
    public final zzemc p;
    public final zzfmn q;
    public final zzear r;
    public final zzebz s;
    public final zzdct t;

    public zzdun(Context context, zzdtt zzdttVar, zzbbo zzbboVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbiq zzbiqVar, o24 o24Var, zzfmj zzfmjVar, zzdvf zzdvfVar, zzdxt zzdxtVar, ScheduledExecutorService scheduledExecutorService, zzeaw zzeawVar, zzftx zzftxVar, zzelr zzelrVar, zzdwo zzdwoVar, zzemc zzemcVar, zzfmn zzfmnVar, zzear zzearVar, zzebz zzebzVar, zzdct zzdctVar) {
        this.a = context;
        this.b = zzdttVar;
        this.c = zzbboVar;
        this.d = versionInfoParcel;
        this.e = zzaVar;
        this.f = zzbiqVar;
        this.g = o24Var;
        this.h = zzfmjVar.j;
        this.i = zzdvfVar;
        this.j = zzdxtVar;
        this.k = scheduledExecutorService;
        this.m = zzeawVar;
        this.n = zzftxVar;
        this.o = zzelrVar;
        this.l = zzdwoVar;
        this.p = zzemcVar;
        this.q = zzfmnVar;
        this.r = zzearVar;
        this.s = zzebzVar;
        this.t = zzdctVar;
    }

    public static final zzew f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new zzew(strOptString, strOptString2);
    }

    public final ListenableFuture a(JSONArray jSONArray, boolean z, boolean z2, zzeaf zzeafVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzheh.a(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.c3)).booleanValue()) {
            rl3.n(zzeafVar.a, this.r);
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(b(jSONArray.optJSONObject(i), z, null));
        }
        return zzheh.i(zzheh.j(arrayList), xm4.k, this.g);
    }

    public final ListenableFuture b(JSONObject jSONObject, boolean z, zzeaf zzeafVar) {
        if (jSONObject == null) {
            return nu4.b;
        }
        HashMap map = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.e5)).booleanValue()) {
            if (jSONObject.has((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.f5))) {
                map = new HashMap();
                for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.g5)).split(",")) {
                    try {
                        map.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        HashMap map2 = map;
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) && map2 == null) {
            return nu4.b;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.c3)).booleanValue() && zzeafVar != null) {
            rl3.n(zzeafVar.a, this.r);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z || map2 != null) {
            return zzheh.a(new zzbmr(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, map2));
        }
        final zzdtt zzdttVar = this.b;
        Executor executor = zzdttVar.c;
        return e("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), zzheh.i((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.s7)).booleanValue() && strOptString != null && strOptString.startsWith("data:")) ? zzheh.c(executor, new Callable() { // from class: aa4
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzdtt zzdttVar2 = zzdttVar;
                zzdttVar2.getClass();
                String str2 = strOptString;
                int iIndexOf = str2.indexOf(",");
                if (iIndexOf == -1) {
                    d.r("Bad data URL: no ',' found for base64 data");
                    return null;
                }
                if (!str2.substring(0, iIndexOf).endsWith(";base64")) {
                    d.r("Bad data URL: only base64 is supported");
                    return null;
                }
                int iIndexOf2 = str2.indexOf(":");
                int iIndexOf3 = str2.indexOf(";");
                if (iIndexOf2 != -1 && str2.substring(iIndexOf2 + 1, iIndexOf3).startsWith("image/")) {
                    return zzdttVar2.a(Base64.decode(str2.substring(iIndexOf + 1), 0), dOptDouble, zOptBoolean);
                }
                d.r("Bad data URL: only image media is supported");
                return null;
            }
        }) : zzheh.i(zzdttVar.a.zza(strOptString), new zzgvq() { // from class: ba4
            @Override // com.google.android.gms.internal.ads.zzgvq
            public final /* synthetic */ Object apply(Object obj) {
                zzdtt zzdttVar2 = zzdttVar;
                zzdttVar2.getClass();
                return zzdttVar2.a(((zzatw) obj).b, dOptDouble, zOptBoolean);
            }
        }, executor), new zzgvq() { // from class: ja4
            @Override // com.google.android.gms.internal.ads.zzgvq
            public final /* synthetic */ Object apply(Object obj) {
                return new zzbmr(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, null);
            }
        }, this.g));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    public final ut4 d(JSONObject jSONObject, zzflq zzflqVar, zzflt zzfltVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcem zzcemVar) {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        zzdvf zzdvfVar;
        String strOptString = jSONObject.optString("base_url");
        String strOptString2 = jSONObject.optString(CreativeInfo.al);
        int i = 0;
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        if (iOptInt == 0) {
            if (iOptInt2 == 0) {
                zzrVar = com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            zzdvfVar = this.i;
            zzdvfVar.getClass();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.c3)).booleanValue()) {
                rl3.n("native-assets-loading-video-composition-start", zzdvfVar.j);
            }
            ut4 ut4VarH = zzheh.h(nu4.b, new ka4(zzdvfVar, zzrVar, zzflqVar, zzfltVar, zzbVar, zzcemVar, strOptString, strOptString2, 1), zzdvfVar.b);
            return zzheh.h(ut4VarH, new la4(ut4VarH, 1), zzcgv.h);
        }
        i = iOptInt;
        zzrVar = new com.google.android.gms.ads.internal.client.zzr(this.a, new AdSize(i, iOptInt2));
        zzdvfVar = this.i;
        zzdvfVar.getClass();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.c3)).booleanValue()) {
            rl3.n("native-assets-loading-video-composition-start", zzdvfVar.j);
        }
        ut4 ut4VarH2 = zzheh.h(nu4.b, new ka4(zzdvfVar, zzrVar, zzflqVar, zzfltVar, zzbVar, zzcemVar, strOptString, strOptString2, 1), zzdvfVar.b);
        return zzheh.h(ut4VarH2, new la4(ut4VarH2, 1), zzcgv.h);
    }

    public final gu4 e(String str, boolean z, ListenableFuture listenableFuture) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.d3)).booleanValue()) {
            zzcgy.a(listenableFuture, str, this.g);
        }
        return z ? zzheh.h(listenableFuture, new ma4(0, listenableFuture), zzcgv.h) : zzheh.f(listenableFuture, Exception.class, new b64(1), zzcgv.h);
    }

    public static Integer c(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }
}
