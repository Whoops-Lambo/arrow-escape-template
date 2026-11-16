package com.google.unity.ads.nextgen;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class UnityExecutor {
    private static final ExecutorService adEventExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.unity.ads.nextgen.UnityExecutor.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "GMAUnityAdEventsThread");
        }
    });
    private static final ExecutorService preloaderExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.unity.ads.nextgen.UnityExecutor.2
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "GMAUnityPreloaderThread");
        }
    });

    public static ExecutorService getExecutor() {
        return adEventExecutor;
    }

    public static ExecutorService getPreloaderExecutor() {
        return preloaderExecutor;
    }

    private UnityExecutor() {
    }
}
