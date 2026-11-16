package com.adsurge.adn.G;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class c extends FutureTask {
    public final e a;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        this.a.e();
    }

    public c(Callable callable, e eVar) {
        super(callable);
        this.a = eVar;
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return super.get(j, timeUnit);
        }
        long millis = timeUnit.toMillis(j);
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (!isDone()) {
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            if (jUptimeMillis2 < millis) {
                this.a.a(millis - jUptimeMillis2);
            } else {
                throw new TimeoutException("WebView task wait timed out");
            }
        }
        return super.get();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public Object get() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            while (!isDone()) {
                this.a.a(Long.MAX_VALUE);
            }
        }
        return super.get();
    }
}
