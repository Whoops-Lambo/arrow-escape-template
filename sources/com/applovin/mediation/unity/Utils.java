package com.applovin.mediation.unity;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Looper;
import com.unity3d.player.UnityPlayer;
import defpackage.nj2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class Utils {
    public static Activity getCurrentActivity() {
        return UnityPlayer.currentActivity;
    }

    public static boolean isCurrentProcessInForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable unused) {
        }
        int i = runningAppProcessInfo.importance;
        return i == 100 || i == 200;
    }

    public static void runSafelyOnUiThread(Activity activity, Runnable runnable) {
        activity.runOnUiThread(new nj2(runnable, 18));
    }

    public static boolean isMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runSafelyOnUiThread$0(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
