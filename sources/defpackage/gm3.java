package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.gms.internal.ads.zzaci;
import com.google.android.gms.internal.ads.zzacn;
import com.google.android.gms.internal.ads.zzaco;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhx;
import com.google.android.gms.internal.ads.zzik;
import com.google.android.gms.internal.ads.zzxj;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxp;
import com.google.android.gms.internal.ads.zzyd;
import com.google.android.gms.internal.ads.zzzl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gm3 extends Handler implements Runnable {
    public final pc5 a;
    public yc5 b;
    public IOException c;
    public int d;
    public Thread e;
    public boolean f;
    public volatile boolean g;
    public final /* synthetic */ zzaco h;

    public final void a(boolean z) {
        this.g = z;
        this.c = null;
        if (hasMessages(1)) {
            this.f = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f = true;
                    this.a.g = true;
                    Thread thread = this.e;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.h.b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            yc5 yc5Var = this.b;
            yc5Var.getClass();
            yc5Var.i(this.a, jElapsedRealtime, true);
            this.b = null;
        }
    }

    public final void c() {
        SystemClock.elapsedRealtime();
        yc5 yc5Var = this.b;
        yc5Var.getClass();
        int i = this.d;
        pc5 pc5Var = this.a;
        pc5Var.getClass();
        new zzxj(pc5Var.j);
        if (i == 0) {
            i = 0;
        }
        zzyd zzydVar = yc5Var.d;
        zzydVar.a(new hf2(zzydVar, new zzxk(), new zzxp(-1, null, zzfq.t(pc5Var.i), zzfq.t(yc5Var.C)), i));
        this.c = null;
        zzaco zzacoVar = this.h;
        gm3 gm3Var = zzacoVar.b;
        gm3Var.getClass();
        zzacoVar.a.execute(gm3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        int i;
        int i2;
        zzaci zzaciVar;
        zzahr zzahrVar;
        if (this.g) {
            return;
        }
        int i3 = message.what;
        if (i3 == 1) {
            c();
            return;
        }
        if (i3 == 4) {
            throw ((Error) message.obj);
        }
        zzaco zzacoVar = this.h;
        zzacoVar.b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        yc5 yc5Var = this.b;
        yc5Var.getClass();
        if (this.f) {
            yc5Var.i(this.a, jElapsedRealtime, false);
            return;
        }
        int i4 = message.what;
        if (i4 == 2) {
            try {
                yc5Var.k(this.a, jElapsedRealtime);
                return;
            } catch (RuntimeException e) {
                zzeh.f("LoadTask", "Unexpected exception handling load completed", e);
                this.h.c = new zzacn(e);
                return;
            }
        }
        if (i4 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.c = iOException;
        int i5 = this.d;
        this.d = i5 + 1;
        pc5 pc5Var = this.a;
        qc5 qc5Var = yc5Var.q;
        pc5Var.getClass();
        new zzxj(pc5Var.j);
        zzxk zzxkVar = new zzxk();
        String str = zzfq.a;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min(i5 * 1000, 5000);
                break;
            }
            if ((cause instanceof zzat) || (cause instanceof FileNotFoundException) || (cause instanceof zzik) || (cause instanceof zzacn) || ((cause instanceof zzhx) && ((zzhx) cause).a == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzaci zzaciVar2 = zzaco.e;
            qc5Var.a = 6;
            zzaciVar = zzaciVar2;
            i2 = 0;
            i = 1;
        } else {
            int iQ = yc5Var.q();
            int i6 = iQ > qc5Var.d ? 1 : 0;
            boolean z = yc5Var.G || !((zzahrVar = yc5Var.B) == null || zzahrVar.zza() == -9223372036854775807L);
            boolean z2 = yc5Var.x;
            if (z) {
                qc5Var.d = iQ;
                qc5Var.a = 2;
            } else if (!z2 || qc5Var.c()) {
                qc5Var.e = z2;
                qc5Var.b = 0L;
                iQ = 0;
                qc5Var.d = iQ;
                qc5Var.a = 2;
            } else {
                qc5Var.a = 5;
            }
            if (qc5Var.a == 5) {
                zzaciVar = zzaco.d;
                i = 1;
                i2 = 0;
            } else {
                if (z) {
                    i = 1;
                    i2 = 0;
                } else {
                    for (zzzl zzzlVar : yc5Var.u) {
                        zzzlVar.m(false);
                    }
                    i2 = 0;
                    pc5Var.f.a = 0L;
                    pc5Var.i = 0L;
                    i = 1;
                    pc5Var.h = true;
                    pc5Var.l = false;
                }
                zzaciVar = new zzaci(i6, jMin);
            }
        }
        int i7 = zzaciVar.a;
        int i8 = (i7 == 0 || i7 == i) ? i : i2;
        zzyd zzydVar = yc5Var.d;
        int i9 = i2;
        zzydVar.a(new xw1(zzydVar, zzxkVar, new zzxp(-1, null, zzfq.t(pc5Var.i), zzfq.t(yc5Var.C)), iOException, i8 ^ 1));
        int i10 = zzaciVar.a;
        if (i10 == 3) {
            zzacoVar.c = this.c;
            return;
        }
        if (i10 != 2) {
            if (i10 == 1) {
                this.d = 1;
            }
            long jMin2 = zzaciVar.b;
            if (jMin2 == -9223372036854775807L) {
                jMin2 = Math.min((this.d - 1) * 1000, 5000);
            }
            zzaco zzacoVar2 = this.h;
            zzgvz.f(zzacoVar2.b == null ? 1 : i9);
            zzacoVar2.b = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
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
                z = this.f;
                this.e = Thread.currentThread();
            }
            if (!z) {
                pc5 pc5Var = this.a;
                String simpleName = pc5Var.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    pc5Var.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.e = null;
                Thread.interrupted();
            }
            if (this.g) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.g) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.g) {
                return;
            }
            zzeh.f("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new zzacn(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.g) {
                return;
            }
            zzeh.f("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new zzacn(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.g) {
                zzeh.f("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm3(zzaco zzacoVar, Looper looper, pc5 pc5Var, yc5 yc5Var, long j) {
        super(looper);
        Objects.requireNonNull(zzacoVar);
        this.h = zzacoVar;
        this.a = pc5Var;
        this.b = yc5Var;
    }
}
