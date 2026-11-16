package io.p071bidmachine.ads.networks.adaptiverendering.measurer;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.login.a0;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSession;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.ErrorType;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import io.p071bidmachine.core.a;
import io.p071bidmachine.core.j;
import io.p071bidmachine.rendering.measurer.f;
import io.p071bidmachine.util.o;
import io.p071bidmachine.utils.i;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e implements f {
    public final i a = new i("OMMeasurer");
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public AdSession e;
    public AdEvents f;
    public MediaEvents g;

    public abstract void f(AdEvents adEvents);

    public long d() {
        return 0L;
    }

    @Override // io.p071bidmachine.rendering.measurer.f
    public final void onClicked() {
        j.l(new d(this, 2));
    }

    @Override // io.p071bidmachine.rendering.measurer.f
    public final void onShown() {
        if (this.c.compareAndSet(false, true)) {
            this.d.set(true);
            j.l(new d(this, 0));
        }
    }

    @Override // io.p071bidmachine.rendering.measurer.f
    public final void u(Runnable runnable) {
        int i = o.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        j.l(new a0(23, this, runnable, new Handler(looperMyLooper)));
    }

    @Override // io.p071bidmachine.rendering.measurer.f
    public final void e(io.p071bidmachine.util.e eVar) {
        eVar.getClass();
        String str = eVar.a;
        str.getClass();
        j.l(new a0(22, this, ErrorType.GENERIC, str));
    }

    public final void g(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
            this.e = adSessionCreateAdSession;
            this.f = AdEvents.createAdEvents(adSessionCreateAdSession);
            if (adSessionConfiguration.isNativeMediaEventsOwner()) {
                this.g = MediaEvents.createMediaEvents(this.e);
            }
            AdSession adSession = this.e;
            if (adSession != null) {
                adSession.start();
            }
            a.c(this.a, "prepareAdSession");
        } catch (Throwable th) {
            a.i(th);
        }
    }

    @Override // io.p071bidmachine.rendering.measurer.f
    public void w(View view) {
        view.getClass();
    }
}
