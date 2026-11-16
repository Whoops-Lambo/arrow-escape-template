package com.adsurge.adn.oversea_ad;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.native, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Cnative implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        if (context == null) {
            return;
        }
        boolean z = !(Cstatic.b() != null);
        ReentrantLock reentrantLock = Cstatic.c;
        reentrantLock.lock();
        try {
            Cpublic cpublic = new Cpublic();
            cpublic.c = 4;
            Cstatic.a(Cstatic.a(), cpublic, context, z);
            if (cpublic.a != 3) {
                Cstatic.a(cpublic);
            }
            reentrantLock.unlock();
        } catch (Throwable unused) {
            Cstatic.c.unlock();
        }
    }
}
