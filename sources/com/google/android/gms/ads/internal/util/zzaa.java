package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzbjr;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzaa {
    private static volatile float zzc = -1.0f;
    private static volatile long zzd;
    private static final Object zze = new Object();
    private boolean zza = false;
    private float zzb = 1.0f;

    private final synchronized boolean zzf() {
        return this.zzb >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private static float zzg(AudioManager audioManager) {
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        return streamMaxVolume == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : audioManager.getStreamVolume(3) / streamMaxVolume;
    }

    public final synchronized void zza(float f) {
        this.zzb = f;
    }

    public final synchronized float zzb() {
        if (!zzf()) {
            return 1.0f;
        }
        return this.zzb;
    }

    public final synchronized void zzc(boolean z) {
        this.zza = z;
    }

    public final synchronized boolean zzd() {
        return this.zza;
    }

    public static float zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ig)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            return audioManager == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : zzg(audioManager);
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.jg)).intValue();
        if (zzc != -1.0f && jCurrentTimeMillis - zzd < jIntValue) {
            return zzc;
        }
        synchronized (zze) {
            try {
                long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (zzc != -1.0f && jCurrentTimeMillis2 - zzd < jIntValue) {
                    return zzc;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    zzc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    zzd = jCurrentTimeMillis2;
                    return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                zzc = zzg(audioManager2);
                zzd = jCurrentTimeMillis2;
                return zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
