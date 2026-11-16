package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzati;
import com.google.android.gms.internal.ads.zzaud;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzauw;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcha;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4887nc;
import defpackage.ei3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbl {
    private static zzaud zza;
    private static final Object zzb = new Object();

    public final ListenableFuture zza(String str) {
        zzcha zzchaVar = new zzcha();
        zza.b(new zzbk(str, null, zzchaVar));
        return zzchaVar;
    }

    public final ListenableFuture zzb(int i, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbi zzbiVar = new zzbi(null);
        zzbg zzbgVar = new zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbh zzbhVar = new zzbh(this, i, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            try {
                zzlVar.zzb(str, C4887nc.a, zzbhVar.zzm(), zzbhVar.zzn());
            } catch (zzati e) {
                String message = e.getMessage();
                int i2 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
        zza.b(zzbhVar);
        return zzbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x0056, B:16:0x0036, B:18:0x0058), top: B:22:0x0010 }] */
    public zzbl(Context context) {
        zzaud zzaudVar;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            try {
                if (zza == null) {
                    zzbjr.a(context);
                    if (!ClientLibraryUtils.isPackageSide()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.F5)).booleanValue()) {
                            zzaudVar = zzay.zzb(context);
                        } else {
                            zzaudVar = new zzaud(new zzauw(new ei3(context.getApplicationContext())), new zzaup(new zzavb()));
                            zzaudVar.a();
                        }
                    } else {
                        zzaudVar = new zzaud(new zzauw(new ei3(context.getApplicationContext())), new zzaup(new zzavb()));
                        zzaudVar.a();
                    }
                    zza = zzaudVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
