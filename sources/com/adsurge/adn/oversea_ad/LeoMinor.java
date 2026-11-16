package com.adsurge.adn.oversea_ad;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class LeoMinor implements Runnable {
    public final /* synthetic */ Leo a;

    public LeoMinor(Leo leo) {
        this.a = leo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        if (!Cumquat.b(context)) {
            return;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.a.a;
            if (i >= strArr.length) {
                return;
            }
            try {
                Lichee lichee = new Lichee(strArr[i]);
                lichee.c = 10000;
                lichee.d = 10000;
                Lyra.a(new Longan(lichee));
                this.a.b = i;
                return;
            } catch (Throwable unused) {
                i++;
            }
        }
    }
}
