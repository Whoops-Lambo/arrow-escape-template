package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbzm extends NativeAd.AdChoicesInfo {
    public final ArrayList a = new ArrayList();
    public final String b;

    public zzbzm(zzbmz zzbmzVar) {
        try {
            this.b = zzbmzVar.zza();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            this.b = "";
        }
        try {
            ArrayList arrayListZzb = zzbmzVar.zzb();
            int size = arrayListZzb.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListZzb.get(i);
                i++;
                zzbng zzbngVarO3 = obj instanceof IBinder ? zzbnf.O3((IBinder) obj) : null;
                if (zzbngVarO3 != null) {
                    this.a.add(new zzbzo(zzbngVarO3));
                }
            }
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.b;
    }
}
