package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.lx0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzb implements lx0 {
    final /* synthetic */ IHsdpServiceCallback zza;

    @Override // defpackage.lx0
    public final void onAffordanceEnded() {
    }

    @Override // defpackage.lx0
    public final void onAffordanceStarted() {
    }

    @Override // defpackage.lx0
    public final void onDeepLinkStarted() {
    }

    public zzb(HsdpDeepLinkServiceWrapper hsdpDeepLinkServiceWrapper, IHsdpServiceCallback iHsdpServiceCallback) {
        this.zza = iHsdpServiceCallback;
        Objects.requireNonNull(hsdpDeepLinkServiceWrapper);
    }

    @Override // defpackage.lx0
    public final void onDismissed(Bundle bundle) {
        IHsdpServiceCallback iHsdpServiceCallback = this.zza;
        if (iHsdpServiceCallback != null) {
            try {
                iHsdpServiceCallback.onDismissed(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in onDismissed", e);
            }
        }
    }

    @Override // defpackage.lx0
    public final void onError(Bundle bundle) {
        IHsdpServiceCallback iHsdpServiceCallback = this.zza;
        if (iHsdpServiceCallback != null) {
            try {
                iHsdpServiceCallback.onError(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in onError", e);
            }
        }
    }

    @Override // defpackage.lx0
    public final void onShown(Bundle bundle) {
        IHsdpServiceCallback iHsdpServiceCallback = this.zza;
        if (iHsdpServiceCallback != null) {
            try {
                iHsdpServiceCallback.onShown(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in onShown", e);
            }
        }
    }
}
