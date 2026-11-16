package io.p071bidmachine.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import defpackage.x73;
import io.p071bidmachine.media3.common.util.a;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class h extends Handler implements Runnable {
    public final int a;
    public final i b;
    public final long c;
    public g d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean h;
    public volatile boolean i;
    public final /* synthetic */ l j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, Looper looper, i iVar, g gVar, int i, long j) {
        super(looper);
        this.j = lVar;
        this.b = iVar;
        this.d = gVar;
        this.a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.i = z;
        this.e = null;
        if (hasMessages(1)) {
            this.h = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
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
            this.j.b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.e(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            c();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.j.b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        g gVar = this.d;
        gVar.getClass();
        if (this.h) {
            gVar.e(this.b, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                gVar.c(this.b, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                a.o("LoadTask", "Unexpected exception handling load completed", e);
                this.j.c = new k(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i3 = this.f + 1;
        this.f = i3;
        x73 x73VarF = gVar.f(this.b, jElapsedRealtime, j, iOException, i3);
        int i4 = x73VarF.a;
        if (i4 == 3) {
            this.j.c = this.e;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.f = 1;
            }
            long jMin = x73VarF.b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f - 1) * 1000, 5000);
            }
            l lVar = this.j;
            a.i(lVar.b == null);
            lVar.b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                c();
            }
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
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.load();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
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
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.i) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.i) {
                return;
            }
            a.o("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new k(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.i) {
                return;
            }
            a.o("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new k(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.i) {
                a.o("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }

    public final void c() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        g gVar = this.d;
        gVar.getClass();
        gVar.d(this.b, jElapsedRealtime, j, this.f);
        this.e = null;
        l lVar = this.j;
        io.p071bidmachine.media3.exoplayer.util.a aVar = lVar.a;
        h hVar = lVar.b;
        hVar.getClass();
        aVar.execute(hVar);
    }
}
