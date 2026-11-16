package com.facebook.ads.redexgen.X;

import com.facebook.ads.androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2304Rp {
    public final int A00;
    public final C2299Rk A01;
    public final CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> A02;

    public C2304Rp() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C2304Rp(CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers, int i, C2299Rk c2299Rk) {
        this.A02 = listenerAndHandlers;
        this.A00 = i;
        this.A01 = c2299Rk;
    }

    public final C2304Rp A00(int i, C2299Rk c2299Rk) {
        return new C2304Rp(this.A02, i, c2299Rk);
    }
}
