package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import defpackage.vq2;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
abstract class ModernAsyncTask<Result> {
    public static Handler e;
    public volatile Status b = Status.a;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final FutureTask a = new FutureTask<Object>(new Callable<Object>() { // from class: androidx.loader.content.ModernAsyncTask.1
        @Override // java.util.concurrent.Callable
        public final Object call() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            modernAsyncTask.d.set(true);
            Object objA = null;
            try {
                Process.setThreadPriority(10);
                objA = modernAsyncTask.a();
                Binder.flushPendingCommands();
                modernAsyncTask.e(objA);
                return objA;
            } catch (Throwable th) {
                try {
                    modernAsyncTask.c.set(true);
                    throw th;
                } catch (Throwable th2) {
                    modernAsyncTask.e(objA);
                    throw th2;
                }
            }
        }
    }) { // from class: androidx.loader.content.ModernAsyncTask.2
        @Override // java.util.concurrent.FutureTask
        public final void done() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            AtomicBoolean atomicBoolean = modernAsyncTask.d;
            try {
                Object obj = get();
                if (atomicBoolean.get()) {
                    return;
                }
                modernAsyncTask.e(obj);
            } catch (InterruptedException e2) {
                Log.w("AsyncTask", e2);
            } catch (CancellationException unused) {
                if (atomicBoolean.get()) {
                    return;
                }
                modernAsyncTask.e(null);
            } catch (ExecutionException e3) {
                vq2.n("An error occurred while executing doInBackground()", e3.getCause());
            } catch (Throwable th) {
                vq2.n("An error occurred while executing doInBackground()", th);
            }
        }
    };

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Status {
        public static final Status a;
        public static final Status b;
        public static final Status c;
        public static final /* synthetic */ Status[] d;

        static {
            Status status = new Status("PENDING", 0);
            a = status;
            Status status2 = new Status("RUNNING", 1);
            b = status2;
            Status status3 = new Status("FINISHED", 2);
            c = status3;
            d = new Status[]{status, status2, status3};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) d.clone();
        }
    }

    public abstract Object a();

    public void c(Object obj) {
    }

    public void d(Object obj) {
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final void e(final Object obj) {
        Handler handler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (e == null) {
                    e = new Handler(Looper.getMainLooper());
                }
                handler = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new Runnable() { // from class: androidx.loader.content.ModernAsyncTask.3
            @Override // java.lang.Runnable
            public final void run() {
                ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                Object obj2 = obj;
                if (modernAsyncTask.c.get()) {
                    modernAsyncTask.c(obj2);
                } else {
                    modernAsyncTask.d(obj2);
                }
                modernAsyncTask.b = Status.c;
            }
        });
    }
}
