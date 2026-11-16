package com.android.billingclient.api;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzhx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzdg {
    public static Bundle zza(com.google.android.gms.internal.play_billing.zzdy zzdyVar, zzhx zzhxVar) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("REQUEST_METADATA", zzdyVar.b());
        bundle.putByteArray("REQUEST_PARAMS", zzhxVar.b());
        return bundle;
    }

    public static com.google.android.gms.internal.play_billing.zzdy zzb(String str, int i, Context context, String str2) {
        String strValueOf;
        com.google.android.gms.internal.play_billing.zzdx zzdxVarP = com.google.android.gms.internal.play_billing.zzdy.p();
        zzdxVarP.e();
        com.google.android.gms.internal.play_billing.zzdy.t((com.google.android.gms.internal.play_billing.zzdy) zzdxVarP.b, str);
        zzdxVarP.e();
        com.google.android.gms.internal.play_billing.zzdy.u((com.google.android.gms.internal.play_billing.zzdy) zzdxVarP.b);
        String packageName = context.getPackageName();
        zzdxVarP.e();
        com.google.android.gms.internal.play_billing.zzdy.r((com.google.android.gms.internal.play_billing.zzdy) zzdxVarP.b, packageName);
        zzdxVarP.e();
        com.google.android.gms.internal.play_billing.zzdy.s((com.google.android.gms.internal.play_billing.zzdy) zzdxVarP.b, str2);
        try {
            strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            com.google.android.gms.internal.play_billing.zzc.h("DelegationApiParamsBuilder", "No version code is found!");
            strValueOf = null;
        }
        if (strValueOf != null) {
            zzdxVarP.e();
            com.google.android.gms.internal.play_billing.zzdy.q((com.google.android.gms.internal.play_billing.zzdy) zzdxVarP.b, strValueOf);
        }
        return (com.google.android.gms.internal.play_billing.zzdy) zzdxVarP.c();
    }
}
