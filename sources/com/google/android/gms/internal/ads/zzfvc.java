package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.common.util.Clock;
import defpackage.jc1;
import defpackage.vi4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfvc {
    public final zzfvx c;
    public final zzfuy d;
    public final Context e;
    public volatile ConnectivityManager f;
    public final Clock h;
    public AtomicInteger i;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final void b(boolean z) {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.C)).booleanValue()) {
                c(z);
            }
        }
    }

    public final synchronized void c(boolean z) {
        ConcurrentHashMap concurrentHashMap = this.a;
        try {
            if (z) {
                Iterator it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    ((zzfvw) it.next()).n();
                }
            } else {
                Iterator it2 = concurrentHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((zzfvw) it2.next()).g.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010c A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x0042, B:13:0x0051, B:14:0x0057, B:16:0x005f, B:18:0x0073, B:19:0x0082, B:20:0x0086, B:21:0x008a, B:22:0x0094, B:24:0x009a, B:26:0x00ac, B:27:0x00c1, B:28:0x00cb, B:30:0x00d1, B:32:0x00fa, B:38:0x0113, B:40:0x0119, B:34:0x010c, B:35:0x010e, B:44:0x011f, B:36:0x010f, B:37:0x0112), top: B:51:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized ArrayList d(List list) {
        ArrayList arrayList;
        Queue queue;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfp zzfpVar = (zzfp) it.next();
                String strA = a(zzfpVar.zza, AdFormat.getAdFormat(zzfpVar.zzb));
                hashSet.add(strA);
                ConcurrentHashMap concurrentHashMap = this.a;
                zzfvw zzfvwVar = (zzfvw) concurrentHashMap.get(strA);
                if (zzfvwVar == null) {
                    ConcurrentHashMap concurrentHashMap2 = this.b;
                    if (concurrentHashMap2.containsKey(strA)) {
                        zzfvw zzfvwVar2 = (zzfvw) concurrentHashMap2.get(strA);
                        if (((zzfp) zzfvwVar2.e.get()).equals(zzfpVar)) {
                            zzfvwVar2.a(zzfpVar.zzd);
                            zzfvwVar2.n();
                            concurrentHashMap.put(strA, zzfvwVar2);
                            concurrentHashMap2.remove(strA);
                        } else {
                            arrayList.add(zzfpVar);
                        }
                    } else {
                        arrayList.add(zzfpVar);
                    }
                } else if (((zzfp) zzfvwVar.e.get()).equals(zzfpVar)) {
                    zzfvwVar.a(zzfpVar.zzd);
                } else {
                    this.b.put(strA, zzfvwVar);
                    concurrentHashMap.remove(strA);
                    arrayList.add(zzfpVar);
                }
            }
            Iterator it2 = this.a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.b.put((String) entry.getKey(), (zzfvw) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.b.entrySet().iterator();
            while (it3.hasNext()) {
                zzfvw zzfvwVar3 = (zzfvw) ((Map.Entry) it3.next()).getValue();
                zzfvwVar3.g.set(false);
                zzfvwVar3.p.set(false);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.E)).booleanValue()) {
                    queue = zzfvwVar3.j;
                    synchronized (queue) {
                        queue.clear();
                    }
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.F)).booleanValue()) {
                        queue = zzfvwVar3.j;
                        synchronized (queue) {
                            queue.clear();
                        }
                    }
                }
                if (!zzfvwVar3.l()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized boolean e(String str, AdFormat adFormat) {
        boolean z;
        try {
            Clock clock = this.h;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            zzfvw zzfvwVarG = g(str, adFormat);
            int iT = 0;
            z = zzfvwVarG != null && zzfvwVarG.l();
            Long lValueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
            vi4 vi4Var = new vi4(new zzfve(str, adFormat));
            zzfuy zzfuyVar = this.d;
            int iS = zzfvwVarG == null ? 0 : zzfvwVarG.s();
            if (zzfvwVarG != null) {
                iT = zzfvwVarG.t();
            }
            zzfuyVar.c(iS, iT, jCurrentTimeMillis, lValueOf, zzfvwVarG != null ? zzfvwVarG.o() : null, vi4Var, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    public final synchronized Object f(AdFormat adFormat, Class cls, String str) {
        vi4 vi4Var = new vi4(new zzfve(str, adFormat));
        zzfuy zzfuyVar = this.d;
        Clock clock = this.h;
        zzfuyVar.g("poll_ad", "ppac_ts", clock.currentTimeMillis(), -1, -1, null, vi4Var, "1");
        zzfvw zzfvwVarG = g(str, adFormat);
        if (zzfvwVarG == null) {
            return null;
        }
        try {
            String strO = zzfvwVarG.o();
            Object objM = zzfvwVarG.m();
            Object objCast = objM == null ? null : cls.cast(objM);
            if (objCast != null) {
                zzfuyVar.d(clock.currentTimeMillis(), zzfvwVarG.s(), zzfvwVarG.t(), strO, vi4Var, "1");
            }
            return objCast;
        } catch (ClassCastException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("PreloadAdManager.pollAd", e);
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return null;
        }
    }

    public final synchronized zzfvw g(String str, AdFormat adFormat) {
        return (zzfvw) this.a.get(a(str, adFormat));
    }

    public static String a(String str, AdFormat adFormat) {
        String strName = adFormat == null ? "NULL" : adFormat.name();
        return jc1.o(str, "#", new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), strName);
    }

    public zzfvc(zzfvx zzfvxVar, zzfuy zzfuyVar, Context context, Clock clock) {
        this.c = zzfvxVar;
        this.d = zzfuyVar;
        this.e = context;
        this.h = clock;
    }
}
