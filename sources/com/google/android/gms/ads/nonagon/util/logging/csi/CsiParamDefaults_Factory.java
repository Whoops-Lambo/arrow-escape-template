package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.zzipf;
import com.google.android.gms.internal.ads.zzipo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class CsiParamDefaults_Factory implements zzipf<CsiParamDefaults> {
    private final zzipo zza;
    private final zzipo zzb;
    private final zzipo zzc;
    private final zzipo zzd;
    private final zzipo zze;

    public static CsiParamDefaults_Factory create(zzipo<Context> zzipoVar, zzipo<VersionInfoParcel> zzipoVar2, zzipo<PackageInfo> zzipoVar3, zzipo<String> zzipoVar4, zzipo<DeviceTierManager> zzipoVar5) {
        return new CsiParamDefaults_Factory(zzipoVar, zzipoVar2, zzipoVar3, zzipoVar4, zzipoVar5);
    }

    @NonNull
    public static CsiParamDefaults newInstance(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel, @Nullable PackageInfo packageInfo, @Nullable String str, @NonNull DeviceTierManager deviceTierManager) {
        return new CsiParamDefaults(context, versionInfoParcel, packageInfo, str, deviceTierManager);
    }

    @Override // com.google.android.gms.internal.ads.zzipu
    @NonNull
    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.zza.zzb(), (VersionInfoParcel) this.zzb.zzb(), (PackageInfo) this.zzc.zzb(), (String) this.zzd.zzb(), (DeviceTierManager) this.zze.zzb());
    }

    private CsiParamDefaults_Factory(zzipo zzipoVar, zzipo zzipoVar2, zzipo zzipoVar3, zzipo zzipoVar4, zzipo zzipoVar5) {
        this.zza = zzipoVar;
        this.zzb = zzipoVar2;
        this.zzc = zzipoVar3;
        this.zzd = zzipoVar4;
        this.zze = zzipoVar5;
    }
}
