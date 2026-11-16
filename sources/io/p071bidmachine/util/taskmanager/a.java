package io.p071bidmachine.util.taskmanager;

import io.p071bidmachine.util.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements c {
    public abstract void d(Runnable runnable);

    public abstract void e(long j, Runnable runnable);

    public final void c(Runnable runnable, boolean z) {
        c cVar = runnable instanceof c ? (c) runnable : null;
        if (cVar != null) {
            try {
                cVar.a(z);
            } catch (Throwable unused) {
            }
        }
        try {
            d(runnable);
        } catch (Throwable unused2) {
        }
    }
}
