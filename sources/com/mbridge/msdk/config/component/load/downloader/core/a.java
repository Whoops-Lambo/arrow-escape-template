package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class a implements j {
    private final ThreadPoolExecutor a;
    private final b b;

    @Override // com.mbridge.msdk.config.component.load.downloader.core.j
    public ExecutorService getDownloadResultTasks() {
        return this.a;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.j
    public b getDownloadTasks() {
        return this.b;
    }

    public a(int i) {
        b bVar = new b(i <= 0 ? 10 : i, new o(10), new ThreadPoolExecutor.DiscardPolicy());
        this.b = bVar;
        bVar.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o(10), new ThreadPoolExecutor.DiscardPolicy());
        this.a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }
}
