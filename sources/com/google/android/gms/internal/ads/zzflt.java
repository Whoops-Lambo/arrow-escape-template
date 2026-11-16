package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.util.zzbp;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.uy3;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzflt {
    public final List a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final long g;
    public final boolean h;
    public final String i;
    public final zzfls j;
    public final Bundle k;
    public final String l;
    public final String m;
    public final String n;
    public final JSONObject o;
    public final JSONObject p;
    public final String q;
    public final int r;
    public final long s;
    public final long t;

    /* JADX WARN: Code duplicated, block: B:51:0x0118  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public zzflt(JsonReader jsonReader) throws JSONException, IOException {
        String str;
        List listZzb = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = "";
        int iNextInt = 0;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        boolean zNextBoolean = false;
        zzfls zzflsVar = null;
        long j = -1;
        long j2 = -1;
        long jNextLong = 0;
        int iNextInt2 = -1;
        int iMax = 1;
        int iNextInt3 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listZzb = zzbp.zzb(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (com.safedk.android.analytics.brandsafety.c.g.equals(strNextName)) {
                iNextInt3 = jsonReader.nextInt();
            } else {
                if ("latency".equals(strNextName)) {
                    jNextLong = jsonReader.nextLong();
                } else {
                    str = str2;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.O9)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        zzfls zzflsVar2 = new zzfls();
                        jsonReader.beginObject();
                        String strNextString8 = str;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            int iHashCode = strNextName2.hashCode();
                            long j3 = j;
                            if (iHashCode != -1724546052) {
                                if (iHashCode == 3059181 && strNextName2.equals(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE)) {
                                    jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName2.equals(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION)) {
                                strNextString8 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                            j = j3;
                        }
                        jsonReader.endObject();
                        zzflsVar2.a = strNextString8;
                        zzflsVar = zzflsVar2;
                    } else {
                        long j4 = j;
                        if ("bidding_data".equals(strNextName)) {
                            strNextString3 = jsonReader.nextString();
                        } else {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.hc)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                                jsonReader.nextBoolean();
                            } else if ("adapter_response_replacement_key".equals(strNextName)) {
                                strNextString7 = jsonReader.nextString();
                            } else if ("response_info_extras".equals(strNextName)) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.X7)).booleanValue()) {
                                    try {
                                        try {
                                            Bundle bundleZzl = zzbp.zzl(zzbp.zzd(jsonReader));
                                            if (bundleZzl != null) {
                                                bundle = bundleZzl;
                                            }
                                        } catch (IllegalStateException unused) {
                                            jsonReader.skipValue();
                                        }
                                    } catch (IOException | JSONException unused2) {
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if ("adRequestPostBody".equals(strNextName)) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Va)).booleanValue()) {
                                    strNextString5 = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if ("adRequestUrl".equals(strNextName)) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Va)).booleanValue()) {
                                    strNextString4 = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else {
                                uy3 uy3Var = zzbjr.Wa;
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                                    strNextString6 = jsonReader.nextString();
                                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                                    jSONObject = zzbp.zzd(jsonReader);
                                } else if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                    iMax = Math.max(1, jsonReader.nextInt());
                                } else {
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.eb)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                        jSONObject2 = zzbp.zzd(jsonReader);
                                    } else {
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.W2)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                            try {
                                                Bundle bundleZzl2 = zzbp.zzl(zzbp.zzd(jsonReader));
                                                if (bundleZzl2 != null) {
                                                    double d = bundleZzl2.getDouble("start_time");
                                                    long j5 = (d > 9.223372036854776E18d || d < -9.223372036854776E18d) ? -1L : (long) d;
                                                    try {
                                                        double d2 = bundleZzl2.getDouble("end_time");
                                                        j = (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) ? -1L : (long) d2;
                                                        j2 = j5;
                                                    } catch (IOException | JSONException unused3) {
                                                        j2 = j5;
                                                        j = j4;
                                                    } catch (IllegalStateException unused4) {
                                                        j2 = j5;
                                                        jsonReader.skipValue();
                                                        j = j4;
                                                    }
                                                }
                                            } catch (IllegalStateException unused5) {
                                            }
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    }
                                }
                            }
                        }
                        j = j4;
                    }
                }
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j6 = j;
        jsonReader.endObject();
        this.a = listZzb;
        this.c = iNextInt;
        if (((Boolean) zzbly.e.c()).booleanValue()) {
            this.d = -1;
        } else {
            zzblb zzblbVar = zzblg.a;
            if (((Long) zzblbVar.c()).longValue() > -1) {
                this.d = ((Long) zzblbVar.c()).intValue();
            } else {
                this.d = iNextInt2;
            }
        }
        this.b = strNextString;
        this.e = strNextString2;
        this.f = iNextInt3;
        this.g = jNextLong;
        this.j = zzflsVar;
        this.h = zNextBoolean;
        this.i = strNextString3;
        this.k = bundle;
        this.l = strNextString4;
        this.m = strNextString5;
        this.n = strNextString6;
        this.o = jSONObject;
        this.p = jSONObject2;
        this.q = strNextString7;
        zzblb zzblbVar2 = zzblw.a;
        this.r = ((Long) zzblbVar2.c()).longValue() > 0 ? ((Long) zzblbVar2.c()).intValue() : iMax;
        this.s = j2;
        this.t = j6;
    }
}
