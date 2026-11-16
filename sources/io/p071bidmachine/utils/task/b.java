package io.p071bidmachine.utils.task;

import io.p071bidmachine.ExpirationHandler;
import io.p071bidmachine.p0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b implements Runnable {
    public final AtomicBoolean a = new AtomicBoolean(false);

    @Override // java.lang.Runnable
    public final void run() {
        ExpirationHandler.Listener listener;
        if (this.a.get() || (listener = (ExpirationHandler.Listener) ((p0) this).b.get()) == null) {
            return;
        }
        listener.onExpired();
    }
}
