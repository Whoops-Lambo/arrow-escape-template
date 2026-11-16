package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfci implements zzfdv {
    public final ApplicationInfo a;
    public final PackageInfo b;
    public final Context c;

    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        String strValueOf;
        String str;
        String str2;
        String installingPackageName;
        Context context = this.c;
        String str3 = this.a.packageName;
        String str4 = null;
        PackageInfo packageInfo = this.b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str5 = packageInfo == null ? null : packageInfo.versionName;
        try {
            zzgdf zzgdfVar = com.google.android.gms.ads.internal.util.zzs.zza;
            strValueOf = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str3));
        } catch (PackageManager.NameNotFoundException unused) {
            strValueOf = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ge)).booleanValue()) {
                try {
                    InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(str3);
                    if (installSourceInfo != null) {
                        installingPackageName = installSourceInfo.getInstallingPackageName();
                        try {
                            if (TextUtils.isEmpty(installingPackageName)) {
                                com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                                installingPackageName = null;
                            }
                            try {
                                String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                                try {
                                    if (TextUtils.isEmpty(initiatingPackageName)) {
                                        com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                                        str2 = str4;
                                    } else {
                                        str2 = initiatingPackageName;
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    str4 = initiatingPackageName;
                                    com.google.android.gms.ads.internal.zzt.zzh().d("PackageInfoSignalSource.getInstallSourceInfo", e);
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            e = e3;
                        }
                        str = installingPackageName;
                    } else {
                        str = null;
                        str2 = null;
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    e = e4;
                    installingPackageName = null;
                }
            } else {
                str = null;
                str2 = null;
            }
        } else {
            str = null;
            str2 = null;
        }
        return zzheh.a(new zzfcj(str3, numValueOf, str5, strValueOf, str, str2));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 29;
    }

    public zzfci(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.a = applicationInfo;
        this.b = packageInfo;
        this.c = context;
    }
}
