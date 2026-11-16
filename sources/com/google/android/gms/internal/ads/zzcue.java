package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcue implements zzdex {
    public final zzfnh a;

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void d(Context context) {
        try {
            try {
                this.a.a.zzi();
            } catch (Throwable th) {
                throw new zzfmq(th);
            }
        } catch (zzfmq e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void x(Context context) {
        try {
            try {
                zzbwj zzbwjVar = this.a.a;
                zzbwjVar.j1();
                if (context != null) {
                    try {
                        zzbwjVar.z(new ObjectWrapper(context));
                    } catch (Throwable th) {
                        throw new zzfmq(th);
                    }
                }
            } catch (Throwable th2) {
                throw new zzfmq(th2);
            }
        } catch (zzfmq e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zza(Context context) {
        try {
            try {
                this.a.a.zzl();
            } catch (Throwable th) {
                throw new zzfmq(th);
            }
        } catch (zzfmq e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    public zzcue(zzfnh zzfnhVar) {
        this.a = zzfnhVar;
    }
}
