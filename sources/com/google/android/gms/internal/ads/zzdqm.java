package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdqm extends zzbnc {
    public final zzdre a;
    public IObjectWrapper b;

    public static float O3(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        return (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.z1(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final float zze() {
        float f;
        zzcoj zzcojVarZzN;
        int i;
        int i2;
        float f2;
        zzdre zzdreVar = this.a;
        synchronized (zzdreVar) {
            f = zzdreVar.x;
        }
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            synchronized (zzdreVar) {
                f2 = zzdreVar.x;
            }
            return f2;
        }
        if (zzdreVar.r() != null) {
            try {
                return zzdreVar.r().zzm();
            } catch (RemoteException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Remote exception getting video controller aspect ratio.", e);
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        IObjectWrapper iObjectWrapper = this.b;
        if (iObjectWrapper != null) {
            return O3(iObjectWrapper);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ke)).booleanValue() && zzdreVar.i() != null && (zzcojVarZzN = zzdreVar.i().zzN()) != null && (i = zzcojVarZzN.c) >= 0 && (i2 = zzcojVarZzN.b) > 0) {
            return i / i2;
        }
        zzbng zzbngVarB = zzdreVar.b();
        if (zzbngVarB == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float fZzd = (zzbngVarB.zzd() == -1 || zzbngVarB.zze() == -1) ? 0.0f : zzbngVarB.zzd() / zzbngVarB.zze();
        return fZzd == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? O3(zzbngVarB.zza()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.b = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final IObjectWrapper zzg() {
        IObjectWrapper iObjectWrapper = this.b;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbng zzbngVarB = this.a.b();
        if (zzbngVarB == null) {
            return null;
        }
        return zzbngVarB.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final float zzh() {
        zzdre zzdreVar = this.a;
        return zzdreVar.r() != null ? zzdreVar.r().zzj() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final float zzi() {
        zzdre zzdreVar = this.a;
        return zzdreVar.r() != null ? zzdreVar.r().zzk() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final com.google.android.gms.ads.internal.client.zzea zzj() {
        return this.a.r();
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final boolean zzk() {
        return this.a.r() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final boolean zzl() {
        zzcly zzclyVar;
        zzdre zzdreVar = this.a;
        synchronized (zzdreVar) {
            zzclyVar = zzdreVar.j;
        }
        return zzclyVar != null;
    }

    public zzdqm(zzdre zzdreVar) {
        this.a = zzdreVar;
    }
}
