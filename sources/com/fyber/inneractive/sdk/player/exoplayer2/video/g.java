package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class g implements Choreographer.FrameCallback, Handler.Callback {
    public static final g e = new g();
    public volatile long a;
    public final Handler b;
    public Choreographer c;
    public int d;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a = j;
        this.c.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.c = Choreographer.getInstance();
            return true;
        }
        if (i == 1) {
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 == 1) {
                this.c.postFrameCallback(this);
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i3 = this.d - 1;
        this.d = i3;
        if (i3 == 0) {
            this.c.removeFrameCallback(this);
            this.a = 0L;
        }
        return true;
    }

    public g() {
        Handler handler = new Handler(jc1.h("ChoreographerOwner:Handler").getLooper(), this);
        this.b = handler;
        handler.sendEmptyMessage(0);
    }
}
