package io.p071bidmachine.ads.networks.adaptiverendering.measurer;

import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.media.InteractionType;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import com.ironsource.Yf;
import io.p071bidmachine.core.a;
import io.p071bidmachine.core.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = true;
        int i2 = 0;
        e eVar = this.b;
        switch (i) {
            case 0:
                try {
                    AdEvents adEvents = eVar.f;
                    if ((eVar.e != null) && adEvents != null && eVar.b.get() && eVar.d.compareAndSet(true, false)) {
                        adEvents.impressionOccurred();
                        a.c(eVar.a, "onAdShown");
                    }
                } catch (Throwable th) {
                    a.i(th);
                    return;
                }
                break;
            case 1:
                try {
                    AdEvents adEvents2 = eVar.f;
                    if (eVar.e == null) {
                        z = false;
                    }
                    if (z && adEvents2 != null) {
                        eVar.f(adEvents2);
                        a.c(eVar.a, Yf.j);
                        j.l(new d(eVar, i2));
                    }
                } catch (Throwable th2) {
                    a.i(th2);
                }
                break;
            default:
                try {
                    MediaEvents mediaEvents = eVar.g;
                    if (mediaEvents != null) {
                        mediaEvents.adUserInteraction(InteractionType.CLICK);
                        a.c(eVar.a, Yf.f);
                    }
                } catch (Throwable th3) {
                    a.i(th3);
                    return;
                }
                break;
        }
    }
}
