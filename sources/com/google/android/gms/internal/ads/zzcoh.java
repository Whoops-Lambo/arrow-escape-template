package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.kw0;
import defpackage.r44;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcoh {
    public final zzcny a;
    public final zzeaw b;

    public final void a(Context context, VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Wf)).booleanValue()) {
            Executor threadPoolExecutor = zzcgv.a;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Yf)).booleanValue()) {
                r44 r44Var = new r44(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ag)).intValue());
                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Zf)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), r44Var);
            }
            threadPoolExecutor.execute(new kw0(this, context, versionInfoParcel, false, 10));
        }
    }

    public zzcoh(zzcny zzcnyVar, zzeaw zzeawVar) {
        this.a = zzcnyVar;
        this.b = zzeawVar;
    }
}
