package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class Od extends C4967s3 {
    private static final Od d = new Od();
    private InterfaceC4993tb b = null;
    private InterfaceC4993tb c = null;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        public a(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.b;
            if (interfaceC4993tb != null) {
                if (!this.a) {
                    ((InterfaceC5011ub) interfaceC4993tb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC5011ub) interfaceC4993tb).d(od.a(this.b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Od.this.a(this.b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        final /* synthetic */ C4870md a;
        final /* synthetic */ AdInfo b;

        public b(C4870md c4870md, AdInfo adInfo) {
            this.a = c4870md;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.c;
            if (interfaceC4993tb != null) {
                interfaceC4993tb.b(this.a, od.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + Od.this.a(this.b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        final /* synthetic */ C4870md a;
        final /* synthetic */ AdInfo b;

        public c(C4870md c4870md, AdInfo adInfo) {
            this.a = c4870md;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.b;
            if (interfaceC4993tb != null) {
                interfaceC4993tb.b(this.a, od.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + Od.this.a(this.b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.c;
            if (interfaceC4993tb != null) {
                interfaceC4993tb.a(this.a, od.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Od.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.b;
            if (interfaceC4993tb != null) {
                interfaceC4993tb.a(this.a, od.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Od.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class f implements Runnable {
        final /* synthetic */ C4870md a;
        final /* synthetic */ AdInfo b;

        public f(C4870md c4870md, AdInfo adInfo) {
            this.a = c4870md;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.c;
            if (interfaceC4993tb != null) {
                interfaceC4993tb.a(this.a, od.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + Od.this.a(this.b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class g implements Runnable {
        final /* synthetic */ C4870md a;
        final /* synthetic */ AdInfo b;

        public g(C4870md c4870md, AdInfo adInfo) {
            this.a = c4870md;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.b;
            if (interfaceC4993tb != null) {
                interfaceC4993tb.a(this.a, od.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + Od.this.a(this.b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class h implements Runnable {
        final /* synthetic */ AdInfo a;

        public h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.c;
            if (interfaceC4993tb != null) {
                ((InterfaceC5029vb) interfaceC4993tb).a(od.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Od.this.a(this.a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class i implements Runnable {
        final /* synthetic */ AdInfo a;

        public i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.b;
            if (interfaceC4993tb != null) {
                ((InterfaceC5029vb) interfaceC4993tb).a(od.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Od.this.a(this.a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class j implements Runnable {
        final /* synthetic */ IronSourceError a;

        public j(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4993tb interfaceC4993tb = Od.this.c;
            if (interfaceC4993tb != null) {
                ((InterfaceC5029vb) interfaceC4993tb).a(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class k implements Runnable {
        final /* synthetic */ IronSourceError a;

        public k(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4993tb interfaceC4993tb = Od.this.b;
            if (interfaceC4993tb != null) {
                ((InterfaceC5029vb) interfaceC4993tb).a(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class l implements Runnable {
        final /* synthetic */ AdInfo a;

        public l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.c;
            if (interfaceC4993tb != null) {
                interfaceC4993tb.c(od.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Od.this.a(this.a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class m implements Runnable {
        final /* synthetic */ AdInfo a;

        public m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.b;
            if (interfaceC4993tb != null) {
                interfaceC4993tb.c(od.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Od.this.a(this.a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class n implements Runnable {
        final /* synthetic */ AdInfo a;

        public n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.c;
            if (interfaceC4993tb != null) {
                interfaceC4993tb.b(od.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Od.this.a(this.a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class o implements Runnable {
        final /* synthetic */ AdInfo a;

        public o(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.b;
            if (interfaceC4993tb != null) {
                interfaceC4993tb.b(od.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Od.this.a(this.a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class p implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        public p(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Od od = Od.this;
            InterfaceC4993tb interfaceC4993tb = od.c;
            if (interfaceC4993tb != null) {
                if (!this.a) {
                    ((InterfaceC5011ub) interfaceC4993tb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC5011ub) interfaceC4993tb).d(od.a(this.b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Od.this.a(this.b));
            }
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC4993tb interfaceC4993tb = this.b;
        if (interfaceC4993tb == null || !(interfaceC4993tb instanceof InterfaceC5029vb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC4993tb interfaceC4993tb = this.b;
        if (interfaceC4993tb == null || !(interfaceC4993tb instanceof InterfaceC5029vb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    private Od() {
    }

    public void b() {
    }

    public void c() {
    }

    public void b(InterfaceC4993tb interfaceC4993tb) {
        this.c = interfaceC4993tb;
    }

    public static Od a() {
        return d;
    }

    public void b(C4870md c4870md, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c4870md, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c4870md, adInfo));
        }
    }

    public void a(InterfaceC4993tb interfaceC4993tb) {
        this.b = interfaceC4993tb;
    }

    public void a(boolean z, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z, adInfo));
            return;
        }
        InterfaceC4993tb interfaceC4993tb = this.b;
        if (interfaceC4993tb == null || !(interfaceC4993tb instanceof InterfaceC5011ub)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z, adInfo));
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(C4870md c4870md, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c4870md, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c4870md, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
