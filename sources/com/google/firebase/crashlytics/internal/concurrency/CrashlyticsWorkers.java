package com.google.firebase.crashlytics.internal.concurrency;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import defpackage.k10;
import defpackage.l10;
import defpackage.m10;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class CrashlyticsWorkers {
    public static final m10 d = new m10();
    public final k10 a;
    public final k10 b;
    public final k10 c;

    public static final void a() {
        if (((Boolean) new l10(0, d, m10.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        if (((Boolean) new l10(0, d, m10.class, "isBlockingThread", "isBlockingThread()Z", 0, 1).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public CrashlyticsWorkers(ExecutorService executorService, ExecutorService executorService2) {
        executorService.getClass();
        executorService2.getClass();
        this.a = new k10(executorService);
        this.b = new k10(executorService);
        Tasks.forResult(null);
        this.c = new k10(executorService2);
    }
}
