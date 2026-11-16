package com.adsurge.adn.managers;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.adsurge.adn.F.e;
import com.adsurge.adn.I0.g;
import com.adsurge.adn.X.f;
import com.adsurge.adn.X.l;
import com.adsurge.adn.X.m;
import com.adsurge.adn.X.o;
import com.adsurge.adn.X.q;
import com.adsurge.adn.X.r;
import com.adsurge.adn.X.t;
import com.adsurge.adn.X.w;
import com.adsurge.adn.ads.AdSurgeAdError;
import com.adsurge.adn.p036k1.AbstractC1636d;
import com.adsurge.adn.p059u.i;
import defpackage.s3;
import defpackage.x3;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class AdSurgeAdSdk {
    public final com.adsurge.adn.J.b a = new com.adsurge.adn.J.b();
    public Context b;
    public String c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface BidderTokenCallback {
        void onFailure(AdSurgeAdError adSurgeAdError);

        void onSuccess(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnDeleteUserInfoListener {
        void onDeleteFailed(int i, String str);

        void onDeleteSuccess();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements OnStartListener {

        /* JADX INFO: renamed from: com.adsurge.adn.managers.AdSurgeAdSdk$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class RunnableC0123a implements Runnable {
            public RunnableC0123a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdSurgeAdSdk.a(AdSurgeAdSdk.this.b);
                } catch (Throwable unused) {
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class b implements Runnable {

            /* JADX INFO: renamed from: com.adsurge.adn.managers.AdSurgeAdSdk$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public class C0124a implements MessageQueue.IdleHandler {
                public C0124a() {
                }

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    try {
                        AdSurgeAdSdk.b(AdSurgeAdSdk.this.b);
                        return false;
                    } catch (Throwable unused) {
                        return false;
                    }
                }
            }

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Looper.myQueue().addIdleHandler(new C0124a());
            }
        }

        public a() {
        }

        @Override // com.adsurge.adn.managers.OnStartListener
        public void onStartFailed(AdSurgeAdError adSurgeAdError) {
            AdSurgeAdSdk.this.a.onStartFailed(adSurgeAdError);
            com.adsurge.adn.I.a.a(adSurgeAdError.toString());
        }

        @Override // com.adsurge.adn.managers.OnStartListener
        public void onStartComplete() {
            com.adsurge.adn.N.a.b().a(AdSurgeAdSdk.this.a);
            q.b.submit(new RunnableC0123a());
            g.a(new b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {
        public static final AdSurgeAdSdk a = new AdSurgeAdSdk();
    }

    public static void b(Context context) {
    }

    public static void c(Context context) {
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(f.c());
        }
    }

    public static AdSurgeAdSdk getInstance() {
        return b.a;
    }

    public final /* synthetic */ void a(OnStartListener onStartListener, AdSurgeAdSdkInitConfig adSurgeAdSdkInitConfig) {
        if (this.a.a(onStartListener)) {
            if (adSurgeAdSdkInitConfig == null || adSurgeAdSdkInitConfig.getContext() == null) {
                AdSurgeAdError adSurgeAdErrorA = i.a(4005).a();
                this.a.onStartFailed(adSurgeAdErrorA);
                com.adsurge.adn.I.a.a(adSurgeAdErrorA.toString());
                return;
            }
            Context context = adSurgeAdSdkInitConfig.getContext();
            String appId = adSurgeAdSdkInitConfig.getAppId();
            this.b = context.getApplicationContext();
            this.c = appId;
            com.adsurge.adn.J.a.d().b(context, appId, adSurgeAdSdkInitConfig.getTestMode().booleanValue());
            com.adsurge.adn.s1.a.b().b(context, new JSONObject());
            r.a(context);
            c(context);
            l.b().a(context);
            com.adsurge.adn.r1.a.c();
            if (!TextUtils.isEmpty(this.c)) {
                com.adsurge.adn.J.a.d().f();
                q.b.submit(new s3(this, 1));
            } else {
                AdSurgeAdError adSurgeAdErrorA2 = i.a(4003).a();
                this.a.onStartFailed(adSurgeAdErrorA2);
                com.adsurge.adn.I.a.a(adSurgeAdErrorA2.toString());
            }
        }
    }

    public String getAppId() {
        return this.c;
    }

    public Context getContext() {
        return this.b;
    }

    public void init(AdSurgeAdSdkInitConfig adSurgeAdSdkInitConfig, OnStartListener onStartListener) {
        g.c(new x3(0, this, onStartListener, adSurgeAdSdkInitConfig));
    }

    public void uploadInformation(Map<String, Object> map) {
        if (map != null) {
            t.a(map);
        }
    }

    public static String getSdkVersion() {
        return w.a();
    }

    public void getBidderToken(BidderTokenCallback bidderTokenCallback) {
        m.a(bidderTokenCallback);
    }

    public final /* synthetic */ void a() {
        o.S();
        com.adsurge.adn.K.b.f().a(new a());
    }

    public static void a(Context context) {
        com.adsurge.adn.p032j0.g.a(context);
        e.d().e();
        com.adsurge.adn.B.b.c().d();
        AbstractC1636d.a();
        com.adsurge.adn.managers.integration.b.a(com.adsurge.adn.J.a.d().a());
    }
}
