package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbzn implements NativeCustomFormatAd.DisplayOpenMeasurement {
    public final zzbnx a;

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.a.Z1(new ObjectWrapper(view));
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.a.zzp();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return false;
        }
    }

    public zzbzn(zzbnx zzbnxVar) {
        this.a = zzbnxVar;
        try {
            zzbnxVar.zzr();
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }
}
