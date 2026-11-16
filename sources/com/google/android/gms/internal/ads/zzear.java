package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzear {
    public final ConcurrentHashMap a;
    public final zzcgm b;
    public final zzfmj c;
    public final zzbbo d;
    public final Bundle e;

    public final synchronized void c(long j, String str) {
        this.e.putLong(str, j);
    }

    public zzear(Context context, zzebb zzebbVar, zzcgm zzcgmVar, zzfmj zzfmjVar, String str, String str2, zzbbo zzbboVar, DeviceTierManager deviceTierManager) {
        ActivityManager.MemoryInfo memoryInfoZze;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfmjVar.d;
        this.e = new Bundle();
        zzebbVar.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzebbVar.a);
        this.a = concurrentHashMap;
        this.b = zzcgmVar;
        this.c = zzfmjVar;
        this.d = zzbboVar;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        d();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.V2)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            b("rt_f", String.valueOf(runtime.freeMemory()));
            b("rt_m", String.valueOf(runtime.maxMemory()));
            b("rt_t", String.valueOf(runtime.totalMemory()));
            b("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzt.zzh().k.get()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.e3)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                b("mem_avl", String.valueOf(memoryInfoZze.availMem));
                b("mem_tt", String.valueOf(memoryInfoZze.totalMem));
                b("low_m", true != memoryInfoZze.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.l3)).booleanValue()) {
            b("ad_unit_id", zzfmjVar.g);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.f3)).booleanValue()) {
            b("mem_tier", deviceTierManager.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.g3)).booleanValue()) {
            b("proc_tier", deviceTierManager.getAvailableProcessorTier().name());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.g8)).booleanValue()) {
            int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(zzfmjVar) - 1;
            if (iZzg == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (iZzg == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (iZzg == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (iZzg != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            b("ragent", zzmVar.zzp);
            b("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzmVar)));
        }
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey(com.safedk.android.analytics.brandsafety.m.R)) {
            b("network_coarse", Integer.toString(bundle.getInt(com.safedk.android.analytics.brandsafety.m.R)));
        }
        if (bundle.containsKey("gnt")) {
            b("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void d() {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.jb)).booleanValue()) {
            zzbbj zzbbjVar = this.d.b;
            boolean z = zzbbjVar instanceof zzk;
            ConcurrentHashMap concurrentHashMap = this.a;
            if (z) {
                concurrentHashMap.put("asv", ((zzk) zzbbjVar).zzc());
                return;
            }
            if (!(zzbbjVar instanceof zzcon)) {
                concurrentHashMap.put("asv", "NA");
                return;
            }
            zzgim zzgimVar = (zzgim) ((zzcon) zzbbjVar).b.a.b.f.get();
            int iZzg = (zzgimVar == null ? 1 : zzgimVar.zzg()) - 1;
            if (iZzg == 1) {
                str = "1.0";
            } else if (iZzg != 2) {
                str = iZzg != 3 ? "uns" : "3.0";
            } else {
                str = "2.0";
            }
            concurrentHashMap.put("asv", str);
        }
    }

    public final void b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.a.put(str, str2);
        }
    }
}
