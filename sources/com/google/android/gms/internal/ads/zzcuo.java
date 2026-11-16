package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.h64;
import defpackage.pz3;
import defpackage.q04;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcuo {
    public final Context a;
    public final com.google.android.gms.ads.internal.util.zzg b;
    public final zzemz c;
    public final zzdxy d;
    public final zzher e;
    public final zzher f;
    public final ScheduledExecutorService g;
    public zzcbe h;
    public zzcbe i;

    public final ListenableFuture c(String str, MotionEvent motionEvent, Random random) {
        ListenableFuture listenableFutureB;
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Vb)) || this.b.zzx()) {
                return zzheh.a(str);
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Wb), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (motionEvent == null) {
                builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Xb), "11");
                return zzheh.a(builderBuildUpon.toString());
            }
            zzemz zzemzVar = this.c;
            zzemzVar.getClass();
            try {
                MeasurementManagerFutures measurementManagerFuturesA = MeasurementManagerFutures.a(zzemzVar.b);
                zzemzVar.a = measurementManagerFuturesA;
                listenableFutureB = measurementManagerFuturesA == null ? zzheh.b(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesA.b();
            } catch (Exception e) {
                listenableFutureB = zzheh.b(e);
            }
            return zzheh.f(zzheh.h(zzhdy.s(listenableFutureB), new h64(this, builderBuildUpon, str, motionEvent, 0), this.f), Throwable.class, new q04(2, this, builderBuildUpon), this.e);
        } catch (Exception e2) {
            return zzheh.b(e2);
        }
    }

    public zzcuo(Context context, com.google.android.gms.ads.internal.util.zzj zzjVar, zzemz zzemzVar, zzdxy zzdxyVar, zzher zzherVar, zzher zzherVar2, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.b = zzjVar;
        this.c = zzemzVar;
        this.d = zzdxyVar;
        this.e = zzherVar;
        this.f = zzherVar2;
        this.g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Vb));
    }

    public final ListenableFuture a(String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return zzheh.a(str);
        }
        return zzheh.f(c(str, this.d.a, random), Throwable.class, new pz3(this, str, 1), this.e);
    }
}
