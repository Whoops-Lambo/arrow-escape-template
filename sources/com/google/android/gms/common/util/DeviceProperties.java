package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.InternalClientFlagRegistry;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
public final class DeviceProperties {

    @Nullable
    private static Boolean zza;

    @Nullable
    private static Boolean zzb;

    @Nullable
    private static Boolean zzc;

    @Nullable
    private static Boolean zzd;

    @Nullable
    private static Boolean zze;

    @Nullable
    private static Boolean zzf;

    @Nullable
    private static Boolean zzg;

    @Nullable
    private static Boolean zzh;

    @Nullable
    private static Boolean zzi;

    @Nullable
    private static Boolean zzj;

    @Nullable
    private static Boolean zzk;

    @Nullable
    private static Boolean zzl;

    @Nullable
    private static Boolean zzm;

    @Nullable
    private static Boolean zzn;

    @Nullable
    private static Boolean zzo;

    @Nullable
    private static Boolean zzp;

    @Nullable
    private static Boolean zzq;

    @Nullable
    private static Boolean zzr;

    @KeepForSdk
    public static boolean isPhoneGo(@NonNull Context context) {
        ActivityManager activityManager;
        boolean z = false;
        if (context == null) {
            return false;
        }
        if (zzb == null) {
            if (isPhone(context)) {
                if (zzi == null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
                    zzi = Boolean.valueOf(activityManager.isLowRamDevice());
                }
                if (Objects.equal(zzi, Boolean.TRUE) && Build.VERSION.SDK_INT >= 27) {
                    z = true;
                }
            }
            zzb = Boolean.valueOf(z);
        }
        return zzb.booleanValue();
    }

    @KeepForSdk
    public static boolean isTablet(@NonNull Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzc == null) {
            zzc = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zza(resources));
        }
        return zzc.booleanValue();
    }

    public static boolean zza(@NonNull Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (zze == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            zze = Boolean.valueOf(z);
        }
        return zze.booleanValue();
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isBstar(@NonNull Context context) {
        if (zzo == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            zzo = Boolean.valueOf(z);
        }
        return zzo.booleanValue();
    }

    @KeepForSdk
    public static boolean isFoldable(@NonNull Context context) {
        if (zzd == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle")) {
                z = true;
            }
            zzd = Boolean.valueOf(z);
        }
        return zzd.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(@NonNull Context context) {
        if (zzh == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            zzh = Boolean.valueOf(z);
        }
        return zzh.booleanValue();
    }

    @KeepForSdk
    public static boolean isPhone(@NonNull Context context) {
        if (zza == null) {
            boolean z = true;
            if (InternalClientFlagRegistry.getClientFlags().isPhoneRefinedFoldableAndTabletLogic()) {
                boolean z2 = isWearable(context) || zze(context) || zzf(context) || isAuto(context) || isTv(context) || isBstar(context) || isXr(context) || zzk(context) || zzc(context.getPackageManager());
                if (isTablet(context)) {
                    zza = Boolean.valueOf(isFoldable(context) && !z2);
                } else {
                    zza = Boolean.valueOf(!z2);
                }
            } else {
                if (!isFoldable(context) && (isTablet(context) || isWearable(context) || zze(context) || zzf(context) || isAuto(context) || isTv(context) || zzj(context.getPackageManager()) || isBstar(context) || isXr(context) || zzk(context) || zzc(context.getPackageManager()))) {
                    z = false;
                }
                zza = Boolean.valueOf(z);
            }
        }
        return zza.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        int i = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    public static boolean zzb(@NonNull PackageManager packageManager) {
        if (zzf == null) {
            zzf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return zzf.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    public static boolean zzc(@NonNull PackageManager packageManager) {
        if (zzr == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastV()) {
                if (Build.VERSION.SDK_INT < 36) {
                    String str = Build.VERSION.CODENAME;
                    if (str.charAt(0) >= 'B' && str.charAt(0) <= 'C') {
                        if (packageManager.hasSystemFeature("android.hardware.type.xr_peripheral")) {
                            z = true;
                        }
                    }
                } else if (packageManager.hasSystemFeature("android.hardware.type.xr_peripheral")) {
                    z = true;
                }
            }
            zzr = Boolean.valueOf(z);
        }
        return zzr.booleanValue();
    }

    public static boolean zzd(@NonNull Context context) {
        if (zzg == null) {
            zzg = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return zzg.booleanValue();
    }

    public static boolean zze(@NonNull Context context) {
        if (zzj == null) {
            zzj = Boolean.valueOf(PlatformVersion.isAtLeastO() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return zzj.booleanValue();
    }

    @ShowFirstParty
    public static boolean zzf(@NonNull Context context) {
        if (zzk == null) {
            zzk = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
        }
        return zzk.booleanValue();
    }

    @SideEffectFree
    public static boolean zzg(@NonNull PackageManager packageManager) {
        if (zzl == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            zzl = Boolean.valueOf(z);
        }
        return zzl.booleanValue();
    }

    @SideEffectFree
    public static boolean zzh(@NonNull PackageManager packageManager) {
        if (zzm == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback") && !zzj(packageManager)) {
                z = false;
            }
            zzm = Boolean.valueOf(z);
        }
        return zzm.booleanValue();
    }

    @SideEffectFree
    public static boolean zzi(@NonNull PackageManager packageManager) {
        if (zzp == null) {
            zzp = Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.api.spatial"));
        }
        return zzp.booleanValue();
    }

    public static boolean zzj(@NonNull PackageManager packageManager) {
        if (zzn == null) {
            zzn = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
        }
        return zzn.booleanValue();
    }

    @ShowFirstParty
    public static boolean zzk(@NonNull Context context) {
        if (zzq == null) {
            zzq = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.desktop.gms"));
        }
        return zzq.booleanValue();
    }

    private DeviceProperties() {
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isAuto(@NonNull Context context) {
        return zzg(context.getPackageManager());
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(@NonNull Context context) {
        return zza(context.getResources());
    }

    @KeepForSdk
    public static boolean isSidewinder(@NonNull Context context) {
        return zzd(context);
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isTv(@NonNull Context context) {
        return zzh(context.getPackageManager());
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isWearable(@NonNull Context context) {
        return zzb(context.getPackageManager());
    }

    @KeepForSdk
    @TargetApi(26)
    public static boolean isWearableWithoutPlayStore(@NonNull Context context) {
        if (!isWearable(context) || PlatformVersion.isAtLeastN()) {
            if (zzd(context)) {
                if (!PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isXr(@NonNull Context context) {
        return zzi(context.getPackageManager());
    }

    @KeepForSdk
    public static boolean isTablet(@NonNull Context context) {
        return isTablet(context.getResources());
    }
}
