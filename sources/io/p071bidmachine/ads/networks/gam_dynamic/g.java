package io.p071bidmachine.ads.networks.gam_dynamic;

import io.p071bidmachine.AdProcessCallback;
import io.p071bidmachine.iab.mraid.m;
import io.p071bidmachine.unified.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g implements r {
    public final c a;

    public final void a() {
        this.a.onAdClicked();
    }

    public final void b() {
        ((AdProcessCallback) ((m) this.a).a).processShown();
    }

    public g(c cVar) {
        this.a = cVar;
    }
}
