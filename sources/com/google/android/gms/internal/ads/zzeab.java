package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.R6;
import defpackage.ca4;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeab implements zzdje, com.google.android.gms.ads.internal.client.zza, zzdew, zzdeg, zzdgx {
    public final Context a;
    public final zzfnc b;
    public final zzeaw c;
    public final zzfmb d;
    public final zzflq e;
    public final zzelr f;
    public final String g;
    public Boolean i;
    public long h = -1;
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final boolean j = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Z7)).booleanValue();

    @Override // com.google.android.gms.internal.ads.zzdeg
    public final void A(zzdoy zzdoyVar) {
        if (this.j) {
            zzeav zzeavVarN = n("ifts");
            zzeavVarN.b("reason", "exception");
            if (!TextUtils.isEmpty(zzdoyVar.getMessage())) {
                zzeavVarN.b(NotificationCompat.CATEGORY_MESSAGE, zzdoyVar.getMessage());
            }
            zzeavVarN.c();
        }
    }

    public final boolean f() {
        String strZzr;
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.m2);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        strZzr = com.google.android.gms.ads.internal.util.zzs.zzr(this.a);
                    } catch (RemoteException unused) {
                        strZzr = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzr != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzr);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().d("CsiActionsListener.isPatternMatched", e);
                        }
                    }
                    this.i = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.i.booleanValue();
    }

    public final zzeav n(String str) {
        zzfmb zzfmbVar = this.d;
        zzfma zzfmaVar = zzfmbVar.b;
        zzeav zzeavVarA = this.c.a();
        zzeavVarA.b("gqi", zzfmaVar.b.b);
        zzflq zzflqVar = this.e;
        zzeavVarA.a(zzflqVar);
        zzeavVarA.b("action", str);
        zzeavVarA.b("ad_format", this.g.toUpperCase(Locale.ROOT));
        List list = zzflqVar.t;
        if (!list.isEmpty()) {
            zzeavVarA.b("ancn", (String) list.get(0));
        }
        if (zzflqVar.b()) {
            zzeavVarA.b("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().i(this.a) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzeavVarA.b("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zzeavVarA.b("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.g8)).booleanValue()) {
            boolean zZza = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzfmbVar);
            zzeavVarA.b("scar", String.valueOf(zZza));
            if (zZza) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfmbVar.a.a.d;
                zzeavVarA.b("ragent", zzmVar.zzp);
                zzeavVarA.b("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzmVar)));
            }
        }
        return zzeavVarA;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.e.b()) {
            x(n("click"));
        }
    }

    public final void x(zzeav zzeavVar) {
        if (!this.e.b()) {
            zzeavVar.c();
            return;
        }
        zzebb zzebbVar = zzeavVar.b.a;
        zzelt zzeltVar = new zzelt(2, this.d.b.b.b, zzebbVar.f.generateUrl(zzeavVar.a), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        zzelr zzelrVar = this.f;
        zzelrVar.getClass();
        zzelrVar.b(new ca4(zzelrVar, zzeltVar, false, 5));
    }

    public final boolean z() {
        int i = this.e.b;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // com.google.android.gms.internal.ads.zzdeg
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String strGroup;
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.j) {
            zzeav zzeavVarN = n("ifts");
            zzeavVarN.b("reason", R6.G1);
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzeavVarN.b("arec", String.valueOf(i));
            }
            Pattern pattern = this.b.a;
            if (pattern == null || str == null) {
                strGroup = null;
            } else {
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    strGroup = matcher.group();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup != null) {
                zzeavVarN.b("areec", strGroup);
            }
            zzeavVarN.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeg
    public final void zze() {
        if (this.j) {
            zzeav zzeavVarN = n("ifts");
            zzeavVarN.b("reason", "blocked");
            zzeavVarN.c();
        }
    }

    public zzeab(Context context, zzfnc zzfncVar, zzeaw zzeawVar, zzfmb zzfmbVar, zzflq zzflqVar, zzelr zzelrVar, String str) {
        this.a = context;
        this.b = zzfncVar;
        this.c = zzeawVar;
        this.d = zzfmbVar;
        this.e = zzflqVar;
        this.f = zzelrVar;
        this.g = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void Q() {
        String str;
        boolean zF = f();
        zzflq zzflqVar = this.e;
        if (!zF && !zzflqVar.b()) {
            return;
        }
        zzeav zzeavVarN = n("impression");
        zzeavVarN.b("imp_type", String.valueOf(zzflqVar.e));
        if (this.h > 0) {
            zzeavVarN.b("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.h));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ef)).booleanValue() && z()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String str2 = "0";
            if (true == com.google.android.gms.ads.internal.util.zzs.zzJ(this.a)) {
                str = "0";
            } else {
                str = "1";
            }
            zzeavVarN.b("foreground", str);
            if (true == this.k.get()) {
                str2 = "1";
            }
            zzeavVarN.b("fg_show", str2);
        }
        x(zzeavVarN);
    }

    @Override // com.google.android.gms.internal.ads.zzdje
    public final void d() {
        if (!f()) {
            return;
        }
        n("adapter_shown").c();
    }

    @Override // com.google.android.gms.internal.ads.zzdje
    public final void m() {
        String str;
        String str2;
        if (!f()) {
            return;
        }
        zzeav zzeavVarN = n("adapter_impression");
        zzeavVarN.b("imp_type", String.valueOf(this.e.e));
        String str3 = "0";
        if (this.l.get()) {
            zzeavVarN.b("po", "1");
            zzeavVarN.b("pil", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.h));
        } else {
            zzeavVarN.b("po", "0");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ef)).booleanValue() && z()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (true == com.google.android.gms.ads.internal.util.zzs.zzJ(this.a)) {
                str = "0";
            } else {
                str = "1";
            }
            zzeavVarN.b("foreground", str);
            if (true != this.k.get()) {
                str2 = "0";
            } else {
                str2 = "1";
            }
            zzeavVarN.b("fg_show", str2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ff)).booleanValue() && z()) {
            if (true == com.google.android.gms.ads.internal.zzt.zzg().e()) {
                str3 = "1";
            }
            zzeavVarN.b("fg_al", str3);
        }
        zzeavVarN.c();
    }

    @Override // com.google.android.gms.internal.ads.zzdgx
    public final void zzk() {
        String str;
        if (!f()) {
            return;
        }
        this.l.set(true);
        this.h = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        zzeav zzeavVarN = n("presentation");
        String str2 = "1";
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ef)).booleanValue() && z()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean z = !com.google.android.gms.ads.internal.util.zzs.zzJ(this.a);
            AtomicBoolean atomicBoolean = this.k;
            atomicBoolean.set(z);
            if (true == atomicBoolean.get()) {
                str = "1";
            } else {
                str = "0";
            }
            zzeavVarN.b("foreground", str);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ff)).booleanValue() && z()) {
            if (true != com.google.android.gms.ads.internal.zzt.zzg().e()) {
                str2 = "0";
            }
            zzeavVarN.b("fg_al", str2);
        }
        zzeavVarN.c();
    }
}
