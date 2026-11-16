package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfnf {
    public static zzfnf d;
    public final Context a;
    public final com.google.android.gms.ads.internal.client.zzcv b;
    public final AtomicReference c = new AtomicReference();

    public static zzfnf a(Context context) {
        synchronized (zzfnf.class) {
            try {
                zzfnf zzfnfVar = d;
                if (zzfnfVar != null) {
                    return zzfnfVar;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) zzblt.b.c()).longValue();
                com.google.android.gms.ads.internal.client.zzcv zzcvVarAsInterface = null;
                if (jLongValue > 0 && jLongValue <= 263305000) {
                    try {
                        zzcvVarAsInterface = zzcu.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzg("Failed to retrieve lite SDK info.", e);
                    }
                }
                zzfnf zzfnfVar2 = new zzfnf(applicationContext, zzcvVarAsInterface);
                d = zzfnfVar2;
                return zzfnfVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(zzbwg zzbwgVar) {
        zzbwg adapterCreator;
        boolean zBooleanValue = ((Boolean) zzblt.a.c()).booleanValue();
        AtomicReference atomicReference = this.c;
        if (!zBooleanValue) {
            while (!atomicReference.compareAndSet(null, zzbwgVar) && atomicReference.get() == null) {
            }
            return;
        }
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.b;
        if (zzcvVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcvVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        if (adapterCreator == null) {
            adapterCreator = zzbwgVar;
        }
        while (!atomicReference.compareAndSet(null, adapterCreator) && atomicReference.get() == null) {
        }
    }

    public zzfnf(Context context, com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.a = context;
        this.b = zzcvVar;
    }
}
