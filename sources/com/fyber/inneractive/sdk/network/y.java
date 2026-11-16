package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.ironsource.R6;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.security.InvalidParameterException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class y {
    public final String a;
    public final HashMap b;
    public String c;

    public y(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
        String strA;
        int i = com.fyber.inneractive.sdk.config.n.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            strA = "https://" + IAConfigManager.Q.j.f;
        } else {
            strA = com.fyber.inneractive.sdk.config.a.a(property, "Event");
        }
        this.c = null;
        if (TextUtils.isEmpty(strA)) {
            throw new InvalidParameterException();
        }
        this.b = new HashMap();
        this.a = strA;
        a(str7 == null ? "8.4.7" : str7, R6.V);
        a(com.fyber.inneractive.sdk.util.o.a.getPackageName(), "pkgn");
        if (IAConfigManager.c()) {
            return;
        }
        a("Android", "osn");
        a(Build.VERSION.RELEASE, R6.G);
        a(com.fyber.inneractive.sdk.util.k.g(), R6.B);
        a(com.fyber.inneractive.sdk.util.k.i(), "pkgv");
        a(str, "appid");
        a(str2, "session");
        a(str3, "adnt");
        a(l, "adnt_id");
        a(str4, "creative_id");
        a(str5, "adomain");
        a(str6, CreativeInfo.D);
    }

    public final void a(Object obj, String str) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.b.put(str, obj);
        }
    }
}
