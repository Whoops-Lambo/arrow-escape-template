package io.p071bidmachine.internal;

import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSession;
import com.iab.omid.library.appodeal.adsession.media.InteractionType;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import com.ironsource.Yf;
import io.p071bidmachine.core.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ t0(v0 v0Var, int i) {
        this.a = i;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        v0 v0Var = this.b;
        switch (i) {
            case 0:
                try {
                    MediaEvents mediaEvents = v0Var.f;
                    if (mediaEvents != null) {
                        mediaEvents.skipped();
                        v0.c("onMediaSkipped");
                    }
                } catch (Throwable th) {
                    a.i(th);
                    return;
                }
                break;
            case 1:
                try {
                    v0Var.f = null;
                    v0Var.e = null;
                    AdSession adSession = v0Var.d;
                    if (adSession != null) {
                        adSession.finish();
                    }
                    v0.c("destroy");
                } catch (Throwable th2) {
                    a.i(th2);
                }
                break;
            case 2:
                try {
                    AdEvents adEvents = v0Var.e;
                    if (adEvents != null) {
                        adEvents.impressionOccurred();
                        v0.c("onAdShown");
                    }
                } catch (Throwable th3) {
                    a.i(th3);
                    return;
                }
                break;
            case 3:
                try {
                    MediaEvents mediaEvents2 = v0Var.f;
                    if (mediaEvents2 != null) {
                        mediaEvents2.adUserInteraction(InteractionType.CLICK);
                        v0.c(Yf.f);
                    }
                } catch (Throwable th4) {
                    a.i(th4);
                    return;
                }
                break;
            case 4:
                try {
                    MediaEvents mediaEvents3 = v0Var.f;
                    if (mediaEvents3 != null) {
                        mediaEvents3.firstQuartile();
                        v0.c("onMediaFirstQuartile");
                    }
                } catch (Throwable th5) {
                    a.i(th5);
                    return;
                }
                break;
            case 5:
                try {
                    MediaEvents mediaEvents4 = v0Var.f;
                    if (mediaEvents4 != null) {
                        mediaEvents4.midpoint();
                        v0.c("onMediaMidpoint");
                    }
                } catch (Throwable th6) {
                    a.i(th6);
                    return;
                }
                break;
            case 6:
                try {
                    MediaEvents mediaEvents5 = v0Var.f;
                    if (mediaEvents5 != null) {
                        mediaEvents5.thirdQuartile();
                        v0.c("onMediaThirdQuartile");
                    }
                } catch (Throwable th7) {
                    a.i(th7);
                    return;
                }
                break;
            default:
                try {
                    MediaEvents mediaEvents6 = v0Var.f;
                    if (mediaEvents6 != null) {
                        mediaEvents6.pause();
                        v0.c("onMediaPaused");
                    }
                } catch (Throwable th8) {
                    a.i(th8);
                    return;
                }
                break;
        }
    }
}
