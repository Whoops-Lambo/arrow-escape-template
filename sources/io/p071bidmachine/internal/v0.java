package io.p071bidmachine.internal;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSession;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.ErrorType;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import io.p071bidmachine.ads.networks.adaptiverendering.measurer.b;
import io.p071bidmachine.core.j;
import io.p071bidmachine.iab.measurer.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class v0 implements a {
    public final boolean a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public AdSession d;
    public AdEvents e;
    public MediaEvents f;
    public WeakReference g;

    public abstract void a(AdEvents adEvents);

    @Override // io.p071bidmachine.iab.measurer.a
    public final void m(WebView webView) {
    }

    public static void c(String str) {
        io.p071bidmachine.core.a.c("AdMeasurer", str);
    }

    @Override // io.p071bidmachine.iab.measurer.a
    public final void i0() {
        if (!this.a && this.b.compareAndSet(false, true)) {
            j.l(new t0(this, 2));
        }
    }

    @Override // io.p071bidmachine.iab.measurer.a
    public final void l(ViewGroup viewGroup) {
        j.l(new b(5, this, viewGroup));
    }

    @Override // io.p071bidmachine.iab.measurer.a
    public final void onAdClicked() {
        j.l(new t0(this, 3));
    }

    @Override // io.p071bidmachine.iab.measurer.a
    public final void t0(io.p071bidmachine.iab.b bVar) {
        int i = 3;
        j.l(new com.facebook.applinks.a(i, this, ErrorType.GENERIC, bVar.b));
    }

    public v0(boolean z) {
        this.a = z;
    }

    public final void b(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        View view;
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
            this.d = adSessionCreateAdSession;
            this.e = AdEvents.createAdEvents(adSessionCreateAdSession);
            if (adSessionConfiguration.isNativeMediaEventsOwner()) {
                this.f = MediaEvents.createMediaEvents(this.d);
            }
            AdSession adSession = this.d;
            WeakReference weakReference = this.g;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (view != null) {
                adSession.registerAdView(view);
                c("registerAdView");
            }
            this.g = null;
            this.d.start();
            a(this.e);
            c("prepareAdSession");
        } catch (Throwable th) {
            io.p071bidmachine.core.a.i(th);
        }
    }
}
