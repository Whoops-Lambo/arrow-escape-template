package com.safedk.android.utils;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes7.dex */
public class l {
    private static final String a = "ThreadingUtils";

    public static void a(ExecutorService executorService, Runnable runnable) {
        if (n.c()) {
            Logger.d(a, "currently in main thread. launching runnable in a new BG thread");
            executorService.execute(runnable);
        } else {
            runnable.run();
        }
    }
}
