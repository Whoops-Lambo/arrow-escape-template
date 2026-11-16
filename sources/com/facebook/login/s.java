package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import defpackage.lz;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {
    public static final ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();
    public final String a;
    public final com.facebook.appevents.v b;
    public final String c;

    public final void a(Bundle bundle, String str) {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            bundle.getString("0_auth_logger_id");
            bundle.getString("2_result");
            bundle.getString("3_method");
            bundle.getString("6_extras");
            com.facebook.a0 a0Var = com.facebook.a0.a;
            this.b.a(bundle, str);
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public final void b(String str) {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            Bundle bundleB = w.b(str);
            bundleB.putString("2_result", "failure");
            a(bundleB, "fb_mobile_login_status_complete");
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public final void c(String str, String str2) {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            Bundle bundleB = w.b("");
            bundleB.putString("2_result", "error");
            bundleB.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            bundleB.putString("3_method", str2);
            a(bundleB, str);
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public s(Context context, String str) {
        PackageInfo packageInfo;
        this.a = str;
        this.b = new com.facebook.appevents.v(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(FbValidationUtils.FB_PACKAGE, 0)) != null) {
                this.c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
