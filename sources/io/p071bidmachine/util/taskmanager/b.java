package io.p071bidmachine.util.taskmanager;

import defpackage.fy;
import defpackage.sy;
import io.p071bidmachine.util.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b implements Runnable, c {
    public final AtomicBoolean a = new AtomicBoolean(false);

    public abstract Object c(sy syVar, fy fyVar);

    @Override // java.lang.Runnable
    public final void run() {
    }

    @Override // io.p071bidmachine.util.c
    public final void a(boolean z) {
        this.a.set(z);
    }
}
