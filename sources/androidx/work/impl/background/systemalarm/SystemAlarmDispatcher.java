package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.SerialExecutorImpl;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import defpackage.e32;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@RestrictTo
public class SystemAlarmDispatcher implements ExecutionListener {
    public static final String j = Logger.g("SystemAlarmDispatcher");
    public final Context a;
    public final TaskExecutor b;
    public final WorkTimer c;
    public final Processor d;
    public final WorkManagerImpl e;
    public final CommandHandler f;
    public final ArrayList g;
    public Intent h;
    public SystemAlarmService i;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AddRunnable implements Runnable {
        public final SystemAlarmDispatcher a;
        public final Intent b;
        public final int c;

        @Override // java.lang.Runnable
        public final void run() {
            Intent intent = this.b;
            this.a.a(this.c, intent);
        }

        public AddRunnable(int i, Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
            this.a = systemAlarmDispatcher;
            this.b = intent;
            this.c = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface CommandsCompletedListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class DequeueAndCheckForCompletion implements Runnable {
        public final SystemAlarmDispatcher a;

        /* JADX WARN: Code duplicated, block: B:32:0x009a A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0015, B:6:0x0019, B:8:0x003f, B:11:0x0045, B:12:0x004c, B:13:0x004d, B:14:0x0057, B:18:0x0061, B:20:0x0069, B:21:0x006b, B:25:0x0075, B:27:0x0082, B:35:0x00a5, B:31:0x0099, B:32:0x009a, B:34:0x00a2, B:39:0x00a9, B:22:0x006c, B:23:0x0072, B:15:0x0058, B:16:0x005e), top: B:42:0x0015, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00a2 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0015, B:6:0x0019, B:8:0x003f, B:11:0x0045, B:12:0x004c, B:13:0x004d, B:14:0x0057, B:18:0x0061, B:20:0x0069, B:21:0x006b, B:25:0x0075, B:27:0x0082, B:35:0x00a5, B:31:0x0099, B:32:0x009a, B:34:0x00a2, B:39:0x00a9, B:22:0x006c, B:23:0x0072, B:15:0x0058, B:16:0x005e), top: B:42:0x0015, inners: #1, #2 }] */
        @Override // java.lang.Runnable
        public final void run() {
            boolean zIsEmpty;
            boolean zIsEmpty2;
            SystemAlarmDispatcher systemAlarmDispatcher = this.a;
            Logger loggerE = Logger.e();
            String str = SystemAlarmDispatcher.j;
            loggerE.a(str, "Checking if commands are complete.");
            SystemAlarmDispatcher.b();
            synchronized (systemAlarmDispatcher.g) {
                try {
                    if (systemAlarmDispatcher.h != null) {
                        Logger.e().a(str, "Removing command " + systemAlarmDispatcher.h);
                        if (!((Intent) systemAlarmDispatcher.g.remove(0)).equals(systemAlarmDispatcher.h)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        systemAlarmDispatcher.h = null;
                    }
                    SerialExecutorImpl serialExecutorImplC = systemAlarmDispatcher.b.c();
                    CommandHandler commandHandler = systemAlarmDispatcher.f;
                    synchronized (commandHandler.c) {
                        zIsEmpty = commandHandler.b.isEmpty();
                    }
                    if (zIsEmpty && systemAlarmDispatcher.g.isEmpty()) {
                        synchronized (serialExecutorImplC.d) {
                            zIsEmpty2 = serialExecutorImplC.a.isEmpty();
                        }
                        if (zIsEmpty2) {
                            Logger.e().a(str, "No more commands & intents.");
                            SystemAlarmService systemAlarmService = systemAlarmDispatcher.i;
                            if (systemAlarmService != null) {
                                systemAlarmService.c = true;
                                Logger.e().a(SystemAlarmService.d, "All commands completed in dispatcher");
                                WakeLocks.a();
                                systemAlarmService.stopSelf();
                            }
                        } else if (!systemAlarmDispatcher.g.isEmpty()) {
                            systemAlarmDispatcher.c();
                        }
                    } else if (!systemAlarmDispatcher.g.isEmpty()) {
                        systemAlarmDispatcher.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public DequeueAndCheckForCompletion(SystemAlarmDispatcher systemAlarmDispatcher) {
            this.a = systemAlarmDispatcher;
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(WorkGenerationalId workGenerationalId, boolean z) {
        Executor executorB = this.b.b();
        String str = CommandHandler.e;
        Intent intent = new Intent(this.a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        CommandHandler.c(intent, workGenerationalId);
        executorB.execute(new AddRunnable(0, intent, this));
    }

    public SystemAlarmDispatcher(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.a = applicationContext;
        this.f = new CommandHandler(applicationContext, new StartStopTokens());
        WorkManagerImpl workManagerImplC = WorkManagerImpl.c(systemAlarmService);
        this.e = workManagerImplC;
        this.c = new WorkTimer(workManagerImplC.b.e);
        Processor processor = workManagerImplC.f;
        this.d = processor;
        this.b = workManagerImplC.d;
        processor.b(this);
        this.g = new ArrayList();
        this.h = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        e32.i("Needs to be invoked on the main thread.");
    }

    public final void a(int i, Intent intent) {
        Logger loggerE = Logger.e();
        String str = j;
        loggerE.a(str, "Adding command " + intent + " (" + i + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.e().h(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.g) {
                try {
                    ArrayList arrayList = this.g;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            try {
                boolean zIsEmpty = this.g.isEmpty();
                this.g.add(intent);
                if (zIsEmpty) {
                    c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock wakeLockB = WakeLocks.b(this.a, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.e.d.a(new Runnable() { // from class: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1
                @Override // java.lang.Runnable
                public final void run() {
                    Executor executorB;
                    DequeueAndCheckForCompletion dequeueAndCheckForCompletion;
                    synchronized (SystemAlarmDispatcher.this.g) {
                        SystemAlarmDispatcher systemAlarmDispatcher = SystemAlarmDispatcher.this;
                        systemAlarmDispatcher.h = (Intent) systemAlarmDispatcher.g.get(0);
                    }
                    Intent intent = SystemAlarmDispatcher.this.h;
                    if (intent != null) {
                        String action = intent.getAction();
                        int intExtra = SystemAlarmDispatcher.this.h.getIntExtra("KEY_START_ID", 0);
                        Logger loggerE = Logger.e();
                        String str = SystemAlarmDispatcher.j;
                        loggerE.a(str, "Processing command " + SystemAlarmDispatcher.this.h + ", " + intExtra);
                        PowerManager.WakeLock wakeLockB2 = WakeLocks.b(SystemAlarmDispatcher.this.a, action + " (" + intExtra + ")");
                        try {
                            Logger.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockB2);
                            wakeLockB2.acquire();
                            SystemAlarmDispatcher systemAlarmDispatcher2 = SystemAlarmDispatcher.this;
                            systemAlarmDispatcher2.f.a(intExtra, systemAlarmDispatcher2.h, systemAlarmDispatcher2);
                            Logger.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockB2);
                            wakeLockB2.release();
                            executorB = SystemAlarmDispatcher.this.b.b();
                            dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this);
                        } catch (Throwable th) {
                            try {
                                Logger loggerE2 = Logger.e();
                                String str2 = SystemAlarmDispatcher.j;
                                loggerE2.d(str2, "Unexpected error in onHandleIntent", th);
                                Logger.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockB2);
                                wakeLockB2.release();
                                executorB = SystemAlarmDispatcher.this.b.b();
                                dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this);
                            } catch (Throwable th2) {
                                Logger.e().a(SystemAlarmDispatcher.j, "Releasing operation wake lock (" + action + ") " + wakeLockB2);
                                wakeLockB2.release();
                                SystemAlarmDispatcher.this.b.b().execute(new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this));
                                throw th2;
                            }
                        }
                        executorB.execute(dequeueAndCheckForCompletion);
                    }
                }
            });
        } finally {
            wakeLockB.release();
        }
    }
}
