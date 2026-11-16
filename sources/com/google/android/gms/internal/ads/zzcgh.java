package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.j24;
import defpackage.k24;
import defpackage.ps0;
import defpackage.u22;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcgh {
    public final Object a = new Object();
    public final com.google.android.gms.ads.internal.util.zzj b;
    public final zzcgm c;
    public boolean d;
    public Context e;
    public VersionInfoParcel f;
    public String g;
    public zzbjw h;
    public zzeaw i;
    public Boolean j;
    public final AtomicInteger k;
    public final AtomicInteger l;
    public final k24 m;
    public final Object n;
    public ListenableFuture o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;

    public final zzbjw a() {
        zzbjw zzbjwVar;
        synchronized (this.a) {
            zzbjwVar = this.h;
        }
        return zzbjwVar;
    }

    public final void b(Context context, VersionInfoParcel versionInfoParcel, zzeaw zzeawVar) {
        zzbjw zzbjwVar;
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.e = context.getApplicationContext();
                    this.f = versionInfoParcel;
                    com.google.android.gms.ads.internal.zzt.zzg().b(this.c);
                    this.b.zza(this.e);
                    zzcbc.d(this.e, this.f);
                    this.i = zzeawVar;
                    com.google.android.gms.ads.internal.zzt.zzm();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Q2)).booleanValue()) {
                        zzbjwVar = new zzbjw();
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbjwVar = null;
                    }
                    this.h = zzbjwVar;
                    if (zzbjwVar != null) {
                        zzcgy.a(new j24(this).zzb(), "AppState.registerCsiReporter", zzcgv.h);
                    }
                    Context context2 = this.e;
                    if (PlatformVersion.isAtLeastO()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.U9)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new u22(this));
                            } catch (RuntimeException e) {
                                int i = com.google.android.gms.ads.internal.util.zze.zza;
                                zzo.zzj("Failed to register network callback", e);
                                this.p.set(true);
                            }
                        }
                    }
                    this.d = true;
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Wf)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
    }

    public final Resources c() {
        if (this.f.isClientJar) {
            return this.e.getResources();
        }
        try {
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Gc)).booleanValue();
            Context context = this.e;
            if (zBooleanValue) {
                return com.google.android.gms.ads.internal.util.client.zzs.zzb(context).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.zzb(context).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void d(String str, Throwable th) {
        zzcbc.d(this.e, this.f).b(str, th);
    }

    public final void e(String str, Throwable th) {
        zzcbc.d(this.e, this.f).a(th, str, ((Double) zzbmb.f.c()).floatValue());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001d, B:10:0x002f, B:13:0x0039, B:14:0x0040), top: B:19:0x0007 }] */
    public final void f(String str, Throwable th) {
        Context context = this.e;
        VersionInfoParcel versionInfoParcel = this.f;
        synchronized (zzcbc.l) {
            try {
                if (zzcbc.n == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Q8)).booleanValue()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.P8)).booleanValue()) {
                            zzcbc.n = new zzcbd();
                        } else {
                            zzcbc.n = new zzcbc(context, versionInfoParcel);
                        }
                    } else {
                        zzcbc.n = new zzcbd();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzcbc.n.b(str, th);
    }

    public final com.google.android.gms.ads.internal.util.zzj g() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.a) {
            zzjVar = this.b;
        }
        return zzjVar;
    }

    public final ListenableFuture h() {
        if (this.e != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.a4)).booleanValue()) {
                synchronized (this.n) {
                    try {
                        ListenableFuture listenableFuture = this.o;
                        if (listenableFuture != null) {
                            return listenableFuture;
                        }
                        ListenableFuture listenableFutureSubmit = zzcgv.a.submit(new ps0(this, 4));
                        this.o = listenableFutureSubmit;
                        return listenableFutureSubmit;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zzheh.a(new ArrayList());
    }

    public zzcgh() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.b = zzjVar;
        this.c = new zzcgm(com.google.android.gms.ads.internal.client.zzay.zzf(), zzjVar);
        this.d = false;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = new AtomicInteger(0);
        this.l = new AtomicInteger(0);
        this.m = new k24();
        this.n = new Object();
        this.p = new AtomicBoolean();
        this.q = new AtomicBoolean(false);
    }

    public final boolean i(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.U9)).booleanValue()) {
                return this.p.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
