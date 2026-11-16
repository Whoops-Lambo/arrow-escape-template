package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzel extends com.google.android.gms.ads.preload.zzb {
    @Nullable
    public final AppOpenAd zza(String str) {
        zzbhk zzbhkVarZzp;
        try {
            zzbhkVarZzp = this.zza.zzp(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzbhkVarZzp = null;
        }
        if (zzbhkVarZzp == null) {
            return null;
        }
        return new zzbhg(zzbhkVarZzp);
    }

    public zzel(Context context) {
        super(context, AdFormat.APP_OPEN_AD);
    }
}
