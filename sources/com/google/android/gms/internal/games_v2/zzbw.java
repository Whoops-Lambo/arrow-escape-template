package com.google.android.gms.internal.games_v2;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.bv3;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbw {
    public static final AtomicReference b = new AtomicReference();
    public static boolean c = false;
    public final Application a;

    public static void a(Context context) {
        Preconditions.checkArgument(context != null);
        AtomicReference atomicReference = b;
        if (atomicReference.get() == null) {
            synchronized (atomicReference) {
                try {
                    if (atomicReference.get() == null) {
                        Context applicationContext = context.getApplicationContext();
                        Application application = applicationContext != null ? (Application) applicationContext : (Application) context;
                        AtomicReference atomicReference2 = zzas.c;
                        zzas zzasVar = (zzas) atomicReference2.get();
                        if (zzasVar == null) {
                            zzas zzasVar2 = new zzas(application, zzay.a(application));
                            while (!atomicReference2.compareAndSet(null, zzasVar2) && atomicReference2.get() == null) {
                            }
                            zzasVar = (zzas) Preconditions.checkNotNull((zzas) atomicReference2.get());
                        }
                        com.google.android.gms.games.internal.zzf zzfVarZza = com.google.android.gms.games.internal.zzf.zza(application);
                        com.google.android.gms.games.internal.v2.appshortcuts.zzf zzfVarZzd = com.google.android.gms.games.internal.v2.appshortcuts.zzf.zzd(context);
                        atomicReference.set(new zzbw(application, zzasVar, zzfVarZza, zzfVarZzd));
                        zzfVarZzd.zza();
                        zzasVar.getClass();
                        zzfn.a("AutomaticGamesAuthenticator", "startWatching()");
                        bv3 bv3Var = zzasVar.a;
                        if (!bv3Var.b) {
                            bv3Var.a.registerActivityLifecycleCallbacks(bv3Var);
                            bv3Var.b = true;
                        }
                        zzfVarZza.zzb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c = true;
    }

    public static void b() {
        Preconditions.checkState(c, "PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called.");
    }

    public zzbw(Application application, zzas zzasVar, com.google.android.gms.games.internal.zzf zzfVar, com.google.android.gms.games.internal.v2.appshortcuts.zzf zzfVar2) {
        this.a = application;
    }

    public static Application c() {
        b();
        return ((zzbw) b.get()).a;
    }
}
