package com.adsurge.adn.oversea_ad;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.class, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Cclass extends Cfor {
    public static final Cthis c = new Cthis();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public volatile boolean b = false;

    public final void a() {
        synchronized (this.a) {
            try {
                if (this.a.get()) {
                    return;
                }
                Application applicationB = Cconst.b();
                if (applicationB == null) {
                    return;
                }
                applicationB.registerActivityLifecycleCallbacks(this);
                boolean z = true;
                this.a.set(true);
                if (Build.VERSION.SDK_INT >= 34 && applicationB.checkPermission("android.permission.DETECT_SCREEN_CAPTURE", Process.myPid(), Process.myUid()) == 0 && c0.h.a(158)) {
                    try {
                        Rambutan.class.getDeclaredMethod("onScreenCaptured", null);
                    } catch (Throwable unused) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                this.b = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.adsurge.adn.oversea_ad.Cfor, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.b) {
            Cepheus.c.execute(new Cbreak(new WeakReference(activity), activity.getClass().getName()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.b) {
            Cepheus.c.execute(new Ccatch(new WeakReference(activity)));
        }
    }
}
