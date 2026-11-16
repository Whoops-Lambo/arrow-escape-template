package io.p071bidmachine;

import io.p071bidmachine.utils.task.b;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class p0 extends b {
    public final WeakReference b;

    public p0(ExpirationHandler.Listener listener) {
        this.b = new WeakReference(listener);
    }
}
