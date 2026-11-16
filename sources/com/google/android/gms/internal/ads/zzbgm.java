package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.hy3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbgm {
    public final Object a = new Object();
    public hy3 b = null;
    public boolean c = false;

    public final void a(Context context) {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Can not cast Context to Application");
                        return;
                    }
                    if (this.b == null) {
                        this.b = new hy3();
                    }
                    hy3 hy3Var = this.b;
                    if (!hy3Var.i) {
                        application.registerActivityLifecycleCallbacks(hy3Var);
                        if (context instanceof Activity) {
                            hy3Var.a((Activity) context);
                        }
                        hy3Var.b = application;
                        hy3Var.j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.N1)).longValue();
                        hy3Var.i = true;
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(zzbgl zzbglVar) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new hy3();
                }
                hy3 hy3Var = this.b;
                synchronized (hy3Var.c) {
                    hy3Var.f.add(zzbglVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(zzbgl zzbglVar) {
        synchronized (this.a) {
            try {
                hy3 hy3Var = this.b;
                if (hy3Var == null) {
                    return;
                }
                synchronized (hy3Var.c) {
                    hy3Var.f.remove(zzbglVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity d() {
        synchronized (this.a) {
            try {
                hy3 hy3Var = this.b;
                if (hy3Var == null) {
                    return null;
                }
                return hy3Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        synchronized (this.a) {
            try {
                hy3 hy3Var = this.b;
                if (hy3Var == null) {
                    return false;
                }
                return hy3Var.d.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
