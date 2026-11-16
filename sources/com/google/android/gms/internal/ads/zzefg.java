package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import defpackage.ov3;
import defpackage.qv3;
import defpackage.tc4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzefg {
    public final Context a;
    public qv3 b;

    public final void a(tc4 tc4Var) {
        ServiceInfo serviceInfo;
        qv3 qv3Var = this.b;
        Context context = qv3Var.b;
        if (qv3Var.a()) {
            zzasy.a("Service connection is valid. No need to re-initialize.");
            tc4Var.f(0);
            return;
        }
        int i = qv3Var.a;
        if (i == 1) {
            zzasy.b("Client is already in the process of connecting to the service.");
            tc4Var.f(3);
            return;
        }
        if (i == 3) {
            zzasy.b("Client was already closed and can't be reused. Please create another instance.");
            tc4Var.f(3);
            return;
        }
        zzasy.a("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            qv3Var.a = 0;
            zzasy.a("Install Referrer service unavailable on device.");
            tc4Var.f(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    ov3 ov3Var = new ov3(qv3Var, tc4Var);
                    qv3Var.e = ov3Var;
                    try {
                        if (context.bindService(intent2, ov3Var, 1)) {
                            zzasy.a("Service was bonded successfully.");
                            return;
                        }
                        zzasy.b("Connection to service is blocked.");
                        qv3Var.a = 0;
                        tc4Var.f(1);
                        return;
                    } catch (SecurityException unused) {
                        zzasy.b("No permission to connect to service.");
                        qv3Var.a = 0;
                        tc4Var.f(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        zzasy.b("Play Store missing or incompatible. Version 8.3.73 or later required.");
        qv3Var.a = 0;
        tc4Var.f(2);
    }

    public zzefg(Context context) {
        this.a = context;
    }
}
