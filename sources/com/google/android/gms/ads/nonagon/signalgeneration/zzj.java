package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzebb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzj {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final zzebb zzd;
    private final ExecutorService zze;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final synchronized void zze(boolean z, boolean z2) throws Throwable {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z);
                Map map = this.zza;
                Boolean boolValueOf = Boolean.valueOf(z);
                zzl zzlVar = (zzl) map.get(boolValueOf);
                int iZzd = 0;
                if (z2 && zzlVar != null) {
                    try {
                        iZzd = zzlVar.zzd() + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                zzl zzlVar2 = (zzl) map.get(boolValueOf);
                final zzk zzkVar = new zzk(this, z, iZzd, zzlVar2 == null ? null : Boolean.valueOf(zzlVar2.zze()), this.zzd);
                final AdRequest adRequestBuild = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Tc)).booleanValue()) {
                    this.zze.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.zza.zzg(adRequestBuild, zzkVar);
                        }
                    });
                } else {
                    QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequestBuild, zzkVar);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized void zza() {
        zzh(true);
        zzh(false);
    }

    public final synchronized void zzb(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        zzcgv.f.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(obj, pair);
            }
        });
    }

    public final synchronized void zzc(final boolean z, zzl zzlVar) {
        try {
            Map map = this.zza;
            Boolean boolValueOf = Boolean.valueOf(z);
            zzl zzlVar2 = (zzl) map.get(boolValueOf);
            if (zzlVar2 == null || zzlVar2.zzc() || zzlVar2.zza() == null || zzlVar.zza() != null) {
                map.put(boolValueOf, zzlVar);
            }
            long jLongValue = (zzlVar.zza() != null ? (Long) zzblx.f.c() : (Long) zzblx.g.c()).longValue();
            final boolean z2 = zzlVar.zza() == null;
            zzcgv.d.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    this.zza.zze(z, z2);
                }
            }, jLongValue, TimeUnit.SECONDS);
            Map map2 = this.zzb;
            List list = (List) map2.get(boolValueOf);
            map2.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzj(zzlVar, (Pair) it.next(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ void zzf(boolean z) throws Throwable {
        zze(z, false);
    }

    private final void zzh(final boolean z) {
        Map map = this.zzb;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.zze.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.zza.zzf(z);
            }
        });
    }

    public final /* synthetic */ void zzd(Object obj, Pair pair) {
        boolean zAcceptThirdPartyCookies = false;
        if (obj instanceof WebView) {
            CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzc);
            if (cookieManagerZza != null) {
                zAcceptThirdPartyCookies = cookieManagerZza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.zza;
        Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
        zzl zzlVar = (zzl) map.get(boolValueOf);
        if (zzlVar != null && !zzlVar.zzc()) {
            zzj(zzlVar, pair, true);
            return;
        }
        Map map2 = this.zzb;
        List arrayList = (List) map2.get(boolValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(boolValueOf, arrayList);
        }
        arrayList.add(pair);
    }

    public final /* synthetic */ Object zzg(AdRequest adRequest, zzk zzkVar) {
        QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest, zzkVar);
        return Boolean.TRUE;
    }

    public zzj(Context context, zzebb zzebbVar, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzebbVar;
        this.zze = executorService;
    }

    private final void zzj(zzl zzlVar, Pair pair, boolean z) {
        boolean z2;
        zzlVar.zzf();
        QueryInfo queryInfoZza = zzlVar.zza();
        if (queryInfoZza != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(queryInfoZza);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzlVar.zzb());
        }
        zzebb zzebbVar = this.zzd;
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((Long) pair.second).longValue()));
        Pair pair7 = new Pair("sgpc_h", Boolean.toString(z));
        if (zzlVar.zza() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzv.zze(zzebbVar, null, "sgpcr", pair2, pair3, pair4, pair5, pair6, pair7, new Pair("sgpc_rs", Boolean.toString(z2)));
    }
}
