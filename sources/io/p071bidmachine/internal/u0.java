package io.p071bidmachine.internal;

import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import io.p071bidmachine.core.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class u0 implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ v0 c;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            MediaEvents mediaEvents = this.c.f;
            if (mediaEvents != null) {
                mediaEvents.start(this.a / 1000.0f, this.b);
                v0.c("onMediaStarted");
            }
        } catch (Throwable th) {
            a.i(th);
        }
    }

    public u0(v0 v0Var, float f, float f2) {
        this.c = v0Var;
        this.a = f;
        this.b = f2;
    }
}
