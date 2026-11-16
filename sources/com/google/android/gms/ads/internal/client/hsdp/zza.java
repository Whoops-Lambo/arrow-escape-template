package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.mx0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zza implements mx0 {
    final /* synthetic */ IHsdpPrewarmServiceCallback zza;

    public zza(HsdpDeepLinkServiceWrapper hsdpDeepLinkServiceWrapper, IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) {
        this.zza = iHsdpPrewarmServiceCallback;
        Objects.requireNonNull(hsdpDeepLinkServiceWrapper);
    }

    @Override // defpackage.mx0
    public final void onCompleted(Bundle bundle) {
        IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback = this.zza;
        if (iHsdpPrewarmServiceCallback != null) {
            try {
                iHsdpPrewarmServiceCallback.onPrewarmCompleted(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in HsdpPrewarmListener.onCompleted", e);
            }
        }
    }

    @Override // defpackage.mx0
    public final void onError(Bundle bundle) {
        IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback = this.zza;
        if (iHsdpPrewarmServiceCallback != null) {
            try {
                iHsdpPrewarmServiceCallback.onError(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in HsdpPrewarmListener.onError", e);
            }
        }
    }
}
