package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.appevents.p;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class t9 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public r9 c;
    public final AtomicReference d;
    public final ConditionVariable e;
    public boolean f;

    public t9(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ConditionVariable conditionVariable = new ConditionVariable();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = conditionVariable;
        this.d = new AtomicReference();
    }

    public static s9 b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new s9();
                }
                return (s9) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f) {
            try {
                ((Handler) Assertions.checkNotNull(this.c)).removeCallbacksAndMessages(null);
                ConditionVariable conditionVariable = this.e;
                conditionVariable.close();
                ((Handler) Assertions.checkNotNull(this.c)).obtainMessage(2).sendToTarget();
                conditionVariable.block();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                p.g(e);
            }
        }
    }
}
