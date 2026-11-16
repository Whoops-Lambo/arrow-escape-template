package io.p071bidmachine.internal;

import io.p071bidmachine.AdResponseAdProcessCallback;
import io.p071bidmachine.ExpirationHandler;
import io.p071bidmachine.utils.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements ExpirationHandler.Listener {
    public final AdResponseAdProcessCallback a;

    @Override // io.bidmachine.ExpirationHandler.Listener
    public final void onExpired() {
        this.a.processLoadFail(new a(a.f, -1, "Creative loading timeout reached"));
    }

    public i0(AdResponseAdProcessCallback adResponseAdProcessCallback) {
        this.a = adResponseAdProcessCallback;
    }
}
