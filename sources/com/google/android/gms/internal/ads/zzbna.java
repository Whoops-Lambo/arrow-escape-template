package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbna extends NativeAd.AdChoicesInfo {
    public final zzbmz a;
    public final ArrayList b = new ArrayList();
    public final String c;

    public zzbna(zzbmz zzbmzVar) {
        zzbng zzbneVar;
        this.a = zzbmzVar;
        try {
            this.c = zzbmzVar.zza();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            this.c = "";
        }
        try {
            ArrayList arrayListZzb = zzbmzVar.zzb();
            int size = arrayListZzb.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListZzb.get(i);
                i++;
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbneVar = iInterfaceQueryLocalInterface instanceof zzbng ? (zzbng) iInterfaceQueryLocalInterface : new zzbne(iBinder);
                } else {
                    zzbneVar = null;
                }
                if (zzbneVar != null) {
                    this.b.add(new zzbnh(zzbneVar));
                }
            }
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.c;
    }
}
