package com.inmobi.media;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Y1 {
    public static LinkedHashSet a;

    public static boolean a(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = context.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public static void a(boolean z) {
        LinkedHashSet linkedHashSet;
        if (AbstractC4221mk.a == null || (linkedHashSet = a) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((C4001en) it.next()).getClass();
                C4001en.a(z);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public static void a(Context context, C4001en c4001en, boolean z) {
        context.getClass();
        c4001en.getClass();
        if (a == null) {
            a = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new X1(context, z));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = a;
        if (linkedHashSet != null) {
            linkedHashSet.add(c4001en);
        }
    }
}
