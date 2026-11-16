package com.fyber.inneractive.sdk.cache;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.v;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;

    public final void a() {
        if ((System.currentTimeMillis() - this.a) / 60000 >= 60) {
            IAConfigManager iAConfigManager = IAConfigManager.Q;
            if (iAConfigManager.u.b.a(false, "use_js_inline")) {
                Application application = com.fyber.inneractive.sdk.util.o.a;
                if (application == null) {
                    IAlog.f("fetchJS() failed context null", new Object[0]);
                    return;
                }
                this.a = System.currentTimeMillis();
                v0 v0Var = new v0(new h(this), application, new g("https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js", "dt-mraid-video-controller.js"));
                IAlog.d("%s- Loading URL: %s", IAlog.a(this), "https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js");
                iAConfigManager.s.a(v0Var);
                iAConfigManager.s.a(new v0(new i(this), application, new g("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css")));
                iAConfigManager.s.a(new v0(new j(this), application, new g("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js")));
                v vVar = iAConfigManager.u;
                if (vVar != null && vVar.b.a(false, "dt_plbl")) {
                    iAConfigManager.s.a(new v0(new k(this), application, new g("https://cdn2.inner-active.mobi/client/ia-js-tags/playable_detect.js", "playable_detect.js")));
                }
            }
        }
    }
}
