package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class RtbSignalData {
    private final Context zza;
    private final List zzb;
    private final Bundle zzc;

    @Nullable
    private final AdSize zzd;

    @Nullable
    public AdSize getAdSize() {
        return this.zzd;
    }

    @NonNull
    public List<MediationConfiguration> getConfigurations() {
        return this.zzb;
    }

    @NonNull
    public Context getContext() {
        return this.zza;
    }

    @NonNull
    public Bundle getNetworkExtras() {
        return this.zzc;
    }

    public RtbSignalData(@NonNull Context context, @NonNull List<MediationConfiguration> list, @NonNull Bundle bundle, @Nullable AdSize adSize) {
        this.zza = context;
        this.zzb = list;
        this.zzc = bundle;
        this.zzd = adSize;
    }
}
