package io.p071bidmachine.internal;

import io.p071bidmachine.core.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface p0 extends Runnable {
    void t();

    @Override // java.lang.Runnable
    default void run() {
        try {
            t();
        } catch (Throwable th) {
            try {
                a.i(th);
            } catch (Throwable unused) {
            }
        }
    }
}
