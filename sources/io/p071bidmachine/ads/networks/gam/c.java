package io.p071bidmachine.ads.networks.gam;

import io.p071bidmachine.AdProcessCallback;
import io.p071bidmachine.iab.mraid.m;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c implements n {
    public final io.p071bidmachine.unified.c a;

    public final void a() {
        this.a.onAdClicked();
    }

    public final void b() {
        ((AdProcessCallback) ((m) this.a).a).processShown();
    }

    public c(io.p071bidmachine.unified.c cVar) {
        this.a = cVar;
    }
}
