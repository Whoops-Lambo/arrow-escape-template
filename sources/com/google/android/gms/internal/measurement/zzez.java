package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzlt;
import com.unity3d.services.core.fid.Constants;
import defpackage.b84;
import defpackage.b94;
import defpackage.ha4;
import defpackage.ie4;
import defpackage.jj3;
import defpackage.l23;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzez {
    public static volatile zzez i;
    public final Clock a = DefaultClock.getInstance();
    public final ExecutorService b;
    public final AppMeasurementSdk c;
    public final ArrayList d;
    public int e;
    public boolean f;
    public volatile zzcp g;
    public volatile long h;

    public zzez(Context context, Bundle bundle) {
        jj3 jj3Var = new jj3(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), jj3Var);
        int i2 = 1;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.b = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new AppMeasurementSdk(this);
        this.d = new ArrayList();
        int i3 = 0;
        try {
            if (zzlt.a(context, com.google.android.gms.measurement.internal.zzhu.a(context)) != null) {
                try {
                    Class.forName(Constants.FID_CLASS, false, zzez.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new b94(this, context, bundle, i3));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new l23(this, i2));
        }
    }

    public final void a(ie4 ie4Var) {
        this.b.execute(ie4Var);
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.f |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            a(new b84(this, "Error with data collection. Data lost.", exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final long d() {
        zzcm zzcmVar = new zzcm();
        a(new ha4(this, zzcmVar, 2));
        Long l = (Long) zzcm.w3(Long.class, zzcmVar.A1(500L));
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.a.currentTimeMillis()).nextLong();
        int i2 = this.e + 1;
        this.e = i2;
        return jNextLong + ((long) i2);
    }

    public static zzez c(Context context, Bundle bundle) {
        Bundle bundle2;
        Preconditions.checkNotNull(context);
        if (i == null) {
            synchronized (zzez.class) {
                try {
                    if (i == null) {
                        if (bundle == null) {
                            bundle2 = new Bundle();
                        } else {
                            bundle2 = new Bundle(bundle);
                        }
                        i = new zzez(context, bundle2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }
}
