package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.zzbjr;
import com.ironsource.C4664b4;
import com.ironsource.R6;
import com.singular.sdk.internal.Constants;
import defpackage.uy3;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    @Nullable
    private final PackageInfo zzd;

    @Nullable
    private final String zze;
    private final DeviceTierManager zzf;

    public void set(@NonNull Map<String, String> map) {
        PackageInfo packageInfo;
        map.put("s", "gmob_sdk");
        map.put("v", Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
        map.put(R6.F, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        map.put(C4664b4.i.G, zzs.zzt());
        map.put("app", this.zzb);
        zzt.zzc();
        Context context = this.zza;
        map.put("is_lite_sdk", true != zzs.zzH(context) ? "0" : "1");
        uy3 uy3Var = zzbjr.a;
        ArrayList arrayListB = zzba.zzb().b();
        if (((Boolean) zzba.zzc().a(zzbjr.c8)).booleanValue()) {
            arrayListB.addAll(zzt.zzh().g().zzi().i);
        }
        map.put(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, TextUtils.join(",", arrayListB));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzba.zzc().a(zzbjr.gd)).booleanValue()) {
            zzt.zzc();
            map.put("is_bstar", true != zzs.zzE(context) ? "0" : "1");
        }
        if (((Boolean) zzba.zzc().a(zzbjr.db)).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjr.o3)).booleanValue()) {
                String str = zzt.zzh().g;
                if (str == null) {
                    str = "";
                }
                map.put(R6.L, str);
            }
        }
        if (((Boolean) zzba.zzc().a(zzbjr.od)).booleanValue()) {
            String str2 = this.zze;
            map.put("uev", str2 != null ? str2 : "");
        }
        if (((Boolean) zzba.zzc().a(zzbjr.h3)).booleanValue()) {
            map.put("mem_tier", this.zzf.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) zzba.zzc().a(zzbjr.i3)).booleanValue()) {
            map.put("proc_tier", this.zzf.getAvailableProcessorTier().name());
        }
        if (!((Boolean) zzba.zzc().a(zzbjr.j3)).booleanValue() || (packageInfo = this.zzd) == null) {
            return;
        }
        map.put("vc", String.valueOf(packageInfo.versionCode));
        map.put("vn", String.valueOf(packageInfo.versionName));
    }

    @VisibleForTesting
    public CsiParamDefaults(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel, @Nullable PackageInfo packageInfo, @Nullable String str, @NonNull DeviceTierManager deviceTierManager) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
        this.zzd = packageInfo;
        this.zze = str;
        this.zzf = deviceTierManager;
    }
}
