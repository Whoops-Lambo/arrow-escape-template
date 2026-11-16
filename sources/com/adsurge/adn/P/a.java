package com.adsurge.adn.P;

import android.content.Context;
import com.adsurge.adn.E.c;
import com.adsurge.adn.N.b;
import com.adsurge.adn.X.q;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.oversea_ad.RiskDetectResp;
import com.adsurge.adn.oversea_ad.TuringRiskService;
import com.adsurge.adn.oversea_ad.TuringSDK;
import defpackage.m93;
import defpackage.t93;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a {
    public volatile Boolean a;
    public volatile boolean b;
    public volatile String c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final CountDownLatch e = new CountDownLatch(1);
    public volatile boolean f;

    /* JADX INFO: renamed from: com.adsurge.adn.P.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0087a {
        public static final a a = new a();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(Context context) {
        try {
            int iInit = TuringSDK.createConf(context, new m93(2)).hostUrl("https://www.turingfraud.net").disableScreenCapture().build().init();
            if (iInit != 0) {
                a(Integer.valueOf(iInit), (Throwable) null);
                this.e.countDown();
            } else {
                this.b = true;
                TuringSDK.getVersionInfo();
                f(context);
            }
        } catch (Throwable th) {
            a((Integer) null, th);
            this.e.countDown();
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void e(Context context) {
        try {
            RiskDetectResp riskDetectRespReqRiskDetectV2 = TuringRiskService.reqRiskDetectV2(context);
            if (riskDetectRespReqRiskDetectV2 == null || riskDetectRespReqRiskDetectV2.getErrorCode() != 0) {
                a(Long.valueOf(riskDetectRespReqRiskDetectV2 != null ? riskDetectRespReqRiskDetectV2.getErrorCode() : -1L), (Throwable) null);
                return;
            }
            String deviceToken = riskDetectRespReqRiskDetectV2.getDeviceToken();
            if (deviceToken != null && !deviceToken.isEmpty()) {
                this.c = deviceToken;
            }
            this.e.countDown();
        } catch (Throwable th) {
            try {
                a((Long) null, th);
            } finally {
                this.e.countDown();
            }
        }
    }

    public void c(Context context) {
        if (this.a == null) {
            this.a = Boolean.valueOf(b.a("adsture", 1, (AdSurgeAdFormat) null, (String) null) == 1);
        }
        if (!this.a.booleanValue() || this.b || context == null || !c.a().b().a.a()) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f = true;
        q.b.submit(new t93(this, applicationContext, 1));
    }

    public final void f(Context context) {
        if (context == null || !this.d.compareAndSet(false, true)) {
            return;
        }
        q.f.scheduleWithFixedDelay(new t93(this, context, 0), 0L, 600000L, TimeUnit.MILLISECONDS);
    }

    public void a(long j) {
        if (!this.f || j <= 0) {
            return;
        }
        try {
            this.e.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ boolean c() {
        return true;
    }

    public String a() {
        String str;
        return (this.a == Boolean.TRUE && this.b && (str = this.c) != null) ? str : "";
    }

    public static a b() {
        return C0087a.a;
    }

    public static void a(Integer num, Throwable th) {
        d dVar = new d();
        if (th != null) {
            dVar.a("exception", th.getClass().getName());
        }
        com.adsurge.adn.w1.b.a(6001900, (com.adsurge.adn.Y0.c) null, (Integer) null, num, dVar);
    }

    public static void a(Long l, Throwable th) {
        d dVar = new d();
        if (th != null) {
            dVar.a("exception", th.getClass().getName());
        }
        if (l != null) {
            dVar.a("turing_err", l);
        }
        com.adsurge.adn.w1.b.a(6001901, (com.adsurge.adn.Y0.c) null, (Integer) null, (Integer) null, dVar);
    }
}
