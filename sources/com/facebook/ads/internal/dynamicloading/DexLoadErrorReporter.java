package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.infer.annotation.Nullsafe;
import defpackage.ac0;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Nullsafe(Nullsafe.Mode.LOCAL)
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;
    public static final AtomicBoolean a = new AtomicBoolean();

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(Context context, String str, double d) {
        AtomicBoolean atomicBoolean = a;
        if (atomicBoolean.get() || Math.random() >= d) {
            return;
        }
        atomicBoolean.set(true);
        new ac0(0, context, str).start();
    }

    public static void a(Context context, JSONObject jSONObject, String str) throws JSONException {
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            jSONObject.put("APPBUILD", packageManager.getPackageInfo(packageName, 0).versionCode);
            jSONObject.put("APPNAME", packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)));
            jSONObject.put("APPVERS", packageManager.getPackageInfo(packageName, 0).versionName);
        }
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }
}
