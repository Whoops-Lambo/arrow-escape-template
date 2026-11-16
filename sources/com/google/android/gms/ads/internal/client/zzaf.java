package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcft;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzaf implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzaf zza = new zzaf();

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = zzcfs.a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterfaceQueryLocalInterface instanceof zzcft ? (zzcft) iInterfaceQueryLocalInterface : new zzcfr(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    private /* synthetic */ zzaf() {
    }
}
