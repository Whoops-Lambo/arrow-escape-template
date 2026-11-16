package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class q {
    public static final String a;
    public static final String b;

    static {
        String strB = com.fyber.inneractive.sdk.util.o.b("ia_js_load_monitor.txt");
        a = pv1.n("<html><head>", strB, "<script src='%s'></script></head><body></body></html>");
        b = pv1.n("<html><head>", strB, "%s</head><body></body></html>");
    }

    public static boolean a(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    public static String b(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.Q;
        if (str.startsWith(iAConfigManager.r ? HttpRequest.DEFAULT_SCHEME : com.safedk.android.analytics.brandsafety.creatives.g.e)) {
            return String.format(a, str);
        }
        if (iAConfigManager.r && !str.startsWith(HttpRequest.DEFAULT_SCHEME)) {
            return null;
        }
        if (!str.startsWith("<script")) {
            str = "<script type='text/javascript'>".concat(str);
        }
        if (!str.endsWith("</script>")) {
            str = str.concat("</script>");
        }
        return String.format(b, str);
    }
}
