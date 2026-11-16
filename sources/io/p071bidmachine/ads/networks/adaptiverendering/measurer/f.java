package io.p071bidmachine.ads.networks.adaptiverendering.measurer;

import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import io.p071bidmachine.core.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ f(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        i iVar = this.b;
        switch (i) {
            case 0:
                try {
                    MediaEvents mediaEvents = iVar.g;
                    if (mediaEvents != null) {
                        mediaEvents.firstQuartile();
                        a.c(iVar.a, "onMediaFirstQuartile");
                    }
                } catch (Throwable th) {
                    a.i(th);
                }
                break;
            case 1:
                try {
                    MediaEvents mediaEvents2 = iVar.g;
                    if (mediaEvents2 != null) {
                        mediaEvents2.resume();
                        a.c(iVar.a, "onMediaResumed");
                    }
                } catch (Throwable th2) {
                    a.i(th2);
                    return;
                }
                break;
            case 2:
                try {
                    MediaEvents mediaEvents3 = iVar.g;
                    if (mediaEvents3 != null) {
                        mediaEvents3.pause();
                        a.c(iVar.a, "onMediaPaused");
                    }
                } catch (Throwable th3) {
                    a.i(th3);
                    return;
                }
                break;
            case 3:
                try {
                    MediaEvents mediaEvents4 = iVar.g;
                    if (mediaEvents4 != null) {
                        mediaEvents4.thirdQuartile();
                        a.c(iVar.a, "onMediaThirdQuartile");
                    }
                } catch (Throwable th4) {
                    a.i(th4);
                    return;
                }
                break;
            case 4:
                try {
                    MediaEvents mediaEvents5 = iVar.g;
                    if (mediaEvents5 != null) {
                        mediaEvents5.midpoint();
                        a.c(iVar.a, "onMediaMidpoint");
                    }
                } catch (Throwable th5) {
                    a.i(th5);
                    return;
                }
                break;
            case 5:
                try {
                    iVar.m0();
                    MediaEvents mediaEvents6 = iVar.g;
                    if (mediaEvents6 != null) {
                        mediaEvents6.complete();
                        a.c(iVar.a, "onMediaCompleted");
                    }
                } catch (Throwable th6) {
                    a.i(th6);
                    return;
                }
                break;
            default:
                try {
                    MediaEvents mediaEvents7 = iVar.g;
                    if (mediaEvents7 != null) {
                        mediaEvents7.skipped();
                        a.c(iVar.a, "onMediaSkipped");
                    }
                } catch (Throwable th7) {
                    a.i(th7);
                    return;
                }
                break;
        }
    }
}
