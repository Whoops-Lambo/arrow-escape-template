package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﮣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1229 extends AbstractC1227 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public Context f3733;

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1227
    /* JADX INFO: renamed from: ﾒ */
    public final synchronized void mo889(Application application, Activity activity) {
        try {
            if (application != null) {
                this.f3733 = application.getApplicationContext();
            } else if (activity != null) {
                this.f3733 = activity.getApplicationContext();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1227
    /* JADX INFO: renamed from: ﻛ */
    public final boolean mo886() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f3733.getSystemService(StringFog.decrypt("P7qZXeA8Utk=\n", "XtntNJZVJqA=\n"))).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = this.f3733.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1227
    /* JADX INFO: renamed from: ﾒ */
    public final Activity mo888() {
        return null;
    }
}
