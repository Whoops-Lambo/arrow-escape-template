package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.pm.PackageInfoCompat;
import defpackage.j52;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class s {
    public final Context a;
    public r b;

    public final r a() {
        Object j52Var;
        PackageInfo packageInfo;
        Context context = this.a;
        r rVar = this.b;
        if (rVar != null) {
            return rVar;
        }
        try {
            String string = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                packageInfo.getClass();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                packageInfo.getClass();
            }
            String str = packageInfo.packageName;
            str.getClass();
            String str2 = packageInfo.versionName;
            str2.getClass();
            r rVar2 = new r(string, str, str2, String.valueOf(PackageInfoCompat.a(packageInfo)));
            this.b = rVar2;
            j52Var = rVar2;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        boolean z = j52Var instanceof j52;
        Object obj = j52Var;
        if (z) {
            obj = null;
        }
        r rVar3 = (r) obj;
        return rVar3 == null ? new r("", "", "", "") : rVar3;
    }

    public s(Context context) {
        context.getClass();
        this.a = context;
    }
}
