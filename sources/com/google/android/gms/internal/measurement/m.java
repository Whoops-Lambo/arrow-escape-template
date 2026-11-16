package com.google.android.gms.internal.measurement;

import defpackage.gl0;
import defpackage.sb5;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m extends zzyq {
    public static final sb5 d = new sb5(3);
    public static final gl0 e = new gl0(17);
    public final AtomicInteger c = new AtomicInteger();

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void a() {
        this.c.decrementAndGet();
    }
}
