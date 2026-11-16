package com.vungle.ads.internal.bidding;

import android.content.Context;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.GzipEncodeError;
import com.vungle.ads.JsonEncodeError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.i2;
import com.vungle.ads.internal.model.m3;
import com.vungle.ads.internal.model.p3;
import com.vungle.ads.internal.model.u1;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.f0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.ep0;
import defpackage.eu;
import defpackage.l93;
import defpackage.p32;
import defpackage.pd1;
import defpackage.r91;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public final Context a;
    public i2 b;
    public int c;
    public final r91 d;
    public long e;

    public final String a() {
        VungleApiClient vungleApiClient = (VungleApiClient) eu.v(pd1.a, new c(this.a)).getValue();
        ConfigManager.INSTANCE.getClass();
        u1 u1VarA = vungleApiClient.a(!ConfigManager.t(), ConfigManager.d());
        p3 p3Var = new p3(u1VarA.a(), u1VarA.d(), u1VarA.b(), new m3(f0.d()), this.c);
        r91 r91Var = this.d;
        return r91Var.b(ep0.A(r91Var.b, p32.d(p3.class)), p3Var);
    }

    public final b b() throws Throwable {
        this.c++;
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.b, (s) null, 6);
        try {
            String strA = a();
            boolean z = u.a;
            t.a("BidTokenEncoder", "BidToken: " + strA);
            try {
                String str = "6:" + q.a(strA);
                t.a("BidTokenEncoder", "After conversion: ".concat(str));
                return new b(str, "");
            } catch (Throwable th) {
                StringBuilder sbA = l.a("Fail to gzip token data. ");
                sbA.append(th.getLocalizedMessage());
                String string = sbA.toString();
                new GzipEncodeError(string).logErrorNoReturnValue$vungle_ads_release();
                return new b("", string);
            }
        } catch (Throwable th2) {
            StringBuilder sbA2 = l.a("Failed to encode TokenParameters. ");
            sbA2.append(th2.getLocalizedMessage());
            String string2 = sbA2.toString();
            new JsonEncodeError(string2).logErrorNoReturnValue$vungle_ads_release();
            return new b("", string2);
        }
    }

    public e(Context context) {
        context.getClass();
        this.a = context;
        this.b = new i2(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUESTED);
        this.d = l93.b(d.a);
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.a(new a(this));
    }
}
