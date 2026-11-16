package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class w extends Handler {
    public final Context a;
    public final /* synthetic */ x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Looper looper, Context context) {
        super(looper);
        this.b = xVar;
        this.a = context;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        System.currentTimeMillis();
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.b.a(this.b.b(this.a, false, ((Integer) message.obj).intValue()), false);
            synchronized (this.b.g) {
                this.b.g.set(Boolean.FALSE);
                this.b.g.notifyAll();
            }
            return;
        }
        this.b.a(this.a, true, 3);
    }
}
