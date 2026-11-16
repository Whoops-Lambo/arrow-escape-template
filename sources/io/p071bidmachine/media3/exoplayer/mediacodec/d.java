package io.p071bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.HandlerThread;
import com.facebook.appevents.p;
import defpackage.a50;
import defpackage.r9;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public r9 c;
    public final AtomicReference d;
    public final a50 e;
    public boolean f;

    public d(MediaCodec mediaCodec, HandlerThread handlerThread) {
        a50 a50Var = new a50(4);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = a50Var;
        this.d = new AtomicReference();
    }

    public static c b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new c();
                }
                return (c) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f) {
            try {
                r9 r9Var = this.c;
                r9Var.getClass();
                r9Var.removeCallbacksAndMessages(null);
                a50 a50Var = this.e;
                synchronized (a50Var) {
                    a50Var.b = false;
                }
                r9 r9Var2 = this.c;
                r9Var2.getClass();
                r9Var2.obtainMessage(3).sendToTarget();
                synchronized (a50Var) {
                    while (!a50Var.b) {
                        a50Var.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                p.g(e);
            }
        }
    }

    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
