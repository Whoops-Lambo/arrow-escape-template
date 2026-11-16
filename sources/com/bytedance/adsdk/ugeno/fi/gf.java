package com.bytedance.adsdk.ugeno.fi;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class gf extends Handler {
    private final WeakReference<kgy> kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        void kgy(Message message);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        kgy kgyVar = this.kgy.get();
        if (kgyVar == null || message == null) {
            return;
        }
        kgyVar.kgy(message);
    }

    public gf(Looper looper, kgy kgyVar) {
        super(looper);
        this.kgy = new WeakReference<>(kgyVar);
    }
}
