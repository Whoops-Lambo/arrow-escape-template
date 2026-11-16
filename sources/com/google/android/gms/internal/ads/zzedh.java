package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzebh;
import com.google.android.gms.internal.ads.zzedh;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ku4;
import defpackage.mx3;
import defpackage.o24;
import defpackage.os0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedh {
    public final Context f;
    public final WeakReference g;
    public final zzdyn h;
    public final Executor i;
    public final Executor j;
    public final ScheduledExecutorService k;
    public final zzebh l;
    public final VersionInfoParcel m;
    public final zzdli o;
    public final zzfrw p;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public final zzcha e = new zzcha();
    public final ConcurrentHashMap n = new ConcurrentHashMap();
    public boolean q = true;
    public final long d = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();

    public final synchronized ListenableFuture c() {
        String str = com.google.android.gms.ads.internal.zzt.zzh().g().zzi().e;
        if (!TextUtils.isEmpty(str)) {
            return zzheh.a(str);
        }
        zzcha zzchaVar = new zzcha();
        com.google.android.gms.ads.internal.zzt.zzh().g().zzk(new os0(22, this, zzchaVar));
        return zzchaVar;
    }

    public final void a() {
        final int i = 0;
        final int i2 = 1;
        if (!((Boolean) zzbly.a.c()).booleanValue()) {
            if (this.m.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.G2)).intValue() && this.q) {
                if (this.a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.a) {
                            return;
                        }
                        this.l.d();
                        this.o.zze();
                        zzcha zzchaVar = this.e;
                        Runnable runnable = new Runnable(this) { // from class: dc4
                            public final /* synthetic */ zzedh b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = 0;
                                switch (i) {
                                    case 0:
                                        zzedh zzedhVar = this.b;
                                        zzebh zzebhVar = zzedhVar.l;
                                        synchronized (zzebhVar) {
                                            try {
                                                if (((Boolean) zzba.zzc().a(zzbjr.S2)).booleanValue() && !zzebhVar.d) {
                                                    HashMap mapE = zzebhVar.e();
                                                    mapE.put("action", "init_finished");
                                                    ArrayList arrayList = zzebhVar.b;
                                                    arrayList.add(mapE);
                                                    int size = arrayList.size();
                                                    while (i3 < size) {
                                                        Object obj = arrayList.get(i3);
                                                        i3++;
                                                        zzebhVar.f.b((Map) obj);
                                                    }
                                                    zzebhVar.d = true;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        zzedhVar.o.zzf();
                                        zzedhVar.b = true;
                                        return;
                                    default:
                                        zzedh zzedhVar2 = this.b;
                                        synchronized (zzedhVar2) {
                                            try {
                                                if (zzedhVar2.c) {
                                                    return;
                                                }
                                                zzedhVar2.d((int) (zzt.zzk().elapsedRealtime() - zzedhVar2.d), "com.google.android.gms.ads.MobileAds", false, "Timeout.");
                                                zzedhVar2.l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                zzedhVar2.o.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                                                zzedhVar2.e.zzd(new Exception());
                                                return;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                }
                            }
                        };
                        Executor executor = this.i;
                        zzchaVar.addListener(runnable, executor);
                        this.a = true;
                        ListenableFuture listenableFutureC = c();
                        this.k.schedule(new Runnable(this) { // from class: dc4
                            public final /* synthetic */ zzedh b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = 0;
                                switch (i2) {
                                    case 0:
                                        zzedh zzedhVar = this.b;
                                        zzebh zzebhVar = zzedhVar.l;
                                        synchronized (zzebhVar) {
                                            try {
                                                if (((Boolean) zzba.zzc().a(zzbjr.S2)).booleanValue() && !zzebhVar.d) {
                                                    HashMap mapE = zzebhVar.e();
                                                    mapE.put("action", "init_finished");
                                                    ArrayList arrayList = zzebhVar.b;
                                                    arrayList.add(mapE);
                                                    int size = arrayList.size();
                                                    while (i3 < size) {
                                                        Object obj = arrayList.get(i3);
                                                        i3++;
                                                        zzebhVar.f.b((Map) obj);
                                                    }
                                                    zzebhVar.d = true;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        zzedhVar.o.zzf();
                                        zzedhVar.b = true;
                                        return;
                                    default:
                                        zzedh zzedhVar2 = this.b;
                                        synchronized (zzedhVar2) {
                                            try {
                                                if (zzedhVar2.c) {
                                                    return;
                                                }
                                                zzedhVar2.d((int) (zzt.zzk().elapsedRealtime() - zzedhVar2.d), "com.google.android.gms.ads.MobileAds", false, "Timeout.");
                                                zzedhVar2.l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                zzedhVar2.o.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                                                zzedhVar2.e.zzd(new Exception());
                                                return;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                }
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.I2)).longValue(), TimeUnit.SECONDS);
                        listenableFutureC.addListener(new ku4(i, listenableFutureC, new mx3(this)), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.a) {
            return;
        }
        d(0, "com.google.android.gms.ads.MobileAds", true, "");
        this.e.zzc(Boolean.FALSE);
        this.a = true;
        this.b = true;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.n;
        for (String str : concurrentHashMap.keySet()) {
            zzbst zzbstVar = (zzbst) concurrentHashMap.get(str);
            arrayList.add(new zzbst(zzbstVar.c, str, zzbstVar.b, zzbstVar.d));
        }
        return arrayList;
    }

    public final void d(int i, String str, boolean z, String str2) {
        this.n.put(str, new zzbst(i, str, z, str2));
    }

    public zzedh(Executor executor, Context context, WeakReference weakReference, o24 o24Var, zzdyn zzdynVar, ScheduledExecutorService scheduledExecutorService, zzebh zzebhVar, VersionInfoParcel versionInfoParcel, zzdli zzdliVar, zzfrw zzfrwVar) {
        this.h = zzdynVar;
        this.f = context;
        this.g = weakReference;
        this.i = o24Var;
        this.k = scheduledExecutorService;
        this.j = executor;
        this.l = zzebhVar;
        this.m = versionInfoParcel;
        this.o = zzdliVar;
        this.p = zzfrwVar;
        d(0, "com.google.android.gms.ads.MobileAds", false, "");
    }
}
