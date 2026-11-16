package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: renamed from: com.ironsource.h8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4776h8 extends C4967s3 {
    private static final C4776h8 d = new C4776h8();
    private InterfaceC4779hb b = null;
    private InterfaceC4779hb c = null;

    /* JADX INFO: renamed from: com.ironsource.h8$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ AdInfo a;

        public a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4776h8 c4776h8 = C4776h8.this;
            InterfaceC4779hb interfaceC4779hb = c4776h8.b;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.e(c4776h8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4776h8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4776h8 c4776h8 = C4776h8.this;
            InterfaceC4779hb interfaceC4779hb = c4776h8.c;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.a(this.a, c4776h8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4776h8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4776h8 c4776h8 = C4776h8.this;
            InterfaceC4779hb interfaceC4779hb = c4776h8.b;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.a(this.a, c4776h8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4776h8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        final /* synthetic */ AdInfo a;

        public d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4776h8 c4776h8 = C4776h8.this;
            InterfaceC4779hb interfaceC4779hb = c4776h8.c;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.d(c4776h8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4776h8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$e */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e implements Runnable {
        final /* synthetic */ AdInfo a;

        public e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4776h8 c4776h8 = C4776h8.this;
            InterfaceC4779hb interfaceC4779hb = c4776h8.b;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.d(c4776h8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4776h8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$f */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class f implements Runnable {
        final /* synthetic */ AdInfo a;

        public f(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4776h8 c4776h8 = C4776h8.this;
            InterfaceC4779hb interfaceC4779hb = c4776h8.c;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.a(c4776h8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4776h8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$g */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class g implements Runnable {
        final /* synthetic */ AdInfo a;

        public g(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4776h8 c4776h8 = C4776h8.this;
            InterfaceC4779hb interfaceC4779hb = c4776h8.b;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.a(c4776h8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4776h8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$h */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class h implements Runnable {
        final /* synthetic */ IronSourceError a;

        public h(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4779hb interfaceC4779hb = C4776h8.this.c;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.a(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$i */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class i implements Runnable {
        final /* synthetic */ IronSourceError a;

        public i(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4779hb interfaceC4779hb = C4776h8.this.b;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.a(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$j */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class j implements Runnable {
        final /* synthetic */ AdInfo a;

        public j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4776h8 c4776h8 = C4776h8.this;
            InterfaceC4779hb interfaceC4779hb = c4776h8.c;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.c(c4776h8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4776h8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$k */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class k implements Runnable {
        final /* synthetic */ AdInfo a;

        public k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4776h8 c4776h8 = C4776h8.this;
            InterfaceC4779hb interfaceC4779hb = c4776h8.b;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.c(c4776h8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4776h8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$l */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class l implements Runnable {
        final /* synthetic */ AdInfo a;

        public l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4776h8 c4776h8 = C4776h8.this;
            InterfaceC4779hb interfaceC4779hb = c4776h8.c;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.b(c4776h8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4776h8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$m */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class m implements Runnable {
        final /* synthetic */ AdInfo a;

        public m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4776h8 c4776h8 = C4776h8.this;
            InterfaceC4779hb interfaceC4779hb = c4776h8.b;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.b(c4776h8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4776h8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$n */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class n implements Runnable {
        final /* synthetic */ AdInfo a;

        public n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4776h8 c4776h8 = C4776h8.this;
            InterfaceC4779hb interfaceC4779hb = c4776h8.c;
            if (interfaceC4779hb != null) {
                interfaceC4779hb.e(c4776h8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4776h8.this.a(this.a));
            }
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
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
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    private C4776h8() {
    }

    public static synchronized C4776h8 a() {
        return d;
    }

    public synchronized void a(InterfaceC4779hb interfaceC4779hb) {
        this.b = interfaceC4779hb;
    }

    public synchronized void b(InterfaceC4779hb interfaceC4779hb) {
        this.c = interfaceC4779hb;
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
