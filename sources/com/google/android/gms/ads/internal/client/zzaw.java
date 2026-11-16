package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbnk;
import com.google.android.gms.internal.ads.zzboz;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbwg;
import com.google.android.gms.internal.ads.zzbzy;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcdm;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzcfq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzfc zzc;
    private final zzboz zzd;
    private final zzcac zze;
    private zzcbe zzf;
    private final zzl zzg;

    public static /* synthetic */ void zzl(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zza().zzi(context, zzay.zzg().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbu zza(Context context, zzr zzrVar, String str, zzbwg zzbwgVar) {
        return (zzbu) new zzam(this, context, zzrVar, str, zzbwgVar).zzd(context, false);
    }

    public final zzbu zzb(Context context, zzr zzrVar, String str, zzbwg zzbwgVar) {
        return (zzbu) new zzan(this, context, zzrVar, str, zzbwgVar).zzd(context, false);
    }

    public final zzbq zzc(Context context, String str, zzbwg zzbwgVar) {
        return (zzbq) new zzap(this, context, str, zzbwgVar).zzd(context, false);
    }

    public final zzch zzd(Context context, zzbwg zzbwgVar) {
        return (zzch) new zzar(this, context, zzbwgVar).zzd(context, false);
    }

    public final zzbnk zze(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbnk) new zzav(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzcdm zzf(Context context, String str, zzbwg zzbwgVar) {
        return (zzcdm) new zzaa(this, context, str, zzbwgVar).zzd(context, false);
    }

    @Nullable
    public final zzcaf zzg(Activity activity) {
        zzac zzacVar = new zzac(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("useClientJar flag not found in activity intent extras.");
        }
        return (zzcaf) zzacVar.zzd(activity, booleanExtra);
    }

    @Nullable
    public final zzdt zzh(Context context, zzbwg zzbwgVar) {
        return (zzdt) new zzae(this, context, zzbwgVar).zzd(context, false);
    }

    @Nullable
    public final zzcfq zzi(Context context, zzbwg zzbwgVar) {
        return (zzcfq) new zzag(this, context, zzbwgVar).zzd(context, false);
    }

    @Nullable
    public final zzbzy zzj(Context context, zzbwg zzbwgVar) {
        return (zzbzy) new zzai(this, context, zzbwgVar).zzd(context, false);
    }

    public final zzbrx zzk(Context context, zzbwg zzbwgVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbrx) new zzak(this, context, zzbwgVar, onH5AdsEventListener).zzd(context, false);
    }

    public final /* synthetic */ zzk zzm() {
        return this.zza;
    }

    public final /* synthetic */ zzi zzn() {
        return this.zzb;
    }

    public final /* synthetic */ zzfc zzo() {
        return this.zzc;
    }

    public final /* synthetic */ zzboz zzp() {
        return this.zzd;
    }

    public final /* synthetic */ zzcac zzq() {
        return this.zze;
    }

    public final /* synthetic */ zzcbe zzr() {
        return this.zzf;
    }

    public final /* synthetic */ void zzs(zzcbe zzcbeVar) {
        this.zzf = zzcbeVar;
    }

    public final /* synthetic */ zzl zzt() {
        return this.zzg;
    }

    public zzaw(zzk zzkVar, zzi zziVar, zzfc zzfcVar, zzboz zzbozVar, zzcdy zzcdyVar, zzcac zzcacVar, zzbpa zzbpaVar, zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzfcVar;
        this.zzd = zzbozVar;
        this.zze = zzcacVar;
        this.zzg = zzlVar;
    }
}
