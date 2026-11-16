package com.applovin.shadow.okhttp3.internal.concurrent;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import defpackage.jc1;
import defpackage.sr0;
import java.util.Arrays;
import java.util.logging.Level;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;", "task", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Laz2;", "taskLog", "(Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;Lsr0;)V", "message", CreativeInfo.f, "(Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;)V", "", "ns", "formatDuration", "(J)Ljava/lang/String;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "block", "logElapsed", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lsr0;)Ljava/lang/Object;", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TaskLoggerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.INSTANCE.getLogger().fine(taskQueue.getName() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
    }

    @NotNull
    public static final String formatDuration(long j) {
        String strM;
        if (j <= -999500000) {
            strM = jc1.m((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strM = jc1.m((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strM = jc1.m((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strM = jc1.m((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strM = jc1.m((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strM = jc1.m((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strM}, 1));
    }

    public static final <T> T logElapsed(@NotNull Task task, @NotNull TaskQueue taskQueue, @NotNull sr0 sr0Var) {
        long jNanoTime;
        task.getClass();
        taskQueue.getClass();
        sr0Var.getClass();
        boolean zIsLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = taskQueue.getTaskRunner().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T t = (T) sr0Var.invoke();
            if (zIsLoggable) {
                long jNanoTime2 = taskQueue.getTaskRunner().getBackend().nanoTime() - jNanoTime;
                StringBuilder sb = new StringBuilder("finished run in ");
            }
            return t;
        } finally {
            if (zIsLoggable) {
                log(task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
            }
        }
    }

    public static final void taskLog(@NotNull Task task, @NotNull TaskQueue taskQueue, @NotNull sr0 sr0Var) {
        task.getClass();
        taskQueue.getClass();
        sr0Var.getClass();
        if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, (String) sr0Var.invoke());
        }
    }
}
