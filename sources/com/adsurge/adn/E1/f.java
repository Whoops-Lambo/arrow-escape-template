package com.adsurge.adn.E1;

import android.os.SystemClock;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    public final CountDownLatch a = new CountDownLatch(1);
    public volatile boolean b = false;
    public volatile byte[] c = null;

    public static boolean a(String str, f fVar) {
        try {
            SystemClock.elapsedRealtime();
            boolean zAwait = fVar.a.await(15000L, TimeUnit.MILLISECONDS);
            SystemClock.elapsedRealtime();
            return zAwait && fVar.b;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public InputStream a(String str) {
        if (a(str, this) && this.c != null && this.c.length > 0) {
            return new ByteArrayInputStream(this.c);
        }
        return null;
    }
}
