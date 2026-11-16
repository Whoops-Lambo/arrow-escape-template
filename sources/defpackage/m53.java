package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m53 implements Choreographer.FrameCallback, Handler.Callback {
    public static final m53 e = new m53();
    public volatile long a = -9223372036854775807L;
    public final Handler b;
    public Choreographer c;
    public int d;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a = j;
        ((Choreographer) Assertions.checkNotNull(this.c)).postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.c = Choreographer.getInstance();
            } catch (RuntimeException e2) {
                Log.w("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
            }
            return true;
        }
        if (i == 1) {
            Choreographer choreographer = this.c;
            if (choreographer != null) {
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        Choreographer choreographer2 = this.c;
        if (choreographer2 != null) {
            int i3 = this.d - 1;
            this.d = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.a = -9223372036854775807L;
            }
        }
        return true;
    }

    public m53() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handlerCreateHandler = Util.createHandler(handlerThread.getLooper(), this);
        this.b = handlerCreateHandler;
        handlerCreateHandler.sendEmptyMessage(0);
    }
}
