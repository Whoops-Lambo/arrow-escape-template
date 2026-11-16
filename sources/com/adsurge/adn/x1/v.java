package com.adsurge.adn.x1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class v extends Handler {
    public final WeakReference a;

    public v(Handler.Callback callback, Looper looper) {
        super(looper);
        this.a = new WeakReference(callback);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        Handler.Callback callback = (Handler.Callback) this.a.get();
        if (callback != null && message != null) {
            callback.handleMessage(message);
        }
    }
}
