package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ft extends Handler {
    protected WeakReference<kgy> kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        void kgy(Message message);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        kgy kgyVar;
        WeakReference<kgy> weakReference = this.kgy;
        if (weakReference == null || (kgyVar = weakReference.get()) == null || message == null) {
            return;
        }
        kgyVar.kgy(message);
    }

    public ft(kgy kgyVar) {
        if (kgyVar != null) {
            this.kgy = new WeakReference<>(kgyVar);
        }
    }

    public ft(Looper looper, kgy kgyVar) {
        super(looper);
        if (kgyVar != null) {
            this.kgy = new WeakReference<>(kgyVar);
        }
    }
}
