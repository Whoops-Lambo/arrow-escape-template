package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class Foxnut {
    public static boolean a() {
        Context context;
        int i = Build.VERSION.SDK_INT;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        if (context.checkPermission("android.permission.READ_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) != 0) {
            return false;
        }
        if (i >= 29) {
            return Environment.isExternalStorageLegacy();
        }
        return true;
    }

    public static int a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }
}
