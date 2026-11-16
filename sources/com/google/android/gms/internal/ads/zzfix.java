package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfix implements zzfjh {
    public zzddk a;

    @Override // com.google.android.gms.internal.ads.zzfjh
    public final /* bridge */ /* synthetic */ ListenableFuture a(zzfji zzfjiVar, zzfjg zzfjgVar) {
        return b(zzfjiVar, zzfjgVar, null);
    }

    public final synchronized ListenableFuture b(zzfji zzfjiVar, zzfjg zzfjgVar, zzddk zzddkVar) {
        zzdac zzdacVarZza;
        try {
            if (zzddkVar != null) {
                this.a = zzddkVar;
            } else {
                this.a = (zzddk) zzfjgVar.e(zzfjiVar.b).zzh();
            }
            zzdacVarZza = this.a.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zzdacVarZza.c(zzdacVarZza.b());
    }

    @Override // com.google.android.gms.internal.ads.zzfjh
    public final Object zzd() {
        zzddk zzddkVar;
        synchronized (this) {
            zzddkVar = this.a;
        }
        return zzddkVar;
    }
}
