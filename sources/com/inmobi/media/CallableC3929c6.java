package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class CallableC3929c6 implements Callable {
    public final /* synthetic */ C4096i6 a;

    public CallableC3929c6(C4096i6 c4096i6) {
        this.a = c4096i6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.a) {
            try {
                C4096i6 c4096i6 = this.a;
                if (c4096i6.l == null) {
                    return null;
                }
                while (c4096i6.k > c4096i6.j) {
                    c4096i6.d((String) ((Map.Entry) c4096i6.i.entrySet().iterator().next()).getKey());
                }
                C4096i6 c4096i7 = this.a;
                int i = c4096i7.m;
                if (i >= 2000 && i >= c4096i7.i.size()) {
                    this.a.c();
                    this.a.m = 0;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
