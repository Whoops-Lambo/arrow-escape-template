package com.adsurge.adn.oversea_ad;

import android.app.Activity;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.break, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Cbreak implements Runnable {
    public final /* synthetic */ WeakReference a;
    public final /* synthetic */ String b;

    public Cbreak(WeakReference weakReference, String str) {
        this.a = weakReference;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        try {
            Activity activity = (Activity) this.a.get();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                Rambutan rambutan = (Rambutan) Rambutan.d.b();
                rambutan.b = this.b;
                activity.registerScreenCaptureCallback(Cepheus.b, rambutan);
            }
        } catch (Throwable unused) {
        }
    }
}
