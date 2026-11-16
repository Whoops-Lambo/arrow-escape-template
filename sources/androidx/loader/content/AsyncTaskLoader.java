package androidx.loader.content;

import android.os.AsyncTask;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import defpackage.e32;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {
    public Executor h;
    public volatile LoadTask i;
    public volatile LoadTask j;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class LoadTask extends ModernAsyncTask<D> implements Runnable {
        public LoadTask() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final Object a() {
            try {
                return AsyncTaskLoader.this.i();
            } catch (OperationCanceledException e) {
                if (this.c.get()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void c(Object obj) {
            AsyncTaskLoader asyncTaskLoader = AsyncTaskLoader.this;
            asyncTaskLoader.j(obj);
            if (asyncTaskLoader.j == this) {
                if (asyncTaskLoader.g) {
                    if (asyncTaskLoader.c) {
                        asyncTaskLoader.k();
                    } else {
                        asyncTaskLoader.f = true;
                    }
                }
                SystemClock.uptimeMillis();
                asyncTaskLoader.j = null;
                asyncTaskLoader.h();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void d(Object obj) {
            AsyncTaskLoader asyncTaskLoader = AsyncTaskLoader.this;
            if (asyncTaskLoader.i == this) {
                if (asyncTaskLoader.d) {
                    asyncTaskLoader.j(obj);
                    return;
                }
                asyncTaskLoader.g = false;
                SystemClock.uptimeMillis();
                asyncTaskLoader.i = null;
                asyncTaskLoader.a(obj);
                return;
            }
            asyncTaskLoader.j(obj);
            if (asyncTaskLoader.j == this) {
                if (asyncTaskLoader.g) {
                    if (asyncTaskLoader.c) {
                        asyncTaskLoader.k();
                    } else {
                        asyncTaskLoader.f = true;
                    }
                }
                SystemClock.uptimeMillis();
                asyncTaskLoader.j = null;
                asyncTaskLoader.h();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AsyncTaskLoader.this.h();
        }
    }

    public void g() {
    }

    public abstract Object i();

    public void j(Object obj) {
    }

    @Override // androidx.loader.content.Loader
    public final boolean c() {
        if (this.i == null) {
            return false;
        }
        boolean z = this.c;
        if (!z) {
            if (z) {
                k();
            } else {
                this.f = true;
            }
        }
        LoadTask loadTask = this.j;
        LoadTask loadTask2 = this.i;
        if (loadTask != null) {
            loadTask2.getClass();
            this.i = null;
            return false;
        }
        loadTask2.getClass();
        LoadTask loadTask3 = this.i;
        loadTask3.c.set(true);
        boolean zCancel = loadTask3.a.cancel(false);
        if (zCancel) {
            this.j = this.i;
            g();
        }
        this.i = null;
        return zCancel;
    }

    public final void h() {
        if (this.j != null || this.i == null) {
            return;
        }
        this.i.getClass();
        if (this.h == null) {
            this.h = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        LoadTask loadTask = this.i;
        Executor executor = this.h;
        if (loadTask.b == ModernAsyncTask.Status.a) {
            loadTask.b = ModernAsyncTask.Status.b;
            executor.execute(loadTask.a);
            return;
        }
        int iOrdinal = loadTask.b.ordinal();
        if (iOrdinal == 1) {
            e32.i("Cannot execute task: the task is already running.");
        } else if (iOrdinal != 2) {
            e32.i("We should never reach this state");
        } else {
            e32.i("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    @Override // androidx.loader.content.Loader
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.b(str, fileDescriptor, printWriter, strArr);
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.i);
            printWriter.print(" waiting=");
            this.i.getClass();
            printWriter.println(false);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            this.j.getClass();
            printWriter.println(false);
        }
    }

    public final void k() {
        c();
        this.i = new LoadTask();
        h();
    }
}
