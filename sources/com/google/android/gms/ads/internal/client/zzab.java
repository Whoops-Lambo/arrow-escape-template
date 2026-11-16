package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcah;
import com.google.android.gms.internal.ads.zzcai;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzab implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzab zza = new zzab();

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = zzcah.a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof zzcai ? (zzcai) iInterfaceQueryLocalInterface : new zzcag(iBinder);
    }

    private /* synthetic */ zzab() {
    }
}
