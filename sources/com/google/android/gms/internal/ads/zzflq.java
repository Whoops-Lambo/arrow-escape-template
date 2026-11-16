package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.JsonReader;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.ads.internal.util.zzbp;
import com.ironsource.C4664b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.ar4;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzflq {
    public final zzceo A;
    public final List A0;
    public final String B;
    public final boolean B0;
    public final JSONObject C;
    public final w C0;
    public final JSONObject D;
    public final boolean D0;
    public final String E;
    public final int E0;
    public final String F;
    public final String F0;
    public final String G;
    public final String G0;
    public final String H;
    public final Bundle H0;
    public final String I;
    public final boolean I0;
    public final boolean J;
    public final String J0;
    public final boolean K;
    public final JSONArray K0;
    public final boolean L;
    public final int L0;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final String U;
    public final zzfmm V;
    public final boolean W;
    public final boolean X;
    public final int Y;
    public final String Z;
    public final List a;
    public final int a0;
    public final int b;
    public final String b0;
    public final List c;
    public final boolean c0;
    public final List d;
    public final zzcal d0;
    public final int e;
    public final com.google.android.gms.ads.internal.client.zzt e0;
    public final List f;
    public final String f0;
    public final List g;
    public final boolean g0;
    public final List h;
    public final JSONObject h0;
    public final List i;
    public final boolean i0;
    public final String j;
    public final JSONObject j0;
    public final String k;
    public final boolean k0;
    public final zzcdf l;
    public final String l0;
    public final List m;
    public final boolean m0;
    public final List n;
    public final String n0;
    public final List o;
    public final String o0;
    public final List p;
    public final String p0;
    public final int q;
    public final boolean q0;
    public final List r;
    public final boolean r0;
    public final zzflv s;
    public final int s0;
    public final List t;
    public final String t0;
    public final List u;
    public final List u0;
    public final JSONObject v;
    public final boolean v0;
    public final String w;
    public final Map w0;
    public final String x;
    public final com.google.android.gms.ads.internal.util.client.zzv x0;
    public final String y;
    public final com.google.android.gms.ads.internal.util.client.zzw y0;
    public final String z;
    public final double z0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:360:0x0999 A[PHI: r8 r17 r103 r104 r105
  0x0999: PHI (r8v20 int) = (r8v15 int), (r8v16 int), (r8v17 int), (r8v18 int), (r8v19 int), (r8v22 int) binds: [B:377:0x0a31, B:374:0x0a15, B:371:0x09fa, B:365:0x09cb, B:362:0x09b0, B:359:0x0995] A[DONT_GENERATE, DONT_INLINE]
  0x0999: PHI (r17v16 java.util.List) = 
  (r17v11 java.util.List)
  (r17v12 java.util.List)
  (r17v13 java.util.List)
  (r17v14 java.util.List)
  (r17v15 java.util.List)
  (r17v18 java.util.List)
 binds: [B:377:0x0a31, B:374:0x0a15, B:371:0x09fa, B:365:0x09cb, B:362:0x09b0, B:359:0x0995] A[DONT_GENERATE, DONT_INLINE]
  0x0999: PHI (r103v14 java.util.List) = 
  (r103v9 java.util.List)
  (r103v10 java.util.List)
  (r103v11 java.util.List)
  (r103v12 java.util.List)
  (r103v13 java.util.List)
  (r103v16 java.util.List)
 binds: [B:377:0x0a31, B:374:0x0a15, B:371:0x09fa, B:365:0x09cb, B:362:0x09b0, B:359:0x0995] A[DONT_GENERATE, DONT_INLINE]
  0x0999: PHI (r104v14 java.util.List) = 
  (r104v9 java.util.List)
  (r104v10 java.util.List)
  (r104v11 java.util.List)
  (r104v12 java.util.List)
  (r104v13 java.util.List)
  (r104v16 java.util.List)
 binds: [B:377:0x0a31, B:374:0x0a15, B:371:0x09fa, B:365:0x09cb, B:362:0x09b0, B:359:0x0995] A[DONT_GENERATE, DONT_INLINE]
  0x0999: PHI (r105v14 java.util.List) = 
  (r105v9 java.util.List)
  (r105v10 java.util.List)
  (r105v11 java.util.List)
  (r105v12 java.util.List)
  (r105v13 java.util.List)
  (r105v16 java.util.List)
 binds: [B:377:0x0a31, B:374:0x0a15, B:371:0x09fa, B:365:0x09cb, B:362:0x09b0, B:359:0x0995] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:410:0x0b93 A[PHI: r8 r17 r103 r104 r105
  0x0b93: PHI (r8v54 int) = 
  (r8v7 int)
  (r8v8 int)
  (r8v9 int)
  (r8v10 int)
  (r8v11 int)
  (r8v12 int)
  (r8v13 int)
  (r8v14 int)
  (r8v20 int)
  (r8v55 int)
 binds: [B:408:0x0b8b, B:405:0x0b6c, B:402:0x0b4d, B:396:0x0b19, B:393:0x0afd, B:390:0x0ae1, B:387:0x0ac3, B:380:0x0a8c, B:360:0x0999, B:12:0x010d] A[DONT_GENERATE, DONT_INLINE]
  0x0b93: PHI (r17v77 java.util.List) = 
  (r17v3 java.util.List)
  (r17v4 java.util.List)
  (r17v5 java.util.List)
  (r17v6 java.util.List)
  (r17v7 java.util.List)
  (r17v8 java.util.List)
  (r17v9 java.util.List)
  (r17v10 java.util.List)
  (r17v16 java.util.List)
  (r17v78 java.util.List)
 binds: [B:408:0x0b8b, B:405:0x0b6c, B:402:0x0b4d, B:396:0x0b19, B:393:0x0afd, B:390:0x0ae1, B:387:0x0ac3, B:380:0x0a8c, B:360:0x0999, B:12:0x010d] A[DONT_GENERATE, DONT_INLINE]
  0x0b93: PHI (r103v55 java.util.List) = 
  (r103v1 java.util.List)
  (r103v2 java.util.List)
  (r103v3 java.util.List)
  (r103v4 java.util.List)
  (r103v5 java.util.List)
  (r103v6 java.util.List)
  (r103v7 java.util.List)
  (r103v8 java.util.List)
  (r103v14 java.util.List)
  (r103v56 java.util.List)
 binds: [B:408:0x0b8b, B:405:0x0b6c, B:402:0x0b4d, B:396:0x0b19, B:393:0x0afd, B:390:0x0ae1, B:387:0x0ac3, B:380:0x0a8c, B:360:0x0999, B:12:0x010d] A[DONT_GENERATE, DONT_INLINE]
  0x0b93: PHI (r104v71 java.util.List) = 
  (r104v1 java.util.List)
  (r104v2 java.util.List)
  (r104v3 java.util.List)
  (r104v4 java.util.List)
  (r104v5 java.util.List)
  (r104v6 java.util.List)
  (r104v7 java.util.List)
  (r104v8 java.util.List)
  (r104v14 java.util.List)
  (r104v72 java.util.List)
 binds: [B:408:0x0b8b, B:405:0x0b6c, B:402:0x0b4d, B:396:0x0b19, B:393:0x0afd, B:390:0x0ae1, B:387:0x0ac3, B:380:0x0a8c, B:360:0x0999, B:12:0x010d] A[DONT_GENERATE, DONT_INLINE]
  0x0b93: PHI (r105v56 java.util.List) = 
  (r105v1 java.util.List)
  (r105v2 java.util.List)
  (r105v3 java.util.List)
  (r105v4 java.util.List)
  (r105v5 java.util.List)
  (r105v6 java.util.List)
  (r105v7 java.util.List)
  (r105v8 java.util.List)
  (r105v14 java.util.List)
  (r105v57 java.util.List)
 binds: [B:408:0x0b8b, B:405:0x0b6c, B:402:0x0b4d, B:396:0x0b19, B:393:0x0afd, B:390:0x0ae1, B:387:0x0ac3, B:380:0x0a8c, B:360:0x0999, B:12:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public zzflq(JsonReader jsonReader) throws JSONException, IOException {
        List list;
        List list2;
        int i;
        zzeca zzecaVar;
        List listZzb = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        ar4 ar4Var = zzgzb.b;
        w wVar = w.e;
        HashMap map = new HashMap();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int i2 = 1;
        List listZzb2 = listZzb;
        List listA = listZzb2;
        List listZzb3 = listA;
        List listA2 = listZzb3;
        JSONObject jSONObjectZzd = jSONObject;
        JSONObject jSONObjectZzd2 = jSONObject2;
        JSONObject jSONObjectZzd3 = jSONObject3;
        JSONObject jSONObjectZzd4 = jSONObject4;
        JSONObject jSONObjectZzd5 = jSONObject5;
        JSONObject jSONObjectZzd6 = jSONObject6;
        List listZzb4 = wVar;
        List listZzb5 = listZzb4;
        List listF = listZzb5;
        Map mapZzc = map;
        Bundle bundle2 = bundle;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String string = strNextString5;
        String strNextString6 = string;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        String strNextString19 = strNextString18;
        String strNextString20 = strNextString19;
        String strNextString21 = strNextString20;
        String strNextString22 = strNextString21;
        boolean zNextBoolean = true;
        double dNextDouble = 0.0d;
        int i3 = 0;
        int i4 = 0;
        zzcdf zzcdfVarD = null;
        int iNextInt = 0;
        zzflv zzflvVar = null;
        zzceo zzceoVar = null;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        boolean zNextBoolean8 = false;
        int i5 = -1;
        int iNextInt2 = 0;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        boolean zNextBoolean11 = false;
        int iNextInt3 = 0;
        int iNextInt4 = -1;
        boolean zNextBoolean12 = false;
        zzcal zzcalVar = null;
        com.google.android.gms.ads.internal.client.zzt zztVarZza = null;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        String strNextString23 = null;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        boolean zNextBoolean19 = false;
        int iNextInt5 = 0;
        boolean zNextBoolean20 = false;
        com.google.android.gms.ads.internal.util.client.zzv zzvVarZzb = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVarZzd = null;
        int i6 = 2;
        boolean zNextBoolean21 = false;
        boolean zNextBoolean22 = false;
        int iNextInt6 = -1;
        JSONArray jSONArrayZze = null;
        List listZzb6 = listA2;
        List listZzb7 = listZzb6;
        List listZzb8 = listZzb7;
        List listZzb9 = listZzb8;
        List listZzb10 = listZzb9;
        List listZzb11 = listZzb10;
        List listZzb12 = listZzb11;
        List listZzb13 = listZzb12;
        List listZzb14 = listZzb13;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            String str2 = "id";
            switch (str.hashCode()) {
                case -2138196627:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str3 = str;
                    listZzb13 = listZzb13;
                    if (str3.equals("ad_source_instance_name")) {
                        strNextString14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1980587809:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str4 = str;
                    listZzb13 = listZzb13;
                    if (str4.equals("debug_signals")) {
                        jSONObjectZzd2 = zzbp.zzd(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1965512151:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str5 = str;
                    listZzb13 = listZzb13;
                    if (str5.equals("omid_settings")) {
                        jSONObjectZzd4 = zzbp.zzd(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1964744830:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str6 = str;
                    listZzb13 = listZzb13;
                    if (str6.equals("offline_ad_config") && ((Boolean) zzbjr.ea.f()).booleanValue()) {
                        zzwVarZzd = com.google.android.gms.ads.internal.util.client.zzw.zzd(zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1871425831:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str7 = str;
                    listZzb13 = listZzb13;
                    if (str7.equals("recursive_server_response_data")) {
                        strNextString17 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1843156475:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str8 = str;
                    listZzb13 = listZzb13;
                    if (str8.equals("is_consent")) {
                        zNextBoolean19 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1840512279:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str9 = str;
                    listZzb13 = listZzb13;
                    if (str9.equals("presentation_urls")) {
                        listZzb5 = zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1828733410:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str10 = str;
                    listZzb13 = listZzb13;
                    if (str10.equals("network_ping_config") && ((Boolean) zzbjr.ca.f()).booleanValue()) {
                        zzvVarZzb = com.google.android.gms.ads.internal.util.client.zzv.zzb(zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1812055556:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str11 = str;
                    listZzb13 = listZzb13;
                    if (str11.equals("play_prewarm_options")) {
                        JSONObject jSONObjectZzd7 = zzbp.zzd(jsonReader);
                        zzcal zzcalVar2 = new zzcal(jSONObjectZzd7.optBoolean("enable_prewarming", false), jSONObjectZzd7.optString("prefetch_url", ""), jSONObjectZzd7.optBoolean("skip_offline_notification_flow", false), jSONObjectZzd7.optBoolean("enable_hsdp_service", false), jSONObjectZzd7.optString("target_package", ""), jSONObjectZzd7.optInt("hsdp_invocation_callback_bitmask", 0), jSONObjectZzd7.optString("referrer", ""), jSONObjectZzd7.optString("extra_query_params", JsonUtils.EMPTY_JSON));
                        listZzb14 = list2;
                        listZzb11 = list;
                        zzcalVar = zzcalVar2;
                    } else {
                        jsonReader.skipValue();
                        listZzb14 = list2;
                        listZzb11 = list;
                    }
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1785028569:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str12 = str;
                    listZzb13 = listZzb13;
                    if (str12.equals("parallel_key")) {
                        strNextString19 = jsonReader.nextString();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1776946669:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str13 = str;
                    listZzb13 = listZzb13;
                    if (str13.equals("ad_source_name")) {
                        strNextString12 = jsonReader.nextString();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1732897806:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str14 = str;
                    listZzb13 = listZzb13;
                    if (!str14.equals("post_click_lifecycle_interaction_macroed_params")) {
                        jsonReader.skipValue();
                    } else if (((Boolean) zzbjr.Me.f()).booleanValue()) {
                        strNextString21 = jsonReader.nextString();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1662989631:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    i = i2;
                    String str15 = str;
                    listZzb13 = listZzb13;
                    if (str15.equals("is_interscroller")) {
                        zNextBoolean13 = jsonReader.nextBoolean();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1620552059:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str16 = str;
                    listZzb13 = listZzb13;
                    if (str16.equals("preload_sort_type")) {
                        int iNextInt7 = jsonReader.nextInt();
                        i = 1;
                        int[] iArr = {1, 2, 3};
                        int i7 = 0;
                        while (true) {
                            if (i7 < 3) {
                                int i8 = iArr[i7];
                                int i9 = i8 - 1;
                                if (i8 == 0) {
                                    throw null;
                                }
                                if (i9 == iNextInt7) {
                                    i6 = i8;
                                } else {
                                    i7++;
                                }
                            } else {
                                i6 = 2;
                            }
                        }
                        listZzb14 = list2;
                        listZzb11 = list;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    } else {
                        i = 1;
                        listZzb14 = list2;
                        listZzb11 = list;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    break;
                case -1620470467:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str17 = str;
                    listZzb13 = listZzb13;
                    if (str17.equals("backend_query_id")) {
                        strNextString9 = jsonReader.nextString();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1550155393:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str18 = str;
                    listZzb13 = listZzb13;
                    if (str18.equals("nofill_urls")) {
                        listZzb13 = zzbp.zzb(jsonReader);
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1456307492:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str19 = str;
                    listZzb13 = listZzb13;
                    if (str19.equals("post_click_lifecycle_interaction_label")) {
                        if (((Boolean) zzbjr.Me.f()).booleanValue()) {
                            strNextString20 = jsonReader.nextString();
                            listZzb14 = list2;
                            listZzb11 = list;
                            i = 1;
                            i2 = i;
                            listZzb13 = listZzb13;
                            listZzb12 = listZzb12;
                        } else {
                            jsonReader.skipValue();
                            i = 1;
                            listZzb14 = list2;
                            listZzb11 = list;
                            i2 = i;
                            listZzb13 = listZzb13;
                            listZzb12 = listZzb12;
                        }
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1440104884:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str20 = str;
                    listZzb13 = listZzb13;
                    if (str20.equals("is_custom_close_blocked")) {
                        zNextBoolean7 = jsonReader.nextBoolean();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1439500848:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str21 = str;
                    listZzb13 = listZzb13;
                    if (str21.equals(C4664b4.i.n)) {
                        String strNextString24 = jsonReader.nextString();
                        i5 = C4664b4.i.C.equalsIgnoreCase(strNextString24) ? 6 : C4664b4.i.D.equalsIgnoreCase(strNextString24) ? 7 : -1;
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1428969291:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str22 = str;
                    listZzb13 = listZzb13;
                    if (str22.equals("enable_omid")) {
                        zNextBoolean9 = jsonReader.nextBoolean();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1406227629:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str23 = str;
                    listZzb13 = listZzb13;
                    if (str23.equals("buffer_click_url_as_ready_to_ping")) {
                        zNextBoolean17 = jsonReader.nextBoolean();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1403779768:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str24 = str;
                    listZzb13 = listZzb13;
                    if (str24.equals("showable_impression_type")) {
                        iNextInt3 = jsonReader.nextInt();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1375413093:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str25 = str;
                    listZzb13 = listZzb13;
                    if (str25.equals("ad_cover")) {
                        jSONObjectZzd5 = zzbp.zzd(jsonReader);
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1360811658:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str26 = str;
                    listZzb13 = listZzb13;
                    if (str26.equals("ad_sizes")) {
                        listA2 = zzflr.a(jsonReader);
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1306015996:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str27 = str;
                    listZzb13 = listZzb13;
                    if (str27.equals("adapters")) {
                        listZzb3 = zzbp.zzb(jsonReader);
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1303332046:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str28 = str;
                    listZzb13 = listZzb13;
                    if (str28.equals("test_mode_enabled")) {
                        zNextBoolean6 = jsonReader.nextBoolean();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1289032093:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str29 = str;
                    listZzb13 = listZzb13;
                    if (str29.equals(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
                        jSONObjectZzd3 = zzbp.zzd(jsonReader);
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1240082064:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str30 = str;
                    listZzb13 = listZzb13;
                    if (str30.equals("ad_event_value")) {
                        zztVarZza = com.google.android.gms.ads.internal.client.zzt.zza(zzbp.zzd(jsonReader));
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1234181075:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str31 = str;
                    listZzb13 = listZzb13;
                    if (str31.equals("allow_pub_rendered_attribution")) {
                        zNextBoolean2 = jsonReader.nextBoolean();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1168140544:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str32 = str;
                    listZzb13 = listZzb13;
                    if (str32.equals("presentation_error_urls")) {
                        listZzb14 = zzbp.zzb(jsonReader);
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1152230954:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str33 = str;
                    listZzb13 = listZzb13;
                    if (str33.equals("ad_type")) {
                        String strNextString25 = jsonReader.nextString();
                        i3 = "banner".equals(strNextString25) ? 1 : "interstitial".equals(strNextString25) ? 2 : "native_express".equals(strNextString25) ? 3 : "native".equals(strNextString25) ? 4 : "rewarded".equals(strNextString25) ? 5 : "app_open_ad".equals(strNextString25) ? 6 : "rewarded_interstitial".equals(strNextString25) ? 7 : 0;
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1146534047:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str34 = str;
                    listZzb13 = listZzb13;
                    if (str34.equals("is_scroll_aware")) {
                        zNextBoolean11 = jsonReader.nextBoolean();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1115838944:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str35 = str;
                    listZzb13 = listZzb13;
                    if (str35.equals("fill_urls")) {
                        listZzb12 = zzbp.zzb(jsonReader);
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1081936678:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str36 = str;
                    listZzb13 = listZzb13;
                    if (str36.equals("allocation_id")) {
                        strNextString3 = jsonReader.nextString();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1078050970:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str37 = str;
                    listZzb13 = listZzb13;
                    if (str37.equals("video_complete_urls")) {
                        listZzb11 = zzbp.zzb(jsonReader);
                        listZzb14 = list2;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -1051269058:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str38 = str;
                    listZzb13 = listZzb13;
                    if (str38.equals("active_view")) {
                        string = zzbp.zzd(jsonReader).toString();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -982608540:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str39 = str;
                    listZzb13 = listZzb13;
                    if (str39.equals("valid_from_timestamp")) {
                        strNextString2 = jsonReader.nextString();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -972056451:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str40 = str;
                    listZzb13 = listZzb13;
                    if (str40.equals("ad_source_instance_id")) {
                        strNextString15 = jsonReader.nextString();
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -776859333:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    list2 = listZzb14;
                    String str41 = str;
                    listZzb13 = listZzb13;
                    if (str41.equals("click_urls")) {
                        listZzb6 = zzbp.zzb(jsonReader);
                        listZzb14 = list2;
                        listZzb11 = list;
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -652881372:
                    JsonReader jsonReader2 = jsonReader;
                    if (str.equals("on_device_storage_configs")) {
                        if (((Boolean) zzbjr.X8.f()).booleanValue()) {
                            ar4 ar4Var2 = zzgzb.b;
                            zzgyy zzgyyVar = new zzgyy();
                            jsonReader2.beginArray();
                            while (jsonReader2.hasNext()) {
                                w wVar2 = w.e;
                                jsonReader2.beginObject();
                                w wVarF = wVar2;
                                Long lValueOf = null;
                                while (jsonReader2.hasNext()) {
                                    Long l = lValueOf;
                                    String strNextName2 = jsonReader2.nextName();
                                    if (Objects.equals(strNextName2, str2)) {
                                        lValueOf = Long.valueOf(jsonReader2.nextLong());
                                    } else {
                                        String str42 = str2;
                                        if (Objects.equals(strNextName2, "event_types")) {
                                            zzgyy zzgyyVar2 = new zzgyy();
                                            jsonReader2.beginArray();
                                            while (jsonReader2.hasNext()) {
                                                zzgyyVar2.c(Integer.valueOf(jsonReader2.nextInt()));
                                            }
                                            jsonReader2.endArray();
                                            wVarF = zzgyyVar2.f();
                                        } else {
                                            jsonReader2.skipValue();
                                        }
                                        lValueOf = l;
                                        str2 = str42;
                                    }
                                }
                                Long l2 = lValueOf;
                                String str43 = str2;
                                jsonReader2.endObject();
                                if (l2 == null || wVarF.isEmpty()) {
                                    zzecaVar = null;
                                } else {
                                    long jLongValue = l2.longValue();
                                    w wVar3 = wVarF;
                                    int i10 = wVar3.d;
                                    int[] iArr2 = new int[i10];
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        iArr2[i11] = ((Integer) wVar3.get(i11)).intValue();
                                    }
                                    zzecaVar = new zzeca(iArr2, jLongValue);
                                }
                                if (zzecaVar != null) {
                                    zzgyyVar.c(zzecaVar);
                                }
                                jsonReader2 = jsonReader;
                                listZzb13 = listZzb13;
                                str2 = str43;
                                listZzb14 = listZzb14;
                                listZzb12 = listZzb12;
                                listZzb11 = listZzb11;
                            }
                            list = listZzb11;
                            listZzb12 = listZzb12;
                            listZzb13 = listZzb13;
                            jsonReader.endArray();
                            listF = zzgyyVar.f();
                            listZzb11 = list;
                            i = 1;
                            i2 = i;
                            listZzb13 = listZzb13;
                            listZzb12 = listZzb12;
                        } else {
                            list = listZzb11;
                            listZzb12 = listZzb12;
                            listZzb13 = listZzb13;
                            list2 = listZzb14;
                            jsonReader.skipValue();
                            i = 1;
                            listZzb14 = list2;
                            listZzb11 = list;
                            i2 = i;
                            listZzb13 = listZzb13;
                            listZzb12 = listZzb12;
                        }
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -570101180:
                    if (str.equals("late_load_urls")) {
                        listZzb12 = listZzb12;
                        listZzb13 = listZzb13;
                        listZzb4 = zzbp.zzb(jsonReader);
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = 1;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -544216775:
                    if (str.equals("safe_browsing")) {
                        JSONObject jSONObjectZzd8 = zzbp.zzd(jsonReader);
                        Parcelable.Creator<zzceo> creator = zzceo.CREATOR;
                        listZzb12 = listZzb12;
                        listZzb13 = listZzb13;
                        zzceoVar = new zzceo(jSONObjectZzd8.optString("click_string", ""), jSONObjectZzd8.optString("report_url", ""), jSONObjectZzd8.optBoolean("rendered_ad_enabled", false), jSONObjectZzd8.optBoolean("non_malicious_reporting_enabled", false), zzbp.zza(jSONObjectZzd8.optJSONArray("allowed_headers"), null), jSONObjectZzd8.optBoolean("protection_enabled", false), jSONObjectZzd8.optBoolean("malicious_reporting_enabled", false), zzbp.zza(jSONObjectZzd8.optJSONArray("webview_permissions"), null));
                        i = 1;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -437057161:
                    if (str.equals("imp_urls")) {
                        listZzb7 = zzbp.zzb(jsonReader);
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -404433734:
                    if (str.equals("rtb_native_required_assets")) {
                        jSONObjectZzd6 = zzbp.zzd(jsonReader);
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -404326515:
                    if (str.equals("render_timeout_ms")) {
                        iNextInt2 = jsonReader.nextInt();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -397704715:
                    if (str.equals("ad_close_time_ms")) {
                        iNextInt4 = jsonReader.nextInt();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -388807511:
                    if (str.equals("content_url")) {
                        strNextString23 = jsonReader.nextString();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -369773488:
                    if (str.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                        list = listZzb11;
                        listZzb12 = listZzb12;
                        listZzb13 = listZzb13;
                        list2 = listZzb14;
                        i = i2;
                        listZzb14 = list2;
                        listZzb11 = list;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -213449460:
                    if (str.equals("force_disable_hardware_acceleration")) {
                        zNextBoolean16 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -213424028:
                    if (str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                        strNextString8 = jsonReader.nextString();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -180214626:
                    if (str.equals("native_required_asset_viewability")) {
                        zNextBoolean15 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -154616268:
                    if (str.equals("is_offline_ad")) {
                        zNextBoolean14 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case -29338502:
                    if (str.equals("allow_custom_click_gesture")) {
                        zNextBoolean4 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 3107:
                    if (str.equals("ad")) {
                        zzflvVar = new zzflv(jsonReader);
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    } else {
                        list = listZzb11;
                        listZzb12 = listZzb12;
                        listZzb13 = listZzb13;
                        list2 = listZzb14;
                        i = i2;
                        listZzb14 = list2;
                        listZzb11 = list;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        strNextString4 = jsonReader.nextString();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 3076010:
                    if (str.equals("data")) {
                        jSONObjectZzd = zzbp.zzd(jsonReader);
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 37109963:
                    if (str.equals("request_id")) {
                        strNextString16 = jsonReader.nextString();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 63195984:
                    if (str.equals("render_test_label")) {
                        zNextBoolean5 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 107433883:
                    if (str.equals("qdata")) {
                        strNextString5 = jsonReader.nextString();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 230323073:
                    if (str.equals("ad_load_urls")) {
                        listZzb8 = zzbp.zzb(jsonReader);
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 281223176:
                    if (str.equals("is_secondary_analytics_logging_enabled")) {
                        zNextBoolean = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 418392395:
                    if (str.equals("is_closable_area_disabled")) {
                        zNextBoolean8 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 542250332:
                    if (str.equals("consent_form_action_identifier")) {
                        iNextInt5 = jsonReader.nextInt();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 549176928:
                    if (str.equals("presentation_error_timeout_ms")) {
                        iNextInt = jsonReader.nextInt();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 597473788:
                    if (str.equals("debug_dialog_string")) {
                        strNextString6 = jsonReader.nextString();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 639133141:
                    if (str.equals("response_info_extras_override")) {
                        if (((Boolean) zzbjr.Y7.f()).booleanValue()) {
                            try {
                                Bundle bundleZzl = zzbp.zzl(zzbp.zzd(jsonReader));
                                if (bundleZzl != null) {
                                    bundle2 = bundleZzl;
                                }
                                i = i2;
                            } catch (IllegalStateException unused) {
                                jsonReader.skipValue();
                                list = listZzb11;
                                listZzb12 = listZzb12;
                                listZzb13 = listZzb13;
                                list2 = listZzb14;
                                i = i2;
                                listZzb14 = list2;
                                listZzb11 = list;
                            }
                            i2 = i;
                            listZzb13 = listZzb13;
                            listZzb12 = listZzb12;
                        } else {
                            jsonReader.skipValue();
                        }
                        list = listZzb11;
                        listZzb12 = listZzb12;
                        listZzb13 = listZzb13;
                        list2 = listZzb14;
                        i = i2;
                        listZzb14 = list2;
                        listZzb11 = list;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 754887508:
                    if (str.equals("container_sizes")) {
                        listA = zzflr.a(jsonReader);
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 791122864:
                    if (str.equals("impression_type")) {
                        int iNextInt8 = jsonReader.nextInt();
                        i4 = (iNextInt8 == 0 || iNextInt8 == i2 || iNextInt8 == 3 || iNextInt8 == 4) ? iNextInt8 : 0;
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 805095541:
                    if (str.equals("analytics_event_name_to_parameters_map")) {
                        if (((Boolean) zzbjr.V0.f()).booleanValue()) {
                            mapZzc = zzbp.zzc(jsonReader);
                            i = i2;
                            i2 = i;
                            listZzb13 = listZzb13;
                            listZzb12 = listZzb12;
                        } else {
                            jsonReader.skipValue();
                            list = listZzb11;
                            listZzb12 = listZzb12;
                            listZzb13 = listZzb13;
                            list2 = listZzb14;
                            i = i2;
                            listZzb14 = list2;
                            listZzb11 = list;
                            i2 = i;
                            listZzb13 = listZzb13;
                            listZzb12 = listZzb12;
                        }
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1010584092:
                    if (str.equals(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER)) {
                        strNextString = jsonReader.nextString();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1100650276:
                    if (str.equals("rewards")) {
                        zzcdfVarD = zzcdf.d(zzbp.zze(jsonReader));
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1141602460:
                    if (str.equals("adapter_response_info_key")) {
                        strNextString18 = jsonReader.nextString();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1186014765:
                    if (str.equals("cache_hit_urls")) {
                        zzbp.zzb(jsonReader);
                        list = listZzb11;
                        listZzb12 = listZzb12;
                        listZzb13 = listZzb13;
                        list2 = listZzb14;
                        i = i2;
                        listZzb14 = list2;
                        listZzb11 = list;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1303622534:
                    if (str.equals("preload_sort_value")) {
                        listZzb12 = listZzb12;
                        listZzb13 = listZzb13;
                        i = i2;
                        dNextDouble = jsonReader.nextDouble();
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1320579560:
                    if (str.equals("base_creative_conversion_url")) {
                        if (((Boolean) zzbjr.Me.f()).booleanValue()) {
                            strNextString22 = jsonReader.nextString();
                            i = i2;
                            i2 = i;
                            listZzb13 = listZzb13;
                            listZzb12 = listZzb12;
                        } else {
                            jsonReader.skipValue();
                            list = listZzb11;
                            listZzb12 = listZzb12;
                            listZzb13 = listZzb13;
                            list2 = listZzb14;
                            i = i2;
                            listZzb14 = list2;
                            listZzb11 = list;
                            i2 = i;
                            listZzb13 = listZzb13;
                            listZzb12 = listZzb12;
                        }
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1321720943:
                    if (str.equals("allow_pub_owned_ad_view")) {
                        zNextBoolean3 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1422388341:
                    if (str.equals("is_collapsible")) {
                        zNextBoolean18 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1437255331:
                    if (str.equals(CampaignEx.JSON_KEY_AD_SOURCE_ID)) {
                        strNextString13 = jsonReader.nextString();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1556932485:
                    if (str.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        if (((Boolean) zzbjr.Ke.f()).booleanValue()) {
                            iNextInt6 = jsonReader.nextInt();
                            i = i2;
                            i2 = i;
                            listZzb13 = listZzb13;
                            listZzb12 = listZzb12;
                        } else {
                            jsonReader.skipValue();
                            list = listZzb11;
                            listZzb12 = listZzb12;
                            listZzb13 = listZzb13;
                            list2 = listZzb14;
                            i = i2;
                            listZzb14 = list2;
                            listZzb11 = list;
                            i2 = i;
                            listZzb13 = listZzb13;
                            listZzb12 = listZzb12;
                        }
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1565514205:
                    if (str.equals("adapter_only_third_party_impression")) {
                        zNextBoolean22 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1637553475:
                    if (str.equals("bid_response")) {
                        strNextString7 = jsonReader.nextString();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1638957285:
                    if (str.equals("video_start_urls")) {
                        listZzb9 = zzbp.zzb(jsonReader);
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1686319423:
                    if (str.equals("ad_network_class_name")) {
                        strNextString11 = jsonReader.nextString();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1688341040:
                    if (str.equals("video_reward_urls")) {
                        listZzb10 = zzbp.zzb(jsonReader);
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1799285870:
                    if (str.equals("use_third_party_container_height")) {
                        zNextBoolean12 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1839650832:
                    if (str.equals("renderers")) {
                        listZzb = zzbp.zzb(jsonReader);
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 1875425491:
                    if (str.equals("is_analytics_logging_enabled")) {
                        zNextBoolean10 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 2004337096:
                    if (str.equals("recursive_signal_collection")) {
                        jSONArrayZze = zzbp.zze(jsonReader);
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 2068142375:
                    if (str.equals("rule_line_external_id")) {
                        strNextString10 = jsonReader.nextString();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 2072888499:
                    if (str.equals("manual_tracking_urls")) {
                        listZzb2 = zzbp.zzb(jsonReader);
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 2075506442:
                    if (str.equals("render_serially")) {
                        zNextBoolean20 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                case 2117205836:
                    if (str.equals("flow_control")) {
                        zNextBoolean21 = jsonReader.nextBoolean();
                        i = i2;
                        i2 = i;
                        listZzb13 = listZzb13;
                        listZzb12 = listZzb12;
                    }
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
                default:
                    list = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    list2 = listZzb14;
                    i = i2;
                    jsonReader.skipValue();
                    listZzb14 = list2;
                    listZzb11 = list;
                    i2 = i;
                    listZzb13 = listZzb13;
                    listZzb12 = listZzb12;
                    break;
            }
        }
        jsonReader.endObject();
        this.a = listZzb;
        this.b = i3;
        this.c = listZzb6;
        this.d = listZzb7;
        this.f = listZzb8;
        this.e = i4;
        this.g = listZzb9;
        this.h = listZzb10;
        this.i = listZzb11;
        this.j = strNextString;
        this.k = strNextString2;
        this.l = zzcdfVarD;
        this.m = listZzb12;
        this.n = listZzb13;
        this.o = listZzb14;
        this.p = listZzb2;
        this.q = iNextInt;
        this.r = listA;
        this.s = zzflvVar;
        this.t = listZzb3;
        this.u = listA2;
        this.w = strNextString3;
        this.v = jSONObjectZzd;
        this.x = strNextString4;
        this.y = strNextString5;
        this.z = string;
        this.A = zzceoVar;
        this.B = strNextString6;
        this.C = jSONObjectZzd2;
        this.D = jSONObjectZzd3;
        this.J = zNextBoolean2;
        this.K = zNextBoolean3;
        this.L = zNextBoolean4;
        this.M = zNextBoolean5;
        this.N = zNextBoolean6;
        this.O = zNextBoolean7;
        this.P = zNextBoolean8;
        this.Q = i5;
        this.R = iNextInt2;
        this.T = zNextBoolean9;
        this.U = strNextString7;
        this.V = new zzfmm(jSONObjectZzd4);
        this.W = zNextBoolean10;
        this.X = zNextBoolean11;
        this.Y = iNextInt3;
        this.Z = strNextString8;
        this.a0 = iNextInt4;
        this.b0 = strNextString9;
        this.c0 = zNextBoolean12;
        this.d0 = zzcalVar;
        this.e0 = zztVarZza;
        this.f0 = strNextString10;
        this.g0 = zNextBoolean13;
        this.h0 = jSONObjectZzd5;
        this.E = strNextString11;
        this.F = strNextString12;
        this.G = strNextString13;
        this.H = strNextString14;
        this.I = strNextString15;
        this.i0 = zNextBoolean14;
        this.j0 = jSONObjectZzd6;
        this.k0 = zNextBoolean15;
        this.l0 = strNextString23;
        this.m0 = zNextBoolean16;
        this.S = zNextBoolean17;
        this.n0 = strNextString16;
        this.o0 = strNextString17;
        this.p0 = strNextString18;
        this.q0 = zNextBoolean18;
        this.r0 = zNextBoolean19;
        this.s0 = iNextInt5;
        this.u0 = listZzb4;
        this.t0 = strNextString19;
        this.v0 = zNextBoolean20;
        this.w0 = mapZzc;
        this.x0 = zzvVarZzb;
        this.y0 = zzwVarZzd;
        this.z0 = dNextDouble;
        this.L0 = i6;
        this.A0 = listZzb5;
        this.B0 = zNextBoolean21;
        this.C0 = listF;
        this.D0 = zNextBoolean22;
        this.E0 = iNextInt6;
        this.F0 = strNextString20;
        this.G0 = strNextString21;
        this.J0 = strNextString22;
        this.H0 = bundle2;
        this.I0 = zNextBoolean;
        this.K0 = jSONArrayZze;
    }

    public final boolean b() {
        return this.i0 || this.y0 != null;
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return AdSurgeAdFormat.Constants.INTERSTITIAL_LABEL;
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }
}
