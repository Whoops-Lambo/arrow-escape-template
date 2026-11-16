package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a04;
import defpackage.g74;
import defpackage.jp4;
import defpackage.o24;
import defpackage.rl3;
import defpackage.uy3;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdac {
    public final zzehd a;
    public final zzfmj b;
    public final zzfqv c;
    public final zzcsw d;
    public final zzeqv e;
    public final zzdjr f;
    public zzfmb g;
    public final zzeio h;
    public final zzddh i;
    public final Executor j;
    public final zzehz k;
    public final zzeni l;

    public final zzfqc a(ListenableFuture listenableFuture) {
        if (this.g != null) {
            zzfqv zzfqvVar = this.c;
            zzfqp zzfqpVar = zzfqp.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfqvVar);
            return new zzfqm(zzfqvVar, zzfqpVar, null, zzfqn.d, Collections.EMPTY_LIST, zzheh.a(this.g)).d();
        }
        zzbhy zzbhyVarZzj = com.google.android.gms.ads.internal.zzt.zzj();
        zzbhyVarZzj.getClass();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.w5)).booleanValue()) {
            synchronized (zzbhyVarZzj.c) {
                try {
                    zzbhyVarZzj.d();
                    ScheduledFuture scheduledFuture = zzbhyVarZzj.a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    zzbhyVarZzj.a = zzcgv.d.schedule(zzbhyVarZzj.b, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.x5)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c.a(listenableFuture, zzfqp.SERVER_TRANSACTION).b(new a04(this.k, 4)).d();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0256  */
    /* JADX WARN: Code duplicated, block: B:105:0x0262  */
    /* JADX WARN: Code duplicated, block: B:107:0x026a  */
    /* JADX WARN: Code duplicated, block: B:110:0x027d  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:98:0x024c A[Catch: all -> 0x00fb, TryCatch #6 {all -> 0x00fb, blocks: (B:31:0x0098, B:33:0x00b5, B:35:0x00bd, B:37:0x00ca, B:39:0x00e4, B:43:0x0114, B:46:0x011f, B:48:0x0127, B:50:0x012d, B:54:0x0136, B:63:0x016e, B:57:0x014a, B:62:0x0159, B:65:0x0173, B:42:0x00fe, B:66:0x0187, B:73:0x01a6, B:76:0x01ae, B:80:0x01d0, B:82:0x01e6, B:86:0x0207, B:88:0x021c, B:91:0x0230, B:93:0x0236, B:94:0x0243, B:96:0x0246, B:99:0x024f, B:98:0x024c, B:87:0x0211, B:83:0x01f8, B:79:0x01bc, B:70:0x0195, B:71:0x019a), top: B:144:0x0098, inners: #4, #7 }] */
    public final zzfqc b() {
        com.google.android.gms.ads.internal.client.zzc zzcVar;
        zzhcz zzhczVarB;
        String strOptString;
        String strOptString2;
        String strOptString3;
        int i;
        String str;
        List listAsList;
        String string;
        zzfmj zzfmjVar = this.b;
        if (!zzfmjVar.v) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzfmjVar.d;
            if (zzmVar.zzx != null || zzmVar.zzs != null) {
                zzfqv zzfqvVar = this.c;
                zzfqp zzfqpVar = zzfqp.PRELOADED_LOADER;
                Objects.requireNonNull(zzfqvVar);
                zzehd zzehdVar = this.a;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.X2)).booleanValue()) {
                    zzehdVar.o = zzehdVar.d.t;
                    rl3.n("scar-preloader-ready", zzehdVar.i);
                }
                String strA = zzehdVar.d.d.zzx;
                if (TextUtils.isEmpty(strA)) {
                    zzcVar = zzehdVar.d.d.zzs;
                    if (zzcVar != null) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.d8)).booleanValue()) {
                            String str2 = zzcVar.zza;
                            String str3 = zzcVar.zzb;
                            strOptString = "";
                            strOptString = new JSONObject(str2).optString("request_id", "");
                            strOptString2 = "";
                            strOptString2 = new JSONObject(str3).optString("request_id", "");
                            if (TextUtils.isEmpty(strOptString2)) {
                            }
                            zzehdVar.i.a.put("ridmm", "true");
                            zzhczVarB = zzheh.b(new zzeqs(14, "Mismatch request IDs."));
                        }
                        zzhczVarB = zzehdVar.a(zzcVar.zza, zzehdVar.c(zzcVar.zzb));
                    } else {
                        zzhczVarB = zzheh.b(new zzeqs(14, "Mismatch request IDs."));
                    }
                } else {
                    String strSubstring = "";
                    try {
                        strSubstring = new JSONObject(strA).optString("request_id", "");
                    } catch (JSONException unused) {
                    }
                    uy3 uy3Var = zzbjr.l8;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).booleanValue() && strSubstring.isEmpty()) {
                        int iLastIndexOf = strA.lastIndexOf("&request_id=");
                        strSubstring = iLastIndexOf != -1 ? strA.substring(iLastIndexOf + 12) : "";
                    }
                    String str4 = strSubstring;
                    if (TextUtils.isEmpty(str4)) {
                        zzhczVarB = zzheh.b(new zzeqs(15, "Invalid ad string."));
                    } else {
                        synchronized (zzehdVar.l) {
                            try {
                                com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVarO = zzehdVar.a.o();
                                zzear zzearVar = zzehdVar.i;
                                String strZzb = zzqVarO.zzb(str4, zzearVar);
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).booleanValue() && !TextUtils.isEmpty(strZzb)) {
                                    try {
                                        JSONObject jSONObjectOptJSONObject = new JSONObject(strZzb).optJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                                        if (jSONObjectOptJSONObject != null) {
                                            String strOptString4 = jSONObjectOptJSONObject.optString("query_info_type", "");
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.n8)).booleanValue()) {
                                                listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.o8)).split(","));
                                            } else {
                                                listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.m8)).split(","));
                                            }
                                            if (listAsList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(strOptString4))) {
                                                int iLastIndexOf2 = strA.lastIndexOf(C4664b4.j.c);
                                                String strSubstring2 = iLastIndexOf2 != -1 ? strA.substring(0, iLastIndexOf2) : null;
                                                if (!TextUtils.isEmpty(strSubstring2)) {
                                                    try {
                                                        byte[] bArrDecode = Base64.decode(strSubstring2, 11);
                                                        byte[] bytes = str4.getBytes(StandardCharsets.UTF_8);
                                                        if (TextUtils.isEmpty(strZzb)) {
                                                            string = null;
                                                        } else {
                                                            try {
                                                                string = new JSONObject(strZzb).getString("arek");
                                                            } catch (JSONException e) {
                                                                com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                                                com.google.android.gms.ads.internal.zzt.zzh().d("CryptoUtils.getKeyFromQueryJsonMap", e);
                                                                string = null;
                                                            }
                                                        }
                                                        strA = zzfmz.a(bArrDecode, bytes, string, zzearVar);
                                                    } catch (IllegalArgumentException e2) {
                                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                                        com.google.android.gms.ads.internal.zzt.zzh().d("PreloadedLoader.decryptAdResponseIfNecessary", e2);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (JSONException unused2) {
                                    }
                                }
                                if (TextUtils.isEmpty(strA)) {
                                    strOptString3 = "";
                                } else {
                                    try {
                                        strOptString3 = new JSONObject(strA).optString("render_id", "");
                                    } catch (JSONException unused3) {
                                        strOptString3 = "";
                                    }
                                }
                                String str5 = strOptString3;
                                if (TextUtils.isEmpty(str5)) {
                                    i = 0;
                                    str = null;
                                } else {
                                    String str6 = "";
                                    try {
                                        str6 = new String(Base64.decode(str5, 0), StandardCharsets.UTF_8);
                                    } catch (IllegalArgumentException e3) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str5)));
                                        com.google.android.gms.ads.internal.zzt.zzh().d("PreloadedLoader.decodeRenderId", e3);
                                    }
                                    List listC = zzgwo.a(new jp4(':')).c(str6);
                                    if (listC.size() == 2) {
                                        str = (String) listC.get(0);
                                        i = Integer.parseInt((String) listC.get(1));
                                    } else {
                                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str5)));
                                        i = 0;
                                        str = null;
                                    }
                                }
                                Pair pair = str != null ? new Pair(str, Integer.valueOf(i)) : new Pair("", 0);
                                String str7 = (String) pair.first;
                                int iIntValue = ((Integer) pair.second).intValue();
                                if (TextUtils.isEmpty(str7) || iIntValue <= 0) {
                                    zzqVarO.zzc(str4);
                                    if (TextUtils.isEmpty(strZzb)) {
                                        zzcVar = zzehdVar.d.d.zzs;
                                        if (zzcVar != null) {
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.d8)).booleanValue()) {
                                                String str8 = zzcVar.zza;
                                                String str9 = zzcVar.zzb;
                                                strOptString = "";
                                                try {
                                                    strOptString = new JSONObject(str8).optString("request_id", "");
                                                } catch (JSONException unused4) {
                                                }
                                                strOptString2 = "";
                                                try {
                                                    strOptString2 = new JSONObject(str9).optString("request_id", "");
                                                } catch (JSONException unused5) {
                                                }
                                                if (TextUtils.isEmpty(strOptString2) && strOptString.equals(strOptString2)) {
                                                    zzehdVar.a.o().zzc(strOptString);
                                                    zzehdVar.i.a.put("request_id", strOptString);
                                                } else {
                                                    zzehdVar.i.a.put("ridmm", "true");
                                                    zzhczVarB = zzheh.b(new zzeqs(14, "Mismatch request IDs."));
                                                }
                                            }
                                            zzhczVarB = zzehdVar.a(zzcVar.zza, zzehdVar.c(zzcVar.zzb));
                                        } else {
                                            zzhczVarB = zzheh.b(new zzeqs(14, "Mismatch request IDs."));
                                        }
                                    } else {
                                        zzhczVarB = zzehdVar.a(strA, zzehdVar.c(strZzb));
                                    }
                                } else if (zzqVarO.zzd(str4, str7)) {
                                    zzhczVarB = zzheh.b(new zzeqs(10, "The ad has already been shown."));
                                } else {
                                    if (!zzqVarO.zze(str4, str7, iIntValue)) {
                                        zzqVarO.zzc(str4);
                                    }
                                    if (TextUtils.isEmpty(strZzb)) {
                                        zzhczVarB = zzehdVar.a(strA, zzehdVar.c(strZzb));
                                    } else {
                                        zzcVar = zzehdVar.d.d.zzs;
                                        if (zzcVar != null) {
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.d8)).booleanValue()) {
                                                String str10 = zzcVar.zza;
                                                String str11 = zzcVar.zzb;
                                                strOptString = "";
                                                strOptString = new JSONObject(str10).optString("request_id", "");
                                                strOptString2 = "";
                                                strOptString2 = new JSONObject(str11).optString("request_id", "");
                                                if (TextUtils.isEmpty(strOptString2)) {
                                                }
                                                zzehdVar.i.a.put("ridmm", "true");
                                                zzhczVarB = zzheh.b(new zzeqs(14, "Mismatch request IDs."));
                                            }
                                            zzhczVarB = zzehdVar.a(zzcVar.zza, zzehdVar.c(zzcVar.zzb));
                                        } else {
                                            zzhczVarB = zzheh.b(new zzeqs(14, "Mismatch request IDs."));
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                return new zzfqm(zzfqvVar, zzfqpVar, null, zzfqn.d, Collections.EMPTY_LIST, zzhczVarB).d();
            }
        }
        return a(this.i.b());
    }

    public final zzfqc c(ListenableFuture listenableFuture) {
        zzfqm zzfqmVarB = this.c.a(listenableFuture, zzfqp.RENDERER).a(new g74(this, 2)).b(this.e);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.P6)).booleanValue()) {
            zzfqmVarB = zzfqmVarB.c(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Q6)).intValue());
        }
        return zzfqmVarB.d();
    }

    public zzdac(zzehd zzehdVar, zzfmj zzfmjVar, zzfqv zzfqvVar, zzcsw zzcswVar, zzeqv zzeqvVar, zzdjr zzdjrVar, zzfmb zzfmbVar, zzeio zzeioVar, zzddh zzddhVar, o24 o24Var, zzehz zzehzVar, zzeni zzeniVar) {
        this.a = zzehdVar;
        this.b = zzfmjVar;
        this.c = zzfqvVar;
        this.d = zzcswVar;
        this.e = zzeqvVar;
        this.f = zzdjrVar;
        this.g = zzfmbVar;
        this.h = zzeioVar;
        this.i = zzddhVar;
        this.j = o24Var;
        this.k = zzehzVar;
        this.l = zzeniVar;
    }
}
