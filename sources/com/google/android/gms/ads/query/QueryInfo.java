package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzcaw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class QueryInfo {
    private final zzex zza;

    public static void generate(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable AdRequest adRequest, @NonNull String str, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        zza(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }

    @NonNull
    public String getQuery() {
        return this.zza.zza();
    }

    @NonNull
    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zza.zzc();
    }

    @NonNull
    @KeepForSdk
    public String getRequestId() {
        return this.zza.zzb();
    }

    public QueryInfo(zzex zzexVar) {
        this.zza = zzexVar;
    }

    private static void zza(final Context context, final AdFormat adFormat, @Nullable final AdRequest adRequest, @Nullable final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzeh zzehVarZza;
        zzbjr.a(context);
        if (((Boolean) zzblq.j.c()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjr.Yc)).booleanValue()) {
                zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdRequest adRequest2 = adRequest;
                        zzeh zzehVarZza2 = adRequest2 == null ? null : adRequest2.zza();
                        new zzcaw(context, adFormat, zzehVarZza2, str).b(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        if (adRequest == null) {
            zzehVarZza = null;
        } else {
            zzehVarZza = adRequest.zza();
        }
        new zzcaw(context, adFormat, zzehVarZza, str).b(queryInfoGenerationCallback);
    }

    public static void generate(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable AdRequest adRequest, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zza(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }
}
