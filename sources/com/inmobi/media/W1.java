package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class W1 extends Handler {
    public boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(Looper looper, boolean z) {
        super(looper);
        looper.getClass();
        this.a = z;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        message.getClass();
        int i = message.what;
        if (i == 1001 && this.a) {
            this.a = false;
            Y1.a(false);
        } else if (i == 1002 && !this.a) {
            this.a = true;
            Y1.a(true);
        }
    }
}
