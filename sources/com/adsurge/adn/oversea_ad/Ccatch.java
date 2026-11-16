package com.adsurge.adn.oversea_ad;

import android.app.Activity;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.catch, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Ccatch implements Runnable {
    public final /* synthetic */ WeakReference a;

    public Ccatch(WeakReference weakReference) {
        this.a = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        try {
            Activity activity = (Activity) this.a.get();
            if (activity == null) {
                return;
            }
            activity.unregisterScreenCaptureCallback((Rambutan) Rambutan.d.b());
        } catch (Throwable unused) {
        }
    }
}
