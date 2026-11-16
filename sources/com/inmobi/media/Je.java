package com.inmobi.media;

import defpackage.bp0;
import defpackage.ep0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Je implements InterfaceC3987e9 {
    public final C3920bp a;
    public final AtomicBoolean b;
    public boolean c;
    public Long d;

    @Override // com.inmobi.media.InterfaceC3987e9
    public final void a() {
    }

    @Override // com.inmobi.media.InterfaceC3987e9
    public final bp0 b() {
        return ep0.g(new Ie(this, null));
    }

    public Je(C3920bp c3920bp) {
        c3920bp.getClass();
        this.a = c3920bp;
        this.b = new AtomicBoolean(false);
    }
}
