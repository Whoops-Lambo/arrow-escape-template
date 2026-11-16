package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcdw implements RewardItem {
    public final zzcdj a;

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzcdj zzcdjVar = this.a;
        if (zzcdjVar != null) {
            try {
                return zzcdjVar.zzf();
            } catch (RemoteException e) {
                zzo.zzj("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzcdj zzcdjVar = this.a;
        if (zzcdjVar != null) {
            try {
                return zzcdjVar.zze();
            } catch (RemoteException e) {
                zzo.zzj("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }

    public zzcdw(zzcdj zzcdjVar) {
        this.a = zzcdjVar;
    }
}
