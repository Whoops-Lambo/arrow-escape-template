package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdws extends VideoController.VideoLifecycleCallbacks {
    public final zzdre a;

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzea zzeaVarR = this.a.r();
        zzed zzedVarZzo = null;
        if (zzeaVarR != null) {
            try {
                zzedVarZzo = zzeaVarR.zzo();
            } catch (RemoteException unused) {
            }
        }
        if (zzedVarZzo == null) {
            return;
        }
        try {
            zzedVarZzo.zzh();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzea zzeaVarR = this.a.r();
        zzed zzedVarZzo = null;
        if (zzeaVarR != null) {
            try {
                zzedVarZzo = zzeaVarR.zzo();
            } catch (RemoteException unused) {
            }
        }
        if (zzedVarZzo == null) {
            return;
        }
        try {
            zzedVarZzo.zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzea zzeaVarR = this.a.r();
        zzed zzedVarZzo = null;
        if (zzeaVarR != null) {
            try {
                zzedVarZzo = zzeaVarR.zzo();
            } catch (RemoteException unused) {
            }
        }
        if (zzedVarZzo == null) {
            return;
        }
        try {
            zzedVarZzo.zze();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }

    public zzdws(zzdre zzdreVar) {
        this.a = zzdreVar;
    }
}
