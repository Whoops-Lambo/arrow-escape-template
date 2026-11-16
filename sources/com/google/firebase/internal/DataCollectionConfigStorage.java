package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import defpackage.a50;
import defpackage.xh0;
import defpackage.y02;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class DataCollectionConfigStorage {
    public final Context a;
    public final SharedPreferences b;
    public final y02 c;
    public boolean d;

    public final synchronized void b(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.c.a(new xh0(new a50(z, 0)));
        }
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public DataCollectionConfigStorage(Context context, String str, y02 y02Var) {
        boolean zA;
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        this.a = contextCreateDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.b = sharedPreferences;
        this.c = y02Var;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            zA = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            zA = a();
        }
        this.d = zA;
    }
}
