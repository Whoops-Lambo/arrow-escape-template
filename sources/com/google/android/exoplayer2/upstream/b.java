package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends Handler implements Runnable {
    public final int a;
    public final Loader.Loadable b;
    public final long c;
    public Loader.Callback d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean h;
    public volatile boolean i;
    public final /* synthetic */ Loader j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Loader loader, Looper looper, Loader.Loadable loadable, Loader.Callback callback, int i, long j) {
        super(looper);
        this.j = loader;
        this.b = loadable;
        this.d = callback;
        this.a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.i = z;
        this.e = null;
        if (hasMessages(0)) {
            this.h = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.h = true;
                    this.b.cancelLoad();
                    Thread thread = this.g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.j.currentTask = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((Loader.Callback) Assertions.checkNotNull(this.d)).onLoadCanceled(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void c(long j) {
        Loader loader = this.j;
        Assertions.checkState(loader.currentTask == null);
        loader.currentTask = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            this.e = null;
            loader.downloadExecutorService.execute((Runnable) Assertions.checkNotNull(loader.currentTask));
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.e = null;
            Loader loader = this.j;
            loader.downloadExecutorService.execute((Runnable) Assertions.checkNotNull(loader.currentTask));
            return;
        }
        if (i == 3) {
            throw ((Error) message.obj);
        }
        this.j.currentTask = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        Loader.Callback callback = (Loader.Callback) Assertions.checkNotNull(this.d);
        if (this.h) {
            callback.onLoadCanceled(this.b, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            try {
                callback.onLoadCompleted(this.b, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                Log.e("LoadTask", "Unexpected exception handling load completed", e);
                this.j.fatalError = new Loader.UnexpectedLoaderException(e);
                return;
            }
        }
        if (i2 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i3 = this.f + 1;
        this.f = i3;
        Loader.LoadErrorAction loadErrorActionOnLoadError = callback.onLoadError(this.b, jElapsedRealtime, j, iOException, i3);
        if (loadErrorActionOnLoadError.type == 3) {
            this.j.fatalError = this.e;
        } else if (loadErrorActionOnLoadError.type != 2) {
            if (loadErrorActionOnLoadError.type == 1) {
                this.f = 1;
            }
            c(loadErrorActionOnLoadError.retryDelayMillis != -9223372036854775807L ? loadErrorActionOnLoadError.retryDelayMillis : Math.min((this.f - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.h;
                this.g = Thread.currentThread();
            }
            if (!z) {
                TraceUtil.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.load();
                    TraceUtil.endSection();
                } catch (Throwable th) {
                    TraceUtil.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (this.i) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.i) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e2) {
            if (this.i) {
                return;
            }
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(2, new Loader.UnexpectedLoaderException(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.i) {
                return;
            }
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(2, new Loader.UnexpectedLoaderException(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.i) {
                Log.e("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
