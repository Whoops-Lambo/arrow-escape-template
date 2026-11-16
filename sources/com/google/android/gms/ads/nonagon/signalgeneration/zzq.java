package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzear;
import com.google.android.gms.internal.ads.zzebb;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzq {
    private final zzebb zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.e8)).intValue();
    private final long zzb = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.f8)).longValue();
    private final boolean zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.j8)).booleanValue();
    private final boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.i8)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzn(this));

    private final synchronized void zzi() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((zzo) entry.getValue()).zza.longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), ((zzo) entry.getValue()).zzb));
                it.remove();
                throw th;
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("QueryJsonMap.removeExpiredEntries", e);
        }
    }

    private final synchronized void zzj(final zzear zzearVar) {
        if (this.zzc) {
            ArrayDeque arrayDeque = this.zzg;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.zzf;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcgv.a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(zzearVar, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    public final synchronized void zza(String str, String str2, zzear zzearVar) {
        this.zze.put(str, new zzo(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()), str2, new HashSet()));
        zzi();
        zzj(zzearVar);
    }

    @Nullable
    public final synchronized String zzb(String str, zzear zzearVar) {
        zzo zzoVar = (zzo) this.zze.get(str);
        zzearVar.a.put("request_id", str);
        ConcurrentHashMap concurrentHashMap = zzearVar.a;
        if (zzoVar == null) {
            concurrentHashMap.put("mhit", "false");
            return null;
        }
        concurrentHashMap.put("mhit", "true");
        return zzoVar.zzb;
    }

    public final synchronized void zzc(String str) {
        this.zze.remove(str);
    }

    public final synchronized boolean zzd(String str, String str2) {
        zzo zzoVar = (zzo) this.zze.get(str);
        return zzoVar != null && zzoVar.zzc.contains(str2);
    }

    public final synchronized boolean zze(String str, String str2, int i) {
        zzo zzoVar = (zzo) this.zze.get(str);
        if (zzoVar == null) {
            return false;
        }
        Set set = zzoVar.zzc;
        set.add(str2);
        return set.size() < i;
    }

    public final /* synthetic */ void zzf(zzear zzearVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzk(zzearVar, arrayDeque, "to");
        zzk(zzearVar, arrayDeque2, "of");
    }

    public final /* synthetic */ int zzg() {
        return this.zza;
    }

    public final /* synthetic */ ArrayDeque zzh() {
        return this.zzf;
    }

    public zzq(zzebb zzebbVar) {
        this.zzh = zzebbVar;
    }

    private final void zzk(zzear zzearVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzearVar.a);
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzv.zzb(jSONObject.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS).getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzl(this.zzi, "e_type", (String) pair.first);
                zzl(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.b(this.zzi);
        }
    }

    private static final void zzl(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
