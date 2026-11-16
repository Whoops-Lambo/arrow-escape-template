package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.mc3;
import defpackage.nj;
import defpackage.pv1;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class e {
    static String d = "UserAgentProvider";
    private static volatile e e;
    String a = "";
    String b = "";
    public AtomicBoolean c = new AtomicBoolean(false);

    private String c() {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String str3 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
        }
        StringBuilder sbR = pv1.r("Mozilla/5.0 (Linux; Android ", str, "; ", str2, " Build/");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return nj.q(sbR, str3, ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
    }

    public static e d() {
        if (e == null) {
            synchronized (e.class) {
                try {
                    if (e == null) {
                        e = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public String e() {
        if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b)) {
            return c();
        }
        if (TextUtils.isEmpty(this.a)) {
            return TextUtils.isEmpty(this.b) ? "" : this.b;
        }
        return this.a;
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        this.a = f();
        b();
        if (!TextUtils.isEmpty(this.a)) {
            a(this.a);
        }
        if (TextUtils.isEmpty(this.a)) {
            this.a = c();
            a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (aVar != null) {
            HashMap map = new HashMap();
            map.put("userAgent", this.a);
            aVar.a(map);
        }
        this.c.set(true);
    }

    private String f() {
        try {
            return WebSettings.getDefaultUserAgent(com.mbridge.msdk.foundation.controller.c.n().d());
        } catch (Throwable th) {
            q0.b(d, th.getMessage(), th);
            return "";
        }
    }

    public String a() {
        try {
            String strF = f();
            this.a = strF;
            if (!TextUtils.isEmpty(strF)) {
                a(this.a);
            } else {
                b();
            }
            if (TextUtils.isEmpty(this.a)) {
                this.a = c();
            }
            this.c.set(true);
        } catch (Throwable th) {
            q0.b(d, th.getMessage(), th);
        }
        return c();
    }

    public void a(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new mc3(2, this, aVar));
        } catch (Throwable th) {
            q0.b(d, th.getMessage(), th);
        }
    }

    private void a(Context context) {
        if (TextUtils.isEmpty(this.a)) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new mc3(3, this, context));
        }
    }

    private void a(String str) {
        Context contextD;
        if (TextUtils.isEmpty(str) || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b("userAgent", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            this.a = new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th) {
            q0.b(d, th.getMessage(), th);
        }
        if (TextUtils.isEmpty(this.a)) {
            this.a = c();
        } else {
            a(this.a);
        }
    }

    private void b() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        this.b = com.mbridge.msdk.config.component.common.util.b.a(contextD).a("userAgent", c());
    }
}
