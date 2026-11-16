package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class j {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final i b;

    public j(int i, i iVar) {
        for (int i2 = 0; i2 < i; i2++) {
            this.a.offer(iVar.a());
        }
        this.b = iVar;
    }
}
