package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.ad, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3880ad implements Zc {
    public final Zc a;
    public final AtomicBoolean b;

    @Override // com.inmobi.media.Zc
    public final void a() {
        if (this.b.getAndSet(false)) {
            this.a.a();
        }
    }

    @Override // com.inmobi.media.Zc
    public final void b() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.a.b();
    }

    public C3880ad(Zc zc) {
        zc.getClass();
        this.a = zc;
        this.b = new AtomicBoolean(false);
    }
}
