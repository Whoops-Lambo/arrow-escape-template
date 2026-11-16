package com.adsurge.adn.oversea_ad;

import android.hardware.display.DisplayManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class Ara implements DisplayManager.DisplayListener {
    public final /* synthetic */ Bootes a;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
    }

    public Ara(Bootes bootes) {
        this.a = bootes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    @Override // android.hardware.display.DisplayManager.DisplayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDisplayAdded(int r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L3
            goto L23
        L3:
            com.adsurge.adn.oversea_ad.Bootes r0 = r1.a
            android.hardware.display.DisplayManager r0 = r0.c
            if (r0 != 0) goto La
            goto L23
        La:
            android.view.Display r0 = r0.getDisplay(r2)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L23
            com.adsurge.adn.oversea_ad.Bootes r0 = r1.a     // Catch: java.lang.Throwable -> L23
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L23
            com.adsurge.adn.oversea_ad.Bootes r1 = r1.a     // Catch: java.lang.Throwable -> L20
            java.util.HashSet r1 = r1.a     // Catch: java.lang.Throwable -> L20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L20
            r1.add(r2)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adsurge.adn.oversea_ad.Ara.onDisplayAdded(int):void");
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        if (i == 0) {
            return;
        }
        synchronized (this.a) {
            this.a.a.remove(Integer.valueOf(i));
        }
    }
}
