package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzcly;
import com.google.android.gms.internal.ads.zzgto;
import com.google.android.gms.internal.ads.zzgui;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgul;
import com.google.android.gms.internal.ads.zzgun;
import com.google.android.gms.internal.ads.zzgva;
import defpackage.cp4;
import defpackage.do4;
import defpackage.ro4;
import defpackage.so4;
import defpackage.xo4;
import defpackage.yo4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzz {
    private zzgul zzf;

    @Nullable
    private zzcly zzc = null;
    private boolean zze = false;

    @Nullable
    private String zza = null;

    @Nullable
    private zzgto zzd = null;

    @Nullable
    private String zzb = null;

    public final synchronized void zza(@Nullable zzcly zzclyVar, Context context) {
        this.zzc = zzclyVar;
        if (!zzb(context)) {
            zzg("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        zzi("on_play_store_bind", map);
    }

    public final synchronized boolean zzb(Context context) {
        if (!zzgva.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.zzd = new do4(new cp4(context), 2);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzh().d("LastMileDeliveryOverlay.bindLastMileDeliveryService", e);
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzl();
        this.zze = true;
        return true;
    }

    private final void zzl() {
        if (this.zzf == null) {
            this.zzf = new zzx(this);
        }
    }

    private final zzgun zzm() {
        xo4 xo4Var = new xo4();
        if (!((Boolean) zzba.zzc().a(zzbjr.rd)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                xo4Var.a = str;
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            xo4Var.b = this.zzb;
        }
        return new yo4(xo4Var.a, xo4Var.b);
    }

    public final void zzc(@Nullable zzcly zzclyVar, @Nullable zzgui zzguiVar) {
        if (zzclyVar == null) {
            zzg("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzclyVar;
        if (!this.zze && !zzb(zzclyVar.getContext())) {
            zzg("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().a(zzbjr.rd)).booleanValue()) {
            this.zzb = zzguiVar.b();
        }
        zzl();
        zzgto zzgtoVar = this.zzd;
        if (zzgtoVar != null) {
            zzgtoVar.f(zzguiVar, this.zzf);
        }
    }

    public final void zzd() {
        zzgto zzgtoVar;
        if (!this.zze || (zzgtoVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgtoVar.b(zzm(), this.zzf);
            zzh("onLMDOverlayExpand");
        }
    }

    public final void zze() {
        zzgto zzgtoVar;
        if (!this.zze || (zzgtoVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgtoVar.c(zzm(), this.zzf);
            zzh("onLMDOverlayCollapse");
        }
    }

    public final void zzf() {
        zzgto zzgtoVar;
        if (!this.zze || (zzgtoVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        ro4 ro4Var = new ro4();
        if (!((Boolean) zzba.zzc().a(zzbjr.rd)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                ro4Var.a = str;
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            ro4Var.b = this.zzb;
        }
        zzgtoVar.d(new so4(ro4Var.a, ro4Var.b), this.zzf);
    }

    @VisibleForTesting
    public final void zzh(String str) {
        zzi(str, new HashMap());
    }

    @VisibleForTesting
    public final void zzi(final String str, final Map map) {
        zzcgv.f.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk(str, map);
            }
        });
    }

    public final /* synthetic */ void zzk(String str, Map map) {
        zzcly zzclyVar = this.zzc;
        if (zzclyVar != null) {
            zzclyVar.m(str, map);
        }
    }

    @VisibleForTesting
    public final void zzg(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            zzi("onError", map);
        }
    }

    @VisibleForTesting
    public final void zzj(zzguk zzgukVar) {
        if (!TextUtils.isEmpty(zzgukVar.b())) {
            if (!((Boolean) zzba.zzc().a(zzbjr.rd)).booleanValue()) {
                this.zza = zzgukVar.b();
            }
        }
        switch (zzgukVar.a()) {
            case 8152:
                zzh("onLMDOverlayOpened");
                break;
            case 8153:
                zzh("onLMDOverlayClicked");
                break;
            case 8155:
                zzh("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzgukVar.a()));
                zzi("onLMDOverlayFailedToOpen", map);
                break;
        }
    }
}
