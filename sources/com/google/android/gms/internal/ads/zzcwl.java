package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcwl extends zzbhj {
    public final zzcwk b;
    public final com.google.android.gms.ads.internal.client.zzbu c;
    public final zzfhp d;
    public boolean e;
    public final zzeaw f;

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void q2(IObjectWrapper iObjectWrapper, zzbhr zzbhrVar) {
        try {
            this.d.d.set(zzbhrVar);
            this.b.c((Activity) ObjectWrapper.z1(iObjectWrapper), this.e);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void r0(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        zzfhp zzfhpVar = this.d;
        if (zzfhpVar != null) {
            try {
                if (!zzdqVar.zzf()) {
                    this.f.b();
                }
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zze("Error in making CSI ping for reporting paid event callback", e);
            }
            zzfhpVar.g.set(zzdqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final com.google.android.gms.ads.internal.client.zzdx zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.V7)).booleanValue()) {
            return this.b.f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void zzh(boolean z) {
        this.e = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final String zzj() {
        try {
            return this.c.zzt();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final long zzk() {
        zzdcx zzdcxVar;
        zzcwk zzcwkVar = this.b;
        if (zzcwkVar == null || (zzdcxVar = zzcwkVar.j) == null) {
            return 0L;
        }
        return zzdcxVar.a.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void zzl(long j) {
        zzdcx zzdcxVar;
        zzcwk zzcwkVar = this.b;
        if (zzcwkVar == null || (zzdcxVar = zzcwkVar.j) == null) {
            return;
        }
        zzdcxVar.a(j);
    }

    public zzcwl(zzcwk zzcwkVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzfhp zzfhpVar, zzeaw zzeawVar) {
        this.b = zzcwkVar;
        this.c = zzbuVar;
        this.d = zzfhpVar;
        this.f = zzeawVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.y1)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.e = true;
        } else {
            this.e = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.z1)).booleanValue();
        }
    }
}
