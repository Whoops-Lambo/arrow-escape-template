package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Binder;
import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzcch;
import com.google.android.gms.internal.ads.zzegq;
import com.google.android.gms.internal.ads.zzeic;
import com.google.android.gms.internal.ads.zzeid;
import com.google.android.gms.internal.ads.zzhdo;
import com.google.android.gms.internal.ads.zzhdy;
import com.google.android.gms.internal.ads.zzheh;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ix3;
import defpackage.uc4;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzba implements zzhdo {
    private final Executor zza;
    private final zzegq zzb;

    @Override // com.google.android.gms.internal.ads.zzhdo
    public final ListenableFuture zza(Object obj) throws Exception {
        ListenableFuture listenableFutureSubmit;
        zzegq zzegqVar = this.zzb;
        final zzcch zzcchVar = (zzcch) obj;
        zzegqVar.getClass();
        String str = zzcchVar.d;
        com.google.android.gms.ads.internal.zzt.zzc();
        int i = 1;
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            listenableFutureSubmit = zzheh.b(new zzeic(1));
        } else {
            listenableFutureSubmit = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.K8)).booleanValue() || ((Boolean) zzbmd.a.c()).booleanValue()) ? zzegqVar.c.submit(new ix3(5, zzegqVar, zzcchVar)) : zzegqVar.d.c(zzcchVar);
        }
        return zzheh.h(zzheh.f((zzhdy) zzheh.g(zzhdy.s(listenableFutureSubmit), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Q6)).intValue(), TimeUnit.SECONDS, zzegqVar.a), Throwable.class, new uc4(zzegqVar, zzcchVar, Binder.getCallingUid(), i), zzegqVar.b), new zzhdo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaz
            @Override // com.google.android.gms.internal.ads.zzhdo
            public final ListenableFuture zza(Object obj2) {
                zzeid zzeidVar = (zzeid) obj2;
                zzbc zzbcVar = new zzbc(new JsonReader(new InputStreamReader(zzeidVar.a)), zzeidVar.b);
                try {
                    zzbcVar.zzb = com.google.android.gms.ads.internal.client.zzay.zza().zzo(zzcchVar.a).toString();
                } catch (JSONException unused) {
                    zzbcVar.zzb = JsonUtils.EMPTY_JSON;
                }
                return zzheh.a(zzbcVar);
            }
        }, this.zza);
    }

    public zzba(Executor executor, zzegq zzegqVar) {
        this.zza = executor;
        this.zzb = zzegqVar;
    }
}
