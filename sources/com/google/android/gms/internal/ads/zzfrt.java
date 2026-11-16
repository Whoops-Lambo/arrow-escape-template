package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfrt implements Runnable {
    public final zzfrw b;
    public String c;
    public String e;
    public zzfma f;
    public com.google.android.gms.ads.internal.client.zze g;
    public ScheduledFuture h;
    public final ArrayList a = new ArrayList();
    public int i = 2;
    public zzfry d = zzfry.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public final synchronized void a(zzfrj zzfrjVar) {
        try {
            if (((Boolean) zzbll.c.c()).booleanValue()) {
                ArrayList arrayList = this.a;
                zzfrjVar.zzc();
                arrayList.add(zzfrjVar);
                ScheduledFuture scheduledFuture = this.h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.h = zzcgv.d.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.oa)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(ArrayList arrayList) {
        try {
            if (((Boolean) zzbll.c.c()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.i = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.i = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.i = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.i = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.i = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.i = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(String str) {
        boolean zMatches;
        if (((Boolean) zzbll.c.c()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.pa), str);
            }
            if (zMatches) {
                this.c = str;
            }
        }
    }

    public final synchronized void e(Bundle bundle) {
        if (((Boolean) zzbll.c.c()).booleanValue()) {
            this.d = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(bundle);
        }
    }

    public final synchronized void f(zzfma zzfmaVar) {
        if (((Boolean) zzbll.c.c()).booleanValue()) {
            this.f = zzfmaVar;
        }
    }

    public final synchronized void g(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbll.c.c()).booleanValue()) {
            this.g = zzeVar;
        }
    }

    public final synchronized void h(String str) {
        if (((Boolean) zzbll.c.c()).booleanValue()) {
            this.e = str;
        }
    }

    public final synchronized void i() {
        try {
            if (((Boolean) zzbll.c.c()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.h;
                int i = 0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zzfrj zzfrjVar = (zzfrj) obj;
                    int i2 = this.i;
                    if (i2 != 2) {
                        zzfrjVar.d(i2);
                    }
                    if (!TextUtils.isEmpty(this.c)) {
                        zzfrjVar.zze(this.c);
                    }
                    if (!TextUtils.isEmpty(this.e) && !zzfrjVar.zzl()) {
                        zzfrjVar.zzi(this.e);
                    }
                    zzfma zzfmaVar = this.f;
                    if (zzfmaVar != null) {
                        zzfrjVar.c(zzfmaVar);
                    } else {
                        com.google.android.gms.ads.internal.client.zze zzeVar = this.g;
                        if (zzeVar != null) {
                            zzfrjVar.f(zzeVar);
                        }
                    }
                    zzfrjVar.g(this.d);
                    this.b.c(zzfrjVar.zzm());
                }
                arrayList.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(int i) {
        if (((Boolean) zzbll.c.c()).booleanValue()) {
            this.i = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        i();
    }

    public zzfrt(zzfrw zzfrwVar) {
        this.b = zzfrwVar;
    }
}
