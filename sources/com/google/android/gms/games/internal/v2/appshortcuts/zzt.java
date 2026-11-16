package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.games_v2.a;
import com.google.android.gms.internal.games_v2.zzgz;
import com.google.android.gms.internal.games_v2.zzhd;
import defpackage.ur4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
public final class zzt {
    /* JADX WARN: Code duplicated, block: B:55:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0057 A[SYNTHETIC] */
    @Nullable
    public static zzr zza(Context context, Class cls) {
        Bundle bundle;
        Long lValueOf;
        ActivityInfo activityInfo;
        Bundle bundle2;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                bundle = null;
            } else {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        String string = "";
        if (bundle == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(bundle.getString("com.google.android.gms.games.APP_ID", "")));
            } catch (NumberFormatException unused2) {
                lValueOf = null;
            }
        }
        if (lValueOf == null) {
            return null;
        }
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(context.getPackageName()), 795136);
        ur4 ur4Var = zzhd.b;
        zzgz zzgzVar = new zzgz();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
            if (activityInfo2 != null) {
                int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                if (componentEnabledSetting == 0) {
                    if (activityInfo2.enabled) {
                        if (resolveInfo.activityInfo.exported) {
                            zzgzVar.b(resolveInfo);
                        }
                    }
                } else if (componentEnabledSetting == 1) {
                    if (resolveInfo.activityInfo.exported) {
                        zzgzVar.b(resolveInfo);
                    }
                }
            }
        }
        a aVarD = zzgzVar.d();
        int i = aVarD.d;
        int iMin = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            ActivityInfo activityInfo3 = ((ResolveInfo) aVarD.get(i2)).activityInfo;
            if (activityInfo3 != null) {
                try {
                    activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(activityInfo3.packageName, activityInfo3.name), 795264);
                } catch (PackageManager.NameNotFoundException unused3) {
                    activityInfo = null;
                }
                if (activityInfo != null && (bundle2 = activityInfo.metaData) != null) {
                    iMin = Integer.min(iMin, bundle2.getInt("com.google.android.gms.games.APP_SHORTCUTS_MAX_NUMBER", Integer.MAX_VALUE));
                    string = bundle2.getString("com.google.android.gms.games.APP_SHORTCUTS_TARGET_ACTIVITY", string);
                }
            }
        }
        Pair pair = new Pair(Integer.valueOf(iMin), string);
        return new zzr(lValueOf.longValue(), context.getPackageName(), ((Integer) pair.first).intValue(), new ComponentName(context, (Class<?>) cls), ((String) pair.second).trim());
    }
}
