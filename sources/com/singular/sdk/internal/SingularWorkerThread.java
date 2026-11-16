package com.singular.sdk.internal;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class SingularWorkerThread extends HandlerThread {
    private Handler handler;

    private synchronized void ensureInit() {
        if (this.handler == null) {
            this.handler = new Handler(getLooper());
        }
    }

    public SingularWorkerThread(String str) {
        super(str);
    }

    public Handler getHandler() {
        ensureInit();
        return this.handler;
    }

    public void post(Runnable runnable) {
        getHandler().post(runnable);
    }

    public void postAtFront(Runnable runnable) {
        getHandler().postAtFrontOfQueue(runnable);
    }

    public void postDelayed(Runnable runnable, int i) {
        getHandler().postDelayed(runnable, i);
    }
}
