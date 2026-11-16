package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzfeu;
import com.google.android.gms.internal.ads.zzfev;
import com.google.android.gms.internal.ads.zzgey;
import com.google.android.gms.internal.ads.zzgfc;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.g24;
import defpackage.o24;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfeu implements zzfdv {
    public final Context a;
    public final ScheduledExecutorService b;
    public final Executor c;
    public final boolean d;
    public final boolean e;
    public final zzcfz f;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        zzcha zzchaVar = new zzcha();
        com.google.android.gms.ads.internal.client.zzay.zza();
        Context context = this.a;
        if (com.google.android.gms.ads.internal.util.client.zzf.zzA(context)) {
            zzcgv.a.execute(new g24(this.f, context, zzchaVar));
        }
        zzhdy zzhdyVarS = zzhdy.s(zzchaVar);
        final int i = 1;
        zzgvq zzgvqVar = new zzgvq(this) { // from class: jg4
            public final /* synthetic */ zzfeu b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:33:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:35:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.zzgvq
            public final Object apply(Object obj) {
                zzgfc zzgfcVarF;
                String id;
                String packageName;
                long jLongValue;
                boolean z;
                int i2 = i;
                zzfeu zzfeuVar = this.b;
                switch (i2) {
                    case 0:
                        zzay.zza();
                        ContentResolver contentResolver = zzfeuVar.a.getContentResolver();
                        return new zzfev(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzgey());
                    default:
                        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                        zzgey zzgeyVar = new zzgey();
                        if (!zzfeuVar.d) {
                            if (((Boolean) zzba.zzc().a(zzbjr.n4)).booleanValue()) {
                                try {
                                    Context context2 = zzfeuVar.a;
                                    zzgfcVarF = zzgfc.f(context2);
                                    Objects.requireNonNull(info);
                                    id = info.getId();
                                    Objects.requireNonNull(id);
                                    packageName = context2.getPackageName();
                                    jLongValue = ((Long) zzba.zzc().a(zzbjr.t4)).longValue();
                                    z = zzfeuVar.e;
                                    zzgfcVarF.getClass();
                                    synchronized (zzgfc.class) {
                                        zzgeyVar = zzgfcVarF.a(jLongValue, id, packageName, z);
                                    }
                                } catch (IOException | IllegalArgumentException e) {
                                    zzt.zzh().d("AdIdInfoSignalSource.getPaidV1", e);
                                    zzgeyVar = new zzgey();
                                }
                            }
                            break;
                        } else if (((Boolean) zzba.zzc().a(zzbjr.o4)).booleanValue()) {
                            Context context3 = zzfeuVar.a;
                            zzgfcVarF = zzgfc.f(context3);
                            Objects.requireNonNull(info);
                            id = info.getId();
                            Objects.requireNonNull(id);
                            packageName = context3.getPackageName();
                            jLongValue = ((Long) zzba.zzc().a(zzbjr.t4)).longValue();
                            z = zzfeuVar.e;
                            zzgfcVarF.getClass();
                            synchronized (zzgfc.class) {
                                zzgeyVar = zzgfcVarF.a(jLongValue, id, packageName, z);
                            }
                        }
                        return new zzfev(info, null, zzgeyVar);
                }
            }
        };
        Executor executor = this.c;
        final int i2 = 0;
        return zzheh.e((zzhdy) zzheh.g(zzheh.i(zzhdyVarS, zzgvqVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.P1)).longValue(), TimeUnit.MILLISECONDS, this.b), Throwable.class, new zzgvq(this) { // from class: jg4
            public final /* synthetic */ zzfeu b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:33:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:35:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.zzgvq
            public final Object apply(Object obj) {
                zzgfc zzgfcVarF;
                String id;
                String packageName;
                long jLongValue;
                boolean z;
                int i3 = i2;
                zzfeu zzfeuVar = this.b;
                switch (i3) {
                    case 0:
                        zzay.zza();
                        ContentResolver contentResolver = zzfeuVar.a.getContentResolver();
                        return new zzfev(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzgey());
                    default:
                        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                        zzgey zzgeyVar = new zzgey();
                        if (!zzfeuVar.d) {
                            if (((Boolean) zzba.zzc().a(zzbjr.n4)).booleanValue()) {
                                try {
                                    Context context3 = zzfeuVar.a;
                                    zzgfcVarF = zzgfc.f(context3);
                                    Objects.requireNonNull(info);
                                    id = info.getId();
                                    Objects.requireNonNull(id);
                                    packageName = context3.getPackageName();
                                    jLongValue = ((Long) zzba.zzc().a(zzbjr.t4)).longValue();
                                    z = zzfeuVar.e;
                                    zzgfcVarF.getClass();
                                    synchronized (zzgfc.class) {
                                        zzgeyVar = zzgfcVarF.a(jLongValue, id, packageName, z);
                                    }
                                } catch (IOException | IllegalArgumentException e) {
                                    zzt.zzh().d("AdIdInfoSignalSource.getPaidV1", e);
                                    zzgeyVar = new zzgey();
                                }
                            }
                            break;
                        } else if (((Boolean) zzba.zzc().a(zzbjr.o4)).booleanValue()) {
                            Context context4 = zzfeuVar.a;
                            zzgfcVarF = zzgfc.f(context4);
                            Objects.requireNonNull(info);
                            id = info.getId();
                            Objects.requireNonNull(id);
                            packageName = context4.getPackageName();
                            jLongValue = ((Long) zzba.zzc().a(zzbjr.t4)).longValue();
                            z = zzfeuVar.e;
                            zzgfcVarF.getClass();
                            synchronized (zzgfc.class) {
                                zzgeyVar = zzgfcVarF.a(jLongValue, id, packageName, z);
                            }
                        }
                        return new zzfev(info, null, zzgeyVar);
                }
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 40;
    }

    public zzfeu(zzcfz zzcfzVar, Context context, ScheduledExecutorService scheduledExecutorService, o24 o24Var, int i, boolean z, boolean z2) {
        this.f = zzcfzVar;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = o24Var;
        this.d = z;
        this.e = z2;
    }
}
