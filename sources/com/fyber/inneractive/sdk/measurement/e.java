package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public String b;
    public String c;
    public String d;
    public Partner e;
    public boolean a = false;
    public final com.fyber.inneractive.sdk.measurement.tracker.f f = new com.fyber.inneractive.sdk.measurement.tracker.f();
    public final a g = new a(this);
    public final b h = new b(this);
    public final c i = new c(this);

    public static void a(e eVar, Context context) {
        eVar.getClass();
        a(context, pv1.n("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/", Omid.getVersion(), ".js"), "omid-latest.js", eVar.g);
        a(context, pv1.n("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/omid-session-client-", Omid.getVersion(), ".js"), "omid-session-client-latest.js", eVar.h);
        a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/dt-omsdk-mraid-video-tracker.js", "dt-omsdk-mraid-video-tracker.js", eVar.i);
    }

    public static void a(Context context, String str, String str2, f0 f0Var) {
        IAlog.d("%s- Loading URL: %s", IAlog.a(e.class), str);
        IAConfigManager.Q.s.a(new v0(f0Var, context, new com.fyber.inneractive.sdk.cache.g(str, str2)));
    }
}
