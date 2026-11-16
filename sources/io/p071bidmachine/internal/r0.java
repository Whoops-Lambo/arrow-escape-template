package io.p071bidmachine.internal;

import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import io.p071bidmachine.core.a;
import io.p071bidmachine.core.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ r0(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        n nVar = this.b;
        switch (i) {
            case 0:
                try {
                    MediaEvents mediaEvents = nVar.f;
                    if (mediaEvents != null) {
                        mediaEvents.resume();
                        v0.c("onMediaResumed");
                    }
                } catch (Throwable th) {
                    a.i(th);
                    return;
                }
                break;
            default:
                try {
                    if (nVar.c.compareAndSet(false, true)) {
                        j.l(new t0(nVar, 0));
                    }
                    MediaEvents mediaEvents2 = nVar.f;
                    if (mediaEvents2 != null) {
                        mediaEvents2.complete();
                        v0.c("onMediaCompleted");
                    }
                } catch (Throwable th2) {
                    a.i(th2);
                }
                break;
        }
    }
}
