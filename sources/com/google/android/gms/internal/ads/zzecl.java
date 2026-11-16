package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.g54;
import defpackage.h54;
import defpackage.n30;
import defpackage.vq0;
import defpackage.yb4;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzecl extends zzbrw {
    public final zzeco b;
    public final zzecj c;
    public final HashMap d = new HashMap();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.google.android.gms.ads.internal.client.zzm O3(Map map) {
        zzn zznVar = new zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                switch (strNextName.hashCode()) {
                    case -1289032093:
                        if (!strNextName.equals(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginObject();
                            Bundle bundle = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            zznVar.zzb(bundle);
                        }
                        break;
                    case -839117230:
                        if (!strNextName.equals("isTestDevice")) {
                            jsonReader.skipValue();
                        } else {
                            zznVar.zzd(jsonReader.nextBoolean());
                        }
                        break;
                    case -733436947:
                        if (!strNextName.equals("tagForUnderAgeOfConsent")) {
                            jsonReader.skipValue();
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zzf(0);
                        } else {
                            zznVar.zzf(1);
                        }
                        break;
                    case -99890337:
                        if (!strNextName.equals("httpTimeoutMillis")) {
                            jsonReader.skipValue();
                        } else {
                            zznVar.zzh(jsonReader.nextInt());
                        }
                        break;
                    case 523149226:
                        if (!strNextName.equals("keywords")) {
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginArray();
                            ArrayList arrayList = new ArrayList();
                            while (jsonReader.hasNext()) {
                                arrayList.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                            zznVar.zzc(arrayList);
                        }
                        break;
                    case 597632527:
                        if (!strNextName.equals("maxAdContentRating")) {
                            jsonReader.skipValue();
                        } else {
                            String strNextString = jsonReader.nextString();
                            if (RequestConfiguration.zza.contains(strNextString)) {
                                zznVar.zzg(strNextString);
                            }
                        }
                        break;
                    case 1411582723:
                        if (!strNextName.equals("tagForChildDirectedTreatment")) {
                            jsonReader.skipValue();
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zze(0);
                        } else {
                            zznVar.zze(1);
                        }
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm zzmVarZza = zznVar.zza();
        Bundle bundle2 = zzmVarZza.zzm;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = zzmVarZza.zzc;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new com.google.android.gms.ads.internal.client.zzm(zzmVarZza.zza, zzmVarZza.zzb, bundle3, zzmVarZza.zzd, zzmVarZza.zze, zzmVarZza.zzf, zzmVarZza.zzg, zzmVarZza.zzh, zzmVarZza.zzi, zzmVarZza.zzj, zzmVarZza.zzk, zzmVarZza.zzl, bundle2, zzmVarZza.zzn, zzmVarZza.zzo, zzmVarZza.zzp, zzmVarZza.zzq, zzmVarZza.zzr, zzmVarZza.zzs, zzmVarZza.zzt, zzmVarZza.zzu, zzmVarZza.zzv, zzmVarZza.zzw, zzmVarZza.zzx, zzmVarZza.zzy, zzmVarZza.zzz, zzmVarZza.zzA, zzmVarZza.zzB);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbrx
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ib)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            com.google.android.gms.ads.internal.zzt.zzc();
            Map mapZzT = com.google.android.gms.ads.internal.util.zzs.zzT(uri);
            String str2 = (String) mapZzT.get("action");
            if (TextUtils.isEmpty(str2)) {
                zzo.zzd("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            HashMap map = this.d;
            zzecj zzecjVar = this.c;
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088) {
                    String str3 = "initialize";
                    if (str2.equals("initialize")) {
                        map.clear();
                        zzecjVar.getClass();
                        zzecjVar.b(new vq0(str3));
                        return;
                    }
                }
            } else if (str2.equals("dispose_all")) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((yb4) it.next()).zzc();
                }
                map.clear();
                return;
            }
            String str4 = (String) mapZzT.get("obj_id");
            try {
                Objects.requireNonNull(str4);
                long j = Long.parseLong(str4);
                int iHashCode2 = str2.hashCode();
                String str5 = "rewarded";
                String str6 = "interstitial";
                String str7 = "creation";
                zzeco zzecoVar = this.b;
                switch (iHashCode2) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            yb4 yb4Var = (yb4) map.get(Long.valueOf(j));
                            if (yb4Var != null) {
                                yb4Var.zzb();
                                return;
                            }
                            zzo.zzd("Could not show H5 ad, object ID does not exist");
                            zzecjVar.getClass();
                            vq0 vq0Var = new vq0(str6);
                            vq0Var.a = Long.valueOf(j);
                            vq0Var.c = "onNativeAdObjectNotAvailable";
                            zzecjVar.b(vq0Var);
                            return;
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            yb4 yb4Var2 = (yb4) map.get(Long.valueOf(j));
                            if (yb4Var2 != null) {
                                yb4Var2.zzb();
                                return;
                            }
                            zzo.zzd("Could not show H5 ad, object ID does not exist");
                            zzecjVar.getClass();
                            vq0 vq0Var2 = new vq0(str5);
                            vq0Var2.a = Long.valueOf(j);
                            vq0Var2.c = "onNativeAdObjectNotAvailable";
                            zzecjVar.b(vq0Var2);
                            return;
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            yb4 yb4Var3 = (yb4) map.get(Long.valueOf(j));
                            if (yb4Var3 != null) {
                                yb4Var3.a(O3(mapZzT));
                                return;
                            }
                            zzo.zzd("Could not load H5 ad, object ID does not exist");
                            zzecjVar.getClass();
                            vq0 vq0Var3 = new vq0(str5);
                            vq0Var3.a = Long.valueOf(j);
                            vq0Var3.c = "onNativeAdObjectNotAvailable";
                            zzecjVar.b(vq0Var3);
                            return;
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            if (map.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Jb)).intValue()) {
                                zzo.zzi("Could not create H5 ad, too many existing objects");
                                zzecjVar.a(j);
                                return;
                            }
                            Long lValueOf = Long.valueOf(j);
                            if (map.containsKey(lValueOf)) {
                                zzo.zzd("Could not create H5 ad, object ID already exists");
                                zzecjVar.a(j);
                                return;
                            }
                            String str8 = (String) mapZzT.get("ad_unit");
                            if (TextUtils.isEmpty(str8)) {
                                zzo.zzi("Could not create H5 ad, missing ad unit id");
                                zzecjVar.a(j);
                                return;
                            }
                            g54 g54VarZzc = zzecoVar.zzc();
                            g54VarZzc.c(j);
                            g54VarZzc.b(str8);
                            g54 g54VarA = g54VarZzc.a();
                            long jLongValue = g54VarA.a.longValue();
                            h54 h54Var = g54VarA.d;
                            map.put(lValueOf, new zzecq(jLongValue, h54Var.a, new zzecj(h54Var.b), g54VarA.c, g54VarA.b));
                            zzecjVar.getClass();
                            vq0 vq0Var4 = new vq0(str7);
                            vq0Var4.a = Long.valueOf(j);
                            vq0Var4.c = "nativeObjectCreated";
                            zzecjVar.b(vq0Var4);
                            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 39 + str8.length());
                            n30.x(sb, "Created H5 interstitial #", j, " with ad unit ");
                            sb.append(str8);
                            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                            return;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            yb4 yb4Var4 = (yb4) map.get(Long.valueOf(j));
                            if (yb4Var4 != null) {
                                yb4Var4.a(O3(mapZzT));
                                return;
                            }
                            zzo.zzd("Could not load H5 ad, object ID does not exist");
                            zzecjVar.getClass();
                            vq0 vq0Var5 = new vq0(str6);
                            vq0Var5.a = Long.valueOf(j);
                            vq0Var5.c = "onNativeAdObjectNotAvailable";
                            zzecjVar.b(vq0Var5);
                            return;
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            Long lValueOf2 = Long.valueOf(j);
                            yb4 yb4Var5 = (yb4) map.get(lValueOf2);
                            if (yb4Var5 == null) {
                                zzo.zzd("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            yb4Var5.zzc();
                            map.remove(lValueOf2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 16);
                            sb2.append("Disposed H5 ad #");
                            sb2.append(j);
                            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                            return;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            if (map.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Jb)).intValue()) {
                                zzo.zzi("Could not create H5 ad, too many existing objects");
                                zzecjVar.a(j);
                                return;
                            }
                            Long lValueOf3 = Long.valueOf(j);
                            if (map.containsKey(lValueOf3)) {
                                zzo.zzd("Could not create H5 ad, object ID already exists");
                                zzecjVar.a(j);
                                return;
                            }
                            String str9 = (String) mapZzT.get("ad_unit");
                            if (TextUtils.isEmpty(str9)) {
                                zzo.zzi("Could not create H5 ad, missing ad unit id");
                                zzecjVar.a(j);
                                return;
                            }
                            g54 g54VarZzc2 = zzecoVar.zzc();
                            g54VarZzc2.c(j);
                            g54VarZzc2.b(str9);
                            g54 g54VarA2 = g54VarZzc2.a();
                            long jLongValue2 = g54VarA2.a.longValue();
                            h54 h54Var2 = g54VarA2.d;
                            map.put(lValueOf3, new zzecu(jLongValue2, h54Var2.a, new zzecj(h54Var2.b), g54VarA2.c, g54VarA2.b));
                            zzecjVar.getClass();
                            vq0 vq0Var6 = new vq0(str7);
                            vq0Var6.a = Long.valueOf(j);
                            vq0Var6.c = "nativeObjectCreated";
                            zzecjVar.b(vq0Var6);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 35 + str9.length());
                            n30.x(sb3, "Created H5 rewarded #", j, " with ad unit ");
                            sb3.append(str9);
                            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                            return;
                        }
                        break;
                }
                zzo.zzd("H5 gmsg contained invalid action: ".concat(str2));
            } catch (NullPointerException | NumberFormatException unused) {
                zzo.zzd("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str4)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    public final void zzf() {
        this.d.clear();
    }

    public zzecl(zzeco zzecoVar, zzecj zzecjVar) {
        this.b = zzecoVar;
        this.c = zzecjVar;
    }
}
