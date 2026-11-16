package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzfo;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcdv extends RewardedAd {
    public final AtomicReference a;
    public final zzcdm b;
    public final Context c;
    public final zzcee d;
    public OnAdMetadataChangedListener e;
    public OnPaidEventListener f;
    public FullScreenContentCallback g;
    public final long h;
    public final AtomicLong i;

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzl = null;
        try {
            zzcdm zzcdmVar = this.b;
            if (zzcdmVar != null) {
                zzdxVarZzl = zzcdmVar.zzl();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzc(zzdxVarZzl);
    }

    public final void a(com.google.android.gms.ads.internal.client.zzeh zzehVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzcdm zzcdmVar = this.b;
            if (zzcdmVar != null) {
                zzehVar.zzp(this.h);
                zzcdmVar.zzb(com.google.android.gms.ads.internal.client.zzq.zza.zza(this.c, zzehVar), new zzcdz(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzcdm zzcdmVar = this.b;
            if (zzcdmVar != null) {
                return zzcdmVar.zzf();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        String strZzm;
        String str;
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzm = this.b.zzm();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
                strZzm = null;
            }
            AtomicReference atomicReference2 = this.a;
            if (strZzm == null) {
                atomicReference2.set("");
            } else {
                atomicReference2.set(strZzm);
            }
            str = (String) this.a.get();
        }
        return str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.i;
        long jZzp = 0;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                zzcdm zzcdmVar = this.b;
                if (zzcdmVar != null) {
                    jZzp = zzcdmVar.zzp();
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
            AtomicLong atomicLong2 = this.i;
            atomicLong2.set(jZzp);
            j = atomicLong2.get();
        }
        return j;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            zzcdm zzcdmVar = this.b;
            zzcdj zzcdjVarZzk = zzcdmVar != null ? zzcdmVar.zzk() : null;
            return zzcdjVarZzk == null ? RewardItem.DEFAULT_REWARD : new zzcdw(zzcdjVarZzk);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.g = fullScreenContentCallback;
        this.d.a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzcdm zzcdmVar = this.b;
            if (zzcdmVar != null) {
                zzcdmVar.zzo(z);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.e = onAdMetadataChangedListener;
            zzcdm zzcdmVar = this.b;
            if (zzcdmVar != null) {
                zzcdmVar.zze(new com.google.android.gms.ads.internal.client.zzfn(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f = onPaidEventListener;
            zzcdm zzcdmVar = this.b;
            if (zzcdmVar != null) {
                zzcdmVar.zzn(new zzfo(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setPlacementId(long j) {
        try {
            zzcdm zzcdmVar = this.b;
            if (zzcdmVar != null) {
                zzcdmVar.zzq(j);
                this.i.set(j);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzcdm zzcdmVar = this.b;
                if (zzcdmVar != null) {
                    zzcdmVar.zzg(new zzcea(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzcee zzceeVar = this.d;
        zzceeVar.b = onUserEarnedRewardListener;
        if (activity == null) {
            zzo.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzcdm zzcdmVar = this.b;
            if (zzcdmVar != null) {
                zzcdmVar.zzd(zzceeVar);
                zzcdmVar.zza(new ObjectWrapper(activity));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzcdv(Context context, zzcdm zzcdmVar) {
        this.h = System.currentTimeMillis();
        this.i = new AtomicLong();
        this.c = context.getApplicationContext();
        this.a = new AtomicReference();
        this.b = zzcdmVar;
        this.d = new zzcee();
    }

    public zzcdv(Context context, String str) {
        this(context, str, com.google.android.gms.ads.internal.client.zzay.zzb().zzf(context, str, new zzbwc()));
    }

    public zzcdv(Context context, String str, zzcdm zzcdmVar) {
        this.h = System.currentTimeMillis();
        this.i = new AtomicLong();
        this.c = context.getApplicationContext();
        this.a = new AtomicReference(str);
        this.b = zzcdmVar;
        this.d = new zzcee();
    }
}
