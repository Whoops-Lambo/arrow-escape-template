package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.q63;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class o implements ThreadFactory {
    private final int a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(o.this.a);
            } catch (Throwable th) {
                q0.b("PriorityThreadFactory", "set thread priority error : " + th.getMessage());
            }
            try {
                this.a.run();
            } catch (Exception e) {
                q63.r(e, new StringBuilder("runnable error : "), "PriorityThreadFactory");
            }
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new a(runnable));
        thread.setName("mb_download_thread");
        return thread;
    }

    public o(int i) {
        this.a = i;
    }
}
