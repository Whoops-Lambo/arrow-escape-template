package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import defpackage.b04;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcol {
    public String a;
    public zzikj b;
    public zziob c;
    public final ScheduledExecutorService d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public final void a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.sa)).booleanValue() && !this.e.getAndSet(true)) {
            b();
        }
    }

    public final void b() {
        try {
            String strE = WebViewFeature.a("GET_VARIATIONS_HEADER") ? WebViewCompat.e() : null;
            if (strE != null && !strE.isEmpty()) {
                this.a = strE;
                byte[] bArrDecode = Base64.decode(strE, 10);
                this.b = zzikj.E(bArrDecode, zzigm.a());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.va)).booleanValue()) {
                    this.c = zziob.E(bArrDecode, zzigm.a());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ta)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.sa)).booleanValue()) {
                        this.d.schedule(new b04(this, 13), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ua)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zzihu | IllegalArgumentException e) {
            com.google.android.gms.ads.internal.zzt.zzh().e("ChromeVariations", e);
        }
    }

    public zzcol(ScheduledExecutorService scheduledExecutorService) {
        this.d = scheduledExecutorService;
    }
}
