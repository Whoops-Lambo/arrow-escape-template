package androidx.work.impl;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ek1;
import defpackage.hb0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo
public class Processor implements ExecutionListener, ForegroundProcessor {
    public static final String m = Logger.g("Processor");
    public final Context b;
    public final Configuration c;
    public final WorkManagerTaskExecutor d;
    public final WorkDatabase e;
    public final List i;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet j = new HashSet();
    public final ArrayList k = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object l = new Object();
    public final HashMap h = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FutureListener implements Runnable {
        public final Processor a;
        public final WorkGenerationalId b;
        public final ListenableFuture c;

        @Override // java.lang.Runnable
        public final void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.a.e(this.b, zBooleanValue);
        }

        public FutureListener(Processor processor, WorkGenerationalId workGenerationalId, SettableFuture settableFuture) {
            this.a = processor;
            this.b = workGenerationalId;
            this.c = settableFuture;
        }
    }

    public static boolean c(WorkerWrapper workerWrapper, String str) {
        if (workerWrapper == null) {
            Logger.e().a(m, "WorkerWrapper could not be found for " + str);
            return false;
        }
        workerWrapper.r = true;
        workerWrapper.i();
        workerWrapper.q.cancel(true);
        if (workerWrapper.f == null || !workerWrapper.q.isCancelled()) {
            Logger.e().a(WorkerWrapper.s, "WorkSpec " + workerWrapper.e + " is already done. Not interrupting.");
        } else {
            workerWrapper.f.stop();
        }
        Logger.e().a(m, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public final void a(String str, ForegroundInfo foregroundInfo) {
        synchronized (this.l) {
            try {
                Logger.e().f(m, "Moving WorkSpec (" + str + ") to the foreground");
                WorkerWrapper workerWrapper = (WorkerWrapper) this.g.remove(str);
                if (workerWrapper != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock wakeLockB = WakeLocks.b(this.b, "ProcessorForegroundLck");
                        this.a = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f.put(str, workerWrapper);
                    ContextCompat.e(this.b, SystemForegroundDispatcher.c(this.b, WorkSpecKt.a(workerWrapper.e), foregroundInfo));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ExecutionListener executionListener) {
        synchronized (this.l) {
            this.k.add(executionListener);
        }
    }

    public final boolean d(String str) {
        boolean z;
        synchronized (this.l) {
            try {
                z = this.g.containsKey(str) || this.f.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.l) {
            try {
                WorkerWrapper workerWrapper = (WorkerWrapper) this.g.get(workGenerationalId.a);
                if (workerWrapper != null && workGenerationalId.equals(WorkSpecKt.a(workerWrapper.e))) {
                    this.g.remove(workGenerationalId.a);
                }
                Logger.e().a(m, getClass().getSimpleName() + " " + workGenerationalId.a + " executed; reschedule = " + z);
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ExecutionListener) obj).e(workGenerationalId, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(ExecutionListener executionListener) {
        synchronized (this.l) {
            this.k.remove(executionListener);
        }
    }

    public final boolean g(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        WorkGenerationalId workGenerationalId = startStopToken.a;
        String str = workGenerationalId.a;
        ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.e.runInTransaction(new hb0(1, this, arrayList, str));
        int i = 18;
        if (workSpec == null) {
            Logger.e().h(m, "Didn't find WorkSpec for id " + workGenerationalId);
            this.d.c.execute(new ek1(i, this, workGenerationalId));
            return false;
        }
        synchronized (this.l) {
            try {
                if (d(str)) {
                    Set set = (Set) this.h.get(str);
                    if (((StartStopToken) set.iterator().next()).a.b == workGenerationalId.b) {
                        set.add(startStopToken);
                        Logger.e().a(m, "Work " + workGenerationalId + " is already enqueued for processing");
                    } else {
                        this.d.c.execute(new ek1(i, this, workGenerationalId));
                    }
                    return false;
                }
                if (workSpec.t != workGenerationalId.b) {
                    this.d.c.execute(new ek1(i, this, workGenerationalId));
                    return false;
                }
                WorkerWrapper.Builder builder = new WorkerWrapper.Builder(this.b, this.c, this.d, this, this.e, workSpec, arrayList);
                builder.g = this.i;
                if (runtimeExtras != null) {
                    builder.i = runtimeExtras;
                }
                WorkerWrapper workerWrapper = new WorkerWrapper(builder);
                SettableFuture settableFuture = workerWrapper.p;
                settableFuture.addListener(new FutureListener(this, startStopToken.a, settableFuture), this.d.c);
                this.g.put(str, workerWrapper);
                HashSet hashSet = new HashSet();
                hashSet.add(startStopToken);
                this.h.put(str, hashSet);
                this.d.a.execute(workerWrapper);
                Logger.e().a(m, getClass().getSimpleName() + ": processing " + workGenerationalId);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.l) {
            try {
                if (this.f.isEmpty()) {
                    Context context = this.b;
                    String str = SystemForegroundDispatcher.j;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.b.startService(intent);
                    } catch (Throwable th) {
                        Logger.e().d(m, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Processor(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor, WorkDatabase workDatabase, List list) {
        this.b = context;
        this.c = configuration;
        this.d = workManagerTaskExecutor;
        this.e = workDatabase;
        this.i = list;
    }
}
